

#import <Foundation/Foundation.h>
typedef void (^SohaUserLogOutHandle)(void);
@interface SohaUser : NSObject<UIAlertViewDelegate>


/*
Set info Character event Login Game
*/
@property (nonatomic,strong) NSString *serverID;
@property (nonatomic,strong) NSString *characterID;
@property (nonatomic,strong) NSString *serverName;
@property (nonatomic,strong) NSString *characterName;
@property (nonatomic,strong) NSString *characterLevel;
// Info Account
@property (nonatomic,strong) NSString *accessToken;
@property (nonatomic,strong) NSString *userId;
@property (nonatomic,strong) NSString *userName;
@property (nonatomic,strong) NSString *userEmail;
@property (nonatomic,strong) NSString *avatarImgLink;

@property (nonatomic,strong) NSString *puId;
@property (nonatomic,strong) NSString *apple_user_identifier;
@property (nonatomic ,assign) BOOL new_user;
@property (nonatomic ,assign) BOOL isPlayNow;
@property(nonatomic, assign) BOOL isLoggingOut;
// Call Back When Click Logout in AlertView
@property (nonatomic , copy) SohaUserLogOutHandle handleLogout;

+ (SohaUser *)currentUser;
- (void)updateInfoWithData:(NSDictionary *)userInfo;
- (void)clearData;

@end


