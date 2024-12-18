package X;

/* renamed from: X.3Qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C73253Qb implements InterfaceC19960yQ, InterfaceC14180ni {
    public final /* synthetic */ C3EQ A00;

    public C73253Qb(C3EQ c3eq) {
        this.A00 = c3eq;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC19960yQ) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C06840Yb(2, this.A00, C3EQ.class, "updateOngoingCallBar", "updateOngoingCallBar(Lcom/instagram/rtc/stack/OngoingCallState;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C3EQ.A00(this.A00, (C3ET) obj);
        return C0eB.A00;
    }
}
