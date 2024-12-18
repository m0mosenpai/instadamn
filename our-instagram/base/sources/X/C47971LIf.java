package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.LIf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47971LIf {
    public String A00;
    public boolean A01;
    public int A02;
    public final C25671My A03;
    public final UserSession A04;
    public final Map A05 = AbstractC166987dD.A1I();
    public final C48506Lcx A06;

    public static final void A01(C31191eO c31191eO, C47971LIf c47971LIf, InterfaceC50483MQl interfaceC50483MQl, InterfaceC83713oG interfaceC83713oG, C47Z c47z, String str) {
        String str2 = str;
        String str3 = ((C1OW) c31191eO).A05;
        if (str == null) {
            str2 = c31191eO.A04.A03();
        }
        UserSession userSession = c47971LIf.A04;
        new C7M5(userSession).A04(interfaceC83713oG, str2, str3, c47z.A35, c31191eO.A04.A0B);
        AbstractC47012KqV.A00(userSession).A00(interfaceC50483MQl, str2);
    }

    public final boolean A02(C47Z c47z, String str, String str2, int i) {
        boolean contains;
        C14360o3.A0B(str2, 1);
        this.A00 = str2;
        C48506Lcx c48506Lcx = this.A06;
        synchronized (c48506Lcx) {
            contains = c48506Lcx.A00.contains(str);
        }
        if (!contains) {
            UserSession userSession = this.A04;
            int size = c47z.A0K().size();
            EnumC40111tc enumC40111tc = c47z.A1G;
            if (size <= C18U.A01(AbstractC25225BEi.A0j(enumC40111tc, 4), userSession, 36607299049952849L) && ((enumC40111tc == EnumC40111tc.A0Q || enumC40111tc == EnumC40111tc.A09) && i == 1003 && AbstractC166987dD.A0x(userSession).C2v("odn_pre_send_inferencing_marked_threads").contains(str2) && !JV8.A00(userSession, str2) && JUW.A01(userSession))) {
                return true;
            }
        }
        return false;
    }

    public static final void A00(InterfaceC37261GbE interfaceC37261GbE, C47971LIf c47971LIf, String str, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2 = c47971LIf.A02 + 1;
        c47971LIf.A02 = i2;
        if (i2 >= i) {
            if (c47971LIf.A01) {
                Map map = c47971LIf.A05;
                C14360o3.A0B(map, 0);
                C114675Fx c114675Fx = new C114675Fx(EnumC46247KdO.A0C, "800", "na", "message sending paused for confirmation from user on sensitive content", false, true);
                c114675Fx.A08 = map;
                interfaceC37261GbE.DUq(c114675Fx, null);
                String str2 = c47971LIf.A00;
                if (str2 != null) {
                    c47971LIf.A03.E4s(new C7ME(str2, str));
                    return;
                }
                return;
            }
            interfaceC16820sZ.invoke();
        }
    }

    public C47971LIf(UserSession userSession) {
        this.A04 = userSession;
        this.A03 = AbstractC25651Mw.A00(userSession);
        this.A06 = (C48506Lcx) userSession.A01(C48506Lcx.class, new C50159MDm(userSession, 0));
    }
}
