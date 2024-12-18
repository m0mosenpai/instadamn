package androidx.compose.ui.draw;

import X.AbstractC114335Dx;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25235BEs;
import X.C1132359l;
import X.C119145aW;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C59U;
import X.C5AH;
import X.C5Zt;
import X.DRU;

/* loaded from: classes5.dex */
public final class ShadowGraphicsLayerElement extends C58N {
    public final float A00;
    public final long A01;
    public final long A02;
    public final C5AH A03;
    public final boolean A04;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShadowGraphicsLayerElement) {
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
                if (C119145aW.A01(this.A00, shadowGraphicsLayerElement.A00) && C14360o3.A0K(this.A03, shadowGraphicsLayerElement.A03) && this.A04 == shadowGraphicsLayerElement.A04) {
                    long j = this.A01;
                    long j2 = shadowGraphicsLayerElement.A01;
                    long j3 = C1132359l.A01;
                    if (j != j2 || this.A02 != shadowGraphicsLayerElement.A02) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.5Zt, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        DRU A00 = DRU.A00(this, 26);
        ?? c58j = new C58J();
        c58j.A00 = A00;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C5Zt c5Zt = (C5Zt) c58j;
        c5Zt.A00 = DRU.A00(this, 26);
        C59U c59u = AbstractC114335Dx.A04(c5Zt, 2).A06;
        if (c59u != null) {
            c59u.A0i(c5Zt.A00, true);
        }
    }

    @Override // X.C58N
    public final int hashCode() {
        int A0D = AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC25235BEs.A02(this.A00)));
        long j = this.A01;
        long j2 = C1132359l.A01;
        int A07 = AbstractC167007dF.A07(j, A0D);
        long j3 = this.A02;
        return A07 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public ShadowGraphicsLayerElement(C5AH c5ah, float f, long j, long j2, boolean z) {
        this.A00 = f;
        this.A03 = c5ah;
        this.A04 = z;
        this.A01 = j;
        this.A02 = j2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ShadowGraphicsLayerElement(elevation=");
        A1C.append((Object) C119145aW.A00(this.A00));
        A1C.append(", shape=");
        A1C.append(this.A03);
        A1C.append(", clip=");
        A1C.append(this.A04);
        A1C.append(", ambientColor=");
        A1C.append((Object) C1132359l.A06(this.A01));
        A1C.append(", spotColor=");
        return AbstractC167017dG.A0o(C1132359l.A06(this.A02), A1C);
    }
}
