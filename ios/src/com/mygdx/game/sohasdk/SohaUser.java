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

import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.uikit.UIAlertView;
import org.robovm.apple.uikit.UIAlertViewDelegate;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.Block;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.annotation.MachineSizedSInt;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SohaUser/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIAlertViewDelegate/*</implements>*/ {

    /*<ptr>*/public static class SohaUserPtr extends Ptr<SohaUser, SohaUserPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SohaUser.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SohaUser() {}
    protected SohaUser(Handle h, long handle) { super(h, handle); }
    protected SohaUser(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "serverID")
    public native String getServerID();
    @Property(selector = "setServerID:")
    public native void setServerID(String v);
    @Property(selector = "characterID")
    public native String getCharacterID();
    @Property(selector = "setCharacterID:")
    public native void setCharacterID(String v);
    @Property(selector = "serverName")
    public native String getServerName();
    @Property(selector = "setServerName:")
    public native void setServerName(String v);
    @Property(selector = "characterName")
    public native String getCharacterName();
    @Property(selector = "setCharacterName:")
    public native void setCharacterName(String v);
    @Property(selector = "characterLevel")
    public native String getCharacterLevel();
    @Property(selector = "setCharacterLevel:")
    public native void setCharacterLevel(String v);
    @Property(selector = "accessToken")
    public native String getAccessToken();
    @Property(selector = "setAccessToken:")
    public native void setAccessToken(String v);
    @Property(selector = "userId")
    public native String getUserId();
    @Property(selector = "setUserId:")
    public native void setUserId(String v);
    @Property(selector = "userName")
    public native String getUserName();
    @Property(selector = "setUserName:")
    public native void setUserName(String v);
    @Property(selector = "userEmail")
    public native String getUserEmail();
    @Property(selector = "setUserEmail:")
    public native void setUserEmail(String v);
    @Property(selector = "avatarImgLink")
    public native String getAvatarImgLink();
    @Property(selector = "setAvatarImgLink:")
    public native void setAvatarImgLink(String v);
    @Property(selector = "puId")
    public native String getPuId();
    @Property(selector = "setPuId:")
    public native void setPuId(String v);
    @Property(selector = "apple_user_identifier")
    public native String getApple_user_identifier();
    @Property(selector = "setApple_user_identifier:")
    public native void setApple_user_identifier(String v);
    @Property(selector = "new_user")
    public native boolean isNew_user();
    @Property(selector = "setNew_user:")
    public native void setNew_user(boolean v);
    @Property(selector = "isPlayNow")
    public native boolean isPlayNow();
    @Property(selector = "setIsPlayNow:")
    public native void setIsPlayNow(boolean v);
    @Property(selector = "isLoggingOut")
    public native boolean isLoggingOut();
    @Property(selector = "setIsLoggingOut:")
    public native void setIsLoggingOut(boolean v);
    @Property(selector = "handleLogout")
    public native @Block Runnable getHandleLogout();
    @Property(selector = "setHandleLogout:")
    public native void setHandleLogout(@Block Runnable v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "updateInfoWithData:")
    public native void updateInfoWithData(NSDictionary<?, ?> userInfo);
    @Method(selector = "clearData")
    public native void clearData();
    @Method(selector = "currentUser")
    public static native SohaUser currentUser();
    /**
     * @deprecated Deprecated in iOS 9.0. Use UIAlertController instead.
     */
    @Deprecated
    @Method(selector = "alertView:clickedButtonAtIndex:")
    public native void clicked(UIAlertView alertView, @MachineSizedSInt long buttonIndex);
    /**
     * @deprecated Deprecated in iOS 9.0. Use UIAlertController instead.
     */
    @Deprecated
    @Method(selector = "alertViewCancel:")
    public native void cancel(UIAlertView alertView);
    /**
     * @deprecated Deprecated in iOS 9.0. Use UIAlertController instead.
     */
    @Deprecated
    @Method(selector = "willPresentAlertView:")
    public native void willPresent(UIAlertView alertView);
    /**
     * @deprecated Deprecated in iOS 9.0. Use UIAlertController instead.
     */
    @Deprecated
    @Method(selector = "didPresentAlertView:")
    public native void didPresent(UIAlertView alertView);
    /**
     * @deprecated Deprecated in iOS 9.0. Use UIAlertController instead.
     */
    @Deprecated
    @Method(selector = "alertView:willDismissWithButtonIndex:")
    public native void willDismiss(UIAlertView alertView, @MachineSizedSInt long buttonIndex);
    /**
     * @deprecated Deprecated in iOS 9.0. Use UIAlertController instead.
     */
    @Deprecated
    @Method(selector = "alertView:didDismissWithButtonIndex:")
    public native void didDismiss(UIAlertView alertView, @MachineSizedSInt long buttonIndex);
    /**
     * @deprecated Deprecated in iOS 9.0. Use UIAlertController instead.
     */
    @Deprecated
    @Method(selector = "alertViewShouldEnableFirstOtherButton:")
    public native boolean shouldEnableFirstOtherButton(UIAlertView alertView);
    /*</methods>*/
}
