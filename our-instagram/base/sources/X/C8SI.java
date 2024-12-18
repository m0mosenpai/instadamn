package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8SI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SI {
    public long A00;
    public final Map A01;

    public final long A00(String str) {
        Map map = this.A01;
        Number number = (Number) map.get(str);
        if (number == null) {
            long j = this.A00;
            this.A00 = 1 + j;
            number = Long.valueOf(j);
            map.put(str, number);
        }
        return number.longValue();
    }

    public C8SI(long j) {
        this.A01 = new HashMap(48);
        this.A00 = j;
    }

    public C8SI() {
        this(0L);
    }
}
