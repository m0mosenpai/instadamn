package X;

import android.media.projection.MediaProjection;

/* loaded from: classes9.dex */
public final class Mb9 extends MediaProjection.Callback {
    public final /* synthetic */ C55074OaU A00;

    public Mb9(C55074OaU c55074OaU) {
        this.A00 = c55074OaU;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        this.A00.A02();
    }
}
