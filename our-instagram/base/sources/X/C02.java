package X;

/* loaded from: classes5.dex */
public final class C02 extends C33H {
    public final /* synthetic */ C25814BbV A00;
    public final /* synthetic */ C38321qM A01;

    public C02(C25814BbV c25814BbV, C38321qM c38321qM) {
        this.A01 = c38321qM;
        this.A00 = c25814BbV;
    }

    @Override // X.C33H, X.C33I
    public final void Dto(C5SW c5sw) {
        C25814BbV c25814BbV = this.A00;
        c25814BbV.A03 = false;
        C166047bW c166047bW = (C166047bW) c25814BbV.A0B.A03.getValue();
        if (c166047bW != null) {
            C166007bS c166007bS = c25814BbV.A0C;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c166007bS.A01, "instagram_clips_privacy_sheet_exit");
            A0f.A8R(BQL.A1W, "action");
            AbstractC25225BEi.A1M(EnumC120795dP.A0F, A0f);
            AbstractC25229BEm.A1A(A0f, c166007bS.A03);
            A0f.AAP("media_compound_key", c166047bW.A0I);
            A0f.A9K("media_index", AbstractC167007dF.A0d());
            AbstractC25225BEi.A1P(A0f, c166007bS.A04.getSessionId());
            A0f.AAP(MSV.A00(125), null);
            A0f.AAP("mezql_token", c166047bW.A0J);
            AbstractC25229BEm.A1B(A0f, c166047bW.A0L);
        }
    }

    @Override // X.C33H, X.C33I
    public final void Dtt(C5SW c5sw) {
        C23031Ai A00;
        boolean z;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        C38321qM c38321qM = this.A01;
        if (c38321qM.A5P()) {
            A00 = AbstractC23021Ah.A00(this.A00.A0E);
            z = true;
            interfaceC16530ry = A00.A7O;
            c0yrArr = C23031Ai.A8c;
            i = 276;
        } else {
            if (!c38321qM.A5c()) {
                return;
            }
            A00 = AbstractC23021Ah.A00(this.A00.A0E);
            z = true;
            interfaceC16530ry = A00.A7U;
            c0yrArr = C23031Ai.A8c;
            i = 280;
        }
        AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, i, z);
    }
}
