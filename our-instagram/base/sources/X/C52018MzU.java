package X;

import com.facebook.rsys.mediastats.gen.MediaStatsApi;
import com.facebook.rsys.mediastats.gen.MediaStatsListener;
import com.facebook.rsys.mediastats.gen.MediaStatsProxy;

/* renamed from: X.MzU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52018MzU extends MediaStatsProxy {
    public MediaStatsApi A00;
    public final MediaStatsListener A01 = new C52017MzT(this);
    public final C54453O4h A02;

    @Override // com.facebook.rsys.mediastats.gen.MediaStatsProxy
    public final void setApi(MediaStatsApi mediaStatsApi) {
        C14360o3.A0B(mediaStatsApi, 0);
        this.A00 = mediaStatsApi;
        mediaStatsApi.registerListener(this.A01);
    }

    public C52018MzU(C54453O4h c54453O4h) {
        this.A02 = c54453O4h;
    }
}
