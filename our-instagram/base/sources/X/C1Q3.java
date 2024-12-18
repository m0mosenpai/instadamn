package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Q3, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Q3 {
    public static final InterfaceC09390do A00;
    public static final InterfaceC09390do A01;
    public static volatile Map A02;

    static {
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        A02 = c16920sk;
        List A1Q = AbstractC16960so.A1Q(AbstractC20100yh.A00(36331209961260244L), AbstractC20100yh.A00(36331038162699403L), AbstractC20100yh.A00(36331038162633866L));
        if (!(A1Q instanceof Collection) || !A1Q.isEmpty()) {
            Iterator it = A1Q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC20080yf abstractC20080yf = (AbstractC20080yf) it.next();
                C14360o3.A0A(abstractC20080yf);
                if (C20150ym.A07(abstractC20080yf)) {
                    A01();
                    break;
                }
            }
        }
        A01 = AbstractC09440dt.A01(C1Q5.A00);
        A00 = AbstractC09440dt.A01(C1Q6.A00);
    }

    public static final void A00() {
        Object c09540e5;
        long nanoTime = System.nanoTime() - C84303pN.A00;
        try {
            File[] listFiles = new File(((File) A00.getValue()).getCanonicalPath()).listFiles(C84313pO.A00);
            C14360o3.A07(listFiles);
            ArrayList<File> arrayList = new ArrayList();
            for (File file : listFiles) {
                C14360o3.A0A(file);
                if (file.exists() && file.isFile() && file.length() >= 50000) {
                    arrayList.add(file);
                }
            }
            int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(arrayList, 10));
            if (A0L < 16) {
                A0L = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
            for (File file2 : arrayList) {
                String name = file2.getName();
                C14360o3.A07(name);
                linkedHashMap.put(AbstractC001900j.A0L(name, ".", name), file2.getCanonicalPath());
            }
            A02 = linkedHashMap;
            c09540e5 = C0eB.A00;
        } catch (Throwable th) {
            c09540e5 = new C09540e5(th);
        }
        Throwable A002 = C09550e6.A00(c09540e5);
        if (A002 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("err in local video scan, ");
            sb.append(A002);
            C0K8.A0C("VideoOutputLocalFileUtil", sb.toString());
        }
        C36J.A07(C84303pN.A01.A00(nanoTime));
        A02.size();
        Iterator it = A02.values().iterator();
        while (it.hasNext()) {
            new File((String) it.next()).length();
        }
        A02.keySet();
    }

    public static final void A01() {
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.3pL
            @Override // java.lang.Runnable
            public final void run() {
                C1Q3.A00();
            }
        });
    }
}
