package X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.MTb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50546MTb {
    public final float A00;

    public C50546MTb(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = AbstractC13880nE.A04(context, 5);
    }

    public final boolean A01(MotionEvent motionEvent, MotionEvent motionEvent2, InterfaceC144626fi interfaceC144626fi, float f, float f2, boolean z) {
        C14360o3.A0B(interfaceC144626fi, 5);
        int intValue = A00(motionEvent, motionEvent2, f, f2, z).intValue();
        if (intValue != 2) {
            if (intValue != 3) {
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 4) {
                            return false;
                        }
                        throw B4Z.A00();
                    }
                    return interfaceC144626fi.DrW();
                }
                return interfaceC144626fi.DrU();
            }
            return interfaceC144626fi.DrS(MSZ.A02(motionEvent2, motionEvent), f2);
        }
        return interfaceC144626fi.Drb(motionEvent, motionEvent2, f, f2);
    }

    public final Integer A00(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, boolean z) {
        if (!z && motionEvent != null) {
            float abs = Math.abs(f2);
            float abs2 = Math.abs(f);
            if (abs > abs2) {
                if (MSZ.A02(motionEvent2, motionEvent) < 0.0f) {
                    return C05F.A0C;
                }
                if (motionEvent.getY() > this.A00) {
                    return C05F.A0N;
                }
            } else if (abs2 > abs) {
                float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
                if (rawX < 0.0f) {
                    return C05F.A00;
                }
                if (rawX > 0.0f) {
                    return C05F.A01;
                }
            }
        }
        return C05F.A0Y;
    }
}
