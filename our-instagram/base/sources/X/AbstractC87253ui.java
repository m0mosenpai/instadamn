package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.instagram.feed.ui.text.IgLikeTextView;

/* renamed from: X.3ui, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87253ui {
    public static final void A00(Context context, SpannableStringBuilder spannableStringBuilder, C87173ua c87173ua) {
        Object obj;
        InterfaceC16660sJ interfaceC16660sJ;
        C14360o3.A0B(c87173ua, 1);
        C14360o3.A0B(context, 2);
        if (c87173ua.A04) {
            interfaceC16660sJ = c87173ua.A00.A01;
        } else if (c87173ua.A09) {
            interfaceC16660sJ = c87173ua.A00.A09;
        } else if (c87173ua.A0A) {
            interfaceC16660sJ = c87173ua.A00.A0B;
        } else if (c87173ua.A07) {
            interfaceC16660sJ = c87173ua.A00.A04;
        } else {
            obj = "";
            spannableStringBuilder.append((CharSequence) obj);
        }
        obj = interfaceC16660sJ.invoke(context);
        spannableStringBuilder.append((CharSequence) obj);
    }

    public static final void A01(C87173ua c87173ua, C87053uN c87053uN, Integer num) {
        View.OnClickListener xmc;
        C14360o3.A0B(c87053uN, 0);
        View view = c87053uN.A00;
        IgLikeTextView igLikeTextView = c87053uN.A02;
        if (c87173ua.A05) {
            Context context = igLikeTextView.getContext();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            C14360o3.A0A(context);
            A00(context, spannableStringBuilder, c87173ua);
            if (spannableStringBuilder.length() != 0) {
                view.setVisibility(0);
                igLikeTextView.setText(spannableStringBuilder);
                if (num != null) {
                    igLikeTextView.setTextColor(num.intValue());
                }
                igLikeTextView.setMovementMethod(LinkMovementMethod.getInstance());
                igLikeTextView.setLongClickable(false);
                igLikeTextView.setVisibility(0);
                igLikeTextView.setAlpha(1.0f);
                if (c87173ua.A09) {
                    xmc = new ViewOnClickListenerC72086XNf(igLikeTextView, c87173ua);
                } else if (c87173ua.A04) {
                    xmc = new Y8K(igLikeTextView, c87173ua);
                } else if (!c87173ua.A0A && !c87173ua.A07) {
                    return;
                } else {
                    xmc = new XMC(igLikeTextView, c87173ua);
                }
                C0fQ.A00(xmc, igLikeTextView);
                return;
            }
        }
        view.setVisibility(8);
    }
}
