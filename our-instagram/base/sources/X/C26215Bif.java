package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.Bif, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26215Bif extends C0T6 implements InterfaceC31135DmI {
    public final int A00;
    public final int A01;
    public final int A02;
    public final H4C A03;
    public final Long A04;
    public final List A05;
    public final List A06;

    public C26215Bif(H4C h4c, Long l, List list, List list2, int i, int i2, int i3) {
        C14360o3.A0B(list2, 5);
        this.A00 = i;
        this.A05 = list;
        this.A04 = l;
        this.A01 = i2;
        this.A06 = list2;
        this.A03 = h4c;
        this.A02 = i3;
    }

    @Override // X.InterfaceC31135DmI
    public final C26215Bif F4o(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC31135DmI
    public final C26215Bif F4p(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26215Bif) {
                C26215Bif c26215Bif = (C26215Bif) obj;
                if (this.A00 != c26215Bif.A00 || !C14360o3.A0K(this.A05, c26215Bif.A05) || !C14360o3.A0K(this.A04, c26215Bif.A04) || this.A01 != c26215Bif.A01 || !C14360o3.A0K(this.A06, c26215Bif.A06) || !C14360o3.A0K(this.A03, c26215Bif.A03) || this.A02 != c26215Bif.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31135DmI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPotatoContainerMediaInfo", AbstractC27674CIt.A00(this));
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A06, ((((((this.A00 * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + this.A01) * 31) + AbstractC166997dE.A0I(this.A03)) * 31) + this.A02;
    }

    @Override // X.InterfaceC31135DmI
    public final int AdR() {
        return this.A00;
    }

    @Override // X.InterfaceC31135DmI
    public final List Aqg() {
        return this.A05;
    }

    @Override // X.InterfaceC31135DmI
    public final Long B3E() {
        return this.A04;
    }

    @Override // X.InterfaceC31135DmI
    public final int BQa() {
        return this.A01;
    }

    @Override // X.InterfaceC31135DmI
    public final List Bfu() {
        return this.A06;
    }

    @Override // X.InterfaceC31135DmI
    public final /* bridge */ /* synthetic */ InterfaceC31134DmH Bie() {
        return this.A03;
    }

    @Override // X.InterfaceC31135DmI
    public final int C2Z() {
        return this.A02;
    }

    @Override // X.InterfaceC31135DmI
    public final InterfaceC31135DmI EBU(C1DY c1dy) {
        return this;
    }
}
