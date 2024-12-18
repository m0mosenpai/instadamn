package X;

/* loaded from: classes4.dex */
public final class AYO implements InterfaceC170577jA {
    public final /* synthetic */ C169917i6 A00;

    public AYO(C169917i6 c169917i6) {
        this.A00 = c169917i6;
    }

    @Override // X.InterfaceC170577jA
    public final void FDi(int i, int i2, int i3, int i4, int i5) {
        AbstractC169857hz abstractC169857hz;
        C169917i6 c169917i6 = this.A00;
        synchronized (c169917i6) {
            abstractC169857hz = c169917i6.A02;
        }
        if (abstractC169857hz != null) {
            C169917i6.A0D(abstractC169857hz, c169917i6, i, i2, i3, i4, i5);
        }
    }
}
