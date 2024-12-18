package com.instagram.barcelona.common.ui.threaddecoration;

import X.C119145aW;
import X.C14360o3;
import X.C25744BZi;
import X.C58J;
import X.C58N;
import X.C5Zx;

/* loaded from: classes5.dex */
public final class ThreadDecorationStartOverrideModifierElement extends C58N {
    public final float A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ThreadDecorationStartOverrideModifierElement) && C119145aW.A01(this.A00, ((ThreadDecorationStartOverrideModifierElement) obj).A00));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.BZi, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        float f = this.A00;
        ?? c58j = new C58J();
        c58j.A00 = f;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        C25744BZi c25744BZi = (C25744BZi) c58j;
        C14360o3.A0B(c25744BZi, 0);
        float f = this.A00;
        if (!C119145aW.A01(f, c25744BZi.A00)) {
            c25744BZi.A00 = f;
            C5Zx.A00(c25744BZi);
        }
    }

    @Override // X.C58N
    public final int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public ThreadDecorationStartOverrideModifierElement(float f) {
        this.A00 = f;
    }
}
