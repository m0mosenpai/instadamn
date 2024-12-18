package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KZK extends C4A7 {
    public final UserSession A00;
    public final HashMap A01;
    public final HashMap A02;
    public final HashMap A03;
    public final InterfaceC09390do A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;
    public final C0UO A08;
    public final Map A09;

    public final void A00(String str, String str2) {
        Long A0j = AbstractC166997dE.A0j(str);
        if (A0j != null) {
            long longValue = A0j.longValue();
            HashMap hashMap = this.A01;
            AnonymousClass195 anonymousClass195 = (AnonymousClass195) hashMap.get(str);
            if (anonymousClass195 != null && anonymousClass195.isActive()) {
                return;
            }
            hashMap.put(str, AbstractC25226BEj.A1L(new C50113MAm(this, str, str2, null, 2, longValue), super.A01));
        }
    }

    public KZK(UserSession userSession) {
        super("FriendMap", C4A8.A00(1067112572));
        this.A00 = userSession;
        this.A04 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50158MDl(this, 17));
        this.A03 = AbstractC166987dD.A1G();
        C16920sk A0E = AbstractC06930Yk.A0E();
        this.A09 = A0E;
        C008002u A00 = C10E.A00(A0E);
        this.A05 = A00;
        this.A07 = AbstractC208910l.A02(A00);
        this.A02 = AbstractC166987dD.A1G();
        C008002u A0h = AbstractC31179DnN.A0h();
        this.A06 = A0h;
        this.A08 = AbstractC208910l.A02(A0h);
        this.A01 = AbstractC166987dD.A1G();
    }
}
