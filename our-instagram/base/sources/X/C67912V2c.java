package X;

import android.content.Context;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.V2c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67912V2c extends C7E1 {
    public final HashMap A00;
    public final C67924V2o A01;
    public final AnalyticsEventDebugInfo A02;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.V2o, java.lang.Object, X.2y0] */
    public C67912V2c(Context context, V1U v1u, AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        C14360o3.A0B(analyticsEventDebugInfo, 2);
        this.A02 = analyticsEventDebugInfo;
        ?? obj = new Object();
        obj.A00 = context;
        obj.A01 = v1u;
        this.A01 = obj;
        this.A00 = new HashMap();
        A0B(obj);
        A00(this);
    }

    public static final void A00(C67912V2c c67912V2c) {
        c67912V2c.A06();
        List list = c67912V2c.A02.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            C14360o3.A07(obj);
            HashMap hashMap = c67912V2c.A00;
            Object obj2 = hashMap.get(obj);
            if (obj2 == null) {
                obj2 = new Object();
                hashMap.put(obj, obj2);
            }
            c67912V2c.A09(c67912V2c.A01, list.get(i), obj2);
        }
        c67912V2c.A07();
    }
}
