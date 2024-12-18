package X;

import android.util.Pair;
import com.facebook.common.dextricks.DexStore;
import java.io.FileNotFoundException;

/* renamed from: X.OXj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55028OXj {
    public static final android.net.Uri A01(String str) {
        C14360o3.A0B(str, 0);
        android.net.Uri A0B = AbstractC25227BEk.A0B(str);
        String scheme = A0B.getScheme();
        if (C14360o3.A0K(scheme, "file")) {
            String path = A0B.getPath();
            if (path != null && path.length() != 0) {
                if (MSY.A1Z(path)) {
                    return A0B;
                }
                throw new FileNotFoundException(AnonymousClass001.A0R("Input file to the transcoder is not found: ", str));
            }
            throw AbstractC167007dF.A0c("Invalid input file URI passed to the transcoder: ", str);
        }
        throw AbstractC167007dF.A0c("Transcoder only support local files as input (file://). Invalid input file URI scheme: ", scheme);
    }

    public static final long A00(Double d) {
        if (d != null) {
            double doubleValue = d.doubleValue();
            if (doubleValue >= 0.0d) {
                return (long) (doubleValue * 1000.0d);
            }
            return -1L;
        }
        return -1L;
    }

    public static final Pair A02(MYB myb, C54584O9l c54584O9l) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        int min;
        if (c54584O9l != null) {
            Pair pair = c54584O9l.A02;
            i4 = AbstractC166987dD.A0H(pair.first);
            i = AbstractC166987dD.A0H(pair.second);
            Pair pair2 = c54584O9l.A00;
            i5 = AbstractC166987dD.A0H(pair2.first);
            i2 = AbstractC166987dD.A0H(pair2.second);
            Pair pair3 = c54584O9l.A01;
            i6 = AbstractC166987dD.A0H(pair3.first);
            i3 = AbstractC166987dD.A0H(pair3.second);
        } else {
            i = 5000000;
            i2 = 2500000;
            i3 = DexStore.MS_IN_NS;
            i4 = 1920;
            i5 = 1280;
            i6 = 1280;
        }
        int max = Math.max(myb.A03, myb.A05);
        if (max > 1920) {
            j = myb.A06;
            j2 = i;
        } else {
            if (max > 1280) {
                min = (int) Math.min(myb.A06, i2);
                i4 = i5;
                return MSY.A0D(Integer.valueOf(i4), min);
            }
            i4 = Math.min(max, i6);
            j = myb.A06;
            j2 = i3;
        }
        min = (int) Math.min(j, j2);
        return MSY.A0D(Integer.valueOf(i4), min);
    }
}
