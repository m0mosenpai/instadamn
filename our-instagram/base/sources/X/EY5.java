package X;

import com.facebook.R;

/* loaded from: classes6.dex */
public final class EY5 extends C4F4 {
    public final int A00 = R.drawable.instagram_crown_pano_filled_24;
    public final C5QE A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EY5) {
                EY5 ey5 = (EY5) obj;
                if (this.A00 != ey5.A00 || !C14360o3.A0K(this.A01, ey5.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, this.A00 * 31);
    }

    public EY5(C5QE c5qe) {
        this.A01 = c5qe;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }
}
