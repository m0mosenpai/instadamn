package X;

/* renamed from: X.OvQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56106OvQ implements InterfaceC66482zP {
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C56106OvQ c56106OvQ = (C56106OvQ) obj;
        String str2 = this.A00;
        if (c56106OvQ != null) {
            str = c56106OvQ.A00;
        } else {
            str = null;
        }
        if (AbstractC50102Ry.A00(str2, str)) {
            String str3 = this.A02;
            if (AbstractC50102Ry.A00(str3, str3)) {
                return true;
            }
        }
        return false;
    }

    public C56106OvQ(String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }
}
