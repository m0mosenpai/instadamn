package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DUY extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ InterfaceC30909DiM A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ BIZ A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUY(InterfaceC30909DiM interfaceC30909DiM, Modifier modifier, BIZ biz, int i, int i2, long j, boolean z, boolean z2) {
        super(2);
        this.A03 = interfaceC30909DiM;
        this.A07 = z;
        this.A05 = biz;
        this.A06 = z2;
        this.A02 = j;
        this.A04 = modifier;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC30909DiM interfaceC30909DiM = this.A03;
        boolean z = this.A07;
        BIZ biz = this.A05;
        boolean z2 = this.A06;
        AbstractC28376Cfe.A02(interfaceC30909DiM, A0S, this.A04, biz, AbstractC25225BEi.A04(this.A00), this.A01, this.A02, z, z2);
        return C0eB.A00;
    }
}
