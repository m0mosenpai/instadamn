package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Rri, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61668Rri {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        String A0n = AbstractC31176DnK.A0n(c6fw, "null cannot be cast to non-null type kotlin.String");
        String A0o = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 3);
        Object A03 = c6fw.A03(4);
        C14360o3.A0C(A03, AbstractC111324zv.A00(8));
        List list = (List) A03;
        Object A032 = c6fw.A03(5);
        C14360o3.A0C(A032, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Object A033 = c6fw.A03(3);
        C14360o3.A0C(A033, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.instagram.common.bloks.sensitive.SensitiveValue<kotlin.String>>");
        Map map = (Map) A033;
        String A0o2 = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 7);
        String A0y = AbstractC43593JPy.A0y(c6fw, 8);
        String A0y2 = AbstractC43593JPy.A0y(c6fw, 9);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 11);
        InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 12);
        HashMap A1G = AbstractC166987dD.A1G();
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator A15 = AbstractC166997dE.A15((Map) A032);
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
                C6FG c6fg = c6fq.A03;
                C14360o3.A0A(c6fg);
                AbstractC63312ShK.A02(c6fg.A00, new T38(c6fq, A0I, A0I2, 0), Boolean.valueOf(AbstractC25229BEm.A1a(A0o, "VERIFY_FACTOR")), str, A0o, A0n, A0y, A0y2, A0o2, list, AbstractC001800i.A0a(A1H), A1G);
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
