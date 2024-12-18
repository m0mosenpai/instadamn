package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5v1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130565v1 extends C0T6 implements InterfaceC130575v2 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C130565v1(int i, String str, String str2, int i2) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        this.A00 = i;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = i2;
    }

    @Override // X.InterfaceC130575v2
    public final C130565v1 F5O() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C130565v1) {
                C130565v1 c130565v1 = (C130565v1) obj;
                if (this.A00 != c130565v1.A00 || !C14360o3.A0K(this.A02, c130565v1.A02) || !C14360o3.A0K(this.A03, c130565v1.A03) || this.A01 != c130565v1.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A00 * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A01;
    }

    @Override // X.InterfaceC130575v2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTReelCoverMediaImageVersionClientDict", AbstractC40701I2h.A00(this));
    }

    @Override // X.InterfaceC130575v2
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.InterfaceC130575v2
    public final String getScansProfile() {
        return this.A02;
    }

    @Override // X.InterfaceC130575v2
    public final String getUrl() {
        return this.A03;
    }

    @Override // X.InterfaceC130575v2
    public final int getWidth() {
        return this.A01;
    }
}
