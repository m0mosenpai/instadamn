package X;

/* renamed from: X.VpS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69497VpS {
    public final synchronized W2C A00() {
        W2C w2c;
        if (W2C.A03) {
            w2c = W2C.A02;
            if (w2c == null) {
                C14360o3.A0F("grootSessionManager");
                throw C00O.createAndThrow();
            }
        } else {
            throw new RuntimeException("GrootSessionManager has not been configured yet");
        }
        return w2c;
    }
}
