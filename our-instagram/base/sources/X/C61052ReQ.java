package X;

import com.facebook.common.dextricks.Constants;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.ReQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61052ReQ extends OutputStream {
    public static final byte[] A05 = new byte[0];
    public int A00;
    public byte[] A01;
    public int A02;
    public final C16G A03;
    public final LinkedList A04;

    public final void A01() {
        this.A02 = 0;
        this.A00 = 0;
        LinkedList linkedList = this.A04;
        if (!linkedList.isEmpty()) {
            linkedList.clear();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public static void A00(C61052ReQ c61052ReQ) {
        int i = c61052ReQ.A02;
        byte[] bArr = c61052ReQ.A01;
        int length = i + bArr.length;
        if (length >= 0) {
            c61052ReQ.A02 = length;
            int max = Math.max(length >> 1, 1000);
            if (max > 131072) {
                max = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            }
            c61052ReQ.A04.add(bArr);
            c61052ReQ.A01 = new byte[max];
            c61052ReQ.A00 = 0;
            return;
        }
        throw AbstractC166987dD.A14("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
    }

    public final void A02(int i) {
        if (this.A00 >= this.A01.length) {
            A00(this);
        }
        byte[] bArr = this.A01;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final void A03(int i) {
        int i2 = this.A00;
        int i3 = i2 + 2;
        byte[] bArr = this.A01;
        if (i3 < bArr.length) {
            int i4 = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (i >> 8);
            this.A00 = i5 + 1;
            bArr[i5] = (byte) i;
            return;
        }
        A02(i >> 16);
        A02(i >> 8);
        A02(i);
    }

    public final void A04(int i) {
        int i2 = this.A00;
        int i3 = i2 + 1;
        byte[] bArr = this.A01;
        if (i3 < bArr.length) {
            bArr[i2] = (byte) (i >> 8);
            this.A00 = i3 + 1;
            bArr[i3] = (byte) i;
        } else {
            A02(i >> 8);
            A02(i);
        }
    }

    public final byte[] A05() {
        int i = this.A02 + this.A00;
        if (i == 0) {
            return A05;
        }
        byte[] bArr = new byte[i];
        LinkedList linkedList = this.A04;
        Iterator it = linkedList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = AbstractC58320PtC.A00(bArr, it, i2);
        }
        System.arraycopy(this.A01, 0, bArr, i2, this.A00);
        int i3 = i2 + this.A00;
        if (i3 == i) {
            if (linkedList.isEmpty()) {
                return bArr;
            }
            A01();
            return bArr;
        }
        throw AbstractC166987dD.A18(AnonymousClass001.A0n("Internal error: total len assumed to be ", ", copied ", " bytes", i, i3));
    }

    public C61052ReQ(byte[] bArr, int i) {
        this.A04 = AbstractC58318PtA.A11();
        this.A03 = null;
        this.A01 = bArr;
        this.A00 = i;
    }

    public C61052ReQ(C16G c16g) {
        byte[] A00;
        this.A04 = AbstractC58318PtA.A11();
        this.A03 = c16g;
        if (c16g == null) {
            A00 = new byte[500];
        } else {
            A00 = c16g.A00(2);
        }
        this.A01 = A00;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        while (true) {
            byte[] bArr2 = this.A01;
            int length = bArr2.length;
            int i3 = this.A00;
            int min = Math.min(length - i3, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, bArr2, i3, min);
                i += min;
                this.A00 += min;
                i2 -= min;
            }
            if (i2 <= 0) {
                return;
            } else {
                A00(this);
            }
        }
    }

    public C61052ReQ(int i) {
        this.A04 = AbstractC58318PtA.A11();
        this.A03 = null;
        this.A01 = new byte[100];
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        A02(i);
    }

    public C61052ReQ() {
        this((C16G) null);
    }
}
