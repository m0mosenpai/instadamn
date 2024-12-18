package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DXs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30343DXs extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Modifier A03;
    public final /* synthetic */ LineType A04;
    public final /* synthetic */ C25981BeV A05;
    public final /* synthetic */ ImageUrl A06;
    public final /* synthetic */ ImageUrl A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ InterfaceC16820sZ A0B;
    public final /* synthetic */ InterfaceC16820sZ A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30343DXs(Modifier modifier, LineType lineType, C25981BeV c25981BeV, ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A08 = str;
        this.A06 = imageUrl;
        this.A07 = imageUrl2;
        this.A09 = str2;
        this.A0A = str3;
        this.A04 = lineType;
        this.A05 = c25981BeV;
        this.A0D = z;
        this.A03 = modifier;
        this.A0B = interfaceC16820sZ;
        this.A0C = interfaceC16820sZ2;
        this.A0E = z2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        String str = this.A08;
        ImageUrl imageUrl = this.A06;
        ImageUrl imageUrl2 = this.A07;
        String str2 = this.A09;
        String str3 = this.A0A;
        LineType lineType = this.A04;
        C25981BeV c25981BeV = this.A05;
        boolean z = this.A0D;
        AbstractC28299Cdl.A01(A0S, this.A03, lineType, c25981BeV, imageUrl, imageUrl2, str, str2, str3, this.A0B, this.A0C, AbstractC25225BEi.A04(this.A00), AbstractC128295qy.A00(this.A01), this.A02, z, this.A0E);
        return C0eB.A00;
    }
}
