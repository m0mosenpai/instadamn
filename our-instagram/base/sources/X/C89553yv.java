package X;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89553yv extends Drawable implements Drawable.Callback {
    public Bitmap A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Integer A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final int A09;
    public final int A0A;
    public final Paint A0B;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C89553yv(android.content.Context r10, java.lang.Integer r11, java.util.List r12, float r13, int r14, boolean r15) {
        /*
            r9 = this;
            r4 = r12
            if (r15 == 0) goto Lf
            r8 = 0
        L4:
            r2 = 0
            r0 = r9
            r1 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        Lf:
            int r0 = r12.size()
            int r8 = r0 + (-1)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89553yv.<init>(android.content.Context, java.lang.Integer, java.util.List, float, int, boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.A01 = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public static void A00(List list, List list2) {
        ArrayList arrayList = new ArrayList(list2);
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            list2.add(arrayList.get(((Number) it.next()).intValue()));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A09;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).setColorFilter(colorFilter);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd A[EDGE_INSN: B:40:0x00cd->B:43:0x00cd BREAK  A[LOOP:0: B:15:0x0044->B:29:0x0092], SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89553yv.draw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0137, code lost:
    
        if (r9 < 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C89553yv(android.content.Context r19, java.lang.Integer r20, java.lang.Integer r21, java.util.List r22, float r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89553yv.<init>(android.content.Context, java.lang.Integer, java.lang.Integer, java.util.List, float, int, int, int):void");
    }
}
