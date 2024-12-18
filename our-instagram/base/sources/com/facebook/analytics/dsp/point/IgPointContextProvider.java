package com.facebook.analytics.dsp.point;

import X.AbstractC129175se;
import X.C129185sf;
import X.C129195sg;
import X.C129225sk;
import X.C14360o3;
import X.C4EJ;
import X.C71313Hs;
import X.InterfaceC08830cm;
import android.app.Activity;
import android.view.View;

/* loaded from: classes2.dex */
public final class IgPointContextProvider {
    public C71313Hs A00;
    public final InterfaceC08830cm A01;
    public final C4EJ A02;

    public IgPointContextProvider(InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(interfaceC08830cm, 1);
        this.A01 = interfaceC08830cm;
        this.A02 = C4EJ.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r12, float r13, float r14) {
        /*
            r11 = this;
            r3 = 4
            boolean r0 = X.C9CY.A00(r12, r3)
            if (r0 == 0) goto L5a
            r8 = r12
            X.9CY r8 = (X.C9CY) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r8.A00 = r2
        L15:
            java.lang.Object r3 = r8.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r8.A00
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L60
            java.lang.Object r5 = r8.A01
            X.5sf r5 = (X.C129185sf) r5
            X.AbstractC09560e7.A00(r3)
        L27:
            X.5sk r1 = new X.5sk
            r1.<init>(r5)
            return r1
        L2d:
            X.AbstractC09560e7.A00(r3)
            X.0cm r0 = r11.A01
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L68
            android.view.View r4 = X.AbstractC129175se.A00(r0)
            if (r4 == 0) goto L68
            X.3Hs r0 = r11.A00
            X.5sf r5 = new X.5sf
            r5.<init>(r0)
            com.facebook.analytics.dsp.point.DspPointContextHelper r3 = com.facebook.analytics.dsp.point.DspPointContextHelper.A00
            X.5sg r7 = X.C129195sg.A00
            X.4EJ r6 = r11.A02
            r8.A01 = r5
            r8.A00 = r2
            r9 = r13
            r10 = r14
            java.lang.Object r0 = r3.A02(r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r1) goto L27
            return r1
        L5a:
            X.9CY r8 = new X.9CY
            r8.<init>(r11, r12, r3)
            goto L15
        L60:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L68:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.analytics.dsp.point.IgPointContextProvider.A01(X.1Ds, float, float):java.lang.Object");
    }

    public final C129225sk A00(float f, float f2) {
        View A00;
        Activity activity = (Activity) this.A01.get();
        if (activity != null && (A00 = AbstractC129175se.A00(activity)) != null) {
            C129185sf c129185sf = new C129185sf(this.A00);
            DspPointContextHelper.A01(A00, c129185sf, this.A02, C129195sg.A00, f, f2);
            return new C129225sk(c129185sf);
        }
        return null;
    }
}
