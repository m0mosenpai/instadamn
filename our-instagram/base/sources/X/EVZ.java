package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EVZ extends AbstractC60592pi implements InterfaceC161877Mx {
    public C1570473j A00;
    public InterfaceC70513Em A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public C161887My A05;
    public final AbstractC59962oe A06;
    public final InterfaceC37199GaA A07;
    public final UserSession A08;

    public EVZ(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC37199GaA interfaceC37199GaA) {
        C14360o3.A0B(userSession, 1);
        this.A08 = userSession;
        this.A06 = abstractC59962oe;
        this.A07 = interfaceC37199GaA;
        this.A02 = true;
        abstractC59962oe.registerLifecycleListener(this);
    }

    public final View A01(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout_refreshable_recyclerview_with_progress, viewGroup, false);
        UserSession userSession = this.A08;
        C14360o3.A0A(inflate);
        this.A01 = AbstractC1571573u.A01(inflate, userSession, new GHu(this, 0));
        C161887My c161887My = this.A05;
        if (c161887My == null) {
            C14360o3.A0F("followStatusUpdatedEventListener");
            throw C00O.createAndThrow();
        }
        c161887My.A00();
        return inflate;
    }

    @Override // X.InterfaceC161877Mx
    public final boolean AJn(String str) {
        C14360o3.A0B(str, 0);
        return this.A07.AJn(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r5.A02 != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            r4 = 0
            X.C14360o3.A0B(r6, r4)
            boolean r0 = r5.A03
            if (r0 != 0) goto Ld
            boolean r1 = r5.A02
            r0 = 0
            if (r1 == 0) goto Le
        Ld:
            r0 = 1
        Le:
            X.2oe r1 = r5.A06
            X.AbstractC31557Dth.A01(r1, r0)
            boolean r0 = r1 instanceof X.InterfaceC60682pr
            if (r0 == 0) goto L3b
            X.3Em r0 = r5.A01
            java.lang.String r3 = "pullToRefresh"
            if (r0 == 0) goto L3c
            boolean r0 = r0 instanceof X.C71094Wnq
            if (r0 == 0) goto L3b
            X.2pr r1 = (X.InterfaceC60682pr) r1
            X.3FQ r2 = r1.getScrollingViewProxy()
            boolean r0 = r2 instanceof X.C3FR
            if (r0 == 0) goto L3b
            X.3FR r2 = (X.C3FR) r2
            X.3Em r1 = r5.A01
            if (r1 == 0) goto L3c
            X.Wnq r1 = (X.C71094Wnq) r1
            X.Ikp r0 = new X.Ikp
            r0.<init>(r5, r4)
            r2.EgS(r0, r1)
        L3b:
            return
        L3c:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EVZ.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(EVZ evz) {
        C1570473j c1570473j = evz.A00;
        if (c1570473j != null) {
            ((MTJ) c1570473j).A00.A04();
            C1570473j c1570473j2 = evz.A00;
            if (c1570473j2 != null) {
                c1570473j2.A0E("fetch_request_start");
                AbstractC59962oe abstractC59962oe = evz.A06;
                C1ON BEN = evz.A07.BEN();
                BEN.A00 = new EUA(evz);
                abstractC59962oe.schedule(BEN);
                return;
            }
        }
        C14360o3.A0F("perfLogger");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC161877Mx
    public final void FAg() {
        this.A07.FAg();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        AbstractC59962oe abstractC59962oe = this.A06;
        Context requireContext = abstractC59962oe.requireContext();
        UserSession userSession = this.A08;
        this.A05 = new C161887My(requireContext, userSession, this);
        C1570473j c1570473j = new C1570473j(userSession, "dp_page_2", 31793336);
        this.A00 = c1570473j;
        c1570473j.A0Q(abstractC59962oe.requireContext(), C55772hI.A00(userSession), abstractC59962oe);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        C161887My c161887My = this.A05;
        if (c161887My == null) {
            C14360o3.A0F("followStatusUpdatedEventListener");
            throw C00O.createAndThrow();
        }
        c161887My.A01();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        if (this.A02) {
            A00(this);
        }
    }
}
