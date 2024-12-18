package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.RrW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61656RrW {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Context context;
        Map map;
        InterfaceC65469Tkm A04;
        Integer num;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            context = c6fg.A00;
        } else {
            context = null;
        }
        if (context != null) {
            Object A01 = c6fw.A01();
            String A00 = MSV.A00(10);
            C14360o3.A0C(A01, A00);
            C102884kP c102884kP = (C102884kP) A01;
            Object A03 = c6fw.A03(1);
            C14360o3.A0C(A03, A00);
            C102884kP c102884kP2 = (C102884kP) A03;
            Object A002 = c6fw.A00();
            C14360o3.A0C(A002, "null cannot be cast to non-null type kotlin.Boolean");
            boolean A1a = AbstractC166987dD.A1a(A002);
            Object A003 = C102884kP.A00(c102884kP, 38);
            C14360o3.A0C(A003, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            Map map2 = (Map) A003;
            InterfaceC103384lE A0B = c102884kP.A0B(40);
            if (A0B != null) {
                Object A004 = C131845xK.A00(c6fq, C6FW.A01, A0B);
                C14360o3.A0C(A004, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                map = (Map) A004;
            } else {
                map = null;
            }
            int i = c102884kP2.A05;
            if (i != 16542 && i != 16696 && i != 16793) {
                A04 = null;
            } else {
                A04 = AbstractC86593tX.A04(c102884kP2, i);
            }
            C102884kP A08 = c102884kP.A08(51);
            if (A08 != null) {
                num = Integer.valueOf(A08.A05);
            } else {
                num = null;
            }
            WTT wtt = new WTT(A04, ST9.A00(context, num), Boolean.valueOf(c102884kP.A0S(43, true)), c102884kP.A0J(), map2, map);
            if (c6fg != null) {
                InterfaceC62872tQ interfaceC62872tQ = c6fg.A02;
                C14360o3.A0C(interfaceC62872tQ, "null cannot be cast to non-null type com.instagram.common.bloks.Host");
                AbstractC86593tX.A0O(context, wtt, new AnonymousClass637(interfaceC62872tQ.AMf()), i, A1a);
                return null;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
