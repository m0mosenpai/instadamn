package X;

/* renamed from: X.9IQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9IQ implements InterfaceC16610sE {
    public final C85313rM A00;

    public final boolean equals(Object obj) {
        C85313rM c85313rM = this.A00;
        if (!(obj instanceof C9IQ) || !C14360o3.A0K(c85313rM, ((C9IQ) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC16610sE
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C85313rM c85313rM = this.A00;
        C2XV.A00();
        return ((InterfaceC16610sE) c85313rM.A00).invoke(obj, obj2, obj3);
    }

    public final String toString() {
        C85313rM c85313rM = this.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MemoizedCallback3(callbackHolder=");
        return AbstractC167017dG.A0o(c85313rM, A1C);
    }

    public /* synthetic */ C9IQ(C85313rM c85313rM) {
        this.A00 = c85313rM;
    }
}
