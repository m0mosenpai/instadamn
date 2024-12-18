package X;

import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gfs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37536Gfs extends AbstractC64162vb {
    public final InterfaceC60442pS A00;
    public final C37526Gfi A01;
    public final InterfaceC09390do A02;

    public C37536Gfs(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C37526Gfi c37526Gfi) {
        super(C1BX.A03.A01(AbstractC62752tE.A00(userSession, "clips_viewer_multi_ad")));
        this.A01 = c37526Gfi;
        this.A00 = interfaceC60442pS;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new BQP(userSession, 2));
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        Long l;
        int i;
        int i2;
        int i3;
        int i4;
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        if (c120985dq.A0G()) {
            C37526Gfi c37526Gfi = this.A01;
            long A06 = c37644Ghd.A06();
            Long valueOf = Long.valueOf(A06);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c37526Gfi.A01, AbstractC111324zv.A00(2553));
            String str = null;
            if (A0f.isSampled()) {
                IntentAwareAdsInfoIntf A00 = C42159Im7.A00(c120985dq);
                List A01 = C42159Im7.A01(c120985dq);
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = A01.iterator();
                while (it.hasNext()) {
                    Long A0j = AbstractC25231BEo.A0j(0, ((C40971v4) it.next()).A0S);
                    if (A0j != null) {
                        A1E.add(A0j);
                    }
                }
                if (valueOf == null) {
                    A06 = -1;
                }
                C37526Gfi.A00(A0f, c37526Gfi, A06);
                A0f.AAk("ad_ids", A1E);
                A0f.A9K("first_hscroll_item_ad_id", (Long) AbstractC001800i.A0J(A1E));
                AbstractC37301Gc2.A15(A0f, c37526Gfi.A00);
                Integer BVJ = A00.BVJ();
                if (BVJ != null) {
                    l = AbstractC25229BEm.A0n(BVJ);
                } else {
                    l = null;
                }
                A0f.A9K("multi_ads_type_number", l);
                AbstractC37301Gc2.A14(A0f, A00);
                A0f.AAP("insertion_mechanism", A00.BIG());
                AbstractC37303Gc4.A0d(A0f, A00, AbstractC37302Gc3.A0W(A00.Brx()));
                AbstractC37302Gc3.A0v(A0f, A00);
                C75113Zb c75113Zb = c37644Ghd.A0E;
                if (c75113Zb != null) {
                    i = c75113Zb.A0M;
                } else {
                    i = -1;
                }
                A0f.A9K(AbstractC111324zv.A00(2424), AbstractC31171DnF.A0V(i));
                if (c75113Zb != null) {
                    i2 = c75113Zb.A0L;
                } else {
                    i2 = -1;
                }
                A0f.A9K(AbstractC111324zv.A00(2423), AbstractC31171DnF.A0V(i2));
                if (c75113Zb != null) {
                    i3 = c75113Zb.A0K;
                } else {
                    i3 = -1;
                }
                A0f.A9K(AbstractC111324zv.A00(2422), AbstractC31171DnF.A0V(i3));
                if (c75113Zb != null) {
                    i4 = c75113Zb.A0I;
                } else {
                    i4 = -1;
                }
                A0f.A9K(AbstractC111324zv.A00(2421), AbstractC31171DnF.A0V(i4));
                Integer A2T = AbstractC25226BEj.A0y(c120985dq).A2T();
                if (A2T != null) {
                    str = A2T.toString();
                }
                A0f.AAP("imp_signature", str);
                A0f.Cht();
            }
            C37695GiW c37695GiW = (C37695GiW) this.A02.getValue();
            if (c37695GiW != null) {
                C37695GiW.A03(c120985dq, c37644Ghd, this.A00, c37695GiW, false);
            }
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
        C37695GiW c37695GiW = (C37695GiW) this.A02.getValue();
        if (c37695GiW != null) {
            C37695GiW.A03(c120985dq, c37644Ghd, this.A00, c37695GiW, A1a);
        }
    }
}
