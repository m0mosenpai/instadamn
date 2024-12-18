package X;

/* loaded from: classes8.dex */
public final class LRX implements InterfaceC65626Tpm {
    public final /* synthetic */ int A00;

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onResume(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public LRX(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC65626Tpm
    public final void onDestroy(C07X c07x) {
        AbstractC47892LDm.A00.remove(Integer.valueOf(this.A00));
    }
}
