package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DUj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30256DUj extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ InterfaceC30804Dgf A04;
    public final /* synthetic */ EnumC27366C5v A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30256DUj(Modifier modifier, InterfaceC30804Dgf interfaceC30804Dgf, EnumC27366C5v enumC27366C5v, String str, String str2, int i, int i2, int i3) {
        super(2);
        this.A07 = str;
        this.A03 = modifier;
        this.A05 = enumC27366C5v;
        this.A06 = str2;
        this.A04 = interfaceC30804Dgf;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A07;
        BY1.A01(A0S, this.A03, this.A04, this.A05, str, this.A06, this.A02, AbstractC25225BEi.A04(this.A00), this.A01);
        return C0eB.A00;
    }
}
