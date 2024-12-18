package X;

import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.XIGIGBoostDestination;
import java.util.List;

/* renamed from: X.Msk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51715Msk extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C51715Msk(BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C14360o3.A0B(list, 5);
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A07 = z4;
        this.A02 = list;
        this.A01 = brandedContentProjectMetadataIntf;
        this.A08 = z5;
        this.A06 = z6;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C51715Msk) {
                    C51715Msk c51715Msk = (C51715Msk) obj;
                    if (c51715Msk.A00 == 1 && this.A03 == c51715Msk.A03 && this.A04 == c51715Msk.A04 && this.A05 == c51715Msk.A05 && this.A07 == c51715Msk.A07 && C14360o3.A0K(this.A02, c51715Msk.A02) && C14360o3.A0K(this.A01, c51715Msk.A01) && this.A08 == c51715Msk.A08) {
                        z = this.A06;
                        z2 = c51715Msk.A06;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C51715Msk)) {
                return false;
            }
            C51715Msk c51715Msk2 = (C51715Msk) obj;
            if (c51715Msk2.A00 != 0 || this.A02 != c51715Msk2.A02 || !C14360o3.A0K(this.A01, c51715Msk2.A01) || this.A06 != c51715Msk2.A06 || this.A04 != c51715Msk2.A04 || this.A05 != c51715Msk2.A05 || this.A03 != c51715Msk2.A03 || this.A07 != c51715Msk2.A07) {
                return false;
            }
            z = this.A08;
            z2 = c51715Msk2.A08;
        } else {
            return true;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        boolean z;
        if (this.A00 != 0) {
            A0D = AbstractC167007dF.A0D(this.A08, (AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC25225BEi.A08(this.A03))))) + AbstractC167017dG.A0M(this.A01)) * 31);
            z = this.A06;
        } else {
            A0D = AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A03, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A02)))))));
            z = this.A08;
        }
        return AbstractC166987dD.A0K(z, A0D);
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AdvancedSettings(areCaptionsEnabled=");
        A1C.append(this.A03);
        A1C.append(", areCommentsDisabled=");
        A1C.append(this.A04);
        A1C.append(", isFundedContentDeal=");
        A1C.append(this.A05);
        A1C.append(", isPaidPartnership=");
        A1C.append(this.A07);
        A1C.append(", brandedContentTags=");
        A1C.append(this.A02);
        A1C.append(", brandedContentProjectMetadata=");
        A1C.append(this.A01);
        A1C.append(", partnerBoostEnabled=");
        A1C.append(this.A08);
        A1C.append(", isLikeAndViewCountsDisabled=");
        return AbstractC25236BEt.A0a(A1C, this.A06);
    }

    public C51715Msk(XIGIGBoostDestination xIGIGBoostDestination, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A02 = xIGIGBoostDestination;
        this.A01 = list;
        this.A06 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A03 = z4;
        this.A07 = z5;
        this.A08 = z6;
    }
}
