package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.UUID;

/* renamed from: X.6s6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC151606s6 {
    public static final BusinessFlowAnalyticsLogger A00(EnumC151596s5 enumC151596s5, final InterfaceC11380iw interfaceC11380iw, final AbstractC12990ll abstractC12990ll, final String str) {
        BusinessFlowAnalyticsLogger xn5;
        C14360o3.A0B(abstractC12990ll, 0);
        switch (enumC151596s5.ordinal()) {
            case 0:
                xn5 = new XN5(interfaceC11380iw, abstractC12990ll, str);
                break;
            case 1:
            case 10:
                xn5 = new C73455YDy(interfaceC11380iw, abstractC12990ll, str);
                break;
            case 2:
            case 9:
                xn5 = new YE0(interfaceC11380iw, abstractC12990ll, str);
                break;
            case 3:
            case 8:
            default:
                return null;
            case 4:
                xn5 = new BusinessFlowAnalyticsLogger(interfaceC11380iw, abstractC12990ll, str) { // from class: X.6s7
                    public final C18920wW A00;
                    public final String A01;

                    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
                    public final void Cid(Y7A y7a) {
                        C14360o3.A0B(y7a, 0);
                        C18920wW c18920wW = this.A00;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "edit_profile_cancel");
                        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
                        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, y7a.A01);
                        A00.AAP("fb_user_id", null);
                        A00.AAP("waterfall_id", this.A01);
                        A00.Cht();
                    }

                    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
                    public final void Cim(Y7A y7a) {
                        C14360o3.A0B(y7a, 0);
                        C18920wW c18920wW = this.A00;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "edit_profile_change_option");
                        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
                        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, y7a.A01);
                        A00.AAP("component", y7a.A00);
                        A00.AAP("fb_user_id", null);
                        A00.AAP("waterfall_id", this.A01);
                        if (y7a.A0A() != null) {
                            A00.A9M("default_values", y7a.A0A());
                        }
                        if (y7a.A0B() != null) {
                            A00.A9M("selected_values", y7a.A0B());
                        }
                        A00.Cht();
                    }

                    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
                    public final void CjJ(Y7A y7a) {
                        C14360o3.A0B(y7a, 0);
                        C18920wW c18920wW = this.A00;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "edit_profile_fetch_data");
                        String str2 = y7a.A00;
                        if (str2 == null) {
                            str2 = "";
                        }
                        A00.AAP("component", str2);
                        String str3 = y7a.A01;
                        if (str3 == null) {
                            str3 = "";
                        }
                        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
                        A00.AAP("pigeon_reserved_keyword_module", "");
                        A00.A9K("pk", -1L);
                        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
                        A00.AAP("waterfall_id", this.A01);
                        if (y7a.A0A() != null) {
                            A00.A9M("default_values", y7a.A0A());
                        }
                        if (y7a.A0B() != null) {
                            A00.A9M("selected_values", y7a.A0B());
                        }
                        if (y7a.A09() != null) {
                            A00.A9M("available_options", y7a.A09());
                        }
                        A00.Cht();
                    }

                    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
                    public final void CjK(Y7A y7a) {
                        C14360o3.A0B(y7a, 0);
                        C18920wW c18920wW = this.A00;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "edit_profile_fetch_data_error");
                        String str2 = y7a.A00;
                        if (str2 == null) {
                            str2 = "";
                        }
                        A00.AAP("component", str2);
                        String str3 = y7a.A01;
                        if (str3 == null) {
                            str3 = "";
                        }
                        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
                        A00.AAP("pigeon_reserved_keyword_module", "");
                        A00.A9K("pk", -1L);
                        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
                        A00.AAP("waterfall_id", this.A01);
                        A00.AAP("error_message", y7a.A03);
                        if (y7a.A0B() != null) {
                            A00.A9M("selected_values", y7a.A0B());
                        }
                        A00.Cht();
                    }

                    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
                    public final void CjL(Y7A y7a) {
                        C14360o3.A0B(y7a, 0);
                        C18920wW c18920wW = this.A00;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "edit_profile_finish_step");
                        String str2 = y7a.A01;
                        if (str2 == null) {
                            str2 = "";
                        }
                        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
                        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
                        A00.AAP("waterfall_id", this.A01);
                        A00.A9M("default_values", y7a.A0A());
                        A00.A9M("selected_values", y7a.A0B());
                        A00.Cht();
                    }

                    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
                    public final void Clj(Y7A y7a) {
                    }

                    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
                    public final void Clo(Y7A y7a) {
                        C14360o3.A0B(y7a, 0);
                        C18920wW c18920wW = this.A00;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "edit_profile_start_step");
                        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
                        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, y7a.A01);
                        A00.AAP("fb_user_id", null);
                        A00.AAP("waterfall_id", this.A01);
                        if (y7a.A0A() != null) {
                            A00.A9M("default_values", y7a.A0A());
                        }
                        if (y7a.A0B() != null) {
                            A00.A9M("selected_values", y7a.A0B());
                        }
                        A00.Cht();
                    }

                    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
                    public final void Clu(Y7A y7a) {
                        C14360o3.A0B(y7a, 0);
                        C18920wW c18920wW = this.A00;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "edit_profile_submit");
                        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
                        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, y7a.A01);
                        A00.AAP("component", y7a.A00);
                        A00.AAP("fb_user_id", null);
                        A00.AAP("waterfall_id", this.A01);
                        if (y7a.A0A() != null) {
                            A00.A9M("default_values", y7a.A0A());
                        }
                        if (y7a.A0B() != null) {
                            A00.A9M("selected_values", y7a.A0B());
                        }
                        A00.Cht();
                    }

                    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
                    public final void Clv(Y7A y7a) {
                        C14360o3.A0B(y7a, 0);
                        C18920wW c18920wW = this.A00;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "edit_profile_submit_error");
                        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
                        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, y7a.A01);
                        A00.AAP("component", y7a.A00);
                        A00.AAP(MSV.A00(46), y7a.A02);
                        A00.AAP("error_message", y7a.A03);
                        A00.AAP("fb_user_id", null);
                        A00.AAP("waterfall_id", this.A01);
                        if (y7a.A0A() != null) {
                            A00.A9M("default_values", y7a.A0A());
                        }
                        if (y7a.A0B() != null) {
                            A00.A9M("selected_values", y7a.A0B());
                        }
                        A00.Cht();
                    }

                    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
                    public final void Cm3(Y7A y7a) {
                        C14360o3.A0B(y7a, 0);
                        C18920wW c18920wW = this.A00;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "edit_profile_tap_component");
                        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
                        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, y7a.A01);
                        A00.AAP("component", y7a.A00);
                        A00.AAP("fb_user_id", null);
                        A00.AAP("waterfall_id", this.A01);
                        if (y7a.A0A() != null) {
                            A00.A9M("default_values", y7a.A0A());
                        }
                        if (y7a.A0B() != null) {
                            A00.A9M("selected_values", y7a.A0B());
                        }
                        A00.Cht();
                    }

                    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
                    public final void CmQ(Y7A y7a) {
                        C14360o3.A0B(y7a, 0);
                        C18920wW c18920wW = this.A00;
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "edit_profile_view_component");
                        String str2 = y7a.A00;
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        A00.AAP("component", str2);
                        String str4 = y7a.A01;
                        if (str4 != null) {
                            str3 = str4;
                        }
                        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
                        A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, y7a.A04);
                        A00.AAP("waterfall_id", this.A01);
                        if (y7a.A0B() != null) {
                            A00.A9M("selected_values", y7a.A0B());
                        }
                        A00.Cht();
                    }

                    {
                        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
                        if (str == null) {
                            r4 = UUID.randomUUID().toString();
                            C14360o3.A07(r4);
                        }
                        this.A01 = r4;
                    }
                };
                break;
            case 5:
                xn5 = new YE1(interfaceC11380iw, abstractC12990ll, str);
                break;
            case 6:
                xn5 = new YE2(interfaceC11380iw, abstractC12990ll, str);
                break;
            case 7:
                xn5 = new C73456YDz(interfaceC11380iw, abstractC12990ll, str);
                break;
        }
        return xn5;
    }

    public static final BusinessFlowAnalyticsLogger A01(EnumC151596s5 enumC151596s5, AbstractC12990ll abstractC12990ll, String str, String str2) {
        C14360o3.A0B(abstractC12990ll, 0);
        C14360o3.A0B(str, 1);
        return A00(enumC151596s5, new C19270xB(str), abstractC12990ll, str2);
    }

    public static final YE3 A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (YE3) userSession.A01(YE3.class, new C57253Pbb(7, new C19270xB("waterfall_inspiration_hub"), userSession));
    }
}
