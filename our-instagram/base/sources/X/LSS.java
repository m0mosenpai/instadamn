package X;

/* loaded from: classes8.dex */
public final class LSS implements InterfaceC50417MNt {
    public final /* synthetic */ C41761wQ A00;
    public final /* synthetic */ LAF A01;
    public final /* synthetic */ C48681LgB A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ InterfaceC16660sJ A05;

    public LSS(C41761wQ c41761wQ, LAF laf, C48681LgB c48681LgB, Integer num, Integer num2, InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = c48681LgB;
        this.A04 = num;
        this.A03 = num2;
        this.A01 = laf;
        this.A00 = c41761wQ;
        this.A05 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        String str;
        if (AbstractC31177DnL.A1b(obj)) {
            C48681LgB c48681LgB = this.A02;
            Integer num = this.A04;
            Integer num2 = this.A03;
            LAF laf = this.A01;
            C41761wQ c41761wQ = this.A00;
            C48676Lg6 c48676Lg6 = new C48676Lg6(AbstractC46742Klz.A00(c48681LgB.A00, num), num, this.A05);
            C14360o3.A0B(c41761wQ, 2);
            c41761wQ.A02(laf.A04(c41761wQ, num2), new C29536Czo(c48676Lg6, 0));
            return;
        }
        this.A05.invoke(KPW.A00);
        InterfaceC09390do interfaceC09390do = this.A02.A01;
        AbstractC2056898s A0b = AbstractC43592JPx.A0b(interfaceC09390do);
        Integer num3 = this.A03;
        A0b.A03();
        if (num3 == C05F.A00) {
            str = "YES";
        } else {
            str = "NO";
        }
        A0b.A07("IS_V3_IMPLICIT_BACKUP", str);
        A0b.A07("CALLSITE", AbstractC46733Klq.A00(num3));
        AbstractC2056898s A0b2 = AbstractC43592JPx.A0b(interfaceC09390do);
        A0b2.A07("IS_BLOCKSTORE_E2EE_ENABLED", "NO");
        A0b2.A01();
    }
}
