/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mygdx.game.sohasdk;

/*<imports>*/

import org.robovm.apple.cloudkit.CKShareMetadata;
import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSCoder;
import org.robovm.apple.foundation.NSData;
import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSPropertyList;
import org.robovm.apple.foundation.NSSet;
import org.robovm.apple.foundation.NSURL;
import org.robovm.apple.foundation.NSUserActivity;
import org.robovm.apple.intents.INIntent;
import org.robovm.apple.intents.INIntentResponse;
import org.robovm.apple.uikit.UIApplication;
import org.robovm.apple.uikit.UIApplicationExtensionPointIdentifier;
import org.robovm.apple.uikit.UIApplicationLaunchOptions;
import org.robovm.apple.uikit.UIApplicationOpenURLOptions;
import org.robovm.apple.uikit.UIApplicationShortcutItem;
import org.robovm.apple.uikit.UIBackgroundFetchResult;
import org.robovm.apple.uikit.UIInterfaceOrientation;
import org.robovm.apple.uikit.UIInterfaceOrientationMask;
import org.robovm.apple.uikit.UILocalNotification;
import org.robovm.apple.uikit.UIRemoteNotification;
import org.robovm.apple.uikit.UIResponder;
import org.robovm.apple.uikit.UISceneConfiguration;
import org.robovm.apple.uikit.UISceneConnectionOptions;
import org.robovm.apple.uikit.UISceneSession;
import org.robovm.apple.uikit.UIUserNotificationSettings;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.apple.uikit.UIWindow;
import org.robovm.apple.usernotifications.UNNotification;
import org.robovm.apple.usernotifications.UNNotificationResponse;
import org.robovm.apple.usernotifications.UNUserNotificationCenter;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.Block;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.objc.block.VoidBlock1;
import org.robovm.objc.block.VoidBlock2;
import org.robovm.objc.block.VoidBooleanBlock;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.ptr.Ptr;

import java.util.List;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Soha/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements SohaDelegate/*</implements>*/ {

    /*<ptr>*/public static class SohaPtr extends Ptr<Soha, SohaPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Soha.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Soha() {}
    protected Soha(Handle h, long handle) { super(h, handle); }
    protected Soha(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native SohaDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SohaDelegate v);
    @Property(selector = "window")
    public native UIWindow getWindow();
    @Property(selector = "setWindow:")
    public native void setWindow(UIWindow v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sohaInitWithGameDelegate:application:launchOptions:loginManually:")
    public static native Soha sohaInitWithGameDelegate(SohaDelegate delegate, UIApplication application, NSDictionary<?, ?> launchOptions, boolean manually);
    @Method(selector = "sohaInitWithGameDelegate:application:launchOptions:loginManually:andSetLanguageTo:")
    public static native Soha sohaInitWithGameDelegateAndSetLanguage(SohaDelegate delegate, UIApplication application, NSDictionary<?, ?> launchOptions, boolean manually, SohaSDKLanguage currentLanguage);
    @Method(selector = "languagueHasChangedTo:")
    public static native void languagueHasChangedTo(SohaSDKLanguage changedLanguage);
    @Method(selector = "sohaSetServerID:serverName:characterID:characterName:characterLevel:")
    public static native void sohaSetServerID(String serverId, String serverName, String charId, String charName, String charLevel);
    @Method(selector = "sohaLoginWithBlock:")
    public static native void sohaLoginWithBlock(@Block VoidBlock2<SohaUser, NSError> completionBlock);
    @Method(selector = "sohaLogoutSDK")
    public static native void sohaLogoutSDK();
    @Method(selector = "closePopupView")
    public static native void closePopupView();
    @Method(selector = "sohaInAppPhurchase")
    public static native void sohaInAppPhurchase();
    @Method(selector = "sohaPostDeviceToken:")
    public static native void sohaPostDeviceToken(NSData deviceToken);
    @Method(selector = "sohaHandleRemoteNotification:application:")
    public static native void sohaHandleRemoteNotification(NSDictionary<?, ?> notificationDictionary, UIApplication application);
    @Method(selector = "sohaHandleLocalNotification:application:")
    public static native void sohaHandleLocalNotification(UILocalNotification notification, UIApplication application);
    @Method(selector = "userNotificationCenter:didReceiveNotificationResponse:")
    public static native void userNotificationCenter(UNUserNotificationCenter center, UNNotificationResponse response);
    @Method(selector = "userNotificationCenter:willPresentNotification:")
    public static native void userNotificationCenter(UNUserNotificationCenter center, UNNotification notification);
    @Method(selector = "application:openURL:sourceApplication:annotation:")
    public static native boolean application$openURL(UIApplication application, NSURL url, String sourceApplication, NSObject annotation);
    @Method(selector = "application:openURL:options:")
    public static native boolean application$openURL$options$(UIApplication application, NSURL url, NSDictionary<?, ?> options);
    @Method(selector = "application:continueUserActivity:restorationHandler:")
    public static native boolean application$continueUserActivity(UIApplication application, NSUserActivity userActivity, @Block VoidBlock1<NSArray<?>> restorationHandler);
    @Method(selector = "sohaHandleOpenURL:")
    public static native boolean sohaHandleOpenURL(NSURL url);
    @Method(selector = "sohaHandleWillTerminate")
    public static native void sohaHandleWillTerminate();
    @Method(selector = "sohaHandleDidBecomeActive")
    public static native void sohaHandleDidBecomeActive();
    @Method(selector = "sohaHandleDidEnterBackground")
    public static native void sohaHandleDidEnterBackground();
    @Method(selector = "sohaHandleDidEnterForeground")
    public static native void sohaHandleDidEnterForeground();
    @Method(selector = "gameDidCompleteTutorial")
    public static native void gameDidCompleteTutorial();
    @Method(selector = "sohaLoginDelegate:")
    public native void sohaLoginDelegate(SohaUser user);
    @Method(selector = "sohaLogoutDelegate:")
    public native void sohaLogoutDelegate(SohaUser user);
    @Method(selector = "sohaDidInPurchase:")
    public native void sohaDidInPurchase(SohaTransaction trans);
    @Method(selector = "applicationDidFinishLaunching:")
    public native void didFinishLaunching(UIApplication application);
    @Method(selector = "application:willFinishLaunchingWithOptions:")
    public native boolean willFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions);
    @Method(selector = "application:didFinishLaunchingWithOptions:")
    public native boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions);
    @Method(selector = "applicationDidBecomeActive:")
    public native void didBecomeActive(UIApplication application);
    @Method(selector = "applicationWillResignActive:")
    public native void willResignActive(UIApplication application);
    /**
     * @deprecated Deprecated in iOS 9.0. Use application:openURL:options:
     */
    @Deprecated
    @Method(selector = "application:handleOpenURL:")
    public native boolean handleOpenURL(UIApplication application, NSURL url);
    /**
     * @deprecated Deprecated in iOS 9.0. Use application:openURL:options:
     */
    @Deprecated
    @Method(selector = "application:openURL:sourceApplication:annotation:")
    public native boolean openURL(UIApplication application, NSURL url, String sourceApplication, NSPropertyList annotation);

    @Override
    public boolean openURL(UIApplication uiApplication, NSURL nsurl, UIApplicationOpenURLOptions uiApplicationOpenURLOptions) {
        return false;
    }

    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "application:openURL:options:")
    public native boolean openURL(UIApplication app, NSURL url, NSDictionary options);
    @Method(selector = "applicationDidReceiveMemoryWarning:")
    public native void didReceiveMemoryWarning(UIApplication application);
    @Method(selector = "applicationWillTerminate:")
    public native void willTerminate(UIApplication application);
    @Method(selector = "applicationSignificantTimeChange:")
    public native void significantTimeChange(UIApplication application);
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Method(selector = "application:willChangeStatusBarOrientation:duration:")
    public native void willChangeStatusBarOrientation(UIApplication application, UIInterfaceOrientation newStatusBarOrientation, double duration);
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Method(selector = "application:didChangeStatusBarOrientation:")
    public native void didChangStatusBarOrientation(UIApplication application, UIInterfaceOrientation oldStatusBarOrientation);
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Method(selector = "application:willChangeStatusBarFrame:")
    public native void willChangeStatusBarFrame(UIApplication application, @ByVal CGRect newStatusBarFrame);
    /**
     * @deprecated Deprecated in iOS 13.0. Use viewWillTransitionToSize:withTransitionCoordinator: instead.
     */
    @Deprecated
    @Method(selector = "application:didChangeStatusBarFrame:")
    public native void didChangStatusBarFrame(UIApplication application, @ByVal CGRect oldStatusBarFrame);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenter requestAuthorizationWithOptions:completionHandler:]
     */
    @Deprecated
    @Method(selector = "application:didRegisterUserNotificationSettings:")
    public native void didRegisterUserNotificationSettings(UIApplication application, UIUserNotificationSettings notificationSettings);
    @Method(selector = "application:didRegisterForRemoteNotificationsWithDeviceToken:")
    public native void didRegisterForRemoteNotifications(UIApplication application, NSData deviceToken);
    @Method(selector = "application:didFailToRegisterForRemoteNotificationsWithError:")
    public native void didFailToRegisterForRemoteNotifications(UIApplication application, NSError error);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate willPresentNotification:withCompletionHandler:] or -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:] for user visible notifications and -[UIApplicationDelegate application:didReceiveRemoteNotification:fetchCompletionHandler:] for silent remote notifications
     */
    @Deprecated
    @Method(selector = "application:didReceiveRemoteNotification:")
    public native void didReceiveRemoteNotification(UIApplication application, UIRemoteNotification userInfo);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate willPresentNotification:withCompletionHandler:] or -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:didReceiveLocalNotification:")
    public native void didReceiveLocalNotification(UIApplication application, UILocalNotification notification);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:handleActionWithIdentifier:forLocalNotification:completionHandler:")
    public native void handleLocalNotificationAction(UIApplication application, String identifier, UILocalNotification notification, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:handleActionWithIdentifier:forRemoteNotification:withResponseInfo:completionHandler:")
    public native void handleRemoteNotificationAction(UIApplication application, String identifier, UIRemoteNotification userInfo, NSDictionary<?, ?> responseInfo, @Block Runnable completionHandler);
    /**
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:handleActionWithIdentifier:forRemoteNotification:completionHandler:")
    public native void handleRemoteNotificationAction(UIApplication application, String identifier, UIRemoteNotification userInfo, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use UserNotifications Framework's -[UNUserNotificationCenterDelegate didReceiveNotificationResponse:withCompletionHandler:]
     */
    @Deprecated
    @Method(selector = "application:handleActionWithIdentifier:forLocalNotification:withResponseInfo:completionHandler:")
    public native void handleLocalNotificationAction(UIApplication application, String identifier, UILocalNotification notification, NSDictionary<?, ?> responseInfo, @Block Runnable completionHandler);
    @Method(selector = "application:didReceiveRemoteNotification:fetchCompletionHandler:")
    public native void didReceiveRemoteNotification(UIApplication application, UIRemoteNotification userInfo, @Block VoidBlock1<UIBackgroundFetchResult> completionHandler);
    /**
     * @deprecated Deprecated in iOS 13.0. Use a BGAppRefreshTask in the BackgroundTasks framework instead
     */
    @Deprecated
    @Method(selector = "application:performFetchWithCompletionHandler:")
    public native void performFetch(UIApplication application, @Block VoidBlock1<UIBackgroundFetchResult> completionHandler);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "application:performActionForShortcutItem:completionHandler:")
    public native void performAction(UIApplication application, UIApplicationShortcutItem shortcutItem, @Block VoidBooleanBlock completionHandler);
    @Method(selector = "application:handleEventsForBackgroundURLSession:completionHandler:")
    public native void handleEventsForBackgroundURLSession(UIApplication application, String identifier, @Block Runnable completionHandler);
    /**
     * @since Available in iOS 8.2 and later.
     */
    @Method(selector = "application:handleWatchKitExtensionRequest:reply:")
    public native void handleWatchKitExtensionRequest(UIApplication application, NSDictionary<?, ?> userInfo, @Block VoidBlock1<NSDictionary<?, ?>> reply);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "applicationShouldRequestHealthAuthorization:")
    public native void shouldRequestHealthAuthorization(UIApplication application);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "application:handleIntent:completionHandler:")
    public native void handleIntent(UIApplication application, INIntent intent, @Block VoidBlock1<INIntentResponse> completionHandler);
    @Method(selector = "applicationDidEnterBackground:")
    public native void didEnterBackground(UIApplication application);
    @Method(selector = "applicationWillEnterForeground:")
    public native void willEnterForeground(UIApplication application);
    @Method(selector = "applicationProtectedDataWillBecomeUnavailable:")
    public native void protectedDataWillBecomeUnavailable(UIApplication application);
    @Method(selector = "applicationProtectedDataDidBecomeAvailable:")
    public native void protectedDataDidBecomeAvailable(UIApplication application);
    @Method(selector = "application:supportedInterfaceOrientationsForWindow:")
    public native UIInterfaceOrientationMask getSupportedInterfaceOrientations(UIApplication application, UIWindow window);
    @Method(selector = "application:shouldAllowExtensionPointIdentifier:")
    public native boolean shouldAllowExtensionPointIdentifier(UIApplication application, UIApplicationExtensionPointIdentifier extensionPointIdentifier);
    @Method(selector = "application:viewControllerWithRestorationIdentifierPath:coder:")
    public native UIViewController getViewController(UIApplication application, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> identifierComponents, NSCoder coder);
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Method(selector = "application:shouldSaveSecureApplicationState:")
    public native boolean shouldSaveSecureApplicationState(UIApplication application, NSCoder coder);
    /**
     * @since Available in iOS 13.2 and later.
     */
    @Method(selector = "application:shouldRestoreSecureApplicationState:")
    public native boolean shouldRestoreSecureApplicationState(UIApplication application, NSCoder coder);
    @Method(selector = "application:willEncodeRestorableStateWithCoder:")
    public native void willEncodeRestorableState(UIApplication application, NSCoder coder);
    @Method(selector = "application:didDecodeRestorableStateWithCoder:")
    public native void didDecodeRestorableState(UIApplication application, NSCoder coder);
    /**
     * @deprecated Deprecated in iOS 13.2. Use application:shouldSaveSecureApplicationState: instead
     */
    @Deprecated
    @Method(selector = "application:shouldSaveApplicationState:")
    public native boolean shouldSaveApplicationState(UIApplication application, NSCoder coder);
    /**
     * @deprecated Deprecated in iOS 13.2. Use application:shouldRestoreSecureApplicationState: instead
     */
    @Deprecated
    @Method(selector = "application:shouldRestoreApplicationState:")
    public native boolean shouldRestoreApplicationState(UIApplication application, NSCoder coder);
    @Method(selector = "application:willContinueUserActivityWithType:")
    public native boolean willContinueUserActivity(UIApplication application, String userActivityType);
    @Method(selector = "application:continueUserActivity:restorationHandler:")
    public native boolean continueUserActivity(UIApplication application, NSUserActivity userActivity, @Block VoidBlock1<NSArray<UIResponder>> restorationHandler);
    @Method(selector = "application:didFailToContinueUserActivityWithType:error:")
    public native void didFailToContinueUserActivity(UIApplication application, String userActivityType, NSError error);
    @Method(selector = "application:didUpdateUserActivity:")
    public native void didUpdateUserActivity(UIApplication application, NSUserActivity userActivity);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "application:userDidAcceptCloudKitShareWithMetadata:")
    public native void didAcceptCloudKitShare(UIApplication application, CKShareMetadata cloudKitShareMetadata);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "application:configurationForConnectingSceneSession:options:")
    public native UISceneConfiguration getConfigurationForConnectingSceneSession(UIApplication application, UISceneSession connectingSceneSession, UISceneConnectionOptions options);
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Method(selector = "application:didDiscardSceneSessions:")
    public native void didDiscardSceneSessions(UIApplication application, NSSet<UISceneSession> sceneSessions);
    /*</methods>*/
}
