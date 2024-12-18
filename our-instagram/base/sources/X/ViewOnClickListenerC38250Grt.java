package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Grt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC38250Grt implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C47N A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ C38241Grk A05;
    public final /* synthetic */ C38240Grj A06;
    public final /* synthetic */ C37524Gfg A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ C15100pQ A0A;
    public final /* synthetic */ boolean A0B;

    public ViewOnClickListenerC38250Grt(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47N c47n, User user, C38241Grk c38241Grk, C38240Grj c38240Grj, C37524Gfg c37524Gfg, String str, List list, C15100pQ c15100pQ, boolean z) {
        this.A09 = list;
        this.A0A = c15100pQ;
        this.A02 = userSession;
        this.A04 = user;
        this.A03 = c47n;
        this.A01 = interfaceC11380iw;
        this.A08 = str;
        this.A06 = c38240Grj;
        this.A00 = activity;
        this.A07 = c37524Gfg;
        this.A05 = c38241Grk;
        this.A0B = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1235934304);
        List list = this.A09;
        list.remove(this.A0A.A00);
        int i = C37549Gg5.A04 - 1;
        C37549Gg5.A04 = i;
        int i2 = 0;
        if (i < 0) {
            C37549Gg5.A04 = 0;
        }
        UserSession userSession = this.A02;
        User user = this.A04;
        String id = user.getId();
        C47N c47n = this.A03;
        C1GJ.A03(FY5.A01(userSession, id, c47n.CEI(), c47n.getAlgorithm()));
        C63702ur c63702ur = C37549Gg5.A06;
        if (c63702ur != null) {
            c63702ur.A07(new C6PH(C38238Grh.A00(this.A01, c47n, user, (Integer) C37549Gg5.A0A.get(user.getId()), this.A08)));
        }
        if (list.size() < 4) {
            C38240Grj c38240Grj = this.A06;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            Activity activity = this.A00;
            C37524Gfg c37524Gfg = this.A07;
            C38238Grh.A02(activity, interfaceC11380iw, userSession, c38240Grj, c37524Gfg, this.A08, list, false);
            if (list.isEmpty() && c37524Gfg != null) {
                c37524Gfg.A00();
            }
        } else {
            C47N c47n2 = (C47N) list.get(C37549Gg5.A04);
            int i3 = C37549Gg5.A04;
            User CDj = c47n2.CDj();
            if (CDj != null) {
                C38240Grj c38240Grj2 = this.A06;
                C38241Grk c38241Grk = this.A05;
                C38238Grh.A01(this.A00, this.A01, userSession, CDj, c38241Grk, c38240Grj2, this.A07, this.A08, list, i3, this.A0B);
            }
            if (C37549Gg5.A04 < AbstractC25226BEj.A05(list)) {
                i2 = C37549Gg5.A04 + 1;
            }
            C37549Gg5.A04 = i2;
        }
        C0f9.A0C(433383612, A05);
    }
}
