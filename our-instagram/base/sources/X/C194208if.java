package X;

/* renamed from: X.8if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194208if implements InterfaceC66482zP, InterfaceC127955qO {
    public final String A00;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C194208if c194208if = (C194208if) obj;
        C14360o3.A0B(c194208if, 0);
        return C14360o3.A0K(this.A00, c194208if.A00);
    }

    public C194208if(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC127955qO
    public final C127915qK BAN() {
        return AbstractC127905qJ.A00();
    }
}
