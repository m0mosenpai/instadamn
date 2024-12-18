package X;

/* renamed from: X.8T5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8T5 extends C8T0 {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8T5) {
                C8T5 c8t5 = (C8T5) obj;
                if (this.A01 != c8t5.A01 || this.A00 != c8t5.A00) {
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
        return AnonymousClass001.A0X("StickerSelectedState(selectedRow=", ", selectedIndex=", ')', this.A01, this.A00);
    }

    public C8T5(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
