package X;

/* renamed from: X.OvC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56092OvC implements InterfaceC66482zP {
    public final JPd A00;
    public final String A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A00.getId();
        if (id != null) {
            return id;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56092OvC c56092OvC = (C56092OvC) obj;
        C14360o3.A0B(c56092OvC, 0);
        String id = this.A00.getId();
        if (id != null) {
            String id2 = c56092OvC.A00.getId();
            if (id2 != null) {
                if (id.equals(id2) && C14360o3.A0K(this.A01, c56092OvC.A01)) {
                    return true;
                }
                return false;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    public C56092OvC(JPd jPd, String str) {
        this.A00 = jPd;
        this.A01 = str;
    }
}
