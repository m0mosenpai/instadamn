package com.facebook.graphql.error;

import X.AbstractC166987dD;
import X.AbstractC50102Ry;
import X.AbstractC58320PtC;
import X.C63475SlG;
import X.EnumC61091Rf5;
import X.JSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.facebook.http.protocol.ApiErrorResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.ImmutableMap;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Map;

@AutoGenJsonSerializer
@JsonDeserialize(using = GraphQLErrorDeserializer.class)
@JsonSerialize(using = GraphQLErrorSerializer.class)
@AutoGenJsonDeserializer
/* loaded from: classes10.dex */
public class GraphQLError extends ApiErrorResult {
    public static final Parcelable.Creator CREATOR = C63475SlG.A02(94);

    @JsonProperty("api_error_code")
    public final int apiErrorCode;

    @JsonProperty(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE)
    public final int code;

    @JsonProperty("debug_info")
    public final String debugInfo;

    @JsonProperty(DevServerEntity.COLUMN_DESCRIPTION)
    public final String description;

    @JsonProperty("fb_request_id")
    public final String fbRequestId;

    @JsonProperty("help_center_id")
    public final long helpCenterId;

    @JsonProperty("is_silent")
    public final boolean isSilent;

    @JsonProperty("is_transient")
    public final boolean isTransient;

    @JsonProperty("query_path")
    public final String queryPath;

    @JsonProperty("requires_reauth")
    public final boolean requiresReauth;

    @JsonProperty("sentry_block_user_info")
    public final ImmutableMap<String, String> sentryBlockUserInfo;

    @JsonProperty("severity")
    public final String severity;

    @JsonProperty("summary")
    public final String summary;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GraphQLError)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        GraphQLError graphQLError = (GraphQLError) obj;
        if (!AbstractC50102Ry.A00(Integer.valueOf(this.code), Integer.valueOf(graphQLError.code)) || !AbstractC50102Ry.A00(Integer.valueOf(this.apiErrorCode), Integer.valueOf(graphQLError.apiErrorCode)) || !AbstractC50102Ry.A00(this.summary, graphQLError.summary) || !AbstractC50102Ry.A00(this.description, graphQLError.description) || !AbstractC50102Ry.A00(Boolean.valueOf(this.isSilent), Boolean.valueOf(graphQLError.isSilent)) || !AbstractC50102Ry.A00(Boolean.valueOf(this.isTransient), Boolean.valueOf(graphQLError.isTransient)) || !AbstractC50102Ry.A00(this.fbRequestId, graphQLError.fbRequestId) || !AbstractC50102Ry.A00(Boolean.valueOf(this.requiresReauth), Boolean.valueOf(graphQLError.requiresReauth)) || !AbstractC50102Ry.A00(this.debugInfo, graphQLError.debugInfo) || !AbstractC50102Ry.A00(this.queryPath, graphQLError.queryPath) || !AbstractC50102Ry.A00(this.sentryBlockUserInfo, graphQLError.sentryBlockUserInfo) || !AbstractC50102Ry.A00(this.severity, graphQLError.severity) || !AbstractC50102Ry.A00(Long.valueOf(this.helpCenterId), Long.valueOf(graphQLError.helpCenterId))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        JSR jsr = new JSR(GraphQLError.class.getSimpleName());
        jsr.A02(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, this.code);
        jsr.A02("api_error_code", this.apiErrorCode);
        jsr.A01(this.summary, "summary");
        jsr.A01(this.description, DevServerEntity.COLUMN_DESCRIPTION);
        jsr.A04("is_silent", this.isSilent);
        jsr.A04("requires_reauth", this.requiresReauth);
        jsr.A01(this.debugInfo, "debug_info");
        jsr.A01(this.queryPath, "query_path");
        jsr.A01(this.sentryBlockUserInfo, "sentry_block_user_info");
        jsr.A01(this.severity, "severity");
        jsr.A03("help_center_id", this.helpCenterId);
        return jsr.toString();
    }

    public GraphQLError(Parcel parcel) {
        super(parcel);
        this.code = parcel.readInt();
        this.apiErrorCode = parcel.readInt();
        this.summary = parcel.readString();
        this.description = parcel.readString();
        this.isSilent = AbstractC58320PtC.A1T(parcel);
        this.isTransient = AbstractC58320PtC.A1T(parcel);
        this.fbRequestId = parcel.readString();
        this.requiresReauth = AbstractC58320PtC.A1T(parcel);
        this.debugInfo = parcel.readString();
        this.queryPath = parcel.readString();
        ImmutableMap<String, String> copyOf = ImmutableMap.copyOf((Map) AbstractC166987dD.A1G());
        this.sentryBlockUserInfo = copyOf;
        parcel.readMap(copyOf, ImmutableMap.class.getClassLoader());
        this.severity = parcel.readString();
        this.helpCenterId = parcel.readLong();
    }

    @Override // com.facebook.http.protocol.ApiErrorResult, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.code);
        parcel.writeInt(this.apiErrorCode);
        parcel.writeString(this.summary);
        parcel.writeString(this.description);
        parcel.writeInt(this.isSilent ? 1 : 0);
        parcel.writeInt(this.isTransient ? 1 : 0);
        parcel.writeString(this.fbRequestId);
        parcel.writeInt(this.requiresReauth ? 1 : 0);
        parcel.writeString(this.debugInfo);
        parcel.writeString(this.queryPath);
        parcel.writeMap(this.sentryBlockUserInfo);
        parcel.writeString(this.severity);
        parcel.writeLong(this.helpCenterId);
    }

    public GraphQLError(String str, String str2, String str3, String str4, int i, int i2, long j, boolean z, boolean z2, boolean z3) {
        super(EnumC61091Rf5.GRAPHQL_KERROR_DOMAIN, str2, str4, str3, str, i, z2);
        this.code = i;
        this.apiErrorCode = i2;
        this.summary = str;
        this.description = str2;
        this.isSilent = z;
        this.isTransient = z2;
        this.fbRequestId = str3;
        this.requiresReauth = z3;
        this.debugInfo = str4;
        this.queryPath = null;
        this.sentryBlockUserInfo = null;
        this.severity = null;
        this.helpCenterId = j;
    }

    public GraphQLError() {
        this(null, null, null, null, -1, -1, -1L, false, false, false);
    }
}
