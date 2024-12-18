package X;

/* renamed from: X.CVt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27996CVt {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27996CVt)) {
            return false;
        }
        C27996CVt c27996CVt = (C27996CVt) obj;
        return this.A01 == c27996CVt.A01 && this.A03 == c27996CVt.A03 && this.A02 == c27996CVt.A02 && this.A00 == c27996CVt.A00;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0w("InsetsValues(left=", ", top=", ", right=", ", bottom=", ')', this.A01, this.A03, this.A02, this.A00);
    }

    public C27996CVt(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
