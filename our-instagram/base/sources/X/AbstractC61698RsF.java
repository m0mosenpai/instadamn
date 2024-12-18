package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.RsF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61698RsF {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.SEA, java.lang.Object] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A02 = c6fw.A02();
        AbstractC25225BEi.A1S(A02);
        String str = (String) A02;
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Object A03 = c6fw.A03(3);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.instagram.common.bloks.sensitive.SensitiveValue<kotlin.String>>");
        Map map = (Map) A03;
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 4);
        InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 5);
        C62639SJw c62639SJw = SXG.A0A;
        C63346Si2 A01 = C63174SeZ.A01();
        HashMap A1G = AbstractC166987dD.A1G();
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator A15 = AbstractC166997dE.A15((Map) A00);
        while (A15.hasNext()) {
            AbstractC43594JPz.A1S(A1G, AbstractC166987dD.A1K(A15));
        }
        C125955mm c125955mm = AbstractC125945ml.A00;
        AtomicInteger atomicInteger = (AtomicInteger) c125955mm.get();
        if (atomicInteger == null) {
            atomicInteger = AbstractC58319PtB.A16();
            c125955mm.set(atomicInteger);
        }
        atomicInteger.incrementAndGet();
        try {
            try {
                Iterator A152 = AbstractC166997dE.A15(map);
                while (A152.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A152);
                    Object key = A1K.getKey();
                    C62653SKm c62653SKm = (C62653SKm) A1K.getValue();
                    if (AbstractC125945ml.A00()) {
                        A1G.put(key, c62653SKm.A00);
                        A1H.add(A1K.getKey());
                    } else {
                        throw new IllegalStateException("SensitiveValue is not allowed to be unwrapped outside of Boundary.run");
                    }
                }
                atomicInteger.decrementAndGet();
                ?? obj = new Object();
                obj.A00 = A1G;
                obj.A01 = A1H;
                SXG A002 = c62639SJw.A00(A01, obj, str, AbstractC06930Yk.A0E(), C16910sj.A00);
                C63626SqY c63626SqY = new C63626SqY(c6fq, A0I, A0I2, 0);
                Q8J A012 = AbstractC63245Sfz.A01(A002);
                C14360o3.A07(A012);
                AbstractC63246Sg0.A01(null, A012, c63626SqY);
                return null;
            } catch (RkU e) {
                throw e;
            }
        } catch (Throwable th) {
            atomicInteger.decrementAndGet();
            throw th;
        }
    }
}
