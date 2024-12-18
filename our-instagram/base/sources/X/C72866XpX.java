package X;

import android.graphics.Rect;
import java.util.List;

/* renamed from: X.XpX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72866XpX {
    public final float A00;
    public final Rect A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72866XpX) {
                C72866XpX c72866XpX = (C72866XpX) obj;
                if (!C14360o3.A0K(this.A01, c72866XpX.A01) || Float.compare(this.A00, c72866XpX.A00) != 0 || !C14360o3.A0K(this.A02, c72866XpX.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, ((this.A01.hashCode() * 31) + Float.floatToIntBits(this.A00)) * 31);
    }

    public C72866XpX(Rect rect, List list, float f) {
        this.A01 = rect;
        this.A00 = f;
        this.A02 = list;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SaliencyOutputs(rect=");
        A1C.append(this.A01);
        A1C.append(", blobRatio=");
        A1C.append(this.A00);
        A1C.append(", centroids=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
