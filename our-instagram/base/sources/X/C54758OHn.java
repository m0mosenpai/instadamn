package X;

import android.util.LongSparseArray;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.systrace.Systrace;
import java.util.Map;

/* renamed from: X.OHn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54758OHn {
    public final LongSparseArray A00;
    public final Map A01;

    public C54758OHn(Map map) {
        C14360o3.A0B(map, 1);
        this.A00 = new LongSparseArray();
        this.A01 = map;
    }

    public final Object A00(C2N9 c2n9) {
        long CBx;
        Object obj;
        if (Systrace.A0E(32L)) {
            AbstractC09800fd.A01(AnonymousClass001.A0R(c2n9.BUQ().getSimpleName(), ".getTypeId"), -545611888);
            try {
                CBx = c2n9.CBx();
                AbstractC09800fd.A00(163716412);
            } catch (Throwable th) {
                AbstractC09800fd.A00(995584626);
                throw th;
            }
        } else {
            CBx = c2n9.CBx();
        }
        LongSparseArray longSparseArray = this.A00;
        synchronized (longSparseArray) {
            obj = longSparseArray.get(CBx);
        }
        if (obj != null) {
            AbstractC53737Npo.A00(c2n9, obj);
            return obj;
        }
        McfReference mcfReference = (McfReference) this.A01.get(Long.valueOf(CBx));
        if (mcfReference == null) {
            return null;
        }
        Object AJz = c2n9.AJz(mcfReference);
        C14360o3.A07(AJz);
        AbstractC53737Npo.A00(c2n9, AJz);
        synchronized (longSparseArray) {
            longSparseArray.put(CBx, AJz);
        }
        return AJz;
    }
}
