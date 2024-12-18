package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.Pug, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58402Pug {
    public static final C58402Pug A01;
    public static volatile C58402Pug A02;
    public final Map A00;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        A01 = new C58402Pug(true);
    }

    public static C58402Pug A00() {
        C58402Pug c58402Pug;
        C58402Pug c58402Pug2 = A02;
        if (c58402Pug2 == null) {
            synchronized (C58402Pug.class) {
                c58402Pug = A02;
                if (c58402Pug == null) {
                    Class cls = AbstractC58405Puj.A00;
                    if (cls != null) {
                        try {
                            c58402Pug = (C58402Pug) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                        A02 = c58402Pug;
                    }
                    c58402Pug = A01;
                    A02 = c58402Pug;
                }
            }
            return c58402Pug;
        }
        return c58402Pug2;
    }

    public C58402Pug(boolean z) {
        this.A00 = Collections.emptyMap();
    }

    public C58402Pug() {
        this.A00 = AbstractC166987dD.A1G();
    }
}
