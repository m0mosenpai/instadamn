package X;

import java.util.Arrays;

/* renamed from: X.4Xt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97084Xt extends C0T6 {
    public final long A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public C97084Xt(String str, String str2, byte[] bArr, long j) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(bArr, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = bArr;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C97084Xt) {
                C97084Xt c97084Xt = (C97084Xt) obj;
                if (!C14360o3.A0K(this.A01, c97084Xt.A01) || !C14360o3.A0K(this.A02, c97084Xt.A02) || !C14360o3.A0K(this.A03, c97084Xt.A03) || this.A00 != c97084Xt.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + Arrays.hashCode(this.A03)) * 31;
        long j = this.A00;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }
}
