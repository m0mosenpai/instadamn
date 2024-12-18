package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.OPf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54884OPf {
    public static final boolean A00(UserSession userSession, C47Z c47z) {
        long j;
        if (AbstractC166997dE.A1Z(c47z.A20, true)) {
            return false;
        }
        ShareType A0D = c47z.A0D();
        if (A0D != null) {
            AbstractC54103Nw1 abstractC54103Nw1 = AbstractC54103Nw1.$redex_init_class;
            switch (A0D.ordinal()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case 14:
                case Process.SIGTERM /* 15 */:
                case 16:
                case 20:
                case 24:
                case 25:
                case 26:
                case 27:
                    return false;
                case 9:
                    if (!c47z.A5M) {
                        int i = c47z.A05;
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (i != 0) {
                            j = 36328096110099626L;
                        } else {
                            j = 36328096109968553L;
                        }
                        return !C18U.A06(c06090Tz, userSession, j);
                    }
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case 17:
                case 18:
                case Process.SIGSTOP /* 19 */:
                case 21:
                case 22:
                case 23:
                default:
                    return true;
            }
        }
        return true;
    }

    public static final boolean A01(C47Z c47z) {
        if (AbstractC166997dE.A1Z(c47z.A20, true)) {
            return false;
        }
        ShareType A0D = c47z.A0D();
        if (A0D != null) {
            AbstractC54103Nw1 abstractC54103Nw1 = AbstractC54103Nw1.$redex_init_class;
            switch (A0D.ordinal()) {
                case 1:
                case Process.SIGTERM /* 15 */:
                case 20:
                case 24:
                    return false;
            }
        }
        return true;
    }
}
