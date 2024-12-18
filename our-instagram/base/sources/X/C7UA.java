package X;

/* renamed from: X.7UA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7UA extends C7VI implements InterfaceC65626Tpm {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        C163727Uk c163727Uk = (C163727Uk) this.A01.getValue();
        if (((C7MT) c163727Uk.A07.getValue()).A01 == C7MS.A02 && c163727Uk.A00 != null) {
            C141796aw A00 = AbstractC141776au.A00(c163727Uk);
            AbstractC23641Du.A05(AnonymousClass191.A00, new D4z(c163727Uk, null, 31), A00);
        }
    }

    public C7UA(C7VG c7vg, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        super(c7vg);
        this.A02 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
        this.A03 = interfaceC16820sZ3;
        this.A01 = new C60842q8(new C206959Ea(this, 16), new C206959Ea(c7vg, 17), C149636oG.A00, new C0YZ(C163727Uk.class));
        this.A00 = C1XM.A00(new C206959Ea(c7vg, 15));
    }
}
