package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.question.model.QuestionResponseModelIntf;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Ijz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42030Ijz implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public ViewOnClickListenerC42030Ijz(Context context, C41096IHn c41096IHn, InterfaceC11380iw interfaceC11380iw, User user, int i) {
        this.A00 = i;
        this.A04 = c41096IHn;
        this.A02 = context;
        switch (i) {
            case 1:
            case 2:
                this.A03 = user;
                this.A01 = interfaceC11380iw;
                break;
            default:
                this.A01 = interfaceC11380iw;
                this.A03 = user;
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        String str;
        int i;
        IET iet;
        String str2;
        String str3;
        String A00;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1280312334);
                C41096IHn c41096IHn = (C41096IHn) this.A04;
                Activity activity = (Activity) this.A01;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
                C41628IbJ c41628IbJ = (C41628IbJ) this.A03;
                UserSession userSession = c41096IHn.A03;
                QuestionResponseModelIntf questionResponseModelIntf = c41628IbJ.A00;
                if (questionResponseModelIntf != null) {
                    str = questionResponseModelIntf.getId();
                } else {
                    str = null;
                }
                WEz A01 = AbstractC69993VzD.A01(activity, interfaceC11380iw, userSession, EnumC65855TvH.A1D, VG2.A0l, str);
                A01.A01 = C41628IbJ.A00(c41628IbJ);
                AbstractC37301Gc2.A1R(A01, new C39450Hbc(0));
                i = 1545752412;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(757152004);
                C41096IHn c41096IHn2 = (C41096IHn) this.A04;
                Context context = (Context) this.A02;
                AbstractC018607g abstractC018607g = c41096IHn2.A00;
                User user = (User) this.A03;
                InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A01;
                C28151Xt c28151Xt = C28151Xt.A02;
                if (c28151Xt != null) {
                    c28151Xt.A02(context, abstractC018607g, c41096IHn2.A03, new J2F(0), user.getId(), interfaceC11380iw2.getModuleName());
                }
                i = 403591072;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(1600699357);
                C41096IHn c41096IHn3 = (C41096IHn) this.A04;
                Context context2 = (Context) this.A02;
                AbstractC018607g abstractC018607g2 = c41096IHn3.A00;
                User user2 = (User) this.A03;
                InterfaceC11380iw interfaceC11380iw3 = (InterfaceC11380iw) this.A01;
                C28151Xt c28151Xt2 = C28151Xt.A02;
                if (c28151Xt2 != null) {
                    c28151Xt2.A03(context2, abstractC018607g2, c41096IHn3.A03, new J2F(1), user2.getId(), interfaceC11380iw3.getModuleName(), null, null);
                }
                i = -1065920541;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(-1406094603);
                C41096IHn c41096IHn4 = (C41096IHn) this.A04;
                Context context3 = (Context) this.A02;
                InterfaceC11380iw interfaceC11380iw4 = (InterfaceC11380iw) this.A01;
                User user3 = (User) this.A03;
                C28261Yl.A00.A00(context3, null, c41096IHn4.A03, user3, null, interfaceC11380iw4.getModuleName(), null, user3.getUsername());
                i = 635227167;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(717937667);
                AbstractC42425IqS abstractC42425IqS = (AbstractC42425IqS) this.A01;
                C37931GmT c37931GmT = (C37931GmT) this.A04;
                C38321qM BQN = c37931GmT.BQN();
                C5qT c5qT = (C5qT) this.A03;
                C14360o3.A0A(view);
                abstractC42425IqS.DLL(view, c5qT, c37931GmT, BQN);
                ((C38211GrG) this.A02).A00();
                i = 130633343;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(-648959780);
                ((C38210GrF) this.A02).A00((Context) this.A01, ((C37931GmT) this.A04).BQN(), (InterfaceC60442pS) this.A03);
                i = 1423066753;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(614455326);
                AbstractC42425IqS abstractC42425IqS2 = (AbstractC42425IqS) this.A01;
                C37931GmT c37931GmT2 = (C37931GmT) this.A04;
                C38321qM BQN2 = c37931GmT2.BQN();
                C5qT c5qT2 = (C5qT) this.A03;
                C14360o3.A0A(view);
                abstractC42425IqS2.DLL(view, c5qT2, c37931GmT2, BQN2);
                ((C38211GrG) this.A02).A00();
                i = -362088438;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(-1360193);
                ((AbstractC42425IqS) this.A01).A0E((C5qT) this.A02, (C38164GqV) this.A03, (C127935qM) this.A04);
                i = -1069001513;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(-114936981);
                JPT jpt = (JPT) this.A01;
                AbstractC127945qN abstractC127945qN = (AbstractC127945qN) this.A04;
                C38321qM c38321qM = (C38321qM) this.A03;
                C5qT c5qT3 = (C5qT) this.A02;
                C14360o3.A0A(view);
                jpt.DLL(view, c5qT3, abstractC127945qN, c38321qM);
                i = -225524433;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = C0f9.A05(-709135087);
                AbstractC42425IqS abstractC42425IqS3 = (AbstractC42425IqS) this.A01;
                AbstractC127945qN abstractC127945qN2 = (AbstractC127945qN) this.A04;
                C14360o3.A0A(view);
                if (abstractC42425IqS3 instanceof C38089GpI) {
                    C38089GpI c38089GpI = (C38089GpI) abstractC42425IqS3;
                    C14360o3.A0B(view, 3);
                    HKa hKa = (HKa) abstractC127945qN2;
                    C40952IBz c40952IBz = hKa.A01;
                    String str4 = null;
                    if (c40952IBz != null && (iet = c40952IBz.A00) != null) {
                        c38089GpI.A0K(iet.A01);
                        C18920wW c18920wW = c38089GpI.A0A;
                        IET iet2 = c40952IBz.A00;
                        if (iet2 != null) {
                            str2 = iet2.A00;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            if (iet2 != null) {
                                String str5 = iet2.A01;
                                ExploreTopicCluster exploreTopicCluster = c38089GpI.A0J().A02;
                                if (exploreTopicCluster != null) {
                                    str4 = exploreTopicCluster.A05;
                                }
                                String moduleName = c38089GpI.A0K.getModuleName();
                                C38321qM c38321qM2 = hKa.A02;
                                if (c38321qM2 != null) {
                                    String mezqlToken = c38321qM2.A0C.getMezqlToken();
                                    String B3P = c38321qM2.A0C.B3P();
                                    String A2u = c38321qM2.A2u();
                                    if (A2u != null) {
                                        long parseLong = Long.parseLong(A2u);
                                        Long valueOf = Long.valueOf(hKa.A00);
                                        AbstractC167007dF.A1G(c18920wW, 0, moduleName);
                                        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "explore_topic_tile_click");
                                        AbstractC31171DnF.A1I(A0f, moduleName);
                                        A0f.AAP("topic_cluster_id", str2);
                                        A0f.AAP("topic_cluster_type", "interest_keyword");
                                        A0f.AAP("topic_cluster_title", str5);
                                        A0f.A9K("media_type", AbstractC167007dF.A0d());
                                        A0f.A9K("media_igid", Long.valueOf(parseLong));
                                        AbstractC25225BEi.A1N(A0f, "");
                                        A0f.AAP("explore_source_token", B3P);
                                        A0f.A9K("page_num", valueOf);
                                        A0f.AAP("mezql_token", mezqlToken);
                                        A0f.AAP("topic_cluster_debug_info", str4);
                                        A0f.Cht();
                                    }
                                }
                                throw AbstractC166987dD.A12("Required value was null.");
                            }
                            throw AbstractC166987dD.A12("Required value was null.");
                        }
                        throw AbstractC166987dD.A12("Required value was null.");
                    }
                }
                i = -868469436;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(1716922306);
                UserSession userSession2 = (UserSession) this.A04;
                Fragment fragment = (Fragment) this.A01;
                C2Fb c2Fb = C2Fb.A4G;
                C60962qK A012 = AbstractC60952qJ.A01("instagram_profile_visit", true, true);
                C38321qM c38321qM3 = (C38321qM) this.A02;
                C75113Zb c75113Zb = (C75113Zb) this.A03;
                C37952Gmu c37952Gmu = new C37952Gmu(fragment, userSession2, new C5SE(userSession2, c38321qM3, c75113Zb.A06()), A012, c2Fb);
                c37952Gmu.A01(c38321qM3);
                c37952Gmu.A09 = c75113Zb.A03;
                c37952Gmu.A0B = c75113Zb.getPosition();
                c37952Gmu.A0K = c75113Zb;
                View view2 = fragment.mView;
                if (view2 != null) {
                    C71313Hs A07 = AbstractC37301Gc2.A07(userSession2);
                    A07.A05(view2, EnumC71343Hv.A07);
                    A07.A0A(view2, new C79623hD(new C139726Ub(fragment.getContext(), userSession2, c38321qM3), userSession2, c38321qM3, AbstractC60952qJ.A01("instagram_deeplink", true, true)));
                    A07.A0B(view2, new String[0]);
                }
                C37953Gmv.A02(c37952Gmu);
                i = 54189550;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A05 = C0f9.A05(-1728625332);
                ((JGA) this.A02).Ddy((C42800Iwc) this.A03, (Reel) this.A04, (List) this.A01);
                i = -1792546137;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = C0f9.A05(-894496781);
                ((ICA) this.A02).A00.A00.A0b((Reel) this.A04, (C42795IwX) this.A03, (List) this.A01);
                i = -1626135766;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(-2066293521);
                AbstractC41065IGi abstractC41065IGi = (AbstractC41065IGi) this.A01;
                abstractC41065IGi.A02.invoke(this.A03);
                C41198ILm c41198ILm = (C41198ILm) this.A04;
                AbstractC35087Fcy.A01(c41198ILm.A00, c41198ILm.A01, (SavedCollection) this.A02, abstractC41065IGi.A01);
                i = 400885310;
                C0f9.A0C(i, A05);
                return;
            case 14:
                A05 = C0f9.A05(-227901075);
                AbstractC41065IGi abstractC41065IGi2 = (AbstractC41065IGi) this.A01;
                abstractC41065IGi2.A02.invoke(this.A03);
                C41198ILm c41198ILm2 = (C41198ILm) this.A04;
                AbstractC35087Fcy.A01(c41198ILm2.A00, c41198ILm2.A01, (SavedCollection) this.A02, abstractC41065IGi2.A01);
                i = -1484023323;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                A05 = C0f9.A05(-1503063143);
                IK3 ik3 = (IK3) this.A04;
                UserSession userSession3 = ik3.A02;
                C50674MYs c50674MYs = (C50674MYs) this.A03;
                Context context4 = c50674MYs.A00;
                C14360o3.A0C(context4, "null cannot be cast to non-null type android.app.Activity");
                Activity activity2 = (Activity) context4;
                InterfaceC60442pS interfaceC60442pS = ik3.A03;
                ProductTile productTile = (ProductTile) this.A02;
                Product product = productTile.A07;
                FBProductItemDetailsDict fBProductItemDetailsDict = null;
                if (product != null) {
                    str3 = product.A0H;
                } else {
                    str3 = null;
                }
                ProductTileProductImpl productTileProductImpl = productTile.A02;
                if (productTileProductImpl != null) {
                    fBProductItemDetailsDict = productTileProductImpl.A00;
                }
                if (str3 == null) {
                    if (fBProductItemDetailsDict != null) {
                        str3 = AbstractC37302Gc3.A0Z(fBProductItemDetailsDict);
                    } else {
                        throw AbstractC166987dD.A14("There must be a non null feed item field");
                    }
                }
                AbstractC37301Gc2.A1R(AbstractC69993VzD.A01(activity2, interfaceC60442pS, userSession3, EnumC65855TvH.A19, VG2.A0f, str3), new C39457Hbj(1, this.A01, productTile, c50674MYs, ik3));
                i = -1217506212;
                C0f9.A0C(i, A05);
                return;
            case 16:
                A05 = C0f9.A05(637679074);
                C37675GiC c37675GiC = (C37675GiC) this.A04;
                C120985dq c120985dq = (C120985dq) this.A01;
                C37644Ghd c37644Ghd = (C37644Ghd) this.A02;
                User user4 = (User) this.A03;
                C65 A013 = C76493bt.A01(c120985dq);
                if (C18U.A06(C06090Tz.A06, c37675GiC.A0C, 2342171363022028259L)) {
                    A00 = null;
                } else {
                    A00 = AbstractC111324zv.A00(3282);
                }
                c37675GiC.Dbc(null, c120985dq, c37644Ghd, A013, user4, null, null, null, null, null, null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A00, "primary", null, false, false);
                i = -1854527678;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(-339100884);
                ((C37607Gh2) this.A04).A0F.DlM((View) this.A03, (C120985dq) this.A01, (C37644Ghd) this.A02, AbstractC111324zv.A00(3195), false);
                i = -224185889;
                C0f9.A0C(i, A05);
                return;
        }
    }

    public ViewOnClickListenerC42030Ijz(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A01 = obj;
        this.A03 = obj4;
    }
}
