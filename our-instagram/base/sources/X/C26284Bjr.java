package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import com.facebook.R;

/* renamed from: X.Bjr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26284Bjr extends AbstractC51572Yf {
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        C2XE c2xe = c76223bS.A05;
        gradientDrawable.setColor(AbstractC25228BEl.A06(c2xe.A0C, c76223bS, R.attr.igds_color_pill_background));
        gradientDrawable.setCornerRadius(100.0f);
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CU.A00(null, C05F.A04, 0, AbstractC77623dm.A06(c76223bS));
        Integer num = C05F.A00;
        C51722Yv A16 = AbstractC25232BEp.A16(A00, num, gradientDrawable);
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        String A0F = AbstractC77623dm.A0F(A0P, 2131969666);
        C2XE c2xe2 = A0P.A00;
        Context context = c2xe2.A0C;
        int A07 = AbstractC25229BEm.A07(context, A0P);
        long A09 = AbstractC77623dm.A09(A0P);
        Typeface A0Q = AbstractC25226BEj.A0Q(context, num);
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, A0F, 0);
        AbstractC25233BEq.A1B(A0P, A0a, A07, A09);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(A0Q, A0P, A0a, A0D);
        AbstractC25234BEr.A1I(A0a, num, false);
        A0a.A0M(1);
        A0a.A0c(true);
        AbstractC25232BEp.A1N(A0a, false);
        AbstractC25227BEk.A1J(A0P, A0a);
        return AbstractC76963ci.A06(A0P, c76223bS, A16, enumC77683ds, null, null, false);
    }
}
