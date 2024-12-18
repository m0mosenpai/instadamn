package X;

/* renamed from: X.Bfe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26051Bfe extends C0T6 {
    public final int A00;
    public final C5QE A01;
    public final C5QE A02;
    public final C5QE A03;
    public final C5QE A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26051Bfe) {
                C26051Bfe c26051Bfe = (C26051Bfe) obj;
                if (!C14360o3.A0K(this.A04, c26051Bfe.A04) || !C14360o3.A0K(this.A01, c26051Bfe.A01) || !C14360o3.A0K(this.A03, c26051Bfe.A03) || !C14360o3.A0K(this.A02, c26051Bfe.A02) || this.A00 != c26051Bfe.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25225BEi.A05((((AbstractC25225BEi.A05(AbstractC167017dG.A0M(this.A04) * 31, AbstractC167017dG.A0M(this.A01)) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31, this.A00) + AbstractC53644Nnp.A00();
    }

    public C26051Bfe(C5QE c5qe, C5QE c5qe2, C5QE c5qe3, C5QE c5qe4, int i) {
        this.A04 = c5qe;
        this.A01 = c5qe2;
        this.A03 = c5qe3;
        this.A02 = c5qe4;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CtaTextUiState(text=");
        A1C.append(this.A04);
        A1C.append(", contentDescriptionText=");
        A1C.append(this.A01);
        AbstractC25235BEs.A1L(A1C, ", actionDescriptionText=");
        A1C.append(AbstractC111324zv.A00(140));
        A1C.append(this.A03);
        A1C.append(", metadataText=");
        A1C.append(this.A02);
        A1C.append(AbstractC111324zv.A00(571));
        A1C.append(this.A00);
        AbstractC25235BEs.A1L(A1C, ", ellipsize=");
        A1C.append(", centerContent=");
        return AbstractC25236BEt.A0a(A1C, false);
    }

    public C26051Bfe() {
        this(null, null, null, null, Integer.MAX_VALUE);
    }
}
