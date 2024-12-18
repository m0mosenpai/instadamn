package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes7.dex */
public final class IJ1 {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;
    public final InterfaceC09390do A04;

    public IJ1(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A03 = AbstractC167007dF.A0T(view, R.id.pbia_proxy_profile_header_imageview);
        this.A02 = AbstractC167007dF.A0N(view, R.id.pbia_scoreboard_name_textview);
        this.A01 = AbstractC167007dF.A0N(view, R.id.pbia_follower_count_textview);
        this.A04 = AbstractC09440dt.A01(new DGZ(this, 4));
    }
}
