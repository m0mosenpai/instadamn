package X;

import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

/* renamed from: X.VQi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68426VQi {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.String");
        int A0D = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        boolean A012 = C6DZ.A01(c6fw.A00());
        Fragment A00 = C6BQ.A00(C6BQ.A09(c6fq));
        if (A00 instanceof C72743Nv) {
            if ("start".equals(A01)) {
                C72743Nv c72743Nv = (C72743Nv) A00;
                IgBloksScreenConfig igBloksScreenConfig = c72743Nv.A09;
                HashMap hashMap = igBloksScreenConfig.A0V;
                if (hashMap == null) {
                    hashMap = new HashMap();
                    igBloksScreenConfig.A0V = hashMap;
                }
                hashMap.put(Integer.valueOf(A0D), Boolean.valueOf(A012));
                C56352iT.A0t.A03(c72743Nv.A03).ARb(A0D, A012);
                return null;
            }
            if (!"end".equals(A01)) {
                return null;
            }
            C72743Nv c72743Nv2 = (C72743Nv) A00;
            IgBloksScreenConfig igBloksScreenConfig2 = c72743Nv2.A09;
            HashMap hashMap2 = igBloksScreenConfig2.A0W;
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                igBloksScreenConfig2.A0W = hashMap2;
            }
            hashMap2.put(Integer.valueOf(A0D), Boolean.valueOf(A012));
            C56352iT.A0t.A03(c72743Nv2.A03).ARk(A0D, A012);
            return null;
        }
        return null;
    }
}
