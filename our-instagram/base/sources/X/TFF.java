package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class TFF implements InterfaceC26491Qe {
    public C3JQ A00;
    public final ByteArrayOutputStream A01 = AbstractC58318PtA.A0U();
    public final /* synthetic */ SFP A02;
    public final /* synthetic */ Q07 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Executor A05;

    @Override // X.InterfaceC26491Qe
    public final void onNewData(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        this.A01.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    public TFF(SFP sfp, Q07 q07, String str, Executor executor) {
        this.A05 = executor;
        this.A02 = sfp;
        this.A03 = q07;
        this.A04 = str;
    }

    @Override // X.InterfaceC26491Qe
    public final void onComplete() {
        this.A05.execute(new RunnableC64708TQp(this.A02, this, this.A03, this.A04));
    }

    @Override // X.InterfaceC26491Qe
    public final void onFailed(IOException iOException) {
        this.A05.execute(new TQC(this.A02, this.A03, iOException));
    }

    @Override // X.InterfaceC26491Qe
    public final void onResponseStarted(C3JQ c3jq) {
        this.A00 = c3jq;
    }
}
