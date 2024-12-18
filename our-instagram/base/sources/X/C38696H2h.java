package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H2h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38696H2h extends C0T6 implements C5HM {
    public final int A00;
    public final List A01;

    @Override // X.C5HM
    public final C38696H2h Es0() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38696H2h) {
                C38696H2h c38696H2h = (C38696H2h) obj;
                if (this.A00 != c38696H2h.A00 || !C14360o3.A0K(this.A01, c38696H2h.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5HM
    public final List BSV() {
        return this.A01;
    }

    @Override // X.C5HM
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTClipsMerchandisingPillInfo", AbstractC39816HlQ.A00(this));
    }

    @Override // X.C5HM
    public final int getLoopTime() {
        return this.A00;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AbstractC167017dG.A0M(this.A01);
    }

    public C38696H2h(int i, List list) {
        this.A00 = i;
        this.A01 = list;
    }
}
