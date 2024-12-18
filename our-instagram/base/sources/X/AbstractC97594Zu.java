package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97594Zu {
    public static boolean A03(Wm1 wm1) {
        int A00;
        List list;
        if (wm1 == null || (A00 = wm1.A00()) == -1 || (list = wm1.A02.A0B) == null || A00 >= list.size()) {
            return false;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!TextUtils.isEmpty(((InterfaceC43540JLa) it.next()).getText())) {
                i++;
            }
        }
        return i >= 2;
    }

    public static C84823qW A00(InterfaceC41201vU interfaceC41201vU) {
        List BlY = interfaceC41201vU.BlY(EnumC75383a5.A16);
        if (BlY != null && !BlY.isEmpty()) {
            return (C84823qW) BlY.get(0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.IJy] */
    public static void A02(UserSession userSession, Wm1 wm1, String str, String str2, String str3, String str4, int i) {
        String str5 = wm1.A02.A08;
        if (str5 == null) {
            str5 = "";
        }
        ?? obj = new Object();
        obj.A03 = str;
        obj.A04 = str5;
        obj.A00 = i;
        obj.A01 = System.currentTimeMillis();
        obj.A05 = str2;
        obj.A02 = str3;
        obj.A06 = str4;
        C57702kj A00 = C57702kj.A00(userSession);
        A00.A0H(C57702kj.A01(obj), obj);
        C1ON A002 = I5U.A00(userSession, obj);
        A002.A00 = new C39008HFk(obj, A00);
        C1GJ.A03(A002);
    }

    public static Wm1 A01(InterfaceC41201vU interfaceC41201vU) {
        URM urm;
        C84823qW A00 = A00(interfaceC41201vU);
        if (A00 != null && (urm = A00.A0a) != null) {
            return new Wm1(urm);
        }
        return null;
    }
}
