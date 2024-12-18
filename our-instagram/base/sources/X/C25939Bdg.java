package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Bdg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25939Bdg extends C3OO {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final GradientSpinnerAvatarView A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25939Bdg(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.image_view);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) requireViewById;
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        C14360o3.A07(requireViewById);
        this.A04 = gradientSpinnerAvatarView;
        this.A00 = AbstractC166997dE.A0S(view, R.id.image_view_end_space);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.primary_text);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.secondary_text);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.disclosure_text);
    }
}
