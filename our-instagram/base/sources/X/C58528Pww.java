package X;

import java.util.Arrays;

/* renamed from: X.Pww, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58528Pww {
    public final C58526Pwu A00;
    public final Class A01;

    public final boolean equals(Object o) {
        if (!(o instanceof C58528Pww)) {
            return false;
        }
        C58528Pww c58528Pww = (C58528Pww) o;
        if (!c58528Pww.A01.equals(this.A01) || !c58528Pww.A00.equals(this.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public C58528Pww(C58526Pwu keySerializationClass, Class serializationIdentifier) {
        this.A01 = serializationIdentifier;
        this.A00 = keySerializationClass;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A01.getSimpleName());
        A1C.append(", object identifier: ");
        return AbstractC166997dE.A0v(this.A00, A1C);
    }
}
