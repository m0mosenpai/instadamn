package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.99P, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C99P {
    public static final String A01(UserSession userSession, EnumC46982Dm enumC46982Dm, C4I3 c4i3) {
        int ordinal;
        C14360o3.A0B(c4i3, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(enumC46982Dm, 2);
        if (enumC46982Dm.ordinal() == 0) {
            if (!A02(userSession, c4i3)) {
                return null;
            }
        } else if ((!AbstractC101284gk.A00(userSession).booleanValue() || !A02(userSession, c4i3)) && (ordinal = c4i3.ordinal()) != 3 && ordinal != 8) {
            return null;
        }
        return c4i3.A00;
    }

    public static final String A00(UserSession userSession, AbstractC46972Dl abstractC46972Dl, C4I3 c4i3) {
        if (abstractC46972Dl.A01 == EnumC46982Dm.A05 && A02(userSession, c4i3)) {
            return c4i3.A00;
        }
        return "all";
    }

    public static final boolean A02(UserSession userSession, C4I3 c4i3) {
        long j;
        if (C2E8.A06(userSession)) {
            if (C2E9.A07(userSession) && AbstractC101284gk.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36328276499447211L)) {
                int ordinal = c4i3.ordinal();
                if (ordinal == 1 || ordinal == 2 || ordinal == 19 || ordinal == 23 || ordinal == 24) {
                    return true;
                }
                switch (ordinal) {
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    case 14:
                    case Process.SIGTERM /* 15 */:
                    case 16:
                    case 17:
                        return true;
                }
            }
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36323418890644708L)) {
                int ordinal2 = c4i3.ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 == 19) {
                        j = 36322237774768204L;
                    }
                } else {
                    j = 36323418890579171L;
                }
                return C18U.A06(c06090Tz, userSession, j);
            }
        }
        return false;
    }
}
