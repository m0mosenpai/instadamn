package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.6Tz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139706Tz {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public ConstraintLayout A05;
    public ConstraintLayout A06;
    public IgButton A07;
    public IgEditText A08;
    public CircularImageView A09;
    public final InterfaceC56392iX A0A;

    public C139706Tz(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        this.A0A = A01;
        A01.EZv(new InterfaceC69513Al() { // from class: X.6U0
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C139706Tz c139706Tz = C139706Tz.this;
                View requireViewById = view.requireViewById(R.id.lead_gen_card_container_with_saq);
                C14360o3.A0B(requireViewById, 0);
                c139706Tz.A00 = requireViewById;
                ConstraintLayout constraintLayout = (ConstraintLayout) view.requireViewById(R.id.lead_gen_card_with_saq_without_cta);
                C14360o3.A0B(constraintLayout, 0);
                c139706Tz.A05 = constraintLayout;
                CircularImageView circularImageView = (CircularImageView) view.requireViewById(R.id.lead_gen_card_with_saq_avatar_image);
                C14360o3.A0B(circularImageView, 0);
                c139706Tz.A09 = circularImageView;
                View requireViewById2 = view.requireViewById(R.id.lead_gen_card_with_saq_dimmer_overlay);
                C14360o3.A0B(requireViewById2, 0);
                c139706Tz.A01 = requireViewById2;
                TextView textView = (TextView) view.requireViewById(R.id.lead_gen_card_with_saq_subtitle);
                C14360o3.A0B(textView, 0);
                c139706Tz.A04 = textView;
                TextView textView2 = (TextView) view.requireViewById(R.id.lead_gen_card_with_saq_subtitle_cta);
                C14360o3.A0B(textView2, 0);
                c139706Tz.A03 = textView2;
                IgEditText igEditText = (IgEditText) view.requireViewById(R.id.lead_gen_card_with_saq_question_sticker_answer);
                C14360o3.A0B(igEditText, 0);
                c139706Tz.A08 = igEditText;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view.requireViewById(R.id.lead_gen_card_with_saq_cta_layout);
                C14360o3.A0B(constraintLayout2, 0);
                c139706Tz.A06 = constraintLayout2;
                IgButton igButton = (IgButton) view.requireViewById(R.id.lead_gen_card_with_saq_cta_button);
                C14360o3.A0B(igButton, 0);
                c139706Tz.A07 = igButton;
                TextView textView3 = (TextView) view.requireViewById(R.id.lead_gen_card_with_saq_disclaimer);
                C14360o3.A0B(textView3, 0);
                c139706Tz.A02 = textView3;
            }
        });
    }

    public final View A00() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        C14360o3.A0F("containerView");
        throw C00O.createAndThrow();
    }

    public final IgButton A01() {
        IgButton igButton = this.A07;
        if (igButton != null) {
            return igButton;
        }
        C14360o3.A0F("ctaButtonView");
        throw C00O.createAndThrow();
    }

    public final IgEditText A02() {
        IgEditText igEditText = this.A08;
        if (igEditText != null) {
            return igEditText;
        }
        C14360o3.A0F("answerCard");
        throw C00O.createAndThrow();
    }

    public final void A03() {
        String str;
        A01().setVisibility(4);
        ConstraintLayout constraintLayout = this.A06;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(4);
            ConstraintLayout constraintLayout2 = this.A05;
            if (constraintLayout2 != null) {
                constraintLayout2.setBackground(A00().getContext().getDrawable(R.drawable.reel_ctwa_story_messaging_card_rounded_corner_background));
                TextView textView = this.A02;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                }
                str = "disclaimerTextView";
            } else {
                str = "cardViewWithoutCta";
            }
        } else {
            str = "ctaButtonLayout";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
