package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.8vy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC201688vy {
    public static final boolean A01(UserSession userSession, Integer num) {
        long j;
        C14360o3.A0B(userSession, 0);
        AbstractC201698vz abstractC201698vz = AbstractC201698vz.$redex_init_class;
        int intValue = num.intValue();
        C06090Tz c06090Tz = C06090Tz.A05;
        switch (intValue) {
            case 0:
                j = 36331124061914277L;
                break;
            case 1:
                j = 36331124061979814L;
                break;
            case 2:
                j = 36331124062045351L;
                break;
            case 3:
                j = 36331124062110888L;
                break;
            case 4:
                j = 36331124062176425L;
                break;
            case 5:
                j = 36331124062241962L;
                break;
            case 6:
                j = 36331124062307499L;
                break;
            case 7:
                j = 36331124062373036L;
                break;
            case 8:
                j = 36331124062438573L;
                break;
            case 9:
                j = 36331124062504110L;
                break;
            case 10:
                j = 36331124062569647L;
                break;
            case 11:
                j = 36331124062635184L;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                j = 36331124062700721L;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                j = 36331124062766258L;
                break;
            case 14:
                j = 36331124062831795L;
                break;
            default:
                j = 36331124062897332L;
                break;
        }
        boolean A06 = C18U.A06(c06090Tz, userSession, j);
        C14360o3.A0A(Boolean.valueOf(A06));
        return A06;
    }

    public static final boolean A00(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36327812643896206L) || !C18U.A06(c06090Tz, userSession, 36327812643961743L)) {
            C06090Tz c06090Tz2 = C06090Tz.A06;
            if (C18U.A06(c06090Tz2, userSession, 36311560486191708L) && C18U.A06(c06090Tz2, userSession, 36311560487436911L)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
