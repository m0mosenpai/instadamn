package X;

/* loaded from: classes5.dex */
public final class CV3 {
    public final int value;

    public final int hashCode() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        int i = this.value;
        if (!(obj instanceof CV3) || i != ((CV3) obj).value) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.value;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return AbstractC111324zv.A00(1800);
        }
        if (i == 2) {
            return "Hardware";
        }
        if (i == -1) {
            return "Auto";
        }
        return "Unknown";
    }
}
