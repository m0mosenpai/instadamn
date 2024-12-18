package X;

import android.media.metrics.LogSessionId;
import androidx.media3.common.util.Util;
import java.util.Arrays;

/* renamed from: X.Y4i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73316Y4i {
    public static final C73316Y4i A02;
    public final C73291Xze A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C73316Y4i)) {
            return false;
        }
        C73316Y4i c73316Y4i = (C73316Y4i) obj;
        return C2I7.A00(this.A00, c73316Y4i.A00) && C2I7.A00(this.A01, c73316Y4i.A01);
    }

    static {
        C73316Y4i c73316Y4i;
        if (Util.A01 < 31) {
            c73316Y4i = new C73316Y4i();
        } else {
            c73316Y4i = new C73316Y4i(C73291Xze.A01);
        }
        A02 = c73316Y4i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{"", this.A00, this.A01});
    }

    public C73316Y4i(C73291Xze c73291Xze) {
        this.A00 = c73291Xze;
        this.A01 = AbstractC58318PtA.A0b();
    }

    public C73316Y4i(LogSessionId logSessionId) {
        this(new C73291Xze(logSessionId));
    }

    public C73316Y4i() {
        WDn.A02(Util.A01 < 31);
        this.A00 = null;
        this.A01 = AbstractC58318PtA.A0b();
    }
}
