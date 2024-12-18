package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.listview.StickyHeaderListView;
import java.util.List;

/* renamed from: X.3BT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BT implements InterfaceC60602pj, C36Z {
    public long A00;
    public long A01;
    public StickyHeaderListView A02;
    public final C0JO A03;
    public final AbstractC60672pq A04;
    public final InterfaceC11380iw A05;
    public final C18920wW A06;
    public final UserSession A07;
    public final C65192xH A08;
    public final InterfaceC63342uH A09;
    public final C1M1 A0A;

    public C3BT(C0JO c0jo, AbstractC60672pq abstractC60672pq, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW, UserSession userSession, C65192xH c65192xH, InterfaceC63342uH interfaceC63342uH, C1M1 c1m1) {
        C14360o3.A0B(c1m1, 6);
        this.A04 = abstractC60672pq;
        this.A07 = userSession;
        this.A06 = c18920wW;
        this.A08 = c65192xH;
        this.A09 = interfaceC63342uH;
        this.A0A = c1m1;
        this.A05 = interfaceC11380iw;
        this.A03 = c0jo;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.C36Z
    public final /* bridge */ /* synthetic */ void CtG(Object obj) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        this.A02 = (StickyHeaderListView) view.findViewById(R.id.sticky_header_list);
    }

    @Override // X.C36Z
    public final void FDm(C3AB c3ab, int i) {
        C14360o3.A0B(c3ab, 0);
        C65192xH c65192xH = this.A08;
        Object item = c65192xH.getItem(i);
        if (item != null) {
            C3CL c3cl = (C3CL) item;
            String str = c3cl.A04.A0B;
            if (str != null) {
                c3ab.FDo(str, c3cl, c65192xH.A05(c3cl).getPosition());
                C3FQ scrollingViewProxy = this.A04.getScrollingViewProxy();
                int B6q = scrollingViewProxy.B6q();
                View AnW = scrollingViewProxy.AnW(i);
                if (AnW == null) {
                    C0K8.A0Q("EndOfFeedDemarcatorTracked", "row View is null, position:%d, first visible position: %d", Integer.valueOf(i), Integer.valueOf(B6q));
                    return;
                }
                C14360o3.A07(scrollingViewProxy.CFj());
                double A01 = C81203jp.A01(r1, AnW, this.A02) / AnW.getHeight();
                if (A01 <= 0.0d) {
                    return;
                }
                c3ab.FDp(AnW, c3cl, str, A01);
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A02 = null;
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.C36Z
    public final Class CAO() {
        return C3CL.class;
    }

    @Override // X.C36Z
    public final /* bridge */ /* synthetic */ void CtH(Object obj) {
        String str;
        Long A0k;
        int i;
        C3CL c3cl = (C3CL) obj;
        C14360o3.A0B(c3cl, 0);
        EnumC127065ok enumC127065ok = EnumC127065ok.A05;
        if (this.A01 != 0) {
            long now = this.A03.now();
            long j = now - this.A01;
            this.A01 = 0L;
            if (now - this.A00 >= 3000) {
                C65192xH c65192xH = this.A08;
                C110464yI A05 = c65192xH.A05(c3cl);
                C127085om A00 = AbstractC127075ol.A00(this.A07);
                C1M1 c1m1 = this.A0A;
                String sessionId = c1m1.getSessionId();
                InterfaceC11380iw interfaceC11380iw = this.A05;
                String moduleName = interfaceC11380iw.getModuleName();
                C18920wW A01 = AbstractC12220kQ.A01(new C19270xB(moduleName), A00.A00);
                InterfaceC02590Ai A002 = A01.A00(A01.A00, "instagram_feed_demarcator");
                if (A002.isSampled()) {
                    A002.AAP("module", moduleName);
                    A002.A9K("ig_media_id", Long.MIN_VALUE);
                    A002.AAP("inventory_source", c3cl.A07.toString());
                    A002.A9K("m_ix", Long.valueOf(A05.getPosition()));
                    A002.AAP("ranking_session_id", sessionId);
                    A002.AAP("detail", A05.A02);
                    A002.Cht();
                }
                if (c3cl.A07 == C1XV.A0F && (str = c3cl.A04.A0B) != null && (A0k = AbstractC003100w.A0k(10, str)) != null) {
                    C18920wW c18920wW = this.A06;
                    InterfaceC02590Ai A003 = c18920wW.A00(c18920wW.A00, "ig_main_feed_seen_eof_demarcator");
                    if (A003.isSampled()) {
                        A003.A9K("demarcator_id", A0k);
                        A003.AAP("module", interfaceC11380iw.getModuleName());
                        A003.AAP("ranking_session_id", c1m1.getSessionId());
                        A003.A8I("dwell_time", Double.valueOf(j));
                        A003.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, enumC127065ok.toString());
                        int[] modelIndex = c65192xH.getModelIndex(c3cl);
                        if (modelIndex != null && modelIndex.length != 0) {
                            int i2 = modelIndex[0];
                            C65312xT c65312xT = (C65312xT) ((AbstractC65202xI) c65192xH).A00;
                            synchronized (c65312xT.A03) {
                                i = -1;
                                List list = ((AbstractC65332xV) c65312xT).A01;
                                C14360o3.A07(list);
                                for (int i3 = 0; i3 < list.size() && i3 <= i2; i3++) {
                                    if (((C3XG) ((AbstractC65332xV) c65312xT).A01.get(i3)).A05 instanceof InterfaceC38371qR) {
                                        i++;
                                    }
                                }
                            }
                            if (i != -1) {
                                A003.A9K("last_media_index", Long.valueOf(i));
                            }
                        }
                        A003.Cht();
                    }
                }
                this.A00 = now;
            }
        }
    }

    @Override // X.C36Z
    public final /* bridge */ /* synthetic */ void CtJ(Object obj, int i) {
        if (this.A01 == 0) {
            this.A01 = this.A03.now();
        }
        if (this.A04.getContext() != null) {
            C34H.A00(C05F.A1F);
            if (i == 0) {
                C34H.A00(C05F.A15);
            }
        }
    }

    @Override // X.C36Z
    public final /* bridge */ /* synthetic */ void CtL(View view, Object obj, double d) {
        C3CL c3cl = (C3CL) obj;
        C14360o3.A0B(c3cl, 0);
        C110464yI A05 = this.A08.A05(c3cl);
        if ((!C14360o3.A0K(c3cl.A04.A07, false)) && d > 0.800000011920929d && !A05.A03) {
            A05.A03 = true;
            this.A09.ANj(c3cl);
        }
        if (d > 0.75d) {
            A05.A00();
        }
    }

    @Override // X.C36Z
    public final /* bridge */ /* synthetic */ void CtI(Object obj, int i) {
    }
}
