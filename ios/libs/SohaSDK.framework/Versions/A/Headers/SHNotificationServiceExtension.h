//
//  SHNotificationServiceExtension.h
//  AppDemoPushService
//
//  Created by KVip on 5/2/19.
//  Copyright © 2019 SohaGame. All rights reserved.
//

#import <UserNotifications/UserNotifications.h>

NS_ASSUME_NONNULL_BEGIN

API_AVAILABLE(ios(10.0))
@interface SHNotificationServiceExtension : UNNotificationServiceExtension

@property (nonatomic, retain) NSString * _Nullable shMediaUrlKey;
@property (nonatomic, retain) NSString * _Nullable shMediaTypeKey;


- (void)didReceiveNotificationRequest:(UNNotificationRequest *)request withContentHandler:(void (^)(UNNotificationContent * _Nonnull))contentHandler API_AVAILABLE(ios(10.0));
- (void)serviceExtensionTimeWillExpire;
@end

NS_ASSUME_NONNULL_END
