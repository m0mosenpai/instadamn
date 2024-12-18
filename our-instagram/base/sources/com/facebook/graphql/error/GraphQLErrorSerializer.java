package com.facebook.graphql.error;

import X.AbstractC121565f4;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C121555ex;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableMap;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes10.dex */
public class GraphQLErrorSerializer extends JsonSerializer {
    static {
        C121555ex.A08.putIfAbsent(GraphQLError.class, new Object());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        GraphQLError graphQLError = (GraphQLError) obj;
        if (graphQLError == null) {
            anonymousClass182.A0b();
        }
        anonymousClass182.A0d();
        int i = graphQLError.code;
        anonymousClass182.A0r(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        anonymousClass182.A0h(i);
        int i2 = graphQLError.apiErrorCode;
        anonymousClass182.A0r("api_error_code");
        anonymousClass182.A0h(i2);
        AbstractC121565f4.A04(anonymousClass182, "summary", graphQLError.summary);
        AbstractC121565f4.A04(anonymousClass182, DevServerEntity.COLUMN_DESCRIPTION, graphQLError.description);
        boolean z = graphQLError.isSilent;
        anonymousClass182.A0r("is_silent");
        anonymousClass182.A0y(z);
        boolean z2 = graphQLError.isTransient;
        anonymousClass182.A0r("is_transient");
        anonymousClass182.A0y(z2);
        AbstractC121565f4.A04(anonymousClass182, "fb_request_id", graphQLError.fbRequestId);
        boolean z3 = graphQLError.requiresReauth;
        anonymousClass182.A0r("requires_reauth");
        anonymousClass182.A0y(z3);
        AbstractC121565f4.A04(anonymousClass182, "debug_info", graphQLError.debugInfo);
        AbstractC121565f4.A04(anonymousClass182, "query_path", graphQLError.queryPath);
        ImmutableMap<String, String> immutableMap = graphQLError.sentryBlockUserInfo;
        if (immutableMap != null) {
            anonymousClass182.A0r("sentry_block_user_info");
            AbstractC121565f4.A00(anonymousClass182, abstractC913345m, immutableMap);
        }
        AbstractC121565f4.A04(anonymousClass182, "severity", graphQLError.severity);
        long j = graphQLError.helpCenterId;
        anonymousClass182.A0r("help_center_id");
        anonymousClass182.A0i(j);
        anonymousClass182.A0a();
    }
}
