package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DVt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30292DVt extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30292DVt(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A07 = str;
        this.A08 = z;
        this.A03 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A06 = obj4;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                boolean z = this.A08;
                AbstractC28495Cho.A07((CWS) this.A04, (CWT) this.A05, A0S, (Modifier) this.A06, this.A07, (InterfaceC16610sE) this.A03, AbstractC25225BEi.A04(this.A01), this.A02, z);
                break;
            case 1:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                String str = this.A07;
                boolean z2 = this.A08;
                AbstractC28453Ch3.A01((CW4) this.A03, A0S2, (Modifier) this.A05, str, (InterfaceC16820sZ) this.A06, (InterfaceC16610sE) this.A04, AbstractC25225BEi.A04(this.A01), this.A02, z2);
                break;
            case 2:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A04;
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A05;
                String str2 = this.A07;
                CET.A00(A0S3, (Modifier) this.A03, (C6J) this.A06, str2, interfaceC16820sZ, interfaceC16820sZ2, AbstractC25225BEi.A04(this.A01), this.A02, this.A08);
                break;
            default:
                C5Tl A0S4 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A05;
                String str3 = this.A07;
                C68 c68 = (C68) this.A06;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A03;
                AbstractC28443Cgr.A01(A0S4, (Modifier) this.A04, interfaceC11380iw, c68, str3, interfaceC16660sJ, AbstractC25225BEi.A04(this.A01), this.A02, this.A08);
                break;
        }
        return C0eB.A00;
    }
}
