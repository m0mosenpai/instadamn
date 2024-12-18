package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class PIK implements InterfaceC147206jw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ C148656ma A03;
    public final /* synthetic */ String A04;

    public PIK(Context context, InterfaceC11380iw interfaceC11380iw, C148656ma c148656ma, String str, int i) {
        this.A03 = c148656ma;
        this.A01 = context;
        this.A04 = str;
        this.A02 = interfaceC11380iw;
        this.A00 = i;
    }

    @Override // X.InterfaceC147206jw
    public final void DZe() {
        C148656ma c148656ma = this.A03;
        if (!c148656ma.A01) {
            c148656ma.A06.EJJ();
        } else {
            c148656ma.A01 = false;
        }
    }

    @Override // X.InterfaceC147206jw
    public final void DZf() {
        C148656ma c148656ma = this.A03;
        C41181vS AuU = c148656ma.A06.AuU();
        if (AuU != null && AuU.A1W()) {
            return;
        }
        C51622Yk c51622Yk = c148656ma.A00;
        if (c51622Yk != null) {
            c51622Yk.A03(true);
        }
        c148656ma.A00 = null;
    }

    @Override // X.InterfaceC147206jw
    public final void onClick() {
        C41181vS AuU;
        String str;
        InterfaceC38711r3 interfaceC38711r3;
        List BQh;
        C38321qM A0x;
        String A2u;
        Long A0k;
        List BQh2;
        C148656ma c148656ma = this.A03;
        InterfaceC1118853a interfaceC1118853a = c148656ma.A06;
        C41181vS AuU2 = interfaceC1118853a.AuU();
        if (AuU2 != null && AuU2.A1W() && (AuU = interfaceC1118853a.AuU()) != null) {
            String str2 = this.A04;
            InterfaceC11380iw interfaceC11380iw = this.A02;
            int i = this.A00;
            c148656ma.A01 = true;
            UserSession userSession = c148656ma.A04;
            Activity activity = c148656ma.A02;
            C14360o3.A0C(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C35265Fh0.A04((FragmentActivity) activity, userSession, AnonymousClass001.A0R("barcelona://media?id=", str2), "tisu", null);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_threads_in_stories_unit_post_tap");
            C105794pq c105794pq = AuU.A0D;
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
                    A0f.AAP("displayed_card_type", str);
                    A0f.Cht();
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }
}
