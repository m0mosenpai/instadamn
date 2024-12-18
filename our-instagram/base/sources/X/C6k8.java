package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6k8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6k8 {
    public final C1QT A00;

    public C6k8(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = C1QS.A00(userSession);
    }

    public final void A00(Integer num) {
        String str;
        C1QT c1qt = this.A00;
        switch (num.intValue()) {
            case 0:
                str = "story_progress_complete";
                break;
            case 1:
                str = "back_button_pressed";
                break;
            case 2:
                str = "swipe_to_next_author";
                break;
            case 3:
                str = "swipe_to_previous_author";
                break;
            case 4:
                str = "swipe_to_leave_story_viewer";
                break;
            case 5:
                str = "tap_to_next_story";
                break;
            default:
                str = "tap_to_previous_story";
                break;
        }
        c1qt.flowAnnotate(18942971L, "story_item_exit_reason", str);
        c1qt.flowEndSuccess(18942971L);
    }
}
