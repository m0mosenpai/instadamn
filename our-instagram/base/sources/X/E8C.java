package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes6.dex */
public final class E8C extends C0T6 implements InterfaceC37273GbQ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC37273GbQ
    public final E8C F2V() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E8C) {
                E8C e8c = (E8C) obj;
                if (!C14360o3.A0K(this.A00, e8c.A00) || !C14360o3.A0K(this.A01, e8c.A01) || !C14360o3.A0K(this.A02, e8c.A02) || !C14360o3.A0K(this.A03, e8c.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37273GbQ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSubInterestResponse", AbstractC33749Evb.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public E8C(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    @Override // X.InterfaceC37273GbQ
    public final String B6s() {
        return this.A01;
    }

    @Override // X.InterfaceC37273GbQ
    public final String BGu() {
        return this.A02;
    }

    @Override // X.InterfaceC37273GbQ
    public final String getEmoji() {
        return this.A00;
    }

    @Override // X.InterfaceC37273GbQ
    public final String getName() {
        return this.A03;
    }
}
