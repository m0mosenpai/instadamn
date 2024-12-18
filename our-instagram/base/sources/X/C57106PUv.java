package X;

/* renamed from: X.PUv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57106PUv implements InterfaceC14180ni, AnonymousClass822 {
    public final /* synthetic */ C56049OuO A00;

    public C57106PUv(C56049OuO c56049OuO) {
        this.A00 = c56049OuO;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, this.A00, C56049OuO.class, "onCameraDestinationChanged", "onCameraDestinationChanged(Lcom/instagram/creation/cameraconfiguration/CameraDestination;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.AnonymousClass822
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C14360o3.A0B(obj, 0);
        C51044Mgw A00 = C56049OuO.A00(this.A00);
        if (obj.equals(C81S.A00)) {
            C51044Mgw.A02(A00);
            C05A c05a = A00.A0L;
            Boolean A0b = AbstractC166997dE.A0b();
            c05a.Egh(A0b);
            A00.A0N.Egh(A0b);
            A00.A0Q.Egh(Double.valueOf(1.0d));
            A00.A0S.Egh(A00.A0C.A00(A00.A08));
            PZD.A02(A00, AbstractC141776au.A00(A00), 0);
            return;
        }
        if (obj.equals(C208509Kk.A00)) {
            C51044Mgw.A03(A00);
            PZD.A02(A00, AbstractC141776au.A00(A00), 1);
            A00.A0Q.Egh(Double.valueOf(1.0d));
            return;
        }
        C51044Mgw.A03(A00);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass822) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }
}
