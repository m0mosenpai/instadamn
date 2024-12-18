package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H6l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38796H6l extends C0T6 implements JLB {
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // X.JLB
    public final C38796H6l F3C() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38796H6l) {
                C38796H6l c38796H6l = (C38796H6l) obj;
                if (!C14360o3.A0K(this.A00, c38796H6l.A00) || !C14360o3.A0K(this.A01, c38796H6l.A01) || !C14360o3.A0K(this.A02, c38796H6l.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLB
    public final String AdO() {
        return this.A02;
    }

    @Override // X.JLB
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextPostShareToIgStoryStickerDict", AbstractC40409Hvw.A00(this));
    }

    @Override // X.JLB
    public final String getAttributionAppId() {
        return this.A00;
    }

    @Override // X.JLB
    public final String getAttributionAppName() {
        return this.A01;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public C38796H6l(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
