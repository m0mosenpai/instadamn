package X;

/* loaded from: classes10.dex */
public final class T09 implements InterfaceC65354Tii {
    public final /* synthetic */ C64489TFz A00;

    public T09(C64489TFz c64489TFz) {
        this.A00 = c64489TFz;
    }

    @Override // X.InterfaceC65354Tii
    public final void handleMemoryPressure(int i) {
        C64489TFz c64489TFz;
        C63343Shy c63343Shy;
        if (i == 80 && (c63343Shy = (c64489TFz = this.A00).A02) != null && c63343Shy.A0I == C05F.A00) {
            c64489TFz.A03();
        }
    }
}
