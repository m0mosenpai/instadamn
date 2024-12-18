package X;

import android.animation.PropertyValuesHolder;
import android.util.Property;

/* loaded from: classes8.dex */
public final class LWC implements XCF {
    public int A00;

    public static PropertyValuesHolder[] A00(Property property, float f, float f2) {
        return new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat((Property<?, Float>) property, f, f2)};
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r8.getLayoutDirection() == 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (r8.getLayoutDirection() == 1) goto L25;
     */
    @Override // X.XCF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator ALf(android.view.View r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            int r5 = r6.A00
            android.content.res.Resources r1 = X.AbstractC25228BEl.A0M(r7)
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            int r2 = r1.getDimensionPixelSize(r0)
            float r4 = r7.getTranslationX()
            float r3 = r7.getTranslationY()
            r0 = 3
            if (r5 == r0) goto L69
            r0 = 5
            if (r5 == r0) goto L34
            r0 = 48
            if (r5 == r0) goto L4e
            r0 = 80
            if (r5 == r0) goto L4b
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r0) goto L62
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r5 != r0) goto L6c
            int r1 = r8.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L69
        L34:
            float r0 = (float) r2
            float r0 = r4 - r0
        L37:
            android.util.Property r1 = android.view.View.TRANSLATION_X
            r3 = 2
            android.animation.PropertyValuesHolder[] r0 = A00(r1, r0, r4)
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r0)
            X.U7x r1 = new X.U7x
            r1.<init>(r7, r4, r3)
        L47:
            r2.addListener(r1)
            return r2
        L4b:
            float r1 = (float) r2
            float r1 = r1 + r3
            goto L51
        L4e:
            float r0 = (float) r2
            float r1 = r3 - r0
        L51:
            android.util.Property r0 = android.view.View.TRANSLATION_Y
            android.animation.PropertyValuesHolder[] r0 = A00(r0, r1, r3)
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r0)
            r0 = 3
            X.U7x r1 = new X.U7x
            r1.<init>(r7, r3, r0)
            goto L47
        L62:
            int r1 = r8.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L34
        L69:
            float r0 = (float) r2
            float r0 = r0 + r4
            goto L37
        L6c:
            java.lang.String r0 = "Invalid slide direction: "
            java.lang.IllegalArgumentException r0 = X.AbstractC25230BEn.A0n(r0, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LWC.ALf(android.view.View, android.view.ViewGroup):android.animation.Animator");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r8.getLayoutDirection() == 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r8.getLayoutDirection() == 1) goto L25;
     */
    @Override // X.XCF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator AM4(android.view.View r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            int r5 = r6.A00
            android.content.res.Resources r1 = X.AbstractC25228BEl.A0M(r7)
            r0 = 2131165266(0x7f070052, float:1.7944744E38)
            int r2 = r1.getDimensionPixelSize(r0)
            float r4 = r7.getTranslationX()
            float r3 = r7.getTranslationY()
            r0 = 3
            if (r5 == r0) goto L68
            r0 = 5
            if (r5 == r0) goto L34
            r0 = 48
            if (r5 == r0) goto L4e
            r0 = 80
            if (r5 == r0) goto L4a
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r0) goto L61
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r5 != r0) goto L6c
            int r1 = r8.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L68
        L34:
            float r1 = (float) r2
            float r1 = r1 + r4
        L36:
            android.util.Property r0 = android.view.View.TRANSLATION_X
            r3 = 2
            android.animation.PropertyValuesHolder[] r0 = A00(r0, r4, r1)
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r0)
            X.U7x r1 = new X.U7x
            r1.<init>(r7, r4, r3)
        L46:
            r2.addListener(r1)
            return r2
        L4a:
            float r0 = (float) r2
            float r1 = r3 - r0
            goto L50
        L4e:
            float r1 = (float) r2
            float r1 = r1 + r3
        L50:
            android.util.Property r0 = android.view.View.TRANSLATION_Y
            android.animation.PropertyValuesHolder[] r0 = A00(r0, r3, r1)
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r7, r0)
            r0 = 3
            X.U7x r1 = new X.U7x
            r1.<init>(r7, r3, r0)
            goto L46
        L61:
            int r1 = r8.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L34
        L68:
            float r0 = (float) r2
            float r1 = r4 - r0
            goto L36
        L6c:
            java.lang.String r0 = "Invalid slide direction: "
            java.lang.IllegalArgumentException r0 = X.AbstractC25230BEn.A0n(r0, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LWC.AM4(android.view.View, android.view.ViewGroup):android.animation.Animator");
    }
}
