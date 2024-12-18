package X;

import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import java.util.LinkedList;

/* renamed from: X.0UX, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0UX {
    public static LinkedList A00(Context context, ComponentInfo[] componentInfoArr) {
        LinkedList linkedList = new LinkedList();
        if (componentInfoArr != null) {
            String A0g = AnonymousClass001.A0g(context.getPackageName(), ":", "nodex");
            for (ComponentInfo componentInfo : componentInfoArr) {
                boolean z = ((PackageItemInfo) componentInfo).metaData != null ? ((PackageItemInfo) componentInfo).metaData.getBoolean("crash.loop.exclude", false) : false;
                if (!A0g.equals(componentInfo.processName) && !z) {
                    linkedList.add(componentInfo);
                }
            }
        }
        return linkedList;
    }
}
