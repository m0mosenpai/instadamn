package X;

import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class LL8 {
    public static final LL8 A00 = new Object();
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;
    public static final String A08;

    public static final void A01(android.net.Uri uri, android.net.Uri uri2, UserSession userSession, OXD oxd, InterfaceC23621Ds interfaceC23621Ds) {
        AbstractC167017dG.A1R(uri, uri2);
        LCH.A01(new C50365MLr(new JVY(19, oxd, userSession, interfaceC23621Ds), uri2, uri, oxd.A0C.A3p, 33), userSession);
    }

    public final void A04(UserSession userSession, String str) {
        C6AI c6ai = C6AE.A02(userSession, EnumC132075xi.A05, true).A00;
        try {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 2342161871150127804L)) {
                SettableFuture settableFuture = c6ai.A0A;
                if (settableFuture.isDone()) {
                    c6ai.A04 = 0;
                } else {
                    int i = c6ai.A04;
                    c6ai.A04 = i + 1;
                    if (i < 6) {
                        A02(c06090Tz, settableFuture, c6ai);
                    }
                }
            }
            if (C18U.A06(c06090Tz, userSession, 36323131128687642L)) {
                SettableFuture settableFuture2 = c6ai.A09;
                if (settableFuture2.isDone()) {
                    c6ai.A03 = 0;
                    return;
                }
                int i2 = c6ai.A03;
                c6ai.A03 = i2 + 1;
                if (i2 < 6) {
                    A02(c06090Tz, settableFuture2, c6ai);
                }
            }
        } catch (Exception unused) {
            List A1Q = AbstractC16960so.A1Q(AbstractC31171DnF.A0V(c6ai.A01), AbstractC31171DnF.A0V(c6ai.A00));
            List A0J = AbstractC009903n.A0J(c6ai.A0I);
            ArrayList A0q = AbstractC167017dG.A0q(A0J);
            Iterator it = A0J.iterator();
            while (it.hasNext()) {
                AbstractC166997dE.A1X(A0q, AbstractC167007dF.A0B(it));
            }
            A03(userSession, null, str, AbstractC001800i.A0S(A0q, A1Q), 7026);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.LL8] */
    static {
        AbstractC1345065z abstractC1345065z = K3X.A00;
        String A0u = AbstractC43592JPx.A0u(abstractC1345065z, 22);
        C14360o3.A07(A0u);
        A06 = A0u;
        String A0u2 = AbstractC43592JPx.A0u(abstractC1345065z, 16);
        C14360o3.A07(A0u2);
        A03 = A0u2;
        String A0u3 = AbstractC43592JPx.A0u(abstractC1345065z, 19);
        C14360o3.A07(A0u3);
        A04 = A0u3;
        String A0u4 = AbstractC43592JPx.A0u(abstractC1345065z, 11);
        C14360o3.A07(A0u4);
        A02 = A0u4;
        String A0u5 = AbstractC43592JPx.A0u(abstractC1345065z, 10);
        C14360o3.A07(A0u5);
        A01 = A0u5;
        String A0u6 = AbstractC43592JPx.A0u(abstractC1345065z, 21);
        C14360o3.A07(A0u6);
        A05 = A0u6;
        String A0u7 = AbstractC43592JPx.A0u(abstractC1345065z, 24);
        C14360o3.A07(A0u7);
        A08 = A0u7;
        String A0u8 = AbstractC43592JPx.A0u(abstractC1345065z, 25);
        C14360o3.A07(A0u8);
        A07 = A0u8;
    }

    public static void A02(C06090Tz c06090Tz, AbstractC25011Ke abstractC25011Ke, C6AI c6ai) {
        abstractC25011Ke.get(C17s.A07(new C115665Lc(5L, 30L), C18U.A01(c06090Tz, c6ai.A0F, 36604606105457760L)), TimeUnit.SECONDS);
    }

    public static final Object A00(UserSession userSession, Integer num, Integer num2, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, long j) {
        C89563yw A0r = JQ0.A0r(interfaceC23621Ds);
        android.net.Uri A0I = AbstractC167007dF.A0I(str);
        C14360o3.A07(A0I);
        LUB lub = new LUB(str, A0r, j);
        C14360o3.A0B(num, 1);
        LCH.A01(new MIO(lub, num2, num, A0I, str2, 12), userSession);
        return A0r.A00();
    }

    public static final void A03(UserSession userSession, Integer num, String str, List list, int i) {
        C14360o3.A07(C120005by.A00(userSession));
        if (str != null) {
            C120005by.A03(str, list, 15, i, AbstractC31177DnL.A03(num));
        }
    }
}
