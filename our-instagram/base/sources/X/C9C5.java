package X;

/* renamed from: X.9C5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9C5 extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    public C9C5(C132175xv c132175xv, C26036BfP c26036BfP, Integer num, boolean z) {
        this.A00 = 1;
        this.A02 = c132175xv;
        this.A01 = c26036BfP;
        this.A06 = z;
        this.A03 = num;
        this.A05 = AbstractC132295y8.A01(this, "tombstone", Bet().A03);
        this.A04 = new C51758Mth((C50679MYx) null, 2, true);
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C9C5) && ((C9C5) obj).A00 == i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return this.A05;
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        Object obj;
        if (this.A00 != 0) {
            obj = this.A02;
        } else {
            obj = this.A04;
        }
        return (C132175xv) obj;
    }

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        if (this.A00 != 0) {
            return (C51758Mth) this.A04;
        }
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (A00(obj, 1)) {
                    C9C5 c9c5 = (C9C5) obj;
                    if (!C14360o3.A0K(this.A02, c9c5.A02) || !C14360o3.A0K(this.A01, c9c5.A01) || this.A06 != c9c5.A06 || this.A03 != c9c5.A03) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!A00(obj, 0)) {
                return false;
            }
            C9C5 c9c52 = (C9C5) obj;
            if (!C14360o3.A0K(this.A04, c9c52.A04) || !C14360o3.A0K(this.A03, c9c52.A03) || this.A06 != c9c52.A06 || !C14360o3.A0K(this.A02, c9c52.A02) || !C14360o3.A0K(this.A01, c9c52.A01)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str;
        if (this.A00 != 0) {
            int hashCode3 = ((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31;
            int i = 1237;
            if (this.A06) {
                i = 1231;
            }
            hashCode = (hashCode3 + i) * 31;
            int intValue = ((Number) this.A03).intValue();
            switch (intValue) {
                case 1:
                    str = "ReplyNotAvailable";
                    break;
                case 2:
                    str = "PostHidden";
                    break;
                case 3:
                    str = "PostHiddenTifu";
                    break;
                case 4:
                    str = "PostReportedTifu";
                    break;
                case 5:
                    str = "PostHiddenTifu1x1";
                    break;
                case 6:
                    str = "PostReportedTifu1x1";
                    break;
                case 7:
                    str = "ReplyHushed";
                    break;
                default:
                    str = "PostNotAvailable";
                    break;
            }
            hashCode2 = str.hashCode() + intValue;
        } else {
            int hashCode4 = ((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31;
            int i2 = 1237;
            if (this.A06) {
                i2 = 1231;
            }
            hashCode = (((hashCode4 + i2) * 31) + this.A02.hashCode()) * 31;
            hashCode2 = this.A01.hashCode();
        }
        return hashCode + hashCode2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9C5(C132175xv c132175xv, InterfaceC132185xw interfaceC132185xw, C38641Gyi c38641Gyi, boolean z) {
        this(c132175xv, new C26036BfP(false, false, false, false, false), interfaceC132185xw, c38641Gyi, z);
        this.A00 = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9C5(C132175xv c132175xv, Integer num, boolean z) {
        this(c132175xv, new C26036BfP(false, false, false, false, false), num, z);
        this.A00 = 1;
    }

    public C9C5(C132175xv c132175xv, C26036BfP c26036BfP, InterfaceC132185xw interfaceC132185xw, C38641Gyi c38641Gyi, boolean z) {
        this.A00 = 0;
        this.A04 = c132175xv;
        this.A03 = c26036BfP;
        this.A06 = z;
        this.A02 = interfaceC132185xw;
        this.A01 = c38641Gyi;
        this.A05 = AbstractC132295y8.A01(this, AbstractC111324zv.A00(1896), Bet().A03);
    }
}
