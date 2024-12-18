package X;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0OK, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0OK {
    public final C07970bH A00;
    public final InterfaceC08100bW A01;
    public final Integer A02;

    public abstract Intent A0B(BroadcastReceiver broadcastReceiver, Context context, Intent intent, String str);

    public abstract Intent A0C(Context context, Intent intent, String str);

    public abstract Intent A0D(Context context, Intent intent, String str);

    public abstract Integer A0E();

    public abstract List A0F(Context context, Intent intent, String str);

    public abstract boolean A0G();

    public abstract boolean A0H(Context context, C08110bX c08110bX);

    public C0OK(C07970bH c07970bH, InterfaceC08100bW interfaceC08100bW) {
        this(c07970bH, interfaceC08100bW, C05F.A01);
    }

    public static String A01(Intent intent) {
        if (intent == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("intent(");
        sb.append("action = ");
        sb.append(intent.getAction());
        sb.append(", data= ");
        sb.append(intent.getData());
        sb.append(", type= ");
        sb.append(intent.getType());
        if (intent.getComponent() != null) {
            sb.append(", component = ");
            sb.append(intent.getComponent());
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            sb.append(", extras = [");
            for (String str : extras.keySet()) {
                sb.append(str);
                sb.append(" = ");
                sb.append(extras.get(str));
                sb.append(", ");
            }
            sb.append("]");
        }
        sb.append(")");
        return sb.toString();
    }

    public final List A09(Context context, Intent intent) {
        return A04(context, intent, 268435456);
    }

    public final boolean A0A() {
        Integer num;
        C07970bH c07970bH = this.A00;
        synchronized (c07970bH) {
            num = c07970bH.A00;
        }
        if (num != C05F.A0N) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Intent A00(List list) {
        Intent[] intentArr = new Intent[list.size() - 1];
        int i = 0;
        while (i < list.size() - 1) {
            int i2 = i + 1;
            intentArr[i] = list.get(i2);
            i = i2;
        }
        Intent createChooser = Intent.createChooser((Intent) list.get(0), "Choose an app to launch.");
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return createChooser;
    }

    public static ArrayList A02(Intent intent, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageItemInfo packageItemInfo = (PackageItemInfo) it.next();
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName(packageItemInfo.packageName, packageItemInfo.name));
            intent2.setPackage(packageItemInfo.packageName);
            arrayList.add(intent2);
        }
        return arrayList;
    }

    public static List A03(Context context, Intent intent, int i) {
        List A04 = AbstractC08120bY.A04(context, intent, i);
        if (A04 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(1);
        Iterator it = A04.iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
            if (activityInfo != null && ((ComponentInfo) activityInfo).applicationInfo != null) {
                arrayList.add(activityInfo);
            }
        }
        return arrayList;
    }

    public static List A04(Context context, Intent intent, int i) {
        List A05 = AbstractC08120bY.A05(context, intent, i);
        if (A05 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(1);
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = ((ResolveInfo) it.next()).serviceInfo;
            if (serviceInfo != null && ((ComponentInfo) serviceInfo).applicationInfo != null) {
                arrayList.add(serviceInfo);
            }
        }
        return arrayList;
    }

    public static boolean A05(Context context, Intent intent) {
        String str;
        ComponentName component = intent.getComponent();
        if ((component == null || (str = component.getPackageName()) == null) && (str = intent.getPackage()) == null) {
            return false;
        }
        if (context != null) {
            return str.equals(context.getPackageName());
        }
        throw new IllegalArgumentException("context is null, did your Fragment destroy activity already?");
    }

    public final ArrayList A08(Context context, Intent intent) {
        ArrayList arrayList;
        List<C08110bX> A03;
        String str = intent.getPackage();
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                str = packageName;
            }
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                A03 = Collections.singletonList(AbstractC08120bY.A02(context, str, 64));
            } else {
                A03 = AbstractC08120bY.A03(context);
            }
            arrayList = new ArrayList(A03.size());
            for (C08110bX c08110bX : A03) {
                if (A0H(context, c08110bX)) {
                    arrayList.add(c08110bX);
                }
            }
        } catch (PackageManager.NameNotFoundException | RuntimeException e) {
            this.A01.EHA("BaseIntentScope", "Error querying PackageManager.", e);
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C08110bX c08110bX2 = (C08110bX) it.next();
            Intent intent2 = new Intent(intent);
            intent2.setPackage(c08110bX2.A02);
            arrayList2.add(intent2);
        }
        return arrayList2;
    }

    public C0OK(C07970bH c07970bH, InterfaceC08100bW interfaceC08100bW, Integer num) {
        this.A00 = c07970bH;
        this.A01 = interfaceC08100bW;
        this.A02 = num;
    }
}
