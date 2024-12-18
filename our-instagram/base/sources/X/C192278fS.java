package X;

import java.util.List;

/* renamed from: X.8fS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192278fS implements InterfaceC16500rv {
    public final InterfaceC16500rv A00;

    public C192278fS(InterfaceC16500rv interfaceC16500rv) {
        C14360o3.A0B(interfaceC16500rv, 1);
        this.A00 = interfaceC16500rv;
    }

    public final boolean equals(Object obj) {
        InterfaceC16500rv interfaceC16500rv;
        InterfaceC16430ro Anj;
        C192278fS c192278fS;
        if (obj == null) {
            return false;
        }
        InterfaceC16500rv interfaceC16500rv2 = this.A00;
        InterfaceC16500rv interfaceC16500rv3 = null;
        if ((obj instanceof C192278fS) && (c192278fS = (C192278fS) obj) != null) {
            interfaceC16500rv3 = c192278fS.A00;
        }
        if (!C14360o3.A0K(interfaceC16500rv2, interfaceC16500rv3)) {
            return false;
        }
        InterfaceC16430ro Anj2 = interfaceC16500rv2.Anj();
        if ((Anj2 instanceof InterfaceC16510rw) && (obj instanceof InterfaceC16500rv) && (interfaceC16500rv = (InterfaceC16500rv) obj) != null && (Anj = interfaceC16500rv.Anj()) != null && (Anj instanceof InterfaceC16510rw)) {
            return C14360o3.A0K(AbstractC53012bi.A00((InterfaceC16510rw) Anj2), AbstractC53012bi.A00((InterfaceC16510rw) Anj));
        }
        return false;
    }

    @Override // X.InterfaceC16500rv
    public final List Ace() {
        return this.A00.Ace();
    }

    @Override // X.InterfaceC16500rv
    public final InterfaceC16430ro Anj() {
        return this.A00.Anj();
    }

    @Override // X.InterfaceC16500rv
    public final boolean CY0() {
        return this.A00.CY0();
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KTypeWrapper: ");
        sb.append(this.A00);
        return sb.toString();
    }

    @Override // X.InterfaceC16340rf
    public final List getAnnotations() {
        throw C00O.createAndThrow();
    }
}
