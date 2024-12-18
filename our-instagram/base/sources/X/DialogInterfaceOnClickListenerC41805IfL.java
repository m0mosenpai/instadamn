package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.creator.originality.graphql.IGSundialOriginalityRemoveLabelMutationQueryResponseImpl;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.IfL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41805IfL implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DialogInterfaceOnClickListenerC41805IfL(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass389 anonymousClass389;
        Context requireContext;
        UserSession userSession;
        AbstractC018607g abstractC018607g;
        String A0V;
        String str;
        DSB dsb;
        Object obj;
        int i2;
        Long l;
        switch (this.A00) {
            case 0:
                C38321qM c38321qM = (C38321qM) this.A02;
                UserSession userSession2 = (UserSession) this.A03;
                C57749Pjc c57749Pjc = new C57749Pjc(this.A01, 41);
                C04060Jx c04060Jx = GraphQlCallInput.A02;
                String A38 = c38321qM.A38();
                C0CA A02 = c04060Jx.A02();
                C0CA.A00(A02, A38, "media_id");
                C2JM A0b = AbstractC25225BEi.A0b();
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A02, A0b, AbstractC111324zv.A00(2542)), "IGSundialOriginalityRemoveLabelMutationQuery", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), IGSundialOriginalityRemoveLabelMutationQueryResponseImpl.class, true, null, 0, null, "xdt_remove_originality_label_from_media", AbstractC166987dD.A1E());
                C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
                if (A0u == null) {
                    return;
                }
                C128865s0 c128865s0 = new C128865s0(A0u);
                c128865s0.A0A = null;
                c38321qM.A43(c128865s0.A00());
                c38321qM.AEH(userSession2);
                AbstractC40691uc.A01(userSession2).ATV(new C48140LSp(0, A0u, userSession2, c38321qM, c57749Pjc), new C58510Pwe(c57749Pjc, 10), pandoGraphQLRequest);
                return;
            case 1:
                C38321qM c38321qM2 = (C38321qM) this.A02;
                boolean A5P = c38321qM2.A5P();
                UserSession userSession3 = (UserSession) this.A03;
                if (A5P) {
                    AbstractC1571873x.A07((Context) this.A01, userSession3, c38321qM2);
                    return;
                } else {
                    AbstractC1571873x.A06((Context) this.A01, null, userSession3, c38321qM2, C3YU.A04, null);
                    return;
                }
            case 2:
                UserSession userSession4 = ((ILA) this.A03).A00;
                Product product = (Product) this.A02;
                C25621Ms A0c = AbstractC167017dG.A0c(userSession4);
                A0c.A0B("commerce/reconsideration/dismiss_recently_viewed_product/");
                C1ON A0K = AbstractC31178DnM.A0K(A0c, "product_id", product.A0H);
                C37484Gf2.A00(A0K, product, userSession4, 13);
                C1GJ.A03(A0K);
                ((InterfaceC43415JGf) this.A01).DdE(product);
                C42347Ip9 A00 = I92.A00(userSession4, false);
                C14360o3.A0B(A00, 2);
                A00.A0H(EnumC39623HeX.A06, product);
                return;
            case 3:
                ((C38328GtN) ((HCF) this.A03).A0A.getValue()).A01((C41643IbZ) this.A01, (Product) this.A02, true);
                return;
            case 4:
                anonymousClass389 = (AnonymousClass389) this.A02;
                requireContext = anonymousClass389.A00.requireContext();
                userSession = anonymousClass389.A03;
                abstractC018607g = anonymousClass389.A01;
                A0V = AbstractC37300Gc1.A0V(this.A01);
                if (A0V != null) {
                    str = "media_options";
                    dsb = new DSB("media_options", anonymousClass389, 5);
                    obj = this.A03;
                    i2 = 27;
                    break;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            case 5:
                LinkedHashMap A07 = AbstractC82403m3.A07((C38321qM) this.A03);
                AnonymousClass389 anonymousClass3892 = (AnonymousClass389) this.A02;
                Object obj2 = this.A01;
                Iterator A14 = AbstractC166997dE.A14(A07);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    Object key = A1K.getKey();
                    List list = (List) A1K.getValue();
                    ArrayList<InterfaceC43546JLg> A1E = AbstractC166987dD.A1E();
                    Iterator it = list.iterator();
                    while (true) {
                        FeaturedProductPermissionStatus featuredProductPermissionStatus = null;
                        if (it.hasNext()) {
                            Object next = it.next();
                            JLH BcS = ((InterfaceC43546JLg) next).BcS();
                            if (BcS != null) {
                                featuredProductPermissionStatus = BcS.C0K();
                            }
                            if (featuredProductPermissionStatus == FeaturedProductPermissionStatus.A04) {
                                A1E.add(next);
                            }
                        } else {
                            for (InterfaceC43546JLg interfaceC43546JLg : A1E) {
                                Context requireContext2 = anonymousClass3892.A00.requireContext();
                                UserSession userSession5 = anonymousClass3892.A03;
                                AbstractC018607g abstractC018607g2 = anonymousClass3892.A01;
                                JLH BcS2 = interfaceC43546JLg.BcS();
                                if (BcS2 != null) {
                                    l = BcS2.BF7();
                                } else {
                                    l = null;
                                }
                                String valueOf = String.valueOf(l);
                                FeaturedProductPermissionStatus featuredProductPermissionStatus2 = FeaturedProductPermissionStatus.A05;
                                MIO mio = new MIO(obj2, anonymousClass3892, key, interfaceC43546JLg, "media_options", 19);
                                ME8 me8 = new ME8(interfaceC43546JLg, anonymousClass3892, key, "media_options", 21);
                                AbstractC167017dG.A1R(abstractC018607g2, valueOf);
                                C1GJ.A00(requireContext2, abstractC018607g2, I6U.A00(userSession5, featuredProductPermissionStatus2, valueOf, me8, mio));
                            }
                            dialogInterface.dismiss();
                        }
                    }
                }
                return;
            case 6:
                anonymousClass389 = (AnonymousClass389) this.A02;
                requireContext = anonymousClass389.A00.requireContext();
                userSession = anonymousClass389.A03;
                abstractC018607g = anonymousClass389.A01;
                A0V = AbstractC37300Gc1.A0V(this.A01);
                if (A0V != null) {
                    str = "media_options";
                    dsb = new DSB("media_options", anonymousClass389, 6);
                    obj = this.A03;
                    i2 = 28;
                    break;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            case 7:
                AbstractC55215Oed.A08((InterfaceC11380iw) this.A02, (UserSession) this.A03, "share_fundraiser_as_ig_story_click_ok", AbstractC111324zv.A00(1080), null, (Map) this.A01);
                return;
            case 8:
                C14360o3.A0B(dialogInterface, 0);
                C41699IdS c41699IdS = (C41699IdS) this.A03;
                if (c41699IdS.A09) {
                    new Q3R(c41699IdS).start();
                }
                IG2 ig2 = c41699IdS.A01;
                if (ig2 != null) {
                    String str2 = (String) ((C15370ps) this.A02).A00;
                    Integer valueOf2 = Integer.valueOf(((C15100pQ) this.A01).A00);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(ig2.A01, "follow_prompt_denied");
                    AbstractC31175DnJ.A14(A0f, ig2.A00);
                    AbstractC37303Gc4.A0o(A0f, "dialog", str2);
                    A0f.A8p("num_facepiles", valueOf2);
                    A0f.Cht();
                }
                dialogInterface.dismiss();
                return;
            default:
                UserSession userSession6 = (UserSession) this.A03;
                C38321qM c38321qM3 = (C38321qM) this.A02;
                C3YU c3yu = C3YU.A05;
                Context context = (Context) this.A01;
                AbstractC1571873x.A06(context, new C39030HGg(context, 36), userSession6, c38321qM3, c3yu, null);
                return;
        }
        C57262Pbk c57262Pbk = new C57262Pbk(obj, anonymousClass389, str, i2);
        C14360o3.A0B(abstractC018607g, 2);
        C25621Ms A0c2 = AbstractC167017dG.A0c(userSession);
        AbstractC37301Gc2.A1M(A0c2, "commerce/community/featured_products/permission_remove/", A0V);
        C1ON A0e = AbstractC25227BEk.A0e(A0c2, HAW.class, ISP.class);
        C37460Gee.A00(A0e, c57262Pbk, userSession, dsb, 6);
        C1GJ.A00(requireContext, abstractC018607g, A0e);
    }
}
