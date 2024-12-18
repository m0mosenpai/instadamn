package X;

/* renamed from: X.Pk7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57780Pk7 extends AnonymousClass137 implements InterfaceC214312v {
    public final String A00;
    public final Throwable A01;

    private final void A00() {
        String str;
        Throwable th = this.A01;
        if (th != null) {
            String str2 = this.A00;
            if (str2 == null || (str = AnonymousClass001.A0R(". ", str2)) == null) {
                str = "";
            }
            throw new IllegalStateException(AnonymousClass001.A0R("Module with the Main dispatcher had failed to initialize", str), th);
        }
        throw AbstractC166987dD.A14("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    @Override // X.AnonymousClass137
    public final AnonymousClass137 A06() {
        return this;
    }

    @Override // X.C12T
    public final String toString() {
        String str;
        Throwable th = this.A01;
        if (th != null) {
            str = AbstractC167017dG.A0n(th, ", cause=", AbstractC166987dD.A1C());
        } else {
            str = "";
        }
        return AnonymousClass001.A0S("Dispatchers.Main[missing", str, ']');
    }

    public C57780Pk7(Throwable th, String str) {
        this.A01 = th;
        this.A00 = str;
    }

    @Override // X.C12T
    public final boolean A02(C12W c12w) {
        A00();
        throw C00O.createAndThrow();
    }

    @Override // X.AnonymousClass137, X.C12T
    public final C12T A03(int i) {
        A00();
        throw C00O.createAndThrow();
    }

    @Override // X.C12T
    public final /* bridge */ /* synthetic */ void A05(Runnable runnable, C12W c12w) {
        A00();
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC214312v
    public final C19D CPF(Runnable runnable, C12W c12w, long j) {
        A00();
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC214312v
    public final /* bridge */ /* synthetic */ void EM7(InterfaceC24901Jp interfaceC24901Jp, long j) {
        A00();
        throw C00O.createAndThrow();
    }
}
