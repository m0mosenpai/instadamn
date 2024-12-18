package X;

/* renamed from: X.8T8, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8T8 extends C8T9 {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8T8) {
                C8T8 c8t8 = (C8T8) obj;
                if (this.A00 != c8t8.A00 || this.A01 != c8t8.A01) {
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
        return AnonymousClass001.A0X("AudioFilter(selectedIndex=", ", selectedRow=", ')', this.A00, this.A01);
    }

    public C8T8(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public C8T8() {
        this(-1, 0);
    }
}
