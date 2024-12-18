package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;

/* renamed from: X.5gD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122175gD {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C122175gD) || i != ((C122175gD) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return CameraRollManager.ASSET_TYPE_ALL;
        }
        if (i == 2) {
            return "Weight";
        }
        if (i == 3) {
            return "Style";
        }
        return "Invalid";
    }
}
