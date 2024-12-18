package androidx.compose.ui.draw;

import X.C14360o3;
import X.C2DC;
import X.C58N;
import X.C5YL;
import X.C5YV;
import androidx.compose.ui.Alignment;

/* loaded from: classes3.dex */
public final class PainterElement extends C58N {
    public final float A00;
    public final Alignment A01;
    public final C5YV A02;
    public final C2DC A03;
    public final C5YL A04;
    public final boolean A05 = true;

    public PainterElement(Alignment alignment, C5YV c5yv, C2DC c2dc, C5YL c5yl, float f) {
        this.A03 = c2dc;
        this.A01 = alignment;
        this.A04 = c5yl;
        this.A00 = f;
        this.A02 = c5yv;
    }

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PainterElement) {
                PainterElement painterElement = (PainterElement) obj;
                if (!C14360o3.A0K(this.A03, painterElement.A03) || this.A05 != painterElement.A05 || !C14360o3.A0K(this.A01, painterElement.A01) || !C14360o3.A0K(this.A04, painterElement.A04) || Float.compare(this.A00, painterElement.A00) != 0 || !C14360o3.A0K(this.A02, painterElement.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PainterElement(painter=");
        sb.append(this.A03);
        sb.append(", sizeToIntrinsics=");
        sb.append(this.A05);
        sb.append(", alignment=");
        sb.append(this.A01);
        sb.append(", contentScale=");
        sb.append(this.A04);
        sb.append(", alpha=");
        sb.append(this.A00);
        sb.append(", colorFilter=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.C58N
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A03.hashCode() * 31;
        int i = 1237;
        if (this.A05) {
            i = 1231;
        }
        int hashCode3 = (((((((hashCode2 + i) * 31) + this.A01.hashCode()) * 31) + this.A04.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31;
        C5YV c5yv = this.A02;
        if (c5yv == null) {
            hashCode = 0;
        } else {
            hashCode = c5yv.hashCode();
        }
        return hashCode3 + hashCode;
    }
}
