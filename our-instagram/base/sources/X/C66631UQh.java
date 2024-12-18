package X;

import java.util.List;

/* renamed from: X.UQh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66631UQh extends C0T6 implements JIS {
    public final Integer A00;
    public final Integer A01;
    public final List A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66631UQh) {
                C66631UQh c66631UQh = (C66631UQh) obj;
                if (!C14360o3.A0K(this.A00, c66631UQh.A00) || !C14360o3.A0K(this.A03, c66631UQh.A03) || !C14360o3.A0K(this.A01, c66631UQh.A01) || !C14360o3.A0K(this.A02, c66631UQh.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        }
        return A0M + i;
    }

    public C66631UQh(Integer num, Integer num2, List list, List list2) {
        this.A00 = num;
        this.A03 = list;
        this.A01 = num2;
        this.A02 = list2;
    }
}
