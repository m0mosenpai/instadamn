package X;

import android.content.res.Resources;
import android.graphics.Color;
import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.reels.question.model.QuestionResponsesModelIntf;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;

/* loaded from: classes7.dex */
public abstract class I5S {
    public static void A00(C41628IbJ c41628IbJ, JHI jhi, C38456Gvd c38456Gvd, Integer num, int i) {
        final int i2;
        if (c41628IbJ.A01() != AlD.A00(AbstractC31172DnG.A05(c38456Gvd))) {
            c41628IbJ.A00.Bol();
        }
        C38515Gwb c38515Gwb = c38456Gvd.A02;
        if (c41628IbJ.A00.Bol() != QuestionResponseType.A06) {
            QuestionResponsesModelIntf questionResponsesModelIntf = c41628IbJ.A01;
            C14360o3.A0B(questionResponsesModelIntf, 0);
            Color.parseColor(questionResponsesModelIntf.getTextColor());
        }
        I5P.A00(c41628IbJ, jhi, c38515Gwb, num, i);
        if (c41628IbJ.A00.Bol().ordinal() != 3) {
            i2 = -16777216;
        } else {
            i2 = c38456Gvd.A00;
        }
        final TextView textView = c38456Gvd.A01;
        textView.setText(c41628IbJ.A02(), TextView.BufferType.SPANNABLE);
        AbstractC13880nE.A0r(textView, new Runnable() { // from class: X.J4n
            @Override // java.lang.Runnable
            public final void run() {
                TextView textView2 = textView;
                int i3 = i2;
                Resources resources = textView2.getResources();
                C13680mu.A05(textView2, textView2.getMaxLines(), resources.getDimensionPixelSize(R.dimen.bio_product_sticker_subtitle_size_smaller), resources.getDimensionPixelSize(R.dimen.question_response_card_response_text_max_size));
                CharSequence A01 = AbstractC85253rG.A01(new C57482kN(Layout.Alignment.ALIGN_NORMAL, textView2.getPaint(), null, 0.0f, 1.0f, textView2.getMeasuredWidth(), false), "", textView2.getText(), "…", textView2.getMaxLines(), false);
                if (A01.length() != textView2.getText().length()) {
                    A01 = TextUtils.concat(A01, "…");
                }
                textView2.setText(A01, TextView.BufferType.SPANNABLE);
                textView2.setTextColor(i3);
            }
        });
    }
}
