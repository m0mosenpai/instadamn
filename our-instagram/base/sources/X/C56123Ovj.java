package X;

/* renamed from: X.Ovj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56123Ovj implements InterfaceC66482zP, InterfaceC127955qO {
    public final ODx A00;

    public C56123Ovj(ODx oDx) {
        C14360o3.A0B(oDx, 1);
        this.A00 = oDx;
    }

    @Override // X.InterfaceC127955qO
    public final C127915qK BAN() {
        return new C127915qK(1, 1, 1, 1, 1.0f);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A04;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C56123Ovj c56123Ovj = (C56123Ovj) obj;
        String str2 = this.A00.A04;
        if (c56123Ovj != null) {
            str = c56123Ovj.A00.A04;
        } else {
            str = null;
        }
        return C14360o3.A0K(str2, str);
    }
}
