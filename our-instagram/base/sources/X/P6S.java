package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.service.upload.ImageUploadUtil;

/* loaded from: classes9.dex */
public final class P6S implements MQE {
    public final boolean A00;

    @Override // X.MQE
    public final Object F8t(OXD oxd, InterfaceC23621Ds interfaceC23621Ds) {
        if (O0M.A00.contains(oxd.A05)) {
            C47Z c47z = oxd.A0C;
            UserSession userSession = oxd.A0B;
            if (AbstractC54884OPf.A01(c47z) && AbstractC54884OPf.A00(userSession, c47z)) {
                if (this.A00) {
                    ImageUploadUtil imageUploadUtil = ImageUploadUtil.A00;
                    oxd.A06 = new NRM(c47z);
                    return ImageUploadUtil.A02(oxd, imageUploadUtil, interfaceC23621Ds);
                }
                return ImageUploadUtil.A00(oxd);
            }
            c47z.A0Z(EnumC915447k.A09);
            return NRL.A00;
        }
        return NRK.A00;
    }

    @Override // X.MQE
    public final String getName() {
        return "UploadCoverImage";
    }

    public P6S(boolean z) {
        this.A00 = z;
    }

    public P6S() {
        this(false);
    }
}
