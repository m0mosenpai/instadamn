package X;

/* renamed from: X.CyP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29449CyP implements InterfaceC43457JHv {
    public final /* synthetic */ C5E6 A00;

    @Override // X.InterfaceC43457JHv
    public final /* synthetic */ InterfaceC82443m8 B3o() {
        return null;
    }

    @Override // X.InterfaceC43457JHv
    public final /* synthetic */ InterfaceC82443m8 B3p() {
        return null;
    }

    @Override // X.InterfaceC43457JHv
    public final /* synthetic */ InterfaceC82443m8 BrL() {
        return null;
    }

    public C29449CyP(C5E6 c5e6) {
        this.A00 = c5e6;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3n() {
        Integer num;
        C5E6 c5e6 = this.A00;
        C82713mZ A00 = CG3.A00(c5e6.A00, c5e6.A01, (C18920wW) c5e6.A07.getValue(), c5e6.A03, c5e6.A04);
        if (A00 != null) {
            C28173CbK c28173CbK = (C28173CbK) c5e6.A06.getValue();
            String A0R = AnonymousClass001.A0R(AbstractC111324zv.A00(832), c5e6.A00.A00);
            C14360o3.A0B(A0R, 0);
            C62792tI c62792tI = c28173CbK.A01;
            if (!c62792tI.A00.A0F(A0R)) {
                c62792tI.A02(A0R);
                num = C05F.A00;
            } else if (c62792tI.A03(A0R, c28173CbK.A00)) {
                c62792tI.A02(A0R);
                num = C05F.A01;
            } else {
                num = C05F.A0C;
            }
            C14360o3.A0B(num, 0);
            A00.A2z = num;
            return new C82753md(A00);
        }
        return null;
    }
}
