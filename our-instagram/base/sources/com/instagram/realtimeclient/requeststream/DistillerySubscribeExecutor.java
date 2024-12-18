package com.instagram.realtimeclient.requeststream;

import X.AbstractC166997dE;
import X.AbstractC25651Mw;
import X.AbstractC50523MSb;
import X.AnonymousClass001;
import X.C0K8;
import X.C25671My;
import X.InterfaceC02550Ad;
import X.InterfaceC16820sZ;
import X.InterfaceC216113n;
import X.InterfaceC54242ee;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class DistillerySubscribeExecutor extends SubscribeExecutor {
    public static DistillerySubscribeExecutor getInstance(final UserSession userSession) {
        return (DistillerySubscribeExecutor) userSession.A01(DistillerySubscribeExecutor.class, new InterfaceC16820sZ() { // from class: com.instagram.realtimeclient.requeststream.DistillerySubscribeExecutor$$ExternalSyntheticLambda0
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return DistillerySubscribeExecutor.lambda$getInstance$0(UserSession.this);
            }
        });
    }

    @Override // com.instagram.realtimeclient.requeststream.SubscribeExecutor
    public JSONObject buildHeaderJson(GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub, String str) {
        String str2;
        IGGraphQLSubscriptionRequestStringStub iGGraphQLSubscriptionRequestStringStub = graphQLSubscriptionRequestStub.mTypedGraphQLQueryString;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("doc_id", iGGraphQLSubscriptionRequestStringStub.mQueryId);
            jSONObject.put("client_subscription_id", str);
            jSONObject.put("method", AnonymousClass001.A0R("IGGQLS:", iGGraphQLSubscriptionRequestStringStub.getQueryName().toUpperCase(Locale.ENGLISH)));
            return jSONObject;
        } catch (JSONException e) {
            String str3 = SubscribeExecutor.TAG;
            if (e.getMessage() != null) {
                str2 = e.getMessage();
            } else {
                str2 = "unknown";
            }
            C0K8.A0F(str3, str2, e);
            return jSONObject;
        }
    }

    @Override // com.instagram.realtimeclient.requeststream.SubscribeExecutor
    public JSONObject buildPayload(GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub, String str) {
        String str2;
        IGGraphQLSubscriptionRequestStringStub iGGraphQLSubscriptionRequestStringStub = graphQLSubscriptionRequestStub.mTypedGraphQLQueryString;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            Iterator A15 = AbstractC166997dE.A15(new HashMap(graphQLSubscriptionRequestStub.mSimpleGraphqlQueryParameters.mParameters));
            while (A15.hasNext()) {
                AbstractC50523MSb.A1T(A15, jSONObject2);
            }
            jSONObject2.put("client_subscription_id", str);
            ImmutableMap copyOf = ImmutableMap.copyOf(iGGraphQLSubscriptionRequestStringStub.mOptionParameters);
            JSONObject jSONObject3 = new JSONObject();
            Iterator A152 = AbstractC166997dE.A15(copyOf);
            while (A152.hasNext()) {
                AbstractC50523MSb.A1T(A152, jSONObject3);
            }
            jSONObject.put(RealtimeSubscription.INPUT_DATA, jSONObject2);
            jSONObject.put("options", jSONObject3);
            return jSONObject;
        } catch (JSONException e) {
            String str3 = SubscribeExecutor.TAG;
            if (e.getMessage() != null) {
                str2 = e.getMessage();
            } else {
                str2 = "unknown";
            }
            C0K8.A0F(str3, str2, e);
            return jSONObject;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.instagram.realtimeclient.requeststream.DistillerySubscribeExecutor, com.instagram.realtimeclient.requeststream.SubscribeExecutor] */
    public static /* synthetic */ DistillerySubscribeExecutor lambda$getInstance$0(UserSession userSession) {
        return new SubscribeExecutor(userSession, AbstractC25651Mw.A00(userSession));
    }

    public DistillerySubscribeExecutor(InterfaceC54242ee interfaceC54242ee, InterfaceC02550Ad interfaceC02550Ad, C25671My c25671My, InterfaceC216113n interfaceC216113n, long j) {
        super(interfaceC54242ee, interfaceC02550Ad, c25671My, interfaceC216113n, j);
    }

    public DistillerySubscribeExecutor(UserSession userSession, C25671My c25671My) {
        super(userSession, c25671My);
    }
}
