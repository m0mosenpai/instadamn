package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.16U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16U extends ConcurrentHashMap<String, String> {
    public static final C16U A01 = new C16U();
    public final Object A00;

    public C16U() {
        super(180, 0.8f, 4);
        this.A00 = new Object();
    }

    public final String A00(String str) {
        String str2 = get(str);
        if (str2 == null) {
            if (size() >= 180) {
                synchronized (this.A00) {
                    if (size() >= 180) {
                        clear();
                    }
                }
            }
            String intern = str.intern();
            put(intern, intern);
            return intern;
        }
        return str2;
    }
}
