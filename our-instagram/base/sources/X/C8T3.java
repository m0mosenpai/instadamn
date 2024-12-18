package X;

/* renamed from: X.8T3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8T3 extends C8Sx {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8T3) {
                C8T3 c8t3 = (C8T3) obj;
                if (this.A00 != c8t3.A00 || this.A01 != c8t3.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public final String toString() {
        return AnonymousClass001.A0X("AudioSelectedState(selectedIndex=", ", selectedRow=", ')', this.A00, this.A01);
    }

    public C8T3(int i, int i2) {
        super(i2);
        this.A00 = i;
        this.A01 = i2;
    }
}
