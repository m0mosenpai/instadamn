package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.view.ViewGroup;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.6RY, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6RY {
    public static final int A00(IgTextView igTextView, int i) {
        int i2;
        C14360o3.A0B(igTextView, 0);
        int A0C = i - AbstractC13880nE.A0C(igTextView);
        if (igTextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = igTextView.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        } else {
            i2 = 0;
        }
        return ((A0C - i2) - igTextView.getPaddingLeft()) - igTextView.getPaddingRight();
    }

    public static final int A01(C57482kN c57482kN, CharSequence charSequence, int i) {
        C14360o3.A0B(charSequence, 0);
        C14360o3.A0B(c57482kN, 1);
        StaticLayout A00 = c57482kN.A00(charSequence);
        C14360o3.A07(A00);
        int lineCount = A00.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (A00.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return A00.getLineCount();
    }

    public static final int A02(C57482kN c57482kN, CharSequence charSequence, int i) {
        C14360o3.A0B(charSequence, 0);
        C14360o3.A0B(c57482kN, 1);
        StaticLayout A00 = c57482kN.A00(charSequence);
        C14360o3.A07(A00);
        if (A00.getLineCount() > i) {
            return A00.getLineBottom(i - 1);
        }
        return A00.getHeight();
    }

    public static final int A03(C57482kN c57482kN, CharSequence charSequence, int i) {
        C14360o3.A0B(charSequence, 0);
        C14360o3.A0B(c57482kN, 1);
        StaticLayout A00 = c57482kN.A00(charSequence);
        C14360o3.A07(A00);
        int i2 = new int[]{A00.getLineCount(), i}[0];
        if (i < i2) {
            i2 = i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int lineWidth = (int) A00.getLineWidth(i4);
            i3 = new int[]{i3, lineWidth}[0];
            if (lineWidth > i3) {
                i3 = lineWidth;
            }
        }
        return i3;
    }

    public static final SpannableStringBuilder A04(SpannableString spannableString, C57482kN c57482kN, CharSequence charSequence, int i) {
        C14360o3.A0B(charSequence, 0);
        CharSequence A01 = AbstractC85253rG.A01(c57482kN, "", charSequence, spannableString, i, false);
        C14360o3.A07(A01);
        SpannableStringBuilder append = new SpannableStringBuilder(A01).append((CharSequence) spannableString);
        C14360o3.A07(append);
        return append;
    }

    public static final C57482kN A05(Layout.Alignment alignment, IgTextView igTextView, int i) {
        C14360o3.A0B(igTextView, 0);
        return new C57482kN(alignment, igTextView.getPaint(), null, igTextView.getLineSpacingExtra(), igTextView.getLineSpacingMultiplier(), i, false);
    }

    public static final void A06(IgTextView igTextView, float f) {
        igTextView.setTextSize(1, f);
        int textSize = (int) (igTextView.getTextSize() * 0.3f);
        int textSize2 = (int) (igTextView.getTextSize() * 0.2f);
        AbstractC13880nE.A0i(igTextView, textSize, textSize);
        AbstractC13880nE.A0j(igTextView, textSize2, textSize2);
        igTextView.setLineSpacing(textSize2, 1.0f);
    }

    public static final void A08(IgTextView igTextView, C57482kN c57482kN, CharSequence charSequence, int i) {
        SpannableString spannableString = new SpannableString(charSequence);
        float paddingLeft = igTextView.getPaddingLeft();
        float paddingTop = igTextView.getPaddingTop();
        float textSize = igTextView.getTextSize() / 4.0f;
        StaticLayout A00 = c57482kN.A00(charSequence);
        C14360o3.A07(A00);
        AbstractC139116Rs.A00(igTextView, textSize, false);
        ViewTreeObserverOnPreDrawListenerC139186Rz viewTreeObserverOnPreDrawListenerC139186Rz = new ViewTreeObserverOnPreDrawListenerC139186Rz(AbstractC139126Rt.A02(A00, paddingLeft, paddingTop, paddingTop, textSize, 1.0f), textSize, i);
        spannableString.setSpan(viewTreeObserverOnPreDrawListenerC139186Rz, 0, spannableString.length(), 18);
        viewTreeObserverOnPreDrawListenerC139186Rz.A03 = true;
        igTextView.setText(spannableString);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    public static final void A07(IgTextView igTextView, int i) {
        EnumC15950qp enumC15950qp;
        Typeface A02;
        C15980qs A00;
        EnumC15950qp enumC15950qp2;
        switch (i) {
            case 1:
                Context context = igTextView.getContext();
                C14360o3.A07(context);
                A00 = AbstractC15960qq.A00(context);
                enumC15950qp2 = EnumC15950qp.A0c;
                A02 = A00.A02(enumC15950qp2);
                igTextView.setTypeface(A02);
                return;
            case 2:
                Context context2 = igTextView.getContext();
                C14360o3.A07(context2);
                A00 = AbstractC15960qq.A00(context2);
                enumC15950qp2 = EnumC15950qp.A0g;
                A02 = A00.A02(enumC15950qp2);
                igTextView.setTypeface(A02);
                return;
            case 3:
                C6QV.A00(igTextView);
                return;
            case 4:
                Context context3 = igTextView.getContext();
                C14360o3.A07(context3);
                A00 = AbstractC15960qq.A00(context3);
                enumC15950qp2 = EnumC15950qp.A08;
                A02 = A00.A02(enumC15950qp2);
                igTextView.setTypeface(A02);
                return;
            case 5:
                Context context4 = igTextView.getContext();
                C14360o3.A07(context4);
                A00 = AbstractC15960qq.A00(context4);
                enumC15950qp2 = EnumC15950qp.A0C;
                A02 = A00.A02(enumC15950qp2);
                igTextView.setTypeface(A02);
                return;
            case 6:
                enumC15950qp = EnumC15950qp.A0b;
                Context context5 = igTextView.getContext();
                C14360o3.A07(context5);
                A02 = AbstractC15960qq.A00(context5).A02(enumC15950qp);
                igTextView.setTypeface(A02);
                return;
            case 7:
                enumC15950qp = EnumC15950qp.A0f;
                Context context52 = igTextView.getContext();
                C14360o3.A07(context52);
                A02 = AbstractC15960qq.A00(context52).A02(enumC15950qp);
                igTextView.setTypeface(A02);
                return;
            case 8:
                enumC15950qp = EnumC15950qp.A0o;
                Context context522 = igTextView.getContext();
                C14360o3.A07(context522);
                A02 = AbstractC15960qq.A00(context522).A02(enumC15950qp);
                igTextView.setTypeface(A02);
                return;
            case 9:
                enumC15950qp = EnumC15950qp.A0L;
                Context context5222 = igTextView.getContext();
                C14360o3.A07(context5222);
                A02 = AbstractC15960qq.A00(context5222).A02(enumC15950qp);
                igTextView.setTypeface(A02);
                return;
            case 10:
                enumC15950qp = EnumC15950qp.A07;
                Context context52222 = igTextView.getContext();
                C14360o3.A07(context52222);
                A02 = AbstractC15960qq.A00(context52222).A02(enumC15950qp);
                igTextView.setTypeface(A02);
                return;
            case 11:
                enumC15950qp = EnumC15950qp.A0d;
                Context context522222 = igTextView.getContext();
                C14360o3.A07(context522222);
                A02 = AbstractC15960qq.A00(context522222).A02(enumC15950qp);
                igTextView.setTypeface(A02);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                enumC15950qp = EnumC15950qp.A15;
                Context context5222222 = igTextView.getContext();
                C14360o3.A07(context5222222);
                A02 = AbstractC15960qq.A00(context5222222).A02(enumC15950qp);
                igTextView.setTypeface(A02);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                enumC15950qp = EnumC15950qp.A0y;
                Context context52222222 = igTextView.getContext();
                C14360o3.A07(context52222222);
                A02 = AbstractC15960qq.A00(context52222222).A02(enumC15950qp);
                igTextView.setTypeface(A02);
                return;
            case 14:
                enumC15950qp = EnumC15950qp.A0G;
                Context context522222222 = igTextView.getContext();
                C14360o3.A07(context522222222);
                A02 = AbstractC15960qq.A00(context522222222).A02(enumC15950qp);
                igTextView.setTypeface(A02);
                return;
            case Process.SIGTERM /* 15 */:
                enumC15950qp = EnumC15950qp.A0s;
                Context context5222222222 = igTextView.getContext();
                C14360o3.A07(context5222222222);
                A02 = AbstractC15960qq.A00(context5222222222).A02(enumC15950qp);
                igTextView.setTypeface(A02);
                return;
            default:
                C6QV.A01(igTextView);
                return;
        }
    }
}
