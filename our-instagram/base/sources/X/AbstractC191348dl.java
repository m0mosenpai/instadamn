package X;

import com.facebook.R;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8dl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC191348dl {
    public static final Map A00 = new HashMap();

    public static final int A00(CameraConfiguration cameraConfiguration) {
        C55U c55u = cameraConfiguration.A03;
        if (c55u instanceof C81S) {
            return R.drawable.instagram_icons_exceptions_live_shutter_outline_62;
        }
        if ((c55u instanceof C208509Kk) || (c55u instanceof C81T)) {
            Iterator it = cameraConfiguration.A04.iterator();
            while (it.hasNext()) {
                int ordinal = ((C81W) it.next()).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 4) {
                        if (ordinal != 6) {
                            if (ordinal != 16) {
                                if (ordinal == 28) {
                                    return R.drawable.dual_shutter_icon;
                                }
                            } else {
                                return R.drawable.stopmotion_shutter_icon;
                            }
                        } else {
                            return R.drawable.handsfree_shutter_icon;
                        }
                    } else {
                        return R.drawable.layout_shutter_icon;
                    }
                } else {
                    return R.drawable.boomerang_shutter_icon;
                }
            }
            return -1;
        }
        return -1;
    }
}
