package X;

/* renamed from: X.Xa2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72246Xa2 extends AbstractC72082XNa implements InterfaceC72043Lc {
    public long A00;
    public long A01;

    @Override // X.InterfaceC55612h1
    public final void EQh(String str) {
        C14360o3.A0B(str, 0);
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return AbstractC167007dF.A1M((this.A01 > (-1L) ? 1 : (this.A01 == (-1L) ? 0 : -1)));
    }

    @Override // X.C3DC
    public final /* bridge */ /* synthetic */ Object F7f() {
        return super.A00.reinterpret(C33023EhR.class);
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A00;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A01;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A00 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A01 = j;
    }
}
