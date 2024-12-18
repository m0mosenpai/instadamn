package X;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.Sg7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63251Sg7 {
    public static final PointF A00 = new PointF();

    public static int A00(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!MSY.A1R(i ^ i2) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void A01(Path path, C62934SYc c62934SYc) {
        path.reset();
        PointF pointF = c62934SYc.A00;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = A00;
        pointF2.set(pointF.x, pointF.y);
        int i = 0;
        while (true) {
            List list = c62934SYc.A02;
            if (i >= list.size()) {
                break;
            }
            C62933SYb c62933SYb = (C62933SYb) list.get(i);
            PointF pointF3 = c62933SYb.A00;
            PointF pointF4 = c62933SYb.A01;
            PointF pointF5 = c62933SYb.A02;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
            } else {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i++;
        }
        if (c62934SYc.A01) {
            path.close();
        }
    }

    public static void A02(InterfaceC65630Tpr interfaceC65630Tpr, C63221SfR c63221SfR, C63221SfR c63221SfR2, List list, int i) {
        if (c63221SfR.A01(interfaceC65630Tpr.getName(), i)) {
            String name = interfaceC65630Tpr.getName();
            C63221SfR c63221SfR3 = new C63221SfR(c63221SfR2);
            c63221SfR3.A01.add(name);
            C63221SfR c63221SfR4 = new C63221SfR(c63221SfR3);
            c63221SfR4.A00 = interfaceC65630Tpr;
            list.add(c63221SfR4);
        }
    }
}
