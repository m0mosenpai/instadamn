package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H3o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38726H3o extends C0T6 implements JM5 {
    public final InterfaceC43557JLr A00;
    public final InterfaceC43572JMg A01;
    public final JKK A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;

    @Override // X.JM5
    public final C38726H3o EvG() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38726H3o) {
                C38726H3o c38726H3o = (C38726H3o) obj;
                if (!C14360o3.A0K(this.A00, c38726H3o.A00) || !C14360o3.A0K(this.A03, c38726H3o.A03) || !C14360o3.A0K(this.A04, c38726H3o.A04) || !C14360o3.A0K(this.A01, c38726H3o.A01) || !C14360o3.A0K(this.A02, c38726H3o.A02) || !C14360o3.A0K(this.A05, c38726H3o.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JM5
    public final InterfaceC43557JLr Arj() {
        return this.A00;
    }

    @Override // X.JM5
    public final Boolean BJJ() {
        return this.A03;
    }

    @Override // X.JM5
    public final InterfaceC43572JMg C6p() {
        return this.A01;
    }

    @Override // X.JM5
    public final JKK C8U() {
        return this.A02;
    }

    @Override // X.JM5
    public final String CB7() {
        return this.A05;
    }

    @Override // X.JM5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGNativeSmartTextOverlay", AbstractC40002Hoj.A00(this));
    }

    @Override // X.JM5
    public final String getText() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A05);
    }

    public C38726H3o(InterfaceC43557JLr interfaceC43557JLr, InterfaceC43572JMg interfaceC43572JMg, JKK jkk, Boolean bool, String str, String str2) {
        this.A00 = interfaceC43557JLr;
        this.A03 = bool;
        this.A04 = str;
        this.A01 = interfaceC43572JMg;
        this.A02 = jkk;
        this.A05 = str2;
    }
}
