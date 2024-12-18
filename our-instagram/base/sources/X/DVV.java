package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DVV extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16620sF A07;
    public final /* synthetic */ InterfaceC16620sF A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVV(Modifier modifier, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i, int i2, int i3) {
        super(2);
        this.A02 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = modifier;
        this.A06 = interfaceC16820sZ;
        this.A08 = interfaceC16620sF;
        this.A07 = interfaceC16620sF2;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        int i = this.A02;
        CEM.A00(A0S, this.A03, this.A04, this.A05, this.A06, this.A08, this.A07, i, AbstractC25225BEi.A04(this.A00), this.A01);
        return C0eB.A00;
    }
}
