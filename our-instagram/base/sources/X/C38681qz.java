package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.1qz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38681qz extends C0T6 implements InterfaceC38691r1 {
    public final Integer A00;
    public final String A01;
    public final List A02;

    @Override // X.InterfaceC38691r1
    public final C38681qz F2d(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38681qz) {
                C38681qz c38681qz = (C38681qz) obj;
                if (!C14360o3.A0K(this.A00, c38681qz.A00) || !C14360o3.A0K(this.A02, c38681qz.A02) || !C14360o3.A0K(this.A01, c38681qz.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.A02;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.A01;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // X.InterfaceC38691r1
    public final Integer BeB() {
        return this.A00;
    }

    @Override // X.InterfaceC38691r1
    public final List C42() {
        return this.A02;
    }

    @Override // X.InterfaceC38691r1
    public final String C44() {
        return this.A01;
    }

    @Override // X.InterfaceC38691r1
    public final InterfaceC38691r1 EAz(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC38691r1
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSuperlativesResponse", AbstractC40364HvA.A00(this));
    }

    public C38681qz(Integer num, String str, List list) {
        this.A00 = num;
        this.A02 = list;
        this.A01 = str;
    }
}
