package X;

import android.os.SystemClock;
import java.util.Arrays;

/* renamed from: X.3Sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73743Sc extends C0T6 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C72793Ob[] A03;
    public final long A04;

    public C73743Sc(C72793Ob[] c72793ObArr, int i, int i2, long j) {
        C14360o3.A0B(c72793ObArr, 1);
        this.A03 = c72793ObArr;
        this.A04 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = SystemClock.elapsedRealtime() - j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C73743Sc) {
                C73743Sc c73743Sc = (C73743Sc) obj;
                if (!C14360o3.A0K(this.A03, c73743Sc.A03) || this.A04 != c73743Sc.A04 || this.A00 != c73743Sc.A00 || this.A01 != c73743Sc.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.A03) * 31;
        long j = this.A04;
        return ((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.A00) * 31) + this.A01;
    }
}
