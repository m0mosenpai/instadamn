package com.instagram.direct.messagethread.compose.background;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C14360o3;
import X.C25746BZk;
import X.C25763Ba2;
import X.C27836COz;
import X.C58J;
import X.C58N;
import X.C5WI;
import java.util.List;

/* loaded from: classes5.dex */
public final class GradientBackgroundElement extends C58N {
    public final float A00;
    public final C5WI A01;
    public final C27836COz A02;
    public final List A03;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GradientBackgroundElement) {
                GradientBackgroundElement gradientBackgroundElement = (GradientBackgroundElement) obj;
                if (!C14360o3.A0K(this.A03, gradientBackgroundElement.A03) || !C14360o3.A0K(this.A01, gradientBackgroundElement.A01) || Float.compare(this.A00, gradientBackgroundElement.A00) != 0 || !C14360o3.A0K(this.A02, gradientBackgroundElement.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.BZk, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        List list = this.A03;
        C5WI c5wi = this.A01;
        float f = this.A00;
        C27836COz c27836COz = this.A02;
        AbstractC167017dG.A1P(list, c5wi);
        ?? c58j = new C58J();
        c58j.A08 = list;
        c58j.A01 = c5wi;
        c58j.A00 = f;
        c58j.A06 = c27836COz;
        c58j.A07 = new C25763Ba2(list, f);
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C25746BZk c25746BZk = (C25746BZk) c58j;
        C14360o3.A0B(c25746BZk, 0);
        List list = this.A03;
        C5WI c5wi = this.A01;
        float f = this.A00;
        C27836COz c27836COz = this.A02;
        AbstractC167007dF.A1K(list, c5wi);
        boolean z = false;
        if (!C14360o3.A0K(c25746BZk.A08, list) || c25746BZk.A00 != f) {
            z = true;
        }
        c25746BZk.A08 = list;
        c25746BZk.A01 = c5wi;
        c25746BZk.A00 = f;
        c25746BZk.A06 = c27836COz;
        if (z) {
            c25746BZk.A07 = new C25763Ba2(list, f);
        }
    }

    @Override // X.C58N
    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A03)), this.A00) + AbstractC167017dG.A0M(this.A02);
    }

    public GradientBackgroundElement(C5WI c5wi, C27836COz c27836COz, List list, float f) {
        this.A03 = list;
        this.A01 = c5wi;
        this.A00 = f;
        this.A02 = c27836COz;
    }
}
