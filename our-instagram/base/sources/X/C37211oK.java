package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.1oK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37211oK {
    public static C37211oK A03;
    public final C37221oL A02 = C37221oL.A00;
    public final C37231oM A01 = C37231oM.A00;
    public final C37241oN A00 = C37241oN.A00;

    public final void A00(Activity activity, EnumC33519Ers enumC33519Ers, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(activity, 1);
        AbstractC35257Fgr.A00(activity, null, userSession, enumC33519Ers.toString(), null);
    }

    public final void A01(Activity activity, EnumC33519Ers enumC33519Ers, UserSession userSession, EnumC160197Gf enumC160197Gf, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        String obj = enumC33519Ers.toString();
        C14360o3.A0B(obj, 2);
        if (AbstractC31268Doq.A08(userSession)) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("ai_agent_command_id_to_invoke", enumC160197Gf);
            bundle.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, obj);
            bundle.putBoolean("ai_agent_launch_imagine_create_on_exit", z);
            bundle.putBoolean("ai_agent_launch_meta_ai_invocation_sheet_on_exit", z2);
            C6XJ A032 = C6XJ.A03(activity, bundle, userSession, ModalActivity.class, "agent_assistant_interstitial");
            A032.A08();
            A032.A0A(activity, 104);
        }
    }

    public final void A02(Activity activity, EnumC33519Ers enumC33519Ers, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        ViewGroup viewGroup;
        C14360o3.A0B(userSession, 0);
        EI9 ei9 = new EI9();
        Bundle bundle = new Bundle();
        bundle.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC33519Ers);
        ei9.setArguments(bundle);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0v = true;
        c189448aO.A0U = new C36728GGx(ei9, interfaceC16820sZ, interfaceC16820sZ2);
        C189478aR A02 = c189448aO.A00().A02(activity, ei9);
        if (A02 != null && (viewGroup = A02.A03.titleAndNavContainer) != null) {
            viewGroup.setVisibility(8);
        }
    }

    public final void A03(Activity activity, UserSession userSession, String str, InterfaceC16820sZ interfaceC16820sZ) {
        ViewGroup viewGroup;
        C14360o3.A0B(userSession, 1);
        if (!AbstractC162267Oo.A02(userSession)) {
            EJE eje = new EJE();
            Bundle bundle = new Bundle();
            bundle.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            eje.setArguments(bundle);
            C189448aO c189448aO = new C189448aO(userSession);
            c189448aO.A0v = true;
            c189448aO.A0U = new C36723GGs(userSession, interfaceC16820sZ);
            C189478aR A02 = c189448aO.A00().A02(activity, eje);
            if (A02 != null && (viewGroup = A02.A03.titleAndNavContainer) != null) {
                viewGroup.setVisibility(8);
            }
        }
    }
}
