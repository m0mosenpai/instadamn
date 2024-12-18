package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContextualLinkCtaType;
import java.util.List;

/* renamed from: X.H2x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38711H2x extends C0T6 implements JMR {
    public final ContextualLinkCtaType A00;
    public final C84123oy A01;
    public final C84153p2 A02;
    public final InterfaceC110214xq A03;
    public final List A04;
    public final List A05;

    public C38711H2x(ContextualLinkCtaType contextualLinkCtaType, C84123oy c84123oy, C84153p2 c84153p2, InterfaceC110214xq interfaceC110214xq, List list, List list2) {
        C14360o3.A0B(contextualLinkCtaType, 2);
        this.A01 = c84123oy;
        this.A00 = contextualLinkCtaType;
        this.A02 = c84153p2;
        this.A04 = list;
        this.A05 = list2;
        this.A03 = interfaceC110214xq;
    }

    @Override // X.JMR
    public final C38711H2x Esa(C1DY c1dy) {
        return this;
    }

    @Override // X.JMR
    public final C38711H2x Esb(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38711H2x) {
                C38711H2x c38711H2x = (C38711H2x) obj;
                if (!C14360o3.A0K(this.A01, c38711H2x.A01) || this.A00 != c38711H2x.A00 || !C14360o3.A0K(this.A02, c38711H2x.A02) || !C14360o3.A0K(this.A04, c38711H2x.A04) || !C14360o3.A0K(this.A05, c38711H2x.A05) || !C14360o3.A0K(this.A03, c38711H2x.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMR
    public final /* bridge */ /* synthetic */ InterfaceC84133oz Aqs() {
        return this.A01;
    }

    @Override // X.JMR
    public final ContextualLinkCtaType Ara() {
        return this.A00;
    }

    @Override // X.JMR
    public final /* bridge */ /* synthetic */ InterfaceC84163p3 BPh() {
        return this.A02;
    }

    @Override // X.JMR
    public final List Bij() {
        return this.A04;
    }

    @Override // X.JMR
    public final List Bp8() {
        return this.A05;
    }

    @Override // X.JMR
    public final InterfaceC110214xq C5g() {
        return this.A03;
    }

    @Override // X.JMR
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTContextualLinkCtaInfo", AbstractC39854Hm2.A00(this));
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A00, AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    @Override // X.JMR
    public final JMR E8u(C1DY c1dy) {
        return this;
    }
}
