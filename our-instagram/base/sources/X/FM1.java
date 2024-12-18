package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* loaded from: classes6.dex */
public final class FM1 {
    public final View A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final ColorFilterAlphaImageView A03;

    public FM1(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A01 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.persisted_reel_container);
        this.A03 = (ColorFilterAlphaImageView) AbstractC166997dE.A0R(view, R.id.persisted_reel_archive_icon);
        this.A02 = AbstractC167007dF.A0N(view, R.id.persisted_reel_text);
    }
}
