package X;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1EZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1EZ implements InterfaceC09390do, Serializable {
    public static final AtomicReferenceFieldUpdater A02 = AtomicReferenceFieldUpdater.newUpdater(C1EZ.class, Object.class, "_value");
    public final Object A00;
    public volatile InterfaceC16820sZ A01;
    public volatile Object _value;

    @Override // X.InterfaceC09390do
    public final boolean CWa() {
        if (this._value == C09580e9.A00) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC09390do
    public final Object getValue() {
        Object obj = this._value;
        C09580e9 c09580e9 = C09580e9.A00;
        if (obj == c09580e9) {
            InterfaceC16820sZ interfaceC16820sZ = this.A01;
            if (interfaceC16820sZ != null) {
                obj = interfaceC16820sZ.invoke();
                if (C1E0.A00(this, c09580e9, obj, A02)) {
                    this.A01 = null;
                }
            }
            return this._value;
        }
        return obj;
    }

    public C1EZ(InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = interfaceC16820sZ;
        C09580e9 c09580e9 = C09580e9.A00;
        this._value = c09580e9;
        this.A00 = c09580e9;
    }

    public final String toString() {
        if (CWa()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
