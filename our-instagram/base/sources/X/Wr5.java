package X;

import android.graphics.Rect;
import android.os.SystemClock;
import java.util.List;

/* loaded from: classes11.dex */
public final class Wr5 implements Runnable {
    public final /* synthetic */ UAP A00;

    public Wr5(UAP uap) {
        this.A00 = uap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UAP uap = this.A00;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uap.A00;
        if (j == 0) {
            j = uptimeMillis - 16;
            uap.A00 = j;
        }
        float f = ((float) (uptimeMillis - j)) / 1000.0f;
        uap.A00 = uptimeMillis;
        List list = uap.A07;
        for (int size = list.size() - 1; -1 < size; size--) {
            C69207Vja c69207Vja = (C69207Vja) list.get(size);
            C69719VuE c69719VuE = c69207Vja.A02;
            C69627VsU c69627VsU = c69207Vja.A03;
            C14360o3.A07(c69207Vja.A01.getBounds());
            float f2 = 0.5f;
            if (AbstractC167007dF.A1N((c69207Vja.A00 > 0.0f ? 1 : (c69207Vja.A00 == 0.0f ? 0 : -1))) && uap.getWidth() > 0) {
                float f3 = 1.0f;
                if (c69627VsU.A05 + r12.centerX() > uap.getWidth() * 0.5f) {
                    f3 = -1.0f;
                }
                c69207Vja.A00 = f3;
            }
            c69719VuE.A00(f);
            float f4 = c69207Vja.A00;
            float f5 = c69719VuE.A09;
            float f6 = f4 * (-f5);
            if (f5 >= 0.0f) {
                f2 = 0.125f;
            }
            c69719VuE.A08 = f6 * f2;
            float f7 = c69207Vja.A00;
            float f8 = c69719VuE.A09;
            float f9 = f7 * (-f8);
            float f10 = 0.05f;
            if (f8 < 0.0f) {
                f10 = 0.1f;
            }
            c69719VuE.A04 = f9 * f10;
            float f11 = c69719VuE.A09 / uap.A03;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            c69719VuE.A05 = f11;
            c69719VuE.A06 = f11;
            c69719VuE.A01(c69627VsU, f);
            if (uap.getHeight() != 0) {
                Rect bounds = c69207Vja.A01.getBounds();
                C14360o3.A07(bounds);
                int max = Math.max(bounds.width(), bounds.height());
                C69627VsU c69627VsU2 = c69207Vja.A03;
                if ((bounds.top + c69627VsU2.A06) - (c69627VsU2.A03 * max) > uap.getHeight()) {
                    list.remove(size);
                }
            }
            U8X u8x = c69207Vja.A01;
            float f12 = u8x.A02;
            float min = Math.min(f12 + (uap.A04 * f), uap.A05);
            if (f12 != min) {
                u8x.A02 = min;
                u8x.A05 = true;
                u8x.invalidateSelf();
            }
            float f13 = c69719VuE.A09 / 260.0f;
            C65726Tt0 c65726Tt0 = u8x.A03;
            if (c65726Tt0 != null) {
                c65726Tt0.A01();
            }
            u8x.A03 = null;
            if (u8x.A00 != f13) {
                u8x.A00 = f13;
                u8x.invalidateSelf();
            }
        }
        uap.invalidate();
        if (!list.isEmpty()) {
            uap.postOnAnimation(uap.A06);
            return;
        }
        uap.A00 = 0L;
        InterfaceC16660sJ interfaceC16660sJ = uap.A01;
        if (interfaceC16660sJ == null) {
            return;
        }
        interfaceC16660sJ.invoke(uap);
    }
}
