package X;

/* renamed from: X.8ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194198ie implements InterfaceC66482zP, InterfaceC127955qO {
    public final int A00;
    public final C203238yg A01;

    public C194198ie(C203238yg c203238yg, int i) {
        C14360o3.A0B(c203238yg, 1);
        this.A01 = c203238yg;
        this.A00 = i;
    }

    @Override // X.InterfaceC127955qO
    public final C127915qK BAN() {
        return new C127915qK(1, 1, 1, 1, 0.5625f);
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A01.A07;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C194198ie c194198ie = (C194198ie) obj;
        C14360o3.A0B(c194198ie, 0);
        return C14360o3.A0K(this.A01.A07, c194198ie.A01.A07);
    }
}
