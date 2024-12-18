package X;

/* renamed from: X.OvI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56098OvI implements InterfaceC66482zP {
    public final InterfaceC43551JLl A00;
    public final String A01;
    public final boolean A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String accessToken;
        InterfaceC43551JLl interfaceC43551JLl = this.A00;
        if (interfaceC43551JLl == null || (accessToken = interfaceC43551JLl.getAccessToken()) == null) {
            return "";
        }
        return accessToken;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        String str2;
        C56098OvI c56098OvI = (C56098OvI) obj;
        InterfaceC43551JLl interfaceC43551JLl = this.A00;
        if (interfaceC43551JLl == null || (str = interfaceC43551JLl.getAccessToken()) == null) {
            str = "";
        }
        if (c56098OvI != null) {
            InterfaceC43551JLl interfaceC43551JLl2 = c56098OvI.A00;
            if (interfaceC43551JLl2 == null || (str2 = interfaceC43551JLl2.getAccessToken()) == null) {
                str2 = "";
            }
        } else {
            str2 = null;
        }
        if (str.equals(str2) && c56098OvI != null && this.A02 == c56098OvI.A02) {
            return true;
        }
        return false;
    }

    public C56098OvI(InterfaceC43551JLl interfaceC43551JLl, String str, boolean z) {
        this.A00 = interfaceC43551JLl;
        this.A02 = z;
        this.A01 = str;
    }
}
