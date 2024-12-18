package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H4t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38753H4t extends C0T6 implements JL6 {
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // X.JL6
    public final C38753H4t Eyt() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38753H4t) {
                C38753H4t c38753H4t = (C38753H4t) obj;
                if (!C14360o3.A0K(this.A00, c38753H4t.A00) || !C14360o3.A0K(this.A01, c38753H4t.A01) || !C14360o3.A0K(this.A02, c38753H4t.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JL6
    public final String Boi() {
        return this.A01;
    }

    @Override // X.JL6
    public final String Boj() {
        return this.A02;
    }

    @Override // X.JL6
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTQuestionStickerResponseReplyObject", AbstractC40196HsJ.A00(this));
    }

    @Override // X.JL6
    public final String getOriginalMediaId() {
        return this.A00;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public C38753H4t(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
