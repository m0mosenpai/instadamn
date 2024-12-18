package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.CrX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29044CrX implements C2YT {
    public final CharSequence A00;
    public final CharSequence A01;
    public final CharSequence A02;
    public final boolean A03;

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        View inflate = LayoutInflater.from(c2yr.A00.A04).inflate(R.layout.feedback_from_facebook_comments_list_row, (ViewGroup) null);
        View requireViewById = inflate.requireViewById(R.id.image_view);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) requireViewById;
        int i = 0;
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        C14360o3.A07(requireViewById);
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.primary_text);
        View A0R = AbstractC166997dE.A0R(inflate, R.id.image_view_end_space);
        TextView A0N2 = AbstractC167007dF.A0N(inflate, R.id.secondary_text);
        TextView A0N3 = AbstractC167007dF.A0N(inflate, R.id.disclosure_text);
        boolean z = this.A03;
        gradientSpinnerAvatarView.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        if (!z) {
            i = 8;
        }
        A0R.setVisibility(i);
        A0N.setText(this.A01);
        CharSequence charSequence = this.A02;
        if (charSequence != null) {
            A0N2.setText(charSequence);
        } else {
            A0N2.setVisibility(8);
        }
        CharSequence charSequence2 = this.A00;
        if (charSequence2 != null) {
            A0N3.setText(charSequence2);
        } else {
            A0N3.setVisibility(8);
        }
        return AbstractC25234BEr.A0R(inflate, j);
    }

    public C29044CrX(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z) {
        this.A01 = charSequence;
        this.A02 = charSequence2;
        this.A00 = charSequence3;
        this.A03 = z;
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
