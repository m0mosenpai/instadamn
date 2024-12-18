package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class MUA implements Runnable {
    public final /* synthetic */ AbstractC12990ll A00;

    public MUA(AbstractC12990ll abstractC12990ll) {
        this.A00 = abstractC12990ll;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object A1D;
        boolean z;
        try {
            boolean z2 = C54960OSl.A02;
            Context context = AbstractC12290kX.A00;
            C14360o3.A07(context);
            C1CM c1cm = new C1CM(context);
            C06860Yd c06860Yd = new C06860Yd();
            long nanoTime = System.nanoTime();
            long j = C84303pN.A00;
            long j2 = nanoTime - j;
            C1CM.A00(c1cm);
            c06860Yd.put("battery_level", Integer.valueOf(c1cm.A00));
            c06860Yd.put("is_charging", Boolean.valueOf(c1cm.A06()));
            c06860Yd.put("screen_brightness", Integer.valueOf(c1cm.A01()));
            c06860Yd.put("on_wifi", Boolean.valueOf(c1cm.A07(true)));
            c06860Yd.put("thermal_status", Integer.valueOf(c1cm.A02()));
            PowerManager powerManager = (PowerManager) c1cm.A09.getValue();
            if (powerManager != null) {
                z = powerManager.isPowerSaveMode();
            } else {
                z = false;
            }
            c06860Yd.put("is_powersave", Boolean.valueOf(z));
            C84303pN c84303pN = C84303pN.A01;
            long A00 = A00(c84303pN, j2, j);
            c06860Yd.put("hw_av1_dec", (Boolean) C121815fZ.A02.getValue());
            c06860Yd.put("hw_vp9_dec", (Boolean) C121815fZ.A04.getValue());
            c06860Yd.put("hw_avc_dec", (Boolean) C121815fZ.A03.getValue());
            c06860Yd.put("10bit_hw_av1_dec", (Boolean) C121815fZ.A05.getValue());
            c06860Yd.put("10bit_hw_vp9_dec", (Boolean) C121815fZ.A06.getValue());
            long A002 = A00(c84303pN, A00, j);
            c06860Yd.put("is_hlg_supported", (Boolean) AbstractC121885fg.A01.getValue());
            long A003 = A00(c84303pN, A002, j);
            c06860Yd.put("chip_vendor", AbstractC25225BEi.A15(O1C.A01));
            c06860Yd.put("chip_name", AbstractC25225BEi.A15(O1C.A00));
            long A004 = A00(c84303pN, A003, j);
            c06860Yd.put("mips_sum", Float.valueOf(MSZ.A03(O1C.A06)));
            c06860Yd.put("core_count", Integer.valueOf(AbstractC167027dH.A01(O1C.A02)));
            long A005 = A00(c84303pN, A004, j);
            c06860Yd.put("max_ghz_sum", Float.valueOf(MSZ.A03(O1C.A04)));
            c06860Yd.put("min_ghz_sum", Float.valueOf(MSZ.A03(O1C.A05)));
            C36J.A07(c84303pN.A00(A005));
            C54960OSl.A01 = AbstractC31175DnJ.A0d(AbstractC16850sd.A0N(c06860Yd));
            A1D = C0eB.A00;
        } catch (Throwable th) {
            A1D = MSW.A1D(th);
        }
        Throwable A006 = C09550e6.A00(A1D);
        if (A006 != null) {
            C0K8.A0F("DeviceStatusExtractor", "err in device status", A006);
        }
        C14270nr.A00().A01(new C18320vJ(971179876, this), TimeUnit.SECONDS.toMillis(C18U.A01(C06090Tz.A05, this.A00, 36607397833741920L)));
    }

    public static long A00(C84303pN c84303pN, long j, long j2) {
        C36J.A07(c84303pN.A00(j));
        return System.nanoTime() - j2;
    }
}
