package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.GwC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38491GwC extends C3OO {
    public final View A00;
    public final TextView A01;
    public final IgImageButton A02;
    public final IgImageButton A03;
    public final IgImageButton A04;
    public final TextView A05;

    public C38491GwC(View view) {
        super(view);
        this.A00 = AbstractC166997dE.A0S(view, R.id.title_container);
        TextView A0C = AbstractC31178DnM.A0C(view);
        this.A01 = A0C;
        TextView A0N = AbstractC167007dF.A0N(view, R.id.see_all);
        this.A05 = A0N;
        this.A03 = (IgImageButton) AbstractC166997dE.A0R(view, R.id.media_left);
        this.A02 = (IgImageButton) AbstractC166997dE.A0R(view, R.id.media_center);
        this.A04 = (IgImageButton) AbstractC166997dE.A0R(view, R.id.media_right);
        A0C.setFocusable(true);
        A0N.setFocusable(true);
    }
}
