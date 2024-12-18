package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.7Ov, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162337Ov {
    public static final C162337Ov A01 = new Object();
    public static final C11L A02 = new C11L(".*facebook\\.com");
    public static final C11L A03 = new C11L(".*fb\\.watch");
    public static final InterfaceC08100bW A00 = new C1QF("IgSecureUriParser").A00;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r1 == null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A04(X.C2EY r5, java.lang.Object r6, boolean r7) {
        /*
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            X.F1c r0 = X.AbstractC34049F1c.$redex_init_class
            int r1 = r5.ordinal()
            r0 = 3
            if (r1 == r0) goto L1b
            r0 = 4
            if (r1 == r0) goto L25
            java.lang.String r1 = r5.A00
        L12:
            if (r7 == 0) goto L1a
        L14:
            java.lang.String r0 = "forward_"
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r1)
        L1a:
            return r1
        L1b:
            if (r6 != 0) goto L22
            if (r7 == 0) goto L22
            java.lang.String r1 = r5.A00
            goto L14
        L22:
            java.lang.String r4 = ""
            goto L27
        L25:
            java.lang.String r4 = "visual_"
        L27:
            boolean r0 = r6 instanceof X.C7Q4
            java.lang.String r3 = "video"
            java.lang.String r2 = "photo"
            if (r0 == 0) goto L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            X.7Q4 r6 = (X.C7Q4) r6
            boolean r0 = r6.A05()
        L3d:
            if (r0 != 0) goto L40
            r3 = r2
        L40:
            r1.append(r3)
        L43:
            java.lang.String r1 = r1.toString()
            goto L12
        L48:
            boolean r0 = r6 instanceof X.C7Q5
            if (r0 == 0) goto L5b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            X.7Q5 r6 = (X.C7Q5) r6
            boolean r0 = r6.A01()
            goto L3d
        L5b:
            boolean r0 = r6 instanceof X.C38321qM
            if (r0 == 0) goto L6e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            X.1qM r6 = (X.C38321qM) r6
            boolean r0 = r6.Cff()
            goto L3d
        L6e:
            boolean r0 = r6 instanceof X.C101584hT
            if (r0 == 0) goto L91
            X.4hT r6 = (X.C101584hT) r6
            X.4hU r0 = r6.A04
            if (r0 == 0) goto L83
            boolean r0 = r0.A0V
            if (r0 != 0) goto L7d
            r3 = r2
        L7d:
            java.lang.String r1 = X.AnonymousClass001.A0R(r4, r3)
            if (r1 != 0) goto L12
        L83:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = "photo_or_video"
            r1.append(r0)
            goto L43
        L91:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid content for "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ": "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162337Ov.A04(X.2EY, java.lang.Object, boolean):java.lang.String");
    }

    public static final void A06(EnumC223459tc enumC223459tc, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z) {
        String str2;
        C14360o3.A0B(userSession, 3);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "mwb_actor_experience_event");
        if (A002.isSampled()) {
            A002.A8p("action", 12);
            A002.A8R(enumC223459tc, "restriction_type");
            if (z) {
                str2 = "ig_direct_encrypted_group_thread";
            } else {
                str2 = "id_direct_group_thread";
            }
            A002.AAP("surface", str2);
            C0Zx c0Zx = new C0Zx();
            c0Zx.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, -1L);
            c0Zx.A03("is_fbid", false);
            A002.AAQ(c0Zx, "other_user");
            A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A002.Cht();
        }
    }

    public static final void A07(EnumC33487ErM enumC33487ErM, EnumC33498ErX enumC33498ErX, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(str, 2);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_thread_change_group_name");
        if (A002.isSampled()) {
            A002.AAP("open_thread_id", str);
            A002.A8R(enumC33487ErM, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.AAP("action", "NAME_THREAD");
            A002.A8R(enumC33498ErX, "thread_creation_entry_point");
            A002.Cht();
        }
    }

    public static final void A08(EnumC33498ErX enumC33498ErX, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        String str;
        C14360o3.A0B(userSession, 0);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_group_creation_fail");
        if (enumC33498ErX == null || (str = enumC33498ErX.A00) == null) {
            str = "unknown";
        }
        A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A002.Cht();
    }

    public static final void A09(EnumC33498ErX enumC33498ErX, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 2);
        if (str4.length() == 0) {
            C18950wb.A01.AEp("group_creation_creation_type_is_null_or_empty", 20134884).report();
        }
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_group_creation_create");
        A002.AAP("group_session_id", str);
        A002.AAP("radio_type", "");
        A002.AAP("share_sheet_session_id", str2);
        if (enumC33498ErX == null) {
            enumC33498ErX = EnumC33498ErX.UNKNOWN;
        }
        A002.A8R(enumC33498ErX, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3);
        A002.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
        A002.Cht();
    }

    public static final void A0C(EnumC33491ErQ enumC33491ErQ, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, long j2) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_compose_select_recipient");
        if (A002.isSampled()) {
            A002.A9K("position", Long.valueOf(j));
            A002.A9K("relative_position", Long.valueOf(j2));
            A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str11);
            A002.AAP(AbstractC70143W6w.A01(9, 10, 0), str5);
            A002.AAP("section_type", str);
            A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            Long l = null;
            if (str4 != null) {
                l = Long.valueOf(str4.length());
            }
            A002.A9K("search_query_length", l);
            A002.AAk("recipient_ids", directShareTarget.A0C());
            A002.AAP("recipient_removal_type", str3);
            A002.AAP("search_string", str4);
            A002.AAP("share_sheet_session_id", str6);
            A002.AAP("ranking_info_token", str10);
            A002.AAP("inventory_source", str9);
            A002.A8R(enumC33491ErQ, "sheet_state");
            A002.AAP("ranking_request_id", str7);
            A002.AAP("media_type", str8);
            A002.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
            A002.Cht();
        }
    }

    public static final void A0E(C19280xC c19280xC, DirectThreadKey directThreadKey) {
        String str;
        List list = null;
        if (directThreadKey != null) {
            str = directThreadKey.A00;
            list = directThreadKey.A02;
        } else {
            str = null;
        }
        if (str != null) {
            c19280xC.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        }
        if (list != null) {
            c19280xC.A0D("recipient_ids", list);
        }
    }

    public static final void A0H(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, long j, long j2) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_compose_unselect_recipient");
        if (A002.isSampled()) {
            A002.A9K("position", Long.valueOf(j));
            A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str9);
            A002.AAP("recipient_removal_type", str3);
            A002.A9K("relative_position", Long.valueOf(j2));
            A002.AAP("section_type", str);
            A002.AAk("recipient_ids", directShareTarget.A0B());
            A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A002.AAP("share_sheet_session_id", str4);
            A002.AAP("ranking_info_token", str8);
            A002.AAP("inventory_source", str7);
            A002.AAP("ranking_request_id", str5);
            A002.AAP("media_type", str6);
            A002.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
            A002.Cht();
        }
    }

    public static final void A0I(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str) {
        C14360o3.A0B(str, 2);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_thread_tap_small_media_to_enlarge");
        A002.AAP("media_type", str);
        A002.Cht();
    }

    public static final void A0J(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, int i) {
        C14360o3.A0B(str, 2);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_thread_tap_stack");
        if (A002.isSampled()) {
            A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A002.A9K("stack_media_count", Long.valueOf(i));
            A002.Cht();
        }
    }

    public static final void A0K(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2) {
        C14360o3.A0B(abstractC12990ll, 0);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_thread_tap_sender_profile");
        A002.AAP("sender_id", str2);
        A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A002.Cht();
    }

    public static final void A0L(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str3, 4);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "ig_direct_modal_composer_send");
        A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A002.AAP("media_type", str3);
        A002.AAP("container_module", interfaceC11380iw.getModuleName());
        A002.AAP("media_id", str2);
        A002.Cht();
    }

    public static final void A0M(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_compose_too_many_recipients_alert");
        A002.A9T("e_counter_channel", "");
        A002.Cht();
    }

    public static final void A0N(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC83713oG interfaceC83713oG, Boolean bool, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC11380iw, 5);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_composer_gallery_send_media");
        if (A002.isSampled()) {
            if (bool != null) {
                A002.A7v("from_gallery", bool);
            }
            A002.A7v("is_drag_and_drop", Boolean.valueOf(z2));
            A002.A7v("is_photo", Boolean.valueOf(z));
            A002.AAP("open_thread_id", AbstractC92784Dr.A02(interfaceC83713oG));
            A002.A9K("occamadillo_thread_id", AbstractC92784Dr.A01(interfaceC83713oG));
            A002.A7v("is_e2ee", Boolean.valueOf(AbstractC140946Yw.A07(interfaceC83713oG)));
            A002.Cht();
        }
    }

    public static final void A0O(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Boolean bool, Integer num, String str, String str2, String str3) {
        String str4;
        C14360o3.A0B(str2, 2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("comment_id", str3);
        if (bool != null) {
            if (bool.booleanValue()) {
                str4 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str4 = "0";
            }
            linkedHashMap.put("has_emoji", str4);
        }
        if (num != null) {
            linkedHashMap.put("private_reply_emoji", num.toString());
        }
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_private_reply_events");
        A002.AAP("action", str);
        A002.AAP("commenter_id", str2);
        A002.A9M("event_data", linkedHashMap);
        A002.AAP("error_message", null);
        A002.Cht();
    }

    public static final void A0Q(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C7P1 c7p1;
        C7P2 c7p2;
        String str2;
        EnumC33504Erd enumC33504Erd;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 2);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "direct_inbox";
        C18920wW A002 = c12210kP.A00();
        InterfaceC02590Ai A003 = A002.A00(A002.A00, "direct_inbox_action");
        A003.AAP("action", str);
        A003.Cht();
        C7P0 c7p0 = new C7P0(interfaceC11380iw, userSession);
        String str3 = userSession.userId;
        C14360o3.A0B(str3, 0);
        switch (str.hashCode()) {
            case -1038808081:
                if (!str.equals("filter_booked")) {
                    return;
                }
                c7p1 = C7P1.CLICK;
                c7p2 = C7P2.FILTER_MAIN_PAGE;
                str2 = null;
                enumC33504Erd = EnumC33504Erd.MARK_AS_APPOINTMENT;
                break;
            case -890177597:
                if (!str.equals("filter_lead")) {
                    return;
                }
                c7p1 = C7P1.CLICK;
                c7p2 = C7P2.FILTER_MAIN_PAGE;
                str2 = null;
                enumC33504Erd = EnumC33504Erd.MARK_AS_LEAD;
                break;
            case -890062029:
                if (!str.equals("filter_paid")) {
                    return;
                }
                c7p1 = C7P1.CLICK;
                c7p2 = C7P2.FILTER_MAIN_PAGE;
                str2 = null;
                enumC33504Erd = EnumC33504Erd.MARK_AS_PAID;
                break;
            case -495694250:
                if (!str.equals("filter_unread")) {
                    return;
                }
                c7p1 = C7P1.CLICK;
                c7p2 = C7P2.FILTER_MAIN_PAGE;
                str2 = null;
                enumC33504Erd = EnumC33504Erd.MARK_AS_UNREAD;
                break;
            case -294655587:
                if (!str.equals("filter_unanswered")) {
                    return;
                }
                c7p1 = C7P1.CLICK;
                c7p2 = C7P2.FILTER_MAIN_PAGE;
                str2 = null;
                enumC33504Erd = EnumC33504Erd.MARK_AS_UNANSWERED;
                break;
            case -141404276:
                if (!str.equals("filter_shipped")) {
                    return;
                }
                c7p1 = C7P1.CLICK;
                c7p2 = C7P2.FILTER_MAIN_PAGE;
                str2 = null;
                enumC33504Erd = EnumC33504Erd.MARK_AS_SHIPPED;
                break;
            case 884896422:
                if (!str.equals("filter_ordered")) {
                    return;
                }
                c7p1 = C7P1.CLICK;
                c7p2 = C7P2.FILTER_MAIN_PAGE;
                str2 = null;
                enumC33504Erd = EnumC33504Erd.MARK_AS_ORDER;
                break;
            case 1312801427:
                if (!str.equals("filter_flagged")) {
                    return;
                }
                c7p1 = C7P1.CLICK;
                c7p2 = C7P2.FILTER_MAIN_PAGE;
                str2 = null;
                enumC33504Erd = EnumC33504Erd.FLAG;
                break;
            default:
                return;
        }
        C7P0.A01(enumC33504Erd, c7p1, c7p2, c7p0, str2, str3);
    }

    public static final void A0R(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4) {
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_business_interop_education_flow");
        A002.AAP("action", str);
        A002.A7v("is_interop_thread", true);
        A002.A7v("is_professional_account", true);
        A002.AAP("entrypoint", str2);
        A002.AAP("event_location", str3);
        A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str4);
        A002.Cht();
    }

    public static final void A0S(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_private_reply_events");
        A002.AAP("action", str);
        A002.AAP("commenter_id", str2);
        A002.A9M("event_data", AbstractC16850sd.A0M(new C09530e4("comment_id", str3)));
        A002.AAP("error_message", str4);
        A002.Cht();
    }

    public static final void A0T(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4, String str5, List list, List list2, int i, int i2) {
        String str6;
        String valueOf;
        String str7;
        C14360o3.A0B(str2, 3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        if (list.size() == 1) {
            str6 = (String) list.get(0);
        } else {
            if (list.size() > 1) {
                linkedHashMap.put("thread_ids", list.toString());
            }
            str6 = "";
        }
        if (str4 != null) {
            linkedHashMap.put(CacheBehaviorLogger.SOURCE, str4);
        }
        if (!list2.isEmpty()) {
            linkedHashMap.put("labels", list2.toString());
        }
        if (i2 <= 1) {
            if (i2 == 1) {
                z = true;
            }
            valueOf = String.valueOf(z);
            str7 = "is_unread";
        } else {
            valueOf = String.valueOf(i2);
            str7 = "unread_count";
        }
        linkedHashMap.put(str7, valueOf);
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_request_user_action");
        if (A002.isSampled()) {
            A002.AAP("event_action_name", str);
            A002.A9K("ig_userid", Long.valueOf(Long.parseLong(str2)));
            A002.AAP("selected_filter", str3);
            A002.AAP("selected_folder", str5);
            A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str6);
            A002.A9K("position", Long.valueOf(i));
            A002.AAP("extra_client_data", linkedHashMap.toString());
            A002.Cht();
        }
    }

    public static final void A0V(C19260xA c19260xA, AbstractC12990ll abstractC12990ll, C114675Fx c114675Fx, DirectThreadKey directThreadKey, String str, String str2, long j, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(directThreadKey, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c114675Fx, 8);
        C14360o3.A0B(c19260xA, 9);
        A0r(str);
        C19280xC A032 = A03("failed", z2);
        A032.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A032.A0C("client_context", str2);
        Boolean valueOf = Boolean.valueOf(z3);
        A032.A09("is_shh_mode", valueOf);
        A0F(A032, z);
        A0D(A032, c114675Fx);
        Long valueOf2 = Long.valueOf(j);
        A032.A0B("total_duration", valueOf2);
        A032.A04(c19260xA);
        A0E(A032, directThreadKey);
        AbstractC11060iN.A00(abstractC12990ll).EHW(A032);
        "direct_message_failed".getClass();
        C19280xC A012 = C19280xC.A01("direct_message_failed", null);
        A012.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A012.A0C("client_context", str2);
        A012.A09("is_shh_mode", valueOf);
        A0F(A012, z);
        A0D(A012, c114675Fx);
        A012.A0B("total_duration", valueOf2);
        A012.A04(c19260xA);
        A0E(A012, directThreadKey);
        AbstractC11060iN.A00(abstractC12990ll).EHW(A012);
    }

    public static final void A0W(C19260xA c19260xA, AbstractC12990ll abstractC12990ll, DirectThreadKey directThreadKey, String str, String str2, long j, boolean z, boolean z2) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(directThreadKey, 1);
        C14360o3.A0B(str, 2);
        C19280xC A032 = A03("sent", z);
        A0r(str);
        A032.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A032.A0C("client_context", str2);
        A032.A0B("total_duration", Long.valueOf(j));
        A032.A09("is_shh_mode", Boolean.valueOf(z2));
        if (c19260xA != null) {
            A032.A04(c19260xA);
        }
        A0E(A032, directThreadKey);
        AbstractC11060iN.A00(abstractC12990ll).EHW(A032);
    }

    public static final void A0X(C19260xA c19260xA, AbstractC12990ll abstractC12990ll, DirectThreadKey directThreadKey, String str, String str2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c19260xA, 7);
        C19280xC A032 = A03("send_attempt", z2);
        A0r(str);
        A032.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A032.A0C("client_context", str2);
        A032.A09("is_shh_mode", Boolean.valueOf(z3));
        A0F(A032, z);
        A032.A04(c19260xA);
        A0E(A032, directThreadKey);
        AbstractC11060iN.A00(abstractC12990ll).EHW(A032);
    }

    public static final void A0Y(C19260xA c19260xA, Integer num) {
        C14360o3.A0B(c19260xA, 0);
        C19260xA.A00(c19260xA, AbstractC72079XMx.A00(num), "channel");
    }

    public static final void A0Z(C19260xA c19260xA, Integer num) {
        C14360o3.A0B(c19260xA, 0);
        C14360o3.A0B(num, 1);
        C19260xA.A00(c19260xA, AbstractC72079XMx.A00(num), "channel");
    }

    public static final void A0a(C19260xA c19260xA, Integer num) {
        C14360o3.A0B(c19260xA, 0);
        C14360o3.A0B(num, 1);
        C19260xA.A00(c19260xA, AbstractC72079XMx.A00(num), "channel");
    }

    public static final void A0c(C18920wW c18920wW, String str, String str2, boolean z) {
        C14360o3.A0B(str, 1);
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "direct_thread_change_group_photo");
        A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A002.AAP("action", str2);
        A002.A7v("is_e2ee", Boolean.valueOf(z));
        A002.Cht();
    }

    public static final void A0g(AbstractC12990ll abstractC12990ll, DirectThreadKey directThreadKey, C2EY c2ey, String str, boolean z) {
        C14360o3.A0B(abstractC12990ll, 0);
        if (c2ey != C2EY.A1C) {
            A0i(abstractC12990ll, directThreadKey, c2ey.A00, str, z);
            return;
        }
        throw new IllegalStateException("Must use String overload and DirectAnalyticsUtil#getMessageType() with MEDIA types");
    }

    public static final void A0h(AbstractC12990ll abstractC12990ll, DirectThreadKey directThreadKey, String str, String str2) {
        C14360o3.A0B(str, 2);
        C19280xC A032 = A03("retry_attempt", false);
        A0r(str);
        A032.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A032.A0C("client_context", str2);
        A032.A0C("channel", "Unset");
        AbstractC11060iN.A00(abstractC12990ll).EHW(A032);
        A0i(abstractC12990ll, directThreadKey, str, str2, false);
    }

    public static final void A0i(AbstractC12990ll abstractC12990ll, DirectThreadKey directThreadKey, String str, String str2, boolean z) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(str, 2);
        C19280xC A032 = A03("send_intent", z);
        A0r(str);
        A032.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A032.A0C("client_context", str2);
        A032.A0C("channel", "Unset");
        A0E(A032, directThreadKey);
        AbstractC11060iN.A00(abstractC12990ll).EHW(A032);
    }

    public static final void A0k(AbstractC12990ll abstractC12990ll, C3o9 c3o9, String str, boolean z) {
        EnumC46267Kdz enumC46267Kdz;
        C14360o3.A0B(c3o9, 2);
        C12210kP c12210kP = new C12210kP(abstractC12990ll);
        c12210kP.A01 = "direct_thread";
        C18920wW A002 = c12210kP.A00();
        InterfaceC02590Ai A003 = A002.A00(A002.A00, "direct_delete_message_cancel");
        if (A003.isSampled()) {
            A003.AAP("action", "cancel");
            A003.A7v("is_e2ee", Boolean.valueOf(JRE.A09(c3o9)));
            if (z) {
                enumC46267Kdz = EnumC46267Kdz.DIALOG;
            } else {
                enumC46267Kdz = EnumC46267Kdz.BULK_SELECTION;
            }
            A003.A8R(enumC46267Kdz, "menu_ui");
            A003.AAP("message_id", str);
            A003.AAP("open_thread_id", AbstractC43827JZq.A01(c3o9));
            A003.A9K("occamadillo_thread_id", AbstractC43827JZq.A00(c3o9));
            A003.Cht();
        }
    }

    public static final void A0m(AbstractC12990ll abstractC12990ll, String str, String str2) {
        C14360o3.A0B(str, 1);
        C19280xC A032 = A03("cancelled", false);
        A0r(str);
        A032.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        A032.A0C("client_context", str2);
        A032.A0C("channel", "Unset");
        AbstractC11060iN.A00(abstractC12990ll).EHW(A032);
    }

    public static final void A0n(AbstractC12990ll abstractC12990ll, String str, boolean z) {
        C14360o3.A0B(abstractC12990ll, 0);
        C12210kP c12210kP = new C12210kP(abstractC12990ll);
        c12210kP.A01 = "direct_inbox";
        C18920wW A002 = c12210kP.A00();
        InterfaceC02590Ai A003 = A002.A00(A002.A00, "direct_inbox_action");
        A003.AAP("action", "thread_flag");
        A003.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A003.A7v("is_interop", Boolean.valueOf(z));
        A003.Cht();
    }

    public static final void A0o(UserSession userSession, int i) {
        C14360o3.A0B(userSession, 0);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "direct_inbox";
        C18920wW A002 = c12210kP.A00();
        InterfaceC02590Ai A003 = A002.A00(A002.A00, "direct_inbox_tab_impression");
        A003.A8p("tab", Integer.valueOf(i));
        A003.Cht();
    }

    public static final void A0p(UserSession userSession, String str, long j, long j2, long j3) {
        C14360o3.A0B(userSession, 0);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "direct_inbox";
        C18920wW A002 = c12210kP.A00();
        InterfaceC02590Ai A003 = A002.A00(A002.A00, "direct_iris_error_state_event");
        if (A003.isSampled()) {
            A003.AAP("action", str);
            A003.A9K("ig_userid", Long.valueOf(Long.parseLong(userSession.userId)));
            A003.A9K("current_seq_id", Long.valueOf(j));
            A003.A9K("latest_seq_id", Long.valueOf(j2));
            A003.A9K("iris_stuck_time", Long.valueOf(j3));
            A003.Cht();
        }
    }

    public static final void A0q(UserSession userSession, String str, String str2, String str3, boolean z, boolean z2) {
        String str4;
        C18920wW A012 = AbstractC12220kQ.A01(null, userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "mwb_muted_words_fetch_event");
        A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        int i = 2;
        if (z) {
            i = 1;
        }
        A002.A8p("muted_status", Integer.valueOf(i));
        A002.AAP("fetch_id", str2);
        A002.AAP("dictionary_id", str3);
        if (z2) {
            str4 = "open_group";
        } else {
            str4 = "open_one_to_one";
        }
        A002.AAP("thread_type", str4);
        A002.Cht();
    }

    public static final C19280xC A01(InterfaceC11380iw interfaceC11380iw, String str, String str2, String str3) {
        C19280xC A002 = C19280xC.A00(interfaceC11380iw, "direct_quick_reply_waterfall");
        A002.A0C("action", str);
        A002.A0C("source_module", str2);
        A002.A0C("waterfall_id", str3);
        return A002;
    }

    public static final C19280xC A02(AbstractC81003jU abstractC81003jU, String str, boolean z) {
        "direct_message_mark_waterfall".getClass();
        C19280xC A012 = C19280xC.A01("direct_message_mark_waterfall", null);
        A012.A0C(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, abstractC81003jU.A00());
        A012.A0C("client_context", abstractC81003jU.A01);
        A012.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, abstractC81003jU.A04);
        A012.A0C("message_id", abstractC81003jU.A02);
        A012.A0B("date_created", Long.valueOf(abstractC81003jU.A00));
        A012.A0C("action", str);
        if (z) {
            A012.A09("sampled", true);
        }
        return A012;
    }

    public static final C19280xC A03(String str, boolean z) {
        "direct_message_waterfall".getClass();
        C19280xC A012 = C19280xC.A01("direct_message_waterfall", null);
        A012.A0C("action", str);
        A012.A0C("dedupe_token", UUID.randomUUID().toString());
        if (z) {
            A012.A09("sampled", true);
        }
        return A012;
    }

    public static final void A0B(EnumC72433Xdd enumC72433Xdd, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, EnumC40111tc enumC40111tc, String str, String str2, boolean z) {
        String str3;
        if (enumC40111tc != EnumC40111tc.A0Q && enumC40111tc != EnumC40111tc.A0a) {
            throw new IllegalStateException("Check failed.");
        }
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_save_media");
        if (A002.isSampled()) {
            A002.A9T("saved", Boolean.valueOf(z));
            A002.A9T("e_counter_channel", "");
            String name = enumC40111tc.name();
            if (name != null) {
                str3 = name.toLowerCase(Locale.ROOT);
                C14360o3.A07(str3);
            } else {
                str3 = null;
            }
            A002.AAP("media_type", str3);
            A002.AAP("reason", str);
            A002.AAP("media_source", str2);
            A002.A8R(enumC72433Xdd, "thread_type");
            A002.Cht();
        }
    }

    public static final void A0D(C19280xC c19280xC, C114675Fx c114675Fx) {
        c19280xC.A0C(AbstractC58317Pt9.A00(23), c114675Fx.A01.A01);
        c19280xC.A0C(TraceFieldType.ErrorCode, c114675Fx.A03);
        c19280xC.A0C(AbstractC58317Pt9.A00(22), c114675Fx.A04);
    }

    public static final void A0F(C19280xC c19280xC, boolean z) {
        if (z) {
            c19280xC.A09("is_silent", true);
        }
    }

    public static final void A0U(C19260xA c19260xA) {
        A0Y(c19260xA, C05F.A0C);
    }

    public static final void A0b(C18920wW c18920wW, String str, String str2, long j) {
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "update_ttlc_settings");
        A002.AAP("event_trigger_type", str2);
        A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A002.A9K("ttlc_modes", Long.valueOf(j));
        A002.Cht();
    }

    public static final void A0d(C18920wW c18920wW, String str, String str2, boolean z) {
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "update_dm_settings");
        A002.AAP("event_trigger_type", str2);
        A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A002.A7v("toggle_value", Boolean.valueOf(z));
        A002.Cht();
    }

    public static final void A0e(C18920wW c18920wW, String str, String str2, boolean z) {
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "update_tlc_settings");
        A002.AAP("event_trigger_type", str2);
        A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A002.A7v("toggle_value", Boolean.valueOf(z));
        A002.Cht();
    }

    public static final void A0f(AbstractC12990ll abstractC12990ll, int i) {
        C12210kP c12210kP = new C12210kP(abstractC12990ll);
        c12210kP.A01 = "direct_inbox";
        C18920wW A002 = c12210kP.A00();
        InterfaceC02590Ai A003 = A002.A00(A002.A00, "direct_inbox_action");
        A003.AAP("action", "multiple_thread_muted_messages");
        A003.A9K(AbstractC43591JPw.A00(218), Long.valueOf(i));
        A003.Cht();
    }

    public static final void A0j(AbstractC12990ll abstractC12990ll, C3o9 c3o9) {
        C12210kP c12210kP = new C12210kP(abstractC12990ll);
        c12210kP.A01 = "direct_inbox";
        C18920wW A002 = c12210kP.A00();
        InterfaceC02590Ai A003 = A002.A00(A002.A00, "direct_inbox_action");
        A003.AAP("action", "thread_deleted");
        A003.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, JRE.A06(c3o9));
        A003.AAP("open_thread_id", AbstractC43827JZq.A01(c3o9));
        A003.A9K("occamadillo_thread_id", AbstractC43827JZq.A00(c3o9));
        A003.A7v("is_e2ee", Boolean.valueOf(JRE.A09(c3o9)));
        A003.Cht();
    }

    public static final void A0l(AbstractC12990ll abstractC12990ll, Integer num, String str, int i, boolean z) {
        C12210kP c12210kP = new C12210kP(abstractC12990ll);
        c12210kP.A01 = "direct_inbox";
        C18920wW A002 = c12210kP.A00();
        InterfaceC02590Ai A003 = A002.A00(A002.A00, "direct_inbox_action");
        A003.AAP("action", "thread_move");
        A003.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A003.A7v("is_interop", Boolean.valueOf(z));
        A003.A9K("folder", Long.valueOf(i));
        if (num != null) {
            A003.A9K("position", Long.valueOf(num.intValue()));
        }
        A003.Cht();
    }

    public static final void A0r(String str) {
        if (str.equals(C2EY.A1C.A00) || str.equals(C2EY.A0q.A00)) {
            C0w9.A04("DirectAnalyticsUtil_invalid_content_type", AnonymousClass001.A0R("Invalid contentType: ", str), 1);
        }
    }

    public static final C25531Mh A00(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, C3o9 c3o9, boolean z, boolean z2, boolean z3) {
        String str;
        C25531Mh A05 = C25531Mh.A05(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll));
        A05.A0O("is_e2ee", Boolean.valueOf(z));
        A05.A0O("is_barcelona_installed", Boolean.valueOf(z2));
        A05.A0O("is_barcelona_link", Boolean.valueOf(z3));
        InterfaceC83733oI A052 = JRE.A05(c3o9);
        if (A052 != null) {
            if (c3o9 != null) {
                str = JRE.A06(c3o9);
            } else {
                str = null;
            }
            A05.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A05.A0Q("occamadillo_thread_id", AbstractC92784Dr.A01(A052));
            A05.A0R("open_thread_id", AbstractC92784Dr.A02(A052));
        }
        return A05;
    }

    public static final void A05(EnumC223459tc enumC223459tc, EnumC223399tW enumC223399tW, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, int i, boolean z, boolean z2) {
        String str3;
        long j;
        Long A0k;
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "mwb_actor_experience_event");
        if (A002.isSampled()) {
            A002.A8p("action", Integer.valueOf(i));
            A002.A8R(enumC223459tc, "restriction_type");
            if (z2) {
                if (z) {
                    str3 = "ig_direct_encrypted_group_thread";
                } else {
                    str3 = "id_direct_group_thread";
                }
            } else if (z) {
                str3 = "ig_direct_encrypted_thread";
            } else {
                str3 = "id_direct_thread";
            }
            A002.AAP("surface", str3);
            C0Zx c0Zx = new C0Zx();
            if (str != null && (A0k = AbstractC003100w.A0k(10, str)) != null) {
                j = A0k.longValue();
            } else {
                j = -1;
            }
            c0Zx.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Long.valueOf(j));
            c0Zx.A03("is_fbid", false);
            A002.AAQ(c0Zx, "other_user");
            A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A002.A8R(enumC223399tW, "invalid_invite_composer_block_reason");
            A002.Cht();
        }
    }

    public static final void A0A(EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_group_block_warning_dialog_action");
        A002.AAP("action", str);
        A002.A8R(enumC1579076z, CacheBehaviorLogger.SOURCE);
        A002.A8R(enumC33464Eqz, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A002.Cht();
    }

    public static final void A0P(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Boolean bool, String str, int i) {
        C18920wW A012 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A002 = A012.A00(A012.A00, "direct_business_inbox_hmps_events");
        A002.AAP("action", str);
        A002.A8p("hmps_state", Integer.valueOf(i));
        if (bool != null) {
            A002.A7v("is_persistent", bool);
        }
        A002.Cht();
    }

    public static final void A0G(InterfaceC11380iw interfaceC11380iw, C19260xA c19260xA, UserSession userSession, InterfaceC38371qR interfaceC38371qR, DirectShareTarget directShareTarget, C2EY c2ey, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2) {
        long parseLong;
        String str11;
        InterfaceC02590Ai A002;
        String str12;
        String A0F;
        C38321qM BQN;
        String A09;
        Long l;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 4);
        if (interfaceC38371qR != null && (BQN = interfaceC38371qR.BQN()) != null && BQN.CdW()) {
            C38321qM BQN2 = interfaceC38371qR.BQN();
            C12210kP c12210kP = new C12210kP(userSession);
            c12210kP.A00 = interfaceC11380iw;
            C18920wW A003 = c12210kP.A00();
            A002 = A003.A00(A003.A00, "instagram_ad_direct_reshare_send");
            if (C18U.A06(C06090Tz.A05, userSession, 36323856977374875L)) {
                A09 = "";
            } else {
                A09 = AbstractC128985sJ.A09(BQN2);
            }
            if (A002.isSampled()) {
                C14360o3.A0B(BQN2, 1);
                User A2E = BQN2.A2E(userSession);
                C14360o3.A0A(A2E);
                A002.AAP("a_pk", Long.valueOf(Long.parseLong(A2E.getId())).toString());
                A002.AAP("follow_status", AbstractC128985sJ.A06(userSession, BQN2));
                A002.AAP("m_pk", A09);
                A002.A9K("m_t", Long.valueOf(BQN2.BRp().A00));
                A002.AAP("source_of_action", interfaceC11380iw.getModuleName());
                String CAR = BQN2.CAR();
                A002.AAP("tracking_token", CAR != null ? CAR : "");
                A002.AAP("action", AbstractC128985sJ.A08(BQN2));
                A002.A9K("ad_id", AbstractC128985sJ.A01(userSession, BQN2));
                A002.AAP("delivery_flags", AbstractC77343dK.A00(BQN2.A0e));
                A002.A9K("elapsed_time_since_last_item", -1L);
                A002.AAP("feed_request_id", BQN2.A0R);
                A002.AAP("inventory_source", BQN2.A0C.BJN());
                A002.A7v("is_acp_delivered", false);
                A002.A7v("is_eof", BQN2.A0C.CTu());
                A002.A9K("m_ts", Long.valueOf(BQN2.A1B()));
                A002.A9K("top_liker_count", AbstractC128985sJ.A02(userSession, BQN2));
                A002.AAP("carousel_cover_media_id", AbstractC128985sJ.A0A(BQN2, num));
                A002.A9K("carousel_index", AbstractC128985sJ.A03(BQN2, num));
                A002.A9K("carousel_m_t", AbstractC128985sJ.A04(BQN2, num));
                A002.AAP("carousel_media_id", AbstractC128985sJ.A0B(BQN2, num));
                A002.A9K("carousel_size", AbstractC128985sJ.A05(BQN2, num));
                A002.AAP("nav_chain", C1QM.A00.A02.A00);
                A002.AAP("subtype", str8);
                A002.AAP("share_sheet_session_id", str6);
                String A0H = AbstractC41071vF.A0H(userSession, BQN2.getId());
                if (A0H != null) {
                    l = AbstractC003100w.A0k(10, A0H);
                } else {
                    l = null;
                }
                A002.A9K("host_profile_id", l);
            } else {
                return;
            }
        } else {
            C19280xC A012 = C19280xC.A01("direct_reshare_send", str);
            A012.A09("comment_included", Boolean.valueOf(z));
            A012.A0C("source_of_reshare", interfaceC11380iw.getModuleName());
            A012.A09("is_close_friends_blast", false);
            A012.A09("is_recent_thread", false);
            if (str3 != null && !z2) {
                A012.A0C("reel_id", str3);
                C1OU c1ou = C1OU.$redex_init_class;
                ReelStore A032 = ReelStore.A03(userSession);
                C14360o3.A07(A032);
                Reel A0M = A032.A0M(str3);
                if (c2ey == C2EY.A1g && A0M != null && (A0M.A0b() || A0M.A0P == ReelType.A05)) {
                    java.util.Set A0Q = A0M.A0Q();
                    C14360o3.A07(A0Q);
                    Iterator it = directShareTarget.A0B().iterator();
                    boolean z3 = false;
                    while (it.hasNext()) {
                        Object next = it.next();
                        Iterator it2 = A0Q.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            List A3k = ((C38321qM) it2.next()).A3k();
                            if (A3k != null && A3k.contains(next)) {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    A012.A0C("recipient_type ", z3 ? "mwf_tagged_friend " : "mwf_other ");
                }
            }
            if (str4 != null) {
                A012.A0C("tray_session_id", str4);
            }
            if (str5 != null) {
                A012.A0C("viewer_session_id", str5);
            }
            if (str6 != null) {
                A012.A0C("share_sheet_session_id", str6);
            }
            if (str7 != null) {
                A012.A0C("audio_cluster_id", str7);
            }
            if (interfaceC38371qR != null) {
                C38321qM BQN3 = interfaceC38371qR.BQN();
                if (!C18U.A06(C06090Tz.A05, userSession, 36323856977374875L)) {
                    A012.A0C("m_pk", BQN3.getId());
                }
                if (num2 != null) {
                    A012.A08(num2, "m_ix");
                }
                if (num3 != null) {
                    A012.A08(num3, "recs_ix");
                }
                if (str2 != null) {
                    A012.A0C("parent_m_pk", str2);
                }
                String mezqlToken = BQN3.A0C.getMezqlToken();
                if (mezqlToken != null) {
                    A012.A0C("mezql_token", mezqlToken);
                }
                String loggingInfoToken = BQN3.A0C.getLoggingInfoToken();
                if (loggingInfoToken != null) {
                    A012.A0C("ranking_info_token", loggingInfoToken);
                }
                String BJN = BQN3.A0C.BJN();
                if (BJN != null) {
                    A012.A0C("inventory_source", BJN);
                }
                Integer valueOf = Integer.valueOf(BQN3.BRp().A00);
                if (valueOf != null) {
                    A012.A08(valueOf, "m_t");
                }
                Integer valueOf2 = Integer.valueOf(BQN3.BRp().A00);
                if (valueOf2 != null) {
                    A012.A08(valueOf2, "media_type");
                }
                if (interfaceC38371qR instanceof C40971v4) {
                    A012.A07(C5I8.A9S, "ad");
                    C40971v4 c40971v4 = (C40971v4) interfaceC38371qR;
                    A012.A0C("ad_id", c40971v4.A0S);
                    str12 = "tracking_token";
                    A0F = c40971v4.A0j;
                } else if (interfaceC38371qR.BQN().CdW()) {
                    C38321qM BQN4 = interfaceC38371qR.BQN();
                    A012.A07(C5I8.A9S, "ad");
                    A012.A0C("ad_id", AbstractC41071vF.A07(userSession, BQN4));
                    str12 = "tracking_token";
                    A0F = AbstractC41071vF.A0F(userSession, BQN4);
                } else {
                    A012.A07(C5I8.A9S, "organic");
                }
                A012.A0C(str12, A0F);
            }
            A012.A09("is_recipient_metaai", Boolean.valueOf(directShareTarget.A0Q()));
            if (directShareTarget.A0Q()) {
                A012.A0C("prompt_text_sent", str9);
                A012.A0C("meta_ai_entry_point", str10);
                if (interfaceC38371qR != null) {
                    A012.A0C("media_id", interfaceC38371qR.BQN().getId());
                    A012.A0C("author_id", AbstractC76433bn.A00(interfaceC38371qR.BQN().A0C.CDj()));
                }
            }
            if (c19260xA != null) {
                A012.A04(c19260xA);
            }
            List<DirectShareTarget> singletonList = Collections.singletonList(directShareTarget);
            C14360o3.A07(singletonList);
            if (!singletonList.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList arrayList = new ArrayList();
                for (DirectShareTarget directShareTarget2 : singletonList) {
                    InterfaceC83713oG interfaceC83713oG = directShareTarget2.A09;
                    interfaceC83713oG.getClass();
                    if (interfaceC83713oG instanceof C83693oE) {
                        arrayList.add(((C83693oE) interfaceC83713oG).A00);
                    }
                    List unmodifiableList = Collections.unmodifiableList(directShareTarget2.A0Q);
                    C14360o3.A07(unmodifiableList);
                    Iterator it3 = unmodifiableList.iterator();
                    while (it3.hasNext()) {
                        linkedHashSet.add(((PendingRecipient) it3.next()).getId());
                    }
                }
                A012.A0D("thread_ids", arrayList);
                A012.A0D("recipient_ids", AbstractC001800i.A0a(linkedHashSet));
            }
            AbstractC11060iN.A00(userSession).EHW(A012);
            if (interfaceC38371qR == null) {
                return;
            }
            C38321qM BQN5 = interfaceC38371qR.BQN();
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36323856977505948L)) {
                parseLong = 0;
            } else {
                String A38 = BQN5.A38();
                if (A38 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                parseLong = Long.parseLong(A38);
            }
            if (C18U.A06(c06090Tz, userSession, 36323856977637022L)) {
                str11 = C1QM.A00.A02.A00;
            } else {
                str11 = null;
            }
            C18920wW A022 = AbstractC12220kQ.A02(userSession);
            A002 = A022.A00(A022.A00, "ig_direct_reshare_send_do_not_use");
            A002.A9K("media_id", Long.valueOf(parseLong));
            A002.AAP("container_module", str);
            A002.AAP("ranking_info_token", BQN5.A0C.getLoggingInfoToken());
            A002.AAP("canonical_nav_chain", str11);
        }
        A002.Cht();
    }
}
