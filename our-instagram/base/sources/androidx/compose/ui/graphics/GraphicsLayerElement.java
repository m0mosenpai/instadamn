package androidx.compose.ui.graphics;

import X.AnonymousClass001;
import X.C1132359l;
import X.C14360o3;
import X.C58N;
import X.C5AD;
import X.C5AH;

/* loaded from: classes3.dex */
public final class GraphicsLayerElement extends C58N {
    public final float A00;
    public final float A01 = 8.0f;
    public final float A02;
    public final float A03;
    public final float A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final C5AH A08;
    public final boolean A09;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraphicsLayerElement) {
                GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
                if (Float.compare(this.A03, graphicsLayerElement.A03) == 0 && Float.compare(this.A04, graphicsLayerElement.A04) == 0 && Float.compare(this.A00, graphicsLayerElement.A00) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.A02, graphicsLayerElement.A02) == 0 && Float.compare(this.A01, graphicsLayerElement.A01) == 0) {
                    long j = this.A07;
                    long j2 = graphicsLayerElement.A07;
                    long j3 = C5AD.A01;
                    if (j == j2 && C14360o3.A0K(this.A08, graphicsLayerElement.A08) && this.A09 == graphicsLayerElement.A09) {
                        long j4 = this.A05;
                        long j5 = graphicsLayerElement.A05;
                        long j6 = C1132359l.A01;
                        if (j4 != j5 || this.A06 != graphicsLayerElement.A06) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public GraphicsLayerElement(C5AH c5ah, float f, float f2, float f3, float f4, long j, long j2, long j3, boolean z) {
        this.A03 = f;
        this.A04 = f2;
        this.A00 = f3;
        this.A02 = f4;
        this.A07 = j;
        this.A08 = c5ah;
        this.A09 = z;
        this.A05 = j2;
        this.A06 = j3;
    }

    @Override // X.C58N
    public final int hashCode() {
        int floatToIntBits = ((((Float.floatToIntBits(this.A03) * 31) + Float.floatToIntBits(this.A04)) * 31) + Float.floatToIntBits(this.A00)) * 31;
        int floatToIntBits2 = Float.floatToIntBits(0.0f);
        int floatToIntBits3 = (((((((((((((floatToIntBits + floatToIntBits2) * 31) + floatToIntBits2) * 31) + floatToIntBits2) * 31) + floatToIntBits2) * 31) + floatToIntBits2) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A01)) * 31;
        long j = this.A07;
        long j2 = C5AD.A01;
        int hashCode = (((floatToIntBits3 + ((int) (j ^ (j >>> 32)))) * 31) + this.A08.hashCode()) * 31;
        int i = 1237;
        if (this.A09) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31 * 31;
        long j3 = this.A05;
        long j4 = C1132359l.A01;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j5 = this.A06;
        return (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GraphicsLayerElement(scaleX=");
        sb.append(this.A03);
        sb.append(", scaleY=");
        sb.append(this.A04);
        sb.append(", alpha=");
        sb.append(this.A00);
        sb.append(", translationX=");
        sb.append(0.0f);
        sb.append(", translationY=");
        sb.append(0.0f);
        sb.append(", shadowElevation=");
        sb.append(0.0f);
        sb.append(", rotationX=");
        sb.append(0.0f);
        sb.append(", rotationY=");
        sb.append(0.0f);
        sb.append(", rotationZ=");
        sb.append(this.A02);
        sb.append(", cameraDistance=");
        sb.append(this.A01);
        sb.append(", transformOrigin=");
        long j = this.A07;
        long j2 = C5AD.A01;
        sb.append((Object) AnonymousClass001.A0K("TransformOrigin(packedValue=", ')', j));
        sb.append(", shape=");
        sb.append(this.A08);
        sb.append(", clip=");
        sb.append(this.A09);
        sb.append(", renderEffect=");
        sb.append((Object) null);
        sb.append(", ambientShadowColor=");
        sb.append((Object) C1132359l.A06(this.A05));
        sb.append(", spotShadowColor=");
        sb.append((Object) C1132359l.A06(this.A06));
        sb.append(", compositingStrategy=");
        sb.append((Object) AnonymousClass001.A0I("CompositingStrategy(value=", ')', 0));
        sb.append(')');
        return sb.toString();
    }
}
