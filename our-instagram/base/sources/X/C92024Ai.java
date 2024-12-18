package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4Ai, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92024Ai {
    public final InterfaceC91964Ac A00;
    public final AtomicInteger A01;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C92024Ai) && this.A00.equals(((C92024Ai) obj).A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C92024Ai(InterfaceC91964Ac interfaceC91964Ac, int i) {
        this.A00 = interfaceC91964Ac;
        this.A01 = new AtomicInteger(i);
    }
}
