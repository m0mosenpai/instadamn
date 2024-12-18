package X;

/* renamed from: X.Fy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36186Fy0 implements InterfaceC66482zP {
    public final C34542FKc A00;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C34542FKc c34542FKc;
        C36186Fy0 c36186Fy0 = (C36186Fy0) obj;
        C34542FKc c34542FKc2 = this.A00;
        if (c36186Fy0 != null) {
            c34542FKc = c36186Fy0.A00;
        } else {
            c34542FKc = null;
        }
        return C14360o3.A0K(c34542FKc2, c34542FKc);
    }

    public C36186Fy0(C34542FKc c34542FKc) {
        this.A00 = c34542FKc;
    }
}
