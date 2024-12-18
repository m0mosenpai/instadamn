package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.OdY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55170OdY {
    public List A00;
    public Map A01;
    public final UserSession A02;
    public final InterfaceC19630xq A03;

    public static final void A00(C55170OdY c55170OdY) {
        List A0m;
        if (c55170OdY.A00 == null) {
            InterfaceC19630xq interfaceC19630xq = c55170OdY.A03;
            String string = interfaceC19630xq.getString("browser_link_history_optin_nux_exposure_list", null);
            if (string != null && (A0m = AbstractC167007dF.A0m(string, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0)) != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = A0m.iterator();
                while (it.hasNext()) {
                    Long A0j = AbstractC25231BEo.A0j(0, AbstractC166987dD.A1B(it));
                    if (A0j != null) {
                        A1E.add(A0j);
                    }
                }
                ArrayList A1E2 = AbstractC166987dD.A1E();
                for (Object obj : A1E) {
                    if (AbstractC166987dD.A0N(obj) > 0) {
                        A1E2.add(obj);
                    }
                }
                c55170OdY.A00 = AbstractC001800i.A0U(A1E2);
                return;
            }
            int A01 = AbstractC31172DnG.A01(interfaceC19630xq, "browser_link_history_optin_nux_count");
            ArrayList A17 = AbstractC25225BEi.A17(A01);
            for (int i = 0; i < A01; i++) {
                AbstractC166997dE.A1X(A17, AbstractC31175DnJ.A03(interfaceC19630xq, "browser_link_history_optin_nux_last_seen"));
            }
            ArrayList A1E3 = AbstractC166987dD.A1E();
            Iterator it2 = A17.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (AbstractC166987dD.A0N(next) > 0) {
                    A1E3.add(next);
                }
            }
            c55170OdY.A00 = AbstractC001800i.A0U(A1E3);
            A02(c55170OdY);
        }
    }

    public static final void A01(C55170OdY c55170OdY) {
        LinkedHashMap A1I;
        if (c55170OdY.A01 == null) {
            String string = c55170OdY.A03.getString("browser_link_history_opt_in_nux_landing_domain_history_for_delivery_targeting", null);
            if (string == null) {
                A1I = AbstractC166987dD.A1I();
            } else {
                try {
                    A1I = AbstractC06930Yk.A03((Map) AbstractC73763Sg.A03.A00(string, new C3RL(C3RJ.A00, C3RD.A01)));
                } catch (IllegalArgumentException e) {
                    C0K8.A0K("LinkHistoryLocalStorage", "Failed to decode landing domain history", e);
                    A1I = AbstractC166987dD.A1I();
                }
            }
            c55170OdY.A01 = A1I;
        }
    }

    public static final void A02(C55170OdY c55170OdY) {
        String str;
        InterfaceC19610xo ARD = c55170OdY.A03.ARD();
        List list = c55170OdY.A00;
        if (list != null) {
            str = AbstractC31175DnJ.A0a(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list);
        } else {
            str = null;
        }
        ARD.E7K("browser_link_history_optin_nux_exposure_list", str);
        ARD.apply();
    }

    public static final void A03(C55170OdY c55170OdY) {
        if (c55170OdY.A01 != null) {
            InterfaceC19610xo ARD = c55170OdY.A03.ARD();
            ARD.E7K("browser_link_history_opt_in_nux_landing_domain_history_for_delivery_targeting", AbstractC73763Sg.A03.A02(c55170OdY.A01, AbstractC192698gB.A00(new C3RL(C3RJ.A00, C3RD.A01))));
            ARD.commit();
        }
    }

    public final Boolean A04() {
        int i;
        InterfaceC19630xq interfaceC19630xq = this.A03;
        if (!interfaceC19630xq.contains("browser_link_history_opt_in_key") || (i = interfaceC19630xq.getInt("browser_link_history_opt_in_key", -1)) == -1) {
            return null;
        }
        return Boolean.valueOf(AbstractC167007dF.A1M(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0xo] */
    public final void A05(Boolean bool) {
        ?? r1;
        ?? ARD = this.A03.ARD();
        if (bool != null) {
            r1 = bool.booleanValue();
        } else {
            r1 = -1;
        }
        ARD.E7D("browser_link_history_opt_in_key", r1);
        ARD.apply();
    }

    public C55170OdY(UserSession userSession) {
        this.A02 = userSession;
        this.A03 = C1AT.A01(userSession).A03(C1AV.A1p);
    }
}
