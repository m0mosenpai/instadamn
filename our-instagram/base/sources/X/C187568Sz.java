package X;

/* renamed from: X.8Sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187568Sz extends C8T0 {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C187568Sz) {
                C187568Sz c187568Sz = (C187568Sz) obj;
                if (this.A01 != c187568Sz.A01 || this.A00 != c187568Sz.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0X("TimedElementDragState(selectedRow=", ", selectedIndex=", ')', this.A01, this.A00);
    }

    public C187568Sz(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
