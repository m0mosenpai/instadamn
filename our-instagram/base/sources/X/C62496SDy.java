package X;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/* renamed from: X.SDy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62496SDy {
    public final String A00;
    public final String A01;

    public C62496SDy(JsonPOJOBuilder jsonPOJOBuilder) {
        String buildMethodName = jsonPOJOBuilder.buildMethodName();
        String withPrefix = jsonPOJOBuilder.withPrefix();
        this.A00 = buildMethodName;
        this.A01 = withPrefix;
    }
}
