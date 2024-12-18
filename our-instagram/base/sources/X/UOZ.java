package X;

import android.content.Context;

/* loaded from: classes11.dex */
public final class UOZ extends C5FF {
    public final int A00;
    public final int A01 = 3;
    public final Context A02;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r6 > 25) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UOZ(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 3
            r4.<init>()
            r4.A00 = r6
            r4.A02 = r5
            r4.A01 = r0
            r3 = 1
            if (r6 <= 0) goto L12
            r1 = 25
            r0 = 1
            if (r6 <= r1) goto L13
        L12:
            r0 = 0
        L13:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C0Hf.A00(r0)
            r2 = 0
            java.lang.Object[] r0 = X.AbstractC25228BEl.A1Y(r6)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "IntrinsicBlur;%d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            X.C14360o3.A07(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UOZ.<init>(android.content.Context, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r6 > 25) goto L6;
     */
    @Override // X.C5FF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.graphics.Bitmap r8, android.graphics.Bitmap r9) {
        /*
            r7 = this;
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            android.content.Context r2 = r7.A02
            int r6 = r7.A00
            r0 = 2
            X.C14360o3.A0B(r2, r0)
            if (r6 <= 0) goto L13
            r1 = 25
            r0 = 1
            if (r6 <= r1) goto L14
        L13:
            r0 = 0
        L14:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C0Hf.A00(r0)
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = "Required value was null."
            if (r5 == 0) goto L62
            android.renderscript.Element r0 = android.renderscript.Element.U8_4(r5)     // Catch: java.lang.Throwable -> L5d
            android.renderscript.ScriptIntrinsicBlur r3 = android.renderscript.ScriptIntrinsicBlur.create(r5, r0)     // Catch: java.lang.Throwable -> L5d
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createFromBitmap(r5, r9)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L57
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r8)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L51
            float r0 = (float) r6     // Catch: java.lang.Throwable -> L5d
            r3.setRadius(r0)     // Catch: java.lang.Throwable -> L5d
            r3.setInput(r2)     // Catch: java.lang.Throwable -> L5d
            r3.forEach(r1)     // Catch: java.lang.Throwable -> L5d
            r1.copyTo(r8)     // Catch: java.lang.Throwable -> L5d
            r3.destroy()     // Catch: java.lang.Throwable -> L5d
            r2.destroy()     // Catch: java.lang.Throwable -> L5d
            r1.destroy()     // Catch: java.lang.Throwable -> L5d
            r5.destroy()
            return
        L51:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L5d
            goto L5c
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L5d
        L5c:
            throw r0     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0 = move-exception
            r5.destroy()
            throw r0
        L62:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L68
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L68
            throw r0     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UOZ.A02(android.graphics.Bitmap, android.graphics.Bitmap):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0049, code lost:
    
        if (r7 > 25) goto L6;
     */
    @Override // X.C5FF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.graphics.Bitmap r25) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UOZ.A01(android.graphics.Bitmap):void");
    }
}
