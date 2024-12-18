package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* renamed from: X.4U7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4U7 {
    public final Handler A00;
    public final C4TY A01;

    public final void A00(final C4U9 c4u9) {
        this.A00.post(new Runnable() { // from class: X.4c0
            @Override // java.lang.Runnable
            public final void run() {
                C4U7 c4u7 = C4U7.this;
                C4U9 c4u92 = c4u9;
                C4TV c4tv = (C4TV) c4u7.A01;
                if (!c4tv.A08.A10.A0Q || c4u92 != C4U9.A04) {
                    c4tv.A05.A0v.Dzu(c4u92.A03, c4u92.A01, c4u92.A00);
                }
            }
        });
    }

    public final void A01(final Object obj) {
        Handler handler = this.A00;
        SystemClock.elapsedRealtime();
        handler.post(new Runnable() { // from class: X.4c2
            @Override // java.lang.Runnable
            public final void run() {
                Surface surface;
                C4U7 c4u7 = C4U7.this;
                Object obj2 = obj;
                C4TV c4tv = (C4TV) c4u7.A01;
                if (obj2 instanceof Surface) {
                    surface = (Surface) obj2;
                } else {
                    surface = null;
                }
                C95794Sn c95794Sn = c4tv.A05;
                c95794Sn.A0K = surface;
                boolean isValid = surface.isValid();
                long j = c95794Sn.A0D;
                if (j != -1 && isValid) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - j;
                    c95794Sn.A08 = elapsedRealtime;
                    C2QC.A02(c95794Sn, "blackscreen detected for %d ms", Long.valueOf(elapsedRealtime));
                    c95794Sn.A0D = -1L;
                }
                c95794Sn.A0v.onDrawnToSurface();
            }
        });
    }

    public final void A02(final String str) {
        this.A00.post(new Runnable() { // from class: X.4bY
            @Override // java.lang.Runnable
            public final void run() {
                C4U7 c4u7 = C4U7.this;
                ((C4TV) c4u7.A01).A05.A0v.D5g(str, true);
            }
        });
    }

    public C4U7(Handler handler, C4TY c4ty) {
        handler.getClass();
        this.A00 = handler;
        this.A01 = c4ty;
    }
}
