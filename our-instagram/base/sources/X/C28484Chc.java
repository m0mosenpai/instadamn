package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Map;

/* renamed from: X.Chc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28484Chc {
    public final UserSession A00;

    public C28484Chc(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A06(UtmMetadata utmMetadata, String str, String str2) {
        String str3;
        String str4;
        String str5;
        C25531Mh A01 = A01(this, str, 0);
        if (AbstractC25226BEj.A1Z(A01)) {
            A01.A0k("creation_nux_screen_shown");
            C09530e4 A1L = AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            String str6 = null;
            if (utmMetadata != null) {
                str3 = utmMetadata.A03;
            } else {
                str3 = null;
            }
            C09530e4 A1L2 = AbstractC166987dD.A1L("utm_source", str3);
            if (utmMetadata != null) {
                str4 = utmMetadata.A02;
            } else {
                str4 = null;
            }
            C09530e4 A1L3 = AbstractC166987dD.A1L("utm_medium", str4);
            if (utmMetadata != null) {
                str5 = utmMetadata.A00;
            } else {
                str5 = null;
            }
            C09530e4 A1L4 = AbstractC166987dD.A1L("utm_campaign", str5);
            if (utmMetadata != null) {
                str6 = utmMetadata.A01;
            }
            AbstractC25230BEn.A1F(A01, str2, AbstractC25236BEt.A0c(str6, A1L, A1L2, A1L3, A1L4));
        }
    }

    public final void A0C(String str, String str2) {
        C25531Mh A01 = A01(this, str, 0);
        if (AbstractC25226BEj.A1Z(A01)) {
            A01.A0k("advanced_settings_screen_field_regeneration_icon_clicked");
            A01.A0w(AbstractC25233BEq.A0p("field_to_regenerate", str2, AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str)));
            A01.Cht();
        }
    }

    public final void A0R(String str, String str2, String str3) {
        C25531Mh A00;
        String str4;
        C14360o3.A0B(str, 0);
        if (str.equals("settings_add_instruction")) {
            A00 = A00(this);
            if (AbstractC25226BEj.A1Z(A00)) {
                str4 = "settings_add_instruction_back_clicked";
            } else {
                return;
            }
        } else {
            if (!str.equals("settings_edit_instruction")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                str4 = "settings_edit_instruction_back_clicked";
            }
        }
        A04(A00, AbstractC25233BEq.A0m(A00, str4, str2), str3);
        A00.Cht();
    }

    public static final C25531Mh A00(C28484Chc c28484Chc) {
        return new C25531Mh(AbstractC166987dD.A0f(AbstractC12220kQ.A02(c28484Chc.A00), "gen_ai_studio_ig_client_event"), 163);
    }

    public static final boolean A05(IGAIAgentType iGAIAgentType) {
        if (iGAIAgentType != IGAIAgentType.A08 && iGAIAgentType != IGAIAgentType.A04) {
            return false;
        }
        return true;
    }

    public final void A08(IGAIAgentType iGAIAgentType, String str, boolean z) {
        String str2;
        String str3;
        if (!C14360o3.A0K(str, "867051314767696")) {
            C25531Mh A00 = A00(this);
            if (AbstractC25226BEj.A1Z(A00)) {
                A00.A0k("ai_agent_story_posted");
                Long l = null;
                if (str != null) {
                    l = AbstractC166997dE.A0j(str);
                }
                A00.A0i(l);
                if (iGAIAgentType == null || (str2 = iGAIAgentType.A00) == null) {
                    str2 = "";
                }
                C09530e4 A1L = AbstractC166987dD.A1L("agent_type", str2);
                if (z) {
                    str3 = "agent_share";
                } else {
                    str3 = "snippet_share";
                }
                A00.A0w(AbstractC25233BEq.A0p(TraceFieldType.ContentType, str3, A1L));
                A00.Cht();
            }
        }
    }

    public final void A09(IGAIAgentType iGAIAgentType, String str, boolean z, boolean z2) {
        String str2;
        String str3;
        String str4;
        if (z && !A05(iGAIAgentType)) {
            return;
        }
        C25531Mh A00 = A00(this);
        if (!AbstractC25226BEj.A1Z(A00)) {
            return;
        }
        A00.A0k("ai_agent_story_link_clicked");
        Long l = null;
        if (str != null) {
            l = AbstractC166997dE.A0j(str);
        }
        A00.A0i(l);
        if (iGAIAgentType == null || (str2 = iGAIAgentType.A00) == null) {
            str2 = "";
        }
        C09530e4 A1L = AbstractC166987dD.A1L("agent_type", str2);
        if (z) {
            str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str3 = "0";
        }
        C09530e4 A1L2 = AbstractC166987dD.A1L("is_user_eligible", str3);
        if (z2) {
            str4 = "agent_share";
        } else {
            str4 = "snippet_share";
        }
        A00.A0w(AbstractC25232BEp.A1F(TraceFieldType.ContentType, str4, A1L, A1L2));
        A00.Cht();
    }

    public static C25531Mh A01(C28484Chc c28484Chc, Object obj, int i) {
        C14360o3.A0B(obj, i);
        return A00(c28484Chc);
    }

    public static C25531Mh A02(InterfaceC09390do interfaceC09390do) {
        return A00((C28484Chc) interfaceC09390do.getValue());
    }

    public static C28484Chc A03(InterfaceC09390do interfaceC09390do) {
        return new C28484Chc((UserSession) interfaceC09390do.getValue());
    }

    public static void A04(C25531Mh c25531Mh, Long l, Object obj) {
        c25531Mh.A0i(l);
        c25531Mh.A0w(AbstractC16850sd.A0M(new C09530e4(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, obj)));
    }

    public final void A07(IGAIAgentType iGAIAgentType, String str, boolean z) {
        String str2;
        String str3;
        if (A05(iGAIAgentType)) {
            C25531Mh A00 = A00(this);
            if (AbstractC25226BEj.A1Z(A00)) {
                A00.A0k("share_sheet_add_to_story_clicked");
                Long l = null;
                if (str != null) {
                    l = AbstractC166997dE.A0j(str);
                }
                A00.A0i(l);
                if (iGAIAgentType == null || (str2 = iGAIAgentType.A00) == null) {
                    str2 = "";
                }
                C09530e4 A1L = AbstractC166987dD.A1L("agent_type", str2);
                if (z) {
                    str3 = "agent_share";
                } else {
                    str3 = "snippet_share";
                }
                A00.A0w(AbstractC25233BEq.A0p(TraceFieldType.ContentType, str3, A1L));
                A00.Cht();
            }
        }
    }

    public final void A0A(String str) {
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0i(AbstractC25233BEq.A0m(A00, "direct_thread_edit_ai_icon_shown", str));
            A00.Cht();
        }
    }

    public final void A0B(String str) {
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0i(AbstractC25233BEq.A0m(A00, "thread_view_bar_ai_studio_button_shown", str));
            A00.Cht();
        }
    }

    public final void A0D(String str, String str2) {
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            A04(A00, AbstractC25233BEq.A0m(A00, "settings_edit_instruction_delete_clicked", str), str2);
            A00.Cht();
        }
    }

    public final void A0E(String str, String str2) {
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            A04(A00, AbstractC25233BEq.A0m(A00, "settings_edit_instruction_delete_confirmation_cancel_clicked", str), str2);
            A00.Cht();
        }
    }

    public final void A0F(String str, String str2) {
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            A04(A00, AbstractC25233BEq.A0m(A00, "settings_edit_instruction_delete_confirmation_delete_clicked", str), str2);
            A00.Cht();
        }
    }

    public final void A0G(String str, String str2) {
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            A04(A00, AbstractC25233BEq.A0m(A00, "settings_edit_instruction_delete_confirmation_dialog_shown", str), str2);
            A00.Cht();
        }
    }

    public final void A0H(String str, String str2) {
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            A04(A00, AbstractC25233BEq.A0m(A00, "settings_edit_example_dialogue_delete_button_clicked", str), str2);
            A00.Cht();
        }
    }

    public final void A0I(String str, String str2) {
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            A04(A00, AbstractC25233BEq.A0m(A00, "settings_edit_example_dialogue_delete_confirmation_cancel_clicked", str), str2);
            A00.Cht();
        }
    }

    public final void A0J(String str, String str2) {
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            A04(A00, AbstractC25233BEq.A0m(A00, "settings_edit_example_dialogue_delete_confirmation_delete_clicked", str), str2);
            A00.Cht();
        }
    }

    public final void A0K(String str, String str2) {
        C25531Mh A00 = A00(this);
        if (AbstractC25226BEj.A1Z(A00)) {
            A04(A00, AbstractC25233BEq.A0m(A00, "settings_edit_example_dialogue_delete_confirmation_dialog_shown", str), str2);
            A00.Cht();
        }
    }

    public final void A0L(String str, String str2, String str3) {
        C25531Mh A00;
        String str4;
        int A07 = AbstractC25235BEs.A07(str);
        if (A07 != 1466595302) {
            if (A07 != 1872262023) {
                if (A07 == 2070440838 && str.equals("settings_edit_example_dialogue")) {
                    A00 = A00(this);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        str4 = "settings_edit_example_dialogue_back_button_clicked";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                if (!str.equals("settings_add_example_dialogue")) {
                    return;
                }
                A00 = A00(this);
                if (!AbstractC25226BEj.A1Z(A00)) {
                    return;
                } else {
                    str4 = "settings_add_example_dialogue_back_button_clicked";
                }
            }
            A04(A00, AbstractC25233BEq.A0m(A00, str4, str2), str3);
        } else {
            if (!str.equals("in_thread_add_example_dialogue")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                A00.A0i(AbstractC25233BEq.A0m(A00, "thread_view_add_example_dialogue_back_clicked", str2));
            }
        }
        A00.Cht();
    }

    public final void A0M(String str, String str2, String str3) {
        C25531Mh A00;
        String str4;
        int A07 = AbstractC25235BEs.A07(str);
        if (A07 != 1466595302) {
            if (A07 != 1872262023) {
                if (A07 == 2070440838 && str.equals("settings_edit_example_dialogue")) {
                    A00 = A00(this);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        str4 = "settings_edit_example_dialogue_done_button_clicked";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                if (!str.equals("settings_add_example_dialogue")) {
                    return;
                }
                A00 = A00(this);
                if (!AbstractC25226BEj.A1Z(A00)) {
                    return;
                } else {
                    str4 = "settings_add_example_dialogue_done_button_clicked";
                }
            }
            A04(A00, AbstractC25233BEq.A0m(A00, str4, str2), str3);
        } else {
            if (!str.equals("in_thread_add_example_dialogue")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                A00.A0i(AbstractC25233BEq.A0m(A00, "thread_view_add_example_dialogue_done_clicked", str2));
            }
        }
        A00.Cht();
    }

    public final void A0N(String str, String str2, String str3) {
        C25531Mh A00;
        String str4;
        int A07 = AbstractC25235BEs.A07(str);
        if (A07 != 1466595302) {
            if (A07 != 1872262023) {
                if (A07 == 2070440838 && str.equals("settings_edit_example_dialogue")) {
                    A00 = A00(this);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        str4 = "settings_edit_example_dialogue_exit_back_button_clicked";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                if (!str.equals("settings_add_example_dialogue")) {
                    return;
                }
                A00 = A00(this);
                if (!AbstractC25226BEj.A1Z(A00)) {
                    return;
                } else {
                    str4 = "settings_add_example_dialogue_exit_back_button_clicked";
                }
            }
            A04(A00, AbstractC25233BEq.A0m(A00, str4, str2), str3);
        } else {
            if (!str.equals("in_thread_add_example_dialogue")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                A00.A0i(AbstractC25233BEq.A0m(A00, "thread_view_add_example_dialogue_exit_confirmation_dialog_shown", str2));
            }
        }
        A00.Cht();
    }

    public final void A0O(String str, String str2, String str3) {
        C25531Mh A00;
        String str4;
        int A07 = AbstractC25235BEs.A07(str);
        if (A07 != 1466595302) {
            if (A07 != 1872262023) {
                if (A07 == 2070440838 && str.equals("settings_edit_example_dialogue")) {
                    A00 = A00(this);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        str4 = "settings_edit_example_dialogue_exit_confirmation_cancel_clicked";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                if (!str.equals("settings_add_example_dialogue")) {
                    return;
                }
                A00 = A00(this);
                if (!AbstractC25226BEj.A1Z(A00)) {
                    return;
                } else {
                    str4 = "settings_add_example_dialogue_exit_confirmation_cancel_clicked";
                }
            }
            A04(A00, AbstractC25233BEq.A0m(A00, str4, str2), str3);
        } else {
            if (!str.equals("in_thread_add_example_dialogue")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                A00.A0i(AbstractC25233BEq.A0m(A00, "thread_view_add_example_dialogue_exit_confirmation_cancel_clicked", str2));
            }
        }
        A00.Cht();
    }

    public final void A0P(String str, String str2, String str3) {
        C25531Mh A00;
        String str4;
        int A07 = AbstractC25235BEs.A07(str);
        if (A07 != 1466595302) {
            if (A07 != 1872262023) {
                if (A07 == 2070440838 && str.equals("settings_edit_example_dialogue")) {
                    A00 = A00(this);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        str4 = "settings_edit_example_dialogue_exit_confirmation_discard_changes_clicked";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                if (!str.equals("settings_add_example_dialogue")) {
                    return;
                }
                A00 = A00(this);
                if (!AbstractC25226BEj.A1Z(A00)) {
                    return;
                } else {
                    str4 = "settings_add_example_dialogue_exit_confirmation_discard_changes_clicked";
                }
            }
            A04(A00, AbstractC25233BEq.A0m(A00, str4, str2), str3);
        } else {
            if (!str.equals("in_thread_add_example_dialogue")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                A00.A0i(AbstractC25233BEq.A0m(A00, "thread_view_add_example_dialogue_exit_confirmation_discard_changes_clicked", str2));
            }
        }
        A00.Cht();
    }

    public final void A0Q(String str, String str2, String str3) {
        C25531Mh A00;
        String str4;
        int A07 = AbstractC25235BEs.A07(str);
        if (A07 != 1466595302) {
            if (A07 != 1872262023) {
                if (A07 == 2070440838 && str.equals("settings_edit_example_dialogue")) {
                    A00 = A00(this);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        str4 = "settings_edit_example_dialogue_screen_shown";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                if (!str.equals("settings_add_example_dialogue")) {
                    return;
                }
                A00 = A00(this);
                if (!AbstractC25226BEj.A1Z(A00)) {
                    return;
                } else {
                    str4 = "settings_add_example_dialogue_screen_shown";
                }
            }
            A04(A00, AbstractC25233BEq.A0m(A00, str4, str2), str3);
        } else {
            if (!str.equals("in_thread_add_example_dialogue")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                A00.A0i(AbstractC25233BEq.A0m(A00, "thread_view_add_example_dialogue_screen_shown", str2));
            }
        }
        A00.Cht();
    }

    public final void A0S(String str, String str2, String str3) {
        C25531Mh A00;
        C09530e4 A1L;
        Map map;
        int A07 = AbstractC25235BEs.A07(str);
        if (A07 != -867825035) {
            if (A07 != -339786284) {
                if (A07 == 1866510131 && str.equals("in_thread_instruction")) {
                    A00 = A00(this);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        A00.A0i(AbstractC25233BEq.A0m(A00, "thread_view_add_instruction_done_clicked", str2));
                        A1L = AbstractC166987dD.A1L("has_changed", "true");
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                if (!str.equals("settings_add_instruction")) {
                    return;
                }
                A00 = A00(this);
                if (!AbstractC25226BEj.A1Z(A00)) {
                    return;
                }
                A00.A0i(AbstractC25233BEq.A0m(A00, "settings_add_instruction_done_clicked", str2));
                map = AbstractC25233BEq.A0p("has_changed", "true", AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3));
                A00.A0w(map);
                A00.Cht();
            }
        } else {
            if (!str.equals("settings_edit_instruction")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            }
            A00.A0i(AbstractC25233BEq.A0m(A00, "settings_edit_instruction_done_clicked", str2));
            A1L = AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
        }
        map = AbstractC16850sd.A0M(A1L);
        A00.A0w(map);
        A00.Cht();
    }

    public final void A0T(String str, String str2, String str3) {
        C25531Mh A00;
        String str4;
        int A07 = AbstractC25235BEs.A07(str);
        if (A07 != -867825035) {
            if (A07 != -339786284) {
                if (A07 == 1866510131 && str.equals("in_thread_instruction")) {
                    A00 = A00(this);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        A00.A0i(AbstractC25233BEq.A0m(A00, "thread_view_add_instruction_exit_confirmation_cancel_clicked", str2));
                        A00.Cht();
                    }
                    return;
                }
                return;
            }
            if (!str.equals("settings_add_instruction")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                str4 = "settings_add_instruction_exit_confirmation_cancel_clicked";
            }
        } else {
            if (!str.equals("settings_edit_instruction")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                str4 = "settings_edit_instruction_exit_confirmation_cancel_clicked";
            }
        }
        A04(A00, AbstractC25233BEq.A0m(A00, str4, str2), str3);
        A00.Cht();
    }

    public final void A0U(String str, String str2, String str3) {
        C25531Mh A00;
        String str4;
        int A07 = AbstractC25235BEs.A07(str);
        if (A07 != -867825035) {
            if (A07 != -339786284) {
                if (A07 == 1866510131 && str.equals("in_thread_instruction")) {
                    A00 = A00(this);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        A00.A0i(AbstractC25233BEq.A0m(A00, "thread_view_add_instruction_exit_confirmation_dialog_shown", str2));
                        A00.Cht();
                    }
                    return;
                }
                return;
            }
            if (!str.equals("settings_add_instruction")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                str4 = "Settings_add_instruction_exit_confirmation_dialog_shown";
            }
        } else {
            if (!str.equals("settings_edit_instruction")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                str4 = "settings_edit_instruction_exit_confirmation_dialog_shown";
            }
        }
        A04(A00, AbstractC25233BEq.A0m(A00, str4, str2), str3);
        A00.Cht();
    }

    public final void A0V(String str, String str2, String str3) {
        C25531Mh A00;
        String str4;
        int A07 = AbstractC25235BEs.A07(str);
        if (A07 != -867825035) {
            if (A07 != -339786284) {
                if (A07 == 1866510131 && str.equals("in_thread_instruction")) {
                    A00 = A00(this);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        A00.A0i(AbstractC25233BEq.A0m(A00, "thread_view_add_instruction_exit_confirmation_discard_clicked", str2));
                        A00.Cht();
                    }
                    return;
                }
                return;
            }
            if (!str.equals("settings_add_instruction")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                str4 = "settings_add_instruction_exit_confirmation_discard_changes_clicked";
            }
        } else {
            if (!str.equals("settings_edit_instruction")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                str4 = "settings_edit_instruction_exit_confirmation_discard_changes_clicked";
            }
        }
        A04(A00, AbstractC25233BEq.A0m(A00, str4, str2), str3);
        A00.Cht();
    }

    public final void A0W(String str, String str2, String str3) {
        C25531Mh A00;
        String str4;
        int A07 = AbstractC25235BEs.A07(str);
        if (A07 != -867825035) {
            if (A07 != -339786284) {
                if (A07 == 1866510131 && str.equals("in_thread_instruction")) {
                    A00 = A00(this);
                    if (AbstractC25226BEj.A1Z(A00)) {
                        A00.A0i(AbstractC25233BEq.A0m(A00, "thread_view_add_instruction_screen_shown", str2));
                        A00.Cht();
                    }
                    return;
                }
                return;
            }
            if (!str.equals("settings_add_instruction")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                str4 = "settings_add_instruction_screen_shown";
            }
        } else {
            if (!str.equals("settings_edit_instruction")) {
                return;
            }
            A00 = A00(this);
            if (!AbstractC25226BEj.A1Z(A00)) {
                return;
            } else {
                str4 = "settings_edit_instruction_screen_shown";
            }
        }
        A04(A00, AbstractC25233BEq.A0m(A00, str4, str2), str3);
        A00.Cht();
    }
}
