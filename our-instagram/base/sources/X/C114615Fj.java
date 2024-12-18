package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5Fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114615Fj extends C0T6 implements InterfaceC104924o5 {
    public final H4M A00;

    public C114615Fj(H4M h4m) {
        C14360o3.A0B(h4m, 1);
        this.A00 = h4m;
    }

    @Override // X.InterfaceC104924o5
    public final InterfaceC104924o5 E9v(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC104924o5
    public final C114615Fj Ezn(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC104924o5
    public final C114615Fj Ezo(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C114615Fj) && C14360o3.A0K(this.A00, ((C114615Fj) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC104924o5
    public final /* bridge */ /* synthetic */ InterfaceC43583JMr BVT() {
        return this.A00;
    }

    @Override // X.InterfaceC104924o5
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSponsoredMusicInfo", AbstractC40256HtM.A00(this));
    }
}
