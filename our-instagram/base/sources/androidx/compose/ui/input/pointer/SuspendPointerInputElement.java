package androidx.compose.ui.input.pointer;

import X.C14360o3;
import X.C58N;
import X.InterfaceC16620sF;

/* loaded from: classes3.dex */
public final class SuspendPointerInputElement extends C58N {
    public final Object A00;
    public final Object A01;
    public final InterfaceC16620sF A02;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SuspendPointerInputElement) {
            SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
            return C14360o3.A0K(this.A00, suspendPointerInputElement.A00) && C14360o3.A0K(this.A01, suspendPointerInputElement.A01) && this.A02 == suspendPointerInputElement.A02;
        }
        return false;
    }

    @Override // X.C58N
    public final int hashCode() {
        int i;
        int i2;
        Object obj = this.A00;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object obj2 = this.A01;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        } else {
            i2 = 0;
        }
        return ((i3 + i2) * 31 * 31) + this.A02.hashCode();
    }

    public SuspendPointerInputElement(Object obj, Object obj2, InterfaceC16620sF interfaceC16620sF) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = interfaceC16620sF;
    }
}
