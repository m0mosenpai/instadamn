package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes11.dex */
public final class URF extends C0T6 implements XG6 {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final List A03;

    @Override // X.XG6
    public final URF Eyv() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URF) {
                URF urf = (URF) obj;
                if (!C14360o3.A0K(this.A03, urf.A03) || !C14360o3.A0K(this.A00, urf.A00) || !C14360o3.A0K(this.A02, urf.A02) || !C14360o3.A0K(this.A01, urf.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XG6
    public final List Avr() {
        return this.A03;
    }

    @Override // X.XG6
    public final Integer B23() {
        return this.A00;
    }

    @Override // X.XG6
    public final String BKx() {
        return this.A02;
    }

    @Override // X.XG6
    public final Integer Bzj() {
        return this.A01;
    }

    @Override // X.XG6
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTQuietTimeInterval", AbstractC68388VOw.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
        Integer num = this.A01;
        if (num != null) {
            i = num.hashCode();
        }
        return A0M + i;
    }

    public URF(Integer num, Integer num2, String str, List list) {
        this.A03 = list;
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
    }
}
