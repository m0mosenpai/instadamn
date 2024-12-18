package X;

import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: X.SgX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63273SgX {
    public C62548SFz A00;
    public final Context A01;
    public final TelephonyManager A02;

    public static SubscriptionInfo A00(C63273SgX c63273SgX, int i) {
        SubscriptionManager from;
        Context context = c63273SgX.A01;
        if (context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") != 0 || (from = SubscriptionManager.from(context)) == null) {
            return null;
        }
        return from.getActiveSubscriptionInfoForSimSlotIndex(i);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, X.SFz] */
    public static C62548SFz A01(C63273SgX c63273SgX) {
        C62548SFz c62548SFz = c63273SgX.A00;
        C62548SFz c62548SFz2 = c62548SFz;
        if (c62548SFz == null) {
            Context context = c63273SgX.A01;
            C14360o3.A0B(context, 1);
            ?? obj = new Object();
            boolean z = false;
            try {
                Class<?> cls = Class.forName("android.telephony.MultiSimTelephonyManager");
                C0s6 A00 = AbstractC13190m5.A00(cls.getConstructors());
                while (true) {
                    if (!A00.hasNext()) {
                        break;
                    }
                    Constructor constructor = (Constructor) A00.next();
                    if (constructor.getParameterTypes().length == 2) {
                        Object newInstance = constructor.newInstance(context, 0);
                        Object newInstance2 = constructor.newInstance(context, 1);
                        Method declaredMethod = cls.getDeclaredMethod("getSubscriberInfo", new Class[0]);
                        declaredMethod.setAccessible(true);
                        obj.A00 = declaredMethod.invoke(newInstance, new Object[0]);
                        obj.A01 = declaredMethod.invoke(newInstance2, new Object[0]);
                        z = true;
                        break;
                    }
                }
            } catch (ClassNotFoundException | Exception unused) {
            }
            obj.A02 = z;
            c63273SgX.A00 = obj;
            c62548SFz2 = obj;
        }
        return c62548SFz2;
    }

    public static boolean A02(String str) {
        if (str != null && !str.equals("")) {
            return false;
        }
        return true;
    }

    public C63273SgX(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        this.A02 = (TelephonyManager) applicationContext.getSystemService("phone");
    }
}
