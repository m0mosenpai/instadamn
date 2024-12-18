package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.api.schemas.AchievementIntf;
import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.ChallengeButtonInfo;
import com.instagram.api.schemas.ChallengeDetails;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.mediatype.ProductType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.ChA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28458ChA {
    public static final C28458ChA A00 = new Object();

    public static final LinkedHashMap A00(List list, List list2, List list3) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        LinkedHashMap linkedHashMap = null;
        if (list != null || list2 != null || list3 != null) {
            linkedHashMap = AbstractC166987dD.A1I();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AchievementIntf achievementIntf = (AchievementIntf) it.next();
                    linkedHashMap.put(achievementIntf.BW3().toString(), AbstractC167007dF.A0n("is_earned", Boolean.valueOf(AbstractC167007dF.A1W(achievementIntf.C8L()))).toString());
                }
            }
            String A002 = AbstractC111324zv.A00(5125);
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    Challenge challenge = (Challenge) it2.next();
                    String obj = challenge.A05.toString();
                    String str6 = challenge.A09;
                    if (str6 == null) {
                        str6 = "";
                    }
                    C09530e4 A1L = AbstractC166987dD.A1L(AbstractC111324zv.A00(794), str6);
                    C09530e4 A1L2 = AbstractC166987dD.A1L(ReactProgressBarViewManager.PROP_PROGRESS, String.valueOf(challenge.A00));
                    C09530e4 A1L3 = AbstractC166987dD.A1L("total", String.valueOf(challenge.A01));
                    Integer num = challenge.A07;
                    if (num == null || (str3 = num.toString()) == null) {
                        str3 = "";
                    }
                    C09530e4 A1L4 = AbstractC166987dD.A1L(AbstractC111324zv.A00(1073), str3);
                    C09530e4 A1L5 = AbstractC166987dD.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, challenge.A06.A00);
                    String str7 = challenge.A08;
                    if (str7 == null) {
                        str7 = "";
                    }
                    C09530e4 A1L6 = AbstractC166987dD.A1L(A002, str7);
                    ChallengeButtonInfo challengeButtonInfo = challenge.A03;
                    if (challengeButtonInfo == null || (str4 = challengeButtonInfo.Aj7()) == null) {
                        str4 = "";
                    }
                    C09530e4 A1L7 = AbstractC166987dD.A1L("progress_description_button_text", str4);
                    if (challengeButtonInfo == null || (str5 = challengeButtonInfo.Aw9()) == null) {
                        str5 = "";
                    }
                    linkedHashMap.put(obj, AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, AbstractC166987dD.A1L("progress_description_button_deeplink_url", str5)).toString());
                }
            }
            if (list3 != null) {
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    ChallengeDetails challengeDetails = (ChallengeDetails) it3.next();
                    String obj2 = challengeDetails.A05.toString();
                    C09530e4 A1L8 = AbstractC166987dD.A1L(DialogModule.KEY_TITLE, challengeDetails.A0E);
                    C09530e4 A1L9 = AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, obj2);
                    String str8 = challengeDetails.A0D;
                    if (str8 == null) {
                        str8 = "";
                    }
                    C09530e4 A1L10 = AbstractC166987dD.A1L("subtitle", str8);
                    C09530e4 A1L11 = AbstractC166987dD.A1L(ReactProgressBarViewManager.PROP_PROGRESS, String.valueOf(challengeDetails.A00));
                    C09530e4 A1L12 = AbstractC166987dD.A1L("total", String.valueOf(challengeDetails.A01));
                    C09530e4 A1L13 = AbstractC166987dD.A1L(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, challengeDetails.A06.A00);
                    String str9 = challengeDetails.A08;
                    if (str9 == null) {
                        str9 = "";
                    }
                    C09530e4 A1L14 = AbstractC166987dD.A1L(DevServerEntity.COLUMN_DESCRIPTION, str9);
                    String str10 = challengeDetails.A0C;
                    if (str10 == null) {
                        str10 = "";
                    }
                    C09530e4 A1L15 = AbstractC166987dD.A1L(A002, str10);
                    ChallengeButtonInfo challengeButtonInfo2 = challengeDetails.A03;
                    if (challengeButtonInfo2 == null || (str = challengeButtonInfo2.Aj7()) == null) {
                        str = "";
                    }
                    C09530e4 A1L16 = AbstractC166987dD.A1L("progress_description_button_text", str);
                    if (challengeButtonInfo2 == null || (str2 = challengeButtonInfo2.Aw9()) == null) {
                        str2 = "";
                    }
                    linkedHashMap.put(obj2, AbstractC06930Yk.A06(A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, AbstractC166987dD.A1L("progress_description_button_deeplink_url", str2)).toString());
                }
            }
        }
        return linkedHashMap;
    }

    public final void A03(UserSession userSession, ProductType productType, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, Map map, Map map2) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A07 = AbstractC25234BEr.A07(userSession);
        if (A07.isSampled()) {
            A07.AAP("event", "reliability_client");
            A02(A07, productType, str, str2, str3);
            A07.A9K("media_igid", AbstractC25233BEq.A0n(str4));
            A07.AAk("achievement_ids", A01(list));
            A07.AAk("achievement_names", null);
            A07.AAk("challenge_ids", list2);
            if (list3 == null) {
                list3 = null;
            }
            A07.AAk("challenge_names", list3);
            if (map == null) {
                map = null;
            }
            A07.A9M("additional_achievements_data", map);
            A07.AAP("error_message", str5);
            A07.A9M("extra_data", map2);
            A07.Cht();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Ai] */
    public final void A04(UserSession userSession, ProductType productType, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, List list5, List list6, Map map) {
        ArrayList arrayList;
        C14360o3.A0B(userSession, 0);
        ?? A07 = AbstractC25234BEr.A07(userSession);
        if (A07.isSampled()) {
            A07.AAP("event", "impression");
            A02(A07, productType, str, str2, str3);
            A07.A9K("media_igid", AbstractC25233BEq.A0n(str4));
            A07.AAk("achievement_ids", A01(list));
            if (list2 != null) {
                arrayList = AbstractC167017dG.A0q(list2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AchievementIntf) it.next()).BW3().toString());
                }
            } else {
                arrayList = null;
            }
            A07.AAk("achievement_names", arrayList);
            A07.AAk("challenge_ids", list3);
            if (list5 == 0) {
                if (list4 != null) {
                    list5 = AbstractC167017dG.A0q(list4);
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        list5.add(((Challenge) it2.next()).A05.toString());
                    }
                } else {
                    list5 = 0;
                }
            }
            A07.AAk("challenge_names", list5);
            A07.A9M("additional_achievements_data", A00(list2, list4, list6));
            A07.A9M("extra_data", map);
            A07.Cht();
        }
    }

    public final void A06(UserSession userSession, String str, String str2) {
        A04(userSession, null, str, null, str2, null, null, null, null, null, null, null, null);
    }

    public final void A07(UserSession userSession, String str, String str2, String str3, String str4, String str5, List list) {
        A03(userSession, null, str, str2, str3, str4, str5, list, null, null, null, null);
    }

    public final void A08(UserSession userSession, String str, String str2, String str3, String str4, List list, List list2, List list3, Map map) {
        A05(userSession, null, str, str2, str3, str4, list, list2, list3, null, null, null, map);
    }

    public static final List A01(List list) {
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Long A0j = AbstractC166997dE.A0j(AbstractC167027dH.A0Q(it.next()));
                if (A0j != null) {
                    A1E.add(A0j);
                }
            }
            return A1E;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.InterfaceC02590Ai r5, com.instagram.model.mediatype.ProductType r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "screen"
            r5.AAP(r0, r7)
            java.lang.String r0 = "target"
            r5.AAP(r0, r8)
            java.lang.String r0 = "entry_point"
            r5.AAP(r0, r9)
            r0 = -1
            if (r6 == 0) goto L3f
            int r3 = r6.ordinal()
            r4 = 3
            r2 = 16
            r1 = 1
            if (r3 == r0) goto L3f
            r0 = 13
            if (r3 == r0) goto L3c
            if (r3 == r1) goto L3a
            if (r3 == r2) goto L37
            r0 = 9
            if (r3 == r0) goto L29
            r4 = 0
        L29:
            java.lang.String r1 = "product_type"
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L42
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r5.A8p(r1, r0)
            return
        L37:
            r4 = 9
            goto L29
        L3a:
            r4 = 2
            goto L29
        L3c:
            r4 = 16
            goto L29
        L3f:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L29
        L42:
            r0 = 0
            r5.AAP(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28458ChA.A02(X.0Ai, com.instagram.model.mediatype.ProductType, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Ai] */
    public final void A05(UserSession userSession, ProductType productType, String str, String str2, String str3, String str4, List list, List list2, List list3, List list4, List list5, Map map, Map map2) {
        ArrayList arrayList;
        Map map3 = map;
        C14360o3.A0B(userSession, 0);
        ?? A07 = AbstractC25234BEr.A07(userSession);
        if (A07.isSampled()) {
            A07.AAP("event", "click");
            A02(A07, productType, str, str2, str3);
            A07.A9K("media_igid", AbstractC25233BEq.A0n(str4));
            A07.AAk("achievement_ids", A01(list));
            if (list2 != null) {
                arrayList = AbstractC167017dG.A0q(list2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AchievementIntf) it.next()).BW3().toString());
                }
            } else {
                arrayList = null;
            }
            A07.AAk("achievement_names", arrayList);
            A07.AAk("challenge_ids", list3);
            if (list4 == 0) {
                if (list5 != null) {
                    list4 = AbstractC167017dG.A0q(list5);
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        list4.add(((Challenge) it2.next()).A05.toString());
                    }
                } else {
                    list4 = 0;
                }
            }
            A07.AAk("challenge_names", list4);
            if (map == null) {
                map3 = A00(list2, list5, null);
            }
            A07.A9M("additional_achievements_data", map3);
            A07.A9M("extra_data", map2);
            A07.Cht();
        }
    }
}
