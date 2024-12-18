package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Mfi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50975Mfi extends AbstractC52922bZ {
    public int A00;
    public final int A01;
    public final IGRevShareProductType A02;
    public final UserSession A03;
    public final C54437O3r A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final C05A A07;
    public final C05A A08;

    public C50975Mfi(IGRevShareProductType iGRevShareProductType, UserSession userSession, C54437O3r c54437O3r, int i) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = c54437O3r;
        this.A02 = iGRevShareProductType;
        this.A01 = i;
        this.A00 = -1;
        this.A07 = AbstractC25235BEs.A1A(false);
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A05 = c24721Ip;
        this.A06 = AbstractC07080Za.A03(c24721Ip);
        this.A08 = C10E.A00(C46030KYv.A00);
        PZG.A01(this, AbstractC141776au.A00(this), 31);
    }

    public final void A00(AbstractC27443C9l abstractC27443C9l) {
        C141796aw A00;
        InterfaceC16620sF pzg;
        C52651NQy c52651NQy;
        C51722Msz c51722Msz;
        if (abstractC27443C9l instanceof C1U) {
            C05A c05a = this.A08;
            Object value = c05a.getValue();
            if ((value instanceof C52651NQy) && (c52651NQy = (C52651NQy) value) != null) {
                List list = c52651NQy.A00;
                int i = ((C1U) abstractC27443C9l).A00;
                C51722Msz c51722Msz2 = (C51722Msz) AbstractC001800i.A0O(list, i);
                int i2 = 0;
                int i3 = (c51722Msz2 != null && !c51722Msz2.A03) ? this.A00 + 1 : this.A00 - 1;
                this.A00 = i3;
                int i4 = this.A01;
                boolean z = false;
                if (i4 != -1 && i3 >= i4) {
                    z = true;
                }
                if (z) {
                    PZG.A01(this, AbstractC141776au.A00(this), 32);
                }
                ArrayList A0q = AbstractC167017dG.A0q(list);
                for (Object obj : list) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    C51722Msz c51722Msz3 = (C51722Msz) obj;
                    if (i2 == i) {
                        boolean z2 = !c51722Msz3.A03;
                        String str = c51722Msz3.A02;
                        String str2 = c51722Msz3.A01;
                        boolean z3 = c51722Msz3.A04;
                        AbstractC167007dF.A1D(str, 0, str2);
                        c51722Msz = new C51722Msz(str, str2, 0, z2, z3);
                    } else if (z) {
                        boolean z4 = c51722Msz3.A03;
                        String str3 = c51722Msz3.A02;
                        String str4 = c51722Msz3.A01;
                        AbstractC167007dF.A1D(str3, 0, str4);
                        c51722Msz = new C51722Msz(str3, str4, 0, z4, z4);
                    } else {
                        String str5 = c51722Msz3.A02;
                        boolean z5 = c51722Msz3.A03;
                        String str6 = c51722Msz3.A01;
                        AbstractC167007dF.A1D(str5, 0, str6);
                        c51722Msz = new C51722Msz(str5, str6, 0, z5, true);
                    }
                    A0q.add(c51722Msz);
                    i2 = i5;
                }
                C05A c05a2 = this.A07;
                do {
                } while (!c05a2.AIi(c05a2.getValue(), true));
                c05a.Egh(new C52651NQy(A0q));
                return;
            }
            return;
        }
        if (abstractC27443C9l instanceof C1W) {
            A00 = AbstractC141776au.A00(this);
            pzg = new PZX(this, null, 13);
        } else if (abstractC27443C9l instanceof C1V) {
            A00 = AbstractC141776au.A00(this);
            pzg = new PZG(this, (InterfaceC23621Ds) null, 33);
        } else {
            throw B4Z.A00();
        }
        AbstractC166987dD.A1Z(pzg, A00);
    }
}
