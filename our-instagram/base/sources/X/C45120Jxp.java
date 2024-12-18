package X;

import java.util.List;

/* renamed from: X.Jxp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45120Jxp extends C0T6 {
    public Object A00;
    public final int A01 = 2;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C45120Jxp(Boolean bool, Boolean bool2, boolean z, boolean z2, boolean z3) {
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A03 = bool;
        this.A02 = bool2;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.A01) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof C45120Jxp)) {
                        return false;
                    }
                    C45120Jxp c45120Jxp = (C45120Jxp) obj;
                    if (c45120Jxp.A01 != 0 || !C14360o3.A0K(this.A00, c45120Jxp.A00) || !C14360o3.A0K(this.A02, c45120Jxp.A02) || !C14360o3.A0K(this.A03, c45120Jxp.A03) || this.A06 != c45120Jxp.A06 || this.A04 != c45120Jxp.A04 || this.A05 != c45120Jxp.A05) {
                        return false;
                    }
                    return true;
                }
                return true;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof C45120Jxp)) {
                        return false;
                    }
                    C45120Jxp c45120Jxp2 = (C45120Jxp) obj;
                    if (c45120Jxp2.A01 != 1 || this.A05 != c45120Jxp2.A05 || this.A06 != c45120Jxp2.A06 || this.A04 != c45120Jxp2.A04 || !C14360o3.A0K(this.A03, c45120Jxp2.A03)) {
                        return false;
                    }
                    obj2 = this.A02;
                    obj3 = c45120Jxp2.A02;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    if (obj instanceof C45120Jxp) {
                        C45120Jxp c45120Jxp3 = (C45120Jxp) obj;
                        if (c45120Jxp3.A01 == 2 && C14360o3.A0K(this.A02, c45120Jxp3.A02) && this.A05 == c45120Jxp3.A05 && this.A04 == c45120Jxp3.A04 && this.A06 == c45120Jxp3.A06 && C14360o3.A0K(this.A00, c45120Jxp3.A00)) {
                            obj2 = this.A03;
                            obj3 = c45120Jxp3.A03;
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
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        int i;
        switch (this.A01) {
            case 0:
                A0D = AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A00)))));
                i = 1237;
                if (this.A05) {
                    i = 1231;
                    break;
                }
                break;
            case 1:
                i = (AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A06, AbstractC25225BEi.A08(this.A05))) + AbstractC167017dG.A0M(this.A03)) * 31;
                A0D = AbstractC166997dE.A0I(this.A02);
                break;
            default:
                A0D = AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC166987dD.A0G(this.A02)))));
                i = AbstractC167017dG.A0M(this.A03);
                break;
        }
        return i + A0D;
    }

    public final String toString() {
        if (2 - this.A01 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LinkedOpenThreadLoadingState(threadId=");
        A1C.append(this.A02);
        A1C.append(", hasIncompleteRequest=");
        A1C.append(this.A05);
        A1C.append(", hasFirstPageBeenRequested=");
        A1C.append(this.A04);
        A1C.append(", hasLoadedOldestMessage=");
        A1C.append(this.A06);
        A1C.append(", viewModelList=");
        A1C.append(this.A00);
        A1C.append(", threadMetadata=");
        return AbstractC167017dG.A0o(this.A03, A1C);
    }

    public C45120Jxp(C7TT c7tt, C83693oE c83693oE, List list, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(list, 5);
        this.A02 = c83693oE;
        this.A05 = z;
        this.A04 = z2;
        this.A06 = z3;
        this.A00 = list;
        this.A03 = c7tt;
    }

    public C45120Jxp(C51737MtK c51737MtK, C51737MtK c51737MtK2, C51737MtK c51737MtK3, boolean z, boolean z2, boolean z3) {
        this.A00 = c51737MtK;
        this.A02 = c51737MtK2;
        this.A03 = c51737MtK3;
        this.A06 = z;
        this.A04 = z2;
        this.A05 = z3;
    }

    public C45120Jxp(C7TT c7tt, C83693oE c83693oE) {
        this(c7tt, c83693oE, (List) C16930sl.A00, false, false, false);
    }

    public C45120Jxp(Boolean bool, boolean z) {
        this(bool, false, false, z, false);
    }
}
