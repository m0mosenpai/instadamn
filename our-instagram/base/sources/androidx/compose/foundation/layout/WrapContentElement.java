package androidx.compose.foundation.layout;

import X.AbstractC53644Nnp;
import X.AbstractC72509XfO;
import X.C14360o3;
import X.C58N;
import X.InterfaceC16620sF;

/* loaded from: classes3.dex */
public final class WrapContentElement extends C58N {
    public final Integer A00;
    public final InterfaceC16620sF A01;
    public final Object A02;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                WrapContentElement wrapContentElement = (WrapContentElement) obj;
                if (this.A00 != wrapContentElement.A00 || !C14360o3.A0K(this.A02, wrapContentElement.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        return (((AbstractC72509XfO.A00(this.A00) * 31) + AbstractC53644Nnp.A00()) * 31) + this.A02.hashCode();
    }

    public WrapContentElement(Integer num, Object obj, InterfaceC16620sF interfaceC16620sF) {
        this.A00 = num;
        this.A01 = interfaceC16620sF;
        this.A02 = obj;
    }
}
