package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7nN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC173097nN {
    public static final AtomicInteger A00 = new AtomicInteger(0);

    public static final int A00(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str2, 2);
        int andIncrement = A00.getAndIncrement();
        C006802i c006802i = C006802i.A0p;
        c006802i.markerStart(383656871, andIncrement);
        c006802i.markerAnnotate(383656871, andIncrement, "config_type", str);
        c006802i.markerAnnotate(383656871, andIncrement, "module_name", str2);
        return andIncrement;
    }

    public static final int A01(String str) {
        int andIncrement = A00.getAndIncrement();
        C006802i.A0p.markerStart(383657104, andIncrement);
        C006802i.A0p.markerAnnotate(383657104, andIncrement, "config_type", str);
        return andIncrement;
    }

    public static final void A02(int i, short s) {
        C006802i.A0p.markerEnd(383656871, i, s);
    }
}
