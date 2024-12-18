package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.OPk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54889OPk {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, int i, boolean z) {
        String str;
        InterfaceC38711r3 interfaceC38711r3;
        List BQh;
        C38321qM A0x;
        String A2u;
        Long A0k;
        List BQh2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_threads_in_stories_unit_post_vpvd_imp");
        C105794pq c105794pq = c41181vS.A0D;
        String A00 = AbstractC111324zv.A00(43);
        C18C.A07(c105794pq, A00);
        int i2 = 0;
        if (c105794pq != null && (BQh2 = c105794pq.A00.BQh()) != null && BQh2.size() > 1) {
            str = "three_media";
        } else {
            str = "one_media";
        }
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1I(A0f, "ig_threads_in_stories_unit");
            C18C.A07(c105794pq, A00);
            if (c105794pq != null && (BQh = (interfaceC38711r3 = c105794pq.A00).BQh()) != null && (A0x = AbstractC25225BEi.A0x(BQh, i)) != null && (A2u = A0x.A2u()) != null && (A0k = AbstractC003100w.A0k(10, A2u)) != null) {
                AbstractC37300Gc1.A0h(A0f, A0k);
                List BQh3 = interfaceC38711r3.BQh();
                if (BQh3 != null) {
                    i2 = BQh3.size();
                }
                A0f.A8p("total_num_candidates", Integer.valueOf(i2));
                AbstractC25229BEm.A19(A0f, i);
                AbstractC37302Gc3.A0t(A0f);
                String Bjj = interfaceC38711r3.Bjj();
                if (Bjj == null) {
                    Bjj = "";
                }
                A0f.A9K("quick_promotion_id", AbstractC003100w.A0k(10, Bjj));
                A0f.A9K("netego_id", AbstractC003100w.A0k(10, c105794pq.getId()));
                A0f.A8I(AbstractC111324zv.A00(136), null);
                A0f.A7v(AbstractC111324zv.A00(459), AbstractC31173DnH.A0e(A0f, "ranking_info_token", null, z));
                A0f.AAP("displayed_card_type", str);
                A0f.Cht();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, boolean z) {
        String str;
        Long l;
        Long l2;
        List BQh;
        List BQh2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_threads_in_stories_unit_tray_vpvd_imp");
        C105794pq c105794pq = c41181vS.A0D;
        String A00 = AbstractC111324zv.A00(43);
        C18C.A07(c105794pq, A00);
        int i = 0;
        if (c105794pq != null && (BQh2 = c105794pq.A00.BQh()) != null && BQh2.size() > 1) {
            str = "three_media";
        } else {
            str = "one_media";
        }
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1I(A0f, "ig_threads_in_stories_unit");
            C18C.A07(c105794pq, A00);
            if (c105794pq != null && (BQh = c105794pq.A00.BQh()) != null) {
                i = BQh.size();
            }
            A0f.A8p("total_num_candidates", Integer.valueOf(i));
            A0f.A8p(AbstractC111324zv.A00(233), null);
            AbstractC37302Gc3.A0t(A0f);
            C18C.A07(c105794pq, A00);
            if (c105794pq != null) {
                String Bjj = c105794pq.A00.Bjj();
                if (Bjj == null) {
                    Bjj = "";
                }
                l = AbstractC166997dE.A0j(Bjj);
            } else {
                l = null;
            }
            A0f.A9K("quick_promotion_id", l);
            C18C.A07(c105794pq, A00);
            if (c105794pq != null) {
                l2 = AbstractC166997dE.A0j(c105794pq.getId());
            } else {
                l2 = null;
            }
            A0f.A9K("netego_id", l2);
            A0f.A8I(AbstractC111324zv.A00(136), null);
            A0f.A7v(AbstractC111324zv.A00(459), AbstractC31173DnH.A0e(A0f, "ranking_info_token", null, z));
            A0f.AAP("displayed_card_type", str);
            A0f.Cht();
        }
    }
}
