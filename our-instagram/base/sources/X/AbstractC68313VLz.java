package X;

import android.content.Context;

/* renamed from: X.VLz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68313VLz {
    public static final Number A00(C6FQ c6fq, C6FW c6fw) {
        U4G u4g = (U4G) AnonymousClass634.A06(C103064kh.A00(c6fq, c6fw, 1), AbstractC65702TsY.A0O(c6fw));
        if (u4g != null) {
            Context context = C1LZ.A00().A00;
            if (AbstractC79383gk.A03()) {
                float f = u4g.A02.A04;
                C14360o3.A07(AbstractC167007dF.A0K(context));
                return C6DZ.A00(f / r0.density);
            }
            throw new RuntimeException("Cannot getScroll off the main thread!");
        }
        return null;
    }
}
