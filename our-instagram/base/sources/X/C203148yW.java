package X;

import java.util.Arrays;

/* renamed from: X.8yW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203148yW {
    public final AbstractC200848uR A00;
    public final C203128yU A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C203148yW)) {
            return false;
        }
        C203148yW c203148yW = (C203148yW) obj;
        if (this.A01 != c203148yW.A01 || this.A00 != c203148yW.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A01, this.A00});
    }

    public C203148yW(AbstractC200848uR abstractC200848uR, C203128yU c203128yU) {
        this.A01 = c203128yU;
        this.A00 = abstractC200848uR;
    }
}
