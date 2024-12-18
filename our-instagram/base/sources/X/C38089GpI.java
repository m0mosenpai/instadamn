package X;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.chaining.intf.DiscoveryChainingConfig;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import com.instagram.videofeed.intf.VideoFeedType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GpI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38089GpI extends AbstractC42425IqS {
    public Context A00;
    public View A01;
    public C38144GqB A02;
    public C37934GmW A03;
    public C38135Gq2 A04;
    public C30A A05;
    public C3FQ A06;
    public C38E A07;
    public boolean A08;
    public final ViewOnTouchListenerC60632pm A09;
    public final C18920wW A0A;
    public final UserSession A0B;
    public final C37330GcY A0C;
    public final C38086GpF A0D;
    public final JIG A0E;
    public final JPU A0F;
    public final IL0 A0G;
    public final C69533Vqx A0H;
    public final C93Y A0I;
    public final C38082GpB A0J;
    public final AnonymousClass309 A0K;
    public final Gt7 A0L;
    public final C64842wi A0M;
    public final C64742wY A0N;
    public final C1M1 A0O;
    public final String A0P;
    public final String A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC09390do A0T;
    public final InterfaceC09390do A0U;
    public final InterfaceC09390do A0V;
    public final C53S A0W;
    public final C38085GpE A0X;
    public final C38U A0Y;
    public final String A0Z;
    public final boolean A0a;
    public final boolean A0b;

    public static String A00(C06090Tz c06090Tz, AbstractC12990ll abstractC12990ll, IL0 il0) {
        if (C18U.A06(c06090Tz, abstractC12990ll, 36317405936489609L)) {
            return il0.A00(2131961998, new Object[0]);
        }
        return null;
    }

    @Override // X.AbstractC42425IqS
    public final void A0E(C5qT c5qT, C38164GqV c38164GqV, C127935qM c127935qM) {
        C132835z6 c132835z6;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        ClipsViewerSource clipsViewerSource;
        String str4;
        C9CJ c9cj;
        String str5;
        String str6;
        ExploreTopicCluster exploreTopicCluster;
        String str7;
        String str8;
        boolean z;
        String str9;
        C75363a3 A0A;
        C14360o3.A0B(c127935qM, 0);
        C14360o3.A0B(c5qT, 1);
        C14360o3.A0B(c38164GqV, 2);
        IL0 il0 = this.A0G;
        if (C06P.A01(il0.A00.getParentFragmentManager())) {
            c127935qM.BQN();
            boolean z2 = true;
            UserSession userSession = this.A0B;
            if (AbstractC153456vF.A02(userSession)) {
                AbstractC153456vF.A01(userSession, c127935qM.BQN(), true);
                return;
            }
            C06090Tz c06090Tz = C06090Tz.A05;
            String str10 = null;
            if (C18U.A06(c06090Tz, userSession, 36312423774291049L) && (A0A = c127935qM.A01.A00().A0A(userSession, null)) != null) {
                A05(A0A);
            }
            if (C18U.A06(c06090Tz, userSession, 36316800345969305L)) {
                C38321qM BQN = c127935qM.BQN();
                String id = BQN.getId();
                if (id != null) {
                    User A2E = BQN.A2E(userSession);
                    C14360o3.A0A(A2E);
                    String id2 = A2E.getId();
                    EnumC39592He2 enumC39592He2 = EnumC39592He2.A05;
                    int i = BQN.BRp().A00;
                    String B3P = BQN.A0C.B3P();
                    C42348IpA A00 = AbstractC40601HzL.A00(userSession);
                    String str11 = this.A0Q;
                    C14360o3.A0B(str11, 0);
                    String A1A = AbstractC166987dD.A1A(str11, A00.A00);
                    String A2W = BQN.A2W();
                    String A33 = BQN.A33();
                    String A0k = AbstractC31180DnO.A0k(BQN.A3m());
                    int A002 = AbstractC37302Gc3.A00();
                    if (A002 != 0) {
                        if (A002 == 3) {
                            z = true;
                        } else {
                            throw AbstractC166987dD.A12("All channel-related arguments must be provided");
                        }
                    } else {
                        z = false;
                    }
                    DiscoveryChainingItem discoveryChainingItem = new DiscoveryChainingItem(enumC39592He2, null, null, null, id, id2, B3P, A1A, null, str11, null, null, null, A2W, A33, A0k, null, null, null, i, z);
                    String str12 = this.A0Z;
                    if (str12 != null) {
                        str10 = il0.A00(2131972466, new Object[0]);
                    }
                    boolean z3 = this.A0b;
                    if (this.A0I.A05) {
                        str9 = "interest_explore";
                    } else if (z3) {
                        str9 = "reshare_hub";
                    } else {
                        str9 = "topical_explore";
                    }
                    if (str10 == null) {
                        str10 = this.A0F.Arb();
                    }
                    String str13 = this.A0P;
                    String moduleName = this.A0K.getModuleName();
                    AbstractC25233BEq.A0x(2, str10, str13, moduleName);
                    C16910sj c16910sj = C16910sj.A00;
                    ExploreTopicCluster exploreTopicCluster2 = A0J().A02;
                    C37330GcY c37330GcY = this.A0C;
                    Bundle A0E = AbstractC31174DnI.A0E(c37330GcY, 0);
                    c37330GcY.A01(A0E);
                    String A003 = A00(c06090Tz, userSession, il0);
                    C38135Gq2 c38135Gq2 = this.A04;
                    if (c38135Gq2 != null) {
                        boolean z4 = c38135Gq2.A02;
                        Integer valueOf = Integer.valueOf((c5qT.A01 * 3) + c5qT.A00);
                        if (str12 == null) {
                            z2 = false;
                        }
                        DiscoveryChainingConfig discoveryChainingConfig = new DiscoveryChainingConfig(A0E, discoveryChainingItem, exploreTopicCluster2, valueOf, null, str10, str9, str13, moduleName, null, str12, null, null, A003, null, null, c16910sj, true, true, false, z2, false, false, false, false, false, false, z4);
                        if (this.A0a) {
                            A03(discoveryChainingConfig);
                            return;
                        } else {
                            A02(discoveryChainingConfig);
                            return;
                        }
                    }
                    C14360o3.A0F("viewController");
                    throw C00O.createAndThrow();
                }
                throw AbstractC166997dE.A0g();
            }
            C130535uy c130535uy = c127935qM.A01;
            C18920wW c18920wW = this.A0A;
            C38321qM c38321qM = c130535uy.A00().A02;
            C127915qK c127915qK = ((AbstractC127945qN) c127935qM).A02;
            EnumC130515uw enumC130515uw = EnumC130515uw.A07;
            ExploreTopicCluster exploreTopicCluster3 = A0J().A02;
            String str14 = this.A0P;
            C130505uv c130505uv = c127935qM.A03;
            if (c130505uv != null) {
                c132835z6 = c130505uv.A06;
            } else {
                c132835z6 = null;
            }
            C9CJ c9cj2 = c130535uy.A02;
            if (c9cj2 != null) {
                str = c9cj2.A02;
            } else {
                str = null;
            }
            Long valueOf2 = Long.valueOf(c127935qM.A00);
            int ordinal = c130535uy.A05.ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    str2 = null;
                } else {
                    str2 = "nearby";
                }
            } else {
                str2 = "templates";
            }
            C38321qM c38321qM2 = c130535uy.A00().A02;
            if (c38321qM2 != null) {
                str3 = AbstractC37300Gc1.A0S(c38321qM2);
            } else {
                str3 = null;
            }
            String str15 = null;
            AbstractC25229BEm.A1I(c18920wW, 0, str14);
            C38206GrB A06 = AbstractC42425IqS.A06(c5qT, c127915qK, exploreTopicCluster3, c38321qM);
            String str16 = A06.A09;
            String str17 = A06.A0B;
            String str18 = A06.A0A;
            if (c132835z6 != null) {
                str16 = c132835z6.A03;
                str17 = AbstractC127885qH.A00(c132835z6.A01());
                str18 = c132835z6.A00().A04;
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "explore_home_click");
            AbstractC37301Gc2.A16(A0f, str14);
            String str19 = A06.A05;
            if (str19 == null) {
                str19 = "";
            }
            AbstractC42425IqS.A08(enumC130515uw, A0f, A06, str19, str16);
            AbstractC42425IqS.A09(A0f, A06, str17, str18, str3);
            List list = A06.A0C;
            String str20 = null;
            if (list != null) {
                arrayList = AbstractC167007dF.A0i(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC37302Gc3.A1Y(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            AbstractC42425IqS.A0A(A0f, valueOf2, str, arrayList);
            if (c38321qM != null) {
                str20 = AbstractC42425IqS.A07(c38321qM);
            }
            A0f.AAP("social_proof_interaction_type", str20);
            A0f.AAP("content_source_type", str2);
            A0f.AAP("subtype", c130535uy.A01().A00);
            A0f.Cht();
            C9CJ c9cj3 = c130535uy.A02;
            if (c9cj3 != null && (str8 = c9cj3.A02) != null && AbstractC25225BEi.A1Y(str8)) {
                clipsViewerSource = ClipsViewerSource.A14;
            } else {
                EnumC130545uz enumC130545uz = c130535uy.A05;
                if (enumC130545uz == EnumC130545uz.A07) {
                    clipsViewerSource = ClipsViewerSource.A14;
                } else if (enumC130545uz == EnumC130545uz.A08) {
                    C9CJ c9cj4 = c130535uy.A02;
                    if (c9cj4 != null && (str4 = c9cj4.A01) != null && AbstractC25225BEi.A1Y(str4)) {
                        clipsViewerSource = ClipsViewerSource.A10;
                    } else {
                        clipsViewerSource = ClipsViewerSource.A15;
                    }
                } else if (enumC130545uz == EnumC130545uz.A06) {
                    clipsViewerSource = ClipsViewerSource.A0z;
                } else if (c130535uy.A01() == EnumC132895zE.A04) {
                    clipsViewerSource = ClipsViewerSource.A12;
                } else if (this.A0I.A05) {
                    clipsViewerSource = ClipsViewerSource.A0y;
                } else {
                    clipsViewerSource = ClipsViewerSource.A13;
                }
            }
            C116875Qr c116875Qr = new C116875Qr(clipsViewerSource, userSession);
            c116875Qr.A1C = c130535uy.A0A;
            c116875Qr.A1D = c130535uy.A00().getId();
            c116875Qr.A1F = this.A0Z;
            if (clipsViewerSource == ClipsViewerSource.A14) {
                C9CJ c9cj5 = c130535uy.A02;
                if (c9cj5 != null && (str7 = c9cj5.A00) != null && AbstractC25225BEi.A1Y(str7)) {
                    c116875Qr.A0o = str7;
                }
                if (c130535uy.A05 == EnumC130545uz.A07) {
                    A0J();
                    C37934GmW A0J = A0J();
                    C14360o3.A0C(A0J, "null cannot be cast to non-null type com.instagram.explore.repository.ExploreDataStore");
                    c116875Qr.A0j = A0J.A05;
                } else {
                    C9CJ c9cj6 = c130535uy.A02;
                    if (c9cj6 != null) {
                        str10 = c9cj6.A02;
                    }
                    c116875Qr.A0J = new PlaylistContext(str10);
                    c116875Qr.A1m = false;
                }
            } else if (clipsViewerSource == ClipsViewerSource.A10) {
                C9CJ c9cj7 = c130535uy.A02;
                if (c9cj7 != null && (str6 = c9cj7.A00) != null && AbstractC25225BEi.A1Y(str6)) {
                    C9CJ c9cj8 = c130535uy.A02;
                    if (c9cj8 != null) {
                        str10 = c9cj8.A00;
                    }
                    c116875Qr.A0o = str10;
                }
                C9CJ c9cj9 = c130535uy.A02;
                if (c9cj9 != null) {
                    str15 = c9cj9.A01;
                }
                c116875Qr.A0u = str15;
                c116875Qr.A07 = EnumC120795dP.A0P;
            } else if (clipsViewerSource == ClipsViewerSource.A0z && (c9cj = c130535uy.A02) != null && (str5 = c9cj.A00) != null) {
                c116875Qr.A0o = str5;
            }
            c116875Qr.A1d = false;
            C93Y c93y = this.A0I;
            if (c93y.A05 && (exploreTopicCluster = c93y.A00) != null) {
                c116875Qr.A0o = exploreTopicCluster.A0A;
                c116875Qr.A0s = exploreTopicCluster.A06;
            }
            this.A0X.A00(c116875Qr, c127935qM, true, false);
        }
    }

    @Override // X.AbstractC42425IqS
    public final void A0F(C5qT c5qT, InterfaceC127965qP interfaceC127965qP) {
        C69533Vqx c69533Vqx = this.A0H;
        C38321qM BQN = interfaceC127965qP.BQN();
        C14360o3.A0B(BQN, 0);
        C65823Tug c65823Tug = c69533Vqx.A00.A06;
        if (c65823Tug == null) {
            AbstractC37300Gc1.A0a();
            throw C00O.createAndThrow();
        }
        if (BQN.Cff()) {
            c65823Tug.A0D.EJ1();
        }
    }

    @Override // X.AbstractC42425IqS, X.InterfaceC43449JHn
    public final void DKV(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C38P c38p = this.A0H.A00;
        if (AbstractC153456vF.A02(c38p.getSession())) {
            UserSession session = c38p.getSession();
            C14360o3.A0B(session, 0);
            C3YS.A00(session).A02(c38321qM, false);
            AbstractC25651Mw.A00(session).E4s(new C42251Inb(c38321qM));
            AbstractC153456vF.A02.add(c38321qM);
            HashSet hashSet = AbstractC153456vF.A01;
            if (hashSet.contains(c38321qM)) {
                hashSet.remove(c38321qM);
                return;
            }
            return;
        }
        C50674MYs c50674MYs = new C50674MYs(c38p.requireContext(), c38p.getSession());
        c50674MYs.A03(new ViewOnClickListenerC42034Ik3(15, c38321qM, c38p), 2131976091);
        C31727DwY.A02(c38p, c50674MYs);
    }

    @Override // X.AbstractC42425IqS, X.InterfaceC43449JHn
    public final boolean DSM(MotionEvent motionEvent, View view, C5qT c5qT, C38321qM c38321qM) {
        C30A c30a;
        C14360o3.A0B(c38321qM, 0);
        AbstractC167027dH.A13(c5qT, view, motionEvent);
        UserSession userSession = this.A0B;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36317405938062480L)) {
            if (C18U.A06(c06090Tz, userSession, 36312423774553197L) && c38321qM.A59()) {
                A05(c38321qM.CFR());
            }
            if (AbstractC153456vF.A02(userSession) || (c30a = this.A05) == null) {
                return false;
            }
            return c30a.DuC(motionEvent, view, c38321qM, (c5qT.A01 * 3) + c5qT.A00);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5qT r10, X.AbstractC127945qN r11, X.C38089GpI r12, X.C38321qM r13) {
        /*
            X.309 r0 = r12.A0K
            X.0jB r1 = r0.E6P()
            X.C14360o3.A07(r1)
            X.GcY r0 = r12.A0C
            r0.A02(r1)
            boolean r0 = r11 instanceof X.C127995qS
            r2 = 0
            if (r0 == 0) goto L8a
            r0 = r11
            X.5qS r0 = (X.C127995qS) r0
            long r0 = r0.A00
        L18:
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L1c:
            X.0wW r4 = r12.A0A
            X.5qK r3 = r11.A02
            X.5uw r8 = X.EnumC130515uw.A0D
            X.GmW r0 = r12.A0J()
            com.instagram.explore.topiccluster.ExploreTopicCluster r1 = r0.A02
            java.lang.String r9 = r12.A0P
            X.5uv r0 = r11.A03
            if (r0 == 0) goto L88
            X.5z6 r12 = r0.A06
        L30:
            r5 = 0
            if (r13 == 0) goto L37
            java.lang.String r2 = X.AbstractC37300Gc1.A0S(r13)
        L37:
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            r6 = 2
            r0 = 6
            X.C14360o3.A0B(r9, r0)
            X.GrB r10 = X.AbstractC42425IqS.A06(r10, r3, r1, r13)
            java.lang.String r3 = r10.A09
            java.lang.String r11 = r10.A0B
            java.lang.String r1 = r10.A0A
            if (r12 == 0) goto L5c
            java.lang.String r3 = r12.A03
            java.lang.Integer r0 = r12.A01()
            java.lang.String r11 = X.AbstractC127885qH.A00(r0)
            com.instagram.model.keyword.Keyword r0 = r12.A00()
            java.lang.String r1 = r0.A04
        L5c:
            java.lang.String r0 = "explore_home_click"
            X.0Ai r4 = X.AbstractC166987dD.A0f(r4, r0)
            X.AbstractC37301Gc2.A16(r4, r9)
            java.lang.String r0 = r10.A05
            if (r0 != 0) goto L6b
            java.lang.String r0 = ""
        L6b:
            X.AbstractC42425IqS.A08(r8, r4, r10, r0, r3)
            X.AbstractC42425IqS.A09(r4, r10, r11, r1, r2)
            java.util.List r0 = r10.A0C
            r3 = 0
            if (r0 == 0) goto L96
            java.util.ArrayList r2 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L7e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L97
            X.AbstractC37302Gc3.A1Y(r2, r1)
            goto L7e
        L88:
            r12 = r2
            goto L30
        L8a:
            boolean r0 = r11 instanceof X.HKX
            if (r0 == 0) goto L94
            r0 = r11
            X.HKX r0 = (X.HKX) r0
            long r0 = r0.A00
            goto L18
        L94:
            r7 = r2
            goto L1c
        L96:
            r2 = r5
        L97:
            X.AbstractC42425IqS.A0A(r4, r7, r5, r2)
            if (r13 == 0) goto Laf
            X.1rF r0 = r13.A0C
            com.instagram.api.schemas.ThumbnailInteractionType r0 = r0.C86()
            if (r0 == 0) goto Laf
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto Lbd
            if (r1 != r6) goto Laf
            java.lang.String r3 = "reshares"
        Laf:
            java.lang.String r0 = "social_proof_interaction_type"
            r4.AAP(r0, r3)
            java.lang.String r0 = "content_source_type"
            r4.AAP(r0, r5)
            r4.Cht()
            return
        Lbd:
            java.lang.String r3 = "likes"
            goto Laf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38089GpI.A01(X.5qT, X.5qN, X.GpI, X.1qM):void");
    }

    private final void A02(DiscoveryChainingConfig discoveryChainingConfig) {
        C140966Yy A00 = AbstractC40628Hzm.A00(this.A0G.A00.requireActivity(), this.A0B);
        A00.A0D(AbstractC40602HzM.A00(discoveryChainingConfig));
        A00.A07 = this.A0W;
        A00.A04();
        if (this.A04 != null) {
            return;
        }
        C14360o3.A0F("viewController");
        throw C00O.createAndThrow();
    }

    private final void A05(C75363a3 c75363a3) {
        C4VX c4vx = new C4VX(this.A0G.A00.requireActivity(), this.A0B, c75363a3, this.A0K.getModuleName());
        c4vx.A02 = true;
        c4vx.A01 = AbstractC31178DnM.A1a(this.A0R);
        C4VZ.A00(c4vx.A00());
    }

    @Override // X.AbstractC42425IqS
    public final void A0D(View view, C5qT c5qT, HKV hkv) {
        C132835z6 c132835z6;
        ArrayList arrayList;
        VideoFeedType videoFeedType;
        boolean z;
        String str;
        C14360o3.A0B(view, 2);
        IL0 il0 = this.A0G;
        if (C06P.A01(il0.A00.getParentFragmentManager())) {
            C38321qM c38321qM = hkv.A01;
            UserSession userSession = this.A0B;
            if (AbstractC153456vF.A02(userSession)) {
                AbstractC153456vF.A01(userSession, c38321qM, true);
                return;
            }
            AnonymousClass309 anonymousClass309 = this.A0K;
            C11520jB E6P = anonymousClass309.E6P();
            C14360o3.A07(E6P);
            C37330GcY c37330GcY = this.A0C;
            c37330GcY.A02(E6P);
            C18920wW c18920wW = this.A0A;
            C127915qK c127915qK = ((AbstractC127945qN) hkv).A02;
            EnumC130515uw enumC130515uw = EnumC130515uw.A06;
            ExploreTopicCluster exploreTopicCluster = A0J().A02;
            String str2 = this.A0P;
            C130505uv c130505uv = ((AbstractC127945qN) hkv).A03;
            if (c130505uv != null) {
                c132835z6 = c130505uv.A06;
            } else {
                c132835z6 = null;
            }
            Long valueOf = Long.valueOf(hkv.A00);
            String A0S = AbstractC37300Gc1.A0S(c38321qM);
            C14360o3.A0B(c18920wW, 0);
            C14360o3.A0B(str2, 6);
            C38206GrB A06 = AbstractC42425IqS.A06(c5qT, c127915qK, exploreTopicCluster, c38321qM);
            String str3 = A06.A09;
            String str4 = A06.A0B;
            String str5 = A06.A0A;
            if (c132835z6 != null) {
                str3 = c132835z6.A03;
                str4 = AbstractC127885qH.A00(c132835z6.A01());
                str5 = c132835z6.A00().A04;
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "explore_home_click");
            AbstractC37301Gc2.A16(A0f, str2);
            String str6 = A06.A05;
            if (str6 == null) {
                str6 = "";
            }
            AbstractC42425IqS.A08(enumC130515uw, A0f, A06, str6, str3);
            AbstractC42425IqS.A09(A0f, A06, str4, str5, A0S);
            List list = A06.A0C;
            if (list != null) {
                arrayList = AbstractC167007dF.A0i(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC37302Gc3.A1Y(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            AbstractC42425IqS.A0A(A0f, valueOf, null, arrayList);
            A0f.AAP("social_proof_interaction_type", AbstractC42425IqS.A07(c38321qM));
            A0f.AAP("content_source_type", null);
            String str7 = hkv.A05;
            A0f.AAP("endpoint_type", str7);
            A0f.Cht();
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36312423774422123L) && c38321qM.A59()) {
                A05(c38321qM.CFR());
            }
            String id = c38321qM.getId();
            if (id != null) {
                User A2E = c38321qM.A2E(userSession);
                C14360o3.A0A(A2E);
                String id2 = A2E.getId();
                EnumC39592He2 enumC39592He2 = EnumC39592He2.A05;
                int i = c38321qM.BRp().A00;
                String B3P = c38321qM.A0C.B3P();
                C42348IpA A00 = AbstractC40601HzL.A00(userSession);
                String str8 = this.A0Q;
                C14360o3.A0B(str8, 0);
                String A1A = AbstractC166987dD.A1A(str8, A00.A00);
                String A2W = c38321qM.A2W();
                String A33 = c38321qM.A33();
                String A0k = AbstractC31180DnO.A0k(c38321qM.A3m());
                if (hkv.A02 == C05F.A01) {
                    videoFeedType = VideoFeedType.A03;
                    if (!C14360o3.A0K(str7, "igtv_preview")) {
                        if (str7.equals("serp_videos")) {
                            videoFeedType = VideoFeedType.A05;
                        } else {
                            videoFeedType = VideoFeedType.A02;
                        }
                    }
                } else {
                    videoFeedType = VideoFeedType.A04;
                }
                String key = hkv.getKey();
                int size = AbstractC16960so.A1R(videoFeedType, key, str7).size();
                if (size != 0) {
                    if (size == 3) {
                        z = true;
                    } else {
                        throw AbstractC166987dD.A12("All channel-related arguments must be provided");
                    }
                } else {
                    z = false;
                }
                DiscoveryChainingItem discoveryChainingItem = new DiscoveryChainingItem(enumC39592He2, videoFeedType, null, null, id, id2, B3P, A1A, null, str8, null, key, str7, A2W, A33, A0k, null, null, null, i, z);
                String str9 = hkv.A04;
                boolean z2 = this.A0b;
                String str10 = str9;
                if (this.A0I.A05) {
                    str = "interest_explore";
                } else if (z2) {
                    str = "reshare_hub";
                } else {
                    str = "topical_explore";
                }
                if (str9 == null) {
                    str10 = this.A0F.Arb();
                }
                String moduleName = anonymousClass309.getModuleName();
                AbstractC167007dF.A1G(str10, 2, moduleName);
                C16910sj c16910sj = C16910sj.A00;
                ExploreTopicCluster exploreTopicCluster2 = A0J().A02;
                Bundle A0b = AbstractC166987dD.A0b();
                c37330GcY.A01(A0b);
                String A002 = A00(c06090Tz, userSession, il0);
                C38135Gq2 c38135Gq2 = this.A04;
                if (c38135Gq2 != null) {
                    DiscoveryChainingConfig discoveryChainingConfig = new DiscoveryChainingConfig(A0b, discoveryChainingItem, exploreTopicCluster2, Integer.valueOf((c5qT.A01 * 3) + c5qT.A00), null, str10, str, str2, moduleName, null, this.A0Z, null, null, A002, null, null, c16910sj, true, true, false, false, true, false, false, false, false, false, c38135Gq2.A02);
                    if (this.A0a) {
                        A03(discoveryChainingConfig);
                        return;
                    } else {
                        A02(discoveryChainingConfig);
                        return;
                    }
                }
                C14360o3.A0F("viewController");
                throw C00O.createAndThrow();
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public final C37934GmW A0J() {
        C37934GmW c37934GmW = this.A03;
        if (c37934GmW != null) {
            return c37934GmW;
        }
        C14360o3.A0F("dataStore");
        throw C00O.createAndThrow();
    }

    public final void A0K(String str) {
        C140966Yy A0P = AbstractC31173DnH.A0P(this.A0G.A00.requireActivity(), this.A0B);
        U04.A00();
        A0P.A0B(null, U29.A00(AbstractC167017dG.A0j(), str, this.A0K.getModuleName(), null, null, "0", null, null, true));
        A0P.A04();
    }

    /* JADX WARN: Code restructure failed: missing block: B:324:0x014e, code lost:
    
        if (r50 != null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x053d  */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.JPT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DLL(android.view.View r47, X.C5qT r48, X.AbstractC127945qN r49, X.C38321qM r50) {
        /*
            Method dump skipped, instructions count: 1385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38089GpI.DLL(android.view.View, X.5qT, X.5qN, X.1qM):void");
    }

    public C38089GpI(C53S c53s, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, C18920wW c18920wW, UserSession userSession, C37330GcY c37330GcY, C38085GpE c38085GpE, C38086GpF c38086GpF, JIG jig, JPU jpu, IL0 il0, C69533Vqx c69533Vqx, C93Y c93y, C38082GpB c38082GpB, AnonymousClass309 anonymousClass309, Gt7 gt7, C64842wi c64842wi, C64742wY c64742wY, C38U c38u, C1M1 c1m1, String str, String str2, boolean z, boolean z2) {
        AbstractC167027dH.A13(il0, c69533Vqx, userSession);
        AbstractC25233BEq.A0y(6, c37330GcY, c38u, c53s);
        C14360o3.A0B(str, 12);
        this.A0G = il0;
        this.A0H = c69533Vqx;
        this.A0B = userSession;
        this.A0K = anonymousClass309;
        this.A0A = c18920wW;
        this.A0C = c37330GcY;
        this.A0F = jpu;
        this.A0Y = c38u;
        this.A0W = c53s;
        this.A0X = c38085GpE;
        this.A0O = c1m1;
        this.A0Q = str;
        this.A0M = c64842wi;
        this.A0N = c64742wY;
        this.A0Z = str2;
        this.A0a = z;
        this.A0b = z2;
        this.A0D = c38086GpF;
        this.A0I = c93y;
        this.A0E = jig;
        this.A0J = c38082GpB;
        this.A09 = viewOnTouchListenerC60632pm;
        this.A0L = gt7;
        this.A0T = AbstractC37301Gc2.A0s(this, 47);
        this.A0S = AbstractC37301Gc2.A0s(this, 46);
        this.A0V = AbstractC37301Gc2.A0s(this, 49);
        this.A0U = AbstractC37301Gc2.A0s(this, 48);
        this.A0R = AbstractC37301Gc2.A0s(this, 45);
        this.A0P = c1m1.getSessionId();
    }

    private final void A03(DiscoveryChainingConfig discoveryChainingConfig) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable(AbstractC111324zv.A00(4328), discoveryChainingConfig);
        UserSession userSession = this.A0B;
        C38P c38p = this.A0G.A00;
        C6XJ A0L = AbstractC31171DnF.A0L(c38p.requireActivity(), A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(4400));
        A0L.A07();
        A0L.A0D(c38p, 808);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(X.AbstractC127945qN r12, X.C38321qM r13, boolean r14, boolean r15) {
        /*
            r11 = this;
            java.lang.String r7 = r12.getKey()
            com.instagram.common.session.UserSession r3 = r11.A0B
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36312423774291049(0x8101f500000469, double:3.027461241031338E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L1a
            X.3a3 r0 = r13.CFR()
            r11.A05(r0)
        L1a:
            r4 = 0
            if (r14 == 0) goto L2c
            java.lang.String r1 = r13.A38()
            if (r1 == 0) goto Lfb
            java.lang.String r0 = "explore"
            X.1ON r0 = X.AbstractC2044893h.A05(r3, r1, r0, r4)
            X.C1GJ.A03(r0)
        L2c:
            X.93Y r10 = r11.A0I
            boolean r9 = r10.A05
            X.5qK r5 = r12.A02
            int r0 = r5.A04
            r1 = 1
            if (r0 != r1) goto Le5
            int r0 = r5.A02
            if (r0 != r1) goto Le5
            boolean r0 = r13.CdW()
            if (r0 == 0) goto Le5
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            r0 = 36328521312321123(0x81109900093e63, double:3.03764138890114E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Le5
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.A0w
        L52:
            X.IL0 r8 = r11.A0G
            X.38P r0 = r8.A00
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            X.5Qr r5 = new X.5Qr
            r5.<init>(r1, r3)
            r5.A1C = r7
            java.lang.String r0 = r13.getId()
            r5.A1D = r0
            r7 = 0
            r5.A1d = r7
            if (r9 == 0) goto Lc3
            com.instagram.explore.topiccluster.ExploreTopicCluster r1 = r10.A00
            if (r1 == 0) goto L78
            java.lang.String r0 = r1.A0A
            r5.A0o = r0
            java.lang.String r0 = r1.A06
            r5.A0s = r0
        L78:
            boolean r0 = r13.CdW()
            if (r0 == 0) goto La4
            X.C14360o3.A0B(r3, r7)
            r0 = 36328521312321123(0x81109900093e63, double:3.03764138890114E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto La4
            X.1sb r0 = X.AbstractC37300Gc1.A0F(r13)
            if (r0 == 0) goto Lc1
            java.lang.String r0 = r0.AZE()
        L96:
            r5.A18 = r0
            X.1sb r0 = X.AbstractC37300Gc1.A0F(r13)
            if (r0 == 0) goto La2
            java.lang.String r4 = r0.CAR()
        La2:
            r5.A1B = r4
        La4:
            com.instagram.model.mediatype.ProductType r1 = r13.A1z()
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            if (r1 == r0) goto Lbd
            boolean r0 = r13.CdW()
            if (r0 != 0) goto Lbd
            r0 = 36328521312386660(0x811099000a3e64, double:3.0376413889425856E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r5.A1g = r0
        Lbd:
            X.AbstractC31173DnH.A1J(r6, r5, r3)
            return
        Lc1:
            r0 = r4
            goto L96
        Lc3:
            r0 = 36328521312058975(0x81109900053e5f, double:3.037641388735356E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L78
            r1 = 2131962000(0x7f132890, float:1.9560713E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r0 = r8.A00(r1, r0)
            r5.A0o = r0
            r1 = 2131961999(0x7f13288f, float:1.956071E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r0 = r8.A00(r1, r0)
            r5.A0p = r0
            goto L78
        Le5:
            if (r15 == 0) goto Lf1
            if (r9 == 0) goto Led
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.A0x
            goto L52
        Led:
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.A11
            goto L52
        Lf1:
            if (r9 == 0) goto Lf7
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.A0y
            goto L52
        Lf7:
            com.instagram.clips.intf.ClipsViewerSource r1 = com.instagram.clips.intf.ClipsViewerSource.A13
            goto L52
        Lfb:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38089GpI.A04(X.5qN, X.1qM, boolean, boolean):void");
    }
}
