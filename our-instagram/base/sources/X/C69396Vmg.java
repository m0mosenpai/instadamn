package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.touch.TouchOverlayView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Vmg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69396Vmg {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final TouchOverlayView A03;
    public final IgImageView A04;
    public final InterfaceC56392iX A05;
    public final MediaFrameLayout A06;

    public C69396Vmg(View view) {
        this.A02 = view;
        this.A00 = AbstractC166997dE.A0L(view);
        this.A04 = AbstractC37302Gc3.A0K(view, R.id.image);
        this.A06 = (MediaFrameLayout) AbstractC166987dD.A0c(view, R.id.video_container);
        this.A01 = AbstractC166987dD.A0c(view, R.id.tint);
        this.A05 = AbstractC56372iV.A00(view.findViewById(R.id.eye_off_overlay));
        this.A03 = (TouchOverlayView) AbstractC166987dD.A0c(view, R.id.touch_overlay);
    }
}
