package X;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* renamed from: X.5mM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125745mM {
    public static C125745mM A01;
    public static final RootTelemetryConfiguration A02 = new RootTelemetryConfiguration(0, 0, 0, false, false);
    public RootTelemetryConfiguration A00;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.5mM, java.lang.Object] */
    public static synchronized C125745mM A00() {
        C125745mM c125745mM;
        synchronized (C125745mM.class) {
            C125745mM c125745mM2 = A01;
            c125745mM = c125745mM2;
            if (c125745mM2 == null) {
                ?? obj = new Object();
                A01 = obj;
                c125745mM = obj;
            }
        }
        return c125745mM;
    }
}
