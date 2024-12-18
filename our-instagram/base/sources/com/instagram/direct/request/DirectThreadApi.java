package com.instagram.direct.request;

import X.AbstractC001800i;
import X.AbstractC23721Ec;
import X.AbstractC43591JPw;
import X.AnonymousClass001;
import X.AnonymousClass776;
import X.AnonymousClass777;
import X.C006802i;
import X.C05F;
import X.C06090Tz;
import X.C0f5;
import X.C0w9;
import X.C14360o3;
import X.C1574875f;
import X.C1574975h;
import X.C18950wb;
import X.C18U;
import X.C1ON;
import X.C25621Ms;
import X.C32135EAi;
import X.C38894HAq;
import X.C40781ul;
import X.C43707JUs;
import X.C55702hA;
import X.C6CC;
import X.C71473Il;
import X.C75g;
import X.C7BA;
import X.C7BB;
import X.FS1;
import X.IQI;
import X.JV4;
import X.T8A;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class DirectThreadApi {
    public static final C1ON A01(UserSession userSession, DirectThreadKey directThreadKey, String str, String str2, int i) {
        C14360o3.A0B(directThreadKey, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("direct_v2/threads/broadcast/update_prompt_response/delete/");
        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, directThreadKey.A00);
        c25621Ms.A9s("prompt_id", str);
        c25621Ms.A9s("response_id", str2);
        c25621Ms.A0D("prompt_type", i);
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        return c25621Ms.A0N();
    }

    public static final C1ON A02(UserSession userSession, Boolean bool, String str, String str2, List list, int i, boolean z) {
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0R = true;
        c25621Ms.A0B("direct_v2/create_group_thread/");
        c25621Ms.A0R(C43707JUs.class, JV4.class);
        c25621Ms.A9s("recipient_users", A0J(list));
        c25621Ms.A9s("client_context", str);
        c25621Ms.A0I("pin_to_profile", z);
        c25621Ms.A9s("is_creator_subscriber_thread", "true");
        c25621Ms.A0D("duration_s", i);
        c25621Ms.A0F("invite_all_subscribers", bool);
        if (str2 != null && str2.length() != 0) {
            c25621Ms.A9s("thread_title", str2);
        }
        return c25621Ms.A0N();
    }

    public static final C1ON A03(UserSession userSession, Long l, String str, int i, int i2) {
        C14360o3.A0B(userSession, 0);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A06();
        c25621Ms.A0B("direct_v2/get_channel_directory/");
        c25621Ms.A0R(C32135EAi.class, FS1.class);
        c25621Ms.A0D("thread_limit", i);
        c25621Ms.A0H("cursor_thread_id", str);
        if (l != null) {
            long longValue = l.longValue();
            if (longValue != 0) {
                c25621Ms.A0E("cursor_timestamp_milliseconds", longValue);
            }
        }
        c25621Ms.A0D("surface", i2);
        return c25621Ms.A0N();
    }

    public static final C1ON A04(UserSession userSession, Long l, String str, String str2, List list, boolean z, boolean z2) {
        C14360o3.A0B(list, 3);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0R = true;
        c25621Ms.A0B("direct_v2/create_group_thread/");
        c25621Ms.A0P(null, C43707JUs.class, JV4.class, false);
        c25621Ms.A9s("recipient_users", A0J(list));
        c25621Ms.A9s("client_context", str);
        c25621Ms.A0I("is_partnership_folder", z);
        if (str2 != null && str2.length() != 0) {
            c25621Ms.A9s("thread_title", str2);
        }
        if (z2) {
            c25621Ms.A9s("is_optional_e2ee", "true");
            if (l != null) {
                c25621Ms.A9s("wa_jid", l.toString());
            }
        }
        return c25621Ms.A0N();
    }

    public static final C1ON A05(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0L("direct_v2/threads/%s/remove_thread_image/", str);
        c25621Ms.A0R(C1574875f.class, C75g.class);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static final C1ON A06(UserSession userSession, String str, String str2) {
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("direct_v2/add_to_inbox/");
        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        c25621Ms.A9s("is_adding", "true");
        c25621Ms.A9s("ad_id", str2);
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        return c25621Ms.A0N();
    }

    public static final C1ON A07(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0L("direct_v2/threads/%s/turn_xposting_on/", str);
        c25621Ms.A9s("destination_thread_fbid", str2);
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        return c25621Ms.A0N();
    }

    public static final C1ON A08(UserSession userSession, String str, String str2, int i) {
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0L("direct_v2/threads/%s/participant_requests/", str);
        c25621Ms.A9s("page_size", String.valueOf(i));
        c25621Ms.A0H("cursor", str2);
        c25621Ms.A0P(null, C38894HAq.class, IQI.class, false);
        return c25621Ms.A0N();
    }

    public static final C1ON A09(UserSession userSession, String str, String str2, int i, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0R = true;
        c25621Ms.A0B("direct_v2/create_group_thread/");
        c25621Ms.A0R(C43707JUs.class, JV4.class);
        c25621Ms.A9s("is_discoverable_chat_thread", "true");
        c25621Ms.A9s("recipient_users", "[]");
        c25621Ms.A0D("duration_s", i);
        c25621Ms.A9s("instagram_school_fbid", str2);
        c25621Ms.A0H("thread_title", str);
        if (z) {
            c25621Ms.A9s("pin_to_profile", "true");
        }
        if (z2) {
            c25621Ms.A9s("require_approval_join", "true");
        }
        return c25621Ms.A0N();
    }

    public static final C1ON A0A(UserSession userSession, String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("direct_v2/threads/broadcast/delete_collection/");
        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        c25621Ms.A9s("collection_id", str2);
        c25621Ms.A9s("collection_type", str3);
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        return c25621Ms.A0N();
    }

    public static final C1ON A0B(UserSession userSession, String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        C14360o3.A0B(userSession, 0);
        if (z) {
            str4 = "direct_v2/threads/%s/broadcast_update_thread_image/";
            str5 = AbstractC43591JPw.A00(775);
        } else {
            str4 = "direct_v2/threads/%s/update_thread_image/";
            str5 = "upload_id";
        }
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0L(str4, str);
        ((AbstractC23721Ec) c25621Ms).A04 = new T8A(str5, str3, z, str2);
        c25621Ms.A0R(C1574875f.class, C75g.class);
        return c25621Ms.A0N();
    }

    public static final C1ON A0C(UserSession userSession, String str, String str2, List list) {
        return A04(userSession, null, str, str2, list, false, false);
    }

    public static final C1ON A0D(UserSession userSession, String str, String str2, List list, List list2) {
        String A0g;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(list, 2);
        C14360o3.A0B(list2, 3);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0L("direct_v2/threads/%s/get_items/", str);
        c25621Ms.A0P(null, C7BA.class, C7BB.class, false);
        c25621Ms.A9s(AbstractC43591JPw.A00(405), AnonymousClass001.A0E(C71473Il.A00(',').A02(list), '[', ']'));
        c25621Ms.A9s("visual_message_return_type", "unseen");
        if (list.size() == list2.size()) {
            if (list2.isEmpty()) {
                A0g = "[]";
            } else {
                A0g = AnonymousClass001.A0g("[\"", new C71473Il("\",\"").A02(list2), "\"]");
            }
            c25621Ms.A9s("original_message_client_contexts", A0g);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Disjoint itemIds and clientContexts: itemIds=");
            sb.append(list.size());
            sb.append(" clientContexts=");
            sb.append(list2);
            C0w9.A03("get_items", sb.toString());
        }
        c25621Ms.A0H("eb_device_id", C6CC.A03.A02(userSession));
        c25621Ms.A0H("igd_request_log_tracking_id", str2);
        return c25621Ms.A0N();
    }

    public static final C1ON A0E(UserSession userSession, String str, List list, List list2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 3);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("direct_v2/send_direct_invite/");
        StringBuilder sb = new StringBuilder("[");
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) list2.get(i);
            sb.append("\"");
            sb.append(str2);
            sb.append("\"");
            if (i < list2.size() - 1) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
        }
        sb.append("]");
        String obj = sb.toString();
        C14360o3.A07(obj);
        c25621Ms.A9s("categories", obj);
        c25621Ms.A9s("user_ids", A0J(list));
        c25621Ms.A9s(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        return c25621Ms.A0N();
    }

    public static final C1ON A0F(UserSession userSession, List list) {
        String A0g;
        C14360o3.A0B(userSession, 0);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("direct_v2/threads/deletion/");
        c25621Ms.A0R(C40781ul.class, C55702hA.class);
        if (list.isEmpty()) {
            A0g = "[]";
        } else {
            A0g = AnonymousClass001.A0g("[\"", new C71473Il("\",\"").A02(list), "\"]");
        }
        c25621Ms.A9s("thread_ids", A0g);
        return c25621Ms.A0N();
    }

    public static final AnonymousClass777 A0G(UserSession userSession, AnonymousClass776 anonymousClass776, Integer num, Integer num2, Long l, String str, String str2, String str3, String str4) {
        String str5;
        C006802i c006802i;
        int i;
        String str6;
        C14360o3.A0B(str4, 7);
        if (anonymousClass776 != null && (c006802i = C006802i.A0p) != null) {
            MarkerEditor withMarker = c006802i.withMarker(anonymousClass776.A01, anonymousClass776.A00);
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            withMarker.annotate("requested_message_limit", i);
            withMarker.annotate("cursor_id", str2);
            if (num != null) {
                if (1 - num.intValue() != 0) {
                    str6 = "NEWER";
                } else {
                    str6 = "OLDER";
                }
            } else {
                str6 = "null";
            }
            withMarker.annotate("direction", str6);
            withMarker.markerEditingCompleted();
        }
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0L("direct_v2/threads/%s/", str);
        c25621Ms.A0P(null, C1574875f.class, C75g.class, false);
        if (str2 != null && num != null) {
            c25621Ms.A9s("cursor", str2);
            if (1 - num.intValue() != 0) {
                str5 = "newer";
            } else {
                str5 = "older";
            }
            c25621Ms.A9s("direction", str5);
        }
        if (l != null) {
            c25621Ms.A9s("seq_id", l.toString());
        }
        if (num2 != null) {
            c25621Ms.A9s("limit", String.valueOf(num2.intValue()));
        }
        c25621Ms.A0H("fetch_attribution", str3);
        c25621Ms.A9s("visual_message_return_type", "unseen");
        c25621Ms.A9s("eb_device_id", C6CC.A03.A02(userSession));
        c25621Ms.A9s("igd_request_log_tracking_id", str4);
        if (str.length() < 3) {
            C0f5 AEp = C18950wb.A01.AEp("invalid_thread_id", 817891202);
            AEp.ABW(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            AEp.report();
        }
        C1ON A0N = c25621Ms.A0N();
        boolean z = false;
        if (num == C05F.A01) {
            z = true;
        }
        return new AnonymousClass777(new C1574975h(userSession, anonymousClass776, str2, str4, z), A0N);
    }

    public static final AnonymousClass777 A0H(UserSession userSession, AnonymousClass776 anonymousClass776, Integer num, Long l, String str, List list, boolean z) {
        C006802i c006802i;
        int i;
        C14360o3.A0B(str, 5);
        if (anonymousClass776 != null && (c006802i = C006802i.A0p) != null) {
            MarkerEditor withMarker = c006802i.withMarker(anonymousClass776.A01, anonymousClass776.A00);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            withMarker.annotate("requested_message_limit", i);
            withMarker.annotate("user_ids", AbstractC001800i.A0P(", ", "", "", list, null));
            withMarker.markerEditingCompleted();
        }
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("direct_v2/threads/get_by_participants/");
        c25621Ms.A9s("recipient_users", A0J(list));
        c25621Ms.A0P(null, C1574875f.class, C75g.class, false);
        if (l != null) {
            c25621Ms.A9s("seq_id", l.toString());
        }
        if (z) {
            c25621Ms.A9s("use_recipient_as_eimu_id", "true");
        }
        if (num != null) {
            c25621Ms.A9s("limit", String.valueOf(num.intValue()));
        }
        c25621Ms.A9s("eb_device_id", C6CC.A03.A02(userSession));
        c25621Ms.A9s("igd_request_log_tracking_id", str);
        return new AnonymousClass777(new C1574975h(userSession, anonymousClass776, null, str, true), c25621Ms.A0N());
    }

    public static final int A00(UserSession userSession, String str) {
        int A01;
        if (!C14360o3.A0K(str, "snapshot") || (A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36609536728176546L)) < 0) {
            return 20;
        }
        return A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A0I(com.instagram.common.session.UserSession r20, java.lang.String r21, X.InterfaceC23621Ds r22, X.InterfaceC16820sZ r23) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.request.DirectThreadApi.A0I(com.instagram.common.session.UserSession, java.lang.String, X.1Ds, X.0sZ):java.lang.Object");
    }

    public static final String A0J(List list) {
        return AnonymousClass001.A0E(C71473Il.A00(',').A02(list), '[', ']');
    }
}
