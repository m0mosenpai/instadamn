package X;

import java.util.Arrays;

/* renamed from: X.OLr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54832OLr {
    public android.net.Uri A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C54832OLr c54832OLr = (C54832OLr) obj;
            if (this.A04 != c54832OLr.A04 || Float.compare(c54832OLr.A01, this.A01) != 0 || Float.compare(c54832OLr.A03, this.A03) != 0 || Float.compare(c54832OLr.A02, this.A02) != 0 || !C14360o3.A0K(this.A00, c54832OLr.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A04), false, this.A00, 0, Float.valueOf(this.A01), Float.valueOf(this.A03), Float.valueOf(this.A02)});
    }

    public C54832OLr(android.net.Uri uri, float f, float f2, float f3, boolean z) {
        this.A00 = uri;
        this.A04 = z;
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcTone{loop=");
        A1C.append(this.A04);
        A1C.append(", isAsset=");
        A1C.append(false);
        A1C.append(", fileUri=");
        A1C.append(this.A00);
        A1C.append(", resId=");
        A1C.append(0);
        A1C.append(", earpieceVolume=");
        A1C.append(this.A01);
        A1C.append(", speakerVolume=");
        A1C.append(this.A03);
        A1C.append(", headsetVolume=");
        A1C.append(this.A02);
        return AbstractC167027dH.A0R(A1C);
    }
}
