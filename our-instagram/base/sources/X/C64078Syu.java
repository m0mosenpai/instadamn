package X;

import android.content.IntentFilter;
import android.os.Handler;
import com.facebook.common.networkreachability.NetworkState;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;

/* renamed from: X.Syu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64078Syu implements LiveStreamingClient.LiveStreamingSessionCallbacks {
    public LiveStreamingClient.LiveStreamingSessionCallbacks A00;
    public final C62686SMa A01;
    public final Handler A02;

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient.LiveStreamingSessionCallbacks
    public final void onError(int i, String str, String str2, String str3, String str4) {
        AbstractC167027dH.A13(str, str2, str3);
        C14360o3.A0B(str4, 4);
        this.A02.post(new TRH(this, str, str2, str3, str4, i));
    }

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient.LiveStreamingSessionCallbacks
    public final void onInitialized() {
        this.A02.post(new TK0(this));
    }

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient.LiveStreamingSessionCallbacks
    public final void onPaused() {
        this.A02.post(new TK1(this));
    }

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient.LiveStreamingSessionCallbacks
    public final void onReleased() {
        this.A02.post(new TK2(this));
    }

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient.LiveStreamingSessionCallbacks
    public final void onResumed() {
        this.A02.post(new TK3(this));
    }

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient.LiveStreamingSessionCallbacks
    public final void onStarted() {
        this.A02.post(new TK4(this));
    }

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient.LiveStreamingSessionCallbacks
    public final void onStopped() {
        this.A02.post(new TK5(this));
    }

    public C64078Syu(Handler handler, LiveStreamingClient.LiveStreamingSessionCallbacks liveStreamingSessionCallbacks, C62686SMa c62686SMa) {
        this.A00 = liveStreamingSessionCallbacks;
        this.A02 = handler;
        this.A01 = c62686SMa;
        if (c62686SMa != null) {
            C0DJ.A00(c62686SMa.A01, c62686SMa.A02, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            NetworkState A00 = c62686SMa.A00();
            NetworkState networkState = c62686SMa.A00;
            if (A00 != networkState) {
                c62686SMa.A03.networkStateChanged(A00.A00, networkState.A00);
                c62686SMa.A00 = A00;
                return;
            }
            return;
        }
        C0K8.A0D("LiveStreamingClientImpl", "Network Reachability Listener is null");
    }
}
