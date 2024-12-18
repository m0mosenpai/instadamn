package X;

/* renamed from: X.6DM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DM implements InterfaceC16820sZ {
    public final C85313rM A00;

    public final boolean equals(Object obj) {
        C85313rM c85313rM = this.A00;
        if (!(obj instanceof C6DM) || !C14360o3.A0K(c85313rM, ((C6DM) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        C85313rM c85313rM = this.A00;
        C2XV.A00();
        return ((InterfaceC16820sZ) c85313rM.A00).invoke();
    }

    public final String toString() {
        C85313rM c85313rM = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("MemoizedCallback0(callbackHolder=");
        sb.append(c85313rM);
        sb.append(')');
        return sb.toString();
    }
}
