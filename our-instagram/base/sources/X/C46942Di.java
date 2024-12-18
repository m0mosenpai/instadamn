package X;

import java.util.Arrays;

/* renamed from: X.2Di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46942Di {
    public String A00;
    public String A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C46942Di)) {
            return false;
        }
        C46942Di c46942Di = (C46942Di) obj;
        if (obj != this && (!AbstractC50102Ry.A00(this.A01, c46942Di.A01) || !AbstractC50102Ry.A00(this.A00, c46942Di.A00) || !AbstractC50102Ry.A00(this.A02, c46942Di.A02))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00, this.A02});
    }
}
