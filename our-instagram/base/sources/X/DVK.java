package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DVK extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Alignment A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ C5YV A05;
    public final /* synthetic */ C2DC A06;
    public final /* synthetic */ C5YL A07;
    public final /* synthetic */ String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVK(Alignment alignment, Modifier modifier, C5YV c5yv, C2DC c2dc, C5YL c5yl, String str, float f, int i, int i2) {
        super(2);
        this.A06 = c2dc;
        this.A08 = str;
        this.A04 = modifier;
        this.A03 = alignment;
        this.A07 = c5yl;
        this.A00 = f;
        this.A05 = c5yv;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        C2DC c2dc = this.A06;
        String str = this.A08;
        Modifier modifier = this.A04;
        C6LQ.A00(A0S, this.A03, modifier, this.A05, c2dc, this.A07, str, this.A00, AbstractC25225BEi.A04(this.A01), this.A02);
        return C0eB.A00;
    }
}
