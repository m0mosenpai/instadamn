package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.58o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1130258o implements Modifier {
    public final Modifier A00;
    public final Modifier A01;

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier Eq3(Modifier modifier) {
        return C58m.A00(this, modifier);
    }

    @Override // androidx.compose.ui.Modifier
    public final boolean ABA(InterfaceC16660sJ interfaceC16660sJ) {
        if (this.A01.ABA(interfaceC16660sJ) && this.A00.ABA(interfaceC16660sJ)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.Modifier
    public final Object AWJ(Object obj, InterfaceC16620sF interfaceC16620sF) {
        return this.A00.AWJ(this.A01.AWJ(obj, interfaceC16620sF), interfaceC16620sF);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1130258o) {
            C1130258o c1130258o = (C1130258o) obj;
            if (C14360o3.A0K(this.A01, c1130258o.A01) && C14360o3.A0K(this.A00, c1130258o.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode() + (this.A00.hashCode() * 31);
    }

    public final String toString() {
        return AnonymousClass001.A0E((String) AWJ("", X69.A00), '[', ']');
    }

    public C1130258o(Modifier modifier, Modifier modifier2) {
        this.A01 = modifier;
        this.A00 = modifier2;
    }
}
