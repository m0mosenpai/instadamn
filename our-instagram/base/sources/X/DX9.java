package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DX9 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ MUD A04;
    public final /* synthetic */ MUD A05;
    public final /* synthetic */ CharSequence A06;
    public final /* synthetic */ CharSequence A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ InterfaceC16660sJ A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DX9(Modifier modifier, MUD mud, MUD mud2, CharSequence charSequence, CharSequence charSequence2, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, int i2, int i3, boolean z) {
        super(2);
        this.A08 = str;
        this.A06 = charSequence;
        this.A02 = i;
        this.A03 = modifier;
        this.A09 = interfaceC16660sJ;
        this.A07 = charSequence2;
        this.A0A = interfaceC16660sJ2;
        this.A04 = mud;
        this.A05 = mud2;
        this.A0B = z;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A08;
        CharSequence charSequence = this.A06;
        int i = this.A02;
        Modifier modifier = this.A03;
        InterfaceC16660sJ interfaceC16660sJ = this.A09;
        CharSequence charSequence2 = this.A07;
        InterfaceC16660sJ interfaceC16660sJ2 = this.A0A;
        AbstractC28463ChF.A01(A0S, modifier, this.A04, this.A05, charSequence, charSequence2, str, interfaceC16660sJ, interfaceC16660sJ2, i, AbstractC25225BEi.A04(this.A00), this.A01, this.A0B);
        return C0eB.A00;
    }
}
