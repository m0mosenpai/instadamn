package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.facebook.R;

/* renamed from: X.3z7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89663z7 extends AbstractC51572Yf {
    public final C51755Mte A00;
    public final InterfaceC60442pS A01;

    public C89663z7(C51755Mte c51755Mte, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(interfaceC60442pS, 2);
        this.A00 = c51755Mte;
        this.A01 = interfaceC60442pS;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        if (this.A00 == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC77623dm.A0F(c76223bS, 2131966000));
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        spannableStringBuilder.setSpan(new C52784NXt(this, c76223bS.BoZ().A02(AbstractC53242c7.A0H(context, R.attr.igds_color_link))), 0, spannableStringBuilder.length(), 18);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv c51722Yv = new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CU(C05F.A0u, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.action_bar_item_spacing_right))), new C9CU(C05F.A1F, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.action_bar_item_spacing_right))), new C9CU(C05F.A1I, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.abc_action_bar_elevation_material))), new C9CV(C05F.A01, "android.widget.Button", 0));
        SpannableStringBuilder append = new SpannableStringBuilder(c2xe.A09(2131956506)).append((CharSequence) " ").append((CharSequence) spannableStringBuilder);
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.abc_text_size_menu_header_material);
        int A02 = c76223bS.BoZ().A02(R.color.fds_transparent);
        int A022 = c76223bS.BoZ().A02(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text));
        long A0D2 = AbstractC77623dm.A0D(c76223bS, R.dimen.abc_control_corner_material);
        Integer num = C05F.A0N;
        Typeface typeface = Typeface.DEFAULT;
        long doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
        Integer num2 = C05F.A00;
        C77723dw A03 = C51682Yq.A03(c2xe, 0);
        A03.A0W(append);
        A03.A0V(null);
        A03.A0Q(A022);
        A03.A0R(C2Z3.A00(c76223bS.BoZ(), A0D));
        A03.A0S(0);
        A03.A0T(typeface);
        A03.A0P(-7829368);
        A03.A0K(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits));
        A03.A0I(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits));
        A03.A0J(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits));
        A03.A0H(C2Z3.A00(c76223bS.BoZ(), doubleToRawLongBits));
        A03.A0X(num);
        A03.A0C();
        A03.A0Y(num2);
        A03.A0L(1.28f);
        A03.A0b(false);
        A03.A0N(0);
        A03.A0M(1);
        float A00 = C2Z3.A00(c76223bS.BoZ(), A0D2);
        C51682Yq c51682Yq = A03.A01;
        c51682Yq.A00 = A00;
        A03.A0c(false);
        A03.A0Z(false);
        A03.A0a(true);
        A03.A06(null);
        c51682Yq.A08 = A02;
        AbstractC77743dy.A00(A03, c51722Yv);
        return A03.A0A();
    }
}
