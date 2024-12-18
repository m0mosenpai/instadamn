package X;

/* renamed from: X.Sxi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64011Sxi implements InterfaceC48192Ji {
    public final /* synthetic */ SF0 A00;

    public C64011Sxi(SF0 sf0) {
        this.A00 = sf0;
    }

    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        ?? r5;
        C2JS A0k;
        C2JS optionalTreeField;
        SF0 sf0 = this.A00;
        if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null && (optionalTreeField = A0k.getOptionalTreeField(0, "fx_pf_feta_info", C59862Qpy.class, 1872334164)) != null) {
            r5 = optionalTreeField.getCoercedBooleanField(0, "is_user_upgraded_to_feta");
        } else {
            r5 = 0;
        }
        AnonymousClass253 anonymousClass253 = sf0.A00;
        anonymousClass253.A01 = r5;
        anonymousClass253.A00 = System.currentTimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        A00.ATO(new RcS(anonymousClass253, r5, currentTimeMillis));
        InterfaceC196048lu interfaceC196048lu = sf0.A01;
        if (interfaceC196048lu != null) {
            interfaceC196048lu.onSuccess();
        }
    }
}
