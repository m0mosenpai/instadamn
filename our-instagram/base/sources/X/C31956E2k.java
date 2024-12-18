package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.E2k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31956E2k extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final IgdsCheckBox A02;
    public final GradientSpinnerAvatarView A03;

    public C31956E2k(View view) {
        super(view);
        this.A03 = AbstractC31176DnK.A0f(view, R.id.row_imageview);
        this.A01 = AbstractC167007dF.A0N(view, R.id.row_title);
        this.A00 = AbstractC167007dF.A0N(view, R.id.row_subtitle);
        this.A02 = (IgdsCheckBox) AbstractC166997dE.A0R(view, R.id.checkbox);
    }
}
