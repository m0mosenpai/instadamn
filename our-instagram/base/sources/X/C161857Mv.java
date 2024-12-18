package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.7Mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161857Mv {
    public static final C161867Mw A02 = new Object();
    public final UserSession A00;
    public final C7N2 A01;

    public C161857Mv(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = (C7N2) userSession.A01(C7N2.class, new MHS(userSession, 16));
    }

    public final boolean A01(C2EC c2ec, Integer num, boolean z, boolean z2) {
        C81613kW Aic;
        C81613kW Aic2;
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean z3 = false;
        if (!C18U.A06(c06090Tz, userSession, 2342161871149931194L) && !C18U.A06(c06090Tz, userSession, 2342161871143967353L)) {
            if (c2ec != null && (Aic2 = c2ec.Aic()) != null && Aic2.A03 != 0) {
                C18950wb.A01.AEp("TTLC is enabled but MC is disabled", 817904752).report();
            }
        } else if (!z && c2ec != null && (Aic = c2ec.Aic()) != null && !c2ec.CWO()) {
            long A00 = A00(num, z2);
            if (A00 != -1) {
                if (A00 == 1) {
                    C18U.A06(c06090Tz, userSession, 36330166284206815L);
                }
                z3 = false;
                if ((Aic.A00(userSession) & A00) == A00) {
                    return true;
                }
            }
        }
        return z3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static final long A00(Integer num, boolean z) {
        EnumC81633kY enumC81633kY;
        switch (num.intValue()) {
            case 0:
            case 1:
                enumC81633kY = EnumC81633kY.A0G;
                return enumC81633kY.A00;
            case 2:
            case 16:
                enumC81633kY = EnumC81633kY.A08;
                return enumC81633kY.A00;
            case 3:
                enumC81633kY = EnumC81633kY.A0B;
                return enumC81633kY.A00;
            case 4:
                enumC81633kY = EnumC81633kY.A0H;
                return enumC81633kY.A00;
            case 5:
                enumC81633kY = EnumC81633kY.A05;
                return enumC81633kY.A00;
            case 6:
                enumC81633kY = EnumC81633kY.A0F;
                return enumC81633kY.A00;
            case 7:
                enumC81633kY = EnumC81633kY.A0E;
                if (z) {
                    return 2052L;
                }
                return enumC81633kY.A00;
            case 8:
                enumC81633kY = EnumC81633kY.A03;
                return enumC81633kY.A00;
            case 9:
                enumC81633kY = EnumC81633kY.A09;
                return enumC81633kY.A00;
            case 10:
                enumC81633kY = EnumC81633kY.A0C;
                return enumC81633kY.A00;
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                enumC81633kY = EnumC81633kY.A0D;
                return enumC81633kY.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            case Process.SIGSTOP /* 19 */:
                enumC81633kY = EnumC81633kY.A06;
                return enumC81633kY.A00;
            case 14:
            case 17:
                enumC81633kY = EnumC81633kY.A07;
                return enumC81633kY.A00;
            case 18:
                enumC81633kY = EnumC81633kY.A0A;
                return enumC81633kY.A00;
            case 20:
                enumC81633kY = EnumC81633kY.A04;
                return enumC81633kY.A00;
            default:
                return -1L;
        }
    }
}
