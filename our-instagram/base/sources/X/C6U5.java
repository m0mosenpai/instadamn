package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.6U5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6U5 {
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public ConstraintLayout A07;
    public ConstraintLayout A08;
    public IgLinearLayout A09;
    public CircularImageView A0A;
    public String A0B;
    public boolean A0C;
    public final InterfaceC56392iX A0D;

    public C6U5(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        this.A0D = A01;
        this.A0B = "";
        A01.EZv(new InterfaceC69513Al() { // from class: X.6U6
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C6U5 c6u5 = C6U5.this;
                View requireViewById = view.requireViewById(R.id.faqs_in_stories_card_container);
                C14360o3.A0B(requireViewById, 0);
                c6u5.A01 = requireViewById;
                View requireViewById2 = view.requireViewById(R.id.faqs_in_stories_card);
                C14360o3.A0B(requireViewById2, 0);
                c6u5.A00 = requireViewById2;
                IgLinearLayout igLinearLayout = (IgLinearLayout) view.requireViewById(R.id.faqs_in_stories_option_list);
                C14360o3.A0B(igLinearLayout, 0);
                c6u5.A09 = igLinearLayout;
                CircularImageView circularImageView = (CircularImageView) view.requireViewById(R.id.faqs_in_stories_card_avatar_image);
                C14360o3.A0B(circularImageView, 0);
                c6u5.A0A = circularImageView;
                TextView textView = (TextView) view.requireViewById(R.id.faqs_in_stories_card_username);
                C14360o3.A0B(textView, 0);
                c6u5.A06 = textView;
                ConstraintLayout constraintLayout = (ConstraintLayout) view.requireViewById(R.id.faqs_in_stories_card_cta_layout);
                C14360o3.A0B(constraintLayout, 0);
                c6u5.A08 = constraintLayout;
                TextView textView2 = (TextView) view.requireViewById(R.id.faqs_in_stories_card_cta_button);
                C14360o3.A0B(textView2, 0);
                c6u5.A03 = textView2;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view.requireViewById(R.id.faqs_in_stories_card_without_cta);
                C14360o3.A0B(constraintLayout2, 0);
                c6u5.A07 = constraintLayout2;
                View requireViewById3 = view.requireViewById(R.id.faqs_in_stories_card_dimmer_overlay);
                C14360o3.A0B(requireViewById3, 0);
                c6u5.A02 = requireViewById3;
                TextView textView3 = (TextView) view.requireViewById(R.id.faqs_in_stories_card_disclaimer);
                C14360o3.A0B(textView3, 0);
                c6u5.A04 = textView3;
                TextView textView4 = (TextView) view.requireViewById(R.id.faqs_in_stories_card_disclosure);
                C14360o3.A0B(textView4, 0);
                c6u5.A05 = textView4;
            }
        });
    }

    public final View A00() {
        View view = this.A01;
        if (view != null) {
            return view;
        }
        C14360o3.A0F("containerView");
        throw C00O.createAndThrow();
    }

    public final TextView A01() {
        TextView textView = this.A03;
        if (textView != null) {
            return textView;
        }
        C14360o3.A0F("ctaButtonView");
        throw C00O.createAndThrow();
    }

    public final void A02() {
        if (!this.A0C) {
            A01().setVisibility(0);
            ConstraintLayout constraintLayout = this.A08;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            } else {
                C14360o3.A0F("ctaButtonLayout");
                throw C00O.createAndThrow();
            }
        }
        if (this.A0B.length() == 0) {
            try {
                Animation loadAnimation = AnimationUtils.loadAnimation(A00().getContext(), R.anim.button_slide_down_100_to_20);
                loadAnimation.setAnimationListener(new AnimationAnimationListenerC35725Fpz(this));
                ConstraintLayout constraintLayout2 = this.A08;
                if (constraintLayout2 != null) {
                    constraintLayout2.startAnimation(loadAnimation);
                } else {
                    C14360o3.A0F("ctaButtonLayout");
                    throw C00O.createAndThrow();
                }
            } catch (Resources.NotFoundException unused) {
            }
        }
    }
}
