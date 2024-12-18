package X;

import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public abstract class Y8U implements YQP {
    public C73310Y1q A00;
    public C73310Y1q A01;
    public C73310Y1q A02;
    public C73310Y1q A03;
    public ByteBuffer A04;
    public ByteBuffer A05;

    @Override // X.YQP
    public final void reset() {
        ByteBuffer byteBuffer = YQP.A00;
        this.A04 = byteBuffer;
        this.A00 = this.A02;
        this.A01 = this.A03;
        boolean z = this instanceof XQE;
        if (z && ((XQE) this) == null) {
            throw new NullPointerException("pendingOutputAudioFormat");
        }
        this.A05 = byteBuffer;
        C73310Y1q c73310Y1q = C73310Y1q.A04;
        this.A02 = c73310Y1q;
        this.A03 = c73310Y1q;
        this.A00 = c73310Y1q;
        this.A01 = c73310Y1q;
        if (this instanceof XQD) {
            ((XQD) this).A00 = Util.A07;
        } else {
            if (!z) {
                return;
            }
            XQE xqe = (XQE) this;
            byte[] bArr = Util.A07;
            xqe.A01 = bArr;
            xqe.A00 = bArr;
        }
    }

    public Y8U() {
        ByteBuffer byteBuffer = YQP.A00;
        this.A05 = byteBuffer;
        this.A04 = byteBuffer;
        C73310Y1q c73310Y1q = C73310Y1q.A04;
        this.A02 = c73310Y1q;
        this.A03 = c73310Y1q;
        this.A00 = c73310Y1q;
        this.A01 = c73310Y1q;
    }
}
