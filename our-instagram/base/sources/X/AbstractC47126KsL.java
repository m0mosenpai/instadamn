package X;

import android.graphics.RectF;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.KsL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47126KsL {
    public static final void A00(RectF rectF, Bundle bundle, Fragment fragment, UserSession userSession, InterfaceC1119353f interfaceC1119353f) {
        C14360o3.A0B(fragment, 0);
        if (rectF != null) {
            bundle.putParcelable("camera_entry_bounds", rectF);
        }
        C6XJ A02 = C6XJ.A02(fragment.requireActivity(), bundle, userSession, TransparentModalActivity.class, "attribution_quick_camera_fragment");
        A02.A0E(interfaceC1119353f);
        if (rectF == null) {
            AbstractC31179DnN.A1S(A02);
        }
        A02.A0D(fragment, 60571);
    }
}
