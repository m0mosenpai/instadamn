package X;

import android.view.ViewOutlineProvider;
import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.Cpt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28945Cpt implements InterfaceC51732Yw {
    public final long A00;
    public final ViewOutlineProvider A01;
    public final CVJ A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28945Cpt) {
                C28945Cpt c28945Cpt = (C28945Cpt) obj;
                if (this.A00 != c28945Cpt.A00 || !C14360o3.A0K(this.A01, c28945Cpt.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A01, AbstractC25235BEs.A03(this.A00)) - 16777216) * 31) - 16777216;
    }

    public C28945Cpt(ViewOutlineProvider viewOutlineProvider, long j) {
        this.A00 = j;
        this.A01 = viewOutlineProvider;
        this.A02 = new CVJ(viewOutlineProvider, j);
    }

    @Override // X.InterfaceC51732Yw
    public final void AC4(C50932Vp c50932Vp, C2XE c2xe) {
        AbstractC167017dG.A1N(c2xe, c50932Vp);
        long j = this.A00;
        C2XH c2xh = c2xe.A0D;
        C14360o3.A07(c2xh);
        float A00 = C2Z3.A00(c2xh, j);
        C50952Vr A02 = C50932Vp.A02(c50932Vp);
        A02.A0F |= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED;
        A02.A05 = A00;
        ViewOutlineProvider viewOutlineProvider = this.A01;
        C50952Vr A022 = C50932Vp.A02(c50932Vp);
        A022.A0F |= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED;
        A022.A0H = viewOutlineProvider;
        C50952Vr A023 = C50932Vp.A02(c50932Vp);
        A023.A0F |= 134217728;
        A023.A06 = -16777216;
        C50952Vr A024 = C50932Vp.A02(c50932Vp);
        A024.A0F |= 268435456;
        A024.A07 = -16777216;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ShadowStyleItem(elevation=");
        A1C.append((Object) C2Z3.A04(this.A00));
        A1C.append(", outlineProvider=");
        A1C.append(this.A01);
        A1C.append(AbstractC111324zv.A00(1394));
        A1C.append(-16777216);
        A1C.append(", spotShadowColor=");
        return AbstractC25236BEt.A0Z(A1C, -16777216);
    }
}
