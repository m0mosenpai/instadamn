package X;

/* loaded from: classes8.dex */
public final class Ld1 implements InterfaceC13000lm {
    public final L97 A00;
    public final C05A A01;
    public final C0UO A02;
    public final C47836LAy A03;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        L97 l97 = this.A00;
        l97.A02.A01();
        l97.A05.A01();
    }

    public Ld1(L97 l97, C47836LAy c47836LAy) {
        this.A00 = l97;
        this.A03 = c47836LAy;
        C008002u A00 = C10E.A00(MUq.A00);
        this.A01 = A00;
        this.A02 = AbstractC208910l.A02(A00);
    }
}
