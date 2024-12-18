package X;

/* renamed from: X.8Sw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187548Sw extends C8Sx {
    public final int A00;
    public final int A01;

    public C187548Sw(int i, int i2) {
        super(0);
        this.A00 = i;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C187548Sw) {
                C187548Sw c187548Sw = (C187548Sw) obj;
                if (this.A00 != c187548Sw.A00 || this.A01 != c187548Sw.A01) {
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
        return AnonymousClass001.A0X("AudioAdjustState(selectedIndex=", ", selectedRow=", ')', this.A00, this.A01);
    }
}
