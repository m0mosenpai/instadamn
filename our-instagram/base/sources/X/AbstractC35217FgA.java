package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.FgA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35217FgA {
    public static void A02(CollectionPrivacyModeEnum collectionPrivacyModeEnum, InterfaceC11380iw interfaceC11380iw, C1P1 c1p1, UserSession userSession, String str, String str2, String str3) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0L("collections/%s/edit/", str);
        AbstractC31176DnK.A1P(A0M, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
        A0M.A0H("cover_media_id", str3);
        if (collectionPrivacyModeEnum != null) {
            A0M.A9s("privacy_mode", collectionPrivacyModeEnum.A00);
        }
        C1ON A0U = AbstractC31172DnG.A0U(A0M, true);
        A0U.A00 = new C32532EUi(c1p1, interfaceC11380iw, userSession, collectionPrivacyModeEnum, str2, str, str3, 1);
        C1GJ.A03(A0U);
    }

    public static C25621Ms A00(CollectionPrivacyModeEnum collectionPrivacyModeEnum, UserSession userSession, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("collections/create/");
        A0M.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        A0M.A9s("module_name", str2);
        A0M.A0S(SavedCollection.class, C70139W6r.class);
        if (str3 != null) {
            A0M.A9s("added_media_fbids", AbstractC13590ml.A00(AbstractC31174DnI.A0z(str3)));
        }
        if (list != null) {
            A0M.A9s("added_media_ids", AbstractC13590ml.A00(list));
        }
        if (str4 != null && list != null && list.contains(str4)) {
            A0M.A9s("cover_media_id", str4);
        }
        if (bool2.booleanValue()) {
            A0M.A9s(AbstractC111324zv.A00(1095), "CLIPS_PLAYLIST");
        }
        if (collectionPrivacyModeEnum != null) {
            A0M.A9s("privacy_mode", collectionPrivacyModeEnum.A00);
        }
        A0M.A0H("surface", str5);
        A0M.A0F("with_search_text", bool);
        A0M.A0H(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str6);
        A0M.A0R = true;
        return A0M;
    }

    public static C1ON A01(UserSession userSession, String str, List list, Map map) {
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0B("collections/list/");
        A0N.A0S(C32205EDe.class, FXH.class);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1E.add(((EnumC33416Epn) it.next()).A01);
        }
        A0N.A9s("collection_types", AbstractC13590ml.A00(A1E));
        AbstractC2044893h.A06(A0N, str);
        if (map != null) {
            Iterator A15 = AbstractC166997dE.A15(map);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                A0N.A9s(AbstractC31172DnG.A17(A1K), (String) A1K.getValue());
            }
        }
        return A0N.A0N();
    }

    public static void A03(CollectionPrivacyModeEnum collectionPrivacyModeEnum, C1P1 c1p1, UserSession userSession, String str, String str2, String str3, List list, boolean z) {
        C25621Ms A00 = A00(collectionPrivacyModeEnum, userSession, null, Boolean.valueOf(z), str, str2, null, str3, null, null, list);
        A00.A0B("collections/create/");
        C1ON A0N = A00.A0N();
        C31456Ds0.A00(A0N, c1p1, userSession, 44);
        C1GJ.A03(A0N);
    }

    public static void A04(C1P1 c1p1, UserSession userSession, String str) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0L("collections/%s/delete/", str);
        A0M.A0S(C40781ul.class, C55702hA.class);
        C1ON A0U = AbstractC31172DnG.A0U(A0M, true);
        A0U.A00 = new C32531EUh(c1p1, userSession, str, 16);
        C1GJ.A03(A0U);
    }
}
