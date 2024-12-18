package X;

/* renamed from: X.Jdu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44069Jdu implements InterfaceC2056798r {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C44069Jdu(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC2056798r
    public final /* bridge */ /* synthetic */ void Dn9(C7J1 c7j1) {
        if (this.A00 != 0) {
            ((InterfaceC2056798r) this.A02).Dn9(c7j1);
            return;
        }
        C99G c99g = (C99G) c7j1;
        C14360o3.A0B(c99g, 0);
        ((InterfaceC50423MOd) this.A01).Dsq(((C7J1) c99g).A03, c99g.A01, ((C7J1) c99g).A02);
        ((C43631JRo) this.A02).A00 = null;
    }
}
