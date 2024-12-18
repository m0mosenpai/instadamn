package X;

/* renamed from: X.C3k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27303C3k extends AbstractC27455C9x {
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27303C3k) {
                C27303C3k c27303C3k = (C27303C3k) obj;
                if (this.A01 != c27303C3k.A01 || this.A00 != c27303C3k.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A08(this.A01) + this.A00;
    }

    public C27303C3k(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SuggestionVisible(isMemu=");
        A1C.append(this.A01);
        A1C.append(", itemIndex=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
