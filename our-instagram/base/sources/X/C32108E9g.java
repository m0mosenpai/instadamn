package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.E9g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32108E9g extends C0T6 implements InterfaceC37270GbN {
    public final Integer A00;
    public final List A01;

    @Override // X.InterfaceC37270GbN
    public final C32108E9g F7V(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC37270GbN
    public final C32108E9g F7W(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32108E9g) {
                C32108E9g c32108E9g = (C32108E9g) obj;
                if (!C14360o3.A0K(this.A01, c32108E9g.A01) || !C14360o3.A0K(this.A00, c32108E9g.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37270GbN
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProfileNoteOnProfileResponse", FCE.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C32108E9g(Integer num, List list) {
        this.A01 = list;
        this.A00 = num;
    }

    @Override // X.InterfaceC37270GbN
    public final List AdW() {
        return this.A01;
    }

    @Override // X.InterfaceC37270GbN
    public final Integer AdY() {
        return this.A00;
    }
}
