package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7G0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7G0 implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "DirectScheduledMessageLogger";
    public final C18920wW A00;
    public final UserSession A01;
    public final String A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public C7G0(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = AbstractC12220kQ.A01(this, userSession);
        this.A04 = AbstractC09440dt.A01(new C9E1(this, 6));
        this.A03 = AbstractC09440dt.A01(new C9E1(this, 5));
    }

    public final void A00(C83403nh c83403nh, DirectThreadKey directThreadKey, String str) {
        EnumC72433Xdd enumC72433Xdd;
        EnumC72424XdU enumC72424XdU;
        C14360o3.A0B(directThreadKey, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_long_press_message_menu_click");
        if (A00.isSampled()) {
            C81663kb A03 = C2DU.A03((C2DU) C2JD.A00(this.A01), directThreadKey);
            EnumC72424XdU[] values = EnumC72424XdU.values();
            int length = values.length;
            int i = 0;
            while (true) {
                enumC72433Xdd = null;
                if (i < length) {
                    enumC72424XdU = values[i];
                    if (A03 != null && ((int) enumC72424XdU.A00) == A03.C7g()) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    enumC72424XdU = null;
                    break;
                }
            }
            A00.AAP("action", "click");
            A00.AAP("menu_ui", AbstractC43591JPw.A00(325));
            A00.AAP(AbstractC43591JPw.A00(1169), str);
            A00.AAP("open_thread_id", AbstractC43827JZq.A01(directThreadKey));
            A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C2EY.A1i.toString());
            A00.AAP("message_id", c83403nh.A0i());
            A00.A8R(enumC72424XdU, "thread_subtype");
            A00.AAP("client_context", c83403nh.A0g());
            if (A03 != null) {
                enumC72433Xdd = AbstractC34774FTx.A00(A03);
            }
            A00.A8R(enumC72433Xdd, "thread_type");
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "scheduled_messages");
            A00.Cht();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_schedule_message";
    }
}
