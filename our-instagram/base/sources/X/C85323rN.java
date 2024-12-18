package X;

/* renamed from: X.3rN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85323rN implements InterfaceC16660sJ {
    public final C85313rM A00;

    public final boolean equals(Object obj) {
        C85313rM c85313rM = this.A00;
        if (!(obj instanceof C85323rN) || !C14360o3.A0K(c85313rM, ((C85323rN) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        C85313rM c85313rM = this.A00;
        C2XV.A00();
        return ((InterfaceC16660sJ) c85313rM.A00).invoke(obj);
    }

    public final String toString() {
        C85313rM c85313rM = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("MemoizedCallback1(callbackHolder=");
        sb.append(c85313rM);
        sb.append(')');
        return sb.toString();
    }
}
