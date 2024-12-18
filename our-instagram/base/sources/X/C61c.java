package X;

import java.util.Arrays;

/* renamed from: X.61c, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C61c {
    public final C61W A00;
    public final int A01;
    public final C61X A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof C61c) {
                    C61c c61c = (C61c) obj;
                    if (!SSI.A01(this.A00, c61c.A00) || !SSI.A01(this.A02, c61c.A02) || !SSI.A01(this.A03, c61c.A03)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01;
    }

    public C61c(C61X c61x, C61W c61w, String str) {
        this.A00 = c61w;
        this.A02 = c61x;
        this.A03 = str;
        this.A01 = Arrays.hashCode(new Object[]{c61w, c61x, str});
    }
}
