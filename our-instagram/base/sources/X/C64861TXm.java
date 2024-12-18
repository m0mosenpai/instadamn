package X;

/* renamed from: X.TXm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64861TXm extends RuntimeException {
    public C64861TXm() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final C61035Re7 A00() {
        return new C61035Re7(getMessage());
    }
}
