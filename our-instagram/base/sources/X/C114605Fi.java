package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5Fi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114605Fi extends C0T6 implements C4o4 {
    public final String A00;
    public final String A01;

    public C114605Fi(String str, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.C4o4
    public final C114605Fi Ewd() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114605Fi) {
                C114605Fi c114605Fi = (C114605Fi) obj;
                if (!C14360o3.A0K(this.A00, c114605Fi.A00) || !C14360o3.A0K(this.A01, c114605Fi.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // X.C4o4
    public final String AYb() {
        return this.A00;
    }

    @Override // X.C4o4
    public final String BSt() {
        return this.A01;
    }

    @Override // X.C4o4
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMessageExtensionInfo", AbstractC40072Hpy.A00(this));
    }
}
