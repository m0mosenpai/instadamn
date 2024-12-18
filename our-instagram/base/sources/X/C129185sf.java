package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5sf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129185sf {
    public C5H3 A00;
    public boolean A03;
    public final C71313Hs A06;
    public final List A04 = new ArrayList();
    public List A02 = new ArrayList();
    public List A01 = new ArrayList();
    public final Map A05 = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.view.View r19, X.C4EJ r20) {
        /*
            r18 = this;
            r3 = 1
            r0 = r20
            X.C14360o3.A0B(r0, r3)
            r1 = 0
            r0 = 2
            int[] r4 = new int[r0]
            r2 = r19
            r2.getLocationOnScreen(r4)
            boolean r5 = r2.isEnabled()     // Catch: java.lang.NullPointerException -> L14
            goto L15
        L14:
            r5 = 0
        L15:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r10 = X.AbstractC03870Jc.A00(r0)
            X.C14360o3.A0A(r10)
            float r12 = r2.getAlpha()
            r13 = r4[r1]
            r14 = r4[r3]
            int r15 = r2.getWidth()
            int r16 = r2.getHeight()
            int r0 = r2.getId()     // Catch: android.content.res.Resources.NotFoundException -> L5a
            if (r0 <= 0) goto L5a
            android.content.Context r0 = r2.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L5a
            android.content.res.Resources r4 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L5a
            int r0 = r2.getId()     // Catch: android.content.res.Resources.NotFoundException -> L5a
            java.lang.String r11 = r4.getResourceName(r0)     // Catch: android.content.res.Resources.NotFoundException -> L5a
            java.util.regex.Pattern r0 = X.AbstractC129215sj.A00     // Catch: android.content.res.Resources.NotFoundException -> L5a
            java.util.regex.Matcher r4 = r0.matcher(r11)     // Catch: android.content.res.Resources.NotFoundException -> L5a
            boolean r0 = r4.find()     // Catch: android.content.res.Resources.NotFoundException -> L5a
            if (r0 == 0) goto L5b
            java.lang.String r0 = r4.group(r3)     // Catch: android.content.res.Resources.NotFoundException -> L5a
            if (r0 == 0) goto L5b
            r11 = r0
            goto L5b
        L5a:
            r11 = 0
        L5b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            boolean r0 = r2.isSelected()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            int r17 = r2.hashCode()
            boolean r0 = r2 instanceof android.widget.TextView
            if (r0 == 0) goto L79
            r0 = r2
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            r0.toString()
        L79:
            X.C14360o3.A0B(r10, r1)
            X.5si r7 = new X.5si
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5 = r18
            java.util.List r0 = r5.A04
            r0.add(r7)
            X.3Hs r6 = r5.A06
            if (r6 == 0) goto Ld5
            X.3Hx r4 = r6.A02(r2)
            X.3hF r0 = r4.A05
            X.5H2 r1 = r4.A02
            if (r1 != 0) goto L9e
            if (r0 == 0) goto L9e
            X.5H2 r1 = r0.AX1()
            r4.A02 = r1
        L9e:
            if (r1 == 0) goto Lad
            java.util.List r0 = r5.A01
            r0.add(r1)
            boolean r0 = r1.CdW()
            if (r0 == 0) goto Lad
            r5.A03 = r3
        Lad:
            X.3Hx r0 = r6.A02(r2)
            X.3Hw r1 = r0.A04
            if (r1 == 0) goto Lbf
            java.util.List r0 = r5.A02
            r0.add(r1)
            java.util.Map r0 = r5.A05
            r0.put(r1, r7)
        Lbf:
            X.3Hx r2 = r6.A02(r2)
            X.3hF r1 = r2.A05
            X.5H3 r0 = r2.A01
            if (r0 != 0) goto Ld1
            if (r1 == 0) goto Ld1
            X.5H3 r0 = r1.AX0()
            r2.A01 = r0
        Ld1:
            if (r0 == 0) goto Ld5
            r5.A00 = r0
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129185sf.A00(android.view.View, X.4EJ):void");
    }

    public C129185sf(C71313Hs c71313Hs) {
        this.A06 = c71313Hs;
    }
}
