package X;

/* loaded from: classes9.dex */
public final class PQ9 implements Runnable {
    public final /* synthetic */ InterfaceC58036PoM A00;
    public final /* synthetic */ Exception A01;

    public PQ9(InterfaceC58036PoM interfaceC58036PoM, Exception exc) {
        this.A01 = exc;
        this.A00 = interfaceC58036PoM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc = this.A01;
        AbstractC12120kG.A0G("ClipsGalleryUploadTranscoder", "Could not transcode, media metadata is probably corrupt", exc);
        if (exc != null) {
            this.A00.Dv5(exc, true);
        }
    }
}
