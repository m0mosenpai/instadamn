package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.86H, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86H implements C86I {
    public final boolean A00;

    @Override // X.C86I
    public final boolean Cnh(CameraAREffect cameraAREffect) {
        C14360o3.A0B(cameraAREffect, 0);
        if (this.A00) {
            if (cameraAREffect.A0K() || cameraAREffect.A0Z.get("audioFBA") != null || cameraAREffect.A0J()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C86H(boolean z) {
        this.A00 = z;
    }
}
