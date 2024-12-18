package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.78F, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C78F {
    public C78J A00;

    public final Pattern A00(String str) {
        Object obj;
        C78J c78j = this.A00;
        synchronized (c78j) {
            obj = c78j.A01.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            synchronized (c78j) {
                c78j.A01.put(str, pattern);
            }
        }
        return pattern;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.78J] */
    public C78F(int i) {
        final ?? obj = new Object();
        obj.A00 = i;
        final int i2 = ((i * 4) / 3) + 1;
        obj.A01 = new LinkedHashMap<K, V>(i2) { // from class: X.78L
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry entry) {
                if (size() <= C78J.this.A00) {
                    return false;
                }
                return true;
            }
        };
        this.A00 = obj;
    }
}
