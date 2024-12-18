package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Cvo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29293Cvo implements C3AG {
    public final C120985dq A00;
    public final C75113Zb A01;
    public final SPM A02;
    public final C27845CPi A03;
    public final WeakReference A04;
    public final boolean A05;

    @Override // X.C3AG
    public final void D26(C38321qM c38321qM, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        InterfaceC30974DjV interfaceC30974DjV = (InterfaceC30974DjV) this.A04.get();
        if (interfaceC30974DjV != null) {
            interfaceC30974DjV.D50(this.A00, c38321qM, this.A02, this.A03, z, this.A05);
        }
    }

    @Override // X.C3AG
    public final void Dva(C38321qM c38321qM, EnumC75183Zl enumC75183Zl) {
        C14360o3.A0B(enumC75183Zl, 1);
        C75113Zb c75113Zb = this.A01;
        if (c75113Zb != null) {
            c75113Zb.A0N(enumC75183Zl);
        }
    }

    public C29293Cvo(C120985dq c120985dq, C75113Zb c75113Zb, SPM spm, C27845CPi c27845CPi, WeakReference weakReference, boolean z) {
        this.A00 = c120985dq;
        this.A01 = c75113Zb;
        this.A04 = weakReference;
        this.A05 = z;
        this.A03 = c27845CPi;
        this.A02 = spm;
    }
}
