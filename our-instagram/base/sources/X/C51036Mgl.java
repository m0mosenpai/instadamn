package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mgl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51036Mgl extends AbstractC52922bZ {
    public final UserSession A00;
    public final AbstractC55106ObM A01;
    public final EnumC142806cg A02;
    public final C56805PIw A03;
    public final C56804PIv A04;
    public final C147856lA A05;
    public final OLC A06;
    public final MTU A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C0UO A0F;
    public final boolean A0G;
    public final boolean A0H;

    public C51036Mgl(UserSession userSession, AbstractC55106ObM abstractC55106ObM, EnumC142806cg enumC142806cg, C56805PIw c56805PIw, C56804PIv c56804PIv, C147856lA c147856lA, OLC olc, MTU mtu, boolean z, boolean z2) {
        AbstractC25234BEr.A0j(2, olc, c147856lA, mtu, abstractC55106ObM);
        C14360o3.A0B(enumC142806cg, 10);
        this.A00 = userSession;
        this.A06 = olc;
        this.A05 = c147856lA;
        this.A07 = mtu;
        this.A01 = abstractC55106ObM;
        this.A03 = c56805PIw;
        this.A04 = c56804PIv;
        this.A0G = z;
        this.A0H = z2;
        this.A02 = enumC142806cg;
        C008002u A1H = AbstractC25225BEi.A1H(false);
        this.A09 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(false);
        this.A0E = A1H2;
        C008002u A1A = AbstractC25235BEs.A1A(true);
        this.A0A = A1A;
        C008002u A1H3 = AbstractC25225BEi.A1H(false);
        this.A0C = A1H3;
        this.A0B = AbstractC25225BEi.A1H(false);
        this.A0D = AbstractC25225BEi.A1H(false);
        C008002u A00 = C10E.A00(null);
        this.A08 = A00;
        this.A0F = AbstractC208910l.A02(A00);
        C0UO c0uo = olc.A0i;
        C0UO c0uo2 = abstractC55106ObM.A03;
        AbstractC18560vj.A03(AbstractC141776au.A00(this), MV5.A00(this, AbstractC50522MSa.A1b(new C0UO[]{c0uo, A1H, A1H2, A1A, A1H3, c0uo2}), 31));
        AbstractC25232BEp.A1J(this, C57167PZl.A01(this, null, 49), olc.A0r);
        AbstractC25232BEp.A1J(this, new C57154PYy(this, null, 0), c0uo2);
    }

    public static final void A00(C51036Mgl c51036Mgl) {
        C05A c05a = c51036Mgl.A0B;
        if (AbstractC31176DnK.A1b(c05a)) {
            AbstractC50523MSb.A1U(c05a);
            C57164PZi.A03(c51036Mgl, AbstractC141776au.A00(c51036Mgl), 34);
        }
    }

    public static final void A01(C51036Mgl c51036Mgl, boolean z) {
        C56805PIw c56805PIw = c51036Mgl.A03;
        if (c56805PIw != null) {
            c56805PIw.A0F(AnonymousClass001.A1C("toggleVideoMute: ", " canMuteAgain: ", AbstractC31176DnK.A1b(c51036Mgl.A0E), z));
        }
        PZK.A01(c51036Mgl, AbstractC141776au.A00(c51036Mgl), 13, z);
    }
}
