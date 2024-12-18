package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.47E, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C47E extends C0T6 implements C47F {
    public final int A00;
    public final int A01;
    public final String A02;

    public C47E(int i, String str, int i2) {
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }

    @Override // X.C47F
    public final C47E EzI() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47E) {
                C47E c47e = (C47E) obj;
                if (this.A00 != c47e.A00 || !C14360o3.A0K(this.A02, c47e.A02) || this.A01 != c47e.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A02.hashCode()) * 31) + this.A01;
    }

    @Override // X.C47F
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSUCustomProfilePicDict", AbstractC40223Hsm.A00(this));
    }

    @Override // X.C47F
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.C47F
    public final String getUrl() {
        return this.A02;
    }

    @Override // X.C47F
    public final int getWidth() {
        return this.A01;
    }
}
