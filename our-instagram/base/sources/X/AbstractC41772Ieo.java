package X;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import com.instagram.api.schemas.PrivacyDisclosureInfo;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.ProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Ieo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41772Ieo {
    public static AndroidLink A00;
    public static String A01;
    public static AndroidLink A02;
    public static String A03;
    public static boolean A04;
    public static boolean A05;
    public static final InterfaceC08100bW A06 = AbstractC31175DnJ.A0B();

    public static final void A04(C1NI c1ni, C38321qM c38321qM, AndroidLink androidLink, C37952Gmu c37952Gmu, String str) {
        AndroidLink androidLink2 = A00;
        if (androidLink2 != null) {
            if (!C14360o3.A0K(c38321qM.getId(), A01)) {
                A00 = null;
                A01 = null;
            }
            A06(c1ni, c38321qM, androidLink2, c37952Gmu, false, true);
            return;
        }
        androidLink2 = A02;
        if (androidLink2 != null) {
            if (C14360o3.A0K(c38321qM.getId(), A03)) {
                A04 = true;
                A06(c1ni, c38321qM, androidLink2, c37952Gmu, false, true);
                return;
            } else {
                A02 = null;
                A03 = null;
            }
        }
        String Aw8 = androidLink.Aw8();
        if (Aw8 != null) {
            String CIt = androidLink.CIt();
            A07(c1ni, c37952Gmu, I9H.A00(androidLink), Aw8);
            if (C14360o3.A0K(CIt, AbstractC111324zv.A00(826))) {
                C5M8.A01(c37952Gmu.A11, c38321qM.getId(), 766847856);
            }
            if (AbstractC002300n.A0h(Aw8, "instagram://extbrowser", false)) {
                C70104W4a.A00(c37952Gmu.A11).A02(c38321qM, c37952Gmu.A13.getModuleName());
            }
            UserSession userSession = c37952Gmu.A11;
            FragmentActivity fragmentActivity = c37952Gmu.A10;
            Context A0O = AbstractC166987dD.A0O(fragmentActivity);
            XNX xnx = XNX.PAGE_INSTAGRAM_STREAM;
            C14360o3.A0B(xnx, 5);
            if (!I0X.A00(fragmentActivity, A0O, xnx, userSession, c38321qM, null, null, null, null, null)) {
                AbstractC41776Ies.A06(fragmentActivity, userSession, EnumC906041v.AD_DESTINATION_DEEPLINK, null, Aw8, CIt, str);
            }
            C3KL.A00(userSession).A07("instagram_deeplink");
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A06(C1NI c1ni, C38321qM c38321qM, AndroidLink androidLink, C37952Gmu c37952Gmu, boolean z, boolean z2) {
        String str;
        C006802i c006802i;
        int i;
        String str2;
        InterfaceC09390do interfaceC09390do = c37952Gmu.A15;
        C92494Cg c92494Cg = (C92494Cg) interfaceC09390do.getValue();
        c92494Cg.A01(C43183J7g.A00);
        C006802i c006802i2 = c92494Cg.A00;
        if (c006802i2 != null) {
            c006802i2.markerPoint(1056313521, "open_web_link");
        }
        if (A09(c1ni, androidLink, c37952Gmu)) {
            C92494Cg c92494Cg2 = (C92494Cg) interfaceC09390do.getValue();
            c92494Cg2.A01(C43184J7h.A00);
            c006802i = c92494Cg2.A00;
            if (c006802i != null) {
                i = 1056313521;
                str2 = "open_web_link_in_app";
            } else {
                return;
            }
        } else {
            A05 = z;
            if (z2) {
                A02 = androidLink;
                str = c38321qM.getId();
            } else {
                str = null;
                A02 = null;
            }
            A03 = str;
            C92494Cg c92494Cg3 = (C92494Cg) interfaceC09390do.getValue();
            c92494Cg3.A01(C43185J7i.A00);
            C006802i c006802i3 = c92494Cg3.A00;
            if (c006802i3 != null) {
                c006802i3.markerPoint(1056313521, "open_web_link_in_browser");
            }
            C63397SjR A012 = A01(c38321qM, androidLink, c37952Gmu, false);
            Fragment fragment = c37952Gmu.A0z;
            IgFragmentActivity igFragmentActivity = (IgFragmentActivity) A012.A1H;
            if (igFragmentActivity != null) {
                igFragmentActivity.registerOnActivityResultListener(new C42275Inz(3, A012, igFragmentActivity));
            }
            C63397SjR.A02(fragment, A012, 1);
            C92494Cg c92494Cg4 = (C92494Cg) interfaceC09390do.getValue();
            c92494Cg4.A01(C43182J7f.A00);
            c006802i = c92494Cg4.A00;
            if (c006802i == null) {
                return;
            }
            i = 1056313521;
            str2 = "on_browser_launch";
        }
        c006802i.markerPoint(i, str2);
    }

    public static final void A07(C1NI c1ni, C37952Gmu c37952Gmu, String str, String str2) {
        C11520jB c11520jB;
        long j;
        String str3;
        User user;
        C14360o3.A0B(c1ni, 0);
        UserSession userSession = c37952Gmu.A11;
        FragmentActivity fragmentActivity = c37952Gmu.A10;
        C14360o3.A0B(fragmentActivity, 1);
        ((W4R) userSession.A01(W4R.class, new C29897DGl(24, fragmentActivity.getApplicationContext(), userSession))).A01(c1ni.BzL(userSession), Long.valueOf(AbstractC31177DnL.A06()));
        C2Fb c2Fb = C2Fb.A3N;
        C2Fb c2Fb2 = c37952Gmu.A14;
        if (c2Fb == c2Fb2) {
            C40971v4 c40971v4 = c37952Gmu.A0O;
            if (c40971v4 != null) {
                str3 = c40971v4.A0S;
            } else {
                str3 = null;
            }
            InterfaceC60442pS interfaceC60442pS = c37952Gmu.A13;
            String obj = c2Fb2.toString();
            C38321qM c38321qM = c37952Gmu.A0J;
            if (c38321qM != null) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_ad_shopping_sheet_action");
                ArrayList A3I = c38321qM.A3I();
                Long l = null;
                if (AbstractC83893oY.A00(A3I)) {
                    user = null;
                } else {
                    user = AbstractC38048Gob.A00((ProductTag) A3I.get(0)).A0B;
                }
                if (str3 == null) {
                    str3 = AbstractC41071vF.A07(userSession, c38321qM);
                }
                if (user != null && str3 != null) {
                    User A2E = c38321qM.A2E(userSession);
                    A2E.getClass();
                    A0f.A9K("a_pk", AbstractC25228BEl.A13(A2E.getId()));
                    AbstractC37301Gc2.A0z(A0f, Long.parseLong(str3));
                    A0f.AAP("follow_status", A2E.B7L().toString());
                    A0f.A7v("is_influencer", null);
                    AbstractC37303Gc4.A0f(A0f, c38321qM);
                    String A002 = AbstractC76433bn.A00(user);
                    A002.getClass();
                    AbstractC37301Gc2.A17(A0f, A002);
                    A0f.AAP("source_of_action", obj);
                    AbstractC31171DnF.A1C(A0f, str);
                    A0f.AAP("from", obj);
                    AbstractC37300Gc1.A0o(A0f, c38321qM.CAR());
                    A0f.AAP("url", str2);
                    AbstractC37301Gc2.A1B(A0f, AbstractC25229BEm.A1a(user.A03.BSX(), MerchantCheckoutStyle.A06));
                    ArrayList A3S = c38321qM.A3S(true);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    if (!AbstractC83893oY.A00(A3S)) {
                        Iterator it = A3S.iterator();
                        while (it.hasNext()) {
                            AbstractC31177DnL.A1R(AbstractC37300Gc1.A0L(it).A0H, A1E);
                        }
                    }
                    A0f.AAk("product_ids", A1E);
                    ArrayList A3S2 = c38321qM.A3S(true);
                    HashMap A1G = AbstractC166987dD.A1G();
                    if (!AbstractC83893oY.A00(A3S2)) {
                        Iterator it2 = A3S2.iterator();
                        while (it2.hasNext()) {
                            Product A0L = AbstractC37300Gc1.A0L(it2);
                            String A0T = AbstractC37300Gc1.A0T(A0L);
                            A0T.getClass();
                            Long A13 = AbstractC25228BEl.A13(A0T);
                            List list = (List) A1G.get(A13);
                            if (list != null) {
                                list.add(AbstractC25228BEl.A13(A0L.A0H));
                            } else {
                                ArrayList A1E2 = AbstractC166987dD.A1E();
                                AbstractC31177DnL.A1R(A0L.A0H, A1E2);
                                A1G.put(A13, A1E2);
                            }
                        }
                    }
                    A0f.A9M("product_merchant_ids", A1G);
                    ArrayList A3M = c38321qM.A3M();
                    ArrayList A1E3 = AbstractC166987dD.A1E();
                    if (!AbstractC83893oY.A00(A3M)) {
                        Iterator it3 = A3M.iterator();
                        while (it3.hasNext()) {
                            A1E3.add(C4SX.A00(((com.instagram.tagging.model.Tag) it3.next()).getId()));
                        }
                    }
                    A0f.AAk("tagged_user_ids", A1E3);
                    A0f.AAP("inventory_source", AbstractC37300Gc1.A0S(c38321qM));
                    if (c38321qM.A0C.Bed() != null) {
                        l = AbstractC25228BEl.A13(c38321qM.A0C.Bed());
                    }
                    A0f.A9K("m_ix", l);
                    A0f.A9K("m_ts", Long.valueOf(c38321qM.A1B()));
                    A0f.A9K("media_owner_id", AbstractC25228BEl.A13(A2E.getId()));
                    A0f.A7v(AbstractC111324zv.A00(2616), AbstractC31173DnH.A0e(A0f, "feed_request_id", c38321qM.A0R, false));
                    ArrayList A3S3 = c38321qM.A3S(true);
                    ArrayList A1E4 = AbstractC166987dD.A1E();
                    if (!AbstractC83893oY.A00(A3S3)) {
                        Iterator it4 = A3S3.iterator();
                        while (it4.hasNext()) {
                            Product A0L2 = AbstractC37300Gc1.A0L(it4);
                            if (A0L2.A01.A0F != null) {
                                AbstractC31177DnL.A1R(A0L2.A0H, A1E4);
                            }
                        }
                    }
                    A0f.AAk("drops_product_ids", A1E4);
                    A0f.Cht();
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        if (!c37952Gmu.A0p) {
            InterfaceC60442pS interfaceC60442pS2 = c37952Gmu.A13;
            String obj2 = c2Fb2.toString();
            String str4 = c37952Gmu.A0g;
            Integer valueOf = Integer.valueOf(c37952Gmu.A09);
            C5H9 c5h9 = c37952Gmu.A12;
            int i = c37952Gmu.A0B;
            Integer num = c37952Gmu.A0Y;
            IntentAwareAdsInfoIntf intentAwareAdsInfoIntf = c37952Gmu.A0H;
            String str5 = c37952Gmu.A0i;
            String str6 = c37952Gmu.A0f;
            Float valueOf2 = Float.valueOf(c37952Gmu.A06);
            Float valueOf3 = Float.valueOf(c37952Gmu.A07);
            InterfaceC104784ni interfaceC104784ni = c37952Gmu.A0F;
            String id = c1ni.getId();
            if (id != null) {
                C09530e4 c09530e4 = AbstractC37674GiB.A00;
                C11520jB c11520jB2 = null;
                if (c09530e4 != null && id.equals(c09530e4.A00) && (c11520jB = (C11520jB) c09530e4.A01) != null) {
                    C09530e4 c09530e42 = AbstractC37674GiB.A01;
                    if (c09530e42 != null && id.equals(c09530e42.A00)) {
                        j = AbstractC166987dD.A0N(c09530e42.A01);
                    } else {
                        j = 0;
                    }
                    c11520jB.A04(C5I8.A73, Long.valueOf(SystemClock.elapsedRealtime() - j));
                    c11520jB2 = c11520jB;
                }
                C32U.A04(interfaceC104784ni, intentAwareAdsInfoIntf, c11520jB2, c37952Gmu.A0I, userSession, c5h9, c1ni, interfaceC60442pS2, Boolean.valueOf(c37952Gmu.A0m), Boolean.valueOf(c37952Gmu.A0l), valueOf2, valueOf3, Float.valueOf(c37952Gmu.A05), Float.valueOf(c37952Gmu.A04), Float.valueOf(c37952Gmu.A01), Float.valueOf(c37952Gmu.A00), valueOf, num, c37952Gmu.A0X, obj2, str, str2, str4, str5, str6, c37952Gmu.A0d, c37952Gmu.A0c, i);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public static final void A08(AndroidLink androidLink, C37952Gmu c37952Gmu, C3DN c3dn, String str, String str2) {
        OnFeedMessagesIntf BUJ;
        String str3;
        EnumC906041v enumC906041v;
        C145726hV c145726hV;
        if (str == null) {
            C0w9 c0w9 = C0w9.A01;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Entry point is null due to unmatched UrlSource: ");
            c0w9.EmN("openDirectReplayFailed", AbstractC166997dE.A0v(c37952Gmu.A14, A1C));
            C9GR.A0F(c37952Gmu.A10, AbstractC58317Pt9.A00(327), 2131969213);
            return;
        }
        UserSession userSession = c37952Gmu.A11;
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(userSession));
        A0w.E77("has_seen_direct_reply_bottom_sheet", true);
        A0w.apply();
        C34725FRo A062 = C28531Zo.A04.A02.A06(c37952Gmu.A13, userSession, str);
        Bundle bundle = A062.A01;
        bundle.putString(AbstractC111324zv.A00(149), null);
        bundle.putString(AbstractC111324zv.A00(297), str2);
        Reel reel = c37952Gmu.A0M;
        if (reel != null) {
            String str4 = c37952Gmu.A0h;
            if (str4 != null) {
                A062.A04(str4);
                A062.A03(reel.getId());
                A062.A06(userSession.userId);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            C38321qM c38321qM = c37952Gmu.A0J;
            if (c38321qM != null) {
                A062.A02(c38321qM.getId());
                C38321qM c38321qM2 = c37952Gmu.A0J;
                C14360o3.A0B(c38321qM2, 1);
                IGCTMessagingAdsInfoDictIntf A002 = AbstractC41071vF.A00(userSession, c38321qM2);
                if (A002 != null && (BUJ = A002.BUJ()) != null && AbstractC76663cE.A02(BUJ)) {
                    PrivacyDisclosureInfo Bgc = A002.Bgc();
                    if (Bgc != null) {
                        str3 = Bgc.Bgf();
                    } else {
                        str3 = null;
                    }
                    bundle.putString(AbstractC111324zv.A00(883), str3);
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        if (androidLink != null) {
            enumC906041v = AbstractC114965Hm.A01(androidLink);
        } else {
            enumC906041v = null;
        }
        if (enumC906041v == EnumC906041v.AD_DESTINATION_DIRECT_MESSAGE) {
            bundle.putString(AbstractC111324zv.A00(617), "_ctd");
        }
        c3dn.A0K(A062.A00());
        if (reel == null || (c145726hV = c37952Gmu.A0W) == null) {
            return;
        }
        c145726hV.A01();
    }

    public static final boolean A0A(C1NI c1ni, AndroidLink androidLink, C37952Gmu c37952Gmu, String str) {
        A07(c1ni, c37952Gmu, str, androidLink.Aw8());
        UserSession userSession = c37952Gmu.A11;
        FragmentActivity fragmentActivity = c37952Gmu.A10;
        String Aw8 = androidLink.Aw8();
        if (Aw8 != null) {
            C14360o3.A0B(fragmentActivity, 1);
            return C35221FgE.A02(C35221FgE.A00(userSession, Aw8, MediaStreamTrack.VIDEO_TRACK_KIND, false), fragmentActivity, userSession, null, true);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final XNX A00(C37952Gmu c37952Gmu) {
        AnonymousClass341 anonymousClass341;
        AnonymousClass341 anonymousClass3412;
        C75113Zb c75113Zb = c37952Gmu.A0K;
        AnonymousClass341 anonymousClass3413 = null;
        if (c75113Zb != null) {
            anonymousClass341 = c75113Zb.A0o;
        } else {
            anonymousClass341 = null;
        }
        if (anonymousClass341 != AnonymousClass341.A0A) {
            if (c75113Zb != null) {
                anonymousClass3412 = c75113Zb.A0o;
            } else {
                anonymousClass3412 = null;
            }
            if (anonymousClass3412 != AnonymousClass341.A0B) {
                if (c75113Zb != null) {
                    anonymousClass3413 = c75113Zb.A0o;
                }
                if (anonymousClass3413 == AnonymousClass341.A07) {
                    return XNX.PAGE_INSTAGRAM_REELS_TAB;
                }
                if (c37952Gmu.A0M != null) {
                    return XNX.PAGE_INSTAGRAM_STORY;
                }
                return XNX.PAGE_INSTAGRAM_STREAM;
            }
        }
        return XNX.PAGE_INSTAGRAM_EXPLORE_CONTEXTUAL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if (r2 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0379, code lost:
    
        if (r2 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x049f, code lost:
    
        if (r2 != 1) goto L196;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04d6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C63397SjR A01(X.C38321qM r64, com.instagram.model.androidlink.AndroidLink r65, X.C37952Gmu r66, boolean r67) {
        /*
            Method dump skipped, instructions count: 1592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41772Ieo.A01(X.1qM, com.instagram.model.androidlink.AndroidLink, X.Gmu, boolean):X.SjR");
    }

    public static final String A02(C37952Gmu c37952Gmu) {
        String str = c37952Gmu.A0e;
        if (str == null) {
            Reel reel = c37952Gmu.A0M;
            if (reel == null) {
                return null;
            }
            List A0O = reel.A0O(c37952Gmu.A11);
            C14360o3.A07(A0O);
            if (!AbstractC166987dD.A1b(A0O)) {
                return null;
            }
            return ((C41181vS) A0O.get(AbstractC25226BEj.A05(A0O))).A0I;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b9, code lost:
    
        if (r0 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (r4.length() != 0) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01af  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, X.RqJ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.JJ5 r18, X.C1NI r19, X.C38321qM r20, com.instagram.model.androidlink.AndroidLink r21, com.instagram.model.androidlink.AndroidLink r22, X.C37952Gmu r23) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41772Ieo.A03(X.JJ5, X.1NI, X.1qM, com.instagram.model.androidlink.AndroidLink, com.instagram.model.androidlink.AndroidLink, X.Gmu):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C1NI r22, X.C38321qM r23, com.instagram.model.androidlink.AndroidLink r24, X.C37952Gmu r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC41772Ieo.A05(X.1NI, X.1qM, com.instagram.model.androidlink.AndroidLink, X.Gmu, boolean):void");
    }

    public static final boolean A09(C1NI c1ni, AndroidLink androidLink, C37952Gmu c37952Gmu) {
        String CHN = androidLink.CHN();
        if (CHN != null) {
            String str = c37952Gmu.A0a;
            if (str == null) {
                str = I9H.A00(androidLink);
            }
            A07(c1ni, c37952Gmu, str, CHN);
            return AbstractC41776Ies.A0C(c37952Gmu.A10, c37952Gmu.A11, CHN, c37952Gmu.A13.getModuleName());
        }
        throw AbstractC166987dD.A14("webUri must be non-null");
    }
}
