package X;

import android.content.Context;
import android.graphics.Point;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.pendingmedia.model.constants.ShareType;
import kotlin.Deprecated;

/* renamed from: X.75I, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C75I {
    @Deprecated(message = "Please use the overloaded method that takes a TargetViewSizeProvider")
    public static final CameraSpec A00(Context context, UserSession userSession) {
        int i;
        int i2;
        CameraSpec cameraSpec = (CameraSpec) new Gson().A08(C1AT.A01(userSession).A03(C1AV.A0e).getString("KEY_CAMERA_SPEC", null), CameraSpec.class);
        if (cameraSpec == null) {
            if (C57992lC.A03()) {
                InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) AbstractC58002lE.A00(context, userSession)).A0K;
                i = interfaceC1812882f.getWidth();
                i2 = interfaceC1812882f.getHeight();
            } else {
                AbstractC12120kG.A07(AnonymousClass001.A0g("TargetViewSizeProviderFactory", "_getInstanceSafe_", "getCameraSpec"), "WindowInsetsManager.areStableStatusAndNavBarHeightsInitialized() is false. Did we mistakenly call WindowInsetsManager.reset() or forgot to call WindowInsetsManager.startListeningForStableStatusAndNavigationBarHeight()?", null);
                Point A02 = ALe.A02(context, userSession, 0.5625f, AbstractC54249NyU.A00(context, userSession, Integer.MAX_VALUE, new C55146Od7(userSession, ShareType.A08, false, false, false, false).A06(), false));
                C14360o3.A07(A02);
                i = A02.x;
                i2 = A02.y;
            }
            return A01(userSession, i, i2);
        }
        return cameraSpec;
    }

    public static final CameraSpec A01(UserSession userSession, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (i < i2) {
            i4 = i;
            i3 = i2;
        }
        return new CameraSpec(i4, i3, C179737yN.A00(C177517ul.A00(userSession).A00, null, null, null, false).A01.A03, C179737yN.A00(C177517ul.A00(userSession).A00, null, null, null, false).A01.A08, C177517ul.A00(userSession).A00.ArT(1003));
    }
}
