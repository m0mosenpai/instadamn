package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DVh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30280DVh extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16660sJ A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30280DVh(Modifier modifier, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A05 = str;
        this.A07 = z;
        this.A08 = z2;
        this.A06 = interfaceC16660sJ;
        this.A03 = modifier;
        this.A04 = str2;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A05;
        boolean z = this.A07;
        boolean z2 = this.A08;
        AbstractC28333CeL.A01(A0S, this.A03, str, this.A04, this.A06, this.A02, AbstractC25225BEi.A04(this.A00), this.A01, z, z2);
        return C0eB.A00;
    }
}
