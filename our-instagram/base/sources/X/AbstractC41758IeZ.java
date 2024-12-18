package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.IeZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41758IeZ {
    public static final SpannableStringBuilder A01(Context context, int i) {
        C14360o3.A0B(context, 0);
        return A03(context, context.getDrawable(R.drawable.chevron_right_double_outline_12), i, 0, true, false);
    }

    public static final SpannableStringBuilder A02(Context context, int i, boolean z) {
        C14360o3.A0B(context, 0);
        int i2 = R.drawable.instagram_chevron_right_pano_outline_12;
        int i3 = R.attr.glyphColorSecondary;
        if (z) {
            i2 = R.drawable.instagram_chevron_right_pano_filled_12;
            i3 = R.attr.igds_color_primary_text_on_media;
        }
        return A03(context, AbstractC85953sP.A01(context, i2, AbstractC53242c7.A0H(context, i3)), i, 0, true, false);
    }

    public static final SpannableStringBuilder A03(Context context, Drawable drawable, int i, int i2, boolean z, boolean z2) {
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        if (z) {
            A01.append((CharSequence) "\ufeff");
        }
        int length = A01.length();
        A01.append((CharSequence) "cc");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        if (drawable != null) {
            drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * dimensionPixelSize) / drawable.getIntrinsicHeight(), dimensionPixelSize);
            C85973sR c85973sR = new C85973sR(drawable);
            c85973sR.A02 = C05F.A00;
            c85973sR.A00 = i;
            c85973sR.A01 = i2;
            A01.setSpan(c85973sR, length, length + 2, 33);
        }
        if (z2) {
            A01.append((CharSequence) "\ufeff");
        }
        return A01;
    }

    public static final CharSequence A04(Context context, C57482kN c57482kN, String str, int i, int i2) {
        CharSequence[] charSequenceArr;
        C14360o3.A0B(str, 1);
        SpannableStringBuilder A01 = A01(context, i);
        StaticLayout A00 = c57482kN.A00(AbstractC25225BEi.A0H(AbstractC167017dG.A0n(A01, str, AbstractC166987dD.A1C())));
        C14360o3.A07(A00);
        if (A00.getLineCount() > i2) {
            StringBuilder sb = new StringBuilder(str);
            SpannableStringBuilder append = AbstractC25225BEi.A0H("…").append((CharSequence) A01);
            C14360o3.A07(append);
            StaticLayout A002 = c57482kN.A00(str);
            C14360o3.A07(A002);
            charSequenceArr = new CharSequence[]{AbstractC68576VWd.A00(A002, append, c57482kN, sb, i2), "…", A01};
        } else {
            charSequenceArr = new CharSequence[]{str, A01};
        }
        CharSequence concat = TextUtils.concat(charSequenceArr);
        C14360o3.A0A(concat);
        return concat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r9 != 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r9 != 1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.text.SpannableStringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.CharSequence A05(android.content.Context r19, java.util.List r20, int r21, int r22, int r23) {
        /*
            r5 = 2
            r1 = r22
            r0 = r23
            int[] r12 = new int[]{r1, r0}
            r4 = -1001(0xfffffffffffffc17, float:NaN)
            r3 = 1
            int[] r11 = new int[]{r4, r4}
            if (r20 == 0) goto La4
            int r0 = r20.size()
            if (r0 == r3) goto L1f
            int r1 = r20.size()
            r0 = 5
            if (r1 != r0) goto La4
        L1f:
            android.text.SpannableStringBuilder r0 = X.AbstractC37300Gc1.A01()
            java.util.Iterator r10 = r20.iterator()
        L27:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r10.next()
            com.instagram.api.schemas.AdsRatingAndReviewStarType r1 = (com.instagram.api.schemas.AdsRatingAndReviewStarType) r1
            if (r1 == 0) goto La1
            int r9 = r1.ordinal()
            r8 = -1003(0xfffffffffffffc15, float:NaN)
            if (r9 == r5) goto L9d
            r1 = 3
            if (r9 == r1) goto L99
            if (r9 != r3) goto L45
            r8 = 2131238908(0x7f081ffc, float:1.8094108E38)
        L45:
            r7 = 3
            r6 = -1002(0xfffffffffffffc16, float:NaN)
            r1 = 1
            if (r9 == r5) goto L95
            if (r9 == r7) goto L95
            if (r9 == r3) goto L96
        L4f:
            r2 = -1001(0xfffffffffffffc17, float:NaN)
            r1 = 1
            if (r9 == r5) goto L91
            if (r9 == r7) goto L91
            if (r9 == r3) goto L92
        L58:
            r1 = -1003(0xfffffffffffffc15, float:NaN)
            if (r8 == r1) goto La1
            r1 = -1002(0xfffffffffffffc16, float:NaN)
            r13 = r19
            if (r6 == r1) goto L77
            android.graphics.drawable.Drawable r14 = X.AbstractC85953sP.A01(r13, r8, r6)
        L66:
            if (r14 == 0) goto La1
            r15 = 0
            r16 = r21
            r17 = r15
            r18 = r3
            android.text.SpannableStringBuilder r1 = A03(r13, r14, r15, r16, r17, r18)
        L73:
            r0.append(r1)
            goto L27
        L77:
            if (r2 == r4) goto La1
            android.util.TypedValue r1 = X.AbstractC85953sP.A00
            r14 = 0
            android.graphics.drawable.Drawable r1 = r13.getDrawable(r8)     // Catch: android.content.res.Resources.NotFoundException -> L66
            if (r1 == 0) goto L66
            android.graphics.drawable.Drawable r14 = r1.mutate()
            X.C14360o3.A07(r14)
            android.graphics.ColorFilter r1 = X.C3DY.A00(r2)
            r14.setColorFilter(r1)
            goto L66
        L91:
            r1 = 0
        L92:
            r2 = r11[r1]
            goto L58
        L95:
            r1 = 0
        L96:
            r6 = r12[r1]
            goto L4f
        L99:
            r8 = 2131238901(0x7f081ff5, float:1.8094094E38)
            goto L45
        L9d:
            r8 = 2131238905(0x7f081ff9, float:1.8094102E38)
            goto L45
        La1:
            java.lang.String r1 = ""
            goto L73
        La4:
            java.lang.String r0 = ""
        La6:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41758IeZ.A05(android.content.Context, java.util.List, int, int, int):java.lang.CharSequence");
    }

    public static SpannableStringBuilder A00(Context context) {
        return A01(context, context.getResources().getDimensionPixelSize(R.dimen.call_peek_promo_bottom_sheet_label_bottom_padding));
    }

    public static final CharSequence A06(TextView textView, String str, int i, int i2) {
        AbstractC167017dG.A1N(textView, str);
        C57482kN A0C = AbstractC37303Gc4.A0C(Layout.Alignment.ALIGN_NORMAL, textView.getPaint(), textView, i2);
        Context A0L = AbstractC166997dE.A0L(textView);
        return A04(A0L, A0C, str, AbstractC166997dE.A04(A0L, i), textView.getMaxLines());
    }
}
