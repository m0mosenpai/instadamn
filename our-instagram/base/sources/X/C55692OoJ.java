package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.mediastreaming.bundledservices.LiveStreamSessionProbe;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.facebook.mediastreaming.opt.muxer.TempFileCreator;
import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;
import com.facebook.mediastreaming.opt.source.event.AndroidEventMessageInputSource;
import com.facebook.mediastreaming.opt.transport.TransportCallbacks;
import com.facebook.mediastreaming.opt.transport.TransportError;
import com.facebook.mediastreaming.opt.transport.TransportEvent;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import java.util.Arrays;

/* renamed from: X.OoJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55692OoJ implements TransportCallbacks {
    public LiveStreamSessionProbe A00;
    public LiveStreamingClient A01;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final Handler A06;
    public final TempFileCreator A07;
    public final AndroidAudioRecorder A08;
    public final XAnalyticsHolder A0B;
    public final O6C A0C;
    public final ODU A0D;
    public final O6D A0E;
    public final InterfaceC16820sZ A0F;
    public final boolean A0G;
    public final AndroidEventMessageInputSource A09 = new AndroidEventMessageInputSource();
    public Integer A02 = C05F.A00;
    public final YBF A0A = new YBF();

    public C55692OoJ(Context context, Handler handler, C0JO c0jo, TempFileCreator tempFileCreator, XAnalyticsHolder xAnalyticsHolder, O6C o6c, O6D o6d, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A05 = context;
        this.A0C = o6c;
        this.A07 = tempFileCreator;
        this.A0B = xAnalyticsHolder;
        this.A06 = handler;
        this.A0E = o6d;
        this.A0F = interfaceC16820sZ;
        this.A0G = z3;
        this.A08 = new AndroidAudioRecorder(c0jo, 2, i2, z, i, 5, null, z2);
        this.A0D = new ODU(c0jo, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r1 != false) goto L9;
     */
    @Override // com.facebook.mediastreaming.opt.transport.TransportCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSpeedTestResult(com.facebook.mediastreaming.opt.transport.SpeedTestStatus r15) {
        /*
            r14 = this;
            r2 = 0
            X.C14360o3.A0B(r15, r2)
            java.lang.Class<X.OoJ> r4 = X.C55692OoJ.class
            java.lang.String r1 = "onSpeedTestResult "
            com.facebook.mediastreaming.opt.transport.SpeedTestStatus$Status r0 = r15.state
            java.lang.String r0 = r0.name()
            java.lang.String r3 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r0, r2)
            r7 = 0
            r0 = 3
            X.C14360o3.A0B(r2, r0)
            java.lang.String r1 = r4.getSimpleName()
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            X.C55219Oei.A06(r1, r3, r0)
            com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient r0 = r14.A01
            if (r0 == 0) goto Lc2
            X.O6D r5 = r14.A0E
            com.facebook.mediastreaming.opt.transport.SpeedTestStatus$Status r0 = r15.state
            int r1 = r0.ordinal()
            double r2 = r15.bandwidth
            long r8 = r15.timeTaken
            boolean r6 = r15.speedTestPassesThreshold
            com.facebook.video.common.livestreaming.NetworkSpeedTest$Status[] r0 = com.facebook.video.common.livestreaming.NetworkSpeedTest.Status.values()
            r4 = r0[r1]
            r0 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r2 = r2 * r0
            com.facebook.video.common.livestreaming.NetworkSpeedTest$Status r0 = com.facebook.video.common.livestreaming.NetworkSpeedTest.Status.A04
            boolean r1 = X.AbstractC167007dF.A1X(r4, r0)
            com.facebook.video.common.livestreaming.NetworkSpeedTest$Status r0 = com.facebook.video.common.livestreaming.NetworkSpeedTest.Status.A05
            if (r4 != r0) goto L50
            if (r6 != 0) goto L53
        L50:
            r13 = 0
            if (r1 == 0) goto L54
        L53:
            r13 = 1
        L54:
            X.PJG r6 = r5.A00
            X.PIw r10 = r6.A0E
            java.lang.String r5 = r4.name()
            r0 = 2
            X.C14360o3.A0B(r5, r0)
            X.0Ad r1 = r10.A0N
            java.lang.String r0 = "ig_broadcast_waterfall"
            X.0Ai r4 = X.MSY.A0H(r1, r0)
            java.lang.String r0 = "broadcast_verification"
            X.C56805PIw.A06(r4, r10, r0)
            X.0iw r0 = r10.A0O
            X.AbstractC37301Gc2.A15(r4, r0)
            long r0 = r10.A02
            float r12 = (float) r0
            r11 = 1148846080(0x447a0000, float:1000.0)
            X.C56805PIw.A05(r4, r10, r12)
            if (r13 == 0) goto Lc3
            r0 = 1
        L7e:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "result"
            r4.A9K(r0, r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r2)
            java.lang.String r0 = "kbps"
            r4.A8I(r0, r1)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r10.A01
            long r2 = r2 - r0
            float r0 = (float) r2
            float r0 = r0 / r11
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "response_time"
            r4.A8I(r0, r1)
            java.lang.String r0 = "state"
            r4.AAP(r0, r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            java.lang.String r0 = "time_taken"
            r4.A9K(r0, r1)
            r4.Cht()
            X.Nne r1 = r6.A00
            if (r1 == 0) goto Lc0
            X.PLS r0 = new X.PLS
            r0.<init>(r1)
            X.C11T.A02(r0)
        Lc0:
            r6.A00 = r7
        Lc2:
            return
        Lc3:
            r0 = 0
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55692OoJ.onSpeedTestResult(com.facebook.mediastreaming.opt.transport.SpeedTestStatus):void");
    }

    @Override // com.facebook.mediastreaming.opt.transport.TransportCallbacks
    public final void onTransportEvent(TransportEvent transportEvent, TransportError transportError) {
        String str;
        C14360o3.A0B(transportEvent, 0);
        String name = transportEvent.name();
        if (transportError != null) {
            str = transportError.fullDescription;
        } else {
            str = null;
        }
        String A0u = AnonymousClass001.A0u("onTransportEvent ", name, ", ", str);
        Object[] copyOf = Arrays.copyOf(new Object[0], 0);
        C14360o3.A0B(copyOf, 3);
        C55219Oei.A06(C55692OoJ.class.getSimpleName(), A0u, Arrays.copyOf(copyOf, copyOf.length));
        switch (transportEvent.ordinal()) {
            case 0:
                PJG pjg = this.A0E.A00;
                pjg.A0E.A0F("onConnectionEstablished");
                C53021Nct c53021Nct = ((PJE) pjg.A0G).A01;
                if (!pjg.equals(c53021Nct.A0F)) {
                    return;
                }
                c53021Nct.A0a.A0C = true;
                if (!c53021Nct.A0Q) {
                    return;
                }
                c53021Nct.A0Q = false;
                C53021Nct.A0A(c53021Nct, C05F.A05);
                return;
            case 1:
                this.A04 = false;
                return;
            case 2:
            case 3:
            case 7:
                return;
            case 4:
                this.A04 = true;
                return;
            case 5:
                if (transportError == null) {
                    return;
                }
                LiveStreamingError liveStreamingError = new LiveStreamingError(transportError.errorCode, transportError.domain, transportError.reason, transportError.description, transportError.fullDescription, transportError.isTransient, transportError.isConnectionLost, transportError.isStreamTerminated);
                if (this.A01 == null) {
                    return;
                }
                PJG pjg2 = this.A0E.A00;
                C56805PIw c56805PIw = pjg2.A0E;
                int i = liveStreamingError.errorCode;
                String str2 = liveStreamingError.domain;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = liveStreamingError.reason;
                String str4 = liveStreamingError.description;
                String str5 = liveStreamingError.fullDescription;
                C14360o3.A0B(str3, 2);
                if (c56805PIw.A0r) {
                    C25531Mh A04 = C56805PIw.A04(c56805PIw, C05F.A06);
                    AbstractC55113ObX.A03(A04, str2, str3, str4, str5, i);
                    A04.Cht();
                }
                InterfaceC58089PpE interfaceC58089PpE = pjg2.A0G;
                String obj = liveStreamingError.toString();
                C53021Nct c53021Nct2 = ((PJE) interfaceC58089PpE).A01;
                if (!pjg2.equals(c53021Nct2.A0F)) {
                    return;
                }
                c53021Nct2.A0a.A0C = false;
                if (c53021Nct2.A0Q) {
                    return;
                }
                c53021Nct2.A0Q = true;
                C53021Nct.A03(null, c53021Nct2, C05F.A0Y, obj, true);
                return;
            case 6:
                this.A03 = true;
                if (transportError == null) {
                    return;
                }
                LiveStreamingError liveStreamingError2 = new LiveStreamingError(transportError.errorCode, transportError.domain, transportError.reason, transportError.description, transportError.fullDescription, transportError.isTransient, transportError.isConnectionLost, transportError.isStreamTerminated);
                if (this.A01 == null) {
                    return;
                }
                String str6 = "";
                PJG pjg3 = this.A0E.A00;
                InterfaceC58089PpE interfaceC58089PpE2 = pjg3.A0G;
                BroadcastFailureType broadcastFailureType = BroadcastFailureType.A03;
                String str7 = liveStreamingError2.domain;
                if (str7 != null) {
                    str6 = str7;
                }
                interfaceC58089PpE2.D0P(new C53404Njt(broadcastFailureType, str6, liveStreamingError2.fullDescription), pjg3);
                return;
            default:
                C0K8.A02(C55692OoJ.class, AnonymousClass001.A0R("Unrecognized event ", name));
                return;
        }
    }
}
