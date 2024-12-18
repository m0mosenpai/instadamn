package X;

/* loaded from: classes12.dex */
public final class YHF implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ XQ2 A01;

    public YHF(XQ2 xq2, int i) {
        this.A01 = xq2;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9TO c9to = this.A01.A02;
        if (c9to == null) {
            C14360o3.A0F("cameraPreview");
            throw C00O.createAndThrow();
        }
        c9to.setVisibility(this.A00);
    }
}
