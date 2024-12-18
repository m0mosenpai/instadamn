package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.3iS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80373iS extends AbstractC51572Yf {
    public final C75113Zb A00;
    public final UserSession A01;

    public C80373iS(UserSession userSession, C75113Zb c75113Zb) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c75113Zb, 2);
        this.A01 = userSession;
        this.A00 = c75113Zb;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, new C9EJ(c76223bS, 14));
        Float valueOf = Float.valueOf(0.0f);
        C2XI A002 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A003 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A004 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A005 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A006 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A007 = AbstractC80383iT.A00(c76223bS, Float.valueOf(1.0f));
        AbstractC77313dH.A00(c76223bS, new C207369Fp(A007, A002, A00, this, A003, A005, A004, c76223bS, A006, 1), new Object[]{this.A00});
        Drawable drawable = (Drawable) A00.A03;
        if (drawable == null) {
            return null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv c51722Yv = new C51722Yv(new C51722Yv(null, new C9CV(A002, C05F.A1F)), new C9CV(A003, C05F.A1I));
        Integer num = C05F.A00;
        C51722Yv c51722Yv2 = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(c51722Yv, new C9CV(A007, num)), new C9CV(A004, C05F.A02)), new C9CV(A005, C05F.A03)), new C9CV(A006, C05F.A0j)), new C9CV(num, EnumC77683ds.CENTER, 3)), new C9CV(C05F.A0Y, EnumC77933eL.ABSOLUTE, 3));
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        C80403iV A03 = C80393iU.A03(c76223bS.A05);
        A03.A0D(drawable);
        A03.A0E(scaleType);
        A03.A0C();
        AbstractC77743dy.A00(A03, c51722Yv2);
        return A03.A0A();
    }
}
