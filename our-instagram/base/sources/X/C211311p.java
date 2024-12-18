package X;

import java.io.Serializable;

/* renamed from: X.11p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C211311p implements InterfaceC09390do, Serializable {
    public Object A00;
    public InterfaceC16820sZ A01;

    @Override // X.InterfaceC09390do
    public final boolean CWa() {
        if (this.A00 == C09580e9.A00) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC09390do
    public final Object getValue() {
        Object obj = this.A00;
        if (obj == C09580e9.A00) {
            InterfaceC16820sZ interfaceC16820sZ = this.A01;
            C14360o3.A0A(interfaceC16820sZ);
            Object invoke = interfaceC16820sZ.invoke();
            this.A00 = invoke;
            this.A01 = null;
            return invoke;
        }
        return obj;
    }

    public final String toString() {
        if (CWa()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
