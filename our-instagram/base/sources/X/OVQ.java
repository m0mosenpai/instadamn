package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class OVQ {
    public static final OVQ A00 = new Object();
    public static final C1GL A01 = C1GJ.A01();

    public final void A00(UserSession userSession, Integer num, Integer num2, String str, List list, List list2) {
        String str2;
        String str3;
        C1GL c1gl = A01;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A03();
        A0c.A0B("api/v1/upsells/async_respond_to_upsell/");
        switch (num.intValue()) {
            case 0:
                str2 = "block";
                break;
            case 1:
                str2 = "ccf";
                break;
            case 2:
                str2 = "suggested_hidden_words_upsell";
                break;
            case 3:
                str2 = "suggested_hidden_words_upsell_v2";
                break;
            case 4:
                str2 = "block_comments_from_upsell";
                break;
            default:
                str2 = "hrt_block_comments_from_upsell";
                break;
        }
        A0c.A9s("upsell_type", str2);
        if (num2.intValue() != 0) {
            str3 = "seen";
        } else {
            str3 = "adopted";
        }
        A0c.A9s(AbstractC58317Pt9.A00(29), str3);
        if (str != null) {
            A0c.A9s("upsell_style", str);
        }
        if (list2 != null) {
            A0c.A9s("suggested_hidden_words", AbstractC31175DnJ.A0b(list2));
        }
        if (list != null) {
            A0c.A9s("upselled_suggested_hidden_words", AbstractC31175DnJ.A0b(list));
        }
        c1gl.schedule(AbstractC31177DnL.A0Q(A0c));
    }
}
