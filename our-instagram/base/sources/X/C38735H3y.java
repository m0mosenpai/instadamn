package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H3y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38735H3y extends C0T6 implements JLS {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C38735H3y(String str, String str2, int i, boolean z) {
        AbstractC167007dF.A1F(str, 2, str2);
        this.A03 = z;
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
    }

    @Override // X.JLS
    public final C38735H3y Eva() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38735H3y) {
                C38735H3y c38735H3y = (C38735H3y) obj;
                if (this.A03 != c38735H3y.A03 || !C14360o3.A0K(this.A01, c38735H3y.A01) || this.A00 != c38735H3y.A00 || !C14360o3.A0K(this.A02, c38735H3y.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGTVSeriesInfo", AbstractC40024HpA.A00(this));
    }

    @Override // X.JLS
    public final boolean getHasCoverPhoto() {
        return this.A03;
    }

    @Override // X.JLS
    public final String getId() {
        return this.A01;
    }

    @Override // X.JLS
    public final int getNumEpisodes() {
        return this.A00;
    }

    @Override // X.JLS
    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, (AbstractC166997dE.A0K(this.A01, AbstractC25225BEi.A08(this.A03)) + this.A00) * 31);
    }
}
