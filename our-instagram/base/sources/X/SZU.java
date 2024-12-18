package X;

import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall;
import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes10.dex */
public abstract class SZU {
    public final R7U A00;

    public static void A00(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall, SZU szu) {
        String str = instantExperiencesJSBridgeCall.A03;
        R7U r7u = szu.A00;
        String url = r7u.getUrl();
        if (!AbstractC116315Ok.A00(str) && !AbstractC116315Ok.A00(url)) {
            android.net.Uri parse = android.net.Uri.parse(str);
            android.net.Uri parse2 = android.net.Uri.parse(url);
            if (parse != null && parse2 != null && !AbstractC116315Ok.A00(parse.getScheme()) && parse.getScheme().equals(parse2.getScheme()) && parse.getPort() == parse2.getPort() && !AbstractC116315Ok.A00(parse.getAuthority()) && parse.getAuthority().equals(parse2.getAuthority())) {
                InstantExperiencesCallResult instantExperiencesCallResult = instantExperiencesJSBridgeCall.A00;
                if (!AbstractC116315Ok.A00(instantExperiencesCallResult.A01)) {
                    if (!AbstractC116315Ok.A00(instantExperiencesCallResult.A00)) {
                        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s", instantExperiencesCallResult.A03.toArray());
                        String str2 = instantExperiencesCallResult.A01;
                        boolean A1Z = AbstractC25229BEm.A1Z(instantExperiencesCallResult.A02);
                        String str3 = instantExperiencesCallResult.A00;
                        AbstractC167017dG.A1Q(str2, str3);
                        String A00 = new SMR(str2, str3, formatStrLocaleSafe, null, A1Z).A00();
                        if (!AbstractC116315Ok.A00(A00)) {
                            r7u.A00(A00);
                            return;
                        }
                        throw AbstractC166987dD.A18("Could not construct JS callback string");
                    }
                    throw AbstractC166987dD.A18("Invalid state: Missing callback id");
                }
                throw AbstractC166987dD.A18("Invalid state: Missing or invalid callback handler name");
            }
        }
    }

    public void A01(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        if (instantExperiencesJSBridgeCall.A00 == null) {
            instantExperiencesJSBridgeCall.A02(new InstantExperiencesCallResult(EnumC61176Rgc.A05, "Internal error"));
            C0K8.A0Q("InstantExperiencesJSBridgeCallHandler", "Result missing for call id: %s", instantExperiencesJSBridgeCall.A00());
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            A00(instantExperiencesJSBridgeCall, this);
        } else {
            AbstractC167007dF.A0J().post(new TN5(instantExperiencesJSBridgeCall, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public void A02(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        String str;
        ArrayList A01;
        C2JL t8j;
        Executor executor;
        C60787RSy c60787RSy;
        if (!(this instanceof QDA)) {
            if (this instanceof QDD) {
                instantExperiencesJSBridgeCall.A01();
                HashMap A1G = AbstractC166987dD.A1G();
                EnumC61214RhE enumC61214RhE = EnumC61214RhE.A04;
                Bundle bundle = instantExperiencesJSBridgeCall.A01;
                A1G.put(enumC61214RhE, AbstractC58320PtC.A0r(bundle, "paymentId"));
                A1G.put(EnumC61214RhE.A03, String.valueOf(AbstractC58320PtC.A0r(bundle, "errorMessage")));
                UserSession userSession = ((QDD) this).A00;
                userSession.A01(VIT.class, new X2y(userSession, 43));
                InstantExperiencesParameters instantExperiencesParameters = instantExperiencesJSBridgeCall.A02;
                C14360o3.A0C(instantExperiencesParameters, "null cannot be cast to non-null type com.instagram.business.instantexperiences.IGInstantExperiencesParameters");
                IGInstantExperiencesParameters iGInstantExperiencesParameters = (IGInstantExperiencesParameters) instantExperiencesParameters;
                if (iGInstantExperiencesParameters.A01 != null) {
                    if (iGInstantExperiencesParameters.A02 != null) {
                        Iterator A0l = AbstractC167007dF.A0l(A1G);
                        while (A0l.hasNext()) {
                            Object next = A0l.next();
                            if (A1G.get(next) != null) {
                                C14360o3.A0A(A1G.get(next));
                            }
                        }
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            if (this instanceof QDB) {
                QDB qdb = (QDB) this;
                SaveAutofillDataJSBridgeCall saveAutofillDataJSBridgeCall = (SaveAutofillDataJSBridgeCall) instantExperiencesJSBridgeCall;
                saveAutofillDataJSBridgeCall.A01();
                TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, AbstractC166987dD.A1F(saveAutofillDataJSBridgeCall.A03().keySet()));
                SHH shh = qdb.A00;
                HashMap A03 = saveAutofillDataJSBridgeCall.A03();
                Object obj = new Object();
                C62898SWe c62898SWe = shh.A00;
                ?? obj2 = new Object();
                c62898SWe.A03.execute(new TN4(c62898SWe, new C63900SvY(c62898SWe, obj2)));
                C2OD.A03(new T8M(0, A03, obj, shh), obj2, shh.A03);
                t8j = new T8G(qdb, 7);
                executor = qdb.A03;
                c60787RSy = obj;
            } else {
                QDE qde = (QDE) this;
                RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = (RequestAutofillJSBridgeCall) instantExperiencesJSBridgeCall;
                requestAutofillJSBridgeCall.A01();
                C62898SWe c62898SWe2 = qde.A00;
                Bundle bundle2 = requestAutofillJSBridgeCall.A01;
                if (AbstractC58320PtC.A0r(bundle2, "selectedAutoCompleteTag") != null) {
                    Object A0r = AbstractC58320PtC.A0r(bundle2, "selectedAutoCompleteTag");
                    AbstractC25225BEi.A1S(A0r);
                    str = (String) A0r;
                } else {
                    str = "";
                }
                if (requestAutofillJSBridgeCall.A00 == null) {
                    String str2 = (String) AbstractC58320PtC.A0r(bundle2, "autofillFields");
                    ArrayList A1E = AbstractC166987dD.A1E();
                    if (str2 != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(str2);
                            int length = jSONArray.length();
                            for (int i = 0; i < length; i = AbstractC58322PtE.A0C(A1E, jSONArray, i)) {
                            }
                        } catch (JSONException e) {
                            C0K8.A0F("RequestAutofillJSBridgeCall", StringFormatUtil.formatStrLocaleSafe("Failed to getRequestedFields."), e);
                        }
                    }
                    C01T.A1C(A1E);
                    requestAutofillJSBridgeCall.A00 = new LinkedHashSet(A1E);
                }
                LinkedHashSet linkedHashSet = requestAutofillJSBridgeCall.A00;
                C14360o3.A0A(linkedHashSet);
                boolean A1R = AbstractC167007dF.A1R(0, str, linkedHashSet);
                ?? obj3 = new Object();
                c62898SWe2.A03.execute(new TN4(c62898SWe2, new C63901SvZ(obj3, str)));
                ArrayList A1E2 = AbstractC166987dD.A1E();
                if (AbstractC001800i.A0u(NameAutofillData.A00, str)) {
                    A01 = c62898SWe2.A01.A02();
                } else if (AbstractC001800i.A0u(TelephoneAutofillData.A01, str)) {
                    A01 = c62898SWe2.A01.A03();
                } else {
                    boolean contains = AddressAutofillData.A00.contains(str);
                    SPX spx = c62898SWe2.A01;
                    if (contains) {
                        A01 = spx.A00();
                    } else {
                        A01 = spx.A01();
                    }
                }
                A1E2.addAll(A01);
                C60787RSy A02 = AbstractRunnableC133325zz.A02(new C64285T7u(0, new C65075Td4(linkedHashSet, A1R ? 1 : 0)), C2OD.A00(AbstractC16960so.A1Q(obj3, new C25191Kx(A1E2))), c62898SWe2.A02);
                t8j = new T8J(4, requestAutofillJSBridgeCall, qde);
                executor = qde.A02;
                c60787RSy = A02;
            }
            C2OD.A03(t8j, c60787RSy, executor);
        }
    }

    public SZU(R7U r7u) {
        this.A00 = r7u;
    }
}
