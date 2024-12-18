package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LEh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47913LEh {
    public final L7X A00;
    public final C2DS A01;
    public final L8o A02;
    public final UserSession A03;

    public static final List A00(TransportEvent.Event event, C2EC c2ec, C47913LEh c47913LEh, String str, long j, long j2) {
        Object obj;
        String id;
        Object kx0;
        C83403nh c83403nh;
        EnumC46309Kef enumC46309Kef;
        Integer num;
        String str2;
        C2EY c2ey;
        Object c83553nw;
        String C7I = c2ec.C7I();
        if (C7I != null) {
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession = c47913LEh.A03;
            Long BTC = c08730cb.A01(userSession).BTC();
            if (BTC != null && BTC.longValue() == j) {
                id = userSession.userId;
            } else {
                Iterator it = c2ec.BSH().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        Long BTC2 = ((User) obj).BTC();
                        if (BTC2 != null && BTC2.longValue() == j) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                User user = (User) obj;
                if (user != null) {
                    id = user.getId();
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            if (id != null) {
                boolean A0O = C6X6.A0O(userSession, c2ec);
                long longValue = c2ec.C7O().longValue();
                Boolean valueOf = Boolean.valueOf(A0O);
                String A04 = C4H6.A04(str, j2);
                L5O l5o = new L5O(null, valueOf, C05F.A0j, A04, str, C7I, id, null, null, null, longValue, C4H6.A01(A04), false, false, false);
                int i = event.eventCase_;
                if (i == 1) {
                    LGi lGi = LGi.A00;
                    TransportEvent.Event.DeviceChange deviceChange = (TransportEvent.Event.DeviceChange) event.event_;
                    C14360o3.A07(deviceChange);
                    c83403nh = lGi.A01(l5o, deviceChange);
                } else if (i == 2) {
                    LGi lGi2 = LGi.A00;
                    TransportEvent.Event.IcdcAlert icdcAlert = (TransportEvent.Event.IcdcAlert) event.event_;
                    C14360o3.A07(icdcAlert);
                    c83403nh = new C83403nh();
                    lGi2.A02(l5o, c83403nh);
                    int i2 = icdcAlert.type_;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                enumC46309Kef = EnumC46309Kef.NONE;
                            } else {
                                enumC46309Kef = EnumC46309Kef.CLEARED;
                            }
                        } else {
                            enumC46309Kef = EnumC46309Kef.DETECTED;
                        }
                    } else {
                        enumC46309Kef = EnumC46309Kef.NONE;
                    }
                    int ordinal = enumC46309Kef.ordinal();
                    if (ordinal != 2) {
                        if (ordinal != 1) {
                            c2ey = C2EY.A1O;
                            c83553nw = new AnonymousClass570("need_update");
                            c83403nh.A18(c2ey, c83553nw);
                        } else {
                            num = C05F.A04;
                        }
                    } else {
                        num = C05F.A03;
                    }
                    if (11 - num.intValue() != 0) {
                        str2 = "security_icdc_detect";
                    } else {
                        str2 = "security_icdc_clear";
                    }
                    C31200Dnj c31200Dnj = new C31200Dnj(str2, 21);
                    c2ey = C2EY.A0G;
                    c83553nw = new C83553nw(c31200Dnj, "", null, null, null, null, false);
                    c83403nh.A18(c2ey, c83553nw);
                } else {
                    kx0 = new KX0("");
                    return AbstractC166987dD.A1J(kx0);
                }
                kx0 = new C45984KWy(c83403nh, c2ec);
                return AbstractC166987dD.A1J(kx0);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public C47913LEh(UserSession userSession, L7X l7x, L8o l8o) {
        AbstractC167017dG.A1P(userSession, l8o);
        this.A03 = userSession;
        this.A02 = l8o;
        this.A00 = l7x;
        this.A01 = C2JD.A00(userSession);
    }
}
