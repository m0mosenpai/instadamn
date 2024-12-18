package X;

/* renamed from: X.LZk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48311LZk implements InterfaceC66482zP {
    public Long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C48311LZk c48311LZk = (C48311LZk) obj;
        C14360o3.A0B(c48311LZk, 0);
        if (C14360o3.A0K(this.A04, c48311LZk.A04) && C14360o3.A0K(this.A05, c48311LZk.A05) && C14360o3.A0K(this.A01, c48311LZk.A01) && C14360o3.A0K(this.A03, c48311LZk.A03) && C14360o3.A0K(this.A02, c48311LZk.A02)) {
            return true;
        }
        return false;
    }

    public C48311LZk(Long l, Long l2, String str, String str2, String str3, String str4) {
        AbstractC167027dH.A13(str, str2, str3);
        C14360o3.A0B(str4, 6);
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A01 = l;
        this.A00 = l2;
        this.A02 = str4;
    }
}
