package X;

/* renamed from: X.MuW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51766MuW extends C0T6 implements InterfaceC58104PpT {
    public final C51600Mqs A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public C51766MuW(C51600Mqs c51600Mqs, Integer num, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(num, 2);
        this.A04 = str;
        this.A01 = num;
        this.A05 = str2;
        this.A06 = str3;
        this.A00 = c51600Mqs;
        this.A03 = str4;
        this.A02 = str5;
        this.A07 = AbstractC167007dF.A1W(c51600Mqs);
    }

    @Override // X.InterfaceC58104PpT
    public final String Ar1() {
        return this.A04;
    }

    @Override // X.InterfaceC58104PpT
    public final Integer Ar7() {
        return this.A01;
    }

    @Override // X.InterfaceC58104PpT
    public final boolean Cff() {
        return this.A07;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C51766MuW) {
            C51766MuW c51766MuW = (C51766MuW) obj;
            if (C14360o3.A0K(c51766MuW.A04, this.A04) && c51766MuW.A01 == this.A01) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A04) + AbstractC53739Npr.A00(this.A01);
    }
}
