package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.modal.ModalActivity;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;
import com.instagram.user.model.Product;

/* renamed from: X.Iuz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42704Iuz implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C42704Iuz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        Activity activity;
        C6XJ A0L;
        long j;
        String A2u;
        Long A0j;
        switch (this.A00) {
            case 0:
                ((AbstractC42425IqS) this.A02).A0I((ExploreTopicCluster) this.A01, false);
                return;
            case 1:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
                activity = (Activity) this.A01;
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString(AbstractC43591JPw.A00(37), "not_interested");
                A0b.putString(AbstractC43591JPw.A00(334), AbstractC43591JPw.A00(1060));
                A0L = AbstractC31171DnF.A0L(activity, A0b, abstractC12990ll, ModalActivity.class, AbstractC111324zv.A00(126));
                break;
            case 2:
                C42850IxQ c42850IxQ = (C42850IxQ) this.A01;
                C41165IKe c41165IKe = c42850IxQ.A00;
                C41730Ie1 c41730Ie1 = (C41730Ie1) this.A02;
                C1XJ.A00.A01(c41165IKe.A02.requireActivity(), c41165IKe.A03, AbstractC37300Gc1.A0T(c42850IxQ.A01), c41165IKe.A0C, c41165IKe.A04.getModuleName(), "add_to_bag_cta", null, c41730Ie1.A05());
                return;
            case 3:
                C41646Ibe.A00((C41646Ibe) this.A02, (Product) this.A01, "add_to_bag_cta");
                return;
            case 4:
                C42824Ix0 c42824Ix0 = (C42824Ix0) this.A01;
                C42824Ix0.A02(c42824Ix0, new J3W(this), 0);
                MerchantShoppingCartFragment merchantShoppingCartFragment = c42824Ix0.A00;
                C41731Ie2 c41731Ie2 = merchantShoppingCartFragment.A09;
                String str = merchantShoppingCartFragment.A0U;
                String str2 = merchantShoppingCartFragment.A0N;
                C41730Ie1 c41730Ie12 = (C41730Ie1) this.A02;
                String str3 = merchantShoppingCartFragment.A0Q;
                String str4 = merchantShoppingCartFragment.A0T;
                boolean A1R = AbstractC167007dF.A1R(0, str, str2);
                InterfaceC02590Ai A00 = C41730Ie1.A00(c41731Ie2.A02, c41730Ie12, "instagram_shopping_bag_undo_remove_item");
                C41730Ie1.A02(A00, c41730Ie12);
                Product A04 = c41730Ie12.A04();
                boolean z = true;
                if (A04 == null || A04.A0P != A1R) {
                    z = false;
                }
                AbstractC37303Gc4.A0s(A00, str, z);
                String str5 = c41731Ie2.A05;
                if (str5 != null) {
                    A00.AAP("merchant_bag_entry_point", str5);
                    String str6 = c41731Ie2.A06;
                    if (str6 != null) {
                        C41731Ie2.A02(A00, c41731Ie2, C41731Ie2.A01(A00, c41731Ie2, "merchant_bag_prior_module", str6, str2), str3);
                        AbstractC37303Gc4.A0m(A00, str4);
                        A00.Cht();
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 5:
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putString(AbstractC43591JPw.A00(37), "upsell");
                AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A02;
                activity = (Activity) this.A01;
                A0L = AbstractC31171DnF.A0L(activity, A0b2, abstractC12990ll2, ModalActivity.class, AbstractC111324zv.A00(126));
                break;
            case 6:
                C59952od c59952od = (C59952od) this.A02;
                UserSession A01 = C59952od.A01(c59952od);
                C37540Gfw c37540Gfw = c59952od.A09;
                if (c37540Gfw == null) {
                    C14360o3.A0F("clipsViewerFragmentViewModel");
                    throw C00O.createAndThrow();
                }
                C37522Gfe c37522Gfe = c37540Gfw.A19;
                C120985dq c120985dq = (C120985dq) this.A01;
                boolean A1a = AbstractC167017dG.A1a(A01, c37522Gfe);
                C38321qM c38321qM = c120985dq.A02;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c37522Gfe, A01), "ig_creators_originality_dr_toast_click");
                if (A0f.isSampled()) {
                    AbstractC31171DnF.A1I(A0f, c37522Gfe.getModuleName());
                    A0f.A9K("user_igid", AbstractC25228BEl.A13(A01.userId));
                    if (c38321qM != null && (A2u = c38321qM.A2u()) != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                        j = A0j.longValue();
                    } else {
                        j = 0;
                    }
                    A0f.A9K("oc_clip_igid", Long.valueOf(j));
                    AbstractC37300Gc1.A0e(EnumC39630HiL.LEARN_MORE, A0f);
                    A0f.Cht();
                }
                Context requireContext = c59952od.requireContext();
                UserSession A012 = C59952od.A01(c59952od);
                C14360o3.A0B(A012, A1a ? 1 : 0);
                String A042 = C18U.A04(C06090Tz.A06, A012, 36888580752147253L);
                C2Fb c2Fb = C2Fb.A0r;
                if (A042.length() == 0) {
                    return;
                }
                new C63397SjR(requireContext, A012, c2Fb, A042, false).A0A();
                return;
            default:
                return;
        }
        A0L.A08();
        A0L.A0C(activity);
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        long j;
        String A2u;
        Long A0j;
        if (6 - this.A00 == 0) {
            C59952od c59952od = (C59952od) this.A02;
            UserSession A01 = C59952od.A01(c59952od);
            C37540Gfw c37540Gfw = c59952od.A09;
            if (c37540Gfw == null) {
                C14360o3.A0F("clipsViewerFragmentViewModel");
                throw C00O.createAndThrow();
            }
            C37522Gfe c37522Gfe = c37540Gfw.A19;
            C120985dq c120985dq = (C120985dq) this.A01;
            AbstractC167017dG.A1N(A01, c37522Gfe);
            C38321qM c38321qM = c120985dq.A02;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c37522Gfe, A01), "ig_creators_originality_dr_toast_impression");
            if (A0f.isSampled()) {
                AbstractC31171DnF.A1I(A0f, c37522Gfe.getModuleName());
                A0f.A9K("user_igid", AbstractC25228BEl.A13(A01.userId));
                if (c38321qM != null && (A2u = c38321qM.A2u()) != null && (A0j = AbstractC166997dE.A0j(A2u)) != null) {
                    j = A0j.longValue();
                } else {
                    j = 0;
                }
                A0f.A9K("oc_clip_igid", Long.valueOf(j));
                A0f.Cht();
            }
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onTextClick(View view) {
        if (this.A00 == 0) {
            ((AbstractC42425IqS) this.A02).A0G((ExploreTopicCluster) this.A01);
        }
    }

    public C42704Iuz(Activity activity, UserSession userSession, int i) {
        this.A00 = i;
        this.A02 = userSession;
        this.A01 = activity;
    }
}
