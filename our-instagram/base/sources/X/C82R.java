package X;

import android.os.Bundle;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.82R, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C82R {
    public static final CameraConfiguration A00(C55U c55u, C81W... c81wArr) {
        C14360o3.A0B(c55u, 0);
        return new CameraConfiguration(c55u, new HashSet(AbstractC16960so.A1Q(Arrays.copyOf(c81wArr, c81wArr.length))));
    }

    public static void A01(Bundle bundle, Serializable serializable) {
        bundle.putParcelable(AbstractC111324zv.A00(16), A00(C208509Kk.A00, C81W.A0C));
        bundle.putSerializable("camera_entry_point", serializable);
    }
}
