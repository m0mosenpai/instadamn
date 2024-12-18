package X;

import android.content.Context;
import java.util.Random;

/* renamed from: X.19t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC229119t {
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0di, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0di, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0di, java.lang.Object] */
    public static boolean A00(Context context) {
        if (new Random().nextInt(60) == 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            String A0R = AnonymousClass001.A0R("mc_ratelimit_", "api2");
            ?? obj = new Object();
            obj.A00 = context;
            int A00 = AbstractC05790Sg.A00(obj, A0R, 0);
            if (A00 == 0) {
                int random = currentTimeMillis - ((int) (Math.random() * 5184000.0d));
                String A0R2 = AnonymousClass001.A0R("mc_ratelimit_", "api2");
                ?? obj2 = new Object();
                obj2.A00 = context;
                AbstractC05790Sg.A03(obj2, A0R2, random);
                return false;
            }
            if (A00 + 5184000 > currentTimeMillis) {
                return false;
            }
            String A0R3 = AnonymousClass001.A0R("mc_ratelimit_", "api2");
            ?? obj3 = new Object();
            obj3.A00 = context;
            AbstractC05790Sg.A03(obj3, A0R3, currentTimeMillis);
            return true;
        }
        return false;
    }
}
