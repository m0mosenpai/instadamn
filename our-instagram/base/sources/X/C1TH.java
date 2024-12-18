package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.1TH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1TH extends C0R8 {
    public final Context A00;
    public final Handler A01;
    public final AtomicInteger A02;
    public final AtomicInteger A03;
    public final boolean A04;

    @Override // X.InterfaceC05710Rv
    public final String getName() {
        return "AsyncAudioService";
    }

    @Override // X.InterfaceC05710Rv
    public final void CNZ() {
        if (this.A04) {
            try {
                Context context = this.A00;
                AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                if (audioManager != null) {
                    context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, new C50738Mas(audioManager, this.A01));
                    C0HU.A03(new QFY(this));
                    C0HU.A02(context, MediaStreamTrack.AUDIO_TRACK_KIND);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(36314103113124309L)) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1TH(X.C0Rw r3) {
        /*
            r2 = this;
            r2.<init>(r3)
            r1 = -1
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r2.A03 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r2.A02 = r0
            r0 = r3
            X.0RK r0 = (X.C0RK) r0
            android.content.Context r0 = r0.A01
            r2.A00 = r0
            android.os.Handler r0 = r3.Aex()
            r2.A01 = r0
            java.lang.Class<X.0hA> r0 = X.C10420hA.class
            X.0Rw r0 = r2.A05(r0)
            if (r0 == 0) goto L37
            r0 = 36314103113124309(0x81037c006509d5, double:3.0285232616716464E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r1 = X.C20150ym.A07(r0)
            r0 = 1
            if (r1 != 0) goto L38
        L37:
            r0 = 0
        L38:
            r2.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1TH.<init>(X.0Rw):void");
    }
}
