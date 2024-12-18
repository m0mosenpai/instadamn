package X;

import android.os.Bundle;
import com.instagram.direct.integrity.banner.fullscreen.FullscreenBannerViewModel;

/* renamed from: X.F3e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34102F3e {
    public static final C33190Ekc A00(FullscreenBannerViewModel fullscreenBannerViewModel) {
        C33190Ekc c33190Ekc = new C33190Ekc();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("BANNER_VIEW_MODEL", fullscreenBannerViewModel);
        c33190Ekc.setArguments(A0b);
        return c33190Ekc;
    }
}
