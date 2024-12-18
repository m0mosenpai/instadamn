package X;

/* loaded from: classes11.dex */
public final class WcM implements InterfaceC71908X9s {
    public final /* synthetic */ C4XU A00;

    public WcM(C4XU c4xu) {
        this.A00 = c4xu;
    }

    @Override // X.InterfaceC71908X9s
    public final void onInitialized() {
        long j;
        C4XU c4xu = this.A00;
        synchronized (AbstractC63115SdJ.A03) {
            if (AbstractC63115SdJ.A01) {
                j = AbstractC63115SdJ.A00;
            } else {
                j = -9223372036854775807L;
            }
        }
        C4XU.A01(c4xu, j);
    }
}
