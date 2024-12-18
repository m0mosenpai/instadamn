package X;

import android.graphics.RectF;

/* loaded from: classes10.dex */
public final class SPC {
    public final RectF A00;
    public final RectF A01;
    public final RectF A02;
    public final EnumC61161RgM A03;
    public final EnumC61153RgE A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SPC) {
                SPC spc = (SPC) obj;
                if (!C14360o3.A0K(this.A02, spc.A02) || !C14360o3.A0K(this.A01, spc.A01) || !C14360o3.A0K(this.A00, spc.A00) || this.A04 != spc.A04 || this.A03 != spc.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A02)))));
    }

    public SPC(RectF rectF, RectF rectF2, RectF rectF3, EnumC61161RgM enumC61161RgM, EnumC61153RgE enumC61153RgE) {
        this.A02 = rectF;
        this.A01 = rectF2;
        this.A00 = rectF3;
        this.A04 = enumC61153RgE;
        this.A03 = enumC61161RgM;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TooltipPositionInfo(tooltipRect=");
        A1C.append(this.A02);
        A1C.append(", contentRect=");
        A1C.append(this.A01);
        A1C.append(", arrowRect=");
        A1C.append(this.A00);
        A1C.append(", tooltipPosition=");
        A1C.append(this.A04);
        A1C.append(", arrowLocation=");
        return AbstractC167017dG.A0o(this.A03, A1C);
    }
}
