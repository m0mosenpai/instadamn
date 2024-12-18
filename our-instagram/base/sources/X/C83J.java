package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.83J, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C83J {
    public double A00;
    public C1815383g A01;
    public C1815383g A02;
    public boolean A03;
    public boolean A04;
    public final C83L A06 = new C83L() { // from class: X.83K
        @Override // X.C83L
        public final void DD2(CameraAREffect cameraAREffect, boolean z, boolean z2) {
            C83J c83j = C83J.this;
            boolean z3 = true;
            c83j.A03 = true;
            c83j.A05 = true;
            c83j.A00 = 0.0d;
            boolean z4 = c83j.A04;
            C1815383g c1815383g = c83j.A01;
            if (z4) {
                if (c1815383g == null) {
                    return;
                }
            } else if (c1815383g == null) {
                return;
            } else {
                z3 = false;
            }
            c1815383g.A01 = z3;
            C1815383g.A00(c1815383g, null);
        }
    };
    public final C83N A07 = new C83N() { // from class: X.83M
        @Override // X.C83N
        public final void DD7(CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2) {
            if (cameraAREffect != null) {
                C83J c83j = C83J.this;
                c83j.A04 = cameraAREffect.A0J();
                c83j.A03 = false;
            }
        }
    };
    public boolean A05 = true;
}
