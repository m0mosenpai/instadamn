package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.L4z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47718L4z {
    public final IgFrameLayout A00;
    public final InterfaceC56392iX A01;
    public final InterfaceC56392iX A02;
    public final InterfaceC56392iX A03;
    public final InterfaceC56392iX A04;
    public final InterfaceC56392iX A05;
    public final InterfaceC56392iX A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    public C47718L4z(View view, UserSession userSession, int i) {
        IgFrameLayout igFrameLayout = (IgFrameLayout) AbstractC166997dE.A0R(view, i);
        this.A00 = igFrameLayout;
        this.A03 = AbstractC166997dE.A0X(igFrameLayout, R.id.direct_multi_media_play_icon_view_stub);
        this.A02 = AbstractC166997dE.A0X(igFrameLayout, R.id.direct_multi_media_hd_icon_view_stub);
        this.A05 = AbstractC166997dE.A0X(igFrameLayout, R.id.privacy_overlay_image_container_legacy_view_stub);
        this.A04 = AbstractC166997dE.A0X(igFrameLayout, R.id.privacy_overlay_image_container_flat_view_stub);
        this.A08 = MHU.A00(userSession, this, 14);
        this.A07 = MHU.A00(userSession, this, 13);
        this.A06 = AbstractC166997dE.A0X(igFrameLayout, R.id.privacy_overlay_stub);
        this.A01 = AbstractC166997dE.A0X(igFrameLayout, R.id.determinate_progress_overlay);
    }
}
