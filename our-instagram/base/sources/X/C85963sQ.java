package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.3sQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85963sQ {
    public static final C85963sQ A00 = new Object();

    public static final BitmapDrawable A00(Context context) {
        C14360o3.A0B(context, 0);
        Drawable drawable = context.getDrawable(R.drawable.verified_profile);
        C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return (BitmapDrawable) drawable;
    }

    public static final SpannableStringBuilder A01(TextView textView, CharSequence charSequence) {
        C14360o3.A0B(charSequence, 1);
        Context context = textView.getContext();
        C14360o3.A0A(context);
        Drawable mutate = A00(context).mutate();
        C14360o3.A07(mutate);
        int i = 0;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        C14360o3.A0B(context, 0);
        mutate.setColorFilter(C3DY.A00(context.getColor(R.color.badge_color)));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        float applyDimension = TypedValue.applyDimension(1, 2.0f, displayMetrics);
        CharSequence ellipsize = TextUtils.ellipsize(charSequence, textView.getPaint(), (textView.getWidth() - applyDimension) - mutate.getIntrinsicWidth(), TextUtils.TruncateAt.END, false, null);
        C14360o3.A07(ellipsize);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(ellipsize);
        valueOf.append((CharSequence) " ");
        C85973sR c85973sR = new C85973sR(mutate);
        if (ellipsize.length() >= charSequence.length()) {
            i = (int) applyDimension;
        }
        c85973sR.A00 = i;
        valueOf.setSpan(c85973sR, valueOf.length() - 1, valueOf.length(), 33);
        return valueOf;
    }

    public static final void A03(Context context, SpannableStringBuilder spannableStringBuilder, int i) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(spannableStringBuilder, 1);
        A00.A06(context, spannableStringBuilder, null, i, true, AbstractC13620mo.A02(context));
    }

    public static final void A04(Context context, SpannableStringBuilder spannableStringBuilder, int i) {
        int i2 = i;
        boolean A02 = AbstractC13620mo.A02(context);
        spannableStringBuilder.insert(i, " ");
        C85963sQ c85963sQ = A00;
        if (!A02) {
            i2 = i + 1;
        }
        c85963sQ.A06(context, spannableStringBuilder, null, i2, true, A02);
    }

    public static final void A05(Context context, SpannableStringBuilder spannableStringBuilder, C85963sQ c85963sQ, Integer num, boolean z, boolean z2) {
        int length;
        if (z2) {
            length = 0;
        } else {
            length = spannableStringBuilder.length();
        }
        c85963sQ.A06(context, spannableStringBuilder, num, length, z, z2);
    }

    public static final void A08(Context context, SpannableStringBuilder spannableStringBuilder, boolean z) {
        C14360o3.A0B(context, 0);
        boolean A02 = AbstractC13620mo.A02(context);
        C85963sQ c85963sQ = A00;
        if (A02) {
            spannableStringBuilder.insert(0, " ");
        } else {
            spannableStringBuilder.append(" ");
        }
        A05(context, spannableStringBuilder, c85963sQ, null, z, A02);
    }

    public static final void A09(TextView textView, int i, int i2, int i3, boolean z) {
        Drawable drawable;
        C14360o3.A0B(textView, 0);
        Context context = textView.getContext();
        boolean A02 = AbstractC13620mo.A02(context);
        if (z) {
            C14360o3.A0A(context);
            drawable = A00(context).mutate();
            int i4 = i2;
            if (A02) {
                i4 = 0;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (!A02) {
                intrinsicWidth += i2;
            }
            drawable.setBounds(i4, i, intrinsicWidth, drawable.getIntrinsicHeight() + i);
            if (A02) {
                AbstractC13880nE.A0Z(textView, drawable.getIntrinsicWidth());
            } else {
                AbstractC13880nE.A0b(textView, i2);
            }
            if (i3 != -1) {
                drawable.setColorFilter(C3DY.A00(i3));
            }
        } else {
            drawable = null;
        }
        Drawable drawable2 = null;
        if (A02) {
            drawable2 = drawable;
            drawable = null;
        }
        textView.setCompoundDrawables(drawable2, null, drawable, null);
    }

    public static final void A0B(TextView textView, boolean z) {
        C14360o3.A0B(textView, 0);
        Context context = textView.getContext();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        A09(textView, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), 0, context.getColor(R.color.badge_color), z);
    }

    public static final void A0C(TextView textView, boolean z) {
        C14360o3.A0B(textView, 0);
        Context context = textView.getContext();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        A09(textView, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), 0, context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_blue)), z);
    }

    public static final void A07(Context context, SpannableStringBuilder spannableStringBuilder, boolean z) {
        A05(context, spannableStringBuilder, A00, null, z, AbstractC13620mo.A02(context));
    }

    public static final void A02(Context context, SpannableStringBuilder spannableStringBuilder) {
        boolean A02 = AbstractC13620mo.A02(context);
        C85963sQ c85963sQ = A00;
        if (A02) {
            spannableStringBuilder.insert(0, " ");
        } else {
            spannableStringBuilder.append(" ");
        }
        A05(context, spannableStringBuilder, c85963sQ, Integer.valueOf(R.color.design_dark_default_color_on_background), false, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.text.style.CharacterStyle, X.4qw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A06(android.content.Context r6, android.text.SpannableStringBuilder r7, java.lang.Integer r8, int r9, boolean r10, boolean r11) {
        /*
            r5 = this;
            android.graphics.drawable.BitmapDrawable r0 = A00(r6)
            android.graphics.drawable.Drawable r3 = r0.mutate()
            X.C14360o3.A07(r3)
            if (r8 == 0) goto L7f
            int r0 = r8.intValue()
        L11:
            int r0 = r6.getColor(r0)
            android.graphics.ColorFilter r0 = X.C3DY.A00(r0)
            r3.setColorFilter(r0)
        L1c:
            int r1 = r3.getIntrinsicWidth()
            int r0 = r3.getIntrinsicHeight()
            r4 = 0
            r3.setBounds(r4, r4, r1, r0)
            X.3sR r2 = new X.3sR
            r2.<init>(r3)
            int r0 = r7.length()
            java.lang.String r1 = " "
            if (r9 != r0) goto L7b
            r7.append(r1)
        L38:
            int r0 = r9 + 1
            r3 = 33
            r7.setSpan(r2, r9, r0, r3)
            boolean r0 = X.AbstractC56862jK.A00(r6)
            if (r0 == 0) goto L72
            r2 = 0
            if (r11 == 0) goto L73
            r7.insert(r4, r1)
        L4b:
            r0 = 2131976597(0x7f136195, float:1.959032E38)
            java.lang.String r0 = r6.getString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            if (r11 != 0) goto L5d
            int r2 = r1.length()
        L5d:
            java.lang.String r0 = " , "
            r1.insert(r2, r0)
            java.lang.String r0 = r1.toString()
            X.4qw r1 = new X.4qw
            r1.<init>()
            r1.A00 = r0
            int r0 = r9 + 1
            r7.setSpan(r1, r9, r0, r3)
        L72:
            return
        L73:
            int r9 = r7.length()
            r7.append(r1)
            goto L4b
        L7b:
            r7.insert(r9, r1)
            goto L38
        L7f:
            if (r10 == 0) goto L1c
            r0 = 2131099704(0x7f060038, float:1.7811769E38)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85963sQ.A06(android.content.Context, android.text.SpannableStringBuilder, java.lang.Integer, int, boolean, boolean):void");
    }

    public static final void A0A(TextView textView, int i, boolean z) {
        Context context = textView.getContext();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        A09(textView, (int) TypedValue.applyDimension(1, 1.0f, displayMetrics), i, context.getColor(R.color.badge_color), z);
    }
}
