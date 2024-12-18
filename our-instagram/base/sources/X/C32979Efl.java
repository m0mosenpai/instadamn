package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Efl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32979Efl extends ETE {
    public final /* synthetic */ ELA A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32979Efl(Fragment fragment, AbstractC12990ll abstractC12990ll, ELA ela, EnumC31713DwI enumC31713DwI) {
        super(fragment, abstractC12990ll, enumC31713DwI);
        this.A00 = ela;
    }

    @Override // X.ETE
    public final void A00(EDY edy) {
        int A03 = C0f9.A03(-1506729460);
        super.A00(edy);
        ELA.A02(this.A00, "whatsapp");
        C0f9.A0A(613027393, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(2138589656);
        AbstractC31176DnK.A0y(this.A00.requireActivity(), C56352iT.A0t);
        C0f9.A0A(666637891, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1259090238);
        AbstractC31176DnK.A0z(this.A00.requireActivity(), C56352iT.A0t);
        C0f9.A0A(1933758392, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(908037996);
        A00((EDY) obj);
        C0f9.A0A(1347875188, A03);
    }
}
