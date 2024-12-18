package X;

import android.os.Bundle;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Hxr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40509Hxr {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        int A0D = AbstractC25230BEn.A0D(c6fw.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A0D2 = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        String A0o = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 3);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 4);
        String A0o2 = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 5);
        String A0o3 = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 6);
        String A0o4 = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 7);
        String A0o5 = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 8);
        String A0o6 = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 9);
        C140966Yy A0r = AbstractC25225BEi.A0r(C6BQ.A04(c6fq), C6BQ.A0B(c6fq));
        C1XJ.A00.A0T();
        ViewOnClickListenerC42034Ik3 viewOnClickListenerC42034Ik3 = new ViewOnClickListenerC42034Ik3(c6fq, A0I, 4);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("in_app_signup_flow", true);
        A0b.putInt("in_app_signup_stepper_index", A0D);
        A0b.putInt("in_app_signup_stepper_capacity", A0D2);
        A0b.putString("in_app_signup_catalog_selection_title_text", A0o6);
        A0b.putString("in_app_signup_bottom_button_text", (String) A00);
        A0b.putString("in_app_signup_bottom_button_route", A0o);
        A0b.putString("waterfall_id", A0o2);
        A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A0o3);
        A0b.putString("presentation_style", A0o5);
        AbstractC37300Gc1.A0c(A0b, A0o4);
        HD9 hd9 = new HD9();
        hd9.A00 = viewOnClickListenerC42034Ik3;
        hd9.setArguments(A0b);
        A0r.A0B(null, hd9);
        A0r.A04();
        return null;
    }
}
