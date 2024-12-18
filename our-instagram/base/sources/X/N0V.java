package X;

import com.instagram.direct.stella.StellaDirectMessagingService;
import com.meta.trusteddevice.service.TrustedDeviceFoundationServiceImpl;

/* loaded from: classes9.dex */
public abstract class N0V extends N0W {
    public final C08610cP A00;

    public N0V() {
        String str;
        if (this instanceof TrustedDeviceFoundationServiceImpl) {
            str = "com.meta.trusteddevice.service.fbpermission.TRUSTED_DEVICE_FOUNDATION_SERVICE";
        } else if (this instanceof StellaDirectMessagingService) {
            str = "com.instagram.android.fbpermission.MANAGE_MESSAGING";
        } else {
            str = "com.fbpay.w3c.ipc.fbpermission.GET_CROSS_APP_KEY";
        }
        C08600cO c08600cO = new C08600cO();
        c08600cO.A05(str);
        this.A00 = c08600cO.A00();
    }
}
