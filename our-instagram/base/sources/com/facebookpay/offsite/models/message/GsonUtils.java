package com.facebookpay.offsite.models.message;

import X.AbstractC166987dD;
import X.AbstractC58323PtF;
import X.C14360o3;
import X.C58579Pxx;
import com.facebookpay.expresscheckout.models.CheckoutAvailability;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class GsonUtils {
    public static final GsonUtils INSTANCE = new Object();
    public static final Gson defaultGson = new Gson();

    public final String getMessageType(String str) {
        C14360o3.A0B(str, 0);
        return ((BaseMessage) defaultGson.A08(str, BaseMessage.class)).messageType;
    }

    public final String getToJson(Object obj) {
        C14360o3.A0B(obj, 0);
        if (!(obj instanceof AvailabilityResponse) && !(obj instanceof PaymentDetailsChangedEvent) && !(obj instanceof PaymentResponse)) {
            throw AbstractC166987dD.A14("Invalid message to convert to Json");
        }
        String A0B = defaultGson.A0B(obj);
        C14360o3.A07(A0B);
        return A0B;
    }

    public final Map getToRedactedMap(String str) {
        C14360o3.A0B(str, 0);
        Object A09 = defaultGson.A09(str, new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: com.facebookpay.offsite.models.message.GsonUtils$toRedactedMap$1
        }.type);
        C14360o3.A07(A09);
        return (Map) A09;
    }

    public final PaymentDetailsUpdatedResponse toOffsitePaymentUpdatedMsg(String str, String str2) {
        C14360o3.A0B(str, 0);
        Object A08 = deserializerGson(str2).A08(str, PaymentDetailsUpdatedResponse.class);
        C14360o3.A07(A08);
        return (PaymentDetailsUpdatedResponse) A08;
    }

    public static /* synthetic */ Gson deserializerGson$default(GsonUtils gsonUtils, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return gsonUtils.deserializerGson(str);
    }

    public final Gson deserializerGson(String str) {
        C58579Pxx c58579Pxx = new C58579Pxx();
        c58579Pxx.A07 = true;
        c58579Pxx.A01(new OffsiteTypeAdapterFactory(str));
        return c58579Pxx.A00();
    }

    public final CheckoutAvailability getToOffsiteAvailabilityResponse(String str) {
        Object A08 = AbstractC58323PtF.A0b(this, str).A08(str, CheckoutAvailability.class);
        C14360o3.A07(A08);
        return (CheckoutAvailability) A08;
    }

    public final PaymentHandledRequest getToOffsitePaymentHandledMsg(String str) {
        Object A08 = AbstractC58323PtF.A0b(this, str).A08(str, PaymentHandledRequest.class);
        C14360o3.A07(A08);
        return (PaymentHandledRequest) A08;
    }

    public final PaymentRequest getToOffsitePaymentRequest(String str) {
        Object A08 = AbstractC58323PtF.A0b(this, str).A08(str, PaymentRequest.class);
        C14360o3.A07(A08);
        return (PaymentRequest) A08;
    }

    public final StartCheckoutRequest getToOffsiteStartCheckoutRequest(String str) {
        Object A08 = AbstractC58323PtF.A0b(this, str).A08(str, StartCheckoutRequest.class);
        C14360o3.A07(A08);
        return (StartCheckoutRequest) A08;
    }

    public final ScriptOverrideRequest getToScriptOverrideRequest(String str) {
        Object A08 = AbstractC58323PtF.A0b(this, str).A08(str, ScriptOverrideRequest.class);
        C14360o3.A07(A08);
        return (ScriptOverrideRequest) A08;
    }
}
