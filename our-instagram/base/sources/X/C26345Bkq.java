package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bkq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26345Bkq extends AbstractC51572Yf {
    public final C169547hU A00;
    public final C25814BbV A01;
    public final UserSession A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        long A07;
        C14360o3.A0B(c76223bS, 0);
        String A0F = AbstractC77623dm.A0F(c76223bS, this.A00.A00.A00);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        Context A0O = AbstractC25226BEj.A0O(A12);
        if (C18U.A06(C06090Tz.A05, this.A02, 36322967919733533L)) {
            A07 = AbstractC25229BEm.A0D();
        } else {
            A07 = AbstractC77623dm.A07(A12);
        }
        C75933ay c75933ay = C51722Yv.A02;
        long A072 = AbstractC77623dm.A07(A12);
        Integer num = C05F.A04;
        C51722Yv A0d = AbstractC25233BEq.A0d(AbstractC25233BEq.A0R(null, AbstractC25225BEi.A0n(num, 0, A072), 0, A07), new C50369MLw(34, this, A0O));
        C2Z0 A0K = AbstractC25233BEq.A0K(A12);
        long A0L = AbstractC25230BEn.A0L();
        int A073 = AbstractC25229BEm.A07(A0O, A0K);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        Integer num2 = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(A0K.A00, null, A0F, 0);
        AbstractC25233BEq.A1B(A0K, A0a, A073, A0L);
        A0a.A0S(1);
        AbstractC25234BEr.A0o(typeface, A0K, A0a, A0D);
        A0a.A0X(num2);
        AbstractC25234BEr.A1H(A0a, num2, false);
        A0a.A0E();
        AbstractC25234BEr.A15(A0K, A0a, false);
        AbstractC25231BEo.A1A(new C85463rb(ImageView.ScaleType.CENTER, C9CU.A00(null, num, 0, AbstractC77623dm.A06(A0K)), null, R.drawable.instagram_chevron_down_pano_filled_12, A0K.BoZ().A01(R.attr.glyphColorSecondary)), A0K, A12, A0d);
        return new C2WF(null, null, null, A12.A01, false);
    }

    public C26345Bkq(C169547hU c169547hU, C25814BbV c25814BbV, UserSession userSession) {
        AbstractC167027dH.A13(c169547hU, c25814BbV, userSession);
        this.A00 = c169547hU;
        this.A01 = c25814BbV;
        this.A02 = userSession;
    }
}
