package X;

import android.content.Context;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.96p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2052496p {
    public static final C2052496p A01 = new Object();
    public static final long A00 = TimeUnit.MINUTES.toMillis(5);

    public static final void A00(Context context, UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 4);
        String A04 = C16030qx.A02.A04(context);
        if (A04 != null && A04.length() != 0) {
            if (str.length() > 0) {
                if (str2.length() > 0) {
                    C2JM c2jm = new C2JM();
                    C2JM c2jm2 = new C2JM();
                    c2jm.A04(AbstractC31187DnW.A02(0, 9, 125), A04);
                    c2jm.A04("qe_universe", str);
                    c2jm.A04("param_name", str2);
                    c2jm.A02("default_value", false);
                    C2JQ c2jq = PandoGraphQLRequest.Companion;
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGFXGrowthLogExposureDeviceIdQEBoolParamMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C213169cd.class, true, null, 0, null, "fx_growth_device_id_qe_bool_param_log_exposure", new ArrayList());
                    AbstractC40691uc.A01(userSession).ATV(C23365AXp.A00, AY7.A00, pandoGraphQLRequest);
                    return;
                }
                throw new IllegalStateException("paramName parameter can't be empty");
            }
            throw new IllegalStateException("qeUniverse parameter can't be empty");
        }
    }

    public static final void A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A06, userSession, 36310405139857457L)) {
            C1GJ.A03(new C2052696r(userSession));
        }
    }

    public static final void A02(UserSession userSession, AnonymousClass435 anonymousClass435) {
        String str;
        C2JS optionalTreeField;
        if (!userSession.hasEnded()) {
            Object obj = anonymousClass435.A01;
            if (obj == null) {
                C0K8.A0C("FxExperimentationHelper", "Error: null response");
                str = MSV.A00(165);
            } else {
                C2JS c2js = (C2JS) obj;
                if (c2js != null && (optionalTreeField = c2js.getOptionalTreeField(0, "fx_linked_accounts", C125445lq.class, -1226620548)) != null) {
                    InterfaceC19630xq A03 = C1AT.A01(userSession).A03(C1AV.A1U);
                    optionalTreeField.getCoercedBooleanField(0, "linked_account_has_fx");
                    InterfaceC19610xo ARD = A03.ARD();
                    ARD.E77(AnonymousClass001.A0R(userSession.userId, "_fx_experiment_linked_account_has_fx"), optionalTreeField.getCoercedBooleanField(0, "linked_account_has_fx"));
                    ARD.apply();
                    optionalTreeField.getCoercedBooleanField(1, "linked_account_has_fx_in_cl");
                    InterfaceC19610xo ARD2 = A03.ARD();
                    ARD2.E77(AnonymousClass001.A0R(userSession.userId, "_fx_experiment_linked_account_has_fx_in_cl"), optionalTreeField.getCoercedBooleanField(1, "linked_account_has_fx_in_cl"));
                    ARD2.apply();
                    optionalTreeField.getCoercedBooleanField(2, "cac_destination_migration_enabled");
                    InterfaceC19610xo ARD3 = A03.ARD();
                    ARD3.E77(AnonymousClass001.A0R(userSession.userId, "_fx_experiment_cac_dest_migration_enabled"), optionalTreeField.getCoercedBooleanField(2, "cac_destination_migration_enabled"));
                    ARD3.apply();
                    optionalTreeField.getCoercedBooleanField(3, "cac_creator_destination_migration_enabled");
                    InterfaceC19610xo ARD4 = A03.ARD();
                    ARD4.E77(AnonymousClass001.A0R(userSession.userId, "_fx_experiment_cac_creator_dest_migration_enabled"), optionalTreeField.getCoercedBooleanField(3, "cac_creator_destination_migration_enabled"));
                    ARD4.apply();
                    optionalTreeField.getCoercedBooleanField(4, "cac_destination_picker_enabled");
                    InterfaceC19610xo ARD5 = A03.ARD();
                    ARD5.E77(AnonymousClass001.A0R(userSession.userId, "_fx_experiment_cac_dest_picker_enabled"), optionalTreeField.getCoercedBooleanField(4, "cac_destination_picker_enabled"));
                    ARD5.apply();
                    optionalTreeField.getCoercedBooleanField(5, "should_delete_invalid_tokens_for_business_users");
                    InterfaceC19610xo ARD6 = A03.ARD();
                    ARD6.E77(AnonymousClass001.A0R(userSession.userId, "_fx_experiment_should_delete_invalid_tokens_for_business_users"), optionalTreeField.getCoercedBooleanField(5, "should_delete_invalid_tokens_for_business_users"));
                    ARD6.apply();
                    return;
                }
                C0K8.A0C("FxExperimentationHelper", "Error: getFxLinkedAccounts() returns null");
                str = "FxLinkedAccounts in IGFxLinkedAccountsQueryResponse is null";
            }
            C0w9.A03("FxExperimentationHelper", str);
        }
    }
}
