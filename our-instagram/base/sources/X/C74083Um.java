package X;

import java.util.NoSuchElementException;

/* renamed from: X.3Um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74083Um {
    public final Object A00;

    public final Object A00() {
        Object obj = this.A00;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final String toString() {
        Object obj = this.A00;
        if (obj != null) {
            return String.format("Optional[%s]", obj);
        }
        return "Optional.empty";
    }

    public C74083Um(Object obj) {
        this.A00 = obj;
    }

    public C74083Um() {
        this.A00 = null;
    }
}
