package X;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class ABJ {
    public AG3 A00;
    public BCU A01;
    public BBX A02;

    public final void A00(AG3 ag3) {
        this.A00 = ag3;
        BCU bcu = this.A01;
        if (bcu != null) {
            int i = ag3.A00;
            ByteBuffer byteBuffer = ag3.A01;
            bcu.setConfiguration(i, byteBuffer, byteBuffer.position());
        }
    }
}
