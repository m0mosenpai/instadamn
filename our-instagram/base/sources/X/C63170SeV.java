package X;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* renamed from: X.SeV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63170SeV {
    public static final C62626SJj A03 = new Object();
    public final long A00;
    public final long A01;
    public final EnumC61063Rec A02;

    private final byte[] A00(long j) {
        int i;
        EnumC61063Rec enumC61063Rec = this.A02;
        if (enumC61063Rec instanceof QEZ) {
            i = 3;
        } else if (enumC61063Rec instanceof QEY) {
            i = 20;
        } else if (enumC61063Rec instanceof QEX) {
            i = 64;
        } else {
            i = 8;
        }
        int ceil = (int) Math.ceil(i / 8.0d);
        ByteBuffer A17 = AbstractC58320PtC.A17(8);
        A17.putLong(j);
        byte[] array = A17.array();
        C14360o3.A07(array);
        byte[] bArr = new byte[ceil];
        System.arraycopy(array, 0, bArr, 0, ceil);
        return bArr;
    }

    public C63170SeV(EnumC61063Rec enumC61063Rec, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = enumC61063Rec;
    }

    public final byte[] A01() {
        ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
        A0U.write(A00(this.A00));
        A0U.write(A00(this.A01));
        byte[] byteArray = A0U.toByteArray();
        C14360o3.A07(byteArray);
        return byteArray;
    }
}
