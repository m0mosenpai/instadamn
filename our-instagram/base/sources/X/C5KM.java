package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5KM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KM extends C0T6 implements C5KN {
    public final String A00;
    public final String A01;

    @Override // X.C5KN
    public final C5KM F0i() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5KM) {
                C5KM c5km = (C5KM) obj;
                if (!C14360o3.A0K(this.A00, c5km.A00) || !C14360o3.A0K(this.A01, c5km.A01)) {
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

    @Override // X.C5KN
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryHashtagDict", AbstractC40290Htu.A00(this));
    }

    @Override // X.C5KN
    public final String getId() {
        return this.A00;
    }

    @Override // X.C5KN
    public final String getName() {
        return this.A01;
    }

    public C5KM(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
