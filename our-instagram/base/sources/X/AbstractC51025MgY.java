package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import java.util.List;

/* renamed from: X.MgY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51025MgY extends AbstractC52922bZ {
    public int A00;
    public AnonymousClass195 A01;
    public final C2GT A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C17060sy A05;
    public final O92 A06;
    public final IgLiveBroadcastInfoManager A07;
    public final C147856lA A08;
    public final OLC A09;
    public final MTU A0A;
    public final InterfaceC24731Iq A0B;
    public final InterfaceC19390xP A0C;
    public final C05A A0D;
    public final boolean A0E;
    public final OBA A0F;

    public AbstractC51025MgY(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C17060sy c17060sy, OBA oba, O92 o92, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C147856lA c147856lA, OLC olc, MTU mtu, boolean z) {
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A09 = olc;
        this.A07 = igLiveBroadcastInfoManager;
        this.A08 = c147856lA;
        this.A0A = mtu;
        this.A0E = z;
        this.A0F = oba;
        this.A06 = o92;
        this.A05 = c17060sy;
        C008002u A1H = AbstractC25225BEi.A1H(new C51608Mr0(0, 1, true, false, false));
        this.A0D = A1H;
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A0B = A12;
        this.A0C = AbstractC07080Za.A03(A12);
        this.A02 = MSZ.A0L(new D5F(this, (InterfaceC23621Ds) null), igLiveBroadcastInfoManager.A06, A1H, olc.A0i);
        MSZ.A17(this, C57167PZl.A01(this, null, 40), mtu.A00);
    }

    public final void A02(InterfaceC58171Pqb interfaceC58171Pqb) {
        User user;
        String str;
        String str2;
        C14360o3.A0B(interfaceC58171Pqb, 0);
        C0UO c0uo = this.A07.A06;
        C51709Mse A0u = MSW.A0u(c0uo);
        if (A0u != null && (user = A0u.A05) != null) {
            String id = user.getId();
            O92 o92 = this.A06;
            C51709Mse A0u2 = MSW.A0u(c0uo);
            if (A0u2 != null) {
                str = A0u2.A09;
            } else {
                str = null;
            }
            long A00 = this.A08.A00();
            C16930sl c16930sl = C16930sl.A00;
            C14360o3.A0B(c16930sl, 4);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(o92.A00, o92.A01), "ig_live_client_comment_impression");
            Long A0k = AbstractC003100w.A0k(10, id);
            long j = 0;
            MSY.A11(A0f, AbstractC25232BEp.A0t(A0k));
            User CDj = interfaceC58171Pqb.CDj();
            if (CDj != null) {
                j = MSZ.A0D(CDj.getId());
            }
            A0f.A9K("ca_pk", Long.valueOf(j));
            EnumC53264Nh2 BO3 = interfaceC58171Pqb.BO3();
            if (BO3 == null || (str2 = BO3.A01) == null) {
                str2 = EnumC53264Nh2.A0K.A01;
            }
            A0f.AAP("comment_type", str2);
            if (str == null) {
                str = "";
            }
            AbstractC37300Gc1.A0l(A0f, str);
            A0f.A9K("live_position", Long.valueOf(A00));
            A0f.AAk("friend_chat_ids", c16930sl);
            A0f.A7v("is_from_pill", false);
            A0f.Cht();
        }
    }

    public static boolean A00(AbstractC51025MgY abstractC51025MgY) {
        return ((C51608Mr0) abstractC51025MgY.A0D.getValue()).A04;
    }

    public void A01(InterfaceC58171Pqb interfaceC58171Pqb) {
        InterfaceC23621Ds A0s = AbstractC25230BEn.A0s(this.A01);
        this.A01 = AbstractC25226BEj.A1L(new D4r(this, A0s, 0), AbstractC141776au.A00(this));
    }

    public void A03(List list, int i, boolean z, boolean z2, boolean z3) {
        C05A c05a = this.A0D;
        c05a.Egh(new C51608Mr0(i, 1, z, ((C51608Mr0) c05a.getValue()).A02, z2));
    }
}
