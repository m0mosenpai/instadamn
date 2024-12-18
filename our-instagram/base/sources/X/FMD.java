package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes6.dex */
public final class FMD {
    public Runnable A00;
    public final View A01;
    public final TextView A02;
    public final IgSimpleImageView A03;

    public FMD(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A02 = AbstractC167007dF.A0N(view, R.id.text_steps_completed);
        this.A03 = AbstractC31176DnK.A0T(view, R.id.new_feature_red_dot);
    }
}
