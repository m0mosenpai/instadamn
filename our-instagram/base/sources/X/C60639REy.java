package X;

import java.util.Arrays;

/* renamed from: X.REy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60639REy extends AbstractC61582Rq6 {
    public final EnumC61103RfI A00;
    public final String A01;
    public final byte[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AbstractC61582Rq6)) {
                return false;
            }
            C60639REy c60639REy = (C60639REy) ((AbstractC61582Rq6) obj);
            if (!this.A01.equals(c60639REy.A01) || !Arrays.equals(this.A02, c60639REy.A02) || !this.A00.equals(c60639REy.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.A01.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.A02)) * 1000003) ^ this.A00.hashCode();
    }

    public C60639REy(EnumC61103RfI enumC61103RfI, String str, byte[] bArr) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = enumC61103RfI;
    }
}
