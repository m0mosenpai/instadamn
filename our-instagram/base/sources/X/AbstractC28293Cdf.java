package X;

import android.content.Context;
import android.graphics.Color;

/* renamed from: X.Cdf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28293Cdf {
    public static final Integer A02(InterfaceC109864xE interfaceC109864xE) {
        int i;
        C14360o3.A0B(interfaceC109864xE, 0);
        Integer AjC = interfaceC109864xE.AjC();
        if (AjC != null) {
            int intValue = AjC.intValue();
            for (Integer num : C05F.A00(4)) {
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == intValue) {
                    return num;
                }
            }
        }
        return null;
    }

    public static final int A00(Context context, InterfaceC109864xE interfaceC109864xE, int i) {
        String light;
        InterfaceC31126Dm9 C6A = interfaceC109864xE.C6A();
        if (C6A != null) {
            if (AbstractC72723Nt.A00(context)) {
                light = C6A.getDark();
            } else {
                light = C6A.getLight();
            }
            return Color.parseColor(light);
        }
        return context.getColor(i);
    }

    public static final Integer A01(InterfaceC109864xE interfaceC109864xE) {
        int i;
        Integer AYQ = interfaceC109864xE.AYQ();
        if (AYQ != null) {
            int intValue = AYQ.intValue();
            for (Integer num : C05F.A00(5)) {
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 4;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == intValue) {
                    return num;
                }
            }
        }
        return null;
    }
}
