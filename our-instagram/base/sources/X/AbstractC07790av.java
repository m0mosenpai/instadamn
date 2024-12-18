package X;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0av, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07790av extends C0OK {
    public abstract boolean A0I(Context context, ComponentInfo componentInfo);

    @Override // X.C0OK
    public final Intent A0B(BroadcastReceiver broadcastReceiver, Context context, Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C0OK
    public final List A0F(Context context, Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C0OK
    public final boolean A0H(Context context, C08110bX c08110bX) {
        throw new UnsupportedOperationException();
    }

    private Intent A06(Context context, Intent intent, List list) {
        InterfaceC08100bW interfaceC08100bW;
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentInfo componentInfo = (ComponentInfo) it.next();
            if (!A0I(context, componentInfo)) {
                synchronized (this.A00) {
                }
                sb = new StringBuilder();
                str = "Removed non-external/third-party component: ";
            } else {
                ApplicationInfo applicationInfo = componentInfo.applicationInfo;
                if (applicationInfo != null && "com.android.internal.app.ResolverActivity".equals(applicationInfo.className)) {
                    C07970bH c07970bH = this.A00;
                    synchronized (c07970bH) {
                    }
                    synchronized (c07970bH) {
                    }
                    sb = new StringBuilder();
                    str = "Removed potentially dangerous resolver: ";
                } else {
                    arrayList.add(componentInfo);
                }
            }
            sb.append(str);
            sb.append(C0OK.A01(intent));
            this.A01.EHA("DifferentKeyIntentScope", sb.toString(), null);
        }
        if (arrayList.isEmpty()) {
            if (context.getApplicationInfo().targetSdkVersion >= 30 && list.isEmpty()) {
                interfaceC08100bW = this.A01;
                interfaceC08100bW.EHA("DifferentKeyIntentScope", AnonymousClass001.A0g("No matching different-signature components for: ", C0OK.A01(intent), " on API 30+ device. Intent target is not in any PackageFinder aware app, so it's probably a non-FB app. Attempting to proceed."), null);
            } else {
                this.A01.EHA("DifferentKeyIntentScope", AnonymousClass001.A0R("No matching different-signature components for: ", C0OK.A01(intent)), null);
                return null;
            }
        } else {
            if (arrayList.size() != list.size()) {
                if (arrayList.size() > 1) {
                    intent = C0OK.A00(C0OK.A02(intent, arrayList));
                } else {
                    PackageItemInfo packageItemInfo = (PackageItemInfo) arrayList.get(0);
                    intent.setComponent(new ComponentName(packageItemInfo.packageName, packageItemInfo.name));
                }
            }
            interfaceC08100bW = this.A01;
        }
        synchronized (this.A00) {
        }
        AbstractC07940bE.A00(intent, interfaceC08100bW);
        return intent;
    }

    @Override // X.C0OK
    public final Intent A0C(Context context, Intent intent, String str) {
        if (C0OK.A05(context, intent)) {
            return null;
        }
        List A03 = C0OK.A03(context, intent, 65600);
        if (A03.isEmpty()) {
            A03 = C0OK.A03(context, intent, 0);
        }
        return A06(context, intent, A03);
    }

    @Override // X.C0OK
    public final Intent A0D(Context context, Intent intent, String str) {
        if (C0OK.A05(context, intent)) {
            return null;
        }
        List A04 = C0OK.A04(context, intent, 65600);
        if (A04.isEmpty()) {
            A04 = A09(context, intent);
        }
        return A06(context, intent, A04);
    }
}
