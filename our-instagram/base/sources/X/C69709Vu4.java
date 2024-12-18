package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: X.Vu4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69709Vu4 {
    public ColorStateList A00 = null;
    public PorterDuff.Mode A01 = null;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04;
    public final CompoundButton A05;

    public final void A00() {
        CompoundButton compoundButton = this.A05;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.A02 || this.A03) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.A02) {
                    mutate.setTintList(this.A00);
                }
                if (this.A03) {
                    mutate.setTintMode(this.A01);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:3:0x0015, B:5:0x001b, B:8:0x0021, B:9:0x003c, B:11:0x0043, B:12:0x004a, B:14:0x0051, B:21:0x0029, B:23:0x002f, B:25:0x0035), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:3:0x0015, B:5:0x001b, B:8:0x0021, B:9:0x003c, B:11:0x0043, B:12:0x004a, B:14:0x0051, B:21:0x0029, B:23:0x002f, B:25:0x0035), top: B:2:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r6 = r10.A05
            android.content.Context r3 = r6.getContext()
            int[] r7 = X.AbstractC53402cO.A0C
            r9 = 0
            r5 = r11
            r8 = r12
            X.2bu r2 = X.C53122bu.A00(r3, r11, r7, r12, r9)
            android.content.res.TypedArray r4 = r2.A02
            X.AbstractC010103p.A06(r3, r4, r5, r6, r7, r8, r9)
            r1 = 1
            boolean r0 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L29
            int r0 = r4.getResourceId(r1, r9)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L29
            android.graphics.drawable.Drawable r0 = X.C71x.A00(r3, r0)     // Catch: android.content.res.Resources.NotFoundException -> L29 java.lang.Throwable -> L62
            r6.setButtonDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L29 java.lang.Throwable -> L62
            goto L3c
        L29:
            boolean r0 = r4.hasValue(r9)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L3c
            int r0 = r4.getResourceId(r9, r9)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L3c
            android.graphics.drawable.Drawable r0 = X.C71x.A00(r3, r0)     // Catch: java.lang.Throwable -> L62
            r6.setButtonDrawable(r0)     // Catch: java.lang.Throwable -> L62
        L3c:
            r1 = 2
            boolean r0 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L4a
            android.content.res.ColorStateList r0 = r2.A01(r1)     // Catch: java.lang.Throwable -> L62
            r6.setButtonTintList(r0)     // Catch: java.lang.Throwable -> L62
        L4a:
            r1 = 3
            boolean r0 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L5e
            r0 = -1
            int r1 = r4.getInt(r1, r0)     // Catch: java.lang.Throwable -> L62
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.AbstractC55852hR.A00(r0, r1)     // Catch: java.lang.Throwable -> L62
            r6.setButtonTintMode(r0)     // Catch: java.lang.Throwable -> L62
        L5e:
            r4.recycle()
            return
        L62:
            r0 = move-exception
            r4.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69709Vu4.A01(android.util.AttributeSet, int):void");
    }

    public C69709Vu4(CompoundButton compoundButton) {
        this.A05 = compoundButton;
    }
}
