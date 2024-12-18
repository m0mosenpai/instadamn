package X;

/* renamed from: X.OvP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56105OvP implements InterfaceC66482zP {
    public final int A00;
    public final JPd A01;
    public final C38895HAr A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.getId();
    }

    public C56105OvP(JPd jPd, C38895HAr c38895HAr, int i) {
        this.A01 = jPd;
        this.A02 = c38895HAr;
        this.A00 = i;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
