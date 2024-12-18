package X;

import android.content.Context;
import com.facebook.graphql.query.JSONPersistedQueryProvider;

/* renamed from: X.42t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC908042t {
    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.graphql.query.JSONPersistedQueryProvider, X.42u] */
    public static final C908142u A00() {
        if (C908142u.A00 == null) {
            synchronized (C908142u.class) {
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                C908142u.A00 = new JSONPersistedQueryProvider(context, "ig4a-instagram-schema");
            }
        }
        C908142u c908142u = C908142u.A00;
        if (c908142u == null) {
            C14360o3.A0F("persistedQueryProvider");
            throw C00O.createAndThrow();
        }
        return c908142u;
    }
}
