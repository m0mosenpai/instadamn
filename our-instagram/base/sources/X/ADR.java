package X;

import com.instagram.common.session.UserSession;
import java.util.Calendar;

/* loaded from: classes4.dex */
public abstract class ADR {
    public static final void A01(AAE aae) {
        aae.A02 = null;
        aae.A00 = null;
        aae.A01 = null;
        aae.A06.A02();
        aae.A03.setVisibility(8);
        aae.A05.setVisibility(8);
        aae.A04.setVisibility(8);
    }

    public static final void A00(MUD mud, UserSession userSession) {
        InterfaceC19610xo ARD;
        C148276lx c148276lx = (C148276lx) mud.A00;
        if (C14360o3.A0K(c148276lx, C148276lx.A1T) && AbstractC166987dD.A0x(userSession).getLong("stories_template_new_sticker_time_stamp", 0L) == 0) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            ARD = AbstractC166987dD.A0w(A00);
            ARD.E7G("stories_template_new_sticker_time_stamp", currentTimeMillis);
        } else if (c148276lx.A00() == EnumC150226pU.A0N) {
            if (AbstractC166987dD.A0x(userSession).getLong("cutout_anything_banner_nux_time_stamp_ms", 0L) == 0) {
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                long currentTimeMillis2 = System.currentTimeMillis();
                ARD = AbstractC166987dD.A0w(A002);
                ARD.E7G("cutout_anything_banner_nux_time_stamp_ms", currentTimeMillis2);
            } else {
                if (!C23031Ai.A07(AbstractC23021Ah.A00(userSession), "cutout_anything_banner_nux_time_stamp_ms", 4L)) {
                    return;
                }
                AbstractC166987dD.A1Z(new MBT(userSession, null, 42), AbstractC167017dG.A0w(C12L.A00, 1596010039));
                return;
            }
        } else {
            if (c148276lx.A00() == EnumC150226pU.A14) {
                C23031Ai A003 = AbstractC23021Ah.A00(userSession);
                InterfaceC16530ry interfaceC16530ry = A003.A6Z;
                C0YR[] c0yrArr = C23031Ai.A8c;
                if (AbstractC166987dD.A0N(interfaceC16530ry.CES(A003, c0yrArr[133])) != 0) {
                    return;
                }
                C23031Ai A004 = AbstractC23021Ah.A00(userSession);
                long currentTimeMillis3 = System.currentTimeMillis();
                A004.A6Z.Egi(A004, Long.valueOf(currentTimeMillis3), c0yrArr[133]);
                return;
            }
            if (c148276lx.A00() != EnumC150226pU.A1c) {
                return;
            }
            InterfaceC19630xq interfaceC19630xq = AbstractC149676oK.A00(userSession).A01;
            int i = interfaceC19630xq.getInt("uprank_story_sticker_last_seen_month", 0);
            int i2 = Calendar.getInstance().get(2);
            if (i == i2) {
                ARD = AbstractC167017dG.A0g(interfaceC19630xq, "uprank_story_sticker_impression_for_current_month");
            } else {
                ARD = interfaceC19630xq.ARD();
                ARD.E7D("uprank_story_sticker_impression_for_current_month", 1);
                ARD.E7D("uprank_story_sticker_last_seen_month", i2);
            }
        }
        ARD.apply();
    }
}
