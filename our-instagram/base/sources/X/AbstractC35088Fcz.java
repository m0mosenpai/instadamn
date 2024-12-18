package X;

import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.Fcz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35088Fcz {
    public static final void A00(AbstractC12990ll abstractC12990ll, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        String str8;
        String str9 = null;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_collections");
        if (A0f.isSampled()) {
            A0f.AAP("module_name", str);
            switch (num.intValue()) {
                case 0:
                    str7 = "collection_viewer_entered";
                    break;
                case 1:
                    str7 = "collection_viewer_exited";
                    break;
                case 2:
                    str7 = "send_button_visible";
                    break;
                case 3:
                    str7 = "send_button_tooltip_shown";
                    break;
                case 4:
                    str7 = "send_button_clicked";
                    break;
                case 5:
                    str7 = "collection_granting_read_access_sending";
                    break;
                case 6:
                    str7 = "collection_granting_read_access_success";
                    break;
                case 7:
                    str7 = "collection_granting_read_access_failure";
                    break;
                case 8:
                    str7 = "create_new_thread_starting";
                    break;
                case 9:
                    str7 = "create_new_thread_success";
                    break;
                case 10:
                    str7 = "create_new_thread_failure";
                    break;
                case 11:
                    str7 = "direct_collection_sending";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str7 = "direct_collection_send_success";
                    break;
                default:
                    str7 = "direct_collection_send_failure";
                    break;
            }
            AbstractC31171DnF.A1B(A0f, str7);
            AbstractC31171DnF.A1G(A0f, str2);
            A0f.AAP("event_desc", str3);
            A0f.A9K("age", null);
            if (str4 != null) {
                str8 = AbstractC167007dF.A0h(str4);
            } else {
                str8 = null;
            }
            A0f.AAP("user_type", str8);
            if (num2 != null) {
                switch (num2.intValue()) {
                    case 1:
                        str9 = "private";
                        break;
                    case 2:
                        str9 = "collaborative";
                        break;
                    default:
                        str9 = "public";
                        break;
                }
            }
            A0f.AAP("collection_type", str9);
            A0f.AAP("collection_id", str5);
            AbstractC25233BEq.A17(A0f, "collection_name", str6);
            A0f.Cht();
        }
    }

    public static final void A01(AbstractC12990ll abstractC12990ll, Integer num, String str, String str2, String str3) {
        A00(abstractC12990ll, num, null, str, null, str2, str3, null, null);
    }

    public static final void A02(UserSession userSession, SavedCollection savedCollection, String str, String str2) {
        String str3;
        String str4;
        Integer num;
        String str5;
        C14360o3.A0B(userSession, 0);
        boolean A1V = AbstractC167007dF.A1V(str2);
        Integer num2 = C05F.A00;
        if (savedCollection != null) {
            str3 = AbstractC35089Fd0.A01(savedCollection.A01(userSession));
            str4 = savedCollection.A0F;
            if (savedCollection.A05 != null) {
                num = C05F.A0C;
            } else if (savedCollection.A06() == A1V) {
                num = num2;
            }
            str5 = savedCollection.A0G;
            A00(userSession, num2, num, str, str2, null, str3, str4, str5);
        }
        str3 = "null";
        str4 = null;
        num = null;
        if (savedCollection == null) {
            str5 = null;
            A00(userSession, num2, num, str, str2, null, str3, str4, str5);
        }
        str5 = savedCollection.A0G;
        A00(userSession, num2, num, str, str2, null, str3, str4, str5);
    }
}
