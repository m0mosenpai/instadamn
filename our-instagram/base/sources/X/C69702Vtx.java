package X;

import java.util.Arrays;

/* renamed from: X.Vtx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69702Vtx {
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C69702Vtx c69702Vtx = (C69702Vtx) obj;
            if (this.A01 != c69702Vtx.A01 || this.A02 != c69702Vtx.A02 || this.A00 != c69702Vtx.A00 || !Arrays.equals(this.A03, c69702Vtx.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + Arrays.hashCode(this.A03)) * 31) + this.A02) * 31) + this.A00;
    }

    public C69702Vtx(int i, byte[] bArr, int i2, int i3) {
        this.A01 = i;
        this.A03 = bArr;
        this.A02 = i2;
        this.A00 = i3;
    }
}
