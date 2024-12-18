package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BN2 extends AbstractC51572Yf {
    public final C75113Zb A00;
    public final UserSession A01;
    public final String A02 = "caption_bg";

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, C29904DGs.A01(c76223bS, 45));
        Float A0l = AbstractC25227BEk.A0l();
        C2XI A002 = AbstractC80383iT.A00(c76223bS, A0l);
        C2XI A003 = AbstractC80383iT.A00(c76223bS, A0l);
        C2XI A004 = AbstractC80383iT.A00(c76223bS, A0l);
        C2XI A0j = AbstractC25228BEl.A0j(c76223bS, 1.0f);
        C2XI A005 = AbstractC80383iT.A00(c76223bS, A0l);
        C2XI A006 = AbstractC80383iT.A00(c76223bS, A0l);
        C89813zN A007 = AbstractC51432Xq.A00(AbstractC51432Xq.A04, this.A02);
        AbstractC25226BEj.A1S(A007, 30000);
        A007.A03(AbstractC79463gt.A00);
        AbstractC89903zW.A00(c76223bS, A007);
        Object A008 = AbstractC77183d4.A00(c76223bS, new D8P(7, A002, A003, A0j), new Object[0]);
        Object A009 = AbstractC77183d4.A00(c76223bS, new C57273Pbv(2, A004, A00, A0j, A005, A003, A002, c76223bS, A006), new Object[0]);
        AbstractC77313dH.A00(c76223bS, new D8P(6, A009, this, A008), AbstractC25230BEn.A1a());
        Drawable drawable = (Drawable) A00.A03;
        if (drawable == null) {
            return null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0d = AbstractC25230BEn.A0d(null, C05F.A01, 1.0f, 1);
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        Integer num = C05F.A00;
        C51722Yv A0010 = C9CV.A00(AbstractC25233BEq.A0b(C9CV.A00(A0d, num, enumC77683ds, 3), num, 0), C05F.A0Y, EnumC77933eL.ABSOLUTE, 3);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        AbstractC25234BEr.A0r(drawable, A12.A00, A12, AbstractC25231BEo.A0X(A0j, AbstractC25231BEo.A0X(A006, AbstractC25231BEo.A0X(A005, AbstractC25231BEo.A0X(A004, AbstractC25234BEr.A0A(A003, AbstractC25232BEp.A16(null, C05F.A08, "like_heart"), new C9CV(A002, C05F.A1F)), C05F.A0j), C05F.A02), C05F.A03), num));
        return AbstractC76963ci.A0F(A12, c76223bS, A0010);
    }

    public BN2(UserSession userSession, C75113Zb c75113Zb) {
        this.A01 = userSession;
        this.A00 = c75113Zb;
    }
}
