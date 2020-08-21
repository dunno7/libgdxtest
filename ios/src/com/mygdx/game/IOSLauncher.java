package com.mygdx.game;

import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.foundation.NSData;
import org.robovm.apple.uikit.UIApplication;
import org.robovm.apple.uikit.UIApplicationLaunchOptions;
import org.robovm.apple.uikit.UILocalNotification;
import org.robovm.apple.uikit.UIRemoteNotification;
import org.robovm.apple.usernotifications.UNNotification;
import org.robovm.apple.usernotifications.UNNotificationPresentationOptions;
import org.robovm.apple.usernotifications.UNNotificationResponse;
import org.robovm.apple.usernotifications.UNUserNotificationCenter;
import org.robovm.objc.block.VoidBlock1;

import com.badlogic.gdx.backends.iosrobovm.IOSApplication;
import com.badlogic.gdx.backends.iosrobovm.IOSApplicationConfiguration;
import com.mygdx.game.sohasdk.Soha;
import com.mygdx.game.sohasdk.SohaDelegateAdapter;
import com.mygdx.game.sohasdk.SohaSetting;
import com.mygdx.game.sohasdk.SohaTransaction;
import com.mygdx.game.sohasdk.SohaUser;

public class IOSLauncher extends IOSApplication.Delegate {

    private Soha soha;
    private SohaDelegateAdapter sohaDelegateAdapter;

    @Override
    protected IOSApplication createApplication() {
        System.out.println("IOSLauncher.createApplication");
        IOSApplicationConfiguration config = new IOSApplicationConfiguration();
        return new IOSApplication(new MyGdxGame(), config);
    }

    public static void main(String[] argv) {
        System.out.println("IOSLauncher.main");
        NSAutoreleasePool pool = new NSAutoreleasePool();
        UIApplication.main(argv, null, IOSLauncher.class);
        pool.close();
    }

    @Override
    public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
        System.out.println("IOSLauncher.didFinishLaunching");
        super.didFinishLaunching(application);

        SohaSetting.sohaSettings().setSetWindow(UIApplication.getSharedApplication().getWindows().first());
        sohaDelegateAdapter = sohaDelegateAdapter();
        if (launchOptions != null)
            soha = Soha.sohaInitWithGameDelegate(sohaDelegateAdapter, application, launchOptions.getDictionary(), true);
        else
            soha = Soha.sohaInitWithGameDelegate(sohaDelegateAdapter, application, null, true);
        soha.addStrongRef(sohaDelegateAdapter);

        System.out.println("-----------RUN TO HERREEEE");
        return true;

    }

    private SohaDelegateAdapter sohaDelegateAdapter() {
        return new SohaDelegateAdapter(){
            @Override
            public void sohaLogoutDelegate(SohaUser user) {
                super.sohaLogoutDelegate(user);
            }

            @Override
            public void sohaLoginDelegate(SohaUser user) {
                super.sohaLoginDelegate(user);
            }

            @Override
            public void sohaDidInPurchase(SohaTransaction trans) {
                super.sohaDidInPurchase(trans);
            }
        };
    }

    @Override
    public void didReceiveRemoteNotification(UIApplication application, UIRemoteNotification userInfo) {
        System.out.println("IOSLauncher.didReceiveRemoteNotification");
             Soha.sohaHandleRemoteNotification(userInfo.getDictionary(), application);

    }

    @Override
    public void didReceiveLocalNotification(UIApplication application, UILocalNotification notification) {
        System.out.println("IOSLauncher.didReceiveLocalNotification");
          Soha.sohaHandleLocalNotification(notification, application);
    }


    @Override
    public void didRegisterForRemoteNotifications(UIApplication application, NSData deviceToken) {
        System.out.println("IOSLauncher.didRegisterForRemoteNotifications");
           Soha.sohaPostDeviceToken(deviceToken);
    }





}