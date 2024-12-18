package X;

import android.content.Context;
import android.os.StatFs;
import java.io.File;

/* renamed from: X.1Ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC25551Ml {
    public static final C1N3 A00(Context context, C1Mk c1Mk, String str, float f, long j, boolean z) {
        C14360o3.A0B(context, 0);
        File A00 = AbstractC25541Mj.A00(context, str, z);
        if (A00 != null) {
            if (!C0JK.A01().A09() && C0JK.A01().A08() && c1Mk == C1Mk.A07) {
                j = (long) (j * 1.5d);
            }
            long j2 = 0;
            try {
                if (!A00.exists()) {
                    A00.mkdirs();
                }
                StatFs statFs = new StatFs(A00.getPath());
                long blockSizeLong = statFs.getBlockSizeLong();
                long blockCountLong = statFs.getBlockCountLong();
                long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
                long min = Math.min(((float) (blockCountLong * blockSizeLong)) * f, j);
                if (min > availableBlocksLong) {
                    long A02 = AbstractC13530mf.A02(A00);
                    if (min > A02) {
                        min = Math.min(min - A02, availableBlocksLong / 2) + A02;
                    }
                }
                j2 = min;
            } catch (IllegalArgumentException unused) {
            }
            return new C1N3(A00, j2);
        }
        throw new RuntimeException("No disk accessible");
    }
}
