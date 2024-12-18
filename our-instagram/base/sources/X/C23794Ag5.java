package X;

/* renamed from: X.Ag5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23794Ag5 implements C8HF {
    public final /* synthetic */ C1828789i A00;

    @Override // X.C8HF
    public final void Dq8(C183978Ee c183978Ee) {
        InterfaceC189798ay A00;
        C14360o3.A0B(c183978Ee, 0);
        C1828789i c1828789i = this.A00;
        C22P c22p = c1828789i.A06;
        C81J c81j = c1828789i.A0B;
        C9O2.A01(c81j, c183978Ee, C9O2.A00(c22p, c81j, c1828789i.A04));
        C8GE c8ge = c1828789i.A03;
        if (c8ge != null && (A00 = c8ge.A00()) != null) {
            A00.Cns(c183978Ee);
        }
        C188598Wy c188598Wy = c1828789i.A01;
        if (c188598Wy != null) {
            c188598Wy.A03(c183978Ee, false);
        } else {
            C14360o3.A0F("capturedMediaProcessor");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C8HF
    public final void onFailure(Exception exc) {
        C14360o3.A0B(exc, 0);
        C1828789i c1828789i = this.A00;
        AbstractC12120kG.A07(c1828789i.A07.getModuleName(), AnonymousClass001.A0R("Error importing photo: ", exc.getLocalizedMessage()), null);
        C1828789i.A00(c1828789i);
    }

    public C23794Ag5(C1828789i c1828789i) {
        this.A00 = c1828789i;
    }
}
