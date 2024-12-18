package X;

import java.util.Arrays;

/* renamed from: X.5nk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126495nk extends C0T6 {
    public final float A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final byte[] A04;

    public C126495nk(String str, String str2, byte[] bArr, float f, long j) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(bArr, 3);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = bArr;
        this.A01 = j;
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C126495nk) {
                C126495nk c126495nk = (C126495nk) obj;
                if (!C14360o3.A0K(this.A02, c126495nk.A02) || !C14360o3.A0K(this.A03, c126495nk.A03) || !C14360o3.A0K(this.A04, c126495nk.A04) || this.A01 != c126495nk.A01 || Float.compare(this.A00, c126495nk.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31) + Arrays.hashCode(this.A04)) * 31;
        long j = this.A01;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.A00);
    }
}
