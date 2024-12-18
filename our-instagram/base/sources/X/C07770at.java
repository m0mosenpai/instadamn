package X;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import com.facebook.common.dextricks.DexStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0at, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07770at extends C0OK {
    @Override // X.C0OK
    public final Intent A0B(BroadcastReceiver broadcastReceiver, Context context, Intent intent, String str) {
        String str2;
        String str3;
        C0LG A00 = AbstractC08500cE.A00(context, intent, null, DexStore.DAYS_TO_MS_FACTOR);
        if (A00 == null) {
            A00 = AbstractC08470cB.A00(broadcastReceiver, context);
        }
        if (A00 != null) {
            str2 = A00.A05();
        } else {
            str2 = null;
        }
        String packageName = context.getPackageName();
        if (packageName.equals(str2)) {
            return intent;
        }
        if (A00 != null) {
            str3 = A00.toString();
        } else {
            str3 = "null";
        }
        String A0u = AnonymousClass001.A0u("Access denied. ", packageName, " cannot receive broadcasts from ", str3);
        synchronized (this.A00) {
        }
        this.A01.EHA("InternalIntentScope", A0u, new SecurityException(A0u));
        return null;
    }

    @Override // X.C0OK
    public final boolean A0G() {
        return true;
    }

    @Override // X.C0OK
    public final Intent A0C(Context context, Intent intent, String str) {
        AbstractC08500cE.A01(context, intent, this.A01, str);
        if (!C0OK.A05(context, intent)) {
            return A06(context, intent, C0OK.A03(context, intent, 65600));
        }
        return intent;
    }

    @Override // X.C0OK
    public final Intent A0D(Context context, Intent intent, String str) {
        AbstractC08500cE.A01(context, intent, this.A01, str);
        if (!C0OK.A05(context, intent)) {
            return A06(context, intent, C0OK.A04(context, intent, 65600));
        }
        return intent;
    }

    @Override // X.C0OK
    public final Integer A0E() {
        return C05F.A00;
    }

    @Override // X.C0OK
    public final List A0F(Context context, Intent intent, String str) {
        AbstractC08500cE.A01(context, intent, this.A01, str);
        if (!C0OK.A05(context, intent)) {
            intent.setPackage(context.getPackageName());
        }
        return Collections.singletonList(intent);
    }

    @Override // X.C0OK
    public final boolean A0H(Context context, C08110bX c08110bX) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Comparator] */
    private Intent A06(Context context, Intent intent, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentInfo componentInfo = (ComponentInfo) it.next();
            ApplicationInfo applicationInfo = componentInfo.applicationInfo;
            if (applicationInfo != null) {
                if (((PackageItemInfo) applicationInfo).packageName.equals(context.getPackageName())) {
                    arrayList.add(componentInfo);
                }
            }
        }
        if (arrayList.isEmpty()) {
            this.A01.EHA("InternalIntentScope", "No matching internal components", null);
            return null;
        }
        Collections.sort(arrayList, new Object());
        PackageItemInfo packageItemInfo = (PackageItemInfo) arrayList.get(0);
        intent.setComponent(new ComponentName(packageItemInfo.packageName, packageItemInfo.name));
        return intent;
    }
}
