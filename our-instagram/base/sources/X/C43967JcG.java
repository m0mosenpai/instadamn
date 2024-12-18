package X;

/* renamed from: X.JcG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43967JcG implements InterfaceC50441MOv {
    public final /* synthetic */ JR2 A00;
    public final /* synthetic */ MSJ A01;

    public C43967JcG(JR2 jr2, MSJ msj) {
        this.A00 = jr2;
        this.A01 = msj;
    }

    @Override // X.InterfaceC50441MOv
    public final void Dsn(C44079Je4 c44079Je4) {
        C6C2 c6c2 = c44079Je4.A01;
        C14360o3.A07(c6c2);
        String str = c6c2.A01;
        if (str != null || c6c2.A00 != null) {
            C81663kb A04 = C2DU.A04((C2DU) this.A00.A0w(), str, c6c2.A00);
            if (A04 != null) {
                this.A01.FD1(A04);
            }
        }
    }
}
