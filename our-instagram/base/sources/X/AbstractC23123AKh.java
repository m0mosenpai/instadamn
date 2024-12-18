package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.AKh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23123AKh {
    public static final C194808jg A01(Context context, UserSession userSession, Venue venue, Integer num) {
        C194808jg c194808jg;
        Integer num2;
        C14360o3.A0B(context, 1);
        if (num != null) {
            int intValue = num.intValue();
            Resources resources = context.getResources();
            int A01 = AbstractC188878Yd.A01(context);
            int A0E = AbstractC166997dE.A0E(resources);
            int A0C = AbstractC166997dE.A0C(resources);
            List list = C202308xA.A0T;
            C6S5 c6s5 = C6S5.A04;
            int i = intValue;
            if (c6s5.ordinal() == 2) {
                i = AbstractC13950nL.A04(intValue);
            }
            C202308xA c202308xA = new C202308xA(context, userSession, null, new int[]{i, i}, A01, A0E, A0C, A00(c6s5, intValue));
            c202308xA.A02(venue);
            c202308xA.A02 = "location_sticker_text_tool_attached_subtle";
            C6S5 c6s52 = C6S5.A06;
            int i2 = intValue;
            if (c6s52.ordinal() == 2) {
                i2 = AbstractC13950nL.A04(intValue);
            }
            C202308xA c202308xA2 = new C202308xA(context, userSession, null, new int[]{i2, i2}, A01, A0E, A0C, A00(c6s52, intValue));
            c202308xA2.A02(venue);
            c202308xA2.A02 = "location_sticker_text_tool_attached_subtle";
            C6S5 c6s53 = C6S5.A05;
            int i3 = intValue;
            if (c6s53.ordinal() == 2) {
                i3 = AbstractC13950nL.A04(intValue);
            }
            C202308xA c202308xA3 = new C202308xA(context, userSession, null, new int[]{i3, i3}, A01, A0E, A0C, A00(c6s53, intValue));
            c202308xA3.A02(venue);
            c202308xA3.A02 = "location_sticker_text_tool_attached_subtle";
            c194808jg = new C194808jg(context, userSession, Arrays.asList(c202308xA, c202308xA2, c202308xA3));
            num2 = Integer.valueOf(intValue);
        } else {
            boolean A012 = AbstractC172687md.A01(userSession);
            Resources resources2 = context.getResources();
            int A013 = AbstractC188878Yd.A01(context);
            int A0E2 = AbstractC166997dE.A0E(resources2);
            int A0C2 = AbstractC166997dE.A0C(resources2);
            ArrayList A1E = AbstractC166987dD.A1E();
            if (A012) {
                Iterator A14 = AbstractC166997dE.A14(AbstractC06930Yk.A07(AbstractC166987dD.A1L(EnumC223079sm.A06, "location_sticker_redesign_default"), AbstractC166987dD.A1L(EnumC223079sm.A0D, "location_sticker_redesign_subtle"), AbstractC166987dD.A1L(EnumC223079sm.A0B, "location_sticker_redesign_rainbow"), AbstractC166987dD.A1L(EnumC223079sm.A08, "location_sticker_redesign_hero"), AbstractC166987dD.A1L(EnumC223079sm.A0F, "location_sticker_redesign_vibrant"), AbstractC166987dD.A1L(EnumC223079sm.A09, "location_sticker_redesign_monotone")));
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    EnumC223079sm enumC223079sm = (EnumC223079sm) A1K.getKey();
                    String str = (String) A1K.getValue();
                    C202308xA c202308xA4 = new C202308xA(context, userSession, enumC223079sm, A013, A0E2, A0C2);
                    c202308xA4.A02(venue);
                    c202308xA4.A02 = str;
                    A1E.add(c202308xA4);
                }
            } else {
                List list2 = C202308xA.A0T;
                C202308xA c202308xA5 = new C202308xA(context, userSession, EnumC223079sm.A0E, A013, A0E2, A0C2);
                c202308xA5.A02(venue);
                c202308xA5.A02 = "location_sticker_vibrant";
                A1E.add(c202308xA5);
                C202308xA c202308xA6 = new C202308xA(context, userSession, EnumC223079sm.A0C, A013, A0E2, A0C2);
                c202308xA6.A02(venue);
                c202308xA6.A02 = "location_sticker_subtle";
                A1E.add(c202308xA6);
                C202308xA c202308xA7 = new C202308xA(context, userSession, EnumC223079sm.A0A, A013, A0E2, A0C2);
                c202308xA7.A02(venue);
                c202308xA7.A02 = "location_sticker_rainbow";
                A1E.add(c202308xA7);
                C202308xA c202308xA8 = new C202308xA(context, userSession, EnumC223079sm.A07, A013, A0E2, A0C2);
                c202308xA8.A02(venue);
                c202308xA8.A02 = "location_sticker_hero";
                A1E.add(c202308xA8);
            }
            c194808jg = new C194808jg(context, userSession, A1E);
            num2 = null;
        }
        c194808jg.A03 = new C217869kJ(venue, num2);
        return c194808jg;
    }

    public static final void A02(C194808jg c194808jg, int i) {
        ArrayList A06 = c194808jg.A06(C202308xA.class);
        C202308xA c202308xA = (C202308xA) A06.get(0);
        C6S5 c6s5 = C6S5.A04;
        int i2 = i;
        if (c6s5.ordinal() == 2) {
            i2 = AbstractC13950nL.A04(i);
        }
        c202308xA.A04 = new int[]{i2, i2};
        C202308xA.A01(c202308xA);
        c202308xA.invalidateSelf();
        C202308xA c202308xA2 = (C202308xA) A06.get(0);
        c202308xA2.A00 = A00(c6s5, i);
        c202308xA2.invalidateSelf();
        C202308xA c202308xA3 = (C202308xA) A06.get(1);
        C6S5 c6s52 = C6S5.A06;
        int i3 = i;
        if (c6s52.ordinal() == 2) {
            i3 = AbstractC13950nL.A04(i);
        }
        c202308xA3.A04 = new int[]{i3, i3};
        C202308xA.A01(c202308xA3);
        c202308xA3.invalidateSelf();
        C202308xA c202308xA4 = (C202308xA) A06.get(1);
        c202308xA4.A00 = A00(c6s52, i);
        c202308xA4.invalidateSelf();
        C202308xA c202308xA5 = (C202308xA) A06.get(2);
        C6S5 c6s53 = C6S5.A05;
        int i4 = i;
        if (c6s53.ordinal() == 2) {
            i4 = AbstractC13950nL.A04(i);
        }
        c202308xA5.A04 = new int[]{i4, i4};
        C202308xA.A01(c202308xA5);
        c202308xA5.invalidateSelf();
        C202308xA c202308xA6 = (C202308xA) A06.get(2);
        c202308xA6.A00 = A00(c6s53, i);
        c202308xA6.invalidateSelf();
    }

    public static final void A03(C194808jg c194808jg, C6S5 c6s5) {
        int ordinal = c6s5.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 0) {
                    c194808jg.A0B(2);
                    return;
                }
                return;
            }
            c194808jg.A0B(1);
            return;
        }
        c194808jg.A0B(0);
    }

    public static final int A00(C6S5 c6s5, int i) {
        int ordinal = c6s5.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 0) {
                    return AbstractC167017dG.A02(AbstractC13950nL.A04(i), 64);
                }
            } else {
                return i;
            }
        }
        return AbstractC13950nL.A04(i);
    }
}
