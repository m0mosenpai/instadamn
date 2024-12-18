package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.E2o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31960E2o extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final IgView A02;
    public final IgImageView A03;

    public C31960E2o(View view) {
        super(view);
        this.A03 = AbstractC167007dF.A0T(view, R.id.row_image);
        this.A01 = AbstractC31178DnM.A0C(view);
        this.A00 = AbstractC167007dF.A0N(view, R.id.subtitle);
        this.A02 = (IgView) AbstractC166997dE.A0R(view, R.id.thread_state_indicator);
    }
}
