package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Obt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55131Obt {
    public static float A00 = 0.5f;
    public static int A01;
    public static OEL A02;
    public static Paint A04;
    public static final C55131Obt A05 = new Object();
    public static Integer A03 = C05F.A01;

    public static final LinkedList A00(Float f, List list, float f2, float f3, int i, int i2, boolean z) {
        float f4;
        if (f != null) {
            f4 = f.floatValue();
        } else {
            f4 = 32.0f;
        }
        float f5 = (1000.0f / f4) / f2;
        float f6 = -5.0f;
        float size = list.size();
        if (z) {
            f6 = (-5.0f) + (i / f4);
            size = Math.min(size, ((i2 / f4) * f3) + f6);
        }
        LinkedList linkedList = new LinkedList();
        while (true) {
            float f7 = f6;
            if (f6 < 0.0f) {
                f7 = 0.0f;
            }
            Object A0O = AbstractC001800i.A0O(list, (int) Math.floor(f7));
            if (f7 >= size || A0O == null) {
                break;
            }
            linkedList.add(A0O);
            f6 += f5;
        }
        return linkedList;
    }

    public static final void A01(Canvas canvas, float f, float f2, float f3, int i) {
        OEL oel = A02;
        if (oel != null) {
            float max = Math.max(f * f2, oel.A06);
            float A002 = AbstractC25227BEk.A00(f2, max) + f3;
            float f4 = max + A002;
            float f5 = i * oel.A01;
            Paint paint = A04;
            if (paint == null) {
                C14360o3.A0F("paint");
                throw C00O.createAndThrow();
            }
            canvas.drawLine(f5, A002, f5, f4, paint);
        }
    }

    public final void A02(OEL oel) {
        float f;
        A02 = oel;
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setColor(Color.parseColor("#CCFFFFFF"));
        A0R.setStyle(Paint.Style.STROKE);
        OEL oel2 = A02;
        if (oel2 != null) {
            f = oel2.A02;
        } else {
            f = 1.0f;
        }
        A0R.setStrokeWidth(f);
        A04 = A0R;
    }
}
