package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class VT6 {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, C19260xA c19260xA, UserSession userSession, Integer num, String str, String str2) {
        String str3;
        String str4;
        C14360o3.A0B(c19260xA, 2);
        AbstractC19330xH A00 = AbstractC11060iN.A00(userSession);
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                str3 = "related_hashtag_item_impression";
                break;
            case 1:
                str3 = "related_hashtag_item_tapped";
                break;
            case 2:
                str3 = "related_location_item_impression";
                break;
            default:
                str3 = "related_location_item_tapped";
                break;
        }
        C19280xC A002 = C19280xC.A00(interfaceC11380iw, str3);
        switch (intValue) {
            case 0:
            case 1:
                str4 = "hashtag";
                break;
            default:
                str4 = "location";
                break;
        }
        A002.A0C("entity_type", str4);
        A002.A0C(AbstractC111324zv.A00(2314), str);
        A002.A0C("entity_id", str2);
        A002.A04(c19260xA);
        A00.EHW(A002);
    }
}
