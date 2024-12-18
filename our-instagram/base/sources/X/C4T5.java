package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.4T5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4T5 implements InterfaceC11380iw, C4T6 {
    public static final String __redex_internal_original_name = "ARPlatformLoggerImpl";
    public final C18920wW A00;
    public final UserSession A01;
    public final C006802i A02;
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();

    @Override // X.C4T6
    public final void Ciz(EnumC114925Hg enumC114925Hg, EnumC46264Kdw enumC46264Kdw, String str, String str2) {
        C14360o3.A0B(enumC46264Kdw, 3);
        C448124l c448124l = AnonymousClass229.A01(this.A01).A09;
        C25531Mh A08 = C25531Mh.A08(c448124l.A01);
        if (((AbstractC02600Aj) A08).A00.isSampled()) {
            A08.A0s("IG_EFFECT_DISCOVERY_CATEGORY_TAP");
            A08.A0q("EFFECT_DISCOVERY_CATEGORY_TAP");
            C448124l.A00(A08, c448124l);
            A08.A0b(C22P.A5N);
            A08.A0W(2);
            A08.A0M(EnumC50631MWs.A0A, "surface");
            A08.A0R("discovery_session_id", str);
            A08.A0R("effect_collection", str2);
            A08.A0M(enumC46264Kdw, "effect_gallery_type");
            A08.A0a(enumC114925Hg);
            A08.A0t(C1QM.A00.A02.A00);
            A08.A0N(AbstractC449424y.A07(c448124l.A00, c448124l.A03), "system_info");
            A08.Cht();
        }
    }

    @Override // X.C4T6
    public final void Cj0(C22P c22p, String str, String str2) {
        C14360o3.A0B(c22p, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C448124l c448124l = AnonymousClass229.A01(this.A01).A09;
        Long A0k = AbstractC003100w.A0k(10, str);
        Long A0k2 = AbstractC003100w.A0k(10, str2);
        if (A0k != null && A0k2 != null) {
            C25531Mh A08 = C25531Mh.A08(c448124l.A01);
            if (((AbstractC02600Aj) A08).A00.isSampled()) {
                A08.A0s("IG_CAMERA_EFFECT_GALLERY_PICKER_BUTTON_TAPPED");
                A08.A0q("EFFECT_GALLERY_PICKER_BUTTON_TAPPED");
                C448124l.A00(A08, c448124l);
                List singletonList = Collections.singletonList(A0k);
                C14360o3.A07(singletonList);
                A08.A0S("applied_effect_ids", singletonList);
                List singletonList2 = Collections.singletonList(A0k2);
                C14360o3.A07(singletonList2);
                A08.A0S("applied_effect_instance_ids", singletonList2);
                A08.A0b(c22p);
                A08.A0W(2);
                A08.A0m(C22F.A08.getModuleName());
                A08.A0M(EnumC50631MWs.A0A, "surface");
                A08.A0t(C1QM.A00.A02.A00);
                A08.Cht();
            }
        }
    }

    @Override // X.C4T6
    public final void Cj1(C22P c22p, AnonymousClass249 anonymousClass249, String str, String str2) {
        C14360o3.A0B(c22p, 0);
        C14360o3.A0B(anonymousClass249, 3);
        C448124l c448124l = AnonymousClass229.A01(this.A01).A09;
        Long A08 = AbstractC449424y.A08(str);
        Long A082 = AbstractC449424y.A08(str2);
        if (A08 != null && A082 != null) {
            C25531Mh A083 = C25531Mh.A08(c448124l.A01);
            if (((AbstractC02600Aj) A083).A00.isSampled()) {
                A083.A0s("IG_CAMERA_EFFECT_GALLERY_PICKER_MEDIA_SELECTED");
                A083.A0q("EFFECT_GALLERY_PICKER_MEDIA_SELECTED");
                C448124l.A00(A083, c448124l);
                List singletonList = Collections.singletonList(A08);
                C14360o3.A07(singletonList);
                A083.A0S("applied_effect_ids", singletonList);
                List singletonList2 = Collections.singletonList(A082);
                C14360o3.A07(singletonList2);
                A083.A0S("applied_effect_instance_ids", singletonList2);
                A083.A0V(3);
                A083.A0Q(MSV.A00(45), 0L);
                A083.A0M(EnumC193318hB.A04, "capture_type");
                A083.A0b(c22p);
                A083.A0T();
                A083.A0c(anonymousClass249);
                A083.A0m(C22F.A08.getModuleName());
                A083.A0M(EnumC50631MWs.A0J, "surface");
                A083.A0t(C1QM.A00.A02.A00);
                A083.A0N(AbstractC449424y.A07(c448124l.A00, c448124l.A03), "system_info");
                A083.Cht();
            }
        }
    }

    @Override // X.C4T6
    public final void Cj2(EnumC114925Hg enumC114925Hg, EnumC223429tZ enumC223429tZ, C22P c22p, EnumC50631MWs enumC50631MWs, String str) {
        C14360o3.A0B(enumC223429tZ, 2);
        C14360o3.A0B(enumC50631MWs, 4);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_effect_page_open");
        if (A00.isSampled()) {
            if (c22p == null) {
                c22p = C22P.A5N;
            }
            A00.A8R(c22p, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.AAP("module", str);
            A00.A8R(enumC50631MWs, "surface");
            A00.A8R(enumC223429tZ, "effect_page_entry_point");
            A00.A8R(enumC114925Hg, "camera_destination");
            String str2 = ((C22F) AnonymousClass229.A01(this.A01)).A04.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            A00.Cht();
        }
    }

    @Override // X.C4T6
    public final void Cj3(EnumC114925Hg enumC114925Hg, InterfaceC11380iw interfaceC11380iw, String str, String str2, String str3, List list, List list2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(list, 3);
        C14360o3.A0B(interfaceC11380iw, 6);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "effect_gallery_search_result");
        if (A00.isSampled()) {
            A00.A8p("event_type", 2);
            A00.AAP("module", interfaceC11380iw.getModuleName());
            A00.AAP("query_text", str);
            A00.AAk("results_creator_list", list);
            A00.AAk("results_effect_list", list2);
            A00.A8R(EnumC50631MWs.A0A, "surface");
            A00.AAP("camera_session_id", ((C22F) AnonymousClass229.A01(this.A01)).A04.A0L);
            A00.AAP("discovery_session_id", str2);
            A00.A8R(null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.AAP("search_session_id", str3);
            A00.A8R(enumC114925Hg, "camera_destination");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
        C448224m c448224m = AnonymousClass229.A01(this.A01).A08;
        C18920wW c18920wW2 = c448224m.A01;
        String A002 = AbstractC43591JPw.A00(162);
        C12180kM c12180kM = c18920wW2.A00;
        InterfaceC02590Ai A003 = c18920wW2.A00(c12180kM, A002);
        if (A003.isSampled()) {
            A003.AAP("entity", "EFFECT_GALLERY_SEARCH_RESULT");
            C22M c22m = c448224m.A04;
            A003.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A003.A8p("event_type", 2);
            A003.A8R(EnumC50631MWs.A0A, "surface");
            String str4 = c22m.A0L;
            if (str4 == null) {
                str4 = "";
            }
            A003.AAP("camera_session_id", str4);
            A003.AAP("module", interfaceC11380iw.getModuleName());
            A003.AAP("legacy_falco_event_name", "EFFECT_GALLERY_SEARCH_RESULT");
            A003.AAP("query_text", str);
            A003.AAk("results_creator_list", list);
            A003.AAk("results_effect_list", list2);
            A003.AAP("discovery_session_id", str2);
            A003.AAP("search_session_id", str3);
            A003.A8R(enumC114925Hg, "camera_destination");
            A003.AAP("nav_chain", C1QM.A00.A02.A00);
            A003.Cht();
        }
        InterfaceC02590Ai A004 = c18920wW2.A00(c12180kM, AbstractC111324zv.A00(992));
        if (A004.isSampled()) {
            A004.AAP("legacy_falco_event_name", "EFFECT_GALLERY_SEARCH_RESULT");
            A004.AAP("entity", "EFFECT_GALLERY_SEARCH_RESULT");
            A004.A8p("event_type", 2);
            A004.AAP("module", interfaceC11380iw.getModuleName());
            A004.AAP("query_text", str);
            A004.AAk("results_creator_list", list);
            A004.AAk("results_effect_list", list2);
            A004.A8R(EnumC50631MWs.A0A, "surface");
            A004.AAP("camera_session_id", c448224m.A04.A0L);
            A004.AAP("discovery_session_id", str2);
            A004.A8R(null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A004.AAP("search_session_id", str3);
            A004.A8R(enumC114925Hg, "camera_destination");
            A004.AAP("nav_chain", C1QM.A00.A02.A00);
            A004.Cht();
        }
    }

    @Override // X.C4T6
    public final void Cj4(InterfaceC11380iw interfaceC11380iw, String str, String str2) {
        C14360o3.A0B(interfaceC11380iw, 2);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "effect_gallery_search_session_initiated");
        if (A00.isSampled()) {
            A00.AAP("discovery_session_id", str);
            A00.A8p("event_type", 2);
            A00.AAP("module", interfaceC11380iw.getModuleName());
            A00.AAP("search_session_id", str2);
            A00.A8R(EnumC50631MWs.A0A, "surface");
            A00.AAP("camera_session_id", ((C22F) AnonymousClass229.A01(this.A01)).A04.A0L);
            A00.A8R(null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    @Override // X.C4T6
    public final void Cj5(C22P c22p, InterfaceC11380iw interfaceC11380iw, String str, String str2) {
        C14360o3.A0B(interfaceC11380iw, 3);
        String str3 = (String) this.A03.get(str);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_effect_try_it_tapped");
        A00.AAP("effect_id", str);
        UserSession userSession = this.A01;
        A00.AAK(C4SX.A00(userSession.userId), "pk");
        A00.A8R(c22p, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A00.A9K("media_attributed_author_id", AbstractC449424y.A08(str2));
        A00.AAP("module", interfaceC11380iw.getModuleName());
        if (str3 == null) {
            str3 = "";
        }
        A00.AAP("channel_pk", str3);
        A00.AAP("discovery_session_id", (String) this.A04.get(str));
        A00.AAP("nav_chain", C1QM.A00.A02.A00);
        A00.AAQ(AbstractC449424y.A07(this.A02, userSession), "system_info");
        A00.Cht();
    }

    @Override // X.C4T6
    public final void Ckv(String str, String str2, int i, int i2) {
        C14360o3.A0B(str2, 1);
        InterfaceC11380iw interfaceC11380iw = XkZ.A05;
        C14360o3.A08(interfaceC11380iw);
        Long A0k = AbstractC003100w.A0k(10, str2);
        if (A0k == null) {
            C0w9.A03(__redex_internal_original_name, AnonymousClass001.A0R("logEffectVideoTap has invalid effectId: ", str2));
            return;
        }
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_effect_discovery_video_tap");
        if (!A00.isSampled()) {
            return;
        }
        String str3 = ((C22F) AnonymousClass229.A01(this.A01)).A04.A0L;
        if (str3 == null) {
            str3 = "";
        }
        A00.AAP("camera_session_id", str3);
        A00.AAP("discovery_item_type", "grid_item");
        A00.AAP("discovery_session_id", str);
        A00.A8R(C22P.A5N, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A00.A8p("event_type", 2);
        A00.AAP("module", interfaceC11380iw.getModuleName());
        Long valueOf = Long.valueOf(i);
        A00.A9K("position", valueOf);
        Long valueOf2 = Long.valueOf(i2);
        A00.A9K("row", valueOf2);
        A00.A8R(EnumC50631MWs.A0A, "surface");
        A00.A9K("video_position_in_row", valueOf);
        A00.A9K("video_row", valueOf2);
        A00.A8p(AbstractC111324zv.A00(778), 3);
        A00.A9K(MSV.A00(45), 0L);
        A00.A8R(EnumC193318hB.A08, "capture_type");
        A00.AAP("channel_pk", "effect_profile_tab");
        A00.A9K("effect_id", A0k);
        A00.AAP("grouping_pk", "");
        A00.A8R(AnonymousClass249.VIDEO, "media_type");
        A00.AAP("search_session_id", "");
        A00.AAP("nav_chain", C1QM.A00.A02.A00);
        A00.Cht();
    }

    @Override // X.C4T6
    public final void ClP(EnumC223429tZ enumC223429tZ, C22P c22p, String str, String str2, String str3, String str4) {
        String A0R;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str4, 3);
        UserSession userSession = this.A01;
        if (AbstractC449424y.A08(userSession.userId) == null) {
            A0R = "logSaveEffect has invalid userId.";
        } else {
            Long A0k = AbstractC003100w.A0k(10, str);
            if (A0k == null) {
                A0R = AnonymousClass001.A0R("logSaveEffect has invalid effectId: ", str);
            } else {
                Long A08 = AbstractC449424y.A08(str3);
                C18920wW c18920wW = this.A00;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_save_effect_to_camera");
                List singletonList = Collections.singletonList(A0k);
                C14360o3.A07(singletonList);
                A00.AAk("applied_effect_ids", singletonList);
                A00.A8p("event_type", 2);
                A00.AAP("module", str4);
                A00.AAP("save_effect_surface", str2);
                A00.A8R(enumC223429tZ, "effect_page_entry_point");
                A00.A8R(c22p, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                List singletonList2 = Collections.singletonList(A0k);
                C14360o3.A07(singletonList2);
                A00.AAk("applied_effect_instance_ids", singletonList2);
                A00.A8R(EnumC193318hB.A08, "capture_type");
                A00.AAP("camera_session_id", ((C22F) AnonymousClass229.A01(userSession)).A04.A0L);
                A00.A9K("media_attributed_author_id", A08);
                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                A00.AAQ(AbstractC449424y.A07(this.A02, userSession), "system_info");
                A00.Cht();
                return;
            }
        }
        C0w9.A03(__redex_internal_original_name, A0R);
    }

    @Override // X.C4T6
    public final void Clm(EnumC114925Hg enumC114925Hg, EnumC46264Kdw enumC46264Kdw, String str, int i) {
        InterfaceC11380iw interfaceC11380iw;
        C14360o3.A0B(enumC46264Kdw, 3);
        UserSession userSession = this.A01;
        if (AbstractC449424y.A08(userSession.userId) == null) {
            C0w9.A03(__redex_internal_original_name, "logStartEffectDiscoverySession has invalid data.");
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    switch (i) {
                        case 4:
                        case 6:
                            interfaceC11380iw = XkZ.A02;
                            break;
                        case 5:
                            interfaceC11380iw = XkZ.A05;
                            break;
                        case 7:
                            interfaceC11380iw = XkZ.A06;
                            break;
                        case 8:
                            interfaceC11380iw = XkZ.A03;
                            break;
                        case 9:
                        case 10:
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        case 14:
                            break;
                        case 11:
                            interfaceC11380iw = XkZ.A0C;
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            interfaceC11380iw = XkZ.A0A;
                            break;
                        default:
                            C0w9.A03("ARPlatformLoggerHelper", "getAnalyticsModule() unknown entry point.");
                            interfaceC11380iw = XkZ.A02;
                            break;
                    }
                }
                interfaceC11380iw = XkZ.A04;
            } else {
                interfaceC11380iw = XkZ.A01;
            }
        } else {
            interfaceC11380iw = XkZ.A07;
        }
        this.A05.put(str, interfaceC11380iw);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_effect_discovery_entry");
        int i2 = 2;
        A00.A8p("event_type", 2);
        A00.A8R(EnumC50631MWs.A0A, "surface");
        A00.AAP("module", interfaceC11380iw.getModuleName());
        A00.AAP("discovery_session_id", str);
        String str2 = ((C22F) AnonymousClass229.A01(userSession)).A04.A0L;
        if (str2 == null) {
            str2 = "";
        }
        A00.AAP("camera_session_id", str2);
        A00.AAk("camera_tools", C16930sl.A00);
        A00.A8R(enumC114925Hg, "camera_destination");
        A00.A8R(enumC46264Kdw, "effect_gallery_type");
        if (i != 9) {
            if (i != 10) {
                if (i != 13) {
                    if (i != 14) {
                        i2 = 5;
                        if (i != 17) {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 1;
            }
        }
        if (i2 != Integer.MIN_VALUE) {
            A00.A8p("mini_gallery_entry_point", Integer.valueOf(i2));
        } else {
            A00.AAP("mini_gallery_entry_point", null);
        }
        A00.AAP("nav_chain", C1QM.A00.A02.A00);
        A00.AAQ(AbstractC449424y.A07(this.A02, userSession), "system_info");
        A00.Cht();
    }

    @Override // X.C4T6
    public final void Cm4(C22P c22p, String str) {
        C14360o3.A0B(c22p, 1);
        Long A0k = AbstractC003100w.A0k(10, str);
        if (A0k != null) {
            C18920wW c18920wW = this.A00;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_effect_stories_tap");
            A00.A8R(c22p, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            List singletonList = Collections.singletonList(A0k);
            C14360o3.A07(singletonList);
            A00.AAk("applied_effect_ids", singletonList);
            A00.Cht();
        }
    }

    @Override // X.C4T6
    public final void CmE(EnumC223429tZ enumC223429tZ, C22P c22p, String str, String str2, String str3) {
        String A0R;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        UserSession userSession = this.A01;
        if (AbstractC449424y.A08(userSession.userId) == null) {
            A0R = "logUnSaveEffect has invalid userId";
        } else {
            Long A0k = AbstractC003100w.A0k(10, str);
            if (A0k == null) {
                A0R = AnonymousClass001.A0R("logUnSaveEffect has invalid effectId: ", str);
            } else {
                C18920wW c18920wW = this.A00;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_unsave_effect_to_camera");
                List singletonList = Collections.singletonList(A0k);
                C14360o3.A07(singletonList);
                A00.AAk("applied_effect_ids", singletonList);
                List singletonList2 = Collections.singletonList(A0k);
                C14360o3.A07(singletonList2);
                A00.AAk("applied_effect_instance_ids", singletonList2);
                A00.A8p("event_type", 2);
                A00.AAP("module", str3);
                A00.AAP("save_effect_surface", str2);
                A00.A8R(enumC223429tZ, "effect_page_entry_point");
                A00.A8R(c22p, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A00.AAP("camera_session_id", ((C22F) AnonymousClass229.A01(userSession)).A04.A0L);
                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                A00.Cht();
                return;
            }
        }
        C0w9.A03(__redex_internal_original_name, A0R);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.C4T6
    public final void AAZ(String str, String str2) {
        if (str != null && str2 != null) {
            this.A04.put(str, str2);
        }
    }

    @Override // X.C4T6
    public final String AmY(String str) {
        if (str == null) {
            return null;
        }
        return (String) this.A03.get(str);
    }

    @Override // X.C4T6
    public final String Bto(String str) {
        return (String) this.A04.get(str);
    }

    @Override // X.C4T6
    public final void Cj8(String str) {
        UserSession userSession = this.A01;
        if (AbstractC449424y.A08(userSession.userId) == null) {
            C0w9.A03(__redex_internal_original_name, "logEndEffectDiscoverySession has invalid data.");
            return;
        }
        Map map = this.A05;
        InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) map.get(str);
        if (interfaceC11380iw == null) {
            return;
        }
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "ig_effect_discovery_exit");
        A00.AAP("discovery_session_id", str);
        A00.A8R(((C22F) AnonymousClass229.A01(userSession)).A04.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A00.A8p("event_type", 2);
        A00.AAP("module", __redex_internal_original_name);
        A00.AAP("search_session_id", "");
        A00.A8R(EnumC50631MWs.A0A, "surface");
        String str2 = ((C22F) AnonymousClass229.A01(userSession)).A04.A0L;
        if (str2 == null) {
            str2 = "";
        }
        A00.AAP("camera_session_id", str2);
        A00.AAP("collection_pk", "");
        A00.AAP("grouping_pk", "");
        A00.AAP("nav_chain", C1QM.A00.A02.A00);
        A00.Cht();
        map.remove(str);
        if (!XkZ.A01.equals(interfaceC11380iw) && !XkZ.A07.equals(interfaceC11380iw) && !XkZ.A03.equals(interfaceC11380iw) && !XkZ.A05.equals(interfaceC11380iw) && !XkZ.A04.equals(interfaceC11380iw)) {
            return;
        }
        this.A04.clear();
        this.A03.clear();
    }

    @Override // X.C4T6
    public final void Cm5(InterfaceC11380iw interfaceC11380iw, String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        String str7 = str;
        C14360o3.A0B(interfaceC11380iw, 6);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "tap_effect_gallery_search_result");
        if (A00.isSampled()) {
            A00.A8p("event_type", 2);
            A00.AAP("module", interfaceC11380iw.getModuleName());
            if (str == null) {
                str6 = "";
            } else {
                str6 = str7;
            }
            A00.AAP("query_text", str6);
            A00.AAP("selected_id", str4);
            A00.A9K("selected_position", -1L);
            A00.AAP("selected_type", "effect");
            A00.A8R(EnumC50631MWs.A0A, "surface");
            A00.AAP("camera_session_id", ((C22F) AnonymousClass229.A01(this.A01)).A04.A0L);
            A00.AAP("discovery_session_id", str2);
            A00.A8R(null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.AAP("search_session_id", str3);
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
        C448224m c448224m = AnonymousClass229.A01(this.A01).A08;
        C18920wW c18920wW2 = c448224m.A01;
        String A002 = AbstractC43591JPw.A00(162);
        C12180kM c12180kM = c18920wW2.A00;
        InterfaceC02590Ai A003 = c18920wW2.A00(c12180kM, A002);
        if (A003.isSampled()) {
            A003.AAP("entity", "TAP_EFFECT_GALLERY_SEARCH_RESULT");
            C22M c22m = c448224m.A04;
            A003.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A003.A8p("event_type", 2);
            A003.A8R(EnumC50631MWs.A0A, "surface");
            String str8 = c22m.A0L;
            if (str8 == null) {
                str8 = "";
            }
            A003.AAP("camera_session_id", str8);
            A003.AAP("module", interfaceC11380iw.getModuleName());
            A003.AAP("legacy_falco_event_name", "TAP_EFFECT_GALLERY_SEARCH_RESULT");
            String str9 = str7;
            if (str == null) {
                str9 = "";
            }
            A003.AAP("query_text", str9);
            A003.AAP("selected_id", str4);
            A003.A9K("selected_position", -1L);
            A003.AAP("selected_type", "effect");
            A003.AAP("discovery_session_id", str2);
            A003.AAP("search_session_id", str3);
            A003.AAP("nav_chain", C1QM.A00.A02.A00);
            A003.Cht();
        }
        InterfaceC02590Ai A004 = c18920wW2.A00(c12180kM, AbstractC111324zv.A00(992));
        if (A004.isSampled()) {
            A004.AAP("legacy_falco_event_name", "TAP_EFFECT_GALLERY_SEARCH_RESULT");
            A004.AAP("entity", "TAP_EFFECT_GALLERY_SEARCH_RESULT");
            A004.A8p("event_type", 2);
            A004.AAP("module", interfaceC11380iw.getModuleName());
            if (str == null) {
                str7 = "";
            }
            A004.AAP("query_text", str7);
            A004.AAP("selected_id", str4);
            A004.A9K("selected_position", -1L);
            A004.AAP("selected_type", "effect");
            A004.A8R(EnumC50631MWs.A0A, "surface");
            A004.AAP("camera_session_id", c448224m.A04.A0L);
            A004.AAP("discovery_session_id", str2);
            A004.A8R(null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A004.AAP("search_session_id", str3);
            A004.AAP("nav_chain", C1QM.A00.A02.A00);
            A004.Cht();
        }
    }

    public C4T5(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AbstractC12220kQ.A01(this, userSession);
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A02 = c006802i;
    }
}
