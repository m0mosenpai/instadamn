package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DTy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30245DTy extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ Modifier A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30245DTy(Modifier modifier, int i, int i2, int i3, int i4, long j, long j2) {
        super(2);
        this.A03 = i;
        this.A02 = i2;
        this.A06 = modifier;
        this.A04 = j;
        this.A05 = j2;
        this.A00 = i3;
        this.A01 = i4;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        int i = this.A03;
        int i2 = this.A02;
        C6GV.A02(A0S, this.A06, i, i2, AbstractC25225BEi.A04(this.A00), this.A01, this.A04, this.A05);
        return C0eB.A00;
    }
}