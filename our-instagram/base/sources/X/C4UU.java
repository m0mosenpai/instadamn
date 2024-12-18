package X;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* renamed from: X.4UU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4UU extends C4UI {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public byte[] A06 = Util.A06;

    @Override // X.C4UI, X.C4UE
    public final ByteBuffer BaE() {
        int i;
        if (super.CTt() && (i = this.A00) > 0) {
            ByteBuffer A02 = A02(i);
            A02.put(this.A06, 0, this.A00);
            A02.flip();
            this.A00 = 0;
        }
        ByteBuffer byteBuffer = super.A01;
        super.A01 = C4UE.A00;
        return byteBuffer;
    }

    @Override // X.C4UI, X.C4UE
    public final boolean CTt() {
        if (super.CTt() && this.A00 == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C4UE
    public final void E7Z(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int i2 = this.A01;
            int min = Math.min(i, i2);
            this.A04 += min / super.A00.A00;
            this.A01 = i2 - min;
            byteBuffer.position(position + min);
            if (this.A01 <= 0) {
                int i3 = i - min;
                int length = (this.A00 + i3) - this.A06.length;
                ByteBuffer A02 = A02(length);
                int max = Math.max(0, Math.min(length, this.A00));
                A02.put(this.A06, 0, max);
                int max2 = Math.max(0, Math.min(length - max, i3));
                byteBuffer.limit(byteBuffer.position() + max2);
                A02.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i3 - max2;
                int i5 = this.A00 - max;
                this.A00 = i5;
                byte[] bArr = this.A06;
                System.arraycopy(bArr, max, bArr, 0, i5);
                byteBuffer.get(this.A06, this.A00, i4);
                this.A00 += i4;
                A02.flip();
            }
        }
    }
}
