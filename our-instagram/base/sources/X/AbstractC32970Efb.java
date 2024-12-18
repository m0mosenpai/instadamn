package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.Efb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32970Efb extends C32547EUx {
    public final C6WQ A00;

    public AbstractC32970Efb(Fragment fragment, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, EnumC31713DwI enumC31713DwI) {
        super(fragment.requireActivity(), null, interfaceC11380iw, c07270a1, interfaceC37227Gac, enumC31713DwI, C05F.A01, null);
        C6WQ A0T = AbstractC31180DnO.A0T(fragment);
        this.A00 = A0T;
        A0T.A00(fragment.getString(2131965724));
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-561326594);
        super.onFinish();
        this.A00.dismiss();
        C0f9.A0A(-1913343371, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-147299384);
        super.onStart();
        C0fJ.A00(this.A00);
        C0f9.A0A(-1919438038, A03);
    }
}
