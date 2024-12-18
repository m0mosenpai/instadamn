package X;

import java.util.List;

/* renamed from: X.8sR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199758sR {
    public final int A00;
    public final int A01;

    public static List A00(C47Z c47z, int i, int i2) {
        return AEF.A00(new C199758sR(i, i2), c47z.A2k, c47z.A4a, c47z.A69);
    }

    public final boolean equals(Object obj) {
        C199758sR c199758sR;
        if (obj == null || !(obj instanceof C199758sR) || (c199758sR = (C199758sR) obj) == null || this.A01 != c199758sR.A01 || this.A00 != c199758sR.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0P("x", this.A01, this.A00);
    }

    public C199758sR(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
