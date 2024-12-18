package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9ty, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC223559ty extends Exception {
    public Map A00;
    public final int A01;

    public final void A00(String str, String str2) {
        Map map = this.A00;
        if (map == null) {
            map = new HashMap(1);
            this.A00 = map;
        }
        map.put(str, str2);
    }

    public final void A01(Map map) {
        if (map != null && !map.isEmpty()) {
            Map map2 = this.A00;
            if (map2 == null) {
                map2 = new HashMap(map.size());
                this.A00 = map2;
            }
            map2.putAll(map);
        }
    }

    public AbstractC223559ty(String str, Throwable th, int i) {
        super(str, th);
        this.A01 = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        }
        return String.format(null, "[ErrorCode=%d]", Integer.valueOf(this.A01));
    }

    public AbstractC223559ty(int i, Throwable th) {
        super(th.getMessage(), th);
        this.A01 = i;
    }

    public AbstractC223559ty(int i, String str) {
        super(str);
        this.A01 = i;
    }
}
