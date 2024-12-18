package X;

import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastLiveTraceConfig;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.OoB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55686OoB implements LiveStreamingClient.LiveStreamingSessionCallbacks {
    public final /* synthetic */ C55692OoJ A00;

    public C55686OoB(C55692OoJ c55692OoJ) {
        this.A00 = c55692OoJ;
    }

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient.LiveStreamingSessionCallbacks
    public final void onError(int i, String str, String str2, String str3, String str4) {
        AbstractC25234BEr.A1P(str, str2, str4);
        C55692OoJ c55692OoJ = this.A00;
        if (!c55692OoJ.A03) {
            LiveStreamingError liveStreamingError = new LiveStreamingError(i, "StreamingSdkLiveStreamer", str2, str, str4, false, false, false);
            if (c55692OoJ.A01 != null) {
                O6D o6d = c55692OoJ.A0E;
                C0K8.A05(PJG.class, "onStreamFailed", liveStreamingError.A00);
                PJG pjg = o6d.A00;
                AbstractC70118W4q abstractC70118W4q = pjg.A02;
                if (abstractC70118W4q != null) {
                    AbstractC70118W4q.A01(abstractC70118W4q, new C53404Njt(BroadcastFailureType.A03, "StartLiveStream", "Failed to start live stream"));
                    pjg.A02 = null;
                }
                InterfaceC58089PpE interfaceC58089PpE = pjg.A0G;
                BroadcastFailureType broadcastFailureType = BroadcastFailureType.A03;
                String str5 = liveStreamingError.domain;
                if (str5 == null) {
                    str5 = "";
                }
                interfaceC58089PpE.D0P(new C53404Njt(broadcastFailureType, str5, liveStreamingError.fullDescription), pjg);
            }
        }
    }

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient.LiveStreamingSessionCallbacks
    public final void onInitialized() {
        PJG pjg = this.A00.A0E.A00;
        pjg.A0E.A0F("onStreamInitialized");
        pjg.A07 = C05F.A01;
    }

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient.LiveStreamingSessionCallbacks
    public final void onPaused() {
        C55692OoJ c55692OoJ = this.A00;
        ODU odu = c55692OoJ.A0D;
        boolean z = odu.A02;
        long j = odu.A00;
        if (z) {
            j += odu.A03.now() - odu.A01;
        }
        odu.A00 = j;
        odu.A02 = false;
        PJG pjg = c55692OoJ.A0E.A00;
        pjg.A0E.A0F("onStreamPaused");
        pjg.A0I.A00();
        pjg.A07 = C05F.A0N;
        C11T.A02(new RunnableC56955POw(pjg));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient.LiveStreamingSessionCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReleased() {
        /*
            r5 = this;
            X.OoJ r0 = r5.A00
            X.O6D r0 = r0.A0E
            X.PJG r4 = r0.A00
            X.OoJ r2 = r4.A0H
            com.facebook.mediastreaming.bundledservices.LiveStreamSessionProbe r0 = r2.A00
            if (r0 == 0) goto L6a
            int r1 = r0.getMuxState()
            r0 = 1
            if (r1 == r0) goto L67
            r0 = 2
            if (r1 == r0) goto L64
            r0 = 3
            if (r1 == r0) goto L61
            r0 = 4
            if (r1 != r0) goto L6a
            java.lang.Integer r1 = X.C05F.A0Y
        L1e:
            r4.A05 = r1
            java.lang.Integer r0 = X.C05F.A0C
            r3 = 0
            if (r1 == r0) goto L56
            java.lang.Integer r0 = X.C05F.A0Y
            if (r1 == r0) goto L56
            r0 = r3
        L2a:
            r4.A04 = r0
            X.PIw r2 = r4.A0E
            if (r0 != 0) goto L4a
            java.lang.String r1 = "dvr:missing"
        L32:
            java.lang.String r0 = "onStreamFinished"
            r2.A0H(r0, r1)
            X.W4q r2 = r4.A01
            java.io.File r1 = r4.A04
            X.O68 r0 = new X.O68
            r0.<init>(r1)
            X.AbstractC70118W4q.A02(r2, r0)
            r4.A01 = r3
            java.lang.Integer r0 = X.C05F.A0j
            r4.A07 = r0
            return
        L4a:
            java.lang.Integer r1 = r4.A05
            java.lang.Integer r0 = X.C05F.A0Y
            if (r1 != r0) goto L53
            java.lang.String r1 = "dvr:ok"
            goto L32
        L53:
            java.lang.String r1 = "dvr:full"
            goto L32
        L56:
            com.facebook.mediastreaming.bundledservices.LiveStreamSessionProbe r0 = r2.A00
            if (r0 == 0) goto L5f
            java.io.File r0 = r0.getDvrOutputFile()
            goto L2a
        L5f:
            r0 = 0
            goto L2a
        L61:
            java.lang.Integer r1 = X.C05F.A0N
            goto L1e
        L64:
            java.lang.Integer r1 = X.C05F.A0C
            goto L1e
        L67:
            java.lang.Integer r1 = X.C05F.A01
            goto L1e
        L6a:
            java.lang.Integer r1 = X.C05F.A00
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55686OoB.onReleased():void");
    }

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient.LiveStreamingSessionCallbacks
    public final void onResumed() {
        C55692OoJ c55692OoJ = this.A00;
        ODU odu = c55692OoJ.A0D;
        if (!odu.A02) {
            odu.A02 = true;
            odu.A01 = odu.A03.now();
        }
        PJG pjg = c55692OoJ.A0E.A00;
        pjg.A0E.A0F("onStreamResumed");
        OJX ojx = pjg.A0I;
        if (!ojx.A02) {
            ojx.A02 = true;
            ojx.A05.A0B.post(ojx.A04);
        }
        PJG.A00(pjg);
        pjg.A07 = C05F.A0C;
    }

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient.LiveStreamingSessionCallbacks
    public final void onStarted() {
        C55692OoJ c55692OoJ = this.A00;
        ODU odu = c55692OoJ.A0D;
        if (!odu.A02) {
            odu.A02 = true;
            odu.A01 = odu.A03.now();
        }
        PJG pjg = c55692OoJ.A0E.A00;
        pjg.A0E.A0F("onStreamStarted");
        VideoBroadcastLiveTraceConfig videoBroadcastLiveTraceConfig = pjg.A0C.liveTraceConfig;
        if (videoBroadcastLiveTraceConfig != null && videoBroadcastLiveTraceConfig.enabled) {
            pjg.A0F.A02(pjg.A0J);
        }
        OJX ojx = pjg.A0I;
        if (!ojx.A02) {
            ojx.A02 = true;
            ojx.A05.A0B.post(ojx.A04);
        }
        PJG.A00(pjg);
        pjg.A07 = C05F.A0C;
    }

    @Override // com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient.LiveStreamingSessionCallbacks
    public final void onStopped() {
        C55692OoJ c55692OoJ = this.A00;
        ODU odu = c55692OoJ.A0D;
        boolean z = odu.A02;
        long j = odu.A00;
        if (z) {
            j += odu.A03.now() - odu.A01;
        }
        odu.A00 = j;
        odu.A02 = false;
        PJG pjg = c55692OoJ.A0E.A00;
        pjg.A0E.A0F("onStreamStopped");
        VideoBroadcastLiveTraceConfig videoBroadcastLiveTraceConfig = pjg.A0C.liveTraceConfig;
        if (videoBroadcastLiveTraceConfig != null && videoBroadcastLiveTraceConfig.enabled) {
            pjg.A0F.A01(pjg.A0J);
        }
        pjg.A0I.A00();
        pjg.A07 = C05F.A0Y;
    }
}
