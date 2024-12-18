package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3Uo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74103Uo {
    public static final C74103Uo A00 = new Object();
    public static final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public final C4N8 A00(Context context, String str) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str, 1);
        ConcurrentHashMap concurrentHashMap = A01;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            boolean z = false;
            if (AbstractC002300n.A0h(str, "rti.mqtt.", false)) {
                Integer[] A002 = C05F.A00(19);
                int length = A002.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Integer num = A002[i];
                    if (C14360o3.A0K(C4N6.A00(num), AbstractC001900j.A0F("rti.mqtt.", str))) {
                        switch (num.intValue()) {
                            case 1:
                            case 2:
                            case 4:
                            case 5:
                            case 17:
                            case 18:
                                z = true;
                                break;
                            default:
                                z = false;
                                break;
                        }
                    } else {
                        i++;
                    }
                }
            }
            C4N7 c4n7 = new C4N7(context, str, z);
            obj = concurrentHashMap.putIfAbsent(str, c4n7);
            if (obj == null) {
                obj = c4n7;
            }
        }
        return (C4N8) obj;
    }
}
