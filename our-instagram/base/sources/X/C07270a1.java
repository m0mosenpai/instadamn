package X;

/* renamed from: X.0a1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07270a1 extends AbstractC18680vv {
    public final C18720vz A00;
    public volatile boolean A01;

    public C07270a1(C18720vz c18720vz) {
        C14360o3.A0B(c18720vz, 1);
        this.A00 = c18720vz;
    }

    @Override // X.AbstractC12990ll
    public final String getToken() {
        return "IgSessionManager.LOGGED_OUT_TOKEN";
    }

    @Override // X.AbstractC12990ll
    public final C18720vz getDeviceSession() {
        return this.A00;
    }

    @Override // X.AbstractC12990ll
    public final boolean hasEnded() {
        return this.A01;
    }

    public final void A06() {
        for (Object obj : A02()) {
            if (obj instanceof InterfaceC13000lm) {
                ((InterfaceC13000lm) obj).onSessionWillEnd();
            }
        }
        this.A01 = true;
    }
}
