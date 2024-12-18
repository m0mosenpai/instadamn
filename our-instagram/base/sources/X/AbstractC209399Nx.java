package X;

import com.instagram.camera.effect.models.CameraAREffect;
import java.io.IOException;

/* renamed from: X.9Nx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209399Nx {
    public static final C47Z A00(C47Z c47z, String str) {
        C14360o3.A0B(c47z, 0);
        try {
            String A00 = C47Y.A00(c47z);
            C14360o3.A07(A00);
            C47Z parseFromJson = C47Y.parseFromJson(C16V.A00(A00));
            C14360o3.A07(parseFromJson);
            C14360o3.A0B(str, 0);
            parseFromJson.A3t = str;
            parseFromJson.A35 = str;
            CameraAREffect cameraAREffect = c47z.A10;
            CameraAREffect cameraAREffect2 = parseFromJson.A10;
            if (cameraAREffect != null && cameraAREffect2 != null) {
                cameraAREffect2.A0k = cameraAREffect.A0k;
            }
            c47z.A2f = str;
            return parseFromJson;
        } catch (IOException e) {
            C0w9.A01.EmQ("PendingMedia#copyPendingMedia", e);
            throw new IllegalStateException("Failed to copy pending media", e);
        }
    }

    public static final C47Z A01(String str) {
        C14360o3.A0B(str, 0);
        C47Z c47z = new C47Z(str);
        c47z.A0T(EnumC40111tc.A0Q);
        return c47z;
    }

    public static final C47Z A02(String str) {
        C14360o3.A0B(str, 0);
        C47Z c47z = new C47Z(str);
        c47z.A0T(EnumC40111tc.A0a);
        return c47z;
    }
}
