package X;

import android.graphics.Point;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;

/* renamed from: X.9N5, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9N5 {
    public static final C9N6 A00(Point point, Point point2, ClipInfo clipInfo) {
        return new C9N6(point2, null, null, clipInfo, clipInfo, null, null, clipInfo.A00, point.x, point.y, false);
    }

    public static final C9N6 A01(Point point, C47Z c47z) {
        ClipInfo clipInfo = c47z.A1N;
        ClipInfo clipInfo2 = (ClipInfo) c47z.A4G.get(0);
        CameraAREffect cameraAREffect = c47z.A10;
        float f = c47z.A02;
        List list = c47z.A4a;
        int i = c47z.A0H;
        int i2 = c47z.A0G;
        return new C9N6(point, cameraAREffect, c47z.A16, clipInfo, clipInfo2, c47z.A2h, list, f, i, i2, c47z.A69);
    }
}
