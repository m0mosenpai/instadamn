package X;

/* renamed from: X.8T4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8T4 extends C8Sx {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8T4) {
                C8T4 c8t4 = (C8T4) obj;
                if (this.A00 != c8t4.A00 || this.A01 != c8t4.A01) {
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
        return AnonymousClass001.A0X("VoiceoverSelectedState(selectedIndex=", ", selectedRow=", ')', this.A00, this.A01);
    }

    public C8T4(int i, int i2) {
        super(i2);
        this.A00 = i;
        this.A01 = i2;
    }
}
