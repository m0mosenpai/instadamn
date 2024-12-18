package X;

import android.view.ViewOutlineProvider;

/* loaded from: classes5.dex */
public final class CVJ {
    public final long A00;
    public final ViewOutlineProvider A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVJ) {
                CVJ cvj = (CVJ) obj;
                if (this.A00 != cvj.A00 || !C14360o3.A0K(this.A01, cvj.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A01, AbstractC25235BEs.A03(this.A00)) - 16777216) * 31) - 16777216;
    }

    public CVJ(ViewOutlineProvider viewOutlineProvider, long j) {
        this.A00 = j;
        this.A01 = viewOutlineProvider;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ShadowStyleItemParams(elevation=");
        A1C.append((Object) C2Z3.A04(this.A00));
        A1C.append(", outlineProvider=");
        A1C.append(this.A01);
        A1C.append(AbstractC111324zv.A00(1394));
        A1C.append(-16777216);
        A1C.append(", spotShadowColor=");
        return AbstractC25236BEt.A0Z(A1C, -16777216);
    }
}
