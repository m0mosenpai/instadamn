package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gw1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38480Gw1 extends C3OO {
    public View.OnClickListener A00;
    public final View A01;
    public final TextView A02;
    public final C3PF A03;
    public final IgImageView A04;

    public C38480Gw1(View view) {
        super(view);
        this.A01 = view;
        this.A02 = AbstractC166997dE.A0T(view, R.id.question_see_all_text);
        this.A04 = AbstractC31172DnG.A0Z(view, R.id.question_see_all_arrow);
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A04 = new C37846Gl0(this, 11);
        A0s.A07 = true;
        A0s.A0D = true;
        C3PF A00 = A0s.A00();
        this.A03 = A00;
        view.setOnTouchListener(A00);
    }
}
