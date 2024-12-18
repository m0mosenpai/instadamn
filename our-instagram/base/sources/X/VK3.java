package X;

import android.view.View;

/* loaded from: classes11.dex */
public abstract class VK3 {
    public float A00(Object obj) {
        if (this instanceof C65712Tsl) {
            View view = (View) obj;
            switch (((C65712Tsl) this).A00) {
                case 0:
                    return view.getY();
                case 1:
                    return view.getAlpha();
                case 2:
                    return view.getTranslationY();
                case 3:
                    return view.getScaleX();
                case 4:
                    return view.getScaleY();
                case 5:
                    return view.getRotation();
                case 6:
                    return view.getRotationX();
                case 7:
                    return view.getRotationY();
                default:
                    return view.getX();
            }
        }
        if (this instanceof C65718Tsr) {
            return ((C65718Tsr) this).A01.A00;
        }
        if (((C66380UEo) this).A00 != 0) {
            VK3 vk3 = C67759Uxa.A05;
            return ((C67759Uxa) obj).A00 * 10000.0f;
        }
        U8X u8x = (U8X) obj;
        C14360o3.A0B(u8x, 0);
        return u8x.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A01(Object obj, float f) {
        U8X u8x;
        if (this instanceof C65712Tsl) {
            View view = (View) obj;
            switch (((C65712Tsl) this).A00) {
                case 0:
                    view.setY(f);
                    return;
                case 1:
                    view.setAlpha(f);
                    return;
                case 2:
                    view.setTranslationY(f);
                    return;
                case 3:
                    view.setScaleX(f);
                    return;
                case 4:
                    view.setScaleY(f);
                    return;
                case 5:
                    view.setRotation(f);
                    return;
                case 6:
                    view.setRotationX(f);
                    return;
                case 7:
                    view.setRotationY(f);
                    return;
                default:
                    view.setX(f);
                    return;
            }
        }
        if (this instanceof C65718Tsr) {
            ((C65718Tsr) this).A01.A00 = f;
            return;
        }
        if (((C66380UEo) this).A00 != 0) {
            C67759Uxa c67759Uxa = (C67759Uxa) obj;
            VK3 vk3 = C67759Uxa.A05;
            c67759Uxa.A00 = f / 10000.0f;
            u8x = c67759Uxa;
        } else {
            U8X u8x2 = (U8X) obj;
            C14360o3.A0B(u8x2, 0);
            if (u8x2.A00 == f) {
                return;
            }
            u8x2.A00 = f;
            u8x = u8x2;
        }
        u8x.invalidateSelf();
    }
}
