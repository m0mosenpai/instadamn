package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8xD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202338xD extends C5RN implements InterfaceC25178BCb, InterfaceC133125ze {
    public final Context A00;
    public final C217889kL A01;
    public final C22932A9c A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Drawable A08;
    public final Drawable A09;
    public final C6RB A0A;
    public final C6RB A0B;
    public final String A0C;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.A0B.draw(canvas);
        Drawable drawable2 = this.A08;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        C6RB c6rb = this.A0A;
        if (c6rb != null) {
            c6rb.draw(canvas);
        }
    }

    @Override // X.C5RN
    public final List A07() {
        return new ArrayList();
    }

    @Override // X.InterfaceC25178BCb
    public final int BSK() {
        if (this.A01.A03 == null) {
            return 0;
        }
        return 1;
    }

    @Override // X.InterfaceC25178BCb
    public final List BSS() {
        List singletonList = Collections.singletonList(this.A01.A03);
        C14360o3.A07(singletonList);
        ArrayList arrayList = new ArrayList();
        for (Object obj : singletonList) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return this.A0C;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A07 + this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ab, code lost:
    
        if (X.AbstractC001900j.A0T(r2) != false) goto L15;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.A9c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C202338xD(android.content.Context r10, X.QJ0 r11, X.C217889kL r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202338xD.<init>(android.content.Context, X.QJ0, X.9kL):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (int) ((i + i3) / 2.0f);
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, this.A07 + i2);
        }
        C6RB c6rb = this.A0B;
        int i6 = c6rb.A08;
        int i7 = (int) (c6rb.A0A / 2.0f);
        int i8 = this.A04 + i2;
        c6rb.setBounds(i5 - i7, i8 - i6, i7 + i5, i8 + c6rb.A06);
        Drawable drawable2 = this.A08;
        if (drawable2 != null) {
            drawable2.setBounds(i, i4 - this.A06, i3, i4);
        }
        C6RB c6rb2 = this.A0A;
        if (c6rb2 != null) {
            int i9 = c6rb2.A08;
            int i10 = (int) (c6rb2.A0A / 2.0f);
            int i11 = i2 + this.A07;
            int i12 = this.A03;
            c6rb2.setBounds(i5 - i10, (i11 + i12) - i9, i5 + i10, i4 - i12);
        }
    }
}
