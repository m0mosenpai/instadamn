package X;

import com.instagram.api.schemas.MetaPlaceDict;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DXg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30331DXg extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MetaPlaceDict A02;
    public final /* synthetic */ CT2 A03;
    public final /* synthetic */ ImageUrl A04;
    public final /* synthetic */ Double A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ InterfaceC16820sZ A09;
    public final /* synthetic */ InterfaceC16820sZ A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30331DXg(MetaPlaceDict metaPlaceDict, CT2 ct2, ImageUrl imageUrl, Double d, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A04 = imageUrl;
        this.A07 = str;
        this.A05 = d;
        this.A0D = z;
        this.A0C = z2;
        this.A0B = z3;
        this.A06 = str2;
        this.A03 = ct2;
        this.A0A = interfaceC16820sZ;
        this.A08 = interfaceC16820sZ2;
        this.A02 = metaPlaceDict;
        this.A09 = interfaceC16820sZ3;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        ImageUrl imageUrl = this.A04;
        String str = this.A07;
        Double d = this.A05;
        boolean z = this.A0D;
        boolean z2 = this.A0C;
        boolean z3 = this.A0B;
        String str2 = this.A06;
        AbstractC28384Cfn.A02(A0S, this.A02, this.A03, imageUrl, d, str, str2, this.A0A, this.A08, this.A09, AbstractC25225BEi.A04(this.A00), AbstractC128295qy.A00(this.A01), z, z2, z3);
        return C0eB.A00;
    }
}
