package X;

/* renamed from: X.OvE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56094OvE implements InterfaceC66482zP {
    public String A00;
    public final C56389P2a A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "mk_description";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56094OvE c56094OvE = (C56094OvE) obj;
        C14360o3.A0B(c56094OvE, 0);
        return C14360o3.A0K(c56094OvE.A00, this.A00);
    }

    public C56094OvE(C56389P2a c56389P2a, String str) {
        this.A00 = str;
        this.A01 = c56389P2a;
    }
}
