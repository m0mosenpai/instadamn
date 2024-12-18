package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.43O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C43O extends C0T6 implements C43P {
    public final String A00;
    public final String A01;

    @Override // X.C43P
    public final C43O Erg() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43O) {
                C43O c43o = (C43O) obj;
                if (!C14360o3.A0K(this.A00, c43o.A00) || !C14360o3.A0K(this.A01, c43o.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.C43P
    public final String Byw() {
        return this.A01;
    }

    @Override // X.C43P
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTChainingInfo", AbstractC37945Gmk.A00(this));
    }

    @Override // X.C43P
    public final String getAlgorithm() {
        return this.A00;
    }

    public C43O(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
