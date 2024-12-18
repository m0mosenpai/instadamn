package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H3g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38718H3g extends C0T6 implements JLQ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.JLQ
    public final C38718H3g Euk() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38718H3g) {
                C38718H3g c38718H3g = (C38718H3g) obj;
                if (!C14360o3.A0K(this.A00, c38718H3g.A00) || !C14360o3.A0K(this.A01, c38718H3g.A01) || !C14360o3.A0K(this.A02, c38718H3g.A02) || !C14360o3.A0K(this.A03, c38718H3g.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLQ
    public final String B66() {
        return this.A00;
    }

    @Override // X.JLQ
    public final String B67() {
        return this.A01;
    }

    @Override // X.JLQ
    public final String B69() {
        return this.A02;
    }

    @Override // X.JLQ
    public final String B6A() {
        return this.A03;
    }

    @Override // X.JLQ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGLeadGenContactInfoFirstQuestionInfoDict", HoK.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public C38718H3g(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
