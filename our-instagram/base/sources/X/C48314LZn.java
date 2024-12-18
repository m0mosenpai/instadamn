package X;

/* renamed from: X.LZn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48314LZn implements InterfaceC66482zP {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C48314LZn(Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        AbstractC167027dH.A0a(1, str, str2, str3, str4);
        C14360o3.A0B(str5, 6);
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A02 = str4;
        this.A06 = z;
        this.A01 = str5;
        this.A00 = num;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C48314LZn c48314LZn = (C48314LZn) obj;
        C14360o3.A0B(c48314LZn, 0);
        if (C14360o3.A0K(this.A05, c48314LZn.A05) && C14360o3.A0K(this.A02, c48314LZn.A02) && this.A06 == c48314LZn.A06 && C14360o3.A0K(this.A01, c48314LZn.A01)) {
            return true;
        }
        return false;
    }
}
