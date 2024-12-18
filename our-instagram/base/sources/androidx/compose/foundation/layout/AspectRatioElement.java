package androidx.compose.foundation.layout;

import X.AbstractC166987dD;
import X.AbstractC25235BEs;
import X.AnonymousClass001;
import X.C25754BZt;
import X.C58J;
import X.C58N;
import X.InterfaceC16660sJ;

/* loaded from: classes5.dex */
public final class AspectRatioElement extends C58N {
    public final float A00;
    public final boolean A01;
    public final InterfaceC16660sJ A02;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        AspectRatioElement aspectRatioElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatioElement) {
            aspectRatioElement = (AspectRatioElement) obj;
        } else {
            aspectRatioElement = null;
        }
        return aspectRatioElement != null && this.A00 == aspectRatioElement.A00 && this.A01 == ((AspectRatioElement) obj).A01;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.BZt, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        float f = this.A00;
        boolean z = this.A01;
        ?? c58j = new C58J();
        c58j.A00 = f;
        c58j.A01 = z;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C25754BZt c25754BZt = (C25754BZt) c58j;
        c25754BZt.A00 = this.A00;
        c25754BZt.A01 = this.A01;
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC25235BEs.A02(this.A00));
    }

    public AspectRatioElement(InterfaceC16660sJ interfaceC16660sJ, float f, boolean z) {
        this.A00 = f;
        this.A01 = z;
        this.A02 = interfaceC16660sJ;
        if (f > 0.0f) {
        } else {
            throw AbstractC166987dD.A12(AnonymousClass001.A0Z("aspectRatio ", " must be > 0", f));
        }
    }
}
