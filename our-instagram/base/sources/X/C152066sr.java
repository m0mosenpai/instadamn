package X;

import java.lang.reflect.Method;

@Deprecated
/* renamed from: X.6sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152066sr {
    public final int A00;
    public final Method A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C152066sr)) {
            return false;
        }
        C152066sr c152066sr = (C152066sr) obj;
        return this.A00 == c152066sr.A00 && this.A01.getName().equals(c152066sr.A01.getName());
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.getName().hashCode();
    }

    public C152066sr(Method method, int i) {
        this.A00 = i;
        this.A01 = method;
        method.setAccessible(true);
    }
}
