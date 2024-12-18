package X;

import android.content.Context;
import com.facebook.graphql.query.JSONPersistedQueryProvider;

/* renamed from: X.3s1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85723s1 {
    /* JADX WARN: Type inference failed for: r2v2, types: [X.3s0, com.facebook.graphql.query.JSONPersistedQueryProvider] */
    public final synchronized C85713s0 A00() {
        C85713s0 c85713s0;
        C85713s0 c85713s02 = C85713s0.A00;
        c85713s0 = c85713s02;
        if (c85713s02 == null) {
            Context context = AbstractC12290kX.A00;
            C14360o3.A07(context);
            ?? jSONPersistedQueryProvider = new JSONPersistedQueryProvider(context, "ig4a-facebook-schema");
            C85713s0.A00 = jSONPersistedQueryProvider;
            c85713s0 = jSONPersistedQueryProvider;
        }
        C14360o3.A0C(c85713s0, "null cannot be cast to non-null type com.instagram.graphql.facebookschema.FacebookSchemaPersistedQueryProvider");
        return c85713s0;
    }
}
