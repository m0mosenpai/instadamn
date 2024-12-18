package X;

/* loaded from: classes8.dex */
public final class L8K {
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && AbstractC167017dG.A1Z(this, obj) && this.A00 == ((L8K) obj).A00;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public L8K(boolean z) {
        this.A00 = z;
    }
}
