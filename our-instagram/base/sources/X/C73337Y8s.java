package X;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.os.SystemClock;
import java.util.HashMap;

/* renamed from: X.Y8s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73337Y8s implements YPX, YOf {
    public int A00;
    public final int A03;
    public PlaybackMetrics.Builder A04;
    public AbstractC72452Xdw A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public int A09;
    public int A0A;
    public String A0B;
    public final Context A0D;
    public final PlaybackSession A0E;
    public final YNJ A0G;
    public final C62960SZd A0H = new C62960SZd();
    public final C72843Xop A0F = new C72843Xop();
    public final HashMap A0I = AbstractC166987dD.A1G();
    public final HashMap A0J = AbstractC166987dD.A1G();
    public final long A0C = SystemClock.elapsedRealtime();
    public int A02 = 0;
    public int A01 = 0;

    public static C73337Y8s A00(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C73337Y8s(context, mediaMetricsManager.createPlaybackSession());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r3.longValue() <= 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01() {
        /*
            r8 = this;
            android.media.metrics.PlaybackMetrics$Builder r1 = r8.A04
            r5 = 0
            if (r1 == 0) goto L60
            boolean r0 = r8.A08
            if (r0 == 0) goto L60
            int r0 = r8.A00
            r1.setAudioUnderrunCount(r0)
            android.media.metrics.PlaybackMetrics$Builder r1 = r8.A04
            int r0 = r8.A09
            r1.setVideoFramesDropped(r0)
            android.media.metrics.PlaybackMetrics$Builder r1 = r8.A04
            int r0 = r8.A0A
            r1.setVideoFramesPlayed(r0)
            java.util.HashMap r1 = r8.A0J
            java.lang.String r0 = r8.A0B
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            android.media.metrics.PlaybackMetrics$Builder r2 = r8.A04
            r6 = 0
            if (r0 != 0) goto L73
            r0 = 0
        L2e:
            r2.setNetworkTransferDurationMillis(r0)
            java.util.HashMap r1 = r8.A0I
            java.lang.String r0 = r8.A0B
            java.lang.Object r3 = r1.get(r0)
            java.lang.Number r3 = (java.lang.Number) r3
            android.media.metrics.PlaybackMetrics$Builder r2 = r8.A04
            if (r3 != 0) goto L6e
            r0 = 0
        L41:
            r2.setNetworkBytesRead(r0)
            android.media.metrics.PlaybackMetrics$Builder r4 = r8.A04
            if (r3 == 0) goto L51
            long r2 = r3.longValue()
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L52
        L51:
            r0 = 0
        L52:
            r4.setStreamSource(r0)
            android.media.metrics.PlaybackSession r1 = r8.A0E
            android.media.metrics.PlaybackMetrics$Builder r0 = r8.A04
            android.media.metrics.PlaybackMetrics r0 = r0.build()
            r1.reportPlaybackMetrics(r0)
        L60:
            r0 = 0
            r8.A04 = r0
            r8.A0B = r0
            r8.A00 = r5
            r8.A09 = r5
            r8.A0A = r5
            r8.A08 = r5
            return
        L6e:
            long r0 = r3.longValue()
            goto L41
        L73:
            long r0 = r0.longValue()
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73337Y8s.A01():void");
    }

    public final LogSessionId A02() {
        return this.A0E.getSessionId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0258, code lost:
    
        if (((android.system.ErrnoException) r1).errno != android.system.OsConstants.EACCES) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0285, code lost:
    
        if (((X.Q94) r1).A00 != 1) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01e2, code lost:
    
        if (r13 == 2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c5, code lost:
    
        if (r10.A02 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ca, code lost:
    
        r4.A03 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cd, code lost:
    
        r4.A02.Dkv(r5, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c8, code lost:
    
        if (r2 != false) goto L50;
     */
    @Override // X.YPX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DEc(X.YNE r19, X.C72703Xlb r20) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73337Y8s.DEc(X.YNE, X.Xlb):void");
    }

    @Override // X.YOf
    public final void Dkv(C72855XpB c72855XpB, String str, boolean z) {
        if (str.equals(this.A0B)) {
            A01();
        }
        this.A0J.remove(str);
        this.A0I.remove(str);
    }

    @Override // X.YPX
    public final void Dyx(C72819Xnl c72819Xnl, C72855XpB c72855XpB) {
        this.A09 = this.A09;
        this.A0A = this.A0A;
    }

    public C73337Y8s(Context context, PlaybackSession playbackSession) {
        this.A0D = context.getApplicationContext();
        this.A0E = playbackSession;
        C73338Y8t c73338Y8t = new C73338Y8t();
        this.A0G = c73338Y8t;
        c73338Y8t.A02 = this;
    }

    @Override // X.YOf
    public final void Dks(C72855XpB c72855XpB, String str) {
        A01();
        this.A0B = str;
        this.A04 = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.4.0");
    }

    @Override // X.YPX
    public final void DZH(AbstractC72452Xdw abstractC72452Xdw, C72855XpB c72855XpB) {
        this.A05 = abstractC72452Xdw;
    }

    @Override // X.YPX
    public final void Cz8(C72855XpB c72855XpB, int i, long j, long j2) {
    }
}
