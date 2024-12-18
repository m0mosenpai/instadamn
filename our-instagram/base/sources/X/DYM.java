package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class DYM extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ EnumC168517fl A03;
    public final /* synthetic */ C166047bW A04;
    public final /* synthetic */ ImageUrl A05;
    public final /* synthetic */ FollowStatus A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ Long A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ InterfaceC16660sJ A0A;
    public final /* synthetic */ InterfaceC16660sJ A0B;
    public final /* synthetic */ InterfaceC16610sE A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DYM(EnumC168517fl enumC168517fl, C166047bW c166047bW, ImageUrl imageUrl, FollowStatus followStatus, User user, Long l, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16610sE interfaceC16610sE, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(2);
        this.A08 = l;
        this.A07 = user;
        this.A09 = str;
        this.A05 = imageUrl;
        this.A0H = z;
        this.A0F = z2;
        this.A0D = z3;
        this.A0E = z4;
        this.A0A = interfaceC16660sJ;
        this.A0C = interfaceC16610sE;
        this.A04 = c166047bW;
        this.A0G = z5;
        this.A0B = interfaceC16660sJ2;
        this.A06 = followStatus;
        this.A03 = enumC168517fl;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        Long l = this.A08;
        User user = this.A07;
        String str = this.A09;
        ImageUrl imageUrl = this.A05;
        boolean z = this.A0H;
        boolean z2 = this.A0F;
        boolean z3 = this.A0D;
        boolean z4 = this.A0E;
        InterfaceC16660sJ interfaceC16660sJ = this.A0A;
        InterfaceC16610sE interfaceC16610sE = this.A0C;
        C166047bW c166047bW = this.A04;
        boolean z5 = this.A0G;
        InterfaceC16660sJ interfaceC16660sJ2 = this.A0B;
        AbstractC27584CFd.A00(A0S, this.A03, c166047bW, imageUrl, this.A06, user, l, str, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16610sE, AbstractC25225BEi.A04(this.A00), AbstractC128295qy.A00(this.A01), this.A02, z, z2, z3, z4, z5);
        return C0eB.A00;
    }
}
