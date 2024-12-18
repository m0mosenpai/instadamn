package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DVw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30295DVw extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30295DVw(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A02 = i;
        this.A08 = str;
        this.A07 = str2;
        this.A03 = obj;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A05 = obj4;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                AbstractC25708BXt.A01(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (C25707BXs) this.A05, this.A08, this.A07, (InterfaceC16820sZ) this.A06, (C5Hc) this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 1:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                String str = this.A08;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A05;
                Modifier modifier = (Modifier) this.A04;
                String str2 = this.A07;
                BY5.A00((C5XO) this.A03, A0S, modifier, (C2DC) this.A06, str, str2, interfaceC16660sJ, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            default:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                int i = this.A02;
                String str3 = this.A08;
                String str4 = this.A07;
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A03;
                InterfaceC16620sF interfaceC16620sF2 = (InterfaceC16620sF) this.A04;
                CIC.A00(A0S2, (C26084BgD) this.A05, (C26045BfY) this.A06, str3, str4, interfaceC16620sF, interfaceC16620sF2, i, AbstractC25225BEi.A04(this.A01));
                break;
        }
        return C0eB.A00;
    }
}
