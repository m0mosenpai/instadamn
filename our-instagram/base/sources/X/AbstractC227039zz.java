package X;

import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;

/* renamed from: X.9zz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC227039zz {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.5QK, java.lang.Object] */
    public static final C5QK A00(EnumC194908jr enumC194908jr, C6RB c6rb, boolean z, boolean z2) {
        C9PX c9px;
        ViewTreeObserverOnPreDrawListenerC139186Rz viewTreeObserverOnPreDrawListenerC139186Rz;
        C9PX c9px2;
        ViewTreeObserverOnPreDrawListenerC139186Rz viewTreeObserverOnPreDrawListenerC139186Rz2;
        C14360o3.A0B(c6rb, 0);
        boolean z3 = c6rb instanceof C9PX;
        if (z3 && (viewTreeObserverOnPreDrawListenerC139186Rz2 = (c9px2 = (C9PX) c6rb).A00) != null) {
            c9px2.A0F.removeSpan(viewTreeObserverOnPreDrawListenerC139186Rz2);
        }
        C5QL A01 = WE0.A01(c6rb.A0F, false);
        if (z3 && (viewTreeObserverOnPreDrawListenerC139186Rz = (c9px = (C9PX) c6rb).A00) != null) {
            Spannable spannable = c9px.A0F;
            spannable.setSpan(viewTreeObserverOnPreDrawListenerC139186Rz, 0, spannable.length(), 16711698);
        }
        int i = c6rb.A07;
        Layout.Alignment alignment = c6rb.A0E;
        float f = c6rb.A00;
        float f2 = c6rb.A01;
        TextPaint textPaint = c6rb.A0b;
        int color = textPaint.getColor();
        float textSize = textPaint.getTextSize();
        C1572374d c1572374d = c6rb.A0K;
        float f3 = c6rb.A02;
        float f4 = c6rb.A03;
        float letterSpacing = textPaint.getLetterSpacing();
        Integer num = c6rb.A0M;
        C6RC c6rc = c6rb.A0I;
        int i2 = c6rb.A09;
        ?? obj = new Object();
        obj.A0D = A01;
        obj.A0A = alignment;
        obj.A03 = f;
        obj.A04 = f2;
        obj.A07 = color;
        obj.A05 = textSize;
        obj.A0E = c1572374d;
        obj.A01 = f3;
        obj.A02 = f4;
        obj.A00 = letterSpacing;
        obj.A09 = 0;
        obj.A0G = null;
        obj.A0H = z;
        obj.A06 = i;
        obj.A0F = num;
        obj.A0I = z2;
        obj.A0B = enumC194908jr;
        obj.A0C = c6rc;
        obj.A08 = i2;
        return obj;
    }
}
