package X;

import java.nio.ByteBuffer;

/* renamed from: X.UFi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C66397UFi extends AbstractC68228VIo {
    public long A00;
    public ByteBuffer A01;
    public ByteBuffer A02;
    public final int A03;
    public final C69315VlN A04 = new C69315VlN();

    public void A00() {
        super.A00 = 0;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.A02;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }

    static {
        C63102Sd5.A00("media3.decoder");
    }

    public final void A01(int i) {
        int capacity;
        ByteBuffer allocateDirect;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            int i2 = this.A03;
            if (i2 == 1) {
                allocateDirect = ByteBuffer.allocate(i);
            } else if (i2 == 2) {
                allocateDirect = ByteBuffer.allocateDirect(i);
            } else {
                throw new IllegalStateException(AnonymousClass001.A0n("Buffer too small (", " < ", ")", 0, i));
            }
        } else {
            int capacity2 = byteBuffer.capacity();
            int position = byteBuffer.position();
            int i3 = i + position;
            if (capacity2 >= i3) {
                this.A01 = byteBuffer;
                return;
            }
            int i4 = this.A03;
            if (i4 == 1) {
                allocateDirect = ByteBuffer.allocate(i3);
            } else if (i4 == 2) {
                allocateDirect = ByteBuffer.allocateDirect(i3);
            } else {
                ByteBuffer byteBuffer2 = this.A01;
                if (byteBuffer2 == null) {
                    capacity = 0;
                } else {
                    capacity = byteBuffer2.capacity();
                }
                throw new IllegalStateException(AnonymousClass001.A0n("Buffer too small (", " < ", ")", capacity, i3));
            }
            allocateDirect.order(byteBuffer.order());
            if (position > 0) {
                byteBuffer.flip();
                allocateDirect.put(byteBuffer);
            }
        }
        this.A01 = allocateDirect;
    }

    public C66397UFi(int i) {
        this.A03 = i;
    }
}
