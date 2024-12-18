package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class L7Z {
    public ViewGroup A00;
    public TextView A01;
    public IgImageView A02;
    public final ViewStub A03;

    public L7Z(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        this.A03 = viewStub;
    }

    public final void A00() {
        if (this.A00 == null) {
            View inflate = this.A03.inflate();
            AbstractC43592JPx.A1T(inflate);
            ViewGroup viewGroup = (ViewGroup) inflate;
            this.A02 = AbstractC31172DnG.A0Z(viewGroup, R.id.reel_app_attribution_icon);
            this.A01 = AbstractC166997dE.A0T(viewGroup, R.id.reel_app_attribution_action_text);
            this.A00 = viewGroup;
        }
    }
}
