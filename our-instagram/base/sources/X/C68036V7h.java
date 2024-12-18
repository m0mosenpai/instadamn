package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.keyword.Keyword;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.V7h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68036V7h extends AbstractC42425IqS {
    public final int A00;
    public final Object A01;

    public C68036V7h(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC42425IqS
    public final void A0D(View view, C5qT c5qT, HKV hkv) {
        if (1 - this.A00 != 0) {
            super.A0D(view, c5qT, hkv);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.AbstractC42425IqS
    public final void A0E(C5qT c5qT, C38164GqV c38164GqV, C127935qM c127935qM) {
        C130535uy c130535uy;
        C38085GpE c38085GpE;
        C116875Qr c116875Qr;
        String str;
        ClipsViewerSource clipsViewerSource;
        switch (this.A00) {
            case 0:
                C67973V4n c67973V4n = (C67973V4n) this.A01;
                AbstractC59962oe abstractC59962oe = c67973V4n.A0H;
                if (abstractC59962oe.isResumed()) {
                    LocationDetailFragment locationDetailFragment = c67973V4n.A0J;
                    c130535uy = c127935qM.A01;
                    String id = c130535uy.A00().getId();
                    WGA A0V = AbstractC31173DnH.A0V(locationDetailFragment);
                    MediaMapPin mediaMapPin = locationDetailFragment.A03;
                    MediaMapQuery mediaMapQuery = locationDetailFragment.A02;
                    C25531Mh A01 = WGA.A01(A0V, "instagram_map_location_detail_tap_feed_media");
                    AbstractC65702TsY.A1H(A01, mediaMapQuery);
                    WGA.A03(A01, mediaMapPin);
                    A01.A0R("media_id", id);
                    A01.Cht();
                    if (c67973V4n.A01 == null) {
                        String str2 = c67973V4n.A0K;
                        C38085GpE c38085GpE2 = new C38085GpE(abstractC59962oe, c67973V4n.A0G, c67973V4n.A0I, null, str2);
                        c67973V4n.A01 = c38085GpE2;
                        abstractC59962oe.registerLifecycleListener(c38085GpE2);
                    }
                    c38085GpE = c67973V4n.A01;
                    c116875Qr = new C116875Qr(ClipsViewerSource.A1k, c67973V4n.A0I);
                    c116875Qr.A1C = AbstractC69973Vyo.A01(c67973V4n.A02);
                    c116875Qr.A1D = c130535uy.A00().getId();
                    c116875Qr.A1d = false;
                    c38085GpE.A00(c116875Qr, c127935qM, false, true);
                    return;
                }
                return;
            case 1:
                AbstractC167017dG.A1N(c127935qM, c5qT);
                V1R v1r = (V1R) this.A01;
                if (v1r.isResumed()) {
                    if (v1r.A05 == null) {
                        String str3 = v1r.A0g;
                        C38085GpE c38085GpE3 = new C38085GpE(v1r, v1r.requireActivity(), V1R.A00(v1r), null, str3);
                        v1r.A05 = c38085GpE3;
                        v1r.registerLifecycleListener(c38085GpE3);
                    }
                    C38085GpE c38085GpE4 = v1r.A05;
                    if (c38085GpE4 != null) {
                        C116875Qr c116875Qr2 = new C116875Qr(ClipsViewerSource.A1c, V1R.A00(v1r));
                        c116875Qr2.A1C = V1R.A01(v1r).A01.getName();
                        c116875Qr2.A1D = c127935qM.A01.A00().getId();
                        c38085GpE4.A00(c116875Qr2, c127935qM, false, false);
                    }
                    C69302VlA c69302VlA = v1r.A0D;
                    if (c69302VlA == null) {
                        str = "gridAnalyticsDelegate";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    C130535uy c130535uy2 = c127935qM.A01;
                    int i = c5qT.A01;
                    int i2 = c5qT.A00;
                    InterfaceC11380iw interfaceC11380iw = c69302VlA.A01;
                    C19260xA c19260xA = c69302VlA.A00;
                    String str4 = c69302VlA.A04;
                    String A00 = AbstractC111324zv.A00(224);
                    C38321qM c38321qM = c130535uy2.A00().A02;
                    C19280xC A002 = C19280xC.A00(interfaceC11380iw, A00);
                    if (c38321qM != null) {
                        A002.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c130535uy2.A0A);
                        A002.A0C("m_pk", c38321qM.getId());
                        A002.A0C("position", AbstractC154266wb.A01(i, i2));
                        A002.A08(Integer.valueOf(c38321qM.BRp().A00), "media_type");
                        A002.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 24L);
                        String loggingInfoToken = c38321qM.A0C.getLoggingInfoToken();
                        if (loggingInfoToken != null) {
                            A002.A0C("ranking_info_token", loggingInfoToken);
                        }
                        if (str4 != null && str4.length() != 0) {
                            A002.A07(C5I8.A83, str4);
                        }
                        A002.A04(c19260xA);
                    }
                    InterfaceC71951XCd interfaceC71951XCd = c69302VlA.A03;
                    WE1.A02(A002, interfaceC71951XCd.C4m(), interfaceC71951XCd.C4p());
                    AbstractC31173DnH.A1S(A002, c69302VlA.A02);
                    return;
                }
                return;
            case 2:
                V1B v1b = (V1B) this.A01;
                v1b.A0B.A00(c127935qM.BQN(), c5qT.A01, c5qT.A00);
                c38085GpE = v1b.A04;
                c116875Qr = new C116875Qr(ClipsViewerSource.A1k, v1b.A02);
                c116875Qr.A1C = v1b.A0I;
                c130535uy = c127935qM.A01;
                c116875Qr.A1D = c130535uy.A00().getId();
                c116875Qr.A1d = false;
                c38085GpE.A00(c116875Qr, c127935qM, false, true);
                return;
            case 3:
                AbstractC167017dG.A1N(c127935qM, c5qT);
                AbstractC67878V0j abstractC67878V0j = (AbstractC67878V0j) this.A01;
                if (abstractC67878V0j instanceof VAL) {
                    if (C06P.A01(abstractC67878V0j.getParentFragmentManager())) {
                        C38321qM BQN = c127935qM.BQN();
                        abstractC67878V0j.A0A(c5qT, c127935qM, BQN);
                        int i3 = (c5qT.A01 * 3) + c5qT.A00;
                        C116875Qr c116875Qr3 = new C116875Qr(ClipsViewerSource.A2J, abstractC67878V0j.getSession());
                        c116875Qr3.A1O = true;
                        c116875Qr3.A03(new SearchContext(abstractC67878V0j.A06().A04(), abstractC67878V0j.A07().A03(), AbstractC65702TsY.A0d(abstractC67878V0j), null, abstractC67878V0j.A06().A05(), null, C51042Mgs.A01(abstractC67878V0j.A07()).A0G, null));
                        AbstractC41751IeQ.A00(abstractC67878V0j.requireActivity(), c116875Qr3, abstractC67878V0j.getSession(), BQN, abstractC67878V0j, null, AbstractC65702TsY.A0d(abstractC67878V0j), abstractC67878V0j.A06().A04(), null, i3, false, false, true, false);
                        return;
                    }
                    return;
                }
                if (C06P.A01(abstractC67878V0j.getParentFragmentManager())) {
                    abstractC67878V0j.A0A(c5qT, c127935qM, c127935qM.BQN());
                    SearchContext searchContext = new SearchContext(abstractC67878V0j.A06().A04(), abstractC67878V0j.A07().A03(), AbstractC65702TsY.A0d(abstractC67878V0j), null, abstractC67878V0j.A06().A05(), null, C51042Mgs.A01(abstractC67878V0j.A07()).A0G, null);
                    if (C51042Mgs.A01(abstractC67878V0j.A07()).A0M) {
                        clipsViewerSource = ClipsViewerSource.A2M;
                    } else {
                        clipsViewerSource = ClipsViewerSource.A2L;
                    }
                    C38085GpE c38085GpE5 = abstractC67878V0j.A04;
                    if (c38085GpE5 != null) {
                        C116875Qr c116875Qr4 = new C116875Qr(clipsViewerSource, abstractC67878V0j.getSession());
                        c116875Qr4.A1d = false;
                        c116875Qr4.A1C = AbstractC65702TsY.A0d(abstractC67878V0j);
                        c116875Qr4.A1D = c127935qM.A01.A00().getId();
                        c116875Qr4.A03(searchContext);
                        c38085GpE5.A00(c116875Qr4, c127935qM, true, false);
                        return;
                    }
                    str = "clipsUnitController";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return;
            default:
                boolean A1R = AbstractC167007dF.A1R(0, c127935qM, c5qT);
                C38934HCh c38934HCh = (C38934HCh) this.A01;
                if (C06P.A01(c38934HCh.getParentFragmentManager())) {
                    C38934HCh.A01(c5qT, c127935qM, c127935qM.BQN(), c38934HCh);
                    String str5 = c38934HCh.A0E;
                    if (str5 == null) {
                        str = "searchSessionId";
                    } else {
                        String str6 = c38934HCh.A0D;
                        Keyword keyword = c38934HCh.A08;
                        str = "surfaceKeyword";
                        if (keyword != null) {
                            SearchContext searchContext2 = new SearchContext(str5, str6, keyword.A04, null, null, null, null, null);
                            C38085GpE c38085GpE6 = c38934HCh.A01;
                            if (c38085GpE6 != null) {
                                C116875Qr c116875Qr5 = new C116875Qr(ClipsViewerSource.A1h, (UserSession) c38934HCh.A0M.getValue());
                                c116875Qr5.A1d = false;
                                Keyword keyword2 = c38934HCh.A08;
                                if (keyword2 != null) {
                                    c116875Qr5.A1C = keyword2.A04;
                                    c116875Qr5.A1D = c127935qM.A01.A00().getId();
                                    c116875Qr5.A03(searchContext2);
                                    c38085GpE6.A00(c116875Qr5, c127935qM, A1R, false);
                                    return;
                                }
                            }
                            str = "clipsUnitController";
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return;
        }
    }

    @Override // X.AbstractC42425IqS
    public final void A0F(C5qT c5qT, InterfaceC127965qP interfaceC127965qP) {
        C65823Tug c65823Tug;
        switch (this.A00) {
            case 1:
                c65823Tug = ((V1R) this.A01).A07;
                break;
            case 2:
            default:
                super.A0F(c5qT, interfaceC127965qP);
                return;
            case 3:
                c65823Tug = ((AbstractC67878V0j) this.A01).A06;
                break;
            case 4:
                c65823Tug = ((C38934HCh) this.A01).A03;
                break;
        }
        if (c65823Tug == null) {
            C14360o3.A0F("grid");
            throw C00O.createAndThrow();
        }
        C38321qM BQN = interfaceC127965qP.BQN();
        C14360o3.A0B(BQN, 0);
        if (!BQN.Cff()) {
            return;
        }
        c65823Tug.A0D.EJ1();
    }

    @Override // X.AbstractC42425IqS, X.InterfaceC43449JHn
    public final void DKV(C38321qM c38321qM) {
        if (1 - this.A00 != 0) {
            super.DKV(c38321qM);
            return;
        }
        C14360o3.A0B(c38321qM, 0);
        V1R v1r = (V1R) this.A01;
        C50674MYs c50674MYs = new C50674MYs(v1r.requireContext(), V1R.A00(v1r));
        c50674MYs.A03(new WNP(48, c38321qM, v1r), 2131976091);
        new C31727DwY(c50674MYs).A07(v1r.requireContext());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020f  */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.Vi0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [X.Vi0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [X.Vi0, java.lang.Object] */
    @Override // X.JPT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DLL(android.view.View r41, X.C5qT r42, X.AbstractC127945qN r43, X.C38321qM r44) {
        /*
            Method dump skipped, instructions count: 1668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68036V7h.DLL(android.view.View, X.5qT, X.5qN, X.1qM):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r2 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        r0 = "peekMediaController";
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC42425IqS, X.InterfaceC43449JHn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DSM(android.view.MotionEvent r4, android.view.View r5, X.C5qT r6, X.C38321qM r7) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L5c;
                case 1: goto L30;
                case 2: goto L4f;
                case 3: goto L1e;
                default: goto L5;
            }
        L5:
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.AbstractC167027dH.A13(r6, r5, r4)
            java.lang.Object r0 = r3.A01
            X.HCh r0 = (X.C38934HCh) r0
            X.308 r2 = r0.A07
            if (r2 != 0) goto L55
        L14:
            java.lang.String r0 = "peekMediaController"
        L16:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L1e:
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.AbstractC167027dH.A13(r6, r5, r4)
            java.lang.Object r0 = r3.A01
            X.V0j r0 = (X.AbstractC67878V0j) r0
            X.30A r2 = r0.A09
            if (r2 != 0) goto L44
            java.lang.String r0 = "previewMediaController"
            goto L16
        L30:
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.AbstractC167027dH.A13(r6, r5, r4)
            java.lang.Object r2 = r3.A01
            X.V1R r2 = (X.V1R) r2
            int r1 = r6.A01
            int r0 = r6.A00
            X.308 r2 = r2.A0C
            if (r2 != 0) goto L59
            goto L14
        L44:
            int r0 = r6.A01
            int r1 = r6.A00
            int r0 = r0 * 3
            int r0 = r0 + r1
            r2.DuC(r4, r5, r7, r0)
            goto L6c
        L4f:
            java.lang.Object r0 = r3.A01
            X.V1B r0 = (X.V1B) r0
            X.308 r2 = r0.A09
        L55:
            int r1 = r6.A01
            int r0 = r6.A00
        L59:
            int r1 = r1 * 3
            goto L68
        L5c:
            java.lang.Object r0 = r3.A01
            X.V4n r0 = (X.C67973V4n) r0
            X.308 r2 = r0.A07
            int r0 = r6.A01
            int r1 = r0 * 3
            int r0 = r6.A00
        L68:
            int r1 = r1 + r0
            r2.DuC(r4, r5, r7, r1)
        L6c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68036V7h.DSM(android.view.MotionEvent, android.view.View, X.5qT, X.1qM):boolean");
    }
}
