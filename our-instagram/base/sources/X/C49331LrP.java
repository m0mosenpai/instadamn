package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.LrP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49331LrP implements C7B8 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ InterfaceC50476MQe A02;
    public final /* synthetic */ C43931Jbg A03;
    public final /* synthetic */ C45093JxN A04;
    public final /* synthetic */ C2EC A05;

    @Override // X.C7B8
    public final void DqF(List list) {
        C14360o3.A0B(list, 0);
        C83403nh c83403nh = (C83403nh) list.get(0);
        C43931Jbg c43931Jbg = this.A03;
        UserSession userSession = c43931Jbg.A04;
        if (!c83403nh.A1e(userSession)) {
            this.A02.DRV();
            this.A05.C7I();
            return;
        }
        Context context = this.A00;
        C2EC c2ec = this.A05;
        User A04 = C4GQ.A04(userSession, c83403nh, c2ec);
        if (A04 != null) {
            C45093JxN A02 = AbstractC101604hV.A02(context, userSession, c83403nh, A04, C4GQ.A06(c2ec));
            this.A02.DSE(this.A04, A02);
            C43931Jbg.A00(c43931Jbg, A02, this.A01.getModuleName());
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C49331LrP(Context context, InterfaceC11380iw interfaceC11380iw, InterfaceC50476MQe interfaceC50476MQe, C43931Jbg c43931Jbg, C45093JxN c45093JxN, C2EC c2ec) {
        this.A03 = c43931Jbg;
        this.A02 = interfaceC50476MQe;
        this.A01 = interfaceC11380iw;
        this.A05 = c2ec;
        this.A04 = c45093JxN;
        this.A00 = context;
    }

    @Override // X.C7B8
    public final void DG4(String str) {
        C43931Jbg.A00(this.A03, this.A04, this.A01.getModuleName());
    }
}
