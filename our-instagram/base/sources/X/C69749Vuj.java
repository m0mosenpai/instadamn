package X;

import java.util.Arrays;

/* renamed from: X.Vuj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69749Vuj {
    public final int A00;
    public final Object[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && AbstractC167017dG.A1Z(this, obj)) {
                C69749Vuj c69749Vuj = (C69749Vuj) obj;
                if (this.A00 != c69749Vuj.A00 || !Arrays.equals(this.A01, c69749Vuj.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StringResWithArgs(stringRes=");
        sb.append(this.A00);
        sb.append(", formatArgs=");
        String arrays = Arrays.toString(this.A01);
        C14360o3.A07(arrays);
        return AbstractC25236BEt.A0Y(arrays, sb);
    }

    public C69749Vuj(Object[] objArr, int i) {
        this.A00 = i;
        this.A01 = objArr;
    }
}
