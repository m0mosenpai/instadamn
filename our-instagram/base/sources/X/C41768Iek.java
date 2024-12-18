package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Iek, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41768Iek {
    public static final C41768Iek A00 = new Object();

    public static final ProductSource A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        EnumC39617HeR A01 = A01(userSession);
        int ordinal = A01.ordinal();
        String str = null;
        if (ordinal != 1) {
            if (ordinal != 0) {
                throw B4Z.A00();
            }
        } else {
            String string = A02(userSession, A00).getString("shopping_brand_id", null);
            if (string == null) {
                return null;
            }
            str = string;
        }
        return new ProductSource(A01, str);
    }

    public static final EnumC39617HeR A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        String string = A02(userSession, A00).getString("last_selected_product_source_type", null);
        if (string != null) {
            return I3J.A00(string);
        }
        if (!AbstractC166997dE.A0Y(userSession).A1O() && !AbstractC166997dE.A0Y(userSession).A1N()) {
            return EnumC39617HeR.A04;
        }
        return EnumC39617HeR.A03;
    }

    public static final synchronized InterfaceC19630xq A02(UserSession userSession, C41768Iek c41768Iek) {
        InterfaceC19630xq A04;
        synchronized (c41768Iek) {
            A04 = C1AT.A01(userSession).A04(C1AV.A2u, C41768Iek.class);
        }
        return A04;
    }

    public static final IDH A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        InterfaceC19630xq A02 = A02(userSession, A00);
        IDH idh = null;
        String string = A02.getString("incentives_nux_metadata", null);
        if (string != null) {
            try {
                idh = I86.parseFromJson(C16V.A00(string));
                return idh;
            } catch (IOException unused) {
                C0w9.A03("ShoppingPreferences", "Could not parse json for incentive nux metadata");
            }
        }
        return idh;
    }

    public static final IDI A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        InterfaceC19630xq A02 = A02(userSession, A00);
        IDI idi = null;
        String string = A02.getString("incentives_offer_metadata", null);
        if (string != null) {
            try {
                idi = I87.parseFromJson(C16V.A00(string));
                return idi;
            } catch (IOException unused) {
                C0w9.A03("ShoppingPreferences", "Could not parse json for incentives offer metadata.");
            }
        }
        return idi;
    }

    public static final void A06(UserSession userSession, IDH idh) {
        C14360o3.A0B(userSession, 0);
        try {
            InterfaceC19610xo ARD = A02(userSession, A00).ARD();
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A0S = AbstractC167007dF.A0S(A0O);
            if (idh.A00 != null) {
                A0S.A0r("incentives_nux_last_seen_times");
                A0S.A0d();
                Iterator A14 = AbstractC166997dE.A14(idh.A00);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    if (!C16V.A04(A0S, A1K)) {
                        A0S.A0i(AbstractC166987dD.A0N(A1K.getValue()));
                    }
                }
                A0S.A0a();
            }
            ARD.E7K("incentives_nux_metadata", AbstractC167017dG.A0l(A0S, A0O));
            ARD.apply();
        } catch (IOException unused) {
            C0w9.A03("ShoppingPreferences", "Could not serialize json for incentives nux metadata");
        }
    }

    public static final void A07(UserSession userSession, IDI idi) {
        C14360o3.A0B(userSession, 0);
        try {
            InterfaceC19610xo ARD = A02(userSession, A00).ARD();
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A0S = AbstractC167007dF.A0S(A0O);
            if (idi.A00 != null) {
                A0S.A0r("incentives_offers_last_seen_times");
                A0S.A0d();
                Iterator A14 = AbstractC166997dE.A14(idi.A00);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    if (!C16V.A04(A0S, A1K)) {
                        A0S.A0i(AbstractC166987dD.A0N(A1K.getValue()));
                    }
                }
                A0S.A0a();
            }
            ARD.E7K("incentives_offer_metadata", AbstractC167017dG.A0l(A0S, A0O));
            ARD.apply();
        } catch (IOException unused) {
            C0w9.A03("ShoppingPreferences", "Could not serialize json for incentives offer metadata.");
        }
    }

    public static final void A05(UserSession userSession, long j) {
        InterfaceC19610xo ARD = A02(userSession, A00).ARD();
        ARD.E7G("ig_funded_incentive_pdp_banner_last_seen_time", j);
        ARD.apply();
    }
}
