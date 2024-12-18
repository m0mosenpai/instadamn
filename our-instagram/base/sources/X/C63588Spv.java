package X;

/* renamed from: X.Spv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63588Spv implements InterfaceC65297ThV {
    public final /* synthetic */ C60622REh A00;

    public C63588Spv(C60622REh c60622REh) {
        this.A00 = c60622REh;
    }

    @Override // X.InterfaceC65297ThV
    public final void onCancel() {
        ((C58444PvN) this.A00).A00.deleteObservers();
    }
}
