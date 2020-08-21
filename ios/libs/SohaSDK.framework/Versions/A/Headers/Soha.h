// Version_SDK SOHA 1.2.3.2

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import "SohaUser.h"
#import "SohaSetting.h"
#import "SohaTransaction.h"
#import "SHNotificationServiceExtension.h"

typedef NS_ENUM(NSUInteger, SohaSDKLanguage) {
    SohaSDKLanguageVietnam,
    SohaSDKLanguageEnglish,
    SohaSDKLanguageChina,
};

@protocol SohaDelegate <NSObject,UIApplicationDelegate>

@required

@optional
//** Methode Delegate when Login, Logut, IAP success.
- (void)sohaLoginDelegate:(SohaUser *)user;

- (void)sohaLogoutDelegate: (SohaUser *)user;

- (void)sohaDidInPurchase:(SohaTransaction *)trans;


@end
@interface Soha : NSObject<SohaDelegate>

@property (nonatomic, assign) id<SohaDelegate> delegate;

+ (instancetype)sohaInitWithGameDelegate:(id<SohaDelegate>)delegate
                             application:(UIApplication *)application
                           launchOptions:(NSDictionary *)launchOptions
                           loginManually:(BOOL)manually;

    
+ (instancetype)sohaInitWithGameDelegate:(id<SohaDelegate>)delegate
                             application:(UIApplication *)application
                           launchOptions:(NSDictionary *)launchOptions
                           loginManually:(BOOL)manually
                        andSetLanguageTo:(SohaSDKLanguage)currentLanguage;

+(void)languagueHasChangedTo:(SohaSDKLanguage)changedLanguage;

+ (void)sohaSetServerID:(NSString *)serverId
             serverName:(NSString *)serverName
            characterID:(NSString *)charId
          characterName:(NSString *)charName
         characterLevel:(NSString *)charLevel;

#pragma mark - LOGIN

+ (void)sohaLoginWithBlock:(void (^)(SohaUser *user, NSError *error))completionBlock;
+ (void)sohaLogoutSDK;
+ (void)closePopupView;

#pragma mark - IAP
//normal payment
+ (void)sohaInAppPhurchase;

#pragma mark - PushNotice
//IOS 9
+ (void)sohaPostDeviceToken:(NSData *)deviceToken;

+ (void)sohaHandleRemoteNotification:(NSDictionary *)notificationDictionary application:(UIApplication*)application;

+ (void)sohaHandleLocalNotification:(UILocalNotification*)notification application:(UIApplication*)application;

//IOS >=10
+ (void)userNotificationCenter:(UNUserNotificationCenter *)center
didReceiveNotificationResponse:(UNNotificationResponse *)response;

+ (void)userNotificationCenter:(UNUserNotificationCenter *)center
       willPresentNotification:(UNNotification *)notification;

+ (BOOL)application:(UIApplication *)application
            openURL:(NSURL *)url
  sourceApplication:(NSString *)sourceApplication
         annotation:(id)annotation;

// Reports app open from deep link for iOS 10
+ (BOOL)application:(UIApplication *)application openURL:(NSURL *)url
            options:(NSDictionary *) options;

// Reports app open from a Universal Link for iOS 9 or above
+ (BOOL) application:(UIApplication *)application continueUserActivity:(NSUserActivity *)userActivity restorationHandler:(void (^)(NSArray *_Nullable))restorationHandler;

+ (BOOL)sohaHandleOpenURL:(NSURL *)url;

+ (void)sohaHandleWillTerminate;

+ (void)sohaHandleDidBecomeActive;

+ (void)sohaHandleDidEnterBackground;

+ (void)sohaHandleDidEnterForeground;

+ (void)gameDidCompleteTutorial;
@end
