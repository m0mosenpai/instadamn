package X;

import java.util.UUID;

/* renamed from: X.1M0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1M0 implements C1M1 {
    public static final C1M3 A01 = new Object();
    public String A00;

    @Override // X.C1M1
    public final String getSessionId() {
        return this.A00;
    }

    public C1M0() {
        String obj = UUID.randomUUID().toString();
        C14360o3.A0B(obj, 1);
        this.A00 = obj;
    }
}
