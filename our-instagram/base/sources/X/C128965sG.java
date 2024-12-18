package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.5sG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128965sG {
    public int A00 = 0;
    public C69182VjB A01;
    public final ImageView A02;

    public final void A00() {
        ImageView imageView = this.A02;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC55852hR.A02(drawable);
            C69182VjB c69182VjB = this.A01;
            if (c69182VjB != null) {
                C52112aB.A03(drawable, c69182VjB, imageView.getDrawableState());
            }
        }
    }

    public final void A01(int i) {
        Drawable drawable;
        ImageView imageView = this.A02;
        if (i != 0) {
            drawable = C52112aB.A02().A05(imageView.getContext(), i);
            if (drawable != null) {
                AbstractC55852hR.A02(drawable);
            }
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:3:0x0014, B:5:0x001b, B:7:0x0022, B:9:0x002c, B:10:0x0032, B:12:0x0039, B:13:0x0040, B:15:0x0047, B:20:0x002f), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:3:0x0014, B:5:0x001b, B:7:0x0022, B:9:0x002c, B:10:0x0032, B:12:0x0039, B:13:0x0040, B:15:0x0047, B:20:0x002f), top: B:2:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.util.AttributeSet r12, int r13) {
        /*
            r11 = this;
            android.widget.ImageView r7 = r11.A02
            android.content.Context r4 = r7.getContext()
            int[] r8 = X.AbstractC53402cO.A05
            r10 = 0
            r6 = r12
            r9 = r13
            X.2bu r3 = X.C53122bu.A00(r4, r12, r8, r13, r10)
            android.content.res.TypedArray r5 = r3.A02
            X.AbstractC010103p.A06(r4, r5, r6, r7, r8, r9, r10)
            android.graphics.drawable.Drawable r0 = r7.getDrawable()     // Catch: java.lang.Throwable -> L57
            r2 = -1
            if (r0 != 0) goto L2f
            r0 = 1
            int r1 = r5.getResourceId(r0, r2)     // Catch: java.lang.Throwable -> L57
            if (r1 == r2) goto L32
            X.2aB r0 = X.C52112aB.A02()     // Catch: java.lang.Throwable -> L57
            android.graphics.drawable.Drawable r0 = r0.A05(r4, r1)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L32
            r7.setImageDrawable(r0)     // Catch: java.lang.Throwable -> L57
        L2f:
            X.AbstractC55852hR.A02(r0)     // Catch: java.lang.Throwable -> L57
        L32:
            r1 = 2
            boolean r0 = r5.hasValue(r1)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L40
            android.content.res.ColorStateList r0 = r3.A01(r1)     // Catch: java.lang.Throwable -> L57
            r7.setImageTintList(r0)     // Catch: java.lang.Throwable -> L57
        L40:
            r1 = 3
            boolean r0 = r5.hasValue(r1)     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L53
            int r1 = r5.getInt(r1, r2)     // Catch: java.lang.Throwable -> L57
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.AbstractC55852hR.A00(r0, r1)     // Catch: java.lang.Throwable -> L57
            r7.setImageTintMode(r0)     // Catch: java.lang.Throwable -> L57
        L53:
            r5.recycle()
            return
        L57:
            r0 = move-exception
            r5.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128965sG.A02(android.util.AttributeSet, int):void");
    }

    public C128965sG(ImageView imageView) {
        this.A02 = imageView;
    }
}
