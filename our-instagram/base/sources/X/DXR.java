package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;

/* loaded from: classes5.dex */
public final class DXR extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ FollowStatus A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ InterfaceC16820sZ A08;
    public final /* synthetic */ InterfaceC16660sJ A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DXR(ImageUrl imageUrl, FollowStatus followStatus, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A02 = imageUrl;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A0A = z;
        this.A03 = followStatus;
        this.A0B = z2;
        this.A0C = z3;
        this.A09 = interfaceC16660sJ;
        this.A08 = interfaceC16820sZ;
        this.A07 = interfaceC16820sZ2;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        ImageUrl imageUrl = this.A02;
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A04;
        boolean z = this.A0A;
        FollowStatus followStatus = this.A03;
        boolean z2 = this.A0B;
        boolean z3 = this.A0C;
        AbstractC28490Chi.A04(A0S, imageUrl, followStatus, str, str2, str3, this.A08, this.A07, this.A09, AbstractC25225BEi.A04(this.A00), AbstractC128295qy.A00(this.A01), z, z2, z3);
        return C0eB.A00;
    }
}
