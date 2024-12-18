package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.Mwk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51902Mwk extends C0T6 implements InterfaceC57856PlM {
    public final float A00;
    public final CameraAREffect A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51902Mwk) {
                C51902Mwk c51902Mwk = (C51902Mwk) obj;
                if (!C14360o3.A0K(this.A01, c51902Mwk.A01) || this.A03 != c51902Mwk.A03 || this.A02 != c51902Mwk.A02 || Float.compare(this.A00, c51902Mwk.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC167017dG.A0M(this.A01) * 31)) + Float.floatToIntBits(this.A00);
    }

    public C51902Mwk(CameraAREffect cameraAREffect, float f, boolean z, boolean z2) {
        this.A01 = cameraAREffect;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = f;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallEffectGalleryViewModel(selectedEffect=");
        A1C.append(this.A01);
        A1C.append(", showGroupEffects=");
        A1C.append(this.A03);
        A1C.append(", showFooter=");
        A1C.append(this.A02);
        A1C.append(", bottomSheetHeight=");
        A1C.append(this.A00);
        return AbstractC167017dG.A0p(A1C);
    }

    public C51902Mwk() {
        this(null, 0.0f, false, false);
    }
}
