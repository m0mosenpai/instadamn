package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.UrpRendererType;
import java.util.List;

/* renamed from: X.H6x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38807H6x extends C0T6 implements InterfaceC43564JLy {
    public final UrpRendererType A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    @Override // X.InterfaceC43564JLy
    public final C38807H6x F3W() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38807H6x) {
                C38807H6x c38807H6x = (C38807H6x) obj;
                if (!C14360o3.A0K(this.A04, c38807H6x.A04) || !C14360o3.A0K(this.A01, c38807H6x.A01) || this.A00 != c38807H6x.A00 || !C14360o3.A0K(this.A02, c38807H6x.A02) || !C14360o3.A0K(this.A03, c38807H6x.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43564JLy
    public final List Acq() {
        return this.A04;
    }

    @Override // X.InterfaceC43564JLy
    public final String BOt() {
        return this.A01;
    }

    @Override // X.InterfaceC43564JLy
    public final UrpRendererType Bmq() {
        return this.A00;
    }

    @Override // X.InterfaceC43564JLy
    public final String Bmu() {
        return this.A02;
    }

    @Override // X.InterfaceC43564JLy
    public final String C5f() {
        return this.A03;
    }

    @Override // X.InterfaceC43564JLy
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTUrpMediaComposition", AbstractC40430HwL.A00(this));
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0J(this.A00, ((AbstractC167017dG.A0M(this.A04) * 31) + AbstractC167017dG.A0O(this.A01)) * 31)) + AbstractC25227BEk.A07(this.A03);
    }

    public C38807H6x(UrpRendererType urpRendererType, String str, String str2, String str3, List list) {
        AbstractC37302Gc3.A1U(urpRendererType, str2);
        this.A04 = list;
        this.A01 = str;
        this.A00 = urpRendererType;
        this.A02 = str2;
        this.A03 = str3;
    }
}
