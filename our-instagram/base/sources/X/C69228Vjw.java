package X;

import android.view.View;
import com.facebook.R;
import com.instagram.maps.ui.IgStaticMapView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Vjw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69228Vjw {
    public final C3YC A00;
    public final C86043sb A01;
    public final IgStaticMapView A02;
    public final MediaFrameLayout A03;

    public C69228Vjw(View view) {
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) view.requireViewById(R.id.carousel_map_media_group);
        this.A03 = mediaFrameLayout;
        mediaFrameLayout.setTag(R.id.feed_cta_extra_tappable_target, "map_view");
        this.A00 = new C3YC(view);
        this.A02 = (IgStaticMapView) view.requireViewById(R.id.carousel_map_view);
        this.A01 = new C86043sb(view.requireViewById(R.id.larger_cta_top_buffer));
    }
}
