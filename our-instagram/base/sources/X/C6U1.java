package X;

import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.6U1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6U1 {
    public View A00;
    public View A01;
    public ConstraintLayout A02;
    public ConstraintLayout A03;
    public IgTextView A04;
    public CircularImageView A05;
    public IgFormField A06;
    public IgFormField A07;
    public final InterfaceC56392iX A08;

    public C6U1(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        this.A08 = A01;
        A01.EZv(new InterfaceC69513Al() { // from class: X.6U2
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C6U1 c6u1 = C6U1.this;
                View requireViewById = view.requireViewById(R.id.lead_gen_card_container_with_contact_info_question);
                C14360o3.A0B(requireViewById, 0);
                c6u1.A00 = requireViewById;
                c6u1.A02 = (ConstraintLayout) view.requireViewById(R.id.lead_gen_card_with_contact_info_question_without_cta);
                View requireViewById2 = view.requireViewById(R.id.lead_gen_card_with_contact_info_question_dimmer_overlay);
                C14360o3.A0B(requireViewById2, 0);
                c6u1.A01 = requireViewById2;
                CircularImageView circularImageView = (CircularImageView) view.requireViewById(R.id.lead_gen_card_with_contact_info_question_avatar_image);
                C14360o3.A0B(circularImageView, 0);
                c6u1.A05 = circularImageView;
                IgFormField igFormField = (IgFormField) view.requireViewById(R.id.lead_gen_card_with_contact_info_question_name);
                C14360o3.A0B(igFormField, 0);
                c6u1.A07 = igFormField;
                IgFormField igFormField2 = (IgFormField) view.requireViewById(R.id.lead_gen_card_with_contact_info_question_email);
                C14360o3.A0B(igFormField2, 0);
                c6u1.A06 = igFormField2;
                ConstraintLayout constraintLayout = (ConstraintLayout) view.requireViewById(R.id.lead_gen_card_with_contact_info_question_cta_layout);
                C14360o3.A0B(constraintLayout, 0);
                c6u1.A03 = constraintLayout;
                IgTextView igTextView = (IgTextView) view.requireViewById(R.id.lead_gen_card_with_contact_info_question_cta_button);
                C14360o3.A0B(igTextView, 0);
                c6u1.A04 = igTextView;
            }
        });
    }
}
