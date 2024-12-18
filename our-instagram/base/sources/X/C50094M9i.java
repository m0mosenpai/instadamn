package X;

/* renamed from: X.M9i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50094M9i implements BD7 {
    public final /* synthetic */ C1UM A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;

    @Override // X.BD7
    public final void onFailure() {
    }

    public C50094M9i(C1UM c1um, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE) {
        this.A00 = c1um;
        this.A01 = c6fq;
        this.A02 = interfaceC103384lE;
    }

    @Override // X.BD7
    public final void onSuccess() {
        String string = this.A00.getString("sso_settings_v2", null);
        if (string != null) {
            C11T.A02(new M50(this.A01, this.A02, string));
        }
    }
}
