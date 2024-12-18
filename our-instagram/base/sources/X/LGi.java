package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class LGi {
    public static final LGi A00 = new Object();

    public final C83403nh A01(L5O l5o, TransportEvent.Event.DeviceChange deviceChange) {
        Integer num;
        String str;
        C2EY c2ey;
        Object c83553nw;
        C83403nh c83403nh = new C83403nh();
        A02(l5o, c83403nh);
        int ordinal = deviceChange.A0L().ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                c2ey = C2EY.A1O;
                c83553nw = new AnonymousClass570("need_update");
                c83403nh.A18(c2ey, c83553nw);
                return c83403nh;
            }
            num = C05F.A02;
        } else {
            num = C05F.A1I;
        }
        if (9 - num.intValue() != 0) {
            str = "security_alert_key_change";
        } else {
            str = "security_alert_new_login";
        }
        C31200Dnj c31200Dnj = new C31200Dnj(str, 21);
        c2ey = C2EY.A0G;
        c83553nw = new C83553nw(c31200Dnj, "", null, null, null, null, false);
        c83403nh.A18(c2ey, c83553nw);
        return c83403nh;
    }

    public final void A02(L5O l5o, C83403nh c83403nh) {
        String str = l5o.A0B;
        c83403nh.A17(AbstractC43593JPy.A0f(str));
        c83403nh.A16(new C83693oE(str));
        c83403nh.A1D(l5o.A05);
        c83403nh.A1F(l5o.A06);
        long j = l5o.A01;
        c83403nh.A1B(Long.valueOf(j));
        c83403nh.A1E(l5o.A0A);
        boolean z = l5o.A0C;
        if (z != c83403nh.A2F) {
            c83403nh.A2C = true;
            c83403nh.A2F = z;
        }
        c83403nh.A1M(true);
        c83403nh.A0x(new C45120Jxp(l5o.A03, l5o.A0D));
        Boolean bool = c83403nh.A19;
        if (bool != null && false != bool.booleanValue()) {
            c83403nh.A19 = false;
            c83403nh.A2C = true;
        }
        Integer num = l5o.A04;
        Integer num2 = c83403nh.A1F;
        if (num2 != num) {
            c83403nh.A2C = true;
            if (num2 != C05F.A00 && num != C05F.A0N) {
                c83403nh.A1m(num);
            } else {
                c83403nh.A1F = num;
            }
        }
        L1W l1w = l5o.A02;
        long seconds = TimeUnit.MICROSECONDS.toSeconds(j);
        if (l1w != null) {
            if (l1w.A00 == EnumC46242KdI.A04) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Long l = l1w.A01;
                if (l != null) {
                    long millis = timeUnit.toMillis(l.longValue());
                    Long valueOf = Long.valueOf(millis);
                    synchronized (c83403nh) {
                        c83403nh.A1K = valueOf;
                    }
                    c83403nh.A1C(Long.valueOf(millis + timeUnit.toMillis(seconds)));
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            boolean A1X = AbstractC167007dF.A1X(l1w.A00, EnumC46242KdI.A05);
            if (c83403nh.A2P != A1X) {
                c83403nh.A2C = true;
                c83403nh.A2P = A1X;
            }
        }
        boolean z2 = l5o.A0E;
        if (z2 != c83403nh.A2O) {
            c83403nh.A2C = true;
            c83403nh.A2O = z2;
        }
        c83403nh.A1h = l5o.A07;
    }

    public final C83403nh A00(UserSession userSession, L5O l5o, int i) {
        int i2;
        C83403nh c83403nh = new C83403nh();
        A02(l5o, c83403nh);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36318861933157014L);
        String str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        if (!A06) {
            if (i != -3) {
                if (i != -2) {
                    if (i == -1) {
                        i2 = 4239;
                    }
                } else {
                    str = "need_update";
                }
            } else {
                i2 = 5524;
            }
            str = AbstractC111324zv.A00(i2);
        }
        c83403nh.A18(C2EY.A1O, new AnonymousClass570(str));
        return c83403nh;
    }
}
