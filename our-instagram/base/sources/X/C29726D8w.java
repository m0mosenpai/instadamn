package X;

import android.animation.TimeInterpolator;

/* renamed from: X.D8w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29726D8w extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ InterfaceC30923Dia A02;
    public final /* synthetic */ C76223bS A03;
    public final /* synthetic */ EnumC25700BXk A04;
    public final /* synthetic */ InterfaceC31128DmB A05;
    public final /* synthetic */ C26334Bkf A06;
    public final /* synthetic */ C09530e4 A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29726D8w(InterfaceC30923Dia interfaceC30923Dia, C76223bS c76223bS, EnumC25700BXk enumC25700BXk, InterfaceC31128DmB interfaceC31128DmB, C26334Bkf c26334Bkf, C09530e4 c09530e4, int i, long j) {
        super(0);
        this.A02 = interfaceC30923Dia;
        this.A04 = enumC25700BXk;
        this.A06 = c26334Bkf;
        this.A00 = i;
        this.A03 = c76223bS;
        this.A01 = j;
        this.A05 = interfaceC31128DmB;
        this.A07 = c09530e4;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        TimeInterpolator timeInterpolator = BXA.A09;
        boolean CSM = this.A02.CSM();
        EnumC25700BXk enumC25700BXk = this.A04;
        int i = this.A06.A00;
        int i2 = this.A00;
        float A07 = AbstractC25228BEl.A07(this.A03, this.A01);
        InterfaceC31128DmB interfaceC31128DmB = this.A05;
        C09530e4 c09530e4 = this.A07;
        EnumC27373C6c enumC27373C6c = (EnumC27373C6c) c09530e4.A00;
        float EKJ = interfaceC31128DmB.EKJ(enumC27373C6c, false);
        EnumC27373C6c enumC27373C6c2 = (EnumC27373C6c) c09530e4.A01;
        return new BXA(C27881CQs.A00(EKJ, interfaceC31128DmB.EKJ(enumC27373C6c2, false)), C27881CQs.A00(interfaceC31128DmB.EKJ(enumC27373C6c, true), interfaceC31128DmB.EKJ(enumC27373C6c2, true)), enumC25700BXk, A07, i, i2, CSM);
    }
}
