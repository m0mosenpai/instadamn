package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

/* renamed from: X.H5v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38781H5v extends C0T6 implements JKW {
    public final String A00;
    public final String A01;

    @Override // X.JKW
    public final C38781H5v F1T() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38781H5v) {
                C38781H5v c38781H5v = (C38781H5v) obj;
                if (!C14360o3.A0K(this.A00, c38781H5v.A00) || !C14360o3.A0K(this.A01, c38781H5v.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKW
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (getId() != null) {
            AbstractC37300Gc1.A12(getId(), A1I);
        }
        if (getText() != null) {
            AbstractC37300Gc1.A15(getText(), A1I);
        }
        return AbstractC37300Gc1.A05("XDTStoryQuickCaptionDict", AbstractC06930Yk.A0B(A1I));
    }

    @Override // X.JKW
    public final String getId() {
        return this.A00;
    }

    @Override // X.JKW
    public final String getText() {
        return this.A01;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C38781H5v(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
