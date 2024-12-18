package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.CrQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29037CrQ implements C2YT {
    public final CharSequence A00;
    public final CharSequence A01;

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        View inflate = LayoutInflater.from(c2yr.A00.A04).inflate(R.layout.feedback_from_facebook_comments_list_row, (ViewGroup) null);
        View requireViewById = inflate.requireViewById(R.id.image_view);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) requireViewById;
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        C14360o3.A07(requireViewById);
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.primary_text);
        View A0R = AbstractC166997dE.A0R(inflate, R.id.image_view_end_space);
        TextView A0N2 = AbstractC167007dF.A0N(inflate, R.id.secondary_text);
        View A0S = AbstractC166997dE.A0S(inflate, R.id.disclosure_text);
        gradientSpinnerAvatarView.setVisibility(0);
        A0R.setVisibility(0);
        A0N.setText(this.A00);
        A0N2.setText(this.A01);
        A0S.setVisibility(8);
        return AbstractC25234BEr.A0R(inflate, j);
    }

    public C29037CrQ(CharSequence charSequence, CharSequence charSequence2) {
        this.A00 = charSequence;
        this.A01 = charSequence2;
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
