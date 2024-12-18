package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4uf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108544uf extends C0T6 implements InterfaceC108554ug {
    public final int A00;
    public final int A01;

    @Override // X.InterfaceC108554ug
    public final C108544uf Eve() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108544uf) {
                C108544uf c108544uf = (C108544uf) obj;
                if (this.A00 != c108544uf.A00 || this.A01 != c108544uf.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    @Override // X.InterfaceC108554ug
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIgLiveDimensions", HpD.A00(this));
    }

    @Override // X.InterfaceC108554ug
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.InterfaceC108554ug
    public final int getWidth() {
        return this.A01;
    }

    public C108544uf(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
