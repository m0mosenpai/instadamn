package X;

import java.nio.ByteBuffer;

/* renamed from: X.5Sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117405Sz extends C96094Ts {
    public int A00;
    public int A01;
    public long A02;

    public C117405Sz() {
        super(2);
        this.A00 = 32;
    }

    public final boolean A02(C96094Ts c96094Ts) {
        ByteBuffer byteBuffer;
        boolean z = false;
        if ((((AbstractC96104Tt) c96094Ts).A00 & AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO) == 1073741824) {
            z = true;
        }
        C4B8.A03(!z);
        boolean z2 = false;
        if ((((AbstractC96104Tt) c96094Ts).A00 & 268435456) == 268435456) {
            z2 = true;
        }
        C4B8.A03(!z2);
        boolean z3 = false;
        if ((((AbstractC96104Tt) c96094Ts).A00 & 4) == 4) {
            z3 = true;
        }
        C4B8.A03(!z3);
        int i = this.A01;
        if (i > 0) {
            if (i < this.A00) {
                boolean z4 = false;
                if ((((AbstractC96104Tt) c96094Ts).A00 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                    z4 = true;
                }
                boolean z5 = false;
                if ((((AbstractC96104Tt) this).A00 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                    z5 = true;
                }
                if (z4 == z5) {
                    ByteBuffer byteBuffer2 = c96094Ts.A02;
                    if (byteBuffer2 != null && (byteBuffer = super.A02) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 == 0) {
            super.A01 = c96094Ts.A01;
            if ((((AbstractC96104Tt) c96094Ts).A00 & 1) == 1) {
                ((AbstractC96104Tt) this).A00 = 1;
            }
        }
        if ((((AbstractC96104Tt) c96094Ts).A00 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            ((AbstractC96104Tt) this).A00 = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = c96094Ts.A02;
        if (byteBuffer3 != null) {
            A01(byteBuffer3.remaining());
            super.A02.put(byteBuffer3);
        }
        this.A02 = c96094Ts.A01;
        return true;
    }

    @Override // X.C96094Ts, X.AbstractC96104Tt
    public final void clear() {
        super.clear();
        this.A01 = 0;
    }
}
