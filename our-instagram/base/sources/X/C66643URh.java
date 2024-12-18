package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.URh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66643URh extends C0T6 implements XGE {
    public final UQt A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    @Override // X.XGE
    public final C66643URh F58() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66643URh) {
                C66643URh c66643URh = (C66643URh) obj;
                if (!C14360o3.A0K(this.A01, c66643URh.A01) || !C14360o3.A0K(this.A00, c66643URh.A00) || !C14360o3.A0K(this.A02, c66643URh.A02) || !C14360o3.A0K(this.A03, c66643URh.A03) || !C14360o3.A0K(this.A04, c66643URh.A04) || !C14360o3.A0K(this.A05, c66643URh.A05) || !C14360o3.A0K(this.A06, c66643URh.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XGE
    public final Boolean AlC() {
        return this.A01;
    }

    @Override // X.XGE
    public final /* bridge */ /* synthetic */ XGB Ayq() {
        return this.A00;
    }

    @Override // X.XGE
    public final String Ayt() {
        return this.A02;
    }

    @Override // X.XGE
    public final String Ayu() {
        return this.A03;
    }

    @Override // X.XGE
    public final String BgZ() {
        return this.A04;
    }

    @Override // X.XGE
    public final String Bhk() {
        return this.A05;
    }

    @Override // X.XGE
    public final String CIf() {
        return this.A06;
    }

    @Override // X.XGE
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFundRaiserConsumptionSheetConfig", VVX.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((((((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31;
        String str = this.A06;
        if (str != null) {
            i = str.hashCode();
        }
        return A0M + i;
    }

    public C66643URh(UQt uQt, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        this.A01 = bool;
        this.A00 = uQt;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
    }
}
