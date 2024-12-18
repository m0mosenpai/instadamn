package com.instagram.barcelona.common.ui.threaddecoration;

import X.AbstractC25226BEj;
import X.BZh;
import X.C14360o3;
import X.C58J;
import X.C58N;
import X.C5Zx;

/* loaded from: classes5.dex */
public final class ThreadDecorationModifierElement extends C58N {
    public final Integer A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ThreadDecorationModifierElement) && this.A00 == ((ThreadDecorationModifierElement) obj).A00);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.BZh, X.58J] */
    @Override // X.C58N
    public final /* bridge */ /* synthetic */ C58J A00() {
        Integer num = this.A00;
        C14360o3.A0B(num, 1);
        ?? c58j = new C58J();
        c58j.A00 = num;
        return c58j;
    }

    @Override // X.C58N
    public final /* bridge */ /* synthetic */ void A01(C58J c58j) {
        BZh bZh = (BZh) c58j;
        C14360o3.A0B(bZh, 0);
        Integer num = this.A00;
        C14360o3.A0B(num, 0);
        if (num != bZh.A00) {
            bZh.A00 = num;
            C5Zx.A00(bZh);
        }
    }

    @Override // X.C58N
    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "Start";
                break;
            case 2:
                str = "Middle";
                break;
            case 3:
                str = "Loop";
                break;
            case 4:
                str = "End";
                break;
            default:
                str = "None";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }

    public ThreadDecorationModifierElement(Integer num) {
        this.A00 = num;
    }
}
