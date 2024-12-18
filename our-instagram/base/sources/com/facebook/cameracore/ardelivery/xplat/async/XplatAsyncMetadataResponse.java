package com.facebook.cameracore.ardelivery.xplat.async;

import X.AbstractC167027dH;
import X.C14360o3;
import X.EnumC203618zO;

/* loaded from: classes10.dex */
public final class XplatAsyncMetadataResponse {
    public final String cacheKey;
    public final String graphQLID;
    public final EnumC203618zO jCompressionType;
    public final String uri;

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final int getCompressionType() {
        return this.jCompressionType.A00;
    }

    public final String getGraphQLID() {
        return this.graphQLID;
    }

    public final String getUri() {
        return this.uri;
    }

    public XplatAsyncMetadataResponse(String str, String str2, String str3, EnumC203618zO enumC203618zO) {
        AbstractC167027dH.A13(str, str2, str3);
        C14360o3.A0B(enumC203618zO, 4);
        this.graphQLID = str;
        this.cacheKey = str2;
        this.uri = str3;
        this.jCompressionType = enumC203618zO;
    }
}
