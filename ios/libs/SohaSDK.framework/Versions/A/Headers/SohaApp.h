//


#import <Foundation/Foundation.h>
#import "Soha.h"
#import "SohaSetting.h"

@interface SohaApp : NSObject

@property (nonatomic, assign)   BOOL status_Submit;
@property (nonatomic, copy) NSString *active;
@property (nonatomic, copy) NSString *game_name;
@property (nonatomic, copy) NSString *appstore_ipad_id;
@property (nonatomic, copy) NSString *appstore_iphone_id;
@property (nonatomic, copy) NSString *dev_key;
@property (nonatomic, copy) NSString *ga_code;
@property (nonatomic, copy) NSString *appsflyer_devkey;
@property (nonatomic, copy) NSString *appsflyer_appid;
@property (nonatomic, copy) NSString *logo;
@property (nonatomic, copy) NSArray *banners;

@property (nonatomic, assign) BOOL banner_showed;

@property (nonatomic, strong) NSString *link_Update;
@property (nonatomic, strong) NSString *message_Update;
@property (nonatomic ) BOOL status_Update;
@property (nonatomic ) BOOL force_Update;
@property (nonatomic, strong) NSString *title_Update;
@property (nonatomic, assign)BOOL status_UpdateBOOL;

@property(nonatomic,strong) NSString *gver ;
@property(nonatomic,strong) NSString *sdkver ;
@property(nonatomic,strong) NSString *clientname ;
@property(nonatomic,strong) NSString *app_id ;
@property(nonatomic,strong) NSString *gameAccessToken;
@property(nonatomic,strong) NSString *content_type;
@property (nonatomic, strong) NSString *is_web;
@property (nonatomic, strong) NSString *soap_token;
@property (nonatomic, strong) NSString *viet_token;
@property (nonatomic, strong) NSArray *cfa;
@property (nonatomic, strong) NSString *device_token; //token cho viec authen mqtt vs broker
@property(nonatomic,strong) NSString *client_id; //client id tu sinh de nhan device token
@property(nonatomic,strong) NSString *device_id ;
@property(nonatomic,strong) NSString *game_id ; //game id cho mqtt (SGxxx)
@property (nonatomic, strong) NSString *e_name; //ten tieng anh cua game
@property (nonatomic, strong) NSString *active_mqtt;
@property (nonatomic, strong) NSString *domain_mqtt;
@property (nonatomic) int port_mqtt;

@property (nonatomic, strong) NSString *bundle_id;

//firebase config
@property (nonatomic, copy) NSString *firebase_app_id;
@property (nonatomic, copy) NSString *firebase_sender_id;

@property (nonatomic, strong) NSString *gg_conversionid;
@property (nonatomic, strong) NSString *gg_label;
@property (nonatomic, strong) NSString *gg_value;
@property (nonatomic, strong) NSString *google_client_id;
@property (nonatomic, strong) NSString *goolge_default_class_name;
@property (nonatomic, strong) NSString *google_default_package_name;

@property (nonatomic)       BOOL didLoadConfigSuccessfully;
@property (nonatomic)       BOOL show_warning_ingame;
@property (nonatomic, assign)   BOOL isShowUpdateLogin;
@property (nonatomic, assign)   BOOL confirmUpdate;
@property (nonatomic, copy) NSString *image_age;
@property (nonatomic, copy) NSString *warning_time_message;
@property (nonatomic, copy) NSString *url_warning;
@property (nonatomic, assign) NSInteger warning_time_connect;
@property (nonatomic, copy) NSDictionary *resources;

+ (instancetype)sohaAppInfo;
+ (NSString *)device_id ;
- (void)setInfoApp;
+ (NSString*)getAppName;
+ (NSString*)getGameVersion;


@end









