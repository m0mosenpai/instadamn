package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes8.dex */
public final class LPS implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public LPS(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A00 = i;
        this.A01 = obj5;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A06 = str;
        this.A03 = obj4;
        this.A02 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        C2EY c2ey;
        String A00;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-933847176);
                C47983LJh c47983LJh = (C47983LJh) this.A02;
                String str2 = this.A06;
                User user = (User) this.A03;
                String id = user.getId();
                Long l = (Long) this.A04;
                AbstractC167017dG.A1N(str2, id);
                Integer num = C05F.A0N;
                C47983LJh.A02(C47983LJh.A00(c47983LJh, null, null, num, num, l, str2, id, null), c47983LJh);
                C45525KDq.A02((Activity) this.A01, (C45525KDq) this.A05, user.getId());
                i = -1059052417;
                break;
            case 1:
                A05 = C0f9.A05(-35877731);
                C15370ps c15370ps = (C15370ps) this.A01;
                C48257LXg c48257LXg = (C48257LXg) this.A05;
                C2DS c2ds = (C2DS) c48257LXg.A07.getValue();
                C2ED c2ed = (C2ED) this.A04;
                DirectThreadKey BKb = c2ed.BKb();
                L4Z l4z = c48257LXg.A02;
                String str3 = null;
                if (l4z != null) {
                    str = l4z.A02;
                } else {
                    str = null;
                }
                c15370ps.A00 = c2ds.BSh(BKb, String.valueOf(str));
                C48256LXf A002 = AbstractC46705KlO.A00(c48257LXg.A04);
                String str4 = this.A06;
                C83403nh c83403nh = (C83403nh) c15370ps.A00;
                if (c83403nh != null) {
                    c2ey = c83403nh.A10;
                } else {
                    c2ey = null;
                }
                String valueOf = String.valueOf(c2ey);
                long j = c48257LXg.A00;
                C14360o3.A0B(valueOf, 1);
                InterfaceC02590Ai A0H = JQ0.A0H(A002.A00, "direct_pinned_messages_banner_click", str4, valueOf);
                A0H.A9K("position_index", Long.valueOf(j));
                A0H.Cht();
                int i2 = c48257LXg.A00;
                L4Z l4z2 = c48257LXg.A02;
                if (l4z2 != null && AbstractC166997dE.A1Z(l4z2.A00, false)) {
                    C7U0 c7u0 = c48257LXg.A05;
                    L4Z l4z3 = c48257LXg.A02;
                    if (l4z3 != null) {
                        str3 = l4z3.A02;
                    }
                    c7u0.FBQ(new L3Q(c48257LXg, c2ed, str4, c15370ps, i2), String.valueOf(str3));
                }
                int i3 = c48257LXg.A00 + 1;
                List list = (List) this.A03;
                c48257LXg.A00 = i3 % list.size();
                C48257LXg.A00(c48257LXg.A03, (View) this.A02, c48257LXg, list);
                i = 2097574621;
                break;
            default:
                A05 = AbstractC43593JPy.A03(view, 1797518575);
                InterfaceC144586fe interfaceC144586fe = (InterfaceC144586fe) this.A03;
                C41551w4 c41551w4 = (C41551w4) this.A04;
                C41181vS c41181vS = (C41181vS) this.A02;
                String str5 = this.A06;
                interfaceC144586fe.D1K(AbstractC31174DnI.A0A(view), c41181vS, c41551w4, str5);
                UserSession userSession = (UserSession) this.A05;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                if (C14360o3.A0K(str5, "story_remix_reply")) {
                    A00 = "entrypoint";
                } else {
                    A00 = AbstractC111324zv.A00(5277);
                }
                AbstractC43821JZj.A00(interfaceC11380iw, userSession, null, A00, "tap", "story_viewer", c41181vS.A0j, null);
                i = 1786866033;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
