package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.8rJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199168rJ {
    public static final C199168rJ A00 = new Object();

    public final boolean A00(C22P c22p, C55U c55u, EnumC198268pb enumC198268pb, boolean z) {
        if (c55u != C208509Kk.A00 || enumC198268pb != EnumC198268pb.A04 || z) {
            return false;
        }
        switch (c22p.ordinal()) {
            case 0:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 20:
            case 21:
            case 24:
            case 25:
            case 27:
            case 30:
            case 31:
            case 70:
            case 305:
            case 346:
            case 366:
            case 464:
            case 473:
            case 474:
            case 476:
            case 477:
            case 483:
            case 539:
            case 540:
                return true;
            default:
                return false;
        }
    }

    public final boolean A01(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342162897643511554L) && C18U.A06(c06090Tz, userSession, 36319888428113646L) && AbstractC197508oL.A00(userSession).booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean A02(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342162897643511554L) && !C18U.A06(c06090Tz, userSession, 36319888428113646L) && C18U.A06(c06090Tz, userSession, 36319888428048109L)) {
            return true;
        }
        return false;
    }

    public final boolean A03(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342162897643511554L) && C18U.A06(c06090Tz, userSession, 36319888428113646L) && AbstractC197498oK.A00(userSession).booleanValue()) {
            return true;
        }
        return false;
    }
}
