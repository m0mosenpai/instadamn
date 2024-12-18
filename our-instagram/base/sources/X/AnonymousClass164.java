package X;

import java.io.Serializable;

/* renamed from: X.164, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass164 implements AnonymousClass165, Serializable {
    public static final AnonymousClass166 A04 = AnonymousClass166.A00;
    public byte[] A00;
    public byte[] A01;
    public char[] A02;
    public final String A03;

    @Override // X.AnonymousClass165
    public final int ABl(byte[] bArr, int i) {
        byte[] bArr2 = this.A00;
        if (bArr2 == null) {
            bArr2 = A04.A02(this.A03);
            this.A00 = bArr2;
        }
        int length = bArr2.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        return length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            return this.A03.equals(((AnonymousClass164) obj).A03);
        }
        return false;
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final String toString() {
        return this.A03;
    }

    public AnonymousClass164(String str) {
        if (str != null) {
            this.A03 = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }
}
