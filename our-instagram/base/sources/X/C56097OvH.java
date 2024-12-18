package X;

/* renamed from: X.OvH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56097OvH implements InterfaceC66482zP {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "EARNINGS_CONTENT_KEY";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C56097OvH c56097OvH = (C56097OvH) obj;
        String str2 = this.A00;
        String str3 = null;
        if (c56097OvH != null) {
            str = c56097OvH.A00;
        } else {
            str = null;
        }
        if (AbstractC50102Ry.A00(str2, str)) {
            String str4 = this.A01;
            if (c56097OvH != null) {
                str3 = c56097OvH.A01;
            }
            if (AbstractC50102Ry.A00(str4, str3)) {
                return true;
            }
        }
        return false;
    }

    public C56097OvH(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
