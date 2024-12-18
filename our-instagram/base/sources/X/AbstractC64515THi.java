package X;

import java.io.Serializable;

/* renamed from: X.THi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC64515THi implements Serializable {
    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public final Object A01() {
        if (this instanceof C60547R6k) {
            return ((C60547R6k) this).A00;
        }
        throw AbstractC166987dD.A14("Optional.get() cannot be called on an absent value");
    }
}
