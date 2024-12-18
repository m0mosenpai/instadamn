package X;

import android.os.Process;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.TraceDirect;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0bU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08080bU extends AbstractC208410g {
    @Override // X.C0Xc
    public final String getName() {
        return "systrace";
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerAnnotate(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        if (Systrace.A0E(4L)) {
            long BLl = c0xx.BLl();
            int markerId = c0xx.getMarkerId();
            int CCe = c0xx.CCe();
            String BLJ = c0xx.BLJ();
            C14360o3.A07(BLJ);
            String BLK = c0xx.BLK();
            long nanos = TimeUnit.MILLISECONDS.toNanos(BLl);
            Systrace.A0B(String.valueOf(markerId), AnonymousClass001.A0u("<ANNOTATION>=", BLJ, "->", BLK), markerId ^ (CCe * 179426549), 274877906944L, nanos);
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerDrop(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        if (Systrace.A0E(4L)) {
            int markerId = c0xx.getMarkerId();
            int CCe = c0xx.CCe();
            String valueOf = String.valueOf(markerId);
            int i = markerId ^ (CCe * 179426549);
            if (Systrace.A0E(4L)) {
                if (TraceDirect.checkNative()) {
                    TraceDirect.nativeAsyncTraceCancel(valueOf, i);
                    return;
                }
                FileOutputStream fileOutputStream = C0f1.A00;
                C0f0 c0f0 = new C0f0('F');
                c0f0.A00(Process.myPid());
                c0f0.A02(valueOf);
                c0f0.A01("<X>");
                c0f0.A00(i);
                C0f1.A00(c0f0.toString());
            }
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerPoint(C0XX c0xx, String str, C0XJ c0xj, long j, long j2, boolean z, int i) {
        C14360o3.A0B(c0xx, 0);
        C14360o3.A0B(str, 1);
        if (Systrace.A0E(4L)) {
            int markerId = c0xx.getMarkerId();
            int CCe = c0xx.CCe();
            String valueOf = String.valueOf(markerId);
            int i2 = markerId ^ (CCe * 179426549);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Systrace.A0B(valueOf, str, i2, 4L, timeUnit.toNanos(j));
            if (c0xj != null) {
                long nanos = timeUnit.toNanos(j);
                String obj = c0xj.toString();
                C14360o3.A07(obj);
                Systrace.A0B(valueOf, AnonymousClass001.A0R("<PDATA>=", obj), i2, 274877906944L, nanos);
            }
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerRestart(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        onMarkerStart(c0xx);
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerStart(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        if (Systrace.A0E(4L)) {
            int markerId = c0xx.getMarkerId();
            int CCe = c0xx.CCe();
            long BUq = c0xx.BUq();
            String valueOf = String.valueOf(markerId);
            int i = markerId ^ (CCe * 179426549);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Systrace.A09(valueOf, i, 4L, timeUnit.toNanos(BUq));
            List C53 = c0xx.C53();
            C14360o3.A07(C53);
            if (!C53.isEmpty()) {
                String A0P = AbstractC001800i.A0P(", ", "", "", C53, null);
                Systrace.A0B(valueOf, AnonymousClass001.A0R("<TAG>=", A0P), i, 274877906944L, timeUnit.toNanos(BUq));
            }
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final void onMarkerStop(C0XX c0xx) {
        C14360o3.A0B(c0xx, 0);
        if (Systrace.A0E(4L)) {
            short BLD = c0xx.BLD();
            long BLl = c0xx.BLl();
            int markerId = c0xx.getMarkerId();
            int CCe = c0xx.CCe();
            String valueOf = String.valueOf(markerId);
            int i = markerId ^ (CCe * 179426549);
            Systrace.A0A(valueOf, i, 4L, TimeUnit.MILLISECONDS.toNanos(BLl));
            Systrace.A00(i, valueOf, AnonymousClass001.A01('-', markerId, BLD));
        }
    }

    @Override // X.C0Xc
    public final C06650Xb getListenerMarkers() {
        C06650Xb c06650Xb;
        if (Systrace.A0E(4L)) {
            c06650Xb = C06650Xb.A01;
        } else {
            c06650Xb = C06650Xb.A03;
        }
        C14360o3.A09(c06650Xb);
        return c06650Xb;
    }
}
