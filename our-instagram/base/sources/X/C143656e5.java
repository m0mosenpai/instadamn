package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6e5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143656e5 {
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public IgImageView A04;
    public final ViewStub A05;

    public C143656e5(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        this.A05 = viewStub;
    }

    public final void A00() {
        if (this.A00 == null) {
            View inflate = this.A05.inflate();
            this.A00 = inflate;
            C14360o3.A0A(inflate);
            this.A03 = (TextView) inflate.findViewById(R.id.story_interstitial_title);
            View view = this.A00;
            C14360o3.A0A(view);
            this.A02 = (TextView) view.findViewById(R.id.story_interstitial_subtitle);
            View view2 = this.A00;
            C14360o3.A0A(view2);
            this.A04 = (IgImageView) view2.findViewById(R.id.story_interstitial_center_profile);
            View view3 = this.A00;
            C14360o3.A0A(view3);
            this.A01 = (TextView) view3.findViewById(R.id.story_interstitial_cta_button);
        }
    }
}
