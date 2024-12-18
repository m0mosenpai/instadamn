package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: X.0dw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09470dw {
    public static final void A00(final String str, final boolean z) {
        if (C14360o3.A0K(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            final Handler handler = AbstractC09490dy.A02;
            handler.post(new Runnable(handler, str, z) { // from class: X.0dx
                public long A00;
                public int A01;
                public final long A02;
                public final Handler A03;
                public final String A04;
                public final boolean A05;

                {
                    C14360o3.A0B(handler, 2);
                    this.A04 = str;
                    this.A03 = handler;
                    this.A05 = z;
                    this.A02 = SystemClock.elapsedRealtime();
                    AbstractC09490dy.A00++;
                }

                /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
                
                    if (r1.equals(com.facebook.perf.background.BackgroundStartupDetector.A0G) == false) goto L17;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 376
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC09480dx.run():void");
                }
            });
        }
    }
}
