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

import org.robovm.apple.usernotifications.UNNotificationContent;
import org.robovm.apple.usernotifications.UNNotificationRequest;
import org.robovm.apple.usernotifications.UNNotificationServiceExtension;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.Block;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.objc.block.VoidBlock1;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/*<javadoc>*/

/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SHNotificationServiceExtension/*</name>*/ 
    extends /*<extends>*/UNNotificationServiceExtension/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SHNotificationServiceExtensionPtr extends Ptr<SHNotificationServiceExtension, SHNotificationServiceExtensionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SHNotificationServiceExtension.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SHNotificationServiceExtension() {}
    protected SHNotificationServiceExtension(Handle h, long handle) { super(h, handle); }
    protected SHNotificationServiceExtension(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shMediaUrlKey")
    public native String getShMediaUrlKey();
    @Property(selector = "setShMediaUrlKey:")
    public native void setShMediaUrlKey(String v);
    @Property(selector = "shMediaTypeKey")
    public native String getShMediaTypeKey();
    @Property(selector = "setShMediaTypeKey:")
    public native void setShMediaTypeKey(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "didReceiveNotificationRequest:withContentHandler:")
    public native void didReceiveNotificationRequest$withContentHandler$(UNNotificationRequest request, @Block VoidBlock1<UNNotificationContent> contentHandler);
    @Method(selector = "serviceExtensionTimeWillExpire")
    public native void serviceExtensionTimeWillExpire();
    /*</methods>*/
}
