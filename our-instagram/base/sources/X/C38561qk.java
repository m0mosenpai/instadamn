package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.1qk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38561qk extends C0T6 implements InterfaceC38571ql {
    public final String A00;
    public final String A01;
    public final String A02;

    public C38561qk(String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str3, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // X.InterfaceC38571ql
    public final C38561qk F7A() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38561qk) {
                C38561qk c38561qk = (C38561qk) obj;
                if (!C14360o3.A0K(this.A00, c38561qk.A00) || !C14360o3.A0K(this.A01, c38561qk.A01) || !C14360o3.A0K(this.A02, c38561qk.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        String str = this.A01;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A02.hashCode();
    }

    @Override // X.InterfaceC38571ql
    public final String BGu() {
        return this.A00;
    }

    @Override // X.InterfaceC38571ql
    public final String BGv() {
        return this.A01;
    }

    @Override // X.InterfaceC38571ql
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTRingGlyphClientDict", AbstractC40780I5i.A00(this));
    }

    @Override // X.InterfaceC38571ql
    public final String getName() {
        return this.A02;
    }
}
