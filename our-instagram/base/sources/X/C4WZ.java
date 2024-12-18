package X;

import android.media.metrics.LogSessionId;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* renamed from: X.4WZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WZ {
    public static final C4WZ A03;
    public final String A00;
    public final C4YD A01;
    public final Object A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4WZ)) {
            return false;
        }
        C4WZ c4wz = (C4WZ) obj;
        return C2I7.A00(this.A00, c4wz.A00) && C2I7.A00(this.A01, c4wz.A01) && C2I7.A00(this.A02, c4wz.A02);
    }

    static {
        C4WZ c4wz;
        if (Util.A00 < 31) {
            c4wz = new C4WZ("");
        } else {
            c4wz = new C4WZ(C4YD.A01, "");
        }
        A03 = c4wz;
    }

    public final LogSessionId A00() {
        C4YD c4yd = this.A01;
        c4yd.getClass();
        return c4yd.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, this.A02});
    }

    public C4WZ(String str) {
        C4B8.A04(Util.A00 < 31);
        this.A00 = str;
        this.A01 = null;
        this.A02 = new Object();
    }

    public C4WZ(C4YD c4yd, String str) {
        this.A01 = c4yd;
        this.A00 = str;
        this.A02 = new Object();
    }

    public C4WZ(LogSessionId logSessionId, String str) {
        this(new C4YD(logSessionId), str);
    }
}
