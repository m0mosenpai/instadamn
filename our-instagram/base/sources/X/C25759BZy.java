package X;

import android.graphics.RenderEffect;

/* renamed from: X.BZy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25759BZy extends AbstractC27458CAa {
    public final float A00;
    public final float A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25759BZy) {
                C25759BZy c25759BZy = (C25759BZy) obj;
                if (this.A00 != c25759BZy.A00 || this.A01 != c25759BZy.A01 || this.A02 != c25759BZy.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC27458CAa
    public final RenderEffect A01() {
        return CBF.A00(this.A00, this.A01, this.A02);
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC25235BEs.A02(this.A00), this.A01) + this.A02;
    }

    public C25759BZy(int i, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC25235BEs.A1L(A1C, "BlurEffect(renderEffect=");
        A1C.append(", radiusX=");
        A1C.append(this.A00);
        A1C.append(", radiusY=");
        A1C.append(this.A01);
        A1C.append(", edgeTreatment=");
        int i = this.A02;
        if (i == 0) {
            str = "Clamp";
        } else if (i == 1) {
            str = "Repeated";
        } else if (i == 2) {
            str = "Mirror";
        } else {
            str = "Decal";
        }
        return AbstractC167017dG.A0o(str, A1C);
    }
}
