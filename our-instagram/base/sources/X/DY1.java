package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.PivotPageInsightsTip;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes5.dex */
public final class DY1 extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ PivotPageInsightsTip A04;
    public final /* synthetic */ ImageUrl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ InterfaceC16820sZ A0A;
    public final /* synthetic */ InterfaceC16820sZ A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DY1(Modifier modifier, PivotPageInsightsTip pivotPageInsightsTip, ImageUrl imageUrl, String str, String str2, String str3, String str4, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A03 = modifier;
        this.A08 = str;
        this.A09 = str2;
        this.A0B = interfaceC16820sZ;
        this.A0E = z;
        this.A05 = imageUrl;
        this.A07 = str3;
        this.A0C = z2;
        this.A06 = str4;
        this.A0A = interfaceC16820sZ2;
        this.A0D = z3;
        this.A04 = pivotPageInsightsTip;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        Modifier modifier = this.A03;
        String str = this.A08;
        String str2 = this.A09;
        InterfaceC16820sZ interfaceC16820sZ = this.A0B;
        boolean z = this.A0E;
        ImageUrl imageUrl = this.A05;
        String str3 = this.A07;
        boolean z2 = this.A0C;
        CLJ.A00(A0S, modifier, this.A04, imageUrl, str, str2, str3, this.A06, interfaceC16820sZ, this.A0A, AbstractC25225BEi.A04(this.A00), AbstractC128295qy.A00(this.A01), this.A02, z, z2, this.A0D);
        return C0eB.A00;
    }
}
