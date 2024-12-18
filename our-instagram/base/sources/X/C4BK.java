package X;

import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.4BK, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4BK {
    public static final java.util.Set A00 = Collections.emptySet();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Set] */
    public static C70519Wbc A00(C46272Ao c46272Ao, C92124As c92124As, String str) {
        ?? hashSet;
        if (c46272Ao == null) {
            return null;
        }
        List list = ((C4BF) c92124As.A02(0).A03.get(0)).A07;
        if (list.isEmpty()) {
            hashSet = A00;
        } else {
            hashSet = new HashSet();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                DrmInitData drmInitData = ((C4BB) list.get(i)).A02.A0O;
                if (drmInitData != null) {
                    for (DrmInitData.SchemeData schemeData : drmInitData.A03) {
                        if (schemeData.A04 != null) {
                            hashSet.add(schemeData.A03);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC459729h.A01("DrmSessionManagerHelper", "DRM scheme %s for vid=%s", it.next().toString(), str);
        }
        if (hashSet.isEmpty()) {
            AbstractC459729h.A01("DrmSessionManagerHelper", "Not a protected video for vid=%s", str);
            return null;
        }
        if (hashSet.contains(C4YL.A04)) {
            return A01(new T4E(c46272Ao, str));
        }
        throw new Exception();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C70519Wbc A01(InterfaceC65243TgZ interfaceC65243TgZ) {
        InterfaceC71904X9o interfaceC71904X9o;
        boolean A02 = C2C5.A02(C2C1.A1M);
        HashMap hashMap = new HashMap();
        UUID uuid = C4YL.A04;
        InterfaceC71904X9o interfaceC71904X9o2 = C70524Wbh.A03;
        C4XN c4xn = new C4XN(-1);
        int[] iArr = new int[0];
        String str = "";
        if (A02) {
            Object obj = new Object();
            uuid.getClass();
            interfaceC71904X9o = obj;
        } else {
            uuid.getClass();
            interfaceC71904X9o2.getClass();
            str = "L3";
            interfaceC71904X9o = interfaceC71904X9o2;
        }
        return new C70519Wbc(interfaceC71904X9o, interfaceC65243TgZ, c4xn, str, hashMap, uuid, iArr);
    }
}
