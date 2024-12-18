package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.7gy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169257gy extends AbstractC51572Yf {
    public final C9BS A00;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C9BS c9bs = this.A00;
        if (!c9bs.A02 || !c9bs.A01) {
            return null;
        }
        C77123cy A00 = AbstractC77063cs.A00(c76223bS, B6Z.A00);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A002 = AbstractC77853eD.A00(A00, new C51722Yv(null, new C9CV(C05F.A0D, Integer.valueOf(R.id.comment_xar_disclosure_banner), 4)), "comment_xar_disclosure_banner", new C9F3(40, this, c76223bS));
        C2Z0 c2z0 = new C2Z0(c76223bS.A05, new ArrayList());
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) ((InterfaceC16660sJ) ((C9BW) c9bs.A00).A00).invoke(AbstractC77363dM.A00(c2z0));
        C2XE c2xe = c2z0.A00;
        Context context = c2xe.A0C;
        int A03 = AbstractC77623dm.A03(c2z0, AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text));
        int A032 = AbstractC77623dm.A03(c2z0, R.color.fds_transparent);
        Integer num = C05F.A0C;
        Integer num2 = C05F.A00;
        Typeface A033 = AbstractC14710oj.A03(context, Typeface.DEFAULT, num2);
        C51722Yv c51722Yv = new C51722Yv(new C51722Yv(null, new C9CU(C05F.A04, 0, Double.doubleToRawLongBits(32.0d))), new C9CU(C05F.A05, 0, Double.doubleToRawLongBits(12.0d)));
        long doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
        C77723dw A034 = C51682Yq.A03(c2xe, 0);
        A034.A0W(spannableStringBuilder);
        A034.A0V(null);
        A034.A0Q(A03);
        A034.A0R(C2Z3.A00(c2z0.BoZ(), Float.floatToRawIntBits(14.0f) | 9221683186994511872L));
        A034.A0S(0);
        A034.A0T(A033);
        A034.A0P(-7829368);
        A034.A0K(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits));
        A034.A0I(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits));
        A034.A0J(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits));
        A034.A0H(C2Z3.A00(c2z0.BoZ(), doubleToRawLongBits));
        A034.A0X(num);
        A034.A0C();
        A034.A0Y(num2);
        A034.A0L(1.0f);
        A034.A0b(false);
        A034.A0N(0);
        A034.A0M(Integer.MAX_VALUE);
        A034.A0c(true);
        A034.A0Z(false);
        A034.A0a(true);
        A034.A06(null);
        A034.A01.A08 = A032;
        AbstractC77743dy.A00(A034, c51722Yv);
        c2z0.A00(A034.A0A());
        int A0F = AbstractC53242c7.A0F(AbstractC77363dM.A00(c2z0), R.attr.dividerColor);
        C51722Yv c51722Yv2 = new C51722Yv(new C51722Yv(null, new C9CV(num2, EnumC77683ds.STRETCH, 3)), new C9CU(C05F.A01, 0, 9221401712017801217L));
        C26280Bjn A035 = C26658Bpt.A03(c2xe);
        A035.A0B(A0F);
        AbstractC77743dy.A00(A035, c51722Yv2);
        c2z0.A00(A035.A0A());
        return AbstractC76963ci.A06(c2z0, c76223bS, A002, null, null, null, false);
    }

    public C169257gy(C9BS c9bs) {
        this.A00 = c9bs;
    }
}
