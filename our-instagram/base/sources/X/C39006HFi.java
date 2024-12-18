package X;

/* renamed from: X.HFi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39006HFi extends C1P1 {
    public final /* synthetic */ C38J A00;

    public C39006HFi(C38J c38j) {
        this.A00 = c38j;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1082900404);
        HA0 ha0 = (HA0) obj;
        int A0N = AbstractC167017dG.A0N(ha0, -2008133732);
        C38J c38j = this.A00;
        C38321qM A02 = C1DW.A00(C38J.A01(c38j)).A02(c38j.A0A);
        if (A02 != null) {
            C41005IEa c41005IEa = ha0.A00;
            C14360o3.A07(c41005IEa);
            A02.A4A(c41005IEa);
            C38977HEf c38977HEf = c38j.A09;
            if (c38977HEf == null) {
                AbstractC31171DnF.A0t();
                throw C00O.createAndThrow();
            }
            c38977HEf.notifyDataSetChanged();
            C0f9.A0A(60396838, A0N);
            C0f9.A0A(-508983954, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(582780031, A0N);
        throw A0g;
    }
}
