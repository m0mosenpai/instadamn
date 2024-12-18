package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IAU {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.IFy, java.lang.Object] */
    public static C41055IFy parseFromJson(C16L c16l) {
        int i;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(A0s)) {
                    int A1D = c16l.A1D();
                    Integer[] A00 = C05F.A00(5);
                    int length = A00.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            num = A00[i2];
                            switch (num.intValue()) {
                                case 1:
                                    i = 1;
                                    break;
                                case 2:
                                    i = 2;
                                    break;
                                case 3:
                                    i = 4;
                                    break;
                                case 4:
                                    i = 16;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                            if (i != A1D) {
                                i2++;
                            }
                        } else {
                            num = null;
                        }
                    }
                } else if ("2".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (num != null) {
                obj.A00 = num;
            }
            if (str != null) {
                obj.A01 = str;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
