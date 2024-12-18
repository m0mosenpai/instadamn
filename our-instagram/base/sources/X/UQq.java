package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class UQq extends C0T6 implements XFE {
    public final E8G A00;
    public final Integer A01;
    public final Integer A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQq) {
                UQq uQq = (UQq) obj;
                if (!C14360o3.A0K(this.A01, uQq.A01) || !C14360o3.A0K(this.A02, uQq.A02) || !C14360o3.A0K(this.A00, uQq.A00) || !C14360o3.A0K(this.A03, uQq.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
        List list = this.A03;
        if (list != null) {
            i = list.hashCode();
        }
        return A0M + i;
    }

    public UQq(E8G e8g, Integer num, Integer num2, List list) {
        this.A01 = num;
        this.A02 = num2;
        this.A00 = e8g;
        this.A03 = list;
    }
}
