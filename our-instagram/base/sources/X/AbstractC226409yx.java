package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226409yx {
    public static final void A00(UserSession userSession, C55U c55u, Exception exc, Integer num) {
        AbstractC189688an.A04("preview", AbstractC196798n9.A00(num), exc, false);
        C006802i.A0p.markerEnd(17642914, (short) 3);
        C006802i.A0p.markerEnd(AbstractC178387wC.A02(17), (short) 3);
        String str = "";
        if (C14360o3.A0K(c55u, C128535rM.A00)) {
            MYZ A01 = MX1.A01(userSession);
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            A01.A08 = A01.A0B.A07(String.valueOf(message), "", 288434727, A01.A08);
        }
        String message2 = exc.getMessage();
        if (message2 != null) {
            str = message2;
        }
        C0K8.A0F("CameraPhotoCaptureController", str, exc);
    }
}
