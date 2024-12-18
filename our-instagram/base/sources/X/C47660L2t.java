package X;

import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.L2t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47660L2t {
    public String A00;
    public final FrameLayout A01;
    public final ConstrainedImageView A02;
    public final ConstrainedImageView A03;

    public C47660L2t(FrameLayout frameLayout, String str) {
        C14360o3.A0B(str, 2);
        this.A01 = frameLayout;
        this.A00 = str;
        this.A02 = (ConstrainedImageView) AbstractC166987dD.A0c(frameLayout, R.id.image);
        this.A03 = (ConstrainedImageView) AbstractC166987dD.A0c(frameLayout, R.id.overlay);
    }
}
