package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: X.7F3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7F3 {
    public final InterfaceC08100bW A00;
    public final C18920wW A01;
    public final java.util.Set A02;
    public final InterfaceC09390do A03;

    public C7F3(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = AbstractC12220kQ.A01(new C19270xB("direct_thread"), userSession);
        this.A00 = new C1QF("IgSecureUriParser").A00;
        this.A03 = AbstractC09440dt.A01(new C206959Ea(userSession, 47));
        this.A02 = new LinkedHashSet();
    }

    public final void A09(String str) {
        C25531Mh A0J = C25531Mh.A0J(this.A01);
        if (((AbstractC02600Aj) A0J).A00.isSampled()) {
            A0J.A0Z(20);
            A0J.A0X(0);
            A0J.A0R("selected_item", str);
            A0J.Cht();
        }
    }

    public final void A0B(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ai_agent_embodiment_pip_acted_on");
        if (A00.isSampled()) {
            A00.AAP("thread_session_id", str);
            A00.AAP("pip_position_corners", str2);
            A00.AAP("pip_click_type", str3);
            A00.Cht();
        }
    }

    public static final EnumC72433Xdd A00(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return EnumC72433Xdd.A03;
            }
            return EnumC72433Xdd.A04;
        }
        if (z2) {
            return EnumC72433Xdd.A05;
        }
        return EnumC72433Xdd.A06;
    }

    public static final void A01(EnumC33519Ers enumC33519Ers, EnumC72433Xdd enumC72433Xdd, C7F3 c7f3, String str, int i) {
        C25531Mh A0J = C25531Mh.A0J(c7f3.A01);
        if (((AbstractC02600Aj) A0J).A00.isSampled()) {
            A0J.A0Z(i);
            A0J.A0X(0);
            A0J.A0M(enumC33519Ers, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.A0R("selected_item", "request_access");
            A0J.A0M(enumC72433Xdd, "thread_type");
            A0J.A0R("agent_id", str);
            A0J.Cht();
        }
    }

    public static final void A02(C7F3 c7f3, String str, boolean z, boolean z2, boolean z3) {
        EnumC72433Xdd enumC72433Xdd;
        String str2;
        C25531Mh A0J = C25531Mh.A0J(c7f3.A01);
        if (((AbstractC02600Aj) A0J).A00.isSampled()) {
            if (z) {
                enumC72433Xdd = EnumC72433Xdd.A05;
            } else {
                enumC72433Xdd = EnumC72433Xdd.A06;
            }
            A0J.A0Z(8);
            A0J.A0X(0);
            if (z3) {
                str2 = "memu_mustache";
            } else {
                str2 = "create_an_image_mustache";
            }
            A0J.A0R("selected_item", str2);
            A0J.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A0J.A0M(enumC72433Xdd, "thread_type");
            A0J.A0O("is_e2ee", Boolean.valueOf(z2));
            A0J.Cht();
        }
    }

    public final LinkedHashMap A03(android.net.Uri uri) {
        Boolean A0A;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String queryParameter = uri.getQueryParameter("is_ai_agent");
        if (queryParameter != null && (A0A = AbstractC001900j.A0A(queryParameter)) != null && A0A.booleanValue()) {
            String queryParameter2 = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            if (queryParameter2 != null) {
                linkedHashMap.put("agent_id", queryParameter2);
            }
            linkedHashMap.put(TraceFieldType.ContentType, "ai_agent_share");
            int intValue = ((C31267Dop) this.A03.getValue()).A00().intValue();
            if (intValue != 3) {
                if (intValue != 2) {
                    if (intValue != 1) {
                        str = "ineligible";
                    } else {
                        str = "not_requested_waitlist";
                    }
                } else {
                    str = "requested_waitlist";
                }
            } else {
                str = "access_granted";
            }
            linkedHashMap.put("agent_access_status", str);
        }
        return linkedHashMap;
    }

    public final void A04() {
        C25531Mh A0J = C25531Mh.A0J(this.A01);
        if (((AbstractC02600Aj) A0J).A00.isSampled()) {
            A0J.A0Z(23);
            A0J.A0X(1);
            A0J.A0M(EnumC33519Ers.A05, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.Cht();
        }
    }

    public final void A05(EnumC33519Ers enumC33519Ers) {
        C25531Mh A0J = C25531Mh.A0J(this.A01);
        if (((AbstractC02600Aj) A0J).A00.isSampled()) {
            A0J.A0Z(10);
            A0J.A0X(0);
            A0J.A0M(enumC33519Ers, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.A0R("selected_item", "get_started");
            A0J.Cht();
        }
    }

    public final void A06(EnumC33519Ers enumC33519Ers) {
        C25531Mh A0J = C25531Mh.A0J(this.A01);
        if (((AbstractC02600Aj) A0J).A00.isSampled()) {
            A0J.A0Z(10);
            A0J.A0X(0);
            A0J.A0M(enumC33519Ers, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.A0R("selected_item", "cancel");
            A0J.Cht();
        }
    }

    public final void A07(EnumC33519Ers enumC33519Ers) {
        C25531Mh A0J = C25531Mh.A0J(this.A01);
        if (((AbstractC02600Aj) A0J).A00.isSampled()) {
            A0J.A0Z(10);
            A0J.A0X(1);
            A0J.A0M(enumC33519Ers, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.Cht();
        }
    }

    public final void A08(EnumC33519Ers enumC33519Ers) {
        C25531Mh A0J = C25531Mh.A0J(this.A01);
        if (((AbstractC02600Aj) A0J).A00.isSampled()) {
            A0J.A0Z(11);
            A0J.A0X(0);
            A0J.A0M(enumC33519Ers, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.A0R("selected_item", "get_started");
            A0J.Cht();
        }
    }

    public final void A0A(String str, String str2, String str3) {
        C25531Mh A0J = C25531Mh.A0J(this.A01);
        if (((AbstractC02600Aj) A0J).A00.isSampled()) {
            A0J.A0Y(0);
            A0J.A0Z(19);
            A0J.A0X(0);
            A0J.A0R("selected_item", str3);
            A0J.A0M(EnumC72433Xdd.A02, "thread_type");
            A0J.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A0J.A0R("agent_id", str2);
            A0J.A0M(EnumC33519Ers.A0I, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.Cht();
        }
    }

    public final void A0C(String str, String str2, String str3) {
        int i;
        if (str3.equals("GENAI_SUBSCRIPTION")) {
            i = 30;
        } else if (!str3.equals("GENAI_REMINDER")) {
            return;
        } else {
            i = 31;
        }
        C25531Mh A0J = C25531Mh.A0J(this.A01);
        if (((AbstractC02600Aj) A0J).A00.isSampled()) {
            A0J.A0X(1);
            A0J.A0Z(i);
            A0J.A0M(VHV.TEXT, AbstractC58317Pt9.A00(29));
            A0J.A0M(EnumC72433Xdd.A02, "thread_type");
            A0J.A0R("agent_id", str);
            A0J.A0R("bot_response_id", str2);
            A0J.Cht();
        }
    }

    public final void A0D(String str, String str2, boolean z) {
        String str3;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ai_agent_embodiment_status_changed");
        if (A00.isSampled()) {
            if (z) {
                str3 = "enabled";
            } else {
                str3 = "disabled";
            }
            A00.AAP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str3);
            A00.AAP("thread_session_id", str);
            A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A00.Cht();
        }
    }

    public final void A0E(String str, String str2, boolean z, boolean z2, boolean z3) {
        EnumC72433Xdd enumC72433Xdd;
        C25531Mh A0J = C25531Mh.A0J(this.A01);
        int i = 24;
        if (z) {
            i = 40;
        }
        if (z3) {
            enumC72433Xdd = EnumC72433Xdd.A05;
        } else {
            enumC72433Xdd = EnumC72433Xdd.A06;
        }
        if (((AbstractC02600Aj) A0J).A00.isSampled()) {
            A0J.A0Z(i);
            A0J.A0R("agent_id", str);
            A0J.A0X(z2 ? 1 : 0);
            A0J.A0R("selected_item", "meta_ai_invocation");
            A0J.A0M(enumC72433Xdd, "thread_type");
            A0J.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A0J.Cht();
        }
    }

    public final void A0F(String str, boolean z, boolean z2) {
        EnumC72433Xdd enumC72433Xdd;
        String str2;
        C25531Mh A0J = C25531Mh.A0J(this.A01);
        if (z) {
            enumC72433Xdd = EnumC72433Xdd.A05;
        } else {
            enumC72433Xdd = EnumC72433Xdd.A06;
        }
        if (((AbstractC02600Aj) A0J).A00.isSampled()) {
            A0J.A0Z(8);
            A0J.A0X(1);
            if (z2) {
                str2 = "memu_mustache";
            } else {
                str2 = "create_an_image_mustache";
            }
            A0J.A0R("selected_item", str2);
            A0J.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A0J.A0M(enumC72433Xdd, "thread_type");
            A0J.Cht();
        }
    }
}
