package X;

import android.content.Context;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.androidlink.AndroidLinkImpl;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.41u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC905941u {
    public static final AndroidLink A00(Context context, UserSession userSession, C38321qM c38321qM, String str, boolean z) {
        C38321qM A1i;
        C14360o3.A0B(context, 2);
        if (c38321qM.A0C.Bx3() != null && str != null && (A1i = c38321qM.A1i(str)) != null) {
            return A01(context, userSession, A1i, A1i.A3p(), z);
        }
        return A01(context, userSession, c38321qM, c38321qM.A3p(), z);
    }

    public static final AndroidLink A01(Context context, UserSession userSession, C38321qM c38321qM, List list, boolean z) {
        Object androidLinkImpl;
        InterfaceC104824nn Au1;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(userSession, 3);
        AndroidLink A03 = A03(context, userSession, list, z);
        Object obj = null;
        if (A03 == null) {
            return null;
        }
        if (AbstractC75103Za.A0U(A03) && !AbstractC14490oL.A0G(context)) {
            InterfaceC39541sb injected = c38321qM.A0C.getInjected();
            if (injected != null && (Au1 = injected.Au1()) != null) {
                obj = EnumC39585Hdv.A01.get(Au1.B4K());
                if (obj == null) {
                    obj = EnumC39585Hdv.A0L;
                }
            }
            if (obj == EnumC39585Hdv.A07 && C18U.A06(C06090Tz.A05, userSession, 36322160465160223L)) {
                C18920wW A02 = AbstractC12220kQ.A02(userSession);
                C25531Mh c25531Mh = new C25531Mh(A02.A00(A02.A00, "wa_cta_softmatching_deprecation_fallback_used"), 415);
                if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                    c25531Mh.A0R("fallback_destination", "ig_click_to_direct");
                    c25531Mh.Cht();
                }
                C41177IKq AKl = A03.AKl();
                AKl.A0F = "";
                AKl.A07 = "com.instagram.android";
                Integer valueOf = Integer.valueOf(EnumC906041v.AD_DESTINATION_DIRECT_MESSAGE.A00);
                AKl.A06 = valueOf;
                Object obj2 = AKl.A0R;
                if (obj2 instanceof ImmutablePandoAndroidLink) {
                    TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
                    TreeJNI treeJNI = (TreeJNI) obj2;
                    androidLinkImpl = new TreeUpdaterJNI(AbstractC06930Yk.A06(new C09530e4("androidClass", AKl.A08), new C09530e4("appId", AKl.A09), new C09530e4("appInstallObjectiveInvalidationBehavior", AKl.A04), new C09530e4("appName", AKl.A0A), new C09530e4("callToActionTitle", AKl.A0B), new C09530e4("canvasData", AKl.A0C), new C09530e4("canvasDocId", AKl.A0D), new C09530e4("contentId", AKl.A0E), new C09530e4("deeplinkUri", ""), new C09530e4("destinationContext", AKl.A0G), new C09530e4("funnelId", AKl.A0H), new C09530e4("funnelPurpose", AKl.A05), new C09530e4("igUserId", AKl.A0I), new C09530e4("isAndroidAppLink", AKl.A00), new C09530e4("isSKOverlayEnabled", AKl.A01), new C09530e4("isUniversalLink", AKl.A02), new C09530e4("isVtOdirEligible", AKl.A03), new C09530e4("leadGenFormId", AKl.A0J), new C09530e4("linkType", valueOf), new C09530e4("package", "com.instagram.android"), new C09530e4("playableUri", AKl.A0K), new C09530e4("productPageId", AKl.A0L), new C09530e4("rawWebUri", AKl.A0M), new C09530e4("redirectUri", AKl.A0N), new C09530e4("referrerData", AKl.A0O), new C09530e4("tapAndHoldContext", AKl.A0P), new C09530e4("webUri", AKl.A0Q)), treeJNI).applyToTree(treeJNI);
                    C14360o3.A07(androidLinkImpl);
                } else {
                    String str = AKl.A08;
                    String str2 = AKl.A09;
                    androidLinkImpl = new AndroidLinkImpl(AKl.A00, AKl.A01, AKl.A02, AKl.A03, AKl.A04, AKl.A05, valueOf, str, str2, AKl.A0A, AKl.A0B, AKl.A0C, AKl.A0D, AKl.A0E, "", AKl.A0G, AKl.A0H, AKl.A0I, AKl.A0J, "com.instagram.android", AKl.A0K, AKl.A0L, AKl.A0M, AKl.A0N, AKl.A0O, AKl.A0P, AKl.A0Q);
                }
                return (AndroidLink) androidLinkImpl;
            }
        }
        return A03;
    }

    public static final AndroidLink A02(Context context, UserSession userSession, InterfaceC38371qR interfaceC38371qR, int i, boolean z) {
        List A3Y;
        List A04;
        ImmutableList A01;
        C38321qM c38321qM;
        C14360o3.A0B(context, 2);
        C14360o3.A0B(userSession, 3);
        if (interfaceC38371qR != null) {
            if (interfaceC38371qR instanceof C40971v4) {
                C40971v4 c40971v4 = (C40971v4) interfaceC38371qR;
                if (!c40971v4.A05()) {
                    interfaceC38371qR = null;
                }
                C40971v4 c40971v42 = (C40971v4) interfaceC38371qR;
                if (c40971v42 != null && (A01 = c40971v42.A01()) != null && (c38321qM = (C38321qM) AbstractC001800i.A0O(A01, i)) != null) {
                    A04 = c38321qM.A3Y();
                } else {
                    A04 = c40971v4.A04();
                }
                return A03(context, userSession, A04, z);
            }
            C38321qM BQN = interfaceC38371qR.BQN();
            if (BQN.CdW()) {
                if (BQN.A63()) {
                    A3Y = BQN.A3p();
                } else {
                    C38321qM A1e = BQN.A1e(i);
                    if (BQN.A5M() && A1e != null) {
                        A3Y = A1e.A3Y();
                    } else {
                        A3Y = BQN.A3Y();
                    }
                }
                return A01(context, userSession, BQN, A3Y, z);
            }
        }
        return null;
    }

    public static final AndroidLink A03(Context context, UserSession userSession, List list, boolean z) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 3);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AndroidLink androidLink = (AndroidLink) it.next();
                if (EnumC906041v.AD_DESTINATION_DEEPLINK == AbstractC114965Hm.A01(androidLink)) {
                    String CIt = androidLink.CIt();
                    if (!z && !AbstractC115215Is.A01(context, userSession, androidLink.Aw8(), CIt, C14360o3.A0K(androidLink.CPt(), true))) {
                    }
                }
                return androidLink;
            }
        }
        return null;
    }
}
