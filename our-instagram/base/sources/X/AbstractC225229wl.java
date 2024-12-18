package X;

import android.content.Context;
import android.os.StatFs;

/* renamed from: X.9wl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225229wl {
    public static boolean A00(Context context, InterfaceC178337w7 interfaceC178337w7) {
        long j;
        long j2;
        boolean z = interfaceC178337w7 instanceof C178317w5;
        if (AbstractC176637tL.A00(context, true) >= 0) {
            Runtime runtime = Runtime.getRuntime();
            int freeMemory = (int) ((runtime.freeMemory() + (runtime.maxMemory() - runtime.totalMemory())) >> 20);
            if (z) {
                if (C04100Kb.A00(AbstractC12290kX.A00) >= 2016) {
                    j = 500;
                } else {
                    j = 50;
                }
            } else {
                j = 0;
            }
            if (freeMemory >= ((int) j)) {
                C14360o3.A0B(context, 0);
                StatFs statFs = new StatFs(context.getCacheDir().getAbsolutePath());
                long availableBlocksLong = (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) >> 20;
                if (z) {
                    j2 = 2000;
                } else {
                    j2 = 0;
                }
                if (availableBlocksLong >= ((int) j2)) {
                    return interfaceC178337w7.CUZ(112);
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
