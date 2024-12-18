package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.Bk2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26295Bk2 extends AbstractC51572Yf {
    public final C25814BbV A00;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        Integer num = C05F.A01;
        Typeface A0Q = AbstractC25226BEj.A0Q(context, num);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CU.A00(null, C05F.A15, 0, AbstractC25229BEm.A0E());
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        long A0H = AbstractC25230BEn.A0H();
        long A0L = AbstractC25230BEn.A0L();
        Integer num2 = C05F.A05;
        C51722Yv A002 = C9CU.A00(null, num2, 0, A0L);
        Integer num3 = C05F.A0u;
        A0P.A00(new C85463rb(ImageView.ScaleType.CENTER, C9CU.A00(A002, num3, 0, A0H), null, R.drawable.instagram_chevron_left_outline_12, AbstractC77623dm.A02(A0P, R.attr.glyphColorSecondary)));
        C51722Yv A0d = AbstractC25233BEq.A0d(AbstractC25233BEq.A0U(C9CU.A00(null, num2, 0, A0L), AbstractC25225BEi.A0n(num3, 0, AbstractC25230BEn.A0K()), num, 0), C30185DRq.A02(this, 5));
        String A0F = AbstractC77623dm.A0F(A0P, 2131976825);
        long A0r = AbstractC25232BEp.A0r(12.0f);
        C2XE c2xe2 = A0P.A00;
        int A07 = AbstractC25229BEm.A07(c2xe2.A0C, A0P);
        long A08 = AbstractC77623dm.A08(A0P);
        Integer num4 = C05F.A0N;
        long A0D = AbstractC25229BEm.A0D();
        Integer num5 = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, A0F, 0);
        AbstractC25233BEq.A1B(A0P, A0a, A07, A0r);
        A0a.A0S(1);
        AbstractC25234BEr.A0o(A0Q, A0P, A0a, A0D);
        A0a.A0X(num4);
        AbstractC25234BEr.A1H(A0a, num5, false);
        A0a.A0M(1);
        A0a.A01.A00 = AbstractC25228BEl.A08(A0P, A08);
        AbstractC25229BEm.A1E(A0a);
        AbstractC25233BEq.A1A(A0P, A0d, A0a);
        return AbstractC76963ci.A0I(A0P, c76223bS, A00);
    }

    public C26295Bk2(C25814BbV c25814BbV) {
        this.A00 = c25814BbV;
    }
}
