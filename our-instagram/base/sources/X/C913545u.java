package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.45u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C913545u {
    public final HashMap A00 = new HashMap(64);
    public final AtomicReference A01 = new AtomicReference();

    public final JsonSerializer A00(AbstractC910944l abstractC910944l) {
        JsonSerializer jsonSerializer;
        synchronized (this) {
            jsonSerializer = (JsonSerializer) this.A00.get(new C55G(abstractC910944l));
        }
        return jsonSerializer;
    }

    public final JsonSerializer A01(Class cls) {
        JsonSerializer jsonSerializer;
        synchronized (this) {
            jsonSerializer = (JsonSerializer) this.A00.get(new C55G(cls, false));
        }
        return jsonSerializer;
    }
}
