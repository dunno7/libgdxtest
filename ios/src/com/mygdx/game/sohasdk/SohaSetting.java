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

import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.uikit.UIColor;
import org.robovm.apple.uikit.UIWindow;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SohaSetting/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SohaSettingPtr extends Ptr<SohaSetting, SohaSettingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SohaSetting.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SohaSetting() {}
    protected SohaSetting(Handle h, long handle) { super(h, handle); }
    protected SohaSetting(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "manuallyCallAuthorizeMethod")
    public native boolean isManuallyCallAuthorizeMethod();
    @Property(selector = "setManuallyCallAuthorizeMethod:")
    public native void setManuallyCallAuthorizeMethod(boolean v);
    @Property(selector = "baseURLString")
    public native String getBaseURLString();
    @Property(selector = "setBaseURLString:")
    public native void setBaseURLString(String v);
    @Property(selector = "setWindow")
    public native UIWindow getSetWindow();
    @Property(selector = "setSetWindow:")
    public native void setSetWindow(UIWindow v);
    @Property(selector = "globalRequestTimeout")
    public native double getGlobalRequestTimeout();
    @Property(selector = "setGlobalRequestTimeout:")
    public native void setGlobalRequestTimeout(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sohaSettings")
    public static native SohaSetting sohaSettings();
    @Method(selector = "sohaAppName")
    public static native String sohaAppName();
    @Method(selector = "SohaSetNavigationColor")
    public static native UIColor SohaSetNavigationColor();
    @Method(selector = "SetCurrentGameBound")
    public static native @ByVal CGRect SetCurrentGameBound();
    @Method(selector = "md5FromString:")
    public static native String md5FromString(String string);
    @Method(selector = "setBaseURL:")
    public static native void setBaseURL(BaseURL url);
    /*</methods>*/
}
