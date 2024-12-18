package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* renamed from: X.7FR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7FR {
    public final C18920wW A00;
    public final UserSession A01;

    public C7FR(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A01(InterfaceC83713oG interfaceC83713oG, Long l, String str) {
        String str2;
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_media_gallery_tap");
        if (A00.isSampled()) {
            if (interfaceC83713oG != null) {
                str2 = AbstractC92784Dr.A02(interfaceC83713oG);
            } else {
                str2 = null;
            }
            A00.AAP("open_thread_id", str2);
            A00.AAP("media_type", str);
            A00.A9K(AbstractC43591JPw.A00(1245), l);
            A00.AAP("creation_session_id", null);
            A00.Cht();
        }
    }

    public final void A02(InterfaceC83713oG interfaceC83713oG, List list, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC83713oG, 0);
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_composer_tap_sticker");
        if (A00.isSampled()) {
            if (list == null) {
                list = C16930sl.A00;
            }
            A00.AAk("recipient_ids", list);
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC43591JPw.A00(473));
            A00.A7v("is_reply_flow", Boolean.valueOf(z));
            A00.AAP("open_thread_id", AbstractC92784Dr.A02(interfaceC83713oG));
            A00.A9K("occamadillo_thread_id", AbstractC92784Dr.A01(interfaceC83713oG));
            A00.A7v("is_e2ee", Boolean.valueOf(AbstractC140946Yw.A07(interfaceC83713oG)));
            A00.A7v("is_bottom_sheet_thread", Boolean.valueOf(z2));
            A00.Cht();
        }
    }

    public final void A00(EnumC46270Ke2 enumC46270Ke2, EnumC72433Xdd enumC72433Xdd, InterfaceC83713oG interfaceC83713oG, Long l, String str, String str2, List list, List list2) {
        String str3;
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_composer_tap");
        if (A00.isSampled()) {
            A00.AAP("target", str);
            A00.A8R(enumC46270Ke2, "action");
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
            A00.A8R(enumC72433Xdd, "thread_type");
            A00.A9K("num_images", l);
            A00.AAk("recipient_ids", list);
            A00.AAk("commands", list2);
            Boolean bool = null;
            if (interfaceC83713oG != null) {
                str3 = AbstractC92784Dr.A02(interfaceC83713oG);
            } else {
                str3 = null;
            }
            A00.AAP("open_thread_id", str3);
            if (interfaceC83713oG != null) {
                bool = Boolean.valueOf(AbstractC140946Yw.A07(interfaceC83713oG));
            }
            A00.A7v("is_e2ee", bool);
            A00.Cht();
        }
    }
}
