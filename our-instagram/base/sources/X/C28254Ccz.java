package X;

/* renamed from: X.Ccz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28254Ccz {
    public final int A00;

    public static String A00(int i) {
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        if (i == 5) {
            return "ContentOrRtl";
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
        if (!(obj instanceof C28254Ccz) || i != ((C28254Ccz) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return A00(this.A00);
    }
}
