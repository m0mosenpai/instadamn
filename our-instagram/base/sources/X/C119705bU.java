package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.5bU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119705bU extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ C119625bL A04;
    public final /* synthetic */ C119565bE A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119705bU(Modifier modifier, C119625bL c119625bL, C119565bE c119565bE, float f, int i, int i2) {
        super(2);
        this.A05 = c119565bE;
        this.A03 = modifier;
        this.A04 = c119625bL;
        this.A00 = f;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC119635bM.A00((C5Tl) obj, this.A03, this.A04, this.A05, this.A00, AbstractC128295qy.A00(this.A01 | 1), this.A02);
        return C0eB.A00;
    }
}
