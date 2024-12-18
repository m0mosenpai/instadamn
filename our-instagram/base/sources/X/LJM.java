package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.direct.share.ui.mediacomposer.commands.aiagent.ImagineAnimatePlainTextCommand;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LJM {
    public static final void A00(EnumC46271Ke3 enumC46271Ke3, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC33384EpH enumC33384EpH, Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2) {
        String str3;
        String str4;
        String str5;
        C14360o3.A0B(userSession, 0);
        if (AbstractC46802Kmx.A00(userSession)) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_ai_sticker_interaction");
            if (A0f.isSampled()) {
                if (enumC33384EpH != null) {
                    A0f.AAP("modal_type", enumC33384EpH.A00);
                }
                if (num3 != null) {
                    switch (num3.intValue()) {
                        case 1:
                            str5 = "bad_result";
                            break;
                        case 2:
                            str5 = ImagineAnimatePlainTextCommand.TRIGGER_KEY;
                            break;
                        case 3:
                            str5 = "remove_animation";
                            break;
                        case 4:
                            str5 = "report";
                            break;
                        default:
                            str5 = "good_result";
                            break;
                    }
                    A0f.AAP("menu_selection", str5);
                }
                if (enumC46271Ke3 != null) {
                    A0f.A8R(enumC46271Ke3, "tray_type");
                }
                if (str != null) {
                    A0f.AAk("sticker_ids", AbstractC166987dD.A1J(str));
                }
                switch (num.intValue()) {
                    case 0:
                        str3 = "long_press";
                        break;
                    case 1:
                        str3 = "long_press_menu_click";
                        break;
                    case 2:
                        str3 = "MODAL_OPENED";
                        break;
                    case 3:
                        str3 = "MODAL_CLOSED";
                        break;
                    case 4:
                        str3 = "MODAL_BUTTON_CLICKED";
                        break;
                    case 5:
                        str3 = "AI_STICKER_FULL_SHEET_OPENED";
                        break;
                    default:
                        str3 = "AI_STICKER_FULL_SHEET_CLOSED";
                        break;
                }
                A0f.AAP(MSV.A00(53), str3);
                switch (num2.intValue()) {
                    case 0:
                        str4 = "sticker_tray";
                        break;
                    case 1:
                        str4 = "stories_sticker_tray";
                        break;
                    default:
                        str4 = DialogModule.KEY_MESSAGE;
                        break;
                }
                AbstractC31171DnF.A1G(A0f, str4);
                A0f.AAP("bottom_sheet_session_id", str2);
                A0f.A7v("is_animated", bool);
                A0f.Cht();
            }
        }
    }

    public static final void A02(EnumC46271Ke3 enumC46271Ke3, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, List list) {
        C14360o3.A0B(enumC46271Ke3, 6);
        if (AbstractC46802Kmx.A00(userSession)) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_ai_sticker_model_response_received");
            if (A0f.isSampled()) {
                if (str != null) {
                    A0f.AAP("error_message", str);
                }
                if (list == null) {
                    A0f.A9K("sticker_count", AbstractC167007dF.A0d());
                    A0f.AAk("sticker_ids", null);
                } else {
                    A0f.A9K("sticker_count", AbstractC31171DnF.A0V(list.size()));
                    A0f.AAk("sticker_ids", list);
                }
                A0f.AAP("search_query", str2);
                JQ1.A0c(enumC46271Ke3, A0f, str3, str4);
                A0f.Cht();
            }
        }
    }

    public static final void A01(EnumC46271Ke3 enumC46271Ke3, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, String str, String str2, String str3, List list, boolean z) {
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        C14360o3.A0B(enumC46271Ke3, 5);
        if (AbstractC46802Kmx.A00(userSession)) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_ai_sticker_impression");
            if (A0f.isSampled()) {
                A0f.AAP("search_query", str);
                A0f.A9K("sticker_count", AbstractC31171DnF.A0V(list.size()));
                A0f.AAk("sticker_ids", list);
                JQ1.A0c(enumC46271Ke3, A0f, str2, str3);
                A0f.A7v("is_animated", Boolean.valueOf(z));
                A0f.A9K("sticker_position_index", l);
                A0f.Cht();
            }
        }
    }

    public static final void A03(EnumC46295KeR enumC46295KeR, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, String str, String str2, List list, boolean z) {
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        if (AbstractC46802Kmx.A00(userSession)) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_direct_sticker_impression");
            if (A0f.isSampled()) {
                A0f.AAP("search_query", str);
                A0f.AAk("sticker_ids", list);
                A0f.A8R(enumC46295KeR, "sticker_type");
                A0f.AAP("bottom_sheet_session_id", str2);
                A0f.A9K("sticker_position_index", l);
                A0f.A7v("is_animated", Boolean.valueOf(z));
                A0f.Cht();
            }
        }
    }
}
