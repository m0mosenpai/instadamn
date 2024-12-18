package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.modal.ModalActivity;
import com.instagram.save.analytics.SaveToCollectionsParentInsightsHost;
import com.instagram.save.model.SavedCollection;
import java.util.BitSet;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.1XH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XH {
    public static C1XH A00;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.WpW, java.lang.Object] */
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        new BitSet(0);
        String str4 = "";
        if (str == null) {
            str = "";
        }
        hashMap.put("shopping_session_id", str);
        hashMap.put("prior_module", str2);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("collection_id", str3);
        if (!C18U.A06(C06090Tz.A06, userSession, 36314133171276258L)) {
            str4 = new SMA(fragmentActivity).A00();
        }
        hashMap.put("risk_features", str4);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A02 = new Object();
        C66277U6x A02 = C66277U6x.A02("com.bloks.www.buyer.reconsideration.wishlist", AbstractC191768eY.A01(hashMap), hashMap2);
        A02.A00 = 760101916;
        A02.A05 = null;
        A02.A01 = 0L;
        A02.A06 = null;
        A02.A03 = null;
        A02.A02 = null;
        A02.A04 = null;
        A02.A08(hashMap3);
        A02.A04(fragmentActivity, igBloksScreenConfig);
    }

    public final void A02(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection) {
        C14360o3.A0B(userSession, 1);
        int ordinal = savedCollection.A07.ordinal();
        if (ordinal != 1) {
            if (ordinal != 4) {
                if (ordinal != 5) {
                    FB6.A00();
                    EM6 A002 = FXL.A00(EnumC39551HdN.A06, savedCollection, null, userSession.token, interfaceC11380iw.getModuleName());
                    C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
                    c140966Yy.A08();
                    c140966Yy.A0B(null, A002);
                    c140966Yy.A0C = "DELETE_COLLECTION_BACK_STACK_NAME";
                    c140966Yy.A0A = "DELETE_COLLECTION_BACK_STACK_NAME";
                    c140966Yy.A04();
                    return;
                }
                MediaMapPin mediaMapPin = savedCollection.A03;
                if (mediaMapPin == null || mediaMapPin.A0A == null || mediaMapPin.A0B == null) {
                    return;
                }
                String obj = UUID.randomUUID().toString();
                W6l.A01(null, fragmentActivity, userSession, MapEntryPoint.A0F, VEZ.A07, obj, userSession.userId, fragmentActivity.getResources().getString(2131972803), null, new double[]{mediaMapPin.A0A.doubleValue(), mediaMapPin.A0B.doubleValue()});
                return;
            }
            A05(fragmentActivity, userSession);
            return;
        }
        A00(fragmentActivity, userSession, null, interfaceC11380iw.getModuleName(), savedCollection.A0F);
    }

    public final void A03(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        FB6.A00();
        EM6 A01 = FXL.A01(EnumC39551HdN.A07, EnumC33416Epn.A0A, userSession.token, str, interfaceC11380iw.getModuleName());
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A08();
        c140966Yy.A0D(A01);
        c140966Yy.A04();
    }

    public final void A04(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(fragmentActivity, 0);
        C14360o3.A0B(userSession, 1);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        FB6.A00();
        c140966Yy.A0B(null, FB5.A00(userSession, null, false, false, false));
        c140966Yy.A04();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (X.C18U.A06(r3, r13, 36329698132836852L) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(androidx.fragment.app.FragmentActivity r12, com.instagram.common.session.UserSession r13, X.C38321qM r14, X.InterfaceC60442pS r15, X.C75113Zb r16, X.InterfaceC86363t8 r17, int r18, boolean r19) {
        /*
            r11 = this;
            r4 = 1
            r0 = 2
            X.C14360o3.A0B(r13, r0)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = r13.token
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r2.putString(r0, r1)
            X.0sy r0 = X.C08730cb.A00(r13)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = r0.A1l()
            if (r0 != 0) goto L4e
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36321142558172328(0x8109e3000424a8, double:3.0329750350655837E-306)
            boolean r0 = X.C18U.A06(r3, r13, r0)
            if (r0 != 0) goto L42
            r0 = 36323960056852196(0x810c7300062ee4, double:3.034756832575889E-306)
            boolean r0 = X.C18U.A06(r3, r13, r0)
            if (r0 != 0) goto L42
            r0 = 36323960056590048(0x810c7300022ee0, double:3.034756832410105E-306)
            boolean r0 = X.C18U.A06(r3, r13, r0)
            if (r0 == 0) goto L4e
        L42:
            r0 = 36329698132836852(0x8111ab000141f4, double:3.0383856149339626E-306)
            boolean r0 = X.C18U.A06(r3, r13, r0)
            r1 = 1
            if (r0 == 0) goto L4f
        L4e:
            r1 = 0
        L4f:
            java.lang.String r0 = "DirectSaveToCollectionFragment_show_pinned_save_row"
            r2.putBoolean(r0, r4)
            java.lang.String r0 = "DirectSaveToCollectionFragment_show_my_favs_upsell"
            r2.putBoolean(r0, r1)
            r0 = r16
            int r1 = r0.A03
            java.lang.String r0 = "DirectSaveToCollectionFragment_carousel_index"
            r2.putInt(r0, r1)
            java.lang.String r0 = "DirectSaveToCollectionFragment_position"
            r1 = r18
            r2.putInt(r0, r1)
            java.lang.String r9 = r15.getModuleName()
            java.lang.Integer r8 = X.C05F.A01
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r5 = new com.instagram.direct.messagethread.collections.model.DirectCollectionArguments
            r6 = r12
            r7 = r14
            r10 = r19
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.String r0 = "direct_collection_arguments"
            r2.putParcelable(r0, r5)
            X.EMG r3 = new X.EMG
            r3.<init>()
            r3.setArguments(r2)
            X.FPt r0 = new X.FPt
            r0.<init>(r12, r13, r3)
            r3.A07 = r0
            X.8aO r2 = new X.8aO
            r2.<init>(r13)
            r2.A0T = r3
            r2.A1G = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.A0a = r0
            X.FOp r0 = X.EMG.A0P
            float r1 = r0.A00(r12, r4)
            int r0 = X.AbstractC13880nE.A09(r12)
            float r0 = (float) r0
            float r1 = r1 / r0
            r2.A03 = r1
            r0 = r17
            r2.A0X = r0
            X.8aR r0 = r2.A00()
            r0.A02(r12, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1XH.A06(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, X.1qM, X.2pS, X.3Zb, X.3t8, int, boolean):void");
    }

    public final void A07(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str2, 3);
        A00(fragmentActivity, userSession, str, str2, null);
    }

    public final void A01(Activity activity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC86363t8 interfaceC86363t8, C1M1 c1m1, String str, String str2, int i) {
        C11520jB c11520jB;
        String str3;
        WFV wfv = new WFV(activity, userSession, interfaceC60442pS, c1m1);
        UserSession userSession2 = wfv.A01;
        C36295Fzp A002 = FBA.A00(userSession2);
        if ((!A002.A07() || !WFV.A03(A002)) && AbstractC35184Ffb.A01(userSession2)) {
            C189448aO c189448aO = new C189448aO(userSession2);
            Activity activity2 = wfv.A00;
            c189448aO.A0d = activity2.getString(2131972775);
            c189448aO.A0X = interfaceC86363t8;
            C189478aR A003 = c189448aO.A00();
            FB6.A00();
            C1M1 c1m12 = wfv.A03;
            String str4 = userSession2.token;
            InterfaceC60442pS interfaceC60442pS2 = wfv.A02;
            String moduleName = interfaceC60442pS2.getModuleName();
            boolean isSponsoredEligible = interfaceC60442pS2.isSponsoredEligible();
            boolean isOrganicEligible = interfaceC60442pS2.isOrganicEligible();
            if (interfaceC60442pS2 instanceof AnonymousClass309) {
                c11520jB = ((AnonymousClass309) interfaceC60442pS2).E6Q(c38321qM);
            } else {
                c11520jB = null;
            }
            SaveToCollectionsParentInsightsHost saveToCollectionsParentInsightsHost = new SaveToCollectionsParentInsightsHost(c11520jB, moduleName, isSponsoredEligible, isOrganicEligible);
            C14360o3.A0B(str4, 4);
            C67901V1p c67901V1p = new C67901V1p();
            Bundle bundle = new Bundle();
            bundle.putSerializable("SaveToCollectionFragment.ARGS_SELECTION_MODE", VCX.SAVE_TO);
            bundle.putString("SaveToCollectionFragment.ARGS_MEDIA_ID", c38321qM.getId());
            bundle.putInt("SaveToCollectionFragment.ARGS_CAROUSEL_INDEX", c75113Zb.A03);
            bundle.putInt("SaveToCollectionFragment.ARGS_POSITION", i);
            bundle.putString("SaveToCollectionFragment.ARGS_COLLECTION_ID_VIEWING", str);
            if (c1m12 != null) {
                str3 = c1m12.getSessionId();
            } else {
                str3 = null;
            }
            bundle.putString("SaveToCollectionFragment.ARGS_SESSION_ID", str3);
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str4);
            bundle.putString("SaveToCollectionFragment.ARGS_NAVIGATION_TYPE", str2);
            bundle.putParcelable("SaveToCollectionFragment.ARGS_PARENT_MODULE", saveToCollectionsParentInsightsHost);
            c67901V1p.setArguments(bundle);
            c67901V1p.A06 = new C71005WmM(c38321qM, c75113Zb, A003, wfv, str2, i);
            A003.A02(activity2, c67901V1p);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession2.token);
        bundle2.putInt("DirectNewCollectionFragment_creation_entry_point_ordinal", 0);
        Activity activity3 = wfv.A00;
        bundle2.putParcelable("direct_collection_arguments", new DirectCollectionArguments(activity3, c38321qM, C05F.A01, wfv.A02.getModuleName(), c38321qM.CcN()));
        C6XJ c6xj = new C6XJ(activity3, bundle2, userSession2, ModalActivity.class, "direct_new_collection");
        c6xj.A07();
        c6xj.A0A(activity3, 1000);
    }

    public final void A05(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        FB6.A00();
        Bundle bundle = new Bundle();
        AbstractC60492pY.A04(bundle, userSession);
        bundle.putString("prior_module", "saved_collections_list");
        bundle.putString("source_media_tap_token", null);
        HCH hch = new HCH();
        hch.setArguments(bundle);
        c140966Yy.A0D(hch);
        c140966Yy.A0C = "DELETE_COLLECTION_BACK_STACK_NAME";
        c140966Yy.A0A = "DELETE_COLLECTION_BACK_STACK_NAME";
        c140966Yy.A08();
        c140966Yy.A04();
    }
}
