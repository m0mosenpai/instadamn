package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DUn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30260DUn extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ Modifier A05;
    public final /* synthetic */ C5W3 A06;
    public final /* synthetic */ C118125Vw A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30260DUn(Modifier modifier, C5W3 c5w3, C118125Vw c118125Vw, int i, int i2, int i3, int i4, long j) {
        super(2);
        this.A02 = i;
        this.A04 = j;
        this.A06 = c5w3;
        this.A05 = modifier;
        this.A03 = i2;
        this.A07 = c118125Vw;
        this.A00 = i3;
        this.A01 = i4;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        int i = this.A02;
        long j = this.A04;
        C5W3 c5w3 = this.A06;
        AbstractC27625CGw.A00(A0S, this.A05, c5w3, this.A07, i, this.A03, AbstractC25225BEi.A04(this.A00), this.A01, j);
        return C0eB.A00;
    }
}
