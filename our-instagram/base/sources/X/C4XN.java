package X;

import com.facebook.proxygen.LigerSamplePolicy;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.4XN, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4XN implements C4XO {
    public final int A00;

    @Override // X.C4XO
    public final long Boy(C65878Tvh c65878Tvh) {
        int min;
        if (this instanceof C4XT) {
            IOException iOException = c65878Tvh.A03;
            int i = c65878Tvh.A00;
            if (iOException instanceof C93204Fw) {
                C93204Fw c93204Fw = (C93204Fw) iOException;
                Map map = c93204Fw.A01;
                if (W6R.A02(map)) {
                    return W6R.A00(map, c93204Fw.A00, i);
                }
            }
            if ((iOException instanceof C93194Fv) || (iOException instanceof FileNotFoundException) || (iOException instanceof C222479ro)) {
                return -9223372036854775807L;
            }
            min = (int) Math.min(((i - 1) * 1000) + 500, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        } else {
            Throwable th = c65878Tvh.A03;
            if (!(th instanceof C93194Fv) && !(th instanceof FileNotFoundException) && !(th instanceof RFd) && !(th instanceof C222479ro)) {
                while (th != null) {
                    if ((th instanceof C93224Fy) && ((C93224Fy) th).A00 == 2008) {
                        return -9223372036854775807L;
                    }
                    th = th.getCause();
                }
                min = Math.min((c65878Tvh.A00 - 1) * 1000, 5000);
            } else {
                return -9223372036854775807L;
            }
        }
        return min;
    }

    public C4XN(int i) {
        this.A00 = i;
    }

    public C4XN() {
        this(-1);
    }
}
