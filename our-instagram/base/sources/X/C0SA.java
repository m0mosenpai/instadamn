package X;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0SA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SA extends AbstractC02960Bu {
    public HashMap A00 = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HashMap hashMap = this.A00;
        HashMap hashMap2 = ((C0SA) obj).A00;
        if (hashMap != null) {
            return hashMap.equals(hashMap2);
        }
        return hashMap2 == null;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A01(AbstractC02960Bu abstractC02960Bu) {
        this.A00 = ((C0SA) abstractC02960Bu).A00;
        return this;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A02(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        C0SA c0sa = (C0SA) abstractC02960Bu;
        C0SA c0sa2 = (C0SA) abstractC02960Bu2;
        if (c0sa2 == null) {
            c0sa2 = new C0SA();
        }
        if (c0sa == null) {
            c0sa2.A00 = this.A00;
        } else {
            c0sa2.A00.keySet().retainAll(this.A00.keySet());
            for (Map.Entry entry : this.A00.entrySet()) {
                Object key = entry.getKey();
                Object obj = ((Pair) entry.getValue()).first;
                C0WB c0wb = (C0WB) ((Pair) entry.getValue()).second;
                if (!c0sa2.A00.containsKey(key)) {
                    c0sa2.A00.put(key, new Pair(obj, new Object()));
                }
                C0WB c0wb2 = (C0WB) ((Pair) c0sa2.A00.get(key)).second;
                if (c0sa.A00.containsKey(key)) {
                    c0wb.A02((C0WB) ((Pair) c0sa.A00.get(key)).second, c0wb2);
                } else {
                    c0wb2.A06(c0wb);
                }
            }
        }
        return c0sa2;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        C0SA c0sa = (C0SA) abstractC02960Bu;
        C0SA c0sa2 = (C0SA) abstractC02960Bu2;
        c0sa2.A00.keySet().retainAll(this.A00.keySet());
        for (Map.Entry entry : this.A00.entrySet()) {
            if (c0sa2.A00.containsKey(entry.getKey())) {
                ((C0WB) ((Pair) c0sa2.A00.get(entry.getKey())).second).A06((C0WB) ((Pair) entry.getValue()).second);
            } else {
                c0sa2.A00.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : c0sa.A00.entrySet()) {
            Object key = entry2.getKey();
            if (c0sa2.A00.containsKey(key)) {
                C0WB c0wb = (C0WB) ((Pair) c0sa2.A00.get(key)).second;
                c0wb.A03((C0WB) ((Pair) entry2.getValue()).second, c0wb);
            } else {
                c0sa2.A00.put(entry2.getKey(), entry2.getValue());
            }
        }
        return c0sa2;
    }

    public final int hashCode() {
        HashMap hashMap = this.A00;
        if (hashMap != null) {
            return hashMap.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AnonymousClass001.A0g("ThreadCpuMetrics{ ", this.A00.toString(), " }");
    }
}
