package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BKQ {
    public final InterfaceC02550Ad A00;

    public final void A01(Integer num) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A00, "ig_sundial_gesture_system_events");
        if (A0f.isSampled()) {
            AbstractC25233BEq.A17(A0f, "action", "fullscreen_view_dismiss");
            A00(A0f, num);
        }
    }

    public final void A02(Integer num) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) this.A00, "ig_sundial_gesture_system_events");
        if (A0f.isSampled()) {
            AbstractC25233BEq.A17(A0f, "action", "fullscreen_view_start");
            A00(A0f, num);
        }
    }

    public BKQ(UserSession userSession) {
        this.A00 = AbstractC12220kQ.A02(userSession);
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, Integer num) {
        String str;
        switch (num.intValue()) {
            case 0:
                str = "TIMER";
                break;
            case 1:
                str = "MANUAL";
                break;
            case 2:
                str = "LONG_PRESS";
                break;
            case 3:
                str = "FANOUT_MENU";
                break;
            case 4:
                str = "EXIT_BUTTON";
                break;
            case 5:
                str = "REELS_VIEWER_SWIPE_OR_EXIT";
                break;
            case 6:
                str = "OVERFLOW_MENU";
                break;
            default:
                str = "PINCH";
                break;
        }
        interfaceC02590Ai.AAP("action_source", str);
        interfaceC02590Ai.AAP("options", null);
        interfaceC02590Ai.A9K("options_count", null);
        interfaceC02590Ai.A9M("metadata", null);
        interfaceC02590Ai.Cht();
    }
}
