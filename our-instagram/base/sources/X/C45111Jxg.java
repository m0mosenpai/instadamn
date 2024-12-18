package X;

import java.util.List;

/* renamed from: X.Jxg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45111Jxg extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    public C45111Jxg(C51759Mti c51759Mti, C51759Mti c51759Mti2, String str, List list, boolean z) {
        C14360o3.A0B(str, 1);
        AbstractC43594JPz.A1P(list, c51759Mti);
        this.A04 = str;
        this.A03 = list;
        this.A05 = z;
        this.A02 = c51759Mti;
        this.A01 = c51759Mti2;
    }

    public static final C45111Jxg A00(Integer num, Integer num2, String str, List list, boolean z) {
        AbstractC25233BEq.A0v(0, list, num, num2);
        return new C45111Jxg(num, num2, str, list, z);
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C45111Jxg) {
                    C45111Jxg c45111Jxg = (C45111Jxg) obj;
                    if (c45111Jxg.A00 == 1 && C14360o3.A0K(this.A04, c45111Jxg.A04) && C14360o3.A0K(this.A03, c45111Jxg.A03) && this.A05 == c45111Jxg.A05 && C14360o3.A0K(this.A02, c45111Jxg.A02)) {
                        obj2 = this.A01;
                        obj3 = c45111Jxg.A01;
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
            if (!(obj instanceof C45111Jxg)) {
                return false;
            }
            C45111Jxg c45111Jxg2 = (C45111Jxg) obj;
            if (c45111Jxg2.A00 != 0 || !C14360o3.A0K(this.A01, c45111Jxg2.A01) || this.A05 != c45111Jxg2.A05 || this.A03 != c45111Jxg2.A03 || this.A02 != c45111Jxg2.A02) {
                return false;
            }
            obj2 = this.A04;
            obj3 = c45111Jxg2.A04;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        int A0H;
        int hashCode;
        if (this.A00 != 0) {
            A0H = AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A04))));
            Object obj = this.A01;
            if (obj != null) {
                hashCode = obj.hashCode();
            }
            hashCode = 0;
        } else {
            int A0D = AbstractC167007dF.A0D(this.A05, AbstractC166987dD.A0G(this.A01));
            int A0H2 = AbstractC166987dD.A0H(this.A03);
            switch (A0H2) {
                case 1:
                    str = "NULL";
                    break;
                case 2:
                    str = "NORMAL";
                    break;
                default:
                    str = "ERROR";
                    break;
            }
            int A0H3 = AbstractC25231BEo.A0H(str, A0H2, A0D);
            int A0H4 = AbstractC166987dD.A0H(this.A02);
            switch (A0H4) {
                case 1:
                    str2 = "HIDE";
                    break;
                case 2:
                    str2 = "GRAY_OUT";
                    break;
                default:
                    str2 = "SHOW";
                    break;
            }
            A0H = AbstractC25231BEo.A0H(str2, A0H4, A0H3);
            String str3 = this.A04;
            if (str3 != null) {
                hashCode = str3.hashCode();
            }
            hashCode = 0;
        }
        return A0H + hashCode;
    }

    public C45111Jxg(Integer num, Integer num2, String str, List list, boolean z) {
        this.A01 = list;
        this.A05 = z;
        this.A03 = num;
        this.A02 = num2;
        this.A04 = str;
    }
}
