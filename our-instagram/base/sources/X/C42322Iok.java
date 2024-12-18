package X;

/* renamed from: X.Iok, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42322Iok implements InterfaceC66482zP {
    public final C51741MtQ A00;
    public final String A01;
    public final String A02;

    public C42322Iok(C51741MtQ c51741MtQ, String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = c51741MtQ;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51741MtQ c51741MtQ;
        C42322Iok c42322Iok = (C42322Iok) obj;
        C51741MtQ c51741MtQ2 = this.A00;
        if (c42322Iok != null) {
            c51741MtQ = c42322Iok.A00;
        } else {
            c51741MtQ = null;
        }
        return C14360o3.A0K(c51741MtQ2, c51741MtQ);
    }
}
