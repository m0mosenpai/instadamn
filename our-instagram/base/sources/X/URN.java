package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class URN extends C0T6 implements XGH {
    public final Boolean A00;
    public final Boolean A01;
    public final Float A02;
    public final Float A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    @Override // X.XGH
    public final URN F1l() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URN) {
                URN urn = (URN) obj;
                if (!C14360o3.A0K(this.A05, urn.A05) || !C14360o3.A0K(this.A06, urn.A06) || !C14360o3.A0K(this.A00, urn.A00) || !C14360o3.A0K(this.A07, urn.A07) || !C14360o3.A0K(this.A08, urn.A08) || !C14360o3.A0K(this.A02, urn.A02) || !C14360o3.A0K(this.A04, urn.A04) || !C14360o3.A0K(this.A09, urn.A09) || !C14360o3.A0K(this.A01, urn.A01) || !C14360o3.A0K(this.A03, urn.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XGH
    public final Float Bxn() {
        return this.A02;
    }

    @Override // X.XGH
    public final Integer Bxo() {
        return this.A04;
    }

    @Override // X.XGH
    public final Boolean CG3() {
        return this.A01;
    }

    @Override // X.XGH
    public final Float CGN() {
        return this.A03;
    }

    @Override // X.XGH
    public final Boolean CWr() {
        return this.A00;
    }

    @Override // X.XGH
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStorySliderStickerDict", VP7.A00(this));
    }

    @Override // X.XGH
    public final String getBackgroundColor() {
        return this.A05;
    }

    @Override // X.XGH
    public final String getEmoji() {
        return this.A06;
    }

    @Override // X.XGH
    public final String getQuestion() {
        return this.A07;
    }

    @Override // X.XGH
    public final String getSliderId() {
        return this.A08;
    }

    @Override // X.XGH
    public final String getTextColor() {
        return this.A09;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((((((((((((((AbstractC167017dG.A0O(this.A05) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
        Float f = this.A03;
        if (f != null) {
            i = f.hashCode();
        }
        return A0O + i;
    }

    public URN(Boolean bool, Boolean bool2, Float f, Float f2, Integer num, String str, String str2, String str3, String str4, String str5) {
        this.A05 = str;
        this.A06 = str2;
        this.A00 = bool;
        this.A07 = str3;
        this.A08 = str4;
        this.A02 = f;
        this.A04 = num;
        this.A09 = str5;
        this.A01 = bool2;
        this.A03 = f2;
    }
}
