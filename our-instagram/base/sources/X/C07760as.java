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

/* renamed from: X.0as, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07760as extends C0OK {
    @Override // X.C0OK
    public final boolean A0G() {
        return true;
    }

    private boolean A07(Context context, ApplicationInfo applicationInfo, ApplicationInfo applicationInfo2) {
        try {
            return AbstractC08450c9.A03(context, applicationInfo.uid, applicationInfo2.uid);
        } catch (SecurityException e) {
            this.A01.EHA("SameKeyIntentScope", AnonymousClass001.A0R("Unexpected exception in verifying signature for: ", ((PackageItemInfo) applicationInfo2).packageName), e);
            synchronized (this.A00) {
                return false;
            }
        }
    }

    @Override // X.C0OK
    public final Intent A0C(Context context, Intent intent, String str) {
        AbstractC08500cE.A01(context, intent, this.A01, str);
        if (intent == null) {
            return null;
        }
        if (C0OK.A05(context, intent)) {
            return intent;
        }
        return A06(context, intent, C0OK.A03(context, intent, 65600));
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
        return C05F.A01;
    }

    @Override // X.C0OK
    public final List A0F(Context context, Intent intent, String str) {
        InterfaceC08100bW interfaceC08100bW = this.A01;
        AbstractC08500cE.A01(context, intent, interfaceC08100bW, str);
        ArrayList A08 = A08(context, intent);
        if (A08.isEmpty()) {
            interfaceC08100bW.EHA("SameKeyIntentScope", "No matching same-key packages", null);
        }
        return A08;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Comparator] */
    private Intent A06(Context context, Intent intent, List list) {
        C04700Mm A00;
        Integer num;
        ArrayList arrayList = new ArrayList(list.size());
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            this.A01.EHA("SameKeyIntentScope", "Current app info is null.", null);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ComponentInfo componentInfo = (ComponentInfo) it.next();
                ApplicationInfo applicationInfo2 = componentInfo.applicationInfo;
                if (applicationInfo2 == null) {
                    this.A01.EHA("SameKeyIntentScope", "Target app info is null.", null);
                } else if (A07(context, applicationInfo, applicationInfo2)) {
                    arrayList.add(componentInfo);
                } else {
                    synchronized (this.A00) {
                    }
                    this.A01.EHA("SameKeyIntentScope", AnonymousClass001.A11("Different signature component blocked: current app=", ((PackageItemInfo) applicationInfo).packageName, ", target app=", ((PackageItemInfo) applicationInfo2).packageName, "."), null);
                }
            }
        }
        if (arrayList.isEmpty()) {
            this.A01.EHA("SameKeyIntentScope", "No matching same-key components.", null);
            return null;
        }
        Integer num2 = this.A02;
        Collections.sort(arrayList, new Object());
        PackageItemInfo packageItemInfo = (PackageItemInfo) arrayList.get(0);
        if (arrayList.size() > 1) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                PackageItemInfo packageItemInfo2 = (PackageItemInfo) it2.next();
                if (!context.getPackageName().equals(packageItemInfo2.packageName)) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                if (num2 == num) {
                    packageItemInfo = packageItemInfo2;
                    break;
                }
            }
        }
        ComponentName componentName = new ComponentName(packageItemInfo.packageName, packageItemInfo.name);
        intent.setComponent(componentName);
        if (arrayList.size() > 1 && componentName.getPackageName() != context.getPackageName()) {
            InterfaceC08100bW interfaceC08100bW = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("multiple same-key components and use different package: action ");
            sb.append(intent.getAction());
            sb.append(", uri ");
            if (intent.getData() == null) {
                A00 = null;
            } else {
                A00 = C04690Ml.A00(intent.getData(), C04700Mm.A04);
            }
            sb.append(A00);
            sb.append(", categories ");
            sb.append(intent.getCategories());
            sb.append(", component ");
            sb.append(componentName.toString());
            sb.append(", context package ");
            sb.append(context.getPackageName());
            interfaceC08100bW.EHA("SameKeyIntentScope", sb.toString(), null);
        }
        return intent;
    }

    @Override // X.C0OK
    public final Intent A0B(BroadcastReceiver broadcastReceiver, Context context, Intent intent, String str) {
        int i;
        int i2 = context.getApplicationInfo().uid;
        C0LG A00 = AbstractC08500cE.A00(context, intent, null, DexStore.DAYS_TO_MS_FACTOR);
        if (A00 == null && (A00 = AbstractC08470cB.A00(broadcastReceiver, context)) == null) {
            i = -1;
        } else {
            i = A00.A00;
        }
        try {
            if (AbstractC08450c9.A03(context, i2, i)) {
                return intent;
            }
        } catch (SecurityException e) {
            this.A01.EHA("SameKeyIntentScope", AnonymousClass001.A0O("Unexpected exception in verifying signature for: ", i), e);
            synchronized (this.A00) {
            }
        }
        String A02 = AnonymousClass001.A02(i2, i, "Access denied. Process ", " cannot receive broadcasts from ");
        this.A01.EHA("SameKeyIntentScope", A02, null);
        throw new SecurityException(A02);
    }

    @Override // X.C0OK
    public final boolean A0H(Context context, C08110bX c08110bX) {
        return A07(context, context.getApplicationInfo(), c08110bX.A00);
    }
}
