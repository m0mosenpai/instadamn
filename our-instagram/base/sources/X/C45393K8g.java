package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.direct.store.InboxNetworkSource;
import java.util.Iterator;

/* renamed from: X.K8g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45393K8g extends AnonymousClass935 {
    public long A00;
    public final boolean A01;
    public final /* synthetic */ InboxNetworkSource A02;

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(2062859916);
        C99Z c99z = (C99Z) obj;
        int A0G = AbstractC25231BEo.A0G(c99z, 1830088803);
        InboxNetworkSource inboxNetworkSource = this.A02;
        Iterator it = inboxNetworkSource.A0C.iterator();
        while (it.hasNext()) {
            ((C1P1) it.next()).onSuccessInBackground(c99z);
        }
        inboxNetworkSource.A09.A0O(inboxNetworkSource.A08, c99z, inboxNetworkSource.A0A, C4I3.A03, !this.A01);
        C0f9.A0A(1323946613, A0G);
        C0f9.A0A(-346432167, A03);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45393K8g(UserSession userSession, InboxNetworkSource inboxNetworkSource, boolean z) {
        super(userSession);
        this.A02 = inboxNetworkSource;
        this.A01 = z;
    }

    @Override // X.AnonymousClass935
    public final void A01(UserSession userSession) {
        int A03 = C0f9.A03(-747207280);
        InboxNetworkSource inboxNetworkSource = this.A02;
        inboxNetworkSource.A05 = false;
        Iterator it = inboxNetworkSource.A0C.iterator();
        while (it.hasNext()) {
            ((C1P1) it.next()).onFinish();
        }
        C0f9.A0A(-631519919, A03);
    }

    @Override // X.AnonymousClass935
    public final void A02(UserSession userSession) {
        String str;
        int A03 = C0f9.A03(1906569470);
        DLogTag.DIRECT_HTTP direct_http = DLogTag.DIRECT_HTTP.INSTANCE;
        if (this.A01) {
            str = "fetchNextPage";
        } else {
            str = "fetchFirstPage";
        }
        InboxNetworkSource inboxNetworkSource = this.A02;
        DLog.d(direct_http, "%s=%s", str, C99U.A00(inboxNetworkSource.A08.A03));
        inboxNetworkSource.A05 = true;
        inboxNetworkSource.A04 = false;
        this.A00 = System.currentTimeMillis();
        Iterator it = inboxNetworkSource.A0C.iterator();
        while (it.hasNext()) {
            ((C1P1) it.next()).onStart();
        }
        C0f9.A0A(-1906974600, A03);
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        AbstractC46972Dl abstractC46972Dl;
        Integer num;
        int A03 = C0f9.A03(1691763729);
        boolean A1R = AbstractC167007dF.A1R(0, userSession, abstractC115105If);
        InboxNetworkSource inboxNetworkSource = this.A02;
        inboxNetworkSource.A04 = A1R;
        Iterator it = inboxNetworkSource.A0C.iterator();
        while (it.hasNext()) {
            ((C1P1) it.next()).onFail(abstractC115105If);
        }
        boolean z = !this.A01;
        InterfaceC11380iw interfaceC11380iw = inboxNetworkSource.A00;
        if (interfaceC11380iw != null && ((num = (abstractC46972Dl = inboxNetworkSource.A08).A03) == C05F.A01 || num == C05F.A0N)) {
            C114675Fx A00 = AbstractC35240FgZ.A00(abstractC115105If);
            boolean A01 = C2E7.A01(AbstractC166997dE.A0Y(userSession));
            String str = AbstractC125565m2.A00(inboxNetworkSource.A0A).A00;
            long currentTimeMillis = System.currentTimeMillis() - this.A00;
            String A0h = AbstractC167007dF.A0h(abstractC46972Dl.A01.name());
            AbstractC167017dG.A1S(str, A00);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_request_fetch_failure");
            double d = currentTimeMillis / 1000.0d;
            if (A0f.isSampled()) {
                A0f.A9K(TraceFieldType.ErrorCode, Long.valueOf(AbstractC31178DnM.A03(AbstractC25231BEo.A0j(0, A00.A03))));
                A0f.AAP(AbstractC58317Pt9.A00(23), A00.A01.A01);
                String str2 = A00.A04;
                if (str2 == null) {
                    str2 = "";
                }
                A0f.A9T("first_page", AbstractC31173DnH.A0e(A0f, "error_info", str2, z));
                A0f.A8I("load_time", Double.valueOf(d));
                A0f.A7v("ranked_requests_enabled", Boolean.valueOf(A01));
                A0f.A9T("e_counter_channel", "");
                A0f.AAP("selected_filter", str);
                A0f.AAP("user_account_type", AbstractC08690cX.A01(userSession).A01);
                A0f.AAP("folder", A0h);
                A0f.Cht();
            }
        }
        C0f9.A0A(-1037400423, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(592208664);
        A07(userSession, (C99Z) obj);
        C0f9.A0A(1716750506, A03);
    }

    public final void A07(UserSession userSession, C99Z c99z) {
        boolean booleanValue;
        int A03 = C0f9.A03(-685874893);
        AbstractC167007dF.A1K(userSession, c99z);
        InboxNetworkSource inboxNetworkSource = this.A02;
        inboxNetworkSource.A04 = false;
        JWT jwt = c99z.A05;
        Boolean bool = jwt.A02;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        inboxNetworkSource.A03 = booleanValue;
        inboxNetworkSource.A01 = jwt.A03;
        Iterator it = inboxNetworkSource.A0C.iterator();
        while (it.hasNext()) {
            ((C1P1) it.next()).onSuccess(c99z);
        }
        AbstractC46972Dl abstractC46972Dl = inboxNetworkSource.A08;
        Integer num = abstractC46972Dl.A03;
        if (num == C05F.A00) {
            AbstractC43913JbO.A00(userSession).A01();
        } else {
            boolean z = !this.A01;
            InterfaceC11380iw interfaceC11380iw = inboxNetworkSource.A00;
            if (interfaceC11380iw != null && (num == C05F.A01 || num == C05F.A0N)) {
                C4I3 A00 = AbstractC125565m2.A00(inboxNetworkSource.A0A);
                int A05 = inboxNetworkSource.A09.A05();
                String str = A00.A00;
                long currentTimeMillis = System.currentTimeMillis() - this.A00;
                String A0h = AbstractC167007dF.A0h(abstractC46972Dl.A01.name());
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC11380iw, userSession, str, 4), "direct_request_fetch_success");
                double d = currentTimeMillis / 1000.0d;
                if (A0f.isSampled()) {
                    A0f.A9T("first_page", Boolean.valueOf(z));
                    A0f.A8I("load_time", Double.valueOf(d));
                    A0f.AAP("selected_filter", str);
                    A0f.A9K("total_requests", AbstractC31171DnF.A0V(A05));
                    A0f.A9T("e_counter_channel", "");
                    A0f.AAP("user_account_type", AbstractC08690cX.A01(userSession).A01);
                    A0f.AAP("folder", A0h);
                    A0f.Cht();
                }
            }
        }
        C0f9.A0A(1032991496, A03);
    }
}
