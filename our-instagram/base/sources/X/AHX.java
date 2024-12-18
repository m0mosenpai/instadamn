package X;

import android.graphics.RectF;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class AHX {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r14.A0R != true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Point A00(com.instagram.common.session.UserSession r12, X.C8r2 r13, X.C187028Qv r14, X.C195868lW r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AHX.A00(com.instagram.common.session.UserSession, X.8r2, X.8Qv, X.8lW):android.graphics.Point");
    }

    public static boolean A02(RectF rectF, RectF rectF2, Iterator it) {
        C84823qW c84823qW = (C84823qW) it.next();
        float f = c84823qW.A03;
        float f2 = c84823qW.A02 / 2.0f;
        rectF.left = f - f2;
        float f3 = c84823qW.A04;
        float f4 = c84823qW.A00 / 2.0f;
        rectF.top = f3 - f4;
        rectF.right = f + f2;
        rectF.bottom = f3 + f4;
        return A01(rectF, rectF2, c84823qW.A01);
    }

    public static final boolean A01(RectF rectF, RectF rectF2, float f) {
        double d = f;
        float abs = Math.abs(rectF.height() * ((float) Math.cos(d))) + Math.abs(rectF.width() * ((float) Math.sin(d)));
        float centerY = rectF.centerY();
        float f2 = abs / 2.0f;
        float f3 = centerY - f2;
        float f4 = centerY + f2;
        if (f3 >= rectF2.top && f4 <= rectF2.bottom) {
            return false;
        }
        return true;
    }
}
