package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H6q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38801H6q extends C0T6 implements InterfaceC43520JKg {
    public final String A00;
    public final List A01;

    public C38801H6q(List list, String str) {
        C14360o3.A0B(str, 2);
        this.A01 = list;
        this.A00 = str;
    }

    @Override // X.InterfaceC43520JKg
    public final C38801H6q F3J() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38801H6q) {
                C38801H6q c38801H6q = (C38801H6q) obj;
                if (!C14360o3.A0K(this.A01, c38801H6q.A01) || !C14360o3.A0K(this.A00, c38801H6q.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43520JKg
    public final List B2G() {
        return this.A01;
    }

    @Override // X.InterfaceC43520JKg
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextWithEntities", AbstractC40417Hw5.A00(this));
    }

    @Override // X.InterfaceC43520JKg
    public final String getText() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC167017dG.A0M(this.A01) * 31);
    }
}
