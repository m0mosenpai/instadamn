package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H6y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38808H6y extends C0T6 implements InterfaceC43522JKi {
    public final String A00;
    public final List A01;

    @Override // X.InterfaceC43522JKi
    public final C38808H6y F3b() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38808H6y) {
                C38808H6y c38808H6y = (C38808H6y) obj;
                if (!C14360o3.A0K(this.A01, c38808H6y.A01) || !C14360o3.A0K(this.A00, c38808H6y.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43522JKi
    public final List B13() {
        return this.A01;
    }

    @Override // X.InterfaceC43522JKi
    public final String BTv() {
        return this.A00;
    }

    @Override // X.InterfaceC43522JKi
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTUserEngagementBasedInsertionSetting", AbstractC40434HwP.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC25227BEk.A07(this.A00);
    }

    public C38808H6y(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }
}
