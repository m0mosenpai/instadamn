package X;

/* renamed from: X.5ag, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119245ag implements C59D {
    public final InterfaceC119205ac A00;
    public final C59V A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C119245ag) {
                C119245ag c119245ag = (C119245ag) obj;
                if (!C14360o3.A0K(this.A00, c119245ag.A00) || !C14360o3.A0K(this.A01, c119245ag.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaceableResult(result=");
        sb.append(this.A00);
        sb.append(", placeable=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    @Override // X.C59D
    public final boolean CfU() {
        InterfaceC1131459c interfaceC1131459c;
        C59V c59v = this.A01;
        if (c59v instanceof C59U) {
            interfaceC1131459c = (C59U) c59v;
        } else {
            interfaceC1131459c = ((AbstractC137606Lg) c59v).A03;
        }
        return interfaceC1131459c.CQ7();
    }

    public C119245ag(InterfaceC119205ac interfaceC119205ac, C59V c59v) {
        this.A00 = interfaceC119205ac;
        this.A01 = c59v;
    }
}
