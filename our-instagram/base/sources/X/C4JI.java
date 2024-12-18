package X;

import java.util.Arrays;

/* renamed from: X.4JI, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4JI {
    public static final C22P A01(String str) {
        if (str == null) {
            return C22P.A5N;
        }
        try {
            return C22P.valueOf(str);
        } catch (Exception e) {
            String format = String.format("Failed to find matching InstagramCameraEntryPointTypes for %s", Arrays.copyOf(new Object[]{str}, 1));
            C14360o3.A07(format);
            C0w9.A06("InstagramCameraEntryPointTypesSerializer", format, e);
            return C22P.A5N;
        }
    }

    public static final C22P A00(long j) {
        for (C22P c22p : C22P.values()) {
            Long valueOf = Long.valueOf(c22p.A00);
            if (valueOf != null && j == valueOf.longValue()) {
                return c22p;
            }
        }
        return C22P.A5N;
    }
}
