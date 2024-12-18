package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: X.7hB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169377hB {
    public static final C169387hC A00;
    public static final C169387hC A01;
    public static final C169377hB A02 = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7hB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.7hC, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.7hC, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A03 = null;
        obj.A05 = null;
        obj.A00 = 0;
        obj.A04 = null;
        obj.A01 = null;
        obj.A02 = null;
        A01 = obj;
        ?? obj2 = new Object();
        obj2.A03 = null;
        obj2.A05 = null;
        obj2.A00 = 0;
        obj2.A04 = null;
        obj2.A01 = null;
        obj2.A02 = null;
        A00 = obj2;
    }

    public static final void A00(Typeface typeface, C169387hC c169387hC, int i, int i2) {
        Float f;
        TextPaint textPaint = c169387hC.A05;
        Typeface typeface2 = null;
        if (textPaint != null) {
            f = Float.valueOf(textPaint.density);
        } else {
            f = null;
        }
        float f2 = i2;
        if (C14360o3.A0I(f, f2)) {
            if (textPaint != null) {
                typeface2 = textPaint.getTypeface();
            }
            if (C14360o3.A0K(typeface2, typeface)) {
                return;
            }
        }
        c169387hC.A03 = new Rect();
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.density = f2;
        textPaint2.setTextAlign(Paint.Align.CENTER);
        textPaint2.setTextSize(i);
        textPaint2.setTypeface(typeface);
        c169387hC.A05 = textPaint2;
    }
}
