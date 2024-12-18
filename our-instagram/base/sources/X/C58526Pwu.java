package X;

import java.util.Arrays;

/* renamed from: X.Pwu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58526Pwu {
    public final byte[] A00;

    public C58526Pwu(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.A00 = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static C58526Pwu A00(final byte[] data) {
        if (data != null) {
            return new C58526Pwu(data, data.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final byte[] A01() {
        byte[] bArr = this.A00;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object o) {
        if (!(o instanceof C58526Pwu)) {
            return false;
        }
        return Arrays.equals(((C58526Pwu) o).A00, this.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0g("Bytes(", AbstractC58562Pxe.A00(this.A00), ")");
    }
}
