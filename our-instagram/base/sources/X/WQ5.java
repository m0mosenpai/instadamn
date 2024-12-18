package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WQ5 implements C1N8 {
    public static final WQ5 A00 = new WQ5();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.common.collect.ImmutableList$Builder] */
    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ?? r0;
        C2JS A01;
        UZX A0E;
        C67532UnW A0E2 = ((C67533UnX) obj).A0E();
        ImmutableList immutableList = null;
        if (A0E2 != null && (A0E = A0E2.A0E()) != null) {
            immutableList = A0E.getRequiredCompactedTreeListField(1, "edges", UZV.class, 1191615373);
        }
        ?? builder = new ImmutableList.Builder();
        if (immutableList != null) {
            r0 = new ArrayList();
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                C2JS A03 = ((C2JS) it.next()).A03(UZU.class, "node", 1320777752);
                if (A03 != null && (A01 = A03.A01(C67535UnZ.class, 1278893400)) != null) {
                    r0.add(A01);
                }
            }
        } else {
            r0 = C16930sl.A00;
        }
        builder.addAll(r0);
        return builder.build();
    }
}
