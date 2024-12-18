package X;

import java.io.IOException;

/* renamed from: X.Re3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61033Re3 extends IOException {
    public C61033Re3(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public C61033Re3(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    public C61033Re3() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
