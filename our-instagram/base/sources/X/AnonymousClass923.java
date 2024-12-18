package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.923, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass923 extends C0T6 implements AnonymousClass924 {
    public final InterfaceC2042691z A00;
    public final AnonymousClass922 A01;
    public final boolean A02;

    public AnonymousClass923(InterfaceC2042691z interfaceC2042691z, AnonymousClass922 anonymousClass922, boolean z) {
        C14360o3.A0B(interfaceC2042691z, 2);
        C14360o3.A0B(anonymousClass922, 3);
        this.A02 = z;
        this.A00 = interfaceC2042691z;
        this.A01 = anonymousClass922;
    }

    @Override // X.AnonymousClass924
    public final AnonymousClass923 F3o() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass923) {
                AnonymousClass923 anonymousClass923 = (AnonymousClass923) obj;
                if (this.A02 != anonymousClass923.A02 || !C14360o3.A0K(this.A00, anonymousClass923.A00) || !C14360o3.A0K(this.A01, anonymousClass923.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AnonymousClass924
    public final InterfaceC2042691z Apb() {
        return this.A00;
    }

    @Override // X.AnonymousClass924
    public final AnonymousClass922 BZq() {
        return this.A01;
    }

    @Override // X.AnonymousClass924
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTVisualRepliesInfo", AbstractC225569xb.A00(this));
    }

    @Override // X.AnonymousClass924
    public final boolean getCanViewerLinkBackToOriginalMediaFromVcr() {
        return this.A02;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return (((i * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode();
    }
}
