package X;

import java.util.Map;

/* renamed from: X.2et, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54392et implements InterfaceC11380iw, InterfaceC13050lr {
    public static final String __redex_internal_original_name = "BadgingAnalyticsLoggerImpl";
    public final InterfaceC54362eq A00;
    public final C54402eu A01;

    public C54392et(C54402eu c54402eu, InterfaceC54362eq interfaceC54362eq) {
        C14360o3.A0B(interfaceC54362eq, 2);
        this.A01 = c54402eu;
        this.A00 = interfaceC54362eq;
    }

    public final void A02(EnumC58122lU enumC58122lU, EnumC58162lY enumC58162lY, C54432ex c54432ex) {
        C14360o3.A0B(enumC58162lY, 1);
        if (this.A00.Eix(enumC58122lU, enumC58162lY, c54432ex, C05F.A00, null)) {
            A00(this, enumC58122lU, enumC58162lY, c54432ex, null, "impression", null, 0, 0, 0, 0);
        }
    }

    public final void A03(EnumC58122lU enumC58122lU, EnumC58162lY enumC58162lY, C54432ex c54432ex, Integer num) {
        if (this.A00.Eix(enumC58122lU, enumC58162lY, c54432ex, C05F.A00, num)) {
            A00(this, enumC58122lU, enumC58162lY, c54432ex, num, "impression", null, 0, 0, 0, 0);
        }
    }

    public final void A04(EnumC58122lU enumC58122lU, EnumC58162lY enumC58162lY, C54432ex c54432ex, Integer num, int i, int i2, int i3, int i4) {
        if (this.A00.Eix(enumC58122lU, enumC58162lY, c54432ex, C05F.A00, num)) {
            A00(this, enumC58122lU, enumC58162lY, c54432ex, num, "impression", null, i, i2, i3, i4);
        }
    }

    public final void A05(EnumC58122lU enumC58122lU, EnumC58162lY enumC58162lY, C54432ex c54432ex, Map map) {
        C14360o3.A0B(enumC58162lY, 1);
        A00(this, enumC58122lU, enumC58162lY, c54432ex, null, "click", map, 0, 0, 0, 0);
    }

    public final void A06(EnumC58122lU enumC58122lU, EnumC58162lY enumC58162lY, C54432ex c54432ex, Map map) {
        C14360o3.A0B(enumC58162lY, 1);
        if (this.A00.Eix(enumC58122lU, enumC58162lY, c54432ex, C05F.A00, null)) {
            A00(this, enumC58122lU, enumC58162lY, c54432ex, null, "impression", map, 0, 0, 0, 0);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "badging";
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
    }

    public static final void A00(C54392et c54392et, EnumC58122lU enumC58122lU, EnumC58162lY enumC58162lY, C54432ex c54432ex, Integer num, String str, Map map, int i, int i2, int i3, int i4) {
        String obj;
        String obj2;
        C18920wW A01 = AbstractC12220kQ.A01(c54392et, c54392et.A01.A00);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "badging_event");
        if (A00.isSampled()) {
            A00.AAP("event_type", str);
            A00.AAP("use_case_id", c54432ex.A03.toString());
            A00.A9K("badge_value", Long.valueOf(c54432ex.A01 + c54432ex.A00));
            A00.A9K("badged_vertical_account_count", Long.valueOf(i));
            A00.A9K("badged_horizontal_account_count", Long.valueOf(i2));
            A00.A9K("vertical_badge_value", Long.valueOf(i3));
            A00.A9K("horizontal_badge_value", Long.valueOf(i4));
            if (enumC58162lY != null && (obj2 = enumC58162lY.toString()) != null) {
                A00.AAP("badge_position", obj2);
            }
            if (enumC58122lU != null && (obj = enumC58122lU.toString()) != null) {
                A00.AAP("badge_display_style", obj);
            }
            if (num != null) {
                A00.AAP("surface", AbstractC84693qI.A00(num));
            }
            if (map != null) {
                A00.A9M("extra_data", map);
            }
            A00.Cht();
        }
    }

    public final void A01(EnumC58122lU enumC58122lU, EnumC58162lY enumC58162lY, C54432ex c54432ex) {
        A00(this, enumC58122lU, enumC58162lY, c54432ex, null, "click", null, 0, 0, 0, 0);
    }
}
