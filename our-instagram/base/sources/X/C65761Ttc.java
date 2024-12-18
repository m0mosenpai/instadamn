package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: X.Ttc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65761Ttc {
    public final InterfaceC11380iw A00;
    public final C18920wW A01;
    public final UserSession A02;

    public static final void A02(C65761Ttc c65761Ttc, C69436VnL c69436VnL, String str, String str2) {
        A01(c65761Ttc, c69436VnL, null, null, null, null, null, null, null, null, str, str2, null, null);
    }

    public final void A03(C69436VnL c69436VnL, Boolean bool, Long l, Long l2, Long l3, String str, boolean z, boolean z2) {
        C14360o3.A0B(str, 3);
        A01(this, c69436VnL, Boolean.valueOf(z), Boolean.valueOf(z2), bool, null, null, l, l2, l3, "ig_quiet_mode_toggled", str, null, null);
    }

    public final void A04(C69436VnL c69436VnL, String str, String str2, String str3, long j, long j2, boolean z) {
        AbstractC167007dF.A1G(str, 4, str2);
        A01(this, c69436VnL, Boolean.valueOf(z), null, null, Long.valueOf(j), Long.valueOf(j2), null, null, null, "ig_quiet_mode_error_event", str, null, AbstractC25233BEq.A0p(AbstractC43591JPw.A00(77), str3, new C09530e4(AbstractC111324zv.A00(4393), str2)));
    }

    public static void A00(C18920wW c18920wW, C69436VnL c69436VnL, String str, String str2) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_quiet_mode_action");
        A00.AAP("action", str);
        A00.A7v("enabled", Boolean.valueOf(c69436VnL.A09));
        A00.A7v("is_in_quiet_mode", Boolean.valueOf(c69436VnL.A07));
        A00.A9K("start_interval", Long.valueOf(c69436VnL.A05));
        A00.A9K("end_interval", Long.valueOf(c69436VnL.A00));
        A00.A7v("pause_enabled", Boolean.valueOf(c69436VnL.A08));
        A00.A9K("pause_interval_start", Long.valueOf(c69436VnL.A02));
        A00.A9K("pause_interval_end", Long.valueOf(c69436VnL.A01));
        A00.A9K("pause_selected_interval", Long.valueOf(c69436VnL.A03));
        A00.AAk("days_of_week_enforced", c69436VnL.A06);
        A00.A9K("session_screen_time", Long.valueOf(c69436VnL.A04));
        A00.AAP("entrypoint", str2);
        String id = TimeZone.getDefault().getID();
        C14360o3.A07(id);
        A00.AAP("timezone", id);
        A00.Cht();
    }

    public static final void A01(C65761Ttc c65761Ttc, C69436VnL c69436VnL, Boolean bool, Boolean bool2, Boolean bool3, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, List list, Map map) {
        boolean z;
        long j;
        long j2;
        boolean z2;
        long j3;
        long j4;
        long j5;
        C18920wW c18920wW = c65761Ttc.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_quiet_mode_action");
        A00.AAP("action", str);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = c69436VnL.A09;
        }
        A00.A7v("enabled", Boolean.valueOf(z));
        A00.A7v("is_in_quiet_mode", Boolean.valueOf(c69436VnL.A07));
        if (l != null) {
            j = l.longValue();
        } else {
            j = c69436VnL.A05;
        }
        A00.A9K("start_interval", Long.valueOf(j));
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = c69436VnL.A00;
        }
        A00.A9K("end_interval", Long.valueOf(j2));
        if (bool3 != null) {
            z2 = bool3.booleanValue();
        } else {
            z2 = c69436VnL.A08;
        }
        A00.A7v("pause_enabled", Boolean.valueOf(z2));
        if (l3 != null) {
            j3 = l3.longValue();
        } else {
            j3 = c69436VnL.A02;
        }
        A00.A9K("pause_interval_start", Long.valueOf(j3));
        if (l4 != null) {
            j4 = l4.longValue();
        } else {
            j4 = c69436VnL.A01;
        }
        A00.A9K("pause_interval_end", Long.valueOf(j4));
        if (l5 != null) {
            j5 = l5.longValue();
        } else {
            j5 = c69436VnL.A03;
        }
        A00.A9K("pause_selected_interval", Long.valueOf(j5));
        if (list == null) {
            list = c69436VnL.A06;
        }
        A00.AAk("days_of_week_enforced", list);
        A00.A9K("session_screen_time", Long.valueOf(c69436VnL.A04));
        A00.AAP("entrypoint", str2);
        String id = TimeZone.getDefault().getID();
        C14360o3.A07(id);
        A00.AAP("timezone", id);
        if (bool2 != null) {
            A00.A7v("previous_enabled", bool2);
        }
        if (map != null) {
            A00.A9M("extra_event_data", map);
        }
        A00.Cht();
    }

    public /* synthetic */ C65761Ttc(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        C14360o3.A0B(A01, 3);
        this.A02 = userSession;
        this.A00 = interfaceC11380iw;
        this.A01 = A01;
    }
}
