package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.6oQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149736oQ {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String A00(EnumC143276dS enumC143276dS, EnumC143286dT enumC143286dT, UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(enumC143286dT, 1);
        C14360o3.A0B(enumC143276dS, 2);
        switch (enumC143286dT.ordinal()) {
            case 0:
                EnumC143276dS enumC143276dS2 = EnumC143276dS.A0P;
                c06090Tz = C06090Tz.A05;
                if (z) {
                    if (enumC143276dS == enumC143276dS2) {
                        j = 36881579955716487L;
                        break;
                    } else {
                        j = 36881579955650950L;
                        break;
                    }
                } else if (enumC143276dS == enumC143276dS2) {
                    j = 36881579955585413L;
                    break;
                } else {
                    j = 36881579955519876L;
                    break;
                }
            case 1:
            case 4:
            case 5:
            case 7:
            case 11:
                int ordinal = enumC143276dS.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        c06090Tz = C06090Tz.A05;
                        if (C18U.A06(c06090Tz, userSession, 36317771008644661L)) {
                            j = 36880720962126182L;
                            break;
                        }
                    }
                    return enumC143276dS.A00;
                }
                c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36317771008644661L)) {
                    j = 36880720961995109L;
                    break;
                }
                return enumC143276dS.A00;
            case 2:
            case 3:
                c06090Tz = C06090Tz.A05;
                j = 36884410339164741L;
                break;
            case 6:
            case 8:
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            default:
                return enumC143276dS.A00;
            case 10:
                int ordinal2 = enumC143276dS.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 2) {
                        c06090Tz = C06090Tz.A05;
                        j = 36885161958244961L;
                        break;
                    }
                    return enumC143276dS.A00;
                }
                c06090Tz = C06090Tz.A05;
                j = 36885161958310498L;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                int ordinal3 = enumC143276dS.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 == 2) {
                        c06090Tz = C06090Tz.A05;
                        j = 36886605067256543L;
                        break;
                    }
                    return enumC143276dS.A00;
                }
                c06090Tz = C06090Tz.A05;
                j = 36886605067322080L;
                break;
            case 14:
                int ordinal4 = enumC143276dS.ordinal();
                if (ordinal4 != 0) {
                    if (ordinal4 == 2) {
                        c06090Tz = C06090Tz.A05;
                        j = 36886609362223842L;
                        break;
                    }
                    return enumC143276dS.A00;
                }
                c06090Tz = C06090Tz.A05;
                j = 36886609362158305L;
                break;
        }
        String A04 = C18U.A04(c06090Tz, userSession, j);
        C14360o3.A0A(A04);
        return A04;
    }
}
