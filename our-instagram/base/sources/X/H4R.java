package X;

import com.instagram.api.schemas.OverlayAdsTextStyleEnum;

/* loaded from: classes7.dex */
public final class H4R extends C0T6 implements InterfaceC31125Dm8 {
    public final OverlayAdsTextStyleEnum A00;
    public final Integer A01;
    public final String A02;

    @Override // X.InterfaceC31125Dm8
    public final H4R Exq() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4R) {
                H4R h4r = (H4R) obj;
                if (!C14360o3.A0K(this.A02, h4r.A02) || !C14360o3.A0K(this.A01, h4r.A01) || this.A00 != h4r.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31125Dm8
    public final Integer Bxa() {
        return this.A01;
    }

    @Override // X.InterfaceC31125Dm8
    public final OverlayAdsTextStyleEnum C36() {
        return this.A00;
    }

    @Override // X.InterfaceC31125Dm8
    public final String getColor() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H4R(OverlayAdsTextStyleEnum overlayAdsTextStyleEnum, Integer num, String str) {
        this.A02 = str;
        this.A01 = num;
        this.A00 = overlayAdsTextStyleEnum;
    }
}
