package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.7Vi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163947Vi {
    public final /* synthetic */ AnonymousClass983 A00;

    public final void A00(InterfaceC11380iw interfaceC11380iw, EnumC33322EoH enumC33322EoH, C3o9 c3o9) {
        C14360o3.A0B(interfaceC11380iw, 1);
        AnonymousClass983 anonymousClass983 = this.A00;
        KB3 kb3 = anonymousClass983.A0L;
        if (kb3 != null) {
            kb3.A07();
        }
        if (C36701nT.A00 != null) {
            FragmentActivity requireActivity = anonymousClass983.A0u.requireActivity();
            UserSession userSession = anonymousClass983.A10;
            String moduleName = interfaceC11380iw.getModuleName();
            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
            Bundle bundle = new Bundle();
            AbstractC43826JZo.A01(bundle, c3o9, "thread_key");
            bundle.putString("analytics_module_name", moduleName);
            bundle.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC33322EoH);
            abstractC59962oe.setArguments(bundle);
            String moduleName2 = interfaceC11380iw.getModuleName();
            Bundle bundle2 = new Bundle();
            AbstractC43826JZo.A01(bundle2, c3o9, "thread_key");
            bundle2.putString("analytics_module_name", moduleName2);
            bundle2.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC33322EoH);
            C140966Yy c140966Yy = new C140966Yy(requireActivity, userSession);
            c140966Yy.A0D(abstractC59962oe);
            c140966Yy.A04();
            return;
        }
        C14360o3.A0F("instance");
        throw C00O.createAndThrow();
    }

    public C163947Vi(AnonymousClass983 anonymousClass983) {
        this.A00 = anonymousClass983;
    }

    public final void A01(EnumC33322EoH enumC33322EoH, C3o9 c3o9) {
        AnonymousClass983 anonymousClass983 = this.A00;
        KB3 kb3 = anonymousClass983.A0L;
        if (kb3 != null) {
            kb3.A07();
        }
        if (C36701nT.A00 != null) {
            FragmentActivity requireActivity = anonymousClass983.A0u.requireActivity();
            UserSession userSession = anonymousClass983.A10;
            AbstractC59962oe abstractC59962oe = new AbstractC59962oe();
            Bundle bundle = new Bundle();
            AbstractC43826JZo.A01(bundle, c3o9, "thread_key");
            bundle.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC33322EoH);
            abstractC59962oe.setArguments(bundle);
            Bundle bundle2 = new Bundle();
            AbstractC43826JZo.A01(bundle2, c3o9, "thread_key");
            bundle2.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC33322EoH);
            C140966Yy c140966Yy = new C140966Yy(requireActivity, userSession);
            c140966Yy.A0D(abstractC59962oe);
            c140966Yy.A04();
            return;
        }
        C14360o3.A0F("instance");
        throw C00O.createAndThrow();
    }
}
