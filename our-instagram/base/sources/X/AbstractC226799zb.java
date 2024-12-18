package X;

import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;

/* renamed from: X.9zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226799zb {
    public static final C09530e4 findTargetVideoDimensions(int i, int i2, int i3, CameraSpec cameraSpec) {
        int min;
        int i4;
        Integer valueOf;
        Object obj;
        C14360o3.A0B(cameraSpec, 3);
        float f = i / i2;
        if (i >= i2) {
            i4 = Math.min(i, cameraSpec.A03);
            min = (int) (i4 / f);
        } else {
            min = Math.min(i2, cameraSpec.A02);
            i4 = (int) (min * f);
        }
        C09530e4 A0o = AbstractC167007dF.A0o(Integer.valueOf(i4), min);
        if (i3 != 90 && i3 != 270) {
            valueOf = Integer.valueOf(AbstractC166987dD.A0H(A0o.A00) & (-2));
            obj = A0o.A01;
        } else {
            valueOf = Integer.valueOf(AbstractC166987dD.A0H(A0o.A01) & (-2));
            obj = A0o.A00;
        }
        return AbstractC167007dF.A0o(valueOf, AbstractC166987dD.A0H(obj) & (-2));
    }
}
