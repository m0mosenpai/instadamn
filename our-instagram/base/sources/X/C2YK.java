package X;

import com.facebook.litho.BaseMountingView;
import com.facebook.yoga.YogaNodeJNIBase;

/* renamed from: X.2YK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2YK {
    public static final C2YK A00 = new Object();

    public static final void A00(C2YK c2yk, C2YA c2ya, StringBuilder sb, int i) {
        boolean z;
        String str;
        float f;
        float f2;
        C2W1 c2w1 = null;
        C2W3 c2w3 = null;
        C2W1 c2w12 = c2ya.A07;
        int i2 = c2ya.A01;
        sb.append(((C2Y5) c2w12.A0u.get(i2)).A03.A0H());
        sb.append('{');
        BaseMountingView A01 = c2ya.A01();
        if (i2 == 0) {
            c2w3 = c2ya.A06;
            z = true;
            c2w1 = c2w3.A04();
        } else {
            z = false;
        }
        if (A01 != null && A01.getVisibility() == 0) {
            str = "V";
        } else {
            str = "H";
        }
        sb.append(str);
        if (z) {
            C50952Vr c50952Vr = c2w1.A0M;
            if (c50952Vr != null && c50952Vr.A0I != null) {
                sb.append(" [clickable]");
            }
            sb.append(" ");
            C14360o3.A0B(c2w3, 0);
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) c2w3.A02.A0K;
            float[] fArr = yogaNodeJNIBase.arr;
            if (fArr != null) {
                f = fArr[2];
            } else {
                f = 0.0f;
            }
            sb.append(f);
            sb.append("x");
            float[] fArr2 = yogaNodeJNIBase.arr;
            if (fArr2 != null) {
                f2 = fArr2[1];
            } else {
                f2 = 0.0f;
            }
            sb.append(f2);
        }
        sb.append('}');
        for (C2YA c2ya2 : c2ya.A02()) {
            sb.append("\n");
            int i3 = 0;
            if (i >= 0) {
                while (true) {
                    sb.append("  ");
                    if (i3 != i) {
                        i3++;
                    }
                }
            }
            A00(c2yk, c2ya2, sb, i + 1);
        }
    }
}
