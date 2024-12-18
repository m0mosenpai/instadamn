package X;

/* renamed from: X.9gP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215499gP extends C1P1 {
    public final /* synthetic */ AbstractC169347h8 A00;

    public C215499gP(AbstractC169347h8 abstractC169347h8) {
        this.A00 = abstractC169347h8;
    }

    public final void A00(InterfaceC40821up interfaceC40821up) {
        int A03 = C0f9.A03(1165061821);
        C14360o3.A0B(interfaceC40821up, 0);
        AbstractC169347h8 abstractC169347h8 = this.A00;
        InterfaceC168867gL interfaceC168867gL = (InterfaceC168867gL) interfaceC40821up;
        abstractC169347h8.A04 = interfaceC168867gL.getItems();
        abstractC169347h8.A01 = interfaceC168867gL.B3l();
        abstractC169347h8.A03 = interfaceC168867gL.Bo9();
        abstractC169347h8.A06 = true;
        abstractC169347h8.A07 = false;
        abstractC169347h8.A05 = false;
        InterfaceC169507hQ interfaceC169507hQ = abstractC169347h8.A00;
        if (interfaceC169507hQ != null) {
            interfaceC169507hQ.DcI(abstractC169347h8);
        }
        C0f9.A0A(211463778, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-766505560);
        AbstractC169347h8 abstractC169347h8 = this.A00;
        if (!abstractC169347h8.A06) {
            abstractC169347h8.A04 = C16930sl.A00;
            abstractC169347h8.A07 = false;
            abstractC169347h8.A05 = true;
            abstractC169347h8.A06 = true;
            InterfaceC169507hQ interfaceC169507hQ = abstractC169347h8.A00;
            if (interfaceC169507hQ != null) {
                interfaceC169507hQ.DcI(abstractC169347h8);
            }
        }
        C0f9.A0A(-231976658, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        C0f9.A0A(-662399746, C0f9.A03(-323451237));
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(2080386451);
        this.A00.A07 = true;
        C0f9.A0A(-923755704, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-385894203);
        A00((InterfaceC40821up) obj);
        C0f9.A0A(678454643, A03);
    }
}
