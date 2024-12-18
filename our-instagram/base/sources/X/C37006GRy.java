package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GRy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37006GRy implements InterfaceC19960yQ {
    public final /* synthetic */ DirectAggregatedMediaViewerController A00;

    public C37006GRy(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        this.A00 = directAggregatedMediaViewerController;
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        List list;
        Integer num;
        Long l;
        ExtendedImageUrl A01;
        ImageInfo A1t;
        List list2 = (List) obj;
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
        List list3 = directAggregatedMediaViewerController.A1D;
        ArrayList A0q = AbstractC167017dG.A0q(list3);
        Iterator it = list3.iterator();
        while (true) {
            Object obj2 = null;
            if (it.hasNext()) {
                C158797Aq c158797Aq = (C158797Aq) it.next();
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (C14360o3.A0K(((C32050E6c) next).A05, c158797Aq.A0S)) {
                        obj2 = next;
                        break;
                    }
                }
                C32050E6c c32050E6c = (C32050E6c) obj2;
                if (c32050E6c != null) {
                    C158797Aq c158797Aq2 = c158797Aq;
                    C38321qM c38321qM = c158797Aq.A0E;
                    Long l2 = null;
                    if (c38321qM != null && (A1t = c38321qM.A1t()) != null) {
                        list = A1t.AlQ();
                    } else {
                        list = null;
                    }
                    E6X e6x = c32050E6c.A00;
                    if ((list == null || list.size() <= 1) && e6x != null) {
                        ImageInfo imageInfo = e6x.A01;
                        if (imageInfo != null && (A01 = AbstractC40161tk.A01(directAggregatedMediaViewerController.A0v, imageInfo)) != null) {
                            C1OG A0J = C25821No.A00().A0J(A01, AbstractC111324zv.A00(874));
                            A0J.A0I = true;
                            A0J.A05 = directAggregatedMediaViewerController.A0y;
                            A0J.A01();
                        }
                        String str2 = c32050E6c.A05;
                        User user = c32050E6c.A02;
                        Integer num2 = c32050E6c.A04;
                        String str3 = c158797Aq.A0N;
                        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = c158797Aq.A01;
                        if (privacyMediaOverlayViewModel != null) {
                            num = Integer.valueOf(privacyMediaOverlayViewModel.A00);
                        } else {
                            num = null;
                        }
                        C35169FfL A02 = AbstractC35247Fgg.A02(e6x, user, num2, num, str2, str3, c158797Aq.A0V, c158797Aq.A0X, !c158797Aq.A0d, c158797Aq.A0c, c158797Aq.A0e, c158797Aq.A0f);
                        C76T c76t = directAggregatedMediaViewerController.A0G;
                        if (c76t == null) {
                            str = "viewModelFactory";
                            break;
                        }
                        UserSession userSession = directAggregatedMediaViewerController.A0y;
                        boolean z = directAggregatedMediaViewerController.A0k;
                        C158797Aq A05 = DirectAggregatedMediaViewerController.A05(directAggregatedMediaViewerController);
                        if (A05 != null) {
                            l = A05.A0K;
                        } else {
                            l = null;
                        }
                        C3o9 c3o9 = directAggregatedMediaViewerController.A0T;
                        String A052 = A02.A05();
                        boolean A0j = DirectAggregatedMediaViewerController.A0j(directAggregatedMediaViewerController, A02.A02());
                        C61072qV c61072qV = directAggregatedMediaViewerController.A0A;
                        if (c61072qV != null) {
                            l2 = Long.valueOf(c61072qV.A00(AbstractC111324zv.A00(874)));
                        }
                        c158797Aq2 = c76t.A03(userSession, A02, c3o9, l, l2, A052, null, z, A0j);
                        DirectAggregatedMediaViewerController.A0R(directAggregatedMediaViewerController, c158797Aq2);
                    }
                    if (c158797Aq2 != null) {
                        c158797Aq = c158797Aq2;
                    }
                }
                A0q.add(c158797Aq);
            } else {
                list3.clear();
                list3.addAll(A0q);
                ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
                if (reboundViewPager == null) {
                    str = "viewPager";
                } else {
                    if (reboundViewPager.isLaidOut() && !reboundViewPager.isLayoutRequested()) {
                        KL4 kl4 = directAggregatedMediaViewerController.A0I;
                        if (kl4 == null) {
                            str = "pagerAdapter";
                        } else {
                            kl4.A00(list3, true);
                        }
                    } else {
                        ViewOnLayoutChangeListenerC35699FpZ.A00(reboundViewPager, 0, directAggregatedMediaViewerController);
                    }
                    return C0eB.A00;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
