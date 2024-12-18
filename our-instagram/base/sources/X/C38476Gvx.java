package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Gvx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38476Gvx extends C3OO {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38476Gvx(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = view;
        TextView A0N = AbstractC167007dF.A0N(view, R.id.account_section_title);
        this.A02 = A0N;
        AbstractC37300Gc1.A0d(A0N, true);
        this.A01 = AbstractC166987dD.A0e(view, R.id.account_section_subtitle);
        this.A03 = (CircularImageView) view.findViewById(R.id.account_section_avatar);
        AbstractC166997dE.A0S(view, R.id.account_section_arrow).setVisibility(0);
    }
}
