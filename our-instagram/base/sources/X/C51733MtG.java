package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.MtG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51733MtG extends C0T6 {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r3 == com.instagram.api.schemas.MonetizationEligibilityDecision.A04) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51733MtG(com.instagram.api.schemas.MonetizationEligibilityDecision r3, boolean r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            r0 = 0
            r2.A00 = r0
            r2.A00 = r0
            r2.<init>()
            r2.A03 = r4
            r2.A01 = r3
            r2.A06 = r0
            r2.A02 = r5
            r2.A04 = r6
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = com.instagram.api.schemas.MonetizationEligibilityDecision.A05
            if (r3 == r0) goto L1b
            com.instagram.api.schemas.MonetizationEligibilityDecision r1 = com.instagram.api.schemas.MonetizationEligibilityDecision.A04
            r0 = 0
            if (r3 != r1) goto L1c
        L1b:
            r0 = 1
        L1c:
            r2.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51733MtG.<init>(com.instagram.api.schemas.MonetizationEligibilityDecision, boolean, boolean, boolean):void");
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C51733MtG)) {
                        return false;
                    }
                    C51733MtG c51733MtG = (C51733MtG) obj;
                    if (c51733MtG.A00 != 0 || this.A03 != c51733MtG.A03 || this.A01 != c51733MtG.A01 || this.A06 != c51733MtG.A06 || this.A02 != c51733MtG.A02) {
                        return false;
                    }
                    z = this.A04;
                    z2 = c51733MtG.A04;
                    break;
                } else {
                    return true;
                }
                break;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C51733MtG)) {
                        return false;
                    }
                    C51733MtG c51733MtG2 = (C51733MtG) obj;
                    if (c51733MtG2.A00 != 1 || !C14360o3.A0K(this.A01, c51733MtG2.A01) || this.A03 != c51733MtG2.A03 || this.A02 != c51733MtG2.A02 || this.A05 != c51733MtG2.A05 || this.A04 != c51733MtG2.A04) {
                        return false;
                    }
                    z = this.A06;
                    z2 = c51733MtG2.A06;
                    break;
                } else {
                    return true;
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof C51733MtG) {
                        C51733MtG c51733MtG3 = (C51733MtG) obj;
                        if (c51733MtG3.A00 == 2 && this.A01 == c51733MtG3.A01 && this.A03 == c51733MtG3.A03 && this.A06 == c51733MtG3.A06 && this.A02 == c51733MtG3.A02 && this.A04 == c51733MtG3.A04) {
                            z = this.A05;
                            z2 = c51733MtG3.A05;
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
                break;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        boolean z;
        String str;
        switch (this.A00) {
            case 0:
                A0D = AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A01, AbstractC25225BEi.A08(this.A03))));
                z = this.A04;
                break;
            case 1:
                A0D = AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC167017dG.A0M(this.A01) * 31))));
                z = this.A06;
                break;
            default:
                int A0H = AbstractC166987dD.A0H(this.A01);
                switch (A0H) {
                    case 1:
                        str = "TOOL";
                        break;
                    case 2:
                        str = "TRIM";
                        break;
                    case 3:
                        str = "COVER";
                        break;
                    case 4:
                        str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                        break;
                    default:
                        str = "FILTER";
                        break;
                }
                A0D = AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A03, AbstractC25228BEl.A0F(str, A0H)))));
                z = this.A05;
                break;
        }
        return AbstractC166987dD.A0K(z, A0D);
    }

    public C51733MtG(C101394gx c101394gx, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = 1;
        this.A01 = c101394gx;
        this.A03 = z;
        this.A02 = z2;
        this.A05 = z3;
        this.A04 = z4;
        this.A06 = z5;
    }

    public C51733MtG(Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00 = 2;
        this.A01 = num;
        this.A03 = z;
        this.A06 = z2;
        this.A02 = z3;
        this.A04 = z4;
        this.A05 = z5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51733MtG() {
        this((C101394gx) null, false, false, false, false, false);
        this.A00 = 1;
    }
}
