package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GJl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36788GJl implements InterfaceC42241xE {
    public final /* synthetic */ C34639FNw A00;

    public C36788GJl(C34639FNw c34639FNw) {
        this.A00 = c34639FNw;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0pQ, java.lang.Object] */
    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str;
        boolean z;
        String str2;
        Long l;
        Long l2;
        Object obj2;
        E72 e72 = (E72) obj;
        C34639FNw c34639FNw = this.A00;
        c34639FNw.A03 = false;
        if (!e72.A01) {
            List A0g = AbstractC001800i.A0g((Iterable) e72.A00, new GRI(1));
            c34639FNw.A02 = e72.A02;
            if (AbstractC166987dD.A1b(A0g)) {
                DirectAggregatedMediaViewerController directAggregatedMediaViewerController = c34639FNw.A05.A00;
                if (directAggregatedMediaViewerController.A0n) {
                    C158797Aq A05 = DirectAggregatedMediaViewerController.A05(directAggregatedMediaViewerController);
                    if (A05 != null) {
                        str = A05.A0S;
                    } else {
                        str = null;
                    }
                    ?? obj3 = new Object();
                    obj3.A00 = -1;
                    C158797Aq A052 = DirectAggregatedMediaViewerController.A05(directAggregatedMediaViewerController);
                    if (A052 != null) {
                        z = A052.A0m;
                    } else {
                        z = false;
                    }
                    ArrayList A1E = AbstractC166987dD.A1E();
                    int size = A0g.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            C76T c76t = directAggregatedMediaViewerController.A0G;
                            if (c76t == null) {
                                str2 = "viewModelFactory";
                                break;
                            }
                            UserSession userSession = directAggregatedMediaViewerController.A0y;
                            C35169FfL c35169FfL = (C35169FfL) A0g.get(i);
                            C158797Aq A053 = DirectAggregatedMediaViewerController.A05(directAggregatedMediaViewerController);
                            if (A053 != null) {
                                l = A053.A0K;
                            } else {
                                l = null;
                            }
                            C3o9 c3o9 = directAggregatedMediaViewerController.A0T;
                            String A054 = ((C35169FfL) A0g.get(i)).A05();
                            boolean A0j = DirectAggregatedMediaViewerController.A0j(directAggregatedMediaViewerController, ((C35169FfL) A0g.get(i)).A02());
                            C61072qV c61072qV = directAggregatedMediaViewerController.A0A;
                            if (c61072qV != null) {
                                l2 = Long.valueOf(c61072qV.A00(AbstractC111324zv.A00(874)));
                            } else {
                                l2 = null;
                            }
                            C158797Aq A03 = c76t.A03(userSession, c35169FfL, c3o9, l, l2, A054, null, z, A0j);
                            DirectAggregatedMediaViewerController.A0R(directAggregatedMediaViewerController, A03);
                            if (directAggregatedMediaViewerController.A0W == C05F.A01 && !A03.A0l) {
                                Iterator it = directAggregatedMediaViewerController.A1D.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        C158797Aq c158797Aq = (C158797Aq) obj2;
                                        if (c158797Aq.A0l && C14360o3.A0K(c158797Aq.A0S, A03.A0S)) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                C158797Aq c158797Aq2 = (C158797Aq) obj2;
                                if (c158797Aq2 != null) {
                                    boolean z2 = c158797Aq2.A0l;
                                    String str3 = c158797Aq2.A0R;
                                    String str4 = c158797Aq2.A0O;
                                    UserSession userSession2 = A03.A0D;
                                    boolean z3 = A03.A0t;
                                    float f = A03.A02;
                                    C42221xC c42221xC = A03.A09;
                                    C42221xC c42221xC2 = A03.A0B;
                                    boolean z4 = A03.A0u;
                                    C42221xC c42221xC3 = A03.A0A;
                                    C42221xC c42221xC4 = A03.A0C;
                                    String str5 = A03.A0U;
                                    String str6 = A03.A0T;
                                    C2EY c2ey = A03.A0G;
                                    EnumC40111tc enumC40111tc = A03.A0I;
                                    int i2 = A03.A03;
                                    int i3 = A03.A05;
                                    int i4 = A03.A06;
                                    C7Q4 c7q4 = A03.A0F;
                                    C38321qM c38321qM = A03.A0E;
                                    String str7 = A03.A0S;
                                    String str8 = A03.A0N;
                                    boolean z5 = A03.A0m;
                                    boolean z6 = A03.A0r;
                                    boolean z7 = A03.A0i;
                                    boolean z8 = A03.A0d;
                                    C42221xC c42221xC5 = A03.A08;
                                    List list = A03.A0b;
                                    boolean z9 = A03.A0j;
                                    Long l3 = A03.A0K;
                                    Boolean bool = A03.A0J;
                                    Long l4 = A03.A0L;
                                    PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = A03.A01;
                                    boolean z10 = A03.A0g;
                                    Long l5 = A03.A0M;
                                    C7AS c7as = A03.A00;
                                    boolean z11 = A03.A0q;
                                    android.net.Uri uri = A03.A07;
                                    String str9 = A03.A0Y;
                                    boolean z12 = A03.A0k;
                                    A03 = new C158797Aq(uri, c42221xC, c42221xC2, c42221xC3, c42221xC4, c42221xC5, userSession2, c7as, privacyMediaOverlayViewModel, c38321qM, c7q4, c2ey, A03.A0H, enumC40111tc, bool, l3, l4, l5, str5, str6, str7, str8, null, null, str9, str3, str4, A03.A0V, A03.A0X, null, A03.A0W, list, f, i2, i3, i4, 0, z3, false, z4, z5, z6, z7, z8, false, z9, z10, z11, z2, z12, A03.A0p, A03.A0c, A03.A0e, A03.A0f, A03.A0s, A03.A0o);
                                }
                            }
                            A1E.add(A03);
                            String str10 = A03.A0S;
                            if (str10 != null && str10.equals(str)) {
                                obj3.A00 = i;
                            }
                            i++;
                        } else {
                            str2 = "viewPager";
                            if (DirectAggregatedMediaViewerController.A0h(directAggregatedMediaViewerController)) {
                                KL4 kl4 = directAggregatedMediaViewerController.A0I;
                                if (kl4 != null) {
                                    kl4.A01 = DirectAggregatedMediaViewerController.A09(directAggregatedMediaViewerController.A0T);
                                    if (obj3.A00 >= 0) {
                                        ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
                                        if (reboundViewPager != null) {
                                            if (reboundViewPager.isLaidOut() && !reboundViewPager.isLayoutRequested()) {
                                                KL4 kl42 = directAggregatedMediaViewerController.A0I;
                                                if (kl42 != null) {
                                                    kl42.A00 = obj3.A00;
                                                    kl42.A05 = true;
                                                    kl42.A00(A1E, false);
                                                    ReboundViewPager reboundViewPager2 = directAggregatedMediaViewerController.A0D;
                                                    if (reboundViewPager2 != null) {
                                                        float f2 = obj3.A00;
                                                        reboundViewPager2.A02 = reboundViewPager2.A01;
                                                        reboundViewPager2.A0J(f2, true, false);
                                                        reboundViewPager2.A02 = -1.0f;
                                                    }
                                                }
                                            } else {
                                                reboundViewPager.addOnLayoutChangeListener(new LQD(2, A1E, directAggregatedMediaViewerController, obj3));
                                            }
                                        }
                                    } else {
                                        KL4 kl43 = directAggregatedMediaViewerController.A0I;
                                        if (kl43 != null) {
                                            kl43.A00(A1E, true);
                                        }
                                    }
                                }
                                C14360o3.A0F("pagerAdapter");
                            } else {
                                int i5 = obj3.A00;
                                ReboundViewPager reboundViewPager3 = directAggregatedMediaViewerController.A0D;
                                if (reboundViewPager3 != null) {
                                    int currentDataIndex = reboundViewPager3.getCurrentDataIndex();
                                    KL4 kl44 = directAggregatedMediaViewerController.A0I;
                                    if (i5 != currentDataIndex) {
                                        if (kl44 != null) {
                                            kl44.A00(A1E, true);
                                            KL4 kl45 = directAggregatedMediaViewerController.A0I;
                                            if (kl45 != null) {
                                                kl45.A01 = DirectAggregatedMediaViewerController.A09(directAggregatedMediaViewerController.A0T);
                                                ReboundViewPager reboundViewPager4 = directAggregatedMediaViewerController.A0D;
                                                if (reboundViewPager4 != null) {
                                                    if (reboundViewPager4.isLaidOut() && !reboundViewPager4.isLayoutRequested()) {
                                                        ReboundViewPager reboundViewPager5 = directAggregatedMediaViewerController.A0D;
                                                        if (reboundViewPager5 != null) {
                                                            reboundViewPager5.A0G(obj3.A00);
                                                        }
                                                    } else {
                                                        reboundViewPager4.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC35698FpY(0, directAggregatedMediaViewerController, obj3));
                                                    }
                                                }
                                            }
                                        }
                                        C14360o3.A0F("pagerAdapter");
                                    } else {
                                        if (kl44 != null) {
                                            ReboundViewPager reboundViewPager6 = directAggregatedMediaViewerController.A0D;
                                            if (reboundViewPager6 != null) {
                                                kl44.A00 = reboundViewPager6.getCurrentDataIndex();
                                                kl44.A05 = true;
                                                KL4 kl46 = directAggregatedMediaViewerController.A0I;
                                                if (kl46 != null) {
                                                    kl46.A00(A1E, true);
                                                    KL4 kl47 = directAggregatedMediaViewerController.A0I;
                                                    if (kl47 != null) {
                                                        kl47.A01 = DirectAggregatedMediaViewerController.A09(directAggregatedMediaViewerController.A0T);
                                                    }
                                                }
                                            }
                                        }
                                        C14360o3.A0F("pagerAdapter");
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
            }
            int size2 = A0g.size();
            C3o9 c3o92 = c34639FNw.A00;
            if (c3o92 != null && !c34639FNw.A01 && !c34639FNw.A03 && c34639FNw.A02 && size2 < 5) {
                c34639FNw.A03 = true;
                c34639FNw.A01 = true;
                c34639FNw.A06.A0A(c3o92, Integer.valueOf(5 - size2));
            }
        }
    }
}
