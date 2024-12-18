package X;

import android.os.Process;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes10.dex */
public final class QFY extends AbstractC04410Lh {
    public final /* synthetic */ C1TH A00;

    public QFY(C1TH c1th) {
        this.A00 = c1th;
    }

    @Override // X.AbstractC04410Lh, X.C0HV
    public final void DEj(Object obj, String str, Method method, Object[] objArr, long j) {
        AtomicInteger atomicInteger;
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(str) && obj != null) {
            String name = method.getName();
            if (name.equals("getStreamVolume")) {
                atomicInteger = this.A00.A03;
            } else if (!name.equals("getStreamMaxVolume")) {
                return;
            } else {
                atomicInteger = this.A00.A02;
            }
            if (method.getParameterTypes().length == 1) {
                Class<?> cls = method.getParameterTypes()[0];
                Class<?> cls2 = Integer.TYPE;
                if (cls == cls2 && method.getReturnType() == cls2 && objArr != null && AbstractC166987dD.A0H(objArr[0]) == 3) {
                    atomicInteger.set(AbstractC166987dD.A0H(obj));
                }
            }
        }
    }

    @Override // X.AbstractC04410Lh, X.C0HV
    public final C0HW Ajg(C0HX c0hx, String str, Method method, Object[] objArr) {
        AtomicInteger atomicInteger;
        int i;
        if (Process.myPid() != Process.myTid() || !MediaStreamTrack.AUDIO_TRACK_KIND.equals(str)) {
            return null;
        }
        String name = method.getName();
        if (name.equals("getStreamVolume")) {
            atomicInteger = this.A00.A03;
        } else {
            if (!name.equals("getStreamMaxVolume")) {
                return null;
            }
            atomicInteger = this.A00.A02;
        }
        if (method.getParameterTypes().length != 1 || method.getParameterTypes()[0] != Integer.TYPE || objArr == null || AbstractC166987dD.A0H(objArr[0]) != 3 || (i = atomicInteger.get()) == -1) {
            return null;
        }
        return new C0HW(Integer.valueOf(i));
    }
}
