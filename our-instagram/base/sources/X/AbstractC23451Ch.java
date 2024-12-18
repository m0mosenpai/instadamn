package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23451Ch {
    public static C23461Ci A01 = new C23461Ci();
    public static WeakReference A00 = new WeakReference(null);

    public static void A03(Activity activity, InterfaceC23471Cj interfaceC23471Cj, C58606PyZ c58606PyZ, Runnable runnable, List list, Map map) {
        if (activity instanceof FragmentActivity) {
            String[] strArr = (String[]) list.toArray(new String[0]);
            c58606PyZ.A01(new C58607Pya(activity, interfaceC23471Cj, runnable, list, map), A01, strArr);
            C14240no c14240no = new C14240no(((FragmentActivity) activity).mFragments.A00.A03);
            c14240no.A0B(c58606PyZ, "PermissionCallback");
            c14240no.A0J(true);
        }
    }

    public static boolean A08(Context context, String... strArr) {
        for (String str : strArr) {
            if (!A07(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static EnumC172127lh A01(Map map, String[] strArr) {
        EnumC172127lh enumC172127lh = EnumC172127lh.A05;
        for (String str : strArr) {
            EnumC172127lh enumC172127lh2 = (EnumC172127lh) map.get(str);
            if (enumC172127lh2 == null) {
                enumC172127lh2 = EnumC172127lh.A03;
            }
            EnumC172127lh enumC172127lh3 = EnumC172127lh.A04;
            if (enumC172127lh2 == enumC172127lh3 || (enumC172127lh2 == EnumC172127lh.A03 && enumC172127lh != enumC172127lh3)) {
                enumC172127lh = enumC172127lh2;
            }
        }
        return enumC172127lh;
    }

    public static HashMap A02(Activity activity, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            hashMap.put(str, A00(activity, str));
        }
        return hashMap;
    }

    public static boolean A04(final Activity activity, final InterfaceC23471Cj interfaceC23471Cj, String... strArr) {
        final HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (A07(activity, str)) {
                hashMap.put(str, EnumC172127lh.A05);
            } else {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            if (interfaceC23471Cj != null) {
                interfaceC23471Cj.DYE(hashMap);
            }
            return false;
        }
        final C193408hL c193408hL = (C193408hL) A00.get();
        C23461Ci c23461Ci = A01;
        C31586DuE c31586DuE = new C31586DuE(new InterfaceC16660sJ() { // from class: X.9Lt
            @Override // X.InterfaceC16660sJ
            public final Object invoke(Object obj) {
                Activity activity2 = activity;
                InterfaceC23471Cj interfaceC23471Cj2 = interfaceC23471Cj;
                Map map = hashMap;
                C193408hL c193408hL2 = c193408hL;
                List list = (List) obj;
                WeakReference weakReference = AbstractC23451Ch.A00;
                if (c193408hL2 != null) {
                    C9EL c9el = new C9EL(new C22913A8j(activity2, interfaceC23471Cj2, list, map), 9);
                    C01U c01u = c193408hL2.A02;
                    if (c01u.isEmpty() && !c193408hL2.A00) {
                        c193408hL2.A00 = true;
                        c9el.invoke(new C206959Ea(c193408hL2, 1));
                    } else {
                        c01u.addLast(c9el);
                    }
                } else {
                    AbstractC23451Ch.A03(activity2, interfaceC23471Cj2, new C58606PyZ(), null, list, map);
                }
                return C0eB.A00;
            }
        }, arrayList);
        c23461Ci.A03.addLast(c31586DuE);
        if (!c23461Ci.A00) {
            c23461Ci.A00 = true;
            c23461Ci.A01.post(new RunnableC31585DuD(c31586DuE, c23461Ci));
            return true;
        }
        return true;
    }

    public static boolean A06(Context context) {
        String str;
        if (Build.VERSION.SDK_INT >= 30) {
            str = "android.permission.READ_PHONE_NUMBERS";
        } else {
            str = "android.permission.READ_PHONE_STATE";
        }
        return A07(context, str);
    }

    public static EnumC172127lh A00(Activity activity, String str) {
        if (A07(activity, str)) {
            return EnumC172127lh.A05;
        }
        if (A05(activity, str)) {
            return EnumC172127lh.A03;
        }
        return EnumC172127lh.A04;
    }

    public static boolean A05(Activity activity, String str) {
        boolean A07 = A07(activity, str);
        boolean A06 = AbstractC114515Ew.A06(activity, str);
        if (!A07 && A06) {
            return true;
        }
        return false;
    }

    public static boolean A07(Context context, String str) {
        if (C02G.A00(context, str) != 0) {
            return false;
        }
        return true;
    }
}
