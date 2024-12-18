package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3Vz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74433Vz extends C0T6 implements C3W0 {
    public final Integer A00;
    public final List A01;
    public final List A02;
    public final List A03;

    @Override // X.C3W0
    public final C74433Vz Ero(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C74433Vz) {
                C74433Vz c74433Vz = (C74433Vz) obj;
                if (!C14360o3.A0K(this.A01, c74433Vz.A01) || !C14360o3.A0K(this.A02, c74433Vz.A02) || !C14360o3.A0K(this.A00, c74433Vz.A00) || !C14360o3.A0K(this.A03, c74433Vz.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A01;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.A02;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.A00;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list3 = this.A03;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // X.C3W0
    public final List BGh() {
        return this.A01;
    }

    @Override // X.C3W0
    public final List BQP() {
        return this.A02;
    }

    @Override // X.C3W0
    public final Integer CEp() {
        return this.A00;
    }

    @Override // X.C3W0
    public final List CF9() {
        return this.A03;
    }

    @Override // X.C3W0
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClientHints", AbstractC39807HlH.A00(this));
    }

    public C74433Vz(Integer num, List list, List list2, List list3) {
        this.A01 = list;
        this.A02 = list2;
        this.A00 = num;
        this.A03 = list3;
    }
}
