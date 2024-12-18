package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DU4 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Modifier A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DU4(Modifier modifier, InterfaceC11380iw interfaceC11380iw, String str, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        super(2);
        this.A04 = interfaceC16820sZ;
        this.A03 = str;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = interfaceC11380iw;
        this.A01 = modifier;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC16820sZ interfaceC16820sZ = this.A04;
        String str = this.A03;
        boolean z = this.A06;
        boolean z2 = this.A05;
        AbstractC27681CJa.A00(A0S, this.A01, this.A02, str, interfaceC16820sZ, AbstractC25225BEi.A04(this.A00), z, z2);
        return C0eB.A00;
    }
}
