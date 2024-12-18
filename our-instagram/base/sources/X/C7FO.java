package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.List;

/* renamed from: X.7FO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7FO {
    public final C7FR A00;
    public final C7FQ A01;
    public final InterfaceC16820sZ A02;

    public C7FO(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A02 = interfaceC16820sZ;
        this.A01 = C7FP.A00(interfaceC11380iw, userSession);
        this.A00 = new C7FR(interfaceC11380iw, userSession);
    }

    public final void A00(C7GY c7gy) {
        String str;
        if (c7gy != null) {
            InterfaceC16820sZ interfaceC16820sZ = this.A02;
            C2ED c2ed = (C2ED) interfaceC16820sZ.invoke();
            if (c2ed != null) {
                List BSD = c2ed.BSD();
                C7FR c7fr = this.A00;
                String str2 = c7gy.A00;
                C2ED c2ed2 = (C2ED) interfaceC16820sZ.invoke();
                if (c2ed2 == null || (str = c2ed2.C7I()) == null) {
                    str = "";
                }
                C14360o3.A0B(str2, 1);
                C18920wW c18920wW = c7fr.A00;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_composer_tap_poll");
                if (A00.isSampled()) {
                    A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                    A00.AAk("recipient_ids", BSD);
                    A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
                    A00.Cht();
                }
            }
        }
    }
}
