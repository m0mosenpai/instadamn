package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DWg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30305DWg extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C5XO A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ C6GG A04;
    public final /* synthetic */ C6GD A05;
    public final /* synthetic */ C6GC A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30305DWg(C5XO c5xo, Modifier modifier, C6GG c6gg, C6GD c6gd, C6GC c6gc, String str, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A08 = interfaceC16820sZ;
        this.A07 = str;
        this.A03 = modifier;
        this.A02 = c5xo;
        this.A09 = z;
        this.A06 = c6gc;
        this.A05 = c6gd;
        this.A0A = z2;
        this.A04 = c6gg;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC16820sZ interfaceC16820sZ = this.A08;
        String str = this.A07;
        Modifier modifier = this.A03;
        C5XO c5xo = this.A02;
        boolean z = this.A09;
        C6GC c6gc = this.A06;
        C6GE.A00(c5xo, A0S, modifier, this.A04, this.A05, c6gc, str, interfaceC16820sZ, AbstractC25225BEi.A04(this.A00), this.A01, z, this.A0A);
        return C0eB.A00;
    }
}
