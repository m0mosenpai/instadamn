package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Wdw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70618Wdw implements XCJ {
    public final int A00;
    public final Object A01;

    public C70618Wdw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.XCJ
    public final void DFf() {
        String str;
        V0Q v0q;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                V0N v0n = (V0N) this.A01;
                C3FR c3fr = v0n.A03;
                if (c3fr == null) {
                    str3 = "recyclerViewProxy";
                } else {
                    c3fr.EWc(false);
                    InterfaceC70513Em interfaceC70513Em = v0n.A04;
                    str = "pullToRefresh";
                    if (interfaceC70513Em != null) {
                        interfaceC70513Em.setIsLoading(false);
                        InterfaceC70513Em interfaceC70513Em2 = v0n.A04;
                        if (interfaceC70513Em2 != null) {
                            if (!(interfaceC70513Em2 instanceof C71094Wnq)) {
                                C67920V2k c67920V2k = v0n.A01;
                                if (c67920V2k == null) {
                                    str3 = "promoteAdToolsAdapter";
                                } else {
                                    c67920V2k.A00(v0n.A0A);
                                    SpinnerImageView spinnerImageView = v0n.A05;
                                    if (spinnerImageView != null) {
                                        spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
                                    }
                                }
                            }
                            V0N.A02(v0n);
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            case 1:
                V16.A0B((V16) this.A01, null);
                return;
            case 2:
                v0q = (V0Q) this.A01;
                str2 = "delete";
                V0Q.A02(v0q, str2, "failed to obtain access token");
                return;
            case 3:
                V0Q v0q2 = (V0Q) this.A01;
                W6I w6i = (W6I) v0q2.A09.getValue();
                String str4 = v0q2.A04;
                if (str4 == null) {
                    str = "mediaId";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                w6i.A09("campaign_controls", "ads_manager", str4, "failed to obtain access token");
                return;
            case 4:
                v0q = (V0Q) this.A01;
                str2 = "paused";
                V0Q.A02(v0q, str2, "failed to obtain access token");
                return;
            case 5:
                C65762Ttd c65762Ttd = (C65762Ttd) this.A01;
                C65763Tte c65763Tte = c65762Ttd.A07;
                String str5 = c65762Ttd.A0D;
                if (str5 == null) {
                    str = "threadIdV2";
                } else {
                    String str6 = c65762Ttd.A0C;
                    if (str6 == null) {
                        str = "participantId";
                    } else {
                        String str7 = c65762Ttd.A0B;
                        if (str7 == null) {
                            str = "adMediaId";
                        } else {
                            C65763Tte.A00(c65763Tte, "direct_in_thread_ctd_banner_access_token_fetch_failed", str5, str6, AbstractC167007dF.A0n("media_id", str7));
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                C9GR.A0F(((C65762Ttd) this.A01).A0E, "promote_ads_manager_toast_update_error_rebranding", 2131970352);
                return;
        }
    }

    @Override // X.XCJ
    public final void DqC(String str) {
        String str2;
        C1ON A0N;
        C1P1 c1p1;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(str, 0);
                V0N v0n = (V0N) this.A01;
                String str3 = v0n.A07;
                if (str3 != null && v0n.A08 != null) {
                    C69785VvQ c69785VvQ = v0n.A02;
                    if (c69785VvQ == null) {
                        str2 = "promoteAdsManagerDataFetcher";
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    c69785VvQ.A03(new C66081TzI(v0n, 6), str3, v0n.A06, str);
                    return;
                }
                V0N.A02(v0n);
                return;
            case 1:
                C14360o3.A0B(str, 0);
                V16.A0B((V16) this.A01, str);
                return;
            case 2:
                C14360o3.A0B(str, 0);
                V0Q v0q = (V0Q) this.A01;
                C69785VvQ c69785VvQ2 = (C69785VvQ) v0q.A08.getValue();
                String str4 = v0q.A04;
                str2 = "mediaId";
                if (str4 != null) {
                    String str5 = v0q.A02;
                    C66081TzI c66081TzI = new C66081TzI(v0q, 14);
                    UserSession userSession = c69785VvQ2.A02;
                    String str6 = C70399WUb.A00(userSession).A03;
                    AbstractC167007dF.A1F(userSession, 0, str6);
                    C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                    AbstractC37301Gc2.A1M(A0c, "ads/ads_manager/delete_promotion_v2/", str4);
                    A0c.A9s("fb_auth_token", str);
                    A0c.A0H("flow_id", str6);
                    A0c.A0H("boosted_id", str5);
                    A0c.A0P(null, C38866H9o.class, C41293IPi.class, false);
                    C1ON A0N2 = A0c.A0N();
                    A0N2.A00 = c66081TzI;
                    c69785VvQ2.A01.schedule(A0N2);
                    W6I w6i = (W6I) v0q.A09.getValue();
                    String str7 = v0q.A04;
                    if (str7 != null) {
                        w6i.A08("campaign_controls", "delete", str7, null);
                        return;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 3:
                C14360o3.A0B(str, 0);
                V0Q v0q2 = (V0Q) this.A01;
                C69785VvQ c69785VvQ3 = (C69785VvQ) v0q2.A08.getValue();
                C1P1 c1p12 = (C1P1) v0q2.A0A.getValue();
                String str8 = v0q2.A04;
                if (str8 == null) {
                    str2 = "mediaId";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                String str9 = v0q2.A02;
                UserSession userSession2 = c69785VvQ3.A02;
                String str10 = C70399WUb.A00(userSession2).A03;
                AbstractC167007dF.A1F(userSession2, 0, str10);
                C25621Ms A0c2 = AbstractC167017dG.A0c(userSession2);
                A0c2.A0B("ads/ads_manager/fetch_campaign_controls_v2/");
                A0c2.A9s("fb_auth_token", str);
                A0c2.A9s("media_id", str8);
                A0c2.A0H("flow_id", str10);
                A0c2.A0H("boosted_id", str9);
                A0c2.A0R(C67801Uya.class, C69862Vwn.class);
                C1ON A0N3 = A0c2.A0N();
                A0N3.A00 = c1p12;
                c69785VvQ3.A01.schedule(A0N3);
                return;
            case 4:
                C14360o3.A0B(str, 0);
                V0Q v0q3 = (V0Q) this.A01;
                C69785VvQ c69785VvQ4 = (C69785VvQ) v0q3.A08.getValue();
                String str11 = v0q3.A04;
                str2 = "mediaId";
                if (str11 != null) {
                    c69785VvQ4.A02(new C66081TzI(v0q3, 16), str11, v0q3.A02, str);
                    W6I w6i2 = (W6I) v0q3.A09.getValue();
                    String str12 = v0q3.A04;
                    if (str12 != null) {
                        w6i2.A08("campaign_controls", "paused", str12, null);
                        return;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 5:
                C14360o3.A0B(str, 0);
                C65762Ttd c65762Ttd = (C65762Ttd) this.A01;
                UserSession userSession3 = c65762Ttd.A0G;
                String str13 = c65762Ttd.A0B;
                if (str13 == null) {
                    str2 = "adMediaId";
                } else {
                    String str14 = c65762Ttd.A0C;
                    if (str14 == null) {
                        str2 = "participantId";
                    } else {
                        C14360o3.A0B(userSession3, 0);
                        C25621Ms A0c3 = AbstractC167017dG.A0c(userSession3);
                        A0c3.A0B("direct_v2/in_thread_ctd_banner_context/");
                        A0c3.A9s("ig_media_id", str13);
                        A0c3.A0D("page_id", 0);
                        A0c3.A9s("other_participant_id", str14);
                        A0c3.A9s("fb_auth_token", str);
                        A0c3.A0R(C67796UyV.class, C69856Vwh.class);
                        A0N = A0c3.A0N();
                        c65762Ttd.A03 = A0N;
                        c1p1 = c65762Ttd.A0H;
                        break;
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            default:
                C14360o3.A0B(str, 0);
                C65762Ttd c65762Ttd2 = (C65762Ttd) this.A01;
                UserSession userSession4 = c65762Ttd2.A0G;
                UPX upx = c65762Ttd2.A08;
                if (upx == null) {
                    str2 = "activeAdModel";
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
                String str15 = upx.A0D;
                String str16 = C70399WUb.A00(userSession4).A03;
                C14360o3.A07(str16);
                AbstractC167017dG.A1N(userSession4, str15);
                C25621Ms A0c4 = AbstractC167017dG.A0c(userSession4);
                AbstractC37301Gc2.A1M(A0c4, "ads/ads_manager/resume_promotion_v2/", str15);
                A0c4.A9s("fb_auth_token", str);
                A0c4.A0H("flow_id", str16);
                C14360o3.A0B("boosted_id", 0);
                A0c4.A0R(C67823Uyw.class, C69896VxN.class);
                A0N = A0c4.A0N();
                c65762Ttd2.A04 = A0N;
                c1p1 = c65762Ttd2.A0I;
                break;
        }
        A0N.A00 = c1p1;
        C1GJ.A03(A0N);
    }
}
