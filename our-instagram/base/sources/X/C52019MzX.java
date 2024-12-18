package X;

import com.facebook.rsys.mediasync.gen.InitialMediaSyncInfo;
import com.facebook.rsys.mediasync.gen.MediaSyncApi;
import com.facebook.rsys.mediasync.gen.MediaSyncProxy;

/* renamed from: X.MzX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52019MzX extends MediaSyncProxy {
    public MediaSyncApi A00;

    @Override // com.facebook.rsys.mediasync.gen.MediaSyncProxy
    public final InitialMediaSyncInfo getInitialMediaSyncInfo() {
        return null;
    }

    @Override // com.facebook.rsys.mediasync.gen.MediaSyncProxy
    public final void setApi(MediaSyncApi mediaSyncApi) {
        C14360o3.A0B(mediaSyncApi, 0);
        this.A00 = mediaSyncApi;
    }
}
