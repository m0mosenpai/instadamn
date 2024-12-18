package X;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ThumbnailInteractionType;
import com.instagram.common.session.UserSession;
import com.instagram.explore.intf.ExploreFragmentConfig;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.nido.impl.explore.NidoExploreViewModel;
import java.util.List;

/* renamed from: X.IqS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC42425IqS implements JPT, C37V, InterfaceC43449JHn {
    public static String A07(C38321qM c38321qM) {
        ThumbnailInteractionType C86 = c38321qM.A0C.C86();
        if (C86 == null) {
            return null;
        }
        int ordinal = C86.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return "reshares";
            }
            return null;
        }
        return "likes";
    }

    public void A0D(View view, C5qT c5qT, HKV hkv) {
    }

    public void A0E(C5qT c5qT, C38164GqV c38164GqV, C127935qM c127935qM) {
    }

    public void A0F(C5qT c5qT, InterfaceC127965qP interfaceC127965qP) {
    }

    @Override // X.InterfaceC43449JHn
    public void DKV(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC43449JHn
    public boolean DSM(MotionEvent motionEvent, View view, C5qT c5qT, C38321qM c38321qM) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.IHq, java.lang.Object] */
    public static C38206GrB A06(C5qT c5qT, C127915qK c127915qK, ExploreTopicCluster exploreTopicCluster, C38321qM c38321qM) {
        ?? obj = new Object();
        obj.A03 = c38321qM;
        obj.A02 = exploreTopicCluster;
        obj.A00 = c5qT;
        obj.A01 = c127915qK;
        return new C38206GrB(c5qT, c127915qK, exploreTopicCluster, c38321qM);
    }

    public static void A08(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, C38206GrB c38206GrB, String str, String str2) {
        interfaceC02590Ai.AAP("position", str);
        interfaceC02590Ai.AAP("m_pk", c38206GrB.A04);
        interfaceC02590Ai.A8R(interfaceC02530Ab, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        interfaceC02590Ai.AAP("topic_cluster_id", str2);
    }

    public static void A09(InterfaceC02590Ai interfaceC02590Ai, C38206GrB c38206GrB, String str, String str2, String str3) {
        interfaceC02590Ai.AAP("size", c38206GrB.A07);
        interfaceC02590Ai.A8R(c38206GrB.A00, "media_type");
        interfaceC02590Ai.AAP("topic_cluster_type", str);
        interfaceC02590Ai.AAP("topic_cluster_title", str2);
        interfaceC02590Ai.AAP("inventory_source", str3);
        interfaceC02590Ai.AAP("mezql_token", c38206GrB.A03);
        interfaceC02590Ai.AAP("algorithm", c38206GrB.A01);
        interfaceC02590Ai.AAP("connection_id", c38206GrB.A02);
        interfaceC02590Ai.AAP("topic_cluster_debug_info", c38206GrB.A08);
        interfaceC02590Ai.AAP("ranking_info_token", c38206GrB.A06);
        interfaceC02590Ai.AAk("product_ids", c38206GrB.A0D);
    }

    public static void A0A(InterfaceC02590Ai interfaceC02590Ai, Long l, String str, List list) {
        interfaceC02590Ai.AAk("merchant_ids", list);
        interfaceC02590Ai.AAP("playlist_id", str);
        interfaceC02590Ai.A9K("page_num", l);
    }

    public final void A0B() {
        Context context;
        String string;
        if ((this instanceof C38089GpI) && (context = ((C38089GpI) this).A00) != null && (string = context.getString(2131976159)) != null) {
            C146106i8 A0X = AbstractC31173DnH.A0X(string);
            A0X.A05();
            A0X.A0H = "follow_interest_failure";
            AbstractC25233BEq.A1F(A0X);
        }
    }

    public final void A0C() {
        if (this instanceof C38089GpI) {
            C38089GpI c38089GpI = (C38089GpI) this;
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putBoolean("IS_SIGN_UP_FLOW", false);
            C140966Yy A0r = AbstractC25225BEi.A0r(c38089GpI.A0G.A00.requireActivity(), c38089GpI.A0B);
            C3BH.A00().A01();
            C32269EJe c32269EJe = new C32269EJe();
            c32269EJe.setArguments(A0b);
            AbstractC31175DnJ.A0s(null, c32269EJe, A0r);
            C18920wW c18920wW = c38089GpI.A0A;
            C14360o3.A0B(c18920wW, 0);
            Integer num = C05F.A0C;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "explore_topic_switch");
            A0f.AAP("dest_topic_cluster_title", null);
            A0f.AAP("dest_topic_cluster_type", AbstractC31693Dvy.A00(num));
            A0f.Cht();
        }
    }

    public final void A0G(ExploreTopicCluster exploreTopicCluster) {
        Integer num;
        if (this instanceof C38089GpI) {
            C38089GpI c38089GpI = (C38089GpI) this;
            AbstractC77423dS.A00().A01.getValue();
            UserSession userSession = c38089GpI.A0B;
            ExploreFragmentConfig exploreFragmentConfig = new ExploreFragmentConfig(exploreTopicCluster, AbstractC38113Gpg.A00(userSession).A00, null, 0, 1, false, false);
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putParcelable(AbstractC111324zv.A00(630), exploreFragmentConfig);
            C38P c38p = new C38P();
            c38p.setArguments(A0b);
            AbstractC25229BEm.A18(c38p, AbstractC31175DnJ.A0C(c38089GpI.A0G.A00, userSession));
            if (exploreTopicCluster.A01 == EnumC127875qG.A07) {
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            C18920wW c18920wW = c38089GpI.A0A;
            String str = exploreTopicCluster.A09;
            AbstractC167007dF.A1G(c18920wW, 0, userSession.userId);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "explore_topic_switch");
            A0f.AAP("dest_topic_cluster_title", str);
            A0f.AAP("dest_topic_cluster_type", AbstractC31693Dvy.A00(num));
            A0f.Cht();
        }
    }

    public final void A0H(ExploreTopicCluster exploreTopicCluster, boolean z) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Context context;
        String A0f;
        Context context2;
        String string;
        if (this instanceof C38089GpI) {
            C38089GpI c38089GpI = (C38089GpI) this;
            Gt7 gt7 = c38089GpI.A0L;
            if (gt7 != null) {
                NidoExploreViewModel nidoExploreViewModel = (NidoExploreViewModel) gt7;
                if (nidoExploreViewModel.A02.add(exploreTopicCluster.A06)) {
                    ((C31690Dvv) nidoExploreViewModel.A03.getValue()).A03(exploreTopicCluster.A06);
                    if (z) {
                        num2 = C05F.A01;
                        num4 = C05F.A00;
                        num3 = num4;
                    } else {
                        num2 = C05F.A00;
                        num3 = num2;
                        num4 = C05F.A01;
                    }
                    boolean z2 = false;
                    if (num4 == num3) {
                        z2 = true;
                        num5 = C05F.A0Y;
                    } else {
                        num5 = num3;
                    }
                    NidoExploreViewModel.A01(exploreTopicCluster, nidoExploreViewModel, num5, num2);
                    if (!z2 && (context = c38089GpI.A00) != null && (A0f = AbstractC167007dF.A0f(context, exploreTopicCluster.A09, 2131968542)) != null && (context2 = c38089GpI.A00) != null && (string = context2.getString(2131968543)) != null) {
                        C146106i8 A0X = AbstractC31173DnH.A0X(A0f);
                        A0X.A0G = string;
                        A0X.A0A(new C42704Iuz(0, exploreTopicCluster, c38089GpI));
                        A0X.A0L = true;
                        A0X.A0M = true;
                        AbstractC25233BEq.A1F(A0X);
                    }
                    C17060sy.A01.A01(nidoExploreViewModel.A01).A03.EVO(true);
                    AbstractC23641Du.A03(num3, AnonymousClass191.A00, new C57169PZn(num2, exploreTopicCluster, c38089GpI, nidoExploreViewModel, null, 5), AbstractC141776au.A00(nidoExploreViewModel));
                }
            }
            C18920wW c18920wW = c38089GpI.A0A;
            UserSession userSession = c38089GpI.A0B;
            String str = exploreTopicCluster.A09;
            String str2 = exploreTopicCluster.A06;
            if (z) {
                num = C05F.A0N;
            } else {
                num = C05F.A01;
            }
            String str3 = userSession.userId;
            AbstractC167007dF.A1G(c18920wW, 0, str3);
            if (z) {
                C41678Id7.A00(userSession, str3, AbstractC31693Dvy.A00(num), str, str2);
            } else {
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c18920wW, "explore_topic_switch");
                A0f2.AAP("dest_topic_cluster_title", str);
                A0f2.AAP("dest_topic_cluster_type", AbstractC31693Dvy.A00(num));
                A0f2.Cht();
            }
            EnumC127875qG enumC127875qG = EnumC127875qG.A04;
            C14360o3.A0B(enumC127875qG, 0);
            exploreTopicCluster.A01 = enumC127875qG;
        }
    }

    public final void A0I(ExploreTopicCluster exploreTopicCluster, boolean z) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        if (this instanceof C38089GpI) {
            C38089GpI c38089GpI = (C38089GpI) this;
            Gt7 gt7 = c38089GpI.A0L;
            if (gt7 != null) {
                NidoExploreViewModel nidoExploreViewModel = (NidoExploreViewModel) gt7;
                ((C31690Dvv) nidoExploreViewModel.A03.getValue()).A03(exploreTopicCluster.A06);
                if (z) {
                    num2 = C05F.A01;
                    num3 = C05F.A0C;
                } else {
                    num2 = C05F.A00;
                    num3 = C05F.A0N;
                }
                if (num3 == C05F.A0C) {
                    num4 = C05F.A0N;
                } else {
                    num4 = C05F.A01;
                }
                NidoExploreViewModel.A01(exploreTopicCluster, nidoExploreViewModel, num4, num2);
                AbstractC166987dD.A1Z(new C57169PZn(num2, exploreTopicCluster, c38089GpI, nidoExploreViewModel, null, 6), AbstractC141776au.A00(nidoExploreViewModel));
            }
            C18920wW c18920wW = c38089GpI.A0A;
            UserSession userSession = c38089GpI.A0B;
            String str = exploreTopicCluster.A09;
            String str2 = exploreTopicCluster.A06;
            if (z) {
                num = C05F.A0Y;
            } else {
                num = C05F.A00;
            }
            String str3 = userSession.userId;
            AbstractC167007dF.A1G(c18920wW, 0, str3);
            if (z) {
                C41678Id7.A00(userSession, str3, AbstractC31693Dvy.A00(num), str, str2);
            } else {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "explore_topic_switch");
                A0f.AAP("dest_topic_cluster_title", str);
                A0f.AAP("dest_topic_cluster_type", AbstractC31693Dvy.A00(num));
                A0f.Cht();
            }
            EnumC127875qG enumC127875qG = EnumC127875qG.A07;
            C14360o3.A0B(enumC127875qG, 0);
            exploreTopicCluster.A01 = enumC127875qG;
        }
    }

    @Override // X.JPT
    public final /* synthetic */ boolean BWN() {
        if (this instanceof C38089GpI) {
            return ((C38144GqB) ((C38089GpI) this).A0H.A00.A0t.getValue()).A04();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.39D, java.lang.Object] */
    @Override // X.C37V
    public final C39D CHG() {
        if (this instanceof C38089GpI) {
            C38089GpI c38089GpI = (C38089GpI) this;
            C1M1 c1m1 = c38089GpI.A0O;
            C38P c38p = c38089GpI.A0G.A00;
            UserSession userSession = c38089GpI.A0B;
            View view = c38089GpI.A01;
            if (view != null) {
                JIG jig = c38089GpI.A0E;
                C3FQ c3fq = c38089GpI.A06;
                AnonymousClass309 anonymousClass309 = c38089GpI.A0K;
                return new C9IY(view, c38p, c38089GpI.A09, userSession, jig, anonymousClass309, new C39C(c38p, null, userSession, anonymousClass309, null, null, c1m1, C39B.A0A), c3fq, c1m1);
            }
            C14360o3.A0F("rootView");
            throw C00O.createAndThrow();
        }
        return new Object();
    }

    @Override // X.JPT
    public final /* synthetic */ void DLV(C38321qM c38321qM) {
        if (this instanceof C38089GpI) {
            C38P c38p = ((C38089GpI) this).A0H.A00;
            C38P.A01(c38p);
            ((C38144GqB) c38p.A0t.getValue()).A02(c38321qM);
        }
    }

    @Override // X.JPT
    public final /* synthetic */ void DLY(C38321qM c38321qM) {
        if (this instanceof C38089GpI) {
            C38089GpI c38089GpI = (C38089GpI) this;
            if (c38321qM != null) {
                C38144GqB c38144GqB = (C38144GqB) c38089GpI.A0H.A00.A0t.getValue();
                if (c38144GqB.A04()) {
                    c38321qM.getId();
                    c38144GqB.A09.remove(c38321qM);
                }
            }
        }
    }

    @Override // X.InterfaceC43449JHn
    public final /* synthetic */ void DRu(C38321qM c38321qM, Integer num, int i, int i2) {
        C38321qM A00;
        String id;
        Integer num2;
        Integer num3;
        if (this instanceof C38089GpI) {
            C38089GpI c38089GpI = (C38089GpI) this;
            C14360o3.A0B(c38321qM, 0);
            C38082GpB c38082GpB = c38089GpI.A0J;
            if (c38082GpB != null) {
                String moduleName = c38089GpI.A0K.getModuleName();
                C14360o3.A0B(moduleName, 0);
                if ("explore_popular".equals(moduleName) && (A00 = C38082GpB.A00(c38321qM)) != null && (id = A00.getId()) != null && !c38082GpB.A03.contains(id)) {
                    if (c38082GpB.A01 != null) {
                        C61712rY c61712rY = c38082GpB.A08;
                        String str = c38082GpB.A09;
                        if (c38082GpB.A06) {
                            num2 = C05F.A0N;
                        } else {
                            num2 = C05F.A00;
                        }
                        c61712rY.A01(null, num2, C05F.A02, str);
                        if (c38082GpB.A06) {
                            num3 = C05F.A0N;
                        } else {
                            num3 = C05F.A00;
                        }
                        c61712rY.A03(null, num3, str);
                    }
                    C61712rY c61712rY2 = c38082GpB.A08;
                    String str2 = c38082GpB.A09;
                    Integer num4 = C05F.A01;
                    c61712rY2.A01(A00, num4, C05F.A02, str2);
                    c61712rY2.A03(A00, num4, str2);
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                AbstractC38151GqI.A00(c38089GpI.A0B);
                if (AbstractC38151GqI.A01(intValue)) {
                    C006802i c006802i = C006802i.A0p;
                    c006802i.markerPoint(1011615852, intValue, "FIRST_ITEM_IN_RESPONSE_RENDER_FAILED");
                    C38155GqM.A00(c006802i, intValue, (short) 2);
                }
            }
        }
    }

    @Override // X.InterfaceC43449JHn
    public final /* synthetic */ void DRw(C38321qM c38321qM, Integer num, int i, int i2) {
        String id;
        Integer num2;
        if (this instanceof C38089GpI) {
            C38089GpI c38089GpI = (C38089GpI) this;
            C14360o3.A0B(c38321qM, 0);
            C38082GpB c38082GpB = c38089GpI.A0J;
            if (c38082GpB != null) {
                String moduleName = c38089GpI.A0K.getModuleName();
                C14360o3.A0B(moduleName, 0);
                if ("explore_popular".equals(moduleName)) {
                    C38321qM A00 = C38082GpB.A00(c38321qM);
                    Integer num3 = null;
                    if (A00 != null && (id = A00.getId()) != null) {
                        if (c38082GpB.A03.isEmpty()) {
                            C3FQ c3fq = c38082GpB.A00;
                            if (c3fq != null) {
                                num3 = Integer.valueOf(c3fq.AnZ());
                            }
                            c38082GpB.A01 = num3;
                        }
                        if (A00.Cff() && i == 0 && i2 == 2) {
                            c38082GpB.A02 = id;
                        } else if (!c38082GpB.A03.contains(id)) {
                            c38082GpB.A03.add(id);
                            Integer num4 = c38082GpB.A01;
                            int size = c38082GpB.A03.size();
                            if (num4 != null && num4.intValue() == size) {
                                C61712rY c61712rY = c38082GpB.A08;
                                String str = c38082GpB.A09;
                                if (c38082GpB.A06) {
                                    num2 = C05F.A0N;
                                } else {
                                    num2 = C05F.A00;
                                }
                                c61712rY.A02(null, num2, str);
                            }
                            if (c38082GpB.A04.remove(id) && c38082GpB.A04.isEmpty()) {
                                c38082GpB.A08.A02(null, C05F.A0C, c38082GpB.A09);
                            }
                            c38082GpB.A08.A02(A00, C05F.A01, c38082GpB.A09);
                        }
                    }
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                AbstractC38151GqI.A00(c38089GpI.A0B);
                String name = c38321qM.BRp().name();
                if (AbstractC38151GqI.A01(intValue)) {
                    C006802i c006802i = C006802i.A0p;
                    c006802i.markerPoint(1011615852, intValue, "FIRST_ITEM_IN_RESPONSE_RENDERED");
                    if (name != null) {
                        c006802i.markerAnnotate(1011615852, intValue, "FIRST_ITEM_IN_GRID_TYPE", name);
                    }
                    C38155GqM.A00(c006802i, intValue, (short) 2);
                }
            }
        }
    }
}
