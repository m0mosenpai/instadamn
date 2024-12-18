package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.IJa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41135IJa {
    public final ViewStub A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgProgressImageView A04;
    public final InterfaceC09390do A05;

    public C41135IJa(View view) {
        C14360o3.A0B(view, 1);
        this.A04 = (IgProgressImageView) AbstractC166997dE.A0R(view, R.id.preview_image);
        this.A03 = AbstractC31176DnK.A0U(view, R.id.feed_preview_profile_picture);
        this.A02 = AbstractC167007dF.A0N(view, R.id.feed_preview_username);
        this.A01 = AbstractC167007dF.A0N(view, R.id.feed_preview_subtitle);
        this.A00 = AbstractC167007dF.A0M(view, R.id.feed_preview_icon_view_stub);
        this.A05 = AbstractC09440dt.A01(new C50152MDf(this, 42));
    }
}
