package X;

import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import java.util.HashSet;

/* renamed from: X.0lh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12950lh {
    public static final String[] A00(Context context) {
        HashSet hashSet = new HashSet();
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getClass();
            ServiceInfo[] serviceInfoArr = packageManager.getPackageInfo(context.getPackageName(), 516).services;
            if (serviceInfoArr != null) {
                C0s6 c0s6 = new C0s6(serviceInfoArr);
                while (c0s6.hasNext()) {
                    String str = ((ComponentInfo) c0s6.next()).processName;
                    if (str != null) {
                        int A04 = AbstractC001900j.A04(str, ':', 0);
                        if (A04 != -1) {
                            str = str.substring(A04 + 1);
                            C14360o3.A07(str);
                        }
                        hashSet.add(str);
                    }
                }
            }
            return (String[]) hashSet.toArray(new String[0]);
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("PackageManager failure", e);
        }
    }
}
