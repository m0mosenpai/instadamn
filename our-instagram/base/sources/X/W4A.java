package X;

import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public final class W4A {
    public final WDT A00;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r0.length() == 0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.view.View r13) {
        /*
            r12 = this;
            r5 = r13
            android.content.Context r4 = r13.getContext()
            X.WDT r3 = r12.A00
            java.lang.Integer r0 = r3.A03
            if (r0 == 0) goto L12
            int r0 = r0.intValue()
            r13.setAccessibilityTraversalAfter(r0)
        L12:
            boolean r0 = r3.A04
            r9 = 0
            if (r0 == 0) goto L62
            java.lang.Integer r6 = r3.A02
            X.XFb r0 = r3.A00
            if (r0 == 0) goto L60
            X.C14360o3.A0A(r4)
            java.lang.CharSequence r0 = r0.C2i(r4)
            if (r0 == 0) goto L60
            java.lang.String r7 = r0.toString()
        L2a:
            X.XFb r0 = r3.A00
            if (r0 == 0) goto L3e
            X.C14360o3.A0A(r4)
            java.lang.CharSequence r0 = r0.C2i(r4)
            if (r0 == 0) goto L3e
            int r0 = r0.length()
            r11 = 0
            if (r0 != 0) goto L3f
        L3e:
            r11 = 1
        L3f:
            X.XFb r0 = r3.A01
            if (r0 == 0) goto L50
            X.C14360o3.A0A(r4)
            java.lang.CharSequence r0 = r0.C2i(r4)
            if (r0 == 0) goto L50
            java.lang.String r9 = r0.toString()
        L50:
            boolean r10 = r3.A06
            r8 = 0
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            X.UEL r4 = new X.UEL
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.AbstractC010103p.A0B(r13, r4)
            return
        L60:
            r7 = r9
            goto L2a
        L62:
            java.lang.Integer r2 = r3.A02
            r1 = 0
            X.XFb r0 = r3.A01
            if (r0 == 0) goto L76
            X.C14360o3.A0A(r4)
            java.lang.CharSequence r0 = r0.C2i(r4)
            if (r0 == 0) goto L76
            java.lang.String r9 = r0.toString()
        L76:
            boolean r0 = r3.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.AbstractC69838VwO.A00(r13, r0, r2, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W4A.A01(android.view.View):void");
    }

    public static void A00(WDT wdt, C67689UwG c67689UwG, ImmutableList.Builder builder) {
        ((AbstractC69335Vlh) c67689UwG).A02 = new W4A(wdt);
        builder.add((Object) new C67696UwN(c67689UwG));
    }

    public W4A(WDT wdt) {
        this.A00 = wdt;
    }
}
