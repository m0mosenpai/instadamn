package X;

import android.content.Context;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class FVR {
    public static C1ON A00(Context context, C25621Ms c25621Ms, AbstractC12990ll abstractC12990ll, Integer num, Integer num2, String str) {
        Integer num3 = C05F.A01;
        c25621Ms.A09(num3);
        c25621Ms.A0S(ED6.class, FVQ.class);
        if (num2 == num3) {
            c25621Ms.A0B("consent/existing_user_flow/");
        } else if (num2 == C05F.A00) {
            c25621Ms.A0B("consent/new_user_flow/");
            c25621Ms.A9s(AbstractC31187DnW.A02(0, 9, 125), C16030qx.A00(context));
            C16030qx c16030qx = C16030qx.A02;
            context.getClass();
            AbstractC31175DnJ.A0k(context, c25621Ms, c16030qx);
            AbstractC31176DnK.A1O(C19T.A1h, c25621Ms, AbstractC31172DnG.A0P(abstractC12990ll));
            c25621Ms.A9s("gdpr_s", str);
        }
        if (num != null) {
            c25621Ms.A9s("current_screen_key", AbstractC34227F7z.A00(num));
        }
        return AbstractC31176DnK.A0P(c25621Ms);
    }

    public static String A01(List list, List list2) {
        String str;
        if (list.size() != list2.size()) {
            return "";
        }
        JSONObject A0q = AbstractC31171DnF.A0q();
        for (int i = 0; i < list.size(); i++) {
            FRA fra = (FRA) list.get(i);
            EnumC33394EpR enumC33394EpR = (EnumC33394EpR) list2.get(i);
            if (fra != null && (str = fra.A00) != null) {
                try {
                    A0q.put(str, Integer.toString(enumC33394EpR.A00));
                } catch (JSONException e) {
                    C0w9.A03("Failed to append consent update param", AbstractC13670mt.A06("{ 'error' : '%s' }", e.getMessage()));
                }
            }
        }
        return A0q.toString();
    }
}
