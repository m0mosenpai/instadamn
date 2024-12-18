package X;

/* renamed from: X.LuI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49505LuI implements C33I {
    public final /* synthetic */ C149176nR A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    @Override // X.C33I
    public final void Dtt(C5SW c5sw) {
    }

    public C49505LuI(C149176nR c149176nR, String str, String str2, String str3, String str4) {
        this.A00 = c149176nR;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }

    @Override // X.C33I
    public final boolean Dtk(C5SW c5sw) {
        C149176nR c149176nR = this.A00;
        InterfaceC145146gZ interfaceC145146gZ = c149176nR.A01;
        if (interfaceC145146gZ != null) {
            interfaceC145146gZ.Cwv();
        }
        c149176nR.A01(this.A01, this.A02, this.A03, this.A04);
        return true;
    }

    @Override // X.C33I
    public final void Dto(C5SW c5sw) {
        C149176nR c149176nR = this.A00;
        c149176nR.A00 = null;
        InterfaceC145146gZ interfaceC145146gZ = c149176nR.A01;
        if (interfaceC145146gZ != null) {
            interfaceC145146gZ.Dtn();
        }
    }

    @Override // X.C33I
    public final void Dtq(C5SW c5sw) {
        InterfaceC145146gZ interfaceC145146gZ = this.A00.A01;
        if (interfaceC145146gZ != null) {
            interfaceC145146gZ.Dm4();
        }
    }
}
