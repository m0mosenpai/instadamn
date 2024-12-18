package X;

/* renamed from: X.8vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201638vs implements Cloneable {
    public Integer A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C201638vs c201638vs = (C201638vs) obj;
            if (this.A00 != c201638vs.A00 || this.A01 != c201638vs.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A01 ? 1 : 0) * 31) + AbstractC225359wy.A00(this.A00);
    }

    public final C201638vs A00() {
        try {
            return (C201638vs) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }
}
