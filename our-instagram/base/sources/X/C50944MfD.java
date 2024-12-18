package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.MfD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50944MfD extends AbstractC52922bZ {
    public final HYF A00;
    public final String A01;
    public final InterfaceC19390xP A02;
    public final InterfaceC06180Ui A03;
    public final C05A A04;
    public final C0UO A05;
    public final UserSession A06;
    public final String A07;

    public C50944MfD(UserSession userSession, HYF hyf, String str, String str2) {
        Object value;
        String str3;
        List list;
        Map map;
        String A2u;
        C14360o3.A0B(hyf, 1);
        this.A00 = hyf;
        this.A06 = userSession;
        this.A01 = str;
        this.A07 = str2;
        C008002u A1H = AbstractC25225BEi.A1H(new C51757Mtg(null, null, null, null, 7, 23));
        this.A04 = A1H;
        this.A05 = AbstractC208910l.A02(A1H);
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A03 = A00;
        this.A02 = A00;
        HYF hyf2 = this.A00;
        String str4 = this.A01;
        C14360o3.A0B(str4, 0);
        C38321qM A0h = AbstractC25229BEm.A0h(hyf2.A01, str4);
        if (A0h != null && (A2u = A0h.A2u()) != null) {
            C57748Pjb c57748Pjb = new C57748Pjb(this, 16);
            Map map2 = hyf2.A04;
            if (map2.containsKey(A2u)) {
                Object obj = map2.get(A2u);
                if (obj != null) {
                    c57748Pjb.invoke(obj);
                }
            } else {
                AbstractC166987dD.A1Z(new PZQ(c57748Pjb, hyf2, A2u, null, 7), ((C4A7) hyf2).A01);
            }
        }
        do {
            value = A1H.getValue();
            C51757Mtg c51757Mtg = (C51757Mtg) value;
            str3 = this.A07;
            list = (List) c51757Mtg.A01;
            map = (Map) c51757Mtg.A00;
            AbstractC167007dF.A1D(list, 0, map);
        } while (!A1H.AIi(value, new C51757Mtg(str3, list, map)));
    }
}
