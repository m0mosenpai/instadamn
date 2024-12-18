package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bmp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26468Bmp extends AbstractC51572Yf {
    public final C38321qM A00;
    public final C75113Zb A01;
    public final C30E A02;
    public final C51722Yv A03;
    public final UserSession A04;
    public final String A05;
    public final boolean A06;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, DC9.A00);
        C77123cy A002 = AbstractC77063cs.A00(c76223bS, DCA.A00);
        String str = this.A05;
        AbstractC77313dH.A00(c76223bS, new C50171MDy(47, A00, this), new Object[]{str});
        EnumC76913cd enumC76913cd = EnumC76913cd.GLOBAL;
        C89813zN A003 = AbstractC51432Xq.A00(enumC76913cd, "carousel_overlay_audio_hint");
        A003.A02(AbstractC25230BEn.A02(A003, AbstractC79463gt.A00));
        Object obj = A00.A03;
        int i = 150;
        if (obj == null) {
            i = C8S8.DEFAULT_SWIPE_ANIMATION_DURATION;
        }
        AbstractC25226BEj.A1S(A003, i);
        AbstractC89903zW.A00(c76223bS, A003);
        C51722Yv c51722Yv = this.A03;
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        if (this.A06 || obj != null) {
            UserSession userSession = this.A04;
            C30E c30e = this.A02;
            J7K j7k = new J7K(this, 38);
            C75933ay c75933ay = C51722Yv.A02;
            A12.A00(new C26427BmA(AbstractC25230BEn.A0e(AbstractC25230BEn.A0e(AbstractC25231BEo.A0W(A12.A00, null, enumC76913cd, "carousel_overlay_audio_hint"), C05F.A00, new C50268MHx(20, A00, A002), null), C05F.A01, new DRQ(A002, 20), null), userSession, c30e, str, j7k));
        }
        return AbstractC76963ci.A0I(A12, c76223bS, c51722Yv);
    }

    public C26468Bmp(C51722Yv c51722Yv, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, C30E c30e, String str, boolean z) {
        AbstractC167027dH.A13(str, userSession, c30e);
        C14360o3.A0B(c75113Zb, 5);
        this.A05 = str;
        this.A04 = userSession;
        this.A02 = c30e;
        this.A00 = c38321qM;
        this.A01 = c75113Zb;
        this.A06 = z;
        this.A03 = c51722Yv;
    }
}
