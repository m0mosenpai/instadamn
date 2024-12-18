package X;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class YG8 implements Runnable {
    public final /* synthetic */ Y9T A00;

    public YG8(Y9T y9t) {
        this.A00 = y9t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC175967sB interfaceC175967sB;
        Y9T y9t = this.A00;
        Integer num = y9t.A0B;
        Integer num2 = C05F.A0C;
        if (num == num2) {
            try {
                MediaCodec mediaCodec = y9t.A01;
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(y9t.A05.A04);
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer byteBuffer = mediaCodec.getInputBuffers()[dequeueInputBuffer];
                    byteBuffer.clear();
                    C73493YFw c73493YFw = new C73493YFw(mediaCodec, byteBuffer, dequeueInputBuffer);
                    try {
                        if (y9t.A0B == num2 && (interfaceC175967sB = y9t.A07.A00.A00) != null) {
                            interfaceC175967sB.DMG(c73493YFw);
                        }
                        c73493YFw.close();
                    } finally {
                    }
                }
            } catch (Exception e) {
                y9t.A04.A01("rARe");
                y9t.A08.A01(e);
            }
            y9t.A03.post(y9t.A09);
        }
    }
}
