package X;

import android.os.Handler;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* renamed from: X.4Ri, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95484Ri {
    public final C95474Rh A00;
    public final Handler A01;
    public final HeroPlayerSetting A02;
    public final Runnable A03;
    public volatile long A04;
    public volatile long A05;

    public C95484Ri(Handler handler, C95474Rh c95474Rh, HeroPlayerSetting heroPlayerSetting) {
        C14360o3.A0B(handler, 2);
        this.A02 = heroPlayerSetting;
        this.A01 = handler;
        this.A00 = c95474Rh;
        this.A05 = -1L;
        this.A04 = -1L;
        this.A03 = new Runnable() { // from class: X.4Rj
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
            
                if ((r4 - r6.A05) <= 1000) goto L10;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r9 = this;
                    X.4Ri r6 = X.C95484Ri.this
                    long r4 = android.os.SystemClock.elapsedRealtime()
                    monitor-enter(r6)
                    long r7 = r6.A04     // Catch: java.lang.Throwable -> L3f
                    r1 = -1
                    int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                    if (r0 == 0) goto L22
                    long r7 = r6.A04     // Catch: java.lang.Throwable -> L3f
                    long r1 = r4 - r7
                    r7 = 1000(0x3e8, double:4.94E-321)
                    int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                    if (r0 <= 0) goto L22
                    long r0 = r6.A05     // Catch: java.lang.Throwable -> L3f
                    long r2 = r4 - r0
                    int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                    r0 = 1
                    if (r1 > 0) goto L23
                L22:
                    r0 = 0
                L23:
                    monitor-exit(r6)
                    if (r0 == 0) goto L3e
                    java.lang.String r3 = "BackscreenDetector"
                    java.lang.String r2 = "detected blackscreen. Last frame ms: "
                    long r0 = r6.A05
                    long r4 = r4 - r0
                    java.lang.String r0 = X.AnonymousClass001.A0Q(r2, r4)
                    android.util.Log.w(r3, r0)
                    X.4Rh r0 = r6.A00
                    X.4RP r0 = r0.A00
                    java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0M
                    r0 = 1
                    r1.set(r0)
                L3e:
                    return
                L3f:
                    r0 = move-exception
                    monitor-exit(r6)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC95494Rj.run():void");
            }
        };
    }
}
