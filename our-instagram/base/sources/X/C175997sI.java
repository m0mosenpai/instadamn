package X;

/* renamed from: X.7sI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175997sI implements InterfaceC175477rN, InterfaceC176007sJ {
    public int A00;
    public int A01;
    public int A02;
    public final InterfaceC179497xz A03;
    public final InterfaceC178737wl A04;

    public C175997sI(InterfaceC179497xz interfaceC179497xz, InterfaceC178737wl interfaceC178737wl) {
        C14360o3.A0B(interfaceC179497xz, 1);
        C14360o3.A0B(interfaceC178737wl, 2);
        this.A03 = interfaceC179497xz;
        this.A04 = interfaceC178737wl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.7xa, java.lang.Object] */
    @Override // X.InterfaceC176007sJ
    public final /* bridge */ /* synthetic */ void A9q(Object obj) {
        C176507t8 c176507t8 = (C176507t8) obj;
        if (c176507t8 != null) {
            c176507t8.A06 = -this.A00;
            c176507t8.A07 = 1;
            c176507t8.A09 = 1;
            this.A04.A9p(c176507t8);
        }
        this.A03.DfO(new Object());
    }

    @Override // X.InterfaceC175477rN
    public final void DX9(int i, int i2, int i3, int i4, boolean z) {
        this.A00 = i4;
        this.A02 = i;
        this.A01 = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.7xa, java.lang.Object] */
    @Override // X.InterfaceC176007sJ
    public final /* bridge */ /* synthetic */ void EG4(Object obj) {
        C176507t8 c176507t8 = (C176507t8) obj;
        if (c176507t8 != null) {
            this.A04.EG3(c176507t8);
        }
        this.A03.DfO(new Object());
    }
}
