package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGNativeTextOverlayTextBoxAlignmentEnum;

/* renamed from: X.H3p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38727H3p extends C0T6 implements InterfaceC43557JLr {
    public final IGNativeTextOverlayTextBoxAlignmentEnum A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;

    @Override // X.InterfaceC43557JLr
    public final C38727H3p EvF() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38727H3p) {
                C38727H3p c38727H3p = (C38727H3p) obj;
                if (!C14360o3.A0K(this.A01, c38727H3p.A01) || !C14360o3.A0K(this.A02, c38727H3p.A02) || this.A00 != c38727H3p.A00 || !C14360o3.A0K(this.A03, c38727H3p.A03) || !C14360o3.A0K(this.A04, c38727H3p.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43557JLr
    public final Integer Aha() {
        return this.A01;
    }

    @Override // X.InterfaceC43557JLr
    public final Integer Ahb() {
        return this.A02;
    }

    @Override // X.InterfaceC43557JLr
    public final IGNativeTextOverlayTextBoxAlignmentEnum Ahq() {
        return this.A00;
    }

    @Override // X.InterfaceC43557JLr
    public final Integer C9W() {
        return this.A03;
    }

    @Override // X.InterfaceC43557JLr
    public final Integer C9X() {
        return this.A04;
    }

    @Override // X.InterfaceC43557JLr
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGNativeSmartTextOverlayCoorninates", AbstractC40003Hok.A00(this));
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public C38727H3p(IGNativeTextOverlayTextBoxAlignmentEnum iGNativeTextOverlayTextBoxAlignmentEnum, Integer num, Integer num2, Integer num3, Integer num4) {
        this.A01 = num;
        this.A02 = num2;
        this.A00 = iGNativeTextOverlayTextBoxAlignmentEnum;
        this.A03 = num3;
        this.A04 = num4;
    }
}
