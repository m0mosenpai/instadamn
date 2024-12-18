package X;

import java.util.Arrays;

/* renamed from: X.4ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98094ao {
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C98094ao c98094ao = (C98094ao) obj;
            if (this.A01 != c98094ao.A01 || this.A02 != c98094ao.A02 || this.A00 != c98094ao.A00 || !Arrays.equals(this.A03, c98094ao.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + Arrays.hashCode(this.A03)) * 31) + this.A02) * 31) + this.A00;
    }

    public C98094ao(int i, byte[] bArr, int i2, int i3) {
        this.A01 = i;
        this.A03 = bArr;
        this.A02 = i2;
        this.A00 = i3;
    }
}
