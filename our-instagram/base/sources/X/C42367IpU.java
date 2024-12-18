package X;

/* renamed from: X.IpU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42367IpU implements InterfaceC62702t9 {
    public final int A00;

    public C42367IpU(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC62702t9
    public final String BKe(C59062n7 c59062n7) {
        String str;
        String str2;
        int i = this.A00;
        C14360o3.A0B(c59062n7, 0);
        C39698HjU c39698HjU = (C39698HjU) c59062n7.A03;
        String str3 = c39698HjU.A04;
        if (i != 0) {
            str2 = "";
            if (str3 == null) {
                str3 = "";
            }
            str = c39698HjU.A03;
            if (str == null) {
                str = "";
            }
            EnumC39622HeW enumC39622HeW = c39698HjU.A01.A04;
            if (enumC39622HeW != null) {
                str2 = enumC39622HeW.toString();
            }
        } else {
            str = "";
            if (str3 == null) {
                str3 = "";
            }
            if (c39698HjU.A02 != null) {
                str = str3;
            }
            str2 = c39698HjU.A03;
        }
        return AnonymousClass001.A0u(str3, str, str2, "_LAST_VIEWED_IMPRESSION_TIME");
    }
}
