package X;

/* renamed from: X.GRv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C37004GRv implements InterfaceC14180ni {
    public final /* synthetic */ C7XE A00;

    public C37004GRv(C7XE c7xe) {
        this.A00 = c7xe;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C37004GRv) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(0, this.A00, C7XE.class, "sendBirthdayInstantReply", "sendBirthdayInstantReply()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
