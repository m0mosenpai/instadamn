package X;

/* loaded from: classes7.dex */
public final class H5F extends C0T6 implements InterfaceC43512JJy {
    public final int A00;
    public final int A01;

    @Override // X.InterfaceC43512JJy
    public final H5F Ezj() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5F) {
                H5F h5f = (H5F) obj;
                if (this.A00 != h5f.A00 || this.A01 != h5f.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    @Override // X.InterfaceC43512JJy
    public final int B28() {
        return this.A00;
    }

    @Override // X.InterfaceC43512JJy
    public final int Bzp() {
        return this.A01;
    }

    public H5F(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
