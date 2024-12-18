package X;

/* renamed from: X.Ac2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23548Ac2 implements C2JL {
    public final /* synthetic */ C1346766r A00;
    public final /* synthetic */ C133225zo A01;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        C133225zo c133225zo = this.A01;
        C6AI c6ai = c133225zo.A05;
        c6ai.A01 = 6;
        c6ai.A0D.accept(6);
        C0w9.A07(AbstractC111324zv.A00(3739), th);
        C1346766r c1346766r = this.A00;
        c1346766r.A02(C201808wA.A00);
        c1346766r.A00();
        c133225zo.A03.A01();
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean A1Z = AbstractC166997dE.A1Z(obj, true);
        C133225zo c133225zo = this.A01;
        C6AI c6ai = c133225zo.A05;
        int i = 6;
        if (A1Z) {
            i = 5;
        }
        c6ai.A01 = i;
        c6ai.A0D.accept(Integer.valueOf(i));
        C1346766r c1346766r = this.A00;
        c1346766r.A02(C201808wA.A00);
        c1346766r.A00();
        c133225zo.A03.A01();
    }

    public C23548Ac2(C1346766r c1346766r, C133225zo c133225zo) {
        this.A01 = c133225zo;
        this.A00 = c1346766r;
    }
}
