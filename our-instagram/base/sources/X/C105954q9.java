package X;

import java.util.Arrays;

/* renamed from: X.4q9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105954q9 {
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C105954q9 c105954q9 = (C105954q9) obj;
            if (!AbstractC50102Ry.A00(this.A05, c105954q9.A05) || !AbstractC50102Ry.A00(this.A03, c105954q9.A03) || !AbstractC50102Ry.A00(this.A00, c105954q9.A00) || !AbstractC50102Ry.A00(this.A06, c105954q9.A06) || !AbstractC50102Ry.A00(this.A04, c105954q9.A04) || !AbstractC50102Ry.A00(this.A02, c105954q9.A02) || !AbstractC50102Ry.A00(this.A01, c105954q9.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A03, this.A00, this.A06, this.A04, this.A02, this.A01});
    }
}
