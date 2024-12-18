package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DXd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30328DXd extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ LineType A04;
    public final /* synthetic */ ImageUrl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ InterfaceC16820sZ A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30328DXd(Modifier modifier, LineType lineType, ImageUrl imageUrl, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.A04 = lineType;
        this.A0D = z;
        this.A0B = z2;
        this.A0A = z3;
        this.A08 = str;
        this.A05 = imageUrl;
        this.A0C = z4;
        this.A09 = interfaceC16820sZ;
        this.A07 = str2;
        this.A06 = str3;
        this.A03 = modifier;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        LineType lineType = this.A04;
        boolean z = this.A0D;
        boolean z2 = this.A0B;
        boolean z3 = this.A0A;
        String str = this.A08;
        ImageUrl imageUrl = this.A05;
        boolean z4 = this.A0C;
        InterfaceC16820sZ interfaceC16820sZ = this.A09;
        CEF.A00(A0S, this.A03, lineType, imageUrl, str, this.A07, this.A06, interfaceC16820sZ, AbstractC25225BEi.A04(this.A00), AbstractC128295qy.A00(this.A01), this.A02, z, z2, z3, z4);
        return C0eB.A00;
    }
}
