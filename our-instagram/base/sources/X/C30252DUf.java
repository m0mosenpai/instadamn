package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DUf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30252DUf extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ char A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ C118125Vw A05;
    public final /* synthetic */ C5Hc A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30252DUf(Modifier modifier, C118125Vw c118125Vw, C5Hc c5Hc, char c, int i, int i2, long j, boolean z) {
        super(2);
        this.A00 = c;
        this.A06 = c5Hc;
        this.A07 = z;
        this.A04 = modifier;
        this.A05 = c118125Vw;
        this.A03 = j;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        char c = this.A00;
        C5Hc c5Hc = this.A06;
        boolean z = this.A07;
        AbstractC28028CXc.A01(A0S, this.A04, this.A05, c5Hc, c, AbstractC25225BEi.A04(this.A01), this.A02, this.A03, z);
        return C0eB.A00;
    }
}
