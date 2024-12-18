package X;

/* renamed from: X.AhE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23862AhE implements InterfaceC25186BCj {
    public final /* synthetic */ InterfaceC23621Ds A00;

    @Override // X.InterfaceC25186BCj
    public final void onError(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC23621Ds interfaceC23621Ds = this.A00;
        RuntimeException A18 = AbstractC166987dD.A18(str);
        C14360o3.A0B(A18, 0);
        interfaceC23621Ds.resumeWith(new C09540e5(A18));
    }

    public C23862AhE(InterfaceC23621Ds interfaceC23621Ds) {
        this.A00 = interfaceC23621Ds;
    }

    @Override // X.InterfaceC25186BCj
    public final void Dps(C203238yg c203238yg) {
        this.A00.resumeWith(c203238yg);
    }
}
