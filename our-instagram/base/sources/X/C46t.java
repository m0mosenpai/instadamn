package X;

import java.util.Map;

/* renamed from: X.46t, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C46t {
    public static final C12T A00(C1YP c1yp) {
        Map map = c1yp.backingFieldMap;
        Object obj = map.get("QueryDispatcher");
        if (obj == null) {
            obj = CLZ.A00(c1yp.getQueryExecutor());
            map.put("QueryDispatcher", obj);
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (C12T) obj;
    }

    public static final C12T A01(C1YP c1yp) {
        Map map = c1yp.backingFieldMap;
        Object obj = map.get("TransactionDispatcher");
        if (obj == null) {
            obj = CLZ.A00(c1yp.getTransactionExecutor());
            map.put("TransactionDispatcher", obj);
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (C12T) obj;
    }
}
