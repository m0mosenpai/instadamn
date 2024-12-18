package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.R;

/* renamed from: X.7in, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC170347in {
    public static final C51682Yq A00(C2Z1 c2z1, C51722Yv c51722Yv, CharSequence charSequence, Integer num, boolean z) {
        int i;
        C14360o3.A0B(c51722Yv, 2);
        if (!z) {
            num = C05F.A0C;
        }
        int intValue = num.intValue();
        C2XE ArD = c2z1.ArD();
        Context context = ArD.A0C;
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    i = R.attr.igds_color_error_or_destructive;
                } else {
                    i = R.attr.igds_color_primary_text_disabled;
                }
            } else {
                i = R.attr.igds_color_secondary_text;
            }
        } else {
            i = R.attr.igds_color_primary_text;
        }
        int A03 = AbstractC77623dm.A03(c2z1, AbstractC53242c7.A0H(context, i));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        long A0D = AbstractC77623dm.A0D(c2z1, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        Integer num2 = C05F.A01;
        Typeface create = Typeface.create("sans-serif-medium", 0);
        C14360o3.A07(create);
        Typeface A032 = AbstractC14710oj.A03(context, create, num2);
        C51722Yv c51722Yv2 = new C51722Yv(c51722Yv, new C9CV(C05F.A0N, charSequence, 0));
        long doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
        Integer num3 = C05F.A00;
        C77723dw A033 = C51682Yq.A03(ArD, 0);
        A033.A0W(charSequence);
        A033.A0V(null);
        A033.A0Q(A03);
        A033.A0R(C2Z3.A00(c2z1.BoZ(), A0D));
        A033.A0S(0);
        A033.A0T(A032);
        A033.A0P(-7829368);
        A033.A0K(C2Z3.A00(c2z1.BoZ(), doubleToRawLongBits));
        A033.A0I(C2Z3.A00(c2z1.BoZ(), doubleToRawLongBits));
        A033.A0J(C2Z3.A00(c2z1.BoZ(), doubleToRawLongBits));
        A033.A0H(C2Z3.A00(c2z1.BoZ(), doubleToRawLongBits));
        A033.A0X(num3);
        A033.A0C();
        A033.A0Y(num3);
        A033.A0L(1.33f);
        A033.A0b(false);
        A033.A0N(0);
        A033.A0M(1);
        A033.A0c(true);
        A033.A0Z(false);
        A033.A0a(true);
        A033.A0U(truncateAt);
        A033.A06(null);
        AbstractC77743dy.A00(A033, c51722Yv2);
        return A033.A0A();
    }
}
