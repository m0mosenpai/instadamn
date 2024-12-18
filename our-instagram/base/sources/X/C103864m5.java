package X;

import java.util.Arrays;

/* renamed from: X.4m5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103864m5 {
    public final int A00;
    public final C1HX A01;
    public final C1EQ A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C103864m5)) {
            return false;
        }
        C103864m5 c103864m5 = (C103864m5) obj;
        return this.A03.equals(c103864m5.A03) && this.A00 == c103864m5.A00 && this.A01.equals(c103864m5.A01) && this.A02.equals(c103864m5.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, Integer.valueOf(this.A00), Integer.valueOf(this.A01.hashCode()), Integer.valueOf(this.A02.hashCode())});
    }

    public C103864m5(C1HX c1hx, C1EQ c1eq, String str, int i) {
        this.A03 = str;
        this.A00 = i;
        this.A01 = c1hx;
        this.A02 = c1eq;
    }
}
