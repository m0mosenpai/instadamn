package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public abstract class AMr {
    public static final SpannedString A01(Resources resources, String str, int[] iArr, int i) {
        int A0A = AbstractC166997dE.A0A(resources);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new C209849Pv(-1, A0A, i, false, i, i), 0, spannableString.length(), 33);
        spannableString.setSpan(new C9T8(spannableString, null, iArr), 0, 1, 33);
        return new SpannedString(spannableString);
    }

    public static final SpannedString A02(Resources resources, String str, int[] iArr, int i, int i2) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new C209849Pv(-1, AbstractC166997dE.A07(resources), i2, false, i2, i2), 0, spannableString.length(), 33);
        int length = spannableString.length();
        int A0A = AbstractC166997dE.A0A(resources);
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new C209849Pv(i, A0A, i2, false, i2, i2), 0, spannableString2.length(), 33);
        spannableString2.setSpan(new C9T8(spannableString2, null, iArr), 0, length, 33);
        return new SpannedString(spannableString2);
    }

    public static final void A05(Context context, UserSession userSession, C6RB c6rb, float f) {
        AbstractC167017dG.A1N(userSession, context);
        AbstractC167017dG.A0z(context, c6rb);
        AbstractC167007dF.A1A(c6rb, f, 0.0f, 0.0f);
    }

    public static final void A07(Context context, C6RB c6rb, float f, float f2) {
        C14360o3.A0B(context, 0);
        c6rb.A0D(AbstractC13880nE.A03(context, 1.0f), 0.0f, AbstractC13880nE.A03(context, 1.0f), context.getColor(R.color.black_25_transparent));
        AbstractC166987dD.A1U(EnumC15950qp.A0z, AbstractC15960qq.A00(context), c6rb);
        AbstractC167007dF.A1A(c6rb, f, f2, 0.0f);
    }

    public static final void A09(Resources resources, Spannable spannable, int i, int i2, int i3) {
        C14360o3.A0B(resources, 1);
        A0B(spannable, AbstractC166997dE.A07(resources), i, i, i2, i3);
    }

    public static final void A0A(Resources resources, Spannable spannable, int[] iArr, int i) {
        AbstractC167017dG.A1Q(resources, iArr);
        AbstractC167017dG.A15(spannable, new C221439q8(iArr, AbstractC166997dE.A07(resources), i, i, i));
    }

    public static final void A0B(Spannable spannable, int i, int i2, int i3, int i4, int i5) {
        spannable.setSpan(new C209849Pv(i4, i, i2, false, i3, i3), 0, spannable.length(), 18);
        spannable.setSpan(new ForegroundColorSpan(i5), 0, spannable.length(), 18);
    }

    public static final SpannableStringBuilder A00(Resources resources, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        int[] iArr = {i, i, i, i, i};
        int[] iArr2 = {i2, i2};
        spannableStringBuilder.setSpan(new C221449q9(null, iArr, iArr2, -1, AbstractC166997dE.A0A(resources), AbstractC166997dE.A09(resources)), 0, spannableStringBuilder.length(), 18);
        return spannableStringBuilder;
    }

    public static final void A03(Context context, Resources resources, Spannable spannable, int i) {
        int A07 = AbstractC166997dE.A07(resources);
        AbstractC167017dG.A15(spannable, new C221449q9(AbstractC23047AEd.A00(), AbstractC23047AEd.A01(context), new int[]{AbstractC167007dF.A09(context, R.attr.igds_color_text_on_white), AbstractC167007dF.A09(context, R.attr.igds_color_text_on_white)}, -1, A07, i));
    }

    public static final void A04(Context context, Spannable spannable, int i) {
        A09(AbstractC166997dE.A0M(context), spannable, i, context.getColor(R.color.sticker_subtle_light_background), -1);
    }

    public static final void A06(Context context, C6RB c6rb, float f, float f2) {
        AbstractC167017dG.A1N(context, c6rb);
        AbstractC166987dD.A1U(EnumC15950qp.A0W, AbstractC15960qq.A00(context), c6rb);
        AbstractC167007dF.A1A(c6rb, f, 0.0f, f2);
    }

    public static final void A08(Context context, C6RB c6rb, float f, float f2, float f3) {
        AbstractC167017dG.A0z(context, c6rb);
        AbstractC167007dF.A1A(c6rb, f, f2, f3);
    }
}
