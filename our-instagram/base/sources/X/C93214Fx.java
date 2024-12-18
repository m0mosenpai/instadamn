package X;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.4Fx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C93214Fx extends C93224Fy {
    public final C4C7 A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C93214Fx(X.C4C7 r2, java.io.IOException r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r4 != r0) goto L9
            r0 = 1
            if (r5 != r0) goto L9
            r4 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r4, r3)
            r1.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93214Fx.<init>(X.4C7, java.io.IOException, int, int):void");
    }

    public static C93214Fx A00(C4C7 c4c7, IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            if (message != null && C4B2.A00(message).matches(AbstractC58317Pt9.A00(716))) {
                return new C93214Fx(c4c7, iOException, AbstractC58317Pt9.A00(536), 2007);
            }
            i2 = 2001;
        }
        return new C93214Fx(c4c7, iOException, i2, i);
    }

    @Deprecated
    public C93214Fx(C4C7 c4c7, String str, int i) {
        this(c4c7, str, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, i);
    }

    public C93214Fx(C4C7 c4c7) {
        this.A00 = c4c7;
    }

    public C93214Fx(C4C7 c4c7, IOException iOException, String str, int i) {
        super(str, iOException, i);
        this.A00 = c4c7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C93214Fx(X.C4C7 r2, java.lang.String r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r4 != r0) goto L9
            r0 = 1
            if (r5 != r0) goto L9
            r4 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r3, r4)
            r1.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93214Fx.<init>(X.4C7, java.lang.String, int, int):void");
    }
}
