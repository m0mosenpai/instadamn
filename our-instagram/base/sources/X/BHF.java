package X;

/* loaded from: classes5.dex */
public final class BHF {
    public final AbstractC118405Xc A00;
    public final InterfaceC30898DiB A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHF) {
                BHF bhf = (BHF) obj;
                if (!C14360o3.A0K(this.A00, bhf.A00) || !C14360o3.A0K(this.A01, bhf.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public BHF(AbstractC118405Xc abstractC118405Xc, InterfaceC30898DiB interfaceC30898DiB) {
        this.A00 = abstractC118405Xc;
        this.A01 = interfaceC30898DiB;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VectorizedKeyframeSpecElementInfo(vectorValue=");
        A1C.append(this.A00);
        A1C.append(", easing=");
        A1C.append(this.A01);
        A1C.append(", arcMode=");
        A1C.append((Object) AnonymousClass001.A0I("ArcMode(value=", ')', 0));
        A1C.append(')');
        return A1C.toString();
    }
}
