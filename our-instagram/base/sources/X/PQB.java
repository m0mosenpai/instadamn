package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class PQB implements Runnable {
    public final /* synthetic */ InterfaceC58036PoM A00;
    public final /* synthetic */ IOException A01;

    public PQB(InterfaceC58036PoM interfaceC58036PoM, IOException iOException) {
        this.A01 = iOException;
        this.A00 = interfaceC58036PoM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IOException iOException = this.A01;
        AbstractC12120kG.A0G("ClipsGalleryUploadTranscoder", "Could not extract media duration for transcoding", iOException);
        this.A00.Dv5(iOException, false);
    }
}
