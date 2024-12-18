package X;

import java.util.List;

/* renamed from: X.MuY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51768MuY extends C0T6 implements InterfaceC58104PpT {
    public final C50679MYx A00;
    public final C45116Jxl A01;
    public final C51600Mqs A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;
    public final Integer A0B;

    public C51768MuY(C50679MYx c50679MYx, C45116Jxl c45116Jxl, C51600Mqs c51600Mqs, Integer num, Integer num2, String str, String str2, String str3, List list, List list2) {
        AbstractC25229BEm.A1I(list, 4, num);
        C14360o3.A0B(num2, 10);
        this.A05 = str;
        this.A06 = str2;
        this.A02 = c51600Mqs;
        this.A09 = list;
        this.A01 = c45116Jxl;
        this.A03 = num;
        this.A08 = list2;
        this.A00 = c50679MYx;
        this.A07 = str3;
        this.A04 = num2;
        this.A0B = C05F.A01;
        this.A0A = AbstractC167007dF.A1W(c51600Mqs);
    }

    @Override // X.InterfaceC58104PpT
    public final String Ar1() {
        return this.A05;
    }

    @Override // X.InterfaceC58104PpT
    public final Integer Ar7() {
        return this.A0B;
    }

    @Override // X.InterfaceC58104PpT
    public final boolean Cff() {
        return this.A0A;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C51768MuY) && C14360o3.A0K(((C51768MuY) obj).A05, this.A05)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A05.hashCode();
    }
}
