package X;

import java.util.Arrays;

/* renamed from: X.4At, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92134At {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92134At)) {
            return false;
        }
        C92134At c92134At = (C92134At) obj;
        return this.A00 == c92134At.A00 && this.A01 == c92134At.A01 && AbstractC50102Ry.A00(this.A03, c92134At.A03) && AbstractC50102Ry.A00(this.A02, c92134At.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01)});
    }

    public C92134At(String str, String str2, int i, int i2) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A01 = i2;
    }
}
