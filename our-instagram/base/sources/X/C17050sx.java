package X;

import java.io.Serializable;

/* renamed from: X.0sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17050sx implements InterfaceC09390do, Serializable {
    public InterfaceC16820sZ A00;
    public volatile Object A02 = C09580e9.A00;
    public final Object A01 = this;

    @Override // X.InterfaceC09390do
    public final boolean CWa() {
        if (this.A02 == C09580e9.A00) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC09390do
    public final Object getValue() {
        Object obj;
        Object obj2 = this.A02;
        C09580e9 c09580e9 = C09580e9.A00;
        if (obj2 == c09580e9) {
            synchronized (this.A01) {
                obj = this.A02;
                if (obj == c09580e9) {
                    InterfaceC16820sZ interfaceC16820sZ = this.A00;
                    C14360o3.A0A(interfaceC16820sZ);
                    obj = interfaceC16820sZ.invoke();
                    this.A02 = obj;
                    this.A00 = null;
                }
            }
            return obj;
        }
        return obj2;
    }

    public C17050sx(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }

    public final String toString() {
        if (CWa()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
