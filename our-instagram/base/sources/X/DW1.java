package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.SimpleImageUrl;

/* loaded from: classes5.dex */
public final class DW1 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Modifier A04;
    public final /* synthetic */ SimpleImageUrl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC65696TsI A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DW1(Modifier modifier, SimpleImageUrl simpleImageUrl, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC65696TsI interfaceC65696TsI, int i, int i2, int i3, long j, boolean z) {
        super(2);
        this.A04 = modifier;
        this.A05 = simpleImageUrl;
        this.A02 = i;
        this.A03 = j;
        this.A06 = str;
        this.A08 = interfaceC65696TsI;
        this.A09 = z;
        this.A07 = interfaceC16660sJ;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        Modifier modifier = this.A04;
        SimpleImageUrl simpleImageUrl = this.A05;
        int i = this.A02;
        long j = this.A03;
        AbstractC28499Chs.A06(A0S, modifier, simpleImageUrl, this.A06, this.A07, this.A08, i, AbstractC25225BEi.A04(this.A00), this.A01, j, this.A09);
        return C0eB.A00;
    }
}
