package X;

/* renamed from: X.Ccy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28253Ccy {
    public final int A00;

    public static String A00(int i) {
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            return "End";
        }
        if (i == Integer.MIN_VALUE) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C28253Ccy) || i != ((C28253Ccy) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return A00(this.A00);
    }
}
