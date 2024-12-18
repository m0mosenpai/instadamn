package X;

import java.nio.ByteBuffer;

/* renamed from: X.4Ts, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C96094Ts extends AbstractC96104Tt {
    public static final C96094Ts $redex_init_class = null;
    public long A00;
    public long A01;
    public ByteBuffer A02;
    public ByteBuffer A03;
    public boolean A04;
    public final int A05;
    public final C96114Tu A06 = new C96114Tu();

    @Override // X.AbstractC96104Tt
    public void clear() {
        super.A00 = 0;
        ByteBuffer byteBuffer = this.A02;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.A03;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.A04 = false;
    }

    static {
        C460829s.A00("goog.exo.decoder");
    }

    public final void A00() {
        ByteBuffer byteBuffer = this.A02;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.A03;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final void A01(int i) {
        int capacity;
        ByteBuffer allocateDirect;
        ByteBuffer byteBuffer = this.A02;
        if (byteBuffer == null) {
            int i2 = this.A05;
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
                this.A02 = byteBuffer;
                return;
            }
            int i4 = this.A05;
            if (i4 == 1) {
                allocateDirect = ByteBuffer.allocate(i3);
            } else if (i4 == 2) {
                allocateDirect = ByteBuffer.allocateDirect(i3);
            } else {
                ByteBuffer byteBuffer2 = this.A02;
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
        this.A02 = allocateDirect;
    }

    public C96094Ts(int i) {
        this.A05 = i;
    }
}
