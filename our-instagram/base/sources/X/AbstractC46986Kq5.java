package X;

import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;

/* renamed from: X.Kq5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46986Kq5 {
    public static final int A00(TransportPayload transportPayload) {
        Integer num;
        int i = transportPayload.transportPayloadCase_;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        num = null;
                    } else {
                        num = C05F.A0C;
                    }
                } else {
                    num = C05F.A01;
                }
            } else {
                num = C05F.A00;
            }
        } else {
            num = C05F.A0N;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                return 2;
            }
            if (intValue != 2) {
                if (intValue != 3) {
                    throw B4Z.A00();
                }
                throw AbstractC166987dD.A12("Invalid Transport payload");
            }
            return 1;
        }
        return 0;
    }
}
