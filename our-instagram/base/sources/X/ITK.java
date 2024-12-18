package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public abstract class ITK {
    public static final C1ON A00(ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType, UserSession userSession) {
        String str;
        boolean A1b = AbstractC25233BEq.A1b(userSession, instagramMidcardType, clipsMidCardSubtype);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/mid_cards/");
        A0c.A0D("start_position", 0);
        A0c.A0D("end_position", A1b ? 1 : 0);
        A0c.A9s("ads_position", new JSONArray().toString());
        A0c.A0H("moment_ids", new JSONArray().toString());
        A0c.A9s("mid_card_type", instagramMidcardType.A00);
        if (clipsMidCardSubtype != ClipsMidCardSubtype.A0v) {
            String str2 = clipsMidCardSubtype.A00;
            if (str2 != null && AbstractC002300n.A0h(str2, "acr", false) == A1b) {
                str = "acr_mid_card_sub_type";
            } else {
                str = "mid_card_subtype";
            }
            A0c.A0H(str, str2);
        }
        return AbstractC25227BEk.A0e(A0c, C37845Gkz.class, C37844Gky.class);
    }

    public static final C1ON A01(C38663Gz4 c38663Gz4, UserSession userSession) {
        C25621Ms A0c;
        String A0b;
        String str;
        List list;
        AbstractC167017dG.A1N(userSession, c38663Gz4);
        C26136BhN c26136BhN = c38663Gz4.A06;
        if (c26136BhN != null) {
            String str2 = c26136BhN.A09;
            A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("clips/write_mid_card_seen_state_v2/");
            A0c.A9s("impression_token", str2);
            AbstractC31173DnH.A1N(A0c);
        } else {
            InstagramMidcardType instagramMidcardType = c38663Gz4.A05;
            ArrayList arrayList = null;
            A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("clips/write_mid_card_seen_state/");
            A0c.A9s("mid_card_type", instagramMidcardType.A00);
            int ordinal = instagramMidcardType.ordinal();
            String str3 = "";
            if (ordinal != 33) {
                if (ordinal != 12) {
                    if (ordinal != 28 && ordinal == 37) {
                        A0c.A9s("impressions", AbstractC31175DnJ.A0b(C16930sl.A00));
                        C38786H6b c38786H6b = c38663Gz4.A08;
                        if (c38786H6b != null && (list = c38786H6b.A01) != null) {
                            arrayList = AbstractC167017dG.A0q(list);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String A2u = ((C111034zF) it.next()).A00.A2u();
                                if (A2u != null) {
                                    arrayList.add(A2u);
                                } else {
                                    throw AbstractC166997dE.A0g();
                                }
                            }
                        }
                        A0c.A9s("template_mid_card_impressions", AbstractC31175DnJ.A0b(arrayList));
                        ClipsMidCardSubtype clipsMidCardSubtype = c38663Gz4.A04;
                        if (clipsMidCardSubtype != ClipsMidCardSubtype.A0v) {
                            A0c.A9s("template_mid_card_category", clipsMidCardSubtype.A00);
                        }
                    } else {
                        A0c.A9s("impressions", AbstractC31175DnJ.A0b(AbstractC166987dD.A1J(c38663Gz4.A0D)));
                    }
                    AbstractC31173DnH.A1N(A0c);
                } else {
                    String str4 = c38663Gz4.A0C;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    List A1J = AbstractC166987dD.A1J(str3);
                    A0c.A9s("impressions", AbstractC31175DnJ.A0b(A1J));
                    A0b = AbstractC31175DnJ.A0b(A1J);
                    str = "feed_collection_mid_card_impressions";
                }
            } else {
                A0c.A9s("impressions", AbstractC31175DnJ.A0b(C16930sl.A00));
                String str5 = c38663Gz4.A0C;
                if (str5 != null) {
                    str3 = str5;
                }
                A0b = AbstractC31175DnJ.A0b(AbstractC166987dD.A1J(str3));
                str = "story_midcard_impressions";
            }
            A0c.A9s(str, A0b);
            ClipsMidCardSubtype clipsMidCardSubtype2 = c38663Gz4.A04;
            if (clipsMidCardSubtype2 != ClipsMidCardSubtype.A0v) {
                A0c.A9s("acr_mid_card_sub_type", clipsMidCardSubtype2.A00);
            }
            AbstractC31173DnH.A1N(A0c);
        }
        return A0c.A0N();
    }
}
