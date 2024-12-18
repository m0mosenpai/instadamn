package X;

import java.lang.ref.WeakReference;

/* renamed from: X.1yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43121yf {
    public static final InterfaceC16660sJ A03 = C43131yg.A00;
    public static final InterfaceC16660sJ A04 = C43171yk.A00;
    public WeakReference A00;
    public final C3ZM A01;
    public final InterfaceC41211vV A02;

    public final boolean equals(Object obj) {
        if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
            return this.A01.equals(((C43121yf) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        return this.A01.toString();
    }

    public C43121yf(C3ZM c3zm, InterfaceC41211vV interfaceC41211vV) {
        this.A01 = c3zm;
        this.A02 = interfaceC41211vV;
    }
}
