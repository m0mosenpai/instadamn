package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.SaC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62988SaC {
    public static final C62988SaC A01 = new C62988SaC(Collections.unmodifiableMap(AbstractC166987dD.A1G()));
    public final Map A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C62988SaC)) {
            return false;
        }
        return this.A00.equals(((C62988SaC) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C62988SaC(Map entries) {
        this.A00 = entries;
    }
}
