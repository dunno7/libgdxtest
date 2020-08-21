

#import <UIKit/UIKit.h>
#import <Foundation/Foundation.h>

typedef enum : int {
    BaseURLDev,
    BaseURLProduct,
    BaseURLBeta,
}BaseURL;

@interface SohaSetting : NSObject

@property (nonatomic, setter=setManuallyCallAuthorizeMethod:) BOOL manuallyCallAuthorizeMethod;
@property (nonatomic, strong) NSString *baseURLString;
@property (nonatomic, strong) UIWindow *setWindow;
@property (nonatomic) NSTimeInterval globalRequestTimeout;

+ (instancetype)sohaSettings;
+ (NSString*)sohaAppName;
+ (UIColor *)SohaSetNavigationColor;
+ (CGRect)SetCurrentGameBound;
+ (NSString*)md5FromString:(NSString*)string;
+ (void)setBaseURL:(BaseURL)url;
@end
