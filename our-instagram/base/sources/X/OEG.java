package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes9.dex */
public final class OEG {
    public View A00;
    public IgImageView A01;
    public final View A02;
    public final View A03;
    public final ViewStub A04;
    public final TextView A05;
    public final InterfaceC73023Pd A06;

    public OEG(View view) {
        C14360o3.A0B(view, 1);
        this.A06 = new C56166OwY(this, 0);
        this.A04 = AbstractC167007dF.A0M(view, R.id.acr_preview_image_stub);
        this.A02 = AbstractC166997dE.A0S(view, R.id.acr_action_button);
        this.A03 = AbstractC166997dE.A0S(view, R.id.hide_acr_button);
        this.A05 = AbstractC167007dF.A0N(view, R.id.your_auto_created_clip_subtitle);
    }
}
