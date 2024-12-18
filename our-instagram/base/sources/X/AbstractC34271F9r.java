package X;

import android.content.Context;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.F9r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34271F9r {
    public static final C1ON A00(Context context, AbstractC12990ll abstractC12990ll, EnumC33445EqI enumC33445EqI, Integer num, Integer num2, Collection collection, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        String str;
        String str2;
        if (z5) {
            z6 = AbstractC167007dF.A1X(enumC33445EqI, EnumC33445EqI.A07);
        } else {
            z6 = true;
            boolean z7 = abstractC12990ll instanceof UserSession;
            InterfaceC02900Bo A00 = C0BQ.A00(abstractC12990ll);
            if (!z7 ? A00.BOZ() <= 0 : A00.BOd().size() <= 1) {
                z6 = false;
            }
        }
        C25621Ms A0c = AbstractC167017dG.A0c(abstractC12990ll);
        A0c.A0B("dynamic_onboarding/get_steps/");
        ((AbstractC23721Ec) A0c).A06 = EnumC23341Bw.API;
        A0c.A0I("is_ci", z);
        A0c.A0I("fb_connected", z2);
        AbstractC31175DnJ.A0k(context, A0c, C16030qx.A02);
        A0c.A9s("android_id", C16030qx.A00(context));
        A0c.A9s(MSV.A00(111), AbstractC15820qc.A0C(AbstractC15820qc.A05(AbstractC15820qc.A01(context))));
        A0c.A0I("fb_installed", z3);
        A0c.A0I("tos_accepted", z4);
        switch (num.intValue()) {
            case 0:
                str = "prefetch";
                break;
            case 1:
                str = "start";
                break;
            default:
                str = "finish";
                break;
        }
        AbstractC31178DnM.A1K(A0c, "progress_state", str);
        A0c.A0I(AbstractC58317Pt9.A00(301), z6);
        A0c.A9s(AbstractC111324zv.A00(545), String.valueOf(C23831Eq.A00()));
        AbstractC31176DnK.A1O(C19T.A1c, A0c, AbstractC31172DnG.A0P(abstractC12990ll));
        JSONArray A0p = AbstractC31171DnF.A0p();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C34713FQy c34713FQy = (C34713FQy) it.next();
            JSONObject A0q = AbstractC31171DnF.A0q();
            try {
                str2 = c34713FQy.A01;
            } catch (JSONException unused) {
            }
            if (str2 != null) {
                A0q.put("step_name", str2).put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, c34713FQy.A00);
                A0p.put(A0q);
            } else {
                C14360o3.A0F("stepName");
                throw C00O.createAndThrow();
            }
        }
        A0c.A0H("seen_steps", A0p.toString());
        A0c.A0H("locale", C1Q2.A02().toString());
        String str3 = null;
        if (EnumC33445EqI.A07 != enumC33445EqI) {
            if (enumC33445EqI != null) {
                str3 = enumC33445EqI.A00;
            }
        } else if (num2 != null) {
            str3 = num2 == C05F.A0C ? "account_linking" : num2 == C05F.A00 ? "email" : "phone";
        }
        A0c.A0H("reg_flow_taken", str3);
        return AbstractC31175DnJ.A0D(A0c, ECY.class, FWQ.class, true);
    }
}
