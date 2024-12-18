package X;

/* renamed from: X.SxT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63996SxT implements InterfaceC48212Jk {
    public final /* synthetic */ SCF A00;

    public C63996SxT(SCF scf) {
        this.A00 = scf;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        this.A00.A00.resumeWith(new UM0(th));
    }
}
