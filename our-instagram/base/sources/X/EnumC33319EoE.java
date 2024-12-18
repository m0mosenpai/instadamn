package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EoE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC33319EoE {
    public static final /* synthetic */ EnumC33319EoE[] A00;
    public static final EnumC33319EoE A01;
    public static final EnumC33319EoE A02;

    static {
        EnumC33319EoE enumC33319EoE = new EnumC33319EoE() { // from class: X.EgR
        };
        A02 = enumC33319EoE;
        EgS egS = new EgS();
        A01 = egS;
        A00 = new EnumC33319EoE[]{enumC33319EoE, egS};
    }

    public static EnumC33319EoE[] values() {
        return (EnumC33319EoE[]) A00.clone();
    }

    public final void A00(Context context, AbstractC018607g abstractC018607g, C1P1 c1p1, AbstractC12990ll abstractC12990ll, String str, String str2, String str3, List list, Map map, java.util.Set set, boolean z) {
        boolean z2 = this instanceof EgS;
        C25621Ms A0M = AbstractC31173DnH.A0M(abstractC12990ll);
        if (z2) {
            A0M.A0B("users/check_email/");
            A0M.A9s("email", str);
            A0M.A9s("qe_id", AbstractC31174DnI.A0s());
            AbstractC31178DnM.A1K(A0M, "android_device_id", str2);
            A0M.A0S(EDG.class, FW8.class);
            if (set != null) {
                A0M.A9s("login_nonces", AbstractC31175DnJ.A0b(set));
                JSONObject A0q = AbstractC31171DnF.A0q();
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    A0q.put(AbstractC31172DnG.A17(A1K), A1K.getValue());
                }
                A0M.A9s("login_nonce_map", A0q.toString());
                if (z) {
                    A0M.A9s("prefill_shown", "False");
                    if (list != null && !list.isEmpty()) {
                        JSONArray A0p = AbstractC31171DnF.A0p();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AbstractC31172DnG.A1W(it, A0p);
                        }
                        AbstractC31176DnK.A1R(A0M, A0p);
                    }
                    if (str3 != null) {
                        A0M.A9s("big_blue_token", str3);
                    }
                    AbstractC31175DnJ.A1F(C19T.A1r, A0M, AbstractC31172DnG.A0P(abstractC12990ll));
                }
            }
            C1ON A0P = AbstractC31176DnK.A0P(A0M);
            A0P.A00 = c1p1;
            C1GJ.A00(context, abstractC018607g, A0P);
            return;
        }
        AbstractC31173DnH.A1O(A0M, str2);
        A0M.A9s("guid", AbstractC31174DnI.A0s());
        A0M.A0B("accounts/check_phone_number/");
        A0M.A9s(AbstractC31189DnY.A00(), str);
        AbstractC31175DnJ.A1F(C19T.A1r, A0M, AbstractC31172DnG.A0P(abstractC12990ll));
        A0M.A0S(C32164EBl.class, FWB.class);
        if (set != null) {
            A0M.A9s("login_nonces", AbstractC31175DnJ.A0b(set));
        }
        JSONObject A0q2 = AbstractC31171DnF.A0q();
        Iterator A152 = AbstractC166997dE.A15(map);
        while (A152.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
            A0q2.put(AbstractC31172DnG.A17(A1K2), A1K2.getValue());
        }
        A0M.A9s("login_nonce_map", A0q2.toString());
        if (z) {
            A0M.A9s("prefill_shown", "False");
            if (list != null && !list.isEmpty()) {
                JSONArray A0p2 = AbstractC31171DnF.A0p();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AbstractC31172DnG.A1W(it2, A0p2);
                }
                AbstractC31176DnK.A1R(A0M, A0p2);
            }
            if (str3 != null) {
                A0M.A9s("big_blue_token", str3);
            }
        }
        C1ON A0P2 = AbstractC31176DnK.A0P(A0M);
        A0P2.A00 = c1p1;
        C1GJ.A00(context, abstractC018607g, A0P2);
    }

    public EnumC33319EoE(String str, int i) {
    }
}
