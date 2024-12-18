package X;

import android.content.Context;
import com.instagram.autoplay.models.AutoplayLayout;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GmW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37934GmW {
    public C38139Gq6 A00;
    public C38139Gq6 A01;
    public ExploreTopicCluster A02;
    public C38136Gq3 A03;
    public Long A04;
    public String A05;
    public String A06;
    public java.util.Set A07;
    public boolean A08;
    public boolean A09;
    public final Context A0A;
    public final AbstractC018607g A0B;
    public final C38142Gq9 A0C;
    public final UserSession A0D;
    public final C38179Gqk A0E;
    public final C38147GqE A0F;
    public final C38086GpF A0G;
    public final C38134Gq1 A0H;
    public final C93Y A0I;
    public final C38176Gqh A0J;
    public final Gt7 A0K;
    public final C61582rL A0L;
    public final C104484nE A0M;
    public final InterfaceC61432r6 A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final InterfaceC09390do A0U;
    public final boolean A0V;
    public final boolean A0W;

    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e4, code lost:
    
        if (r2 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0243, code lost:
    
        if (r2 == null) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, X.HjI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C93Z r27) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37934GmW.A00(X.93Z):void");
    }

    public final void A01(List list, String str) {
        this.A0G.A07(str, list);
        C38142Gq9 c38142Gq9 = this.A0C;
        if (c38142Gq9 != null && !c38142Gq9.A00) {
            c38142Gq9.A00 = true;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (obj instanceof C128005qU) {
                    A1E.add(obj);
                }
            }
            List A0d = AbstractC001800i.A0d(A1E, Math.min(2, list.size()));
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it = A0d.iterator();
            while (it.hasNext()) {
                AnonymousClass016.A16(((C128005qU) it.next()).A02, A1E2);
            }
            ArrayList A1E3 = AbstractC166987dD.A1E();
            Iterator it2 = A1E2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof C127935qM) {
                    A1E3.add(next);
                }
            }
            int size = A1E3.size();
            AutoplayLayout autoplayLayout = AutoplayLayout.EXPLORE_DIAGONAL;
            if (size < 2) {
                autoplayLayout = AutoplayLayout.EXPLORE_LOW_DIAGONAL;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("onFirstLoad: ");
            A1C.append(size);
            C14360o3.A0B(AbstractC167017dG.A0n(autoplayLayout, " -> ", A1C), 0);
            C65868TvV c65868TvV = c38142Gq9.A01;
            c65868TvV.A00.A00 = autoplayLayout;
            c65868TvV.A02.A00 = true;
            InterfaceC09390do interfaceC09390do = ((C44213JgH) c65868TvV.A04.getValue()).A01;
            if (!((C13400mQ) interfaceC09390do.getValue()).A02) {
                ((C13400mQ) interfaceC09390do.getValue()).A01(C0eB.A00);
            }
        }
    }

    public final void A02(List list, boolean z) {
        ExploreTopicCluster exploreTopicCluster;
        String str;
        if (list != null && (exploreTopicCluster = (ExploreTopicCluster) AbstractC001800i.A0J(list)) != null) {
            this.A02 = exploreTopicCluster;
            C38136Gq3 c38136Gq3 = this.A03;
            if (c38136Gq3 != null) {
                C38135Gq2 c38135Gq2 = c38136Gq3.A00;
                C38127Gpu c38127Gpu = c38135Gq2.A0C.A05;
                ExploreTopicCluster exploreTopicCluster2 = c38127Gpu.A00;
                if (exploreTopicCluster2 != null) {
                    str = exploreTopicCluster2.A06;
                } else {
                    str = null;
                }
                if (!C14360o3.A0K(str, exploreTopicCluster.A06)) {
                    c38127Gpu.A00 = exploreTopicCluster;
                    c38127Gpu.A01 = ((C38128Gpv) c38127Gpu.A03.A01(C38128Gpv.class, C38178Gqj.A00)).A00(c38127Gpu.A06, exploreTopicCluster.A06);
                }
                C38083GpC c38083GpC = c38135Gq2.A07;
                c38083GpC.A00 = exploreTopicCluster;
                UserSession userSession = c38083GpC.A02;
                InterfaceC60442pS interfaceC60442pS = c38083GpC.A03;
                String str2 = c38083GpC.A04;
                AbstractC38158GqP.A00(str2);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "explore_topic_switch");
                A0f.A8p("topic_nav_order", 0);
                A0f.A8p("dest_topic_cluster_position", 0);
                A0f.AAP("dest_topic_cluster_debug_info", exploreTopicCluster.A05);
                A0f.AAP("dest_topic_cluster_type", AbstractC127885qH.A00(exploreTopicCluster.A00()));
                A0f.AAP("dest_topic_cluster_title", exploreTopicCluster.A0A);
                A0f.AAP("dest_topic_cluster_id", exploreTopicCluster.A06);
                AbstractC31171DnF.A1C(A0f, "LOAD");
                AbstractC37301Gc2.A16(A0f, str2);
                C38321qM c38321qM = exploreTopicCluster.A02;
                if (c38321qM != null) {
                    A0f.AAP("dest_topic_cluster_cover_media_id", c38321qM.getId());
                }
                A0f.Cht();
                if (C55772hI.A00(userSession).A03 == null) {
                    C38083GpC.A00(c38083GpC);
                }
                c38135Gq2.A08.A00 = exploreTopicCluster;
                C69533Vqx c69533Vqx = c38135Gq2.A00;
                if (c69533Vqx != null) {
                    C38P c38p = c69533Vqx.A00;
                    C38P.A01(c38p);
                    C38144GqB c38144GqB = (C38144GqB) c38p.A0t.getValue();
                    C37934GmW c37934GmW = c38p.A0E;
                    if (c37934GmW == null) {
                        C14360o3.A0F("dataStore");
                        throw C00O.createAndThrow();
                    }
                    c38144GqB.A00 = c37934GmW.A02;
                }
            }
            if (z) {
                AbstractC38113Gpg.A00(this.A0D).A01 = list;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03() {
        /*
            r3 = this;
            boolean r0 = r3.A08
            r2 = 1
            if (r0 != 0) goto L13
            X.Gq6 r0 = r3.A00
            if (r0 != 0) goto L1a
            java.lang.String r0 = "feedNetworkSource"
        Lb:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L13:
            X.Gq6 r0 = r3.A01
            if (r0 != 0) goto L1a
            java.lang.String r0 = "nonprofiledFeedNetworkSource"
            goto Lb
        L1a:
            X.6xU r0 = r0.A00
            X.6xV r0 = r0.A03
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto L25
            r2 = 0
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37934GmW.A03():boolean");
    }

    public final boolean A04() {
        C38139Gq6 c38139Gq6;
        String str;
        if (!this.A08) {
            c38139Gq6 = this.A00;
            str = "feedNetworkSource";
        } else {
            c38139Gq6 = this.A01;
            str = "nonprofiledFeedNetworkSource";
        }
        if (c38139Gq6 == null) {
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        Integer num = c38139Gq6.A00.A03.A03;
        if (num != C05F.A00 && num != null) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C37934GmW(Context context, AbstractC018607g abstractC018607g, C38142Gq9 c38142Gq9, UserSession userSession, C38147GqE c38147GqE, C38086GpF c38086GpF, C93Y c93y, Gt7 gt7, C61582rL c61582rL, InterfaceC61432r6 interfaceC61432r6, String str, String str2, String str3, boolean z, boolean z2) {
        C104484nE A00 = AbstractC104474nD.A00(userSession);
        C38176Gqh A002 = AbstractC38123Gpq.A00(userSession);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(c38086GpF, 6);
        AbstractC25232BEp.A1P(A00, A002);
        this.A0A = context;
        this.A0B = abstractC018607g;
        this.A0D = userSession;
        this.A0S = str;
        this.A0R = str2;
        this.A0G = c38086GpF;
        this.A0I = c93y;
        this.A0W = z;
        this.A0T = str3;
        this.A0M = A00;
        this.A0J = A002;
        this.A0L = c61582rL;
        this.A0V = z2;
        this.A0F = c38147GqE;
        this.A0N = interfaceC61432r6;
        this.A0C = c38142Gq9;
        this.A0K = gt7;
        this.A02 = c93y.A00;
        C38179Gqk c38179Gqk = (C38179Gqk) userSession.A01(C38179Gqk.class, new C38190Gqv(userSession, 0));
        C14360o3.A07(c38179Gqk);
        this.A0E = c38179Gqk;
        this.A0U = AbstractC09440dt.A01(new C37053GUj(this, 5));
        this.A0H = new C38134Gq1();
        this.A0Q = "RELOAD";
        this.A0P = "LOAD_MORE";
        this.A0O = "INITIAL_LOAD";
    }
}
