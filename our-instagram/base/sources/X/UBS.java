package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes11.dex */
public final class UBS extends FrameLayout {
    public X8Z A00;
    public final C3PF A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final CircularImageView A05;

    public final void A00(Context context) {
        int i;
        if (this.A05.getVisibility() == 0) {
            i = AbstractC167017dG.A09(context);
        } else {
            i = 0;
        }
        int A0A = AbstractC13880nE.A0A(context) - (AbstractC167017dG.A0A(context) * 2);
        TextView textView = this.A03;
        textView.measure(View.MeasureSpec.makeMeasureSpec((A0A - (context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) * 3)) - i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        AbstractC65702TsY.A12(this, textView.getMeasuredHeight() + this.A04.getLineHeight() + (AbstractC166997dE.A04(context, R.dimen.account_discovery_bottom_gap) * 2) + AbstractC167017dG.A07(context), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO, View.MeasureSpec.makeMeasureSpec(A0A, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
    }

    public final void setAvatar(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        AbstractC167007dF.A1K(imageUrl, interfaceC11380iw);
        if (!AbstractC81033jX.A03(imageUrl)) {
            CircularImageView circularImageView = this.A05;
            circularImageView.setUrl(imageUrl, interfaceC11380iw);
            circularImageView.setVisibility(0);
        }
    }

    public final void setQuestionBody(String str) {
        C14360o3.A0B(str, 0);
        this.A03.setText(str);
        this.A05.setVisibility(8);
    }

    public final void setCloseButtonVisibility(boolean z) {
        View view = this.A02;
        view.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        if (z) {
            view.setOnClickListener(new WNS(this, 25));
        }
    }

    public UBS(Context context) {
        super(context);
        View.inflate(context, R.layout.layout_iglive_question_sticker_redesign, this);
        this.A05 = (CircularImageView) requireViewById(R.id.user_avatar);
        this.A03 = (TextView) requireViewById(R.id.question_body);
        this.A04 = (TextView) requireViewById(R.id.question_title);
        this.A02 = requireViewById(R.id.question_close_button);
        C3P9 c3p9 = new C3P9(this);
        c3p9.A04 = new C68003V5v(this, 8);
        this.A01 = c3p9.A00();
    }

    public final void setQuestionBodyWithUser(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) str2).append((CharSequence) " ");
        C14360o3.A0A(append);
        AnonymousClass773.A02(append, new CharacterStyle(), str2);
        this.A03.setText(spannableStringBuilder.append((CharSequence) str));
    }

    public final void setQuestionStickerListener(X8Z x8z) {
        this.A00 = x8z;
    }
}
