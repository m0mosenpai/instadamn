package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4F2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4F2 extends C4A7 {
    public final C05A A00;
    public final C0UO A01;

    public final void A00(String str, String str2) {
        Object value;
        LinkedHashMap linkedHashMap;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C05A c05a = this.A00;
        do {
            value = c05a.getValue();
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) value).entrySet()) {
                if (!C14360o3.A0K(entry.getKey(), str) || !C14360o3.A0K(((C103514lR) ((C9BR) entry.getValue()).A01).A07, str2)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } while (!c05a.AIi(value, linkedHashMap));
    }

    public final boolean A01(String str) {
        C14360o3.A0B(str, 0);
        for (Object obj : ((Map) this.A01.getValue()).entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            if (C14360o3.A0K(((C103514lR) ((C9BR) entry.getValue()).A01).A07, str) && ((C9BR) entry.getValue()).A02) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public C4F2() {
        super("ContentNotesOptimisticPosting", C4A8.A01(1196867702, 3));
        C008002u A00 = C10E.A00(AbstractC06930Yk.A0E());
        this.A00 = A00;
        this.A01 = AbstractC208910l.A02(A00);
    }
}
