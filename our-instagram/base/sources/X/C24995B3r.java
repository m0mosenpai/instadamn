package X;

/* renamed from: X.B3r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24995B3r implements InterfaceC16620sF {
    public final C85313rM A00;

    public final boolean equals(Object obj) {
        C85313rM c85313rM = this.A00;
        if (!(obj instanceof C24995B3r) || !C14360o3.A0K(c85313rM, ((C24995B3r) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(Object obj, Object obj2) {
        C85313rM c85313rM = this.A00;
        C2XV.A00();
        return ((InterfaceC16620sF) c85313rM.A00).invoke(obj, obj2);
    }

    public final String toString() {
        C85313rM c85313rM = this.A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MemoizedCallback2(callbackHolder=");
        return AbstractC167017dG.A0o(c85313rM, A1C);
    }

    public /* synthetic */ C24995B3r(C85313rM c85313rM) {
        this.A00 = c85313rM;
    }
}
