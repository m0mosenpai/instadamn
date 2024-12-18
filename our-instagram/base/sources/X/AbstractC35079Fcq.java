package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.Fcq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35079Fcq {
    public static C1ON A02(AbstractC12990ll abstractC12990ll, String str, String str2, String str3, boolean z) {
        String str4;
        C25621Ms A0M = AbstractC31173DnH.A0M(abstractC12990ll);
        A0M.A0B("fb/show_continue_as/");
        AbstractC31173DnH.A1O(A0M, str);
        A0M.A9s("phone_id", str2);
        A0M.A9s("screen", "landing");
        if (z) {
            str4 = "big_blue_token";
        } else {
            str4 = "fb_access_token";
        }
        A0M.A9s(str4, str3);
        return AbstractC31178DnM.A0I(A0M, ED7.class, FWD.class);
    }

    public static C1ON A00(Context context, AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        C25621Ms A0M = AbstractC31173DnH.A0M(abstractC12990ll);
        A0M.A0B("accounts/send_signup_sms_code/");
        A0M.A9s(AbstractC31189DnY.A00(), str);
        AbstractC31173DnH.A1O(A0M, str2);
        AbstractC31178DnM.A1K(A0M, "guid", str3);
        AbstractC31175DnJ.A1F(C19T.A1r, A0M, AbstractC31172DnG.A0P(abstractC12990ll));
        A0M.A0S(EgM.class, FWE.class);
        if (LHp.A00(context)) {
            A0M.A9s("android_build_type", ((EnumC12900lc) EnumC12900lc.A02.getValue()).name().toLowerCase());
        }
        if (AbstractC31174DnI.A06(abstractC12990ll) > 0) {
            A0M.A0N = true;
        }
        return AbstractC31176DnK.A0P(A0M);
    }

    public static C1ON A01(Context context, AbstractC12990ll abstractC12990ll, String str, String str2, String str3, List list) {
        C25621Ms A0M = AbstractC31173DnH.A0M(abstractC12990ll);
        A0M.A0B("accounts/send_verify_email/");
        AbstractC31178DnM.A0n(context, A0M, AbstractC31189DnY.A02(), C16030qx.A00(context));
        A0M.A9s("email", str);
        AbstractC31178DnM.A1K(A0M, "auto_confirm_only", "false");
        A0M.A0H("big_blue_token", str2);
        A0M.A0H("phone_id", str3);
        if (!AbstractC83893oY.A00(list)) {
            JSONArray A0p = AbstractC31171DnF.A0p();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC31172DnG.A1W(it, A0p);
            }
            AbstractC31176DnK.A1R(A0M, A0p);
        }
        if (AbstractC31174DnI.A06(abstractC12990ll) > 0) {
            A0M.A0N = true;
        }
        return AbstractC31178DnM.A0I(A0M, C32163EBk.class, FW9.class);
    }
}
