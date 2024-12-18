package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.BhB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26125BhB extends C0T6 implements C5HL {
    public final List A00;

    @Override // X.C5HL
    public final C26125BhB Erw() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26125BhB) && C14360o3.A0K(this.A00, ((C26125BhB) obj).A00));
    }

    @Override // X.C5HL
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsExternalMediaInfo", CDB.A00(this));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C26125BhB(List list) {
        this.A00 = list;
    }

    @Override // X.C5HL
    public final List B9u() {
        return this.A00;
    }
}
