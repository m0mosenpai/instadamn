package X;

import java.util.List;

/* renamed from: X.Nnm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53641Nnm {
    public int A00;
    public int A01;
    public Float A02;
    public List A03;
    public List A04;
    public boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53641Nnm) {
                C53641Nnm c53641Nnm = (C53641Nnm) obj;
                if (!C14360o3.A0K(this.A02, c53641Nnm.A02) || !C14360o3.A0K(this.A04, c53641Nnm.A04) || !C14360o3.A0K(this.A03, c53641Nnm.A03) || this.A05 != c53641Nnm.A05 || this.A00 != c53641Nnm.A00 || this.A01 != c53641Nnm.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A03, ((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC166997dE.A0I(this.A04)) * 31)) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ParametricSliderDataModel(sliderValue=");
        A1C.append(this.A02);
        A1C.append(", gradientColors=");
        A1C.append(this.A04);
        A1C.append(", choicePaths=");
        A1C.append(this.A03);
        A1C.append(", passSliderUpdateToBloksOnTouchUpOnly=");
        A1C.append(this.A05);
        A1C.append(", currentSliderPosition=");
        A1C.append(this.A00);
        A1C.append(", thumbBorderWidth=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }
}
