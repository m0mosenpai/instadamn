package X;

import java.io.DataInputStream;
import java.io.EOFException;
import java.nio.ByteOrder;

/* renamed from: X.SfP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63219SfP {
    public int A00;
    public int A01;
    public final C63219SfP A02;
    public final DataInputStream A03;

    private void A00() {
        int i;
        int i2 = this.A01;
        if (i2 >= 0 && (i = this.A00) > i2) {
            throw new EOFException(AnonymousClass001.A02(i2, i, "Invalid access: limit=", ", consumed="));
        }
    }

    public final byte A01() {
        this.A00++;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            return dataInputStream.readByte();
        }
        C63219SfP c63219SfP = this.A02;
        if (c63219SfP != null) {
            return c63219SfP.A01();
        }
        throw AbstractC166987dD.A15("Source input stream was not setup.");
    }

    public final int A02() {
        this.A00 += 4;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            int readInt = dataInputStream.readInt();
            if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                return Integer.reverseBytes(readInt);
            }
            return readInt;
        }
        C63219SfP c63219SfP = this.A02;
        if (c63219SfP != null) {
            return c63219SfP.A02();
        }
        throw AbstractC166987dD.A15("Source input stream was not setup.");
    }

    public final short A03() {
        this.A00 += 2;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            short readShort = dataInputStream.readShort();
            if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                return Short.reverseBytes(readShort);
            }
            return readShort;
        }
        C63219SfP c63219SfP = this.A02;
        if (c63219SfP != null) {
            return c63219SfP.A03();
        }
        throw AbstractC166987dD.A15("Source input stream was not setup.");
    }

    public final void A04(int i) {
        this.A00 += i;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            dataInputStream.skipBytes(i);
            return;
        }
        C63219SfP c63219SfP = this.A02;
        if (c63219SfP != null) {
            c63219SfP.A04(i);
            return;
        }
        throw AbstractC166987dD.A15("Source input stream was not setup.");
    }

    public final void A05(byte[] bArr) {
        this.A00 += bArr.length;
        A00();
        DataInputStream dataInputStream = this.A03;
        if (dataInputStream != null) {
            dataInputStream.readFully(bArr);
            return;
        }
        C63219SfP c63219SfP = this.A02;
        if (c63219SfP != null) {
            c63219SfP.A05(bArr);
            return;
        }
        throw AbstractC166987dD.A15("Source input stream was not setup.");
    }

    public C63219SfP(C63219SfP c63219SfP) {
        this.A03 = null;
        this.A02 = c63219SfP;
    }

    public C63219SfP(DataInputStream dataInputStream) {
        this.A03 = dataInputStream;
        this.A02 = null;
    }
}
