package X;

import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes11.dex */
public final class V2V extends AbstractC26915BuI {
    public final ImageUrl A00;
    public final C38321qM A01;
    public final VJ2 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public V2V(ImageUrl imageUrl, C38321qM c38321qM, VJ2 vj2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC25229BEm.A1I(str, 1, str4);
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A00 = imageUrl;
        this.A09 = z;
        this.A03 = str4;
        this.A05 = str5;
        this.A04 = str6;
        this.A01 = c38321qM;
        this.A0A = z2;
        this.A0C = z3;
        this.A0B = z4;
        this.A02 = vj2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof V2V) {
                V2V v2v = (V2V) obj;
                if (!C14360o3.A0K(this.A06, v2v.A06) || !C14360o3.A0K(this.A07, v2v.A07) || !C14360o3.A0K(this.A08, v2v.A08) || !C14360o3.A0K(this.A00, v2v.A00) || this.A09 != v2v.A09 || !C14360o3.A0K(this.A03, v2v.A03) || !C14360o3.A0K(this.A05, v2v.A05) || !C14360o3.A0K(this.A04, v2v.A04) || !C14360o3.A0K(this.A01, v2v.A01) || this.A0A != v2v.A0A || this.A0C != v2v.A0C || this.A0B != v2v.A0B || !C14360o3.A0K(this.A02, v2v.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC29162CtT
    public final ImageUrl A04() {
        return this.A00;
    }

    @Override // X.AbstractC29162CtT
    public final String A05() {
        return this.A03;
    }

    @Override // X.AbstractC29162CtT
    public final String A06() {
        return this.A06;
    }

    @Override // X.AbstractC29162CtT
    public final String A07() {
        return this.A07;
    }

    @Override // X.AbstractC29162CtT
    public final String A08() {
        return this.A08;
    }

    @Override // X.AbstractC29162CtT
    public final boolean A0A() {
        return this.A09;
    }

    @Override // X.AbstractC26915BuI
    public final C38321qM A0B() {
        return this.A01;
    }

    @Override // X.AbstractC26915BuI
    public final String A0C() {
        return this.A04;
    }

    @Override // X.AbstractC26915BuI
    public final String A0D() {
        return this.A05;
    }

    @Override // X.AbstractC26915BuI
    public final boolean A0E() {
        return this.A0A;
    }

    @Override // X.AbstractC26915BuI
    public final boolean A0F() {
        return this.A0C;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A03, AbstractC167007dF.A0D(this.A09, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A07, this.A06.hashCode() * 31))))))))))) + AbstractC167017dG.A0M(this.A02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OriginalAudio(primaryText=");
        sb.append(this.A06);
        sb.append(AbstractC111324zv.A00(140));
        sb.append(this.A07);
        sb.append(AbstractC111324zv.A00(578));
        sb.append(this.A08);
        sb.append(AbstractC111324zv.A00(564));
        sb.append(this.A00);
        sb.append(", isChecked=");
        sb.append(this.A09);
        sb.append(", id=");
        sb.append(this.A03);
        sb.append(", mediaId=");
        sb.append(this.A05);
        sb.append(", mediaAuthorId=");
        sb.append(this.A04);
        sb.append(", media=");
        sb.append(this.A01);
        sb.append(AbstractC111324zv.A00(566));
        sb.append(this.A0A);
        sb.append(", isTrending=");
        sb.append(this.A0C);
        sb.append(AbstractC111324zv.A00(567));
        sb.append(this.A0B);
        sb.append(", originalAudioConsumptionModel=");
        return AbstractC167017dG.A0o(this.A02, sb);
    }
}
