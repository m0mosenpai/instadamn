package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.R;
import com.instagram.model.direct.HighlightRange;
import java.util.List;

/* renamed from: X.78K, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C78K {
    public static final void A01(Spannable spannable) {
        C14360o3.A0B(spannable, 0);
        Object[] spans = spannable.getSpans(0, spannable.length(), C89403yg.class);
        C14360o3.A07(spans);
        for (C89403yg c89403yg : (C89403yg[]) spans) {
            c89403yg.A00 = null;
            c89403yg.A01 = null;
        }
    }

    public static final void A02(Spannable spannable, InterfaceC89443yk interfaceC89443yk, InterfaceC89443yk interfaceC89443yk2, InterfaceC89443yk interfaceC89443yk3, InterfaceC89443yk interfaceC89443yk4, InterfaceC89443yk interfaceC89443yk5, InterfaceC89443yk interfaceC89443yk6, AnonymousClass786 anonymousClass786) {
        C14360o3.A0B(spannable, 0);
        Object[] spans = spannable.getSpans(0, spannable.length(), C89403yg.class);
        C14360o3.A07(spans);
        for (C89403yg c89403yg : (C89403yg[]) spans) {
            switch (c89403yg.A02.intValue()) {
                case 0:
                    c89403yg.A00 = interfaceC89443yk2;
                    break;
                case 1:
                    c89403yg.A00 = interfaceC89443yk3;
                    break;
                case 4:
                    c89403yg.A00 = interfaceC89443yk4;
                    break;
                case 5:
                    c89403yg.A00 = interfaceC89443yk;
                    break;
                case 6:
                    c89403yg.A00 = interfaceC89443yk6;
                    break;
                case 7:
                    c89403yg.A00 = interfaceC89443yk5;
                    break;
            }
            c89403yg.A01 = anonymousClass786;
        }
        Object[] spans2 = spannable.getSpans(0, spannable.length(), C78M.class);
        C14360o3.A07(spans2);
        if (0 < ((C78M[]) spans2).length) {
            throw new NullPointerException("onClickListener");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Drawable drawable, TextView textView, AnonymousClass541 anonymousClass541, AnonymousClass781 anonymousClass781) {
        int i;
        int i2;
        int i3;
        InterfaceC56852jJ interfaceC56852jJ;
        Drawable drawable2 = drawable;
        C7QL c7ql = anonymousClass781.A03;
        CharSequence charSequence = anonymousClass781.A04;
        boolean z = anonymousClass781.A0B;
        C7IM c7im = c7ql.A03;
        C7R2 A01 = AbstractC162807Qr.A01(c7ql.A00, c7ql.A01);
        boolean CVC = ((AbstractC129515tG) anonymousClass781).A00.CVC();
        boolean z2 = c7ql.A06;
        boolean z3 = c7ql.A09;
        List<HighlightRange> list = anonymousClass781.A08;
        boolean z4 = anonymousClass781.A0G;
        boolean z5 = anonymousClass781.A0A;
        Context context = textView.getContext();
        C14360o3.A0A(context);
        if (!z) {
            i = (int) AbstractC13880nE.A04(context, 12);
            i2 = (int) AbstractC13880nE.A04(context, 10);
            AbstractC162737Qk.A06(drawable2, anonymousClass541, A01, c7im, CVC, false, z2, z3, z5);
        } else {
            i = 0;
            i2 = 0;
            drawable2 = null;
        }
        int i4 = 8388611;
        if (CVC) {
            i4 = 8388613;
        }
        if (textView.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = i4;
            textView.setLayoutParams(layoutParams2);
        }
        textView.setBackground(drawable2);
        AnonymousClass541 anonymousClass5412 = AnonymousClass541.A0H;
        if (anonymousClass541 == anonymousClass5412) {
            i3 = -16777216;
        } else if (AbstractC001800i.A0u(AbstractC16960so.A1Q(AnonymousClass541.A0G, AnonymousClass541.A0F), anonymousClass541) || (anonymousClass541 != null && anonymousClass541.A02)) {
            i3 = -1;
        } else if (!z2 && !z5) {
            i3 = AbstractC162737Qk.A01(c7im, CVC);
        } else {
            i3 = AbstractC162737Qk.A00(c7im, CVC);
        }
        textView.setTextColor(i3);
        textView.setPadding(i, i2, i, i2);
        if ((textView instanceof InterfaceC56852jJ) && (interfaceC56852jJ = (InterfaceC56852jJ) textView) != null) {
            interfaceC56852jJ.setTransformText(false);
        }
        if (z) {
            textView.setTextSize(0, textView.getResources().getDimension(R.dimen.direct_row_message_emoji_text_size));
        } else {
            float f = 16.0f;
            if (z2) {
                f = 14.0f;
            }
            textView.setTextSize(f);
        }
        C14360o3.A0A(context);
        float f2 = 20.0f;
        if (z) {
            f2 = 36.0f;
        }
        C13680mu.A03(textView, (int) AbstractC13880nE.A03(context, f2));
        textView.setMinimumWidth((int) (AbstractC13880nE.A04(context, 20) + AbstractC13880nE.A03(context, 20.0f)));
        if (!z4) {
            CharSequence A00 = AbstractC692839o.A00(textView, charSequence);
            if (list != null && A00 != null) {
                SpannableString spannableString = new SpannableString(A00);
                for (HighlightRange highlightRange : list) {
                    int i5 = highlightRange.A02;
                    int i6 = highlightRange.A00 + 1;
                    if (i5 >= 0 && i5 <= A00.length() && i6 >= 0 && i6 <= A00.length() && i6 >= i5) {
                        spannableString.setSpan(new ForegroundColorSpan(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_highlight_background))), i5, i6, 33);
                        spannableString.setSpan(new BackgroundColorSpan(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text))), i5, i6, 33);
                    }
                }
                textView.setText(spannableString);
            } else {
                textView.setText(A00);
            }
            if (anonymousClass541 == anonymousClass5412 && A00 != null) {
                C14120nc.A00().ATO(new C45717KLu(A00, new C9EL(textView, 31)));
            }
        }
        AbstractC010103p.A0B(textView, new C02V() { // from class: X.78O
            @Override // X.C02V
            public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                C14360o3.A0B(view, 0);
                C14360o3.A0B(accessibilityNodeInfoCompat, 1);
                super.A0Y(view, accessibilityNodeInfoCompat);
                C012804r c012804r = C012804r.A04;
                accessibilityNodeInfoCompat.addAction(new C012804r(32, view.getResources().getString(2131966359)));
            }
        });
    }
}
