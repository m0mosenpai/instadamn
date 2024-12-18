package X;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.8ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203298ym {
    public int A00;
    public C198938qt A01;
    public C5QD A02;
    public List A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.8yo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0sl] */
    public C203298ym(C199008r1 c199008r1) {
        ?? arrayList;
        C198928qs c198928qs = c199008r1.A01.A04;
        Map map = c198928qs.A05;
        if (map == null) {
            arrayList = C16930sl.A00;
        } else {
            arrayList = new ArrayList();
            List list = c198928qs.A04;
            for (BD4 bd4 : list == null ? C16930sl.A00 : list) {
                Drawable drawable = ((C9LJ) bd4).A0B;
                C202278x7 c202278x7 = (C202278x7) map.get(drawable);
                c202278x7 = c202278x7 == null ? new C202278x7(C0HM.A00().toString(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, false) : c202278x7;
                C5NL A00 = AbstractC226649zM.A00(drawable);
                if (A00 != null) {
                    C5NM c5nm = new C5NM(A00);
                    Object C4x = bd4.C4x();
                    C8FC c8fc = (!(C4x instanceof C8FC) || (c8fc = (C8FC) C4x) == null) ? new C8FC((C8D0) null, (C8FD) null, (C89G) null, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, false) : c8fc;
                    ?? obj = new Object();
                    obj.A00 = c5nm;
                    obj.A02 = c202278x7;
                    obj.A01 = c8fc;
                    arrayList.add(obj);
                }
            }
        }
        this.A03 = arrayList;
        SparseArray sparseArray = c198928qs.A02;
        C5QD c5qd = new C5QD();
        c5qd.A00 = sparseArray;
        this.A02 = c5qd;
        this.A01 = c198928qs.A03;
        this.A00 = c198928qs.A00;
    }

    public C203298ym() {
    }
}
