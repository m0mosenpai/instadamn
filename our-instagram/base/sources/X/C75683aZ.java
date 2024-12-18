package X;

import android.content.res.Configuration;

/* renamed from: X.3aZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75683aZ {
    public final synchronized C2XF A00(Configuration configuration) {
        C2XF c2xf;
        C14360o3.A0B(configuration, 0);
        c2xf = C2XF.latest;
        if (c2xf == null || !C14360o3.A0K(c2xf.A00, configuration)) {
            c2xf = new C2XG(new Configuration(configuration));
            C2XF.latest = c2xf;
        }
        return c2xf;
    }
}
