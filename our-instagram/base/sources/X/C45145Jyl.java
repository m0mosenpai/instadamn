package X;

import java.util.List;

/* renamed from: X.Jyl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45145Jyl extends C0T6 implements Gb1 {
    public final E82 A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final Integer A04;

    public C45145Jyl(E82 e82, Integer num, String str, List list, List list2) {
        C14360o3.A0B(list, 3);
        this.A04 = num;
        this.A00 = e82;
        this.A02 = list;
        this.A03 = list2;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45145Jyl) {
                C45145Jyl c45145Jyl = (C45145Jyl) obj;
                if (!C14360o3.A0K(this.A04, c45145Jyl.A04) || !C14360o3.A0K(this.A00, c45145Jyl.A00) || !C14360o3.A0K(this.A02, c45145Jyl.A02) || !C14360o3.A0K(this.A03, c45145Jyl.A03) || !C14360o3.A0K(this.A01, c45145Jyl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A02, ((AbstractC167017dG.A0M(this.A04) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC25227BEk.A07(this.A01);
    }
}
