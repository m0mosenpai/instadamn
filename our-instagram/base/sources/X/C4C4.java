package X;

/* renamed from: X.4C4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4C4 {
    public static final C4C4 A02 = new C4C4();
    public byte A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || !(obj instanceof C4C4)) {
                return false;
            }
            C4C4 c4c4 = (C4C4) obj;
            if (this.A00 != c4c4.A00 || this.A01 != c4c4.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return new Byte(this.A00).hashCode() + new Boolean(this.A01).hashCode();
    }

    public C4C4(byte b, boolean z) {
        this.A00 = b;
        this.A01 = z;
    }

    public C4C4() {
        this.A00 = (byte) 3;
        this.A01 = true;
    }
}
