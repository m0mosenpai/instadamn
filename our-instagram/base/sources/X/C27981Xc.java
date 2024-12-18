package X;

import android.content.Context;
import java.util.HashMap;

/* renamed from: X.1Xc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27981Xc extends AbstractC27991Xd {
    public final C28021Xg A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Xg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1Xh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1Xj, X.1WJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.1Xj, X.1WJ, java.lang.Object] */
    public C27981Xc(Context context) {
        ?? obj = new Object();
        obj.A00 = context;
        HashMap hashMap = C1WZ.A09;
        hashMap.put("suspicious_login", obj);
        hashMap.put("two_factor_trusted_notification", obj);
        C27741Wc A01 = C27741Wc.A01();
        ?? obj2 = new Object();
        obj2.A00 = context;
        A01.A05(obj2, AbstractC19750y3.A01("login_notifications"), "suspicious_login");
        C27741Wc A012 = C27741Wc.A01();
        ?? obj3 = new Object();
        obj3.A00 = context;
        A012.A05(obj3, AbstractC19750y3.A01("login_notifications"), "two_factor_trusted_notification");
    }
}
