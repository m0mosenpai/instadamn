package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes11.dex */
public abstract class VRO {
    public static void A00(C69094Vhk c69094Vhk, C18920wW c18920wW, String str) {
        String str2;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        A00.AAP("event", str);
        A00.AAP("flow", "ig_professional_access_token_library");
        A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c69094Vhk.A02);
        int intValue = c69094Vhk.A01.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                str2 = null;
            } else {
                throw new RuntimeException();
            }
        } else {
            str2 = "business_user_access_token";
        }
        A00.AAP("token_type", str2);
        A00.Cht();
    }
}
