package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgButton;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6Tx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139686Tx {
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public ConstraintLayout A05;
    public ConstraintLayout A06;
    public IgButton A07;
    public IgLinearLayout A08;
    public CircularImageView A09;
    public IgImageView A0A;
    public Long A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public final InterfaceC56392iX A0F;

    public C139686Tx(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        this.A0F = A01;
        this.A0C = "";
        this.A0D = true;
        A01.EZv(new InterfaceC69513Al() { // from class: X.6Ty
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C139686Tx c139686Tx = C139686Tx.this;
                View requireViewById = view.requireViewById(R.id.lead_gen_card_container);
                C14360o3.A0B(requireViewById, 0);
                c139686Tx.A01 = requireViewById;
                View requireViewById2 = view.requireViewById(R.id.lead_gen_card);
                C14360o3.A0B(requireViewById2, 0);
                c139686Tx.A00 = requireViewById2;
                ConstraintLayout constraintLayout = (ConstraintLayout) view.requireViewById(R.id.lead_gen_card_without_cta);
                C14360o3.A0B(constraintLayout, 0);
                c139686Tx.A05 = constraintLayout;
                IgImageView igImageView = (IgImageView) view.requireViewById(R.id.lead_gen_card_image_background);
                C14360o3.A0B(igImageView, 0);
                c139686Tx.A0A = igImageView;
                CircularImageView circularImageView = (CircularImageView) view.requireViewById(R.id.lead_gen_card_avatar_image);
                C14360o3.A0B(circularImageView, 0);
                c139686Tx.A09 = circularImageView;
                View requireViewById3 = view.requireViewById(R.id.lead_gen_card_dimmer_overlay);
                C14360o3.A0B(requireViewById3, 0);
                c139686Tx.A02 = requireViewById3;
                TextView textView = (TextView) view.requireViewById(R.id.lead_gen_card_subtitle);
                C14360o3.A0B(textView, 0);
                c139686Tx.A04 = textView;
                TextView textView2 = (TextView) view.requireViewById(R.id.lead_gen_card_subtitle_cta);
                C14360o3.A0B(textView2, 0);
                c139686Tx.A03 = textView2;
                IgLinearLayout igLinearLayout = (IgLinearLayout) view.requireViewById(R.id.lead_gen_first_question_option_list);
                C14360o3.A0B(igLinearLayout, 0);
                c139686Tx.A08 = igLinearLayout;
                IgButton igButton = (IgButton) view.requireViewById(R.id.lead_gen_card_cta_button);
                C14360o3.A0B(igButton, 0);
                c139686Tx.A07 = igButton;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view.requireViewById(R.id.lead_gen_card_cta_layout);
                C14360o3.A0B(constraintLayout2, 0);
                c139686Tx.A06 = constraintLayout2;
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

    public final IgButton A01() {
        IgButton igButton = this.A07;
        if (igButton != null) {
            return igButton;
        }
        C14360o3.A0F("ctaButtonView");
        throw C00O.createAndThrow();
    }

    public final void A02(boolean z) {
        String str;
        A01().setVisibility(0);
        ConstraintLayout constraintLayout = this.A06;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
            if (z) {
                ConstraintLayout constraintLayout2 = this.A05;
                if (constraintLayout2 != null) {
                    constraintLayout2.setBackground(A00().getContext().getDrawable(R.drawable.reel_lead_gen_card_rounded_top_corner_background));
                    return;
                }
            } else {
                if (this.A0C.length() != 0) {
                    return;
                }
                View A00 = A00();
                ConstraintLayout constraintLayout3 = this.A05;
                if (constraintLayout3 != null) {
                    ConstraintLayout constraintLayout4 = this.A06;
                    if (constraintLayout4 != null) {
                        C41715Idl.A01(A00, A01(), constraintLayout3, constraintLayout4);
                        return;
                    }
                }
            }
            str = "cardViewWithoutCta";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "ctaButtonLayout";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}