package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.LrD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49319LrD implements InterfaceC25195BCs {
    public final L5H A00;
    public final Handler A01;
    public final InterfaceC159877Ez A02;
    public final EnumC46186KcO A03;
    public final C2EE A04;
    public final C160557Hp A05;
    public final C7FV A06;
    public final C159347Cu A07;
    public final C35152Feu A08;
    public final DirectThreadKey A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final InterfaceC16820sZ A0D;
    public final InterfaceC16620sF A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C49319LrD(Context context, Handler handler, UserSession userSession, InterfaceC159877Ez interfaceC159877Ez, C163997Vo c163997Vo, EnumC46186KcO enumC46186KcO, C7IK c7ik, C2EE c2ee, C159737El c159737El, C160557Hp c160557Hp, C7FV c7fv, C7F2 c7f2, C159347Cu c159347Cu, C35152Feu c35152Feu, DirectThreadKey directThreadKey, Integer num, String str, String str2, String str3, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2, boolean z3) {
        AbstractC25233BEq.A0v(1, userSession, context, handler);
        AbstractC25229BEm.A1O(c7f2, 14, interfaceC159877Ez);
        C14360o3.A0B(c7fv, 16);
        C14360o3.A0B(c163997Vo, 18);
        this.A01 = handler;
        this.A0B = str;
        this.A0A = str2;
        this.A0F = z;
        this.A0G = z2;
        this.A0C = list;
        this.A09 = directThreadKey;
        this.A03 = enumC46186KcO;
        this.A07 = c159347Cu;
        this.A04 = c2ee;
        this.A02 = interfaceC159877Ez;
        this.A06 = c7fv;
        this.A08 = c35152Feu;
        this.A05 = c160557Hp;
        this.A0E = interfaceC16620sF;
        this.A0D = interfaceC16820sZ;
        this.A00 = new L5H(null, context, userSession, c163997Vo, c7ik, c159737El, c7f2, num, str3, z3, true, true);
    }

    @Override // X.InterfaceC25195BCs
    public final AbstractC59962oe AMG(C3DN c3dn) {
        L5H l5h = this.A00;
        UserSession userSession = l5h.A02;
        Context context = l5h.A01;
        Handler handler = this.A01;
        EnumC46186KcO enumC46186KcO = this.A03;
        C2EE c2ee = this.A04;
        C7F2 c7f2 = l5h.A06;
        InterfaceC159877Ez interfaceC159877Ez = this.A02;
        C7FV c7fv = this.A06;
        C35152Feu c35152Feu = this.A08;
        C163997Vo c163997Vo = l5h.A03;
        C160557Hp c160557Hp = this.A05;
        C48784Lhr c48784Lhr = new C48784Lhr(context, handler, userSession, interfaceC159877Ez, c163997Vo, enumC46186KcO, c2ee, l5h.A05, c160557Hp, c7fv, c7f2, c35152Feu, c3dn, this.A0D, this.A0E);
        String str = this.A0A;
        String str2 = this.A0B;
        C159347Cu c159347Cu = this.A07;
        boolean z = c159347Cu.A0E;
        boolean z2 = this.A0F;
        boolean z3 = c159347Cu.A07;
        boolean z4 = c159347Cu.A0D;
        boolean z5 = c159347Cu.A0B;
        boolean z6 = c159347Cu.A05;
        boolean z7 = c159347Cu.A04;
        boolean z8 = c159347Cu.A08;
        boolean z9 = c159347Cu.A0C;
        boolean A1Z = AbstractC167007dF.A1Z(c159347Cu.A02);
        boolean z10 = c159347Cu.A09;
        boolean z11 = c159347Cu.A03;
        boolean z12 = c159347Cu.A06;
        boolean z13 = c159347Cu.A0A;
        boolean z14 = this.A0G;
        List list = this.A0C;
        DirectThreadKey directThreadKey = this.A09;
        C14360o3.A0B(enumC46186KcO, 4);
        C14360o3.A0B(list, 22);
        return AbstractC47845LBn.A00(userSession, c48784Lhr, enumC46186KcO, directThreadKey, str, str2, list, z, z2, z3, z4, z5, z6, z7, z8, z9, A1Z, z10, z11, z12, z13, z14, false, false);
    }

    @Override // X.InterfaceC25195BCs
    public final L5H Acd() {
        return this.A00;
    }
}
