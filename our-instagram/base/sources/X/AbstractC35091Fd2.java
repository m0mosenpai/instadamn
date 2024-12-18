package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fd2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35091Fd2 {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, Integer num2) {
        String str;
        String str2;
        C14360o3.A0B(userSession, 0);
        switch (num.intValue()) {
            case 1:
                str = "tagged_posts_bloks_settings";
                break;
            case 2:
                str = "edit_tag_profile";
                break;
            case 3:
                str = AbstractC111324zv.A00(2872);
                break;
            case 4:
                str = "tagged_posts_native_settings";
                break;
            case 5:
                str = "your_activity_tags_menu";
                break;
            default:
                str = "pending_tags_notifications";
                break;
        }
        switch (num2.intValue()) {
            case 0:
                str2 = "enter_tagged_posts_screen";
                break;
            case 1:
                str2 = "enter_pending_tags_screen";
                break;
            case 2:
                str2 = "enter_spam_tags_screen";
                break;
            case 3:
                str2 = "manually_approve_tags_toggled_on";
                break;
            default:
                str2 = "manually_approve_tags_toggled_off";
                break;
        }
        A01(interfaceC11380iw, userSession, str, str2, null);
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(interfaceC11380iw, userSession, 2), AbstractC111324zv.A00(990));
        if (A0f.isSampled()) {
            A0f.AAP("event_name", str2);
            A0f.AAP("entrypoint", str);
            AbstractC25233BEq.A17(A0f, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str3);
            A0f.Cht();
        }
    }

    public static final void A02(UserSession userSession, String str, String str2) {
        AbstractC167017dG.A1P(str2, userSession);
        A01(null, userSession, str, str2, null);
    }
}
