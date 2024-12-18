package X;

/* renamed from: X.5gJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122235gJ {
    public static final C122235gJ A02 = new C122235gJ(2, false);
    public static final C122235gJ A03 = new C122235gJ(1, true);
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C122235gJ) {
                C122235gJ c122235gJ = (C122235gJ) obj;
                if (this.A00 != c122235gJ.A00 || this.A01 != c122235gJ.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        return i + i2;
    }

    public final String toString() {
        if (equals(A02)) {
            return "TextMotion.Static";
        }
        if (equals(A03)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }

    public C122235gJ(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
