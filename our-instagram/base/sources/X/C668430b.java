package X;

import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.Map;

/* renamed from: X.30b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C668430b {
    public final UserSession A00;
    public final C64352vu A01;
    public final C1M1 A02;
    public final AbstractC10360h2 A03;
    public final InterfaceC60442pS A04;
    public final InterfaceC60442pS A05;
    public final InterfaceC61782rf A06;

    public C668430b(AbstractC10360h2 abstractC10360h2, UserSession userSession, C64352vu c64352vu, InterfaceC60442pS interfaceC60442pS, InterfaceC60442pS interfaceC60442pS2, InterfaceC61782rf interfaceC61782rf, C1M1 c1m1) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(abstractC10360h2, 2);
        this.A00 = userSession;
        this.A03 = abstractC10360h2;
        this.A06 = interfaceC61782rf;
        this.A01 = c64352vu;
        this.A05 = interfaceC60442pS;
        this.A04 = interfaceC60442pS2;
        this.A02 = c1m1;
    }

    public final void A00(C38321qM c38321qM, int i) {
        long j;
        long j2;
        long j3;
        C14360o3.A0B(c38321qM, 0);
        UserSession userSession = this.A00;
        C62593SHw c62593SHw = (C62593SHw) userSession.A01(C62593SHw.class, C65011Tba.A00);
        long now = c62593SHw.A00.now();
        Number number = (Number) c62593SHw.A02.remove(c38321qM.getId());
        if (number != null) {
            long longValue = now - number.longValue();
            Map map = c62593SHw.A03;
            Number number2 = (Number) map.get(c38321qM.getId());
            if (number2 == null) {
                number2 = 0L;
            }
            map.put(c38321qM.getId(), Long.valueOf(longValue + number2.longValue()));
            Map map2 = c62593SHw.A01;
            Number number3 = (Number) map2.get(c38321qM.getId());
            if (number3 == null || number3.longValue() < longValue) {
                map2.put(c38321qM.getId(), Long.valueOf(longValue));
            }
            if (longValue > 250) {
                C75113Zb BRZ = this.A06.BRZ(c38321qM);
                InterfaceC60442pS interfaceC60442pS = this.A05;
                Number number4 = (Number) map2.get(c38321qM.getId());
                if (number4 != null) {
                    j = number4.longValue();
                } else {
                    j = 0;
                }
                Number number5 = (Number) map.get(c38321qM.getId());
                if (number5 != null) {
                    j2 = number5.longValue();
                } else {
                    j2 = 0;
                }
                Number number6 = (Number) map.get(c38321qM.getId());
                if (number6 != null) {
                    j3 = number6.longValue();
                } else {
                    j3 = 0;
                }
                boolean z = false;
                if (j3 > longValue) {
                    z = true;
                }
                C82383m1 c82383m1 = new C82383m1();
                c82383m1.A04 = j;
                c82383m1.A05 = j2;
                c82383m1.A02 = longValue;
                Boolean valueOf = Boolean.valueOf(z);
                AbstractC37898Glt.A00(new PlaylistContext(null), userSession, c38321qM, interfaceC60442pS, BRZ, null, new SearchContext(null, null, null, null, null, null, null, null), this.A02, c82383m1, valueOf, null);
            }
        }
        C64352vu c64352vu = this.A01;
        c64352vu.A03(c38321qM, i);
        c64352vu.A02(c38321qM, i);
        C55772hI.A00(userSession).A0C(this.A05, "back", this.A03.A0L());
        C55772hI.A00(userSession).A0D(AbstractC43591JPw.A00(430), this.A04);
    }

    public final void A01(C38321qM c38321qM, int i, int i2) {
        C14360o3.A0B(c38321qM, 0);
        UserSession userSession = this.A00;
        C55772hI.A00(userSession).A0C(this.A04, "long_press", this.A03.A0L());
        C55772hI.A00(userSession).A0D(AbstractC43591JPw.A00(430), this.A05);
        C62593SHw c62593SHw = (C62593SHw) userSession.A01(C62593SHw.class, C65011Tba.A00);
        c62593SHw.A02.put(c38321qM.getId(), Long.valueOf(c62593SHw.A00.now()));
        C64352vu c64352vu = this.A01;
        c64352vu.A00(null, c38321qM, i, i2, true);
        c64352vu.A01(C81493kJ.A01, c38321qM, i);
    }
}
