package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Efc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32971Efc extends C32547EUx {
    public final /* synthetic */ InterfaceC37104GWp A00;
    public final /* synthetic */ C6WQ A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32971Efc(android.net.Uri uri, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, InterfaceC37104GWp interfaceC37104GWp, C6WQ c6wq, EnumC31713DwI enumC31713DwI, Integer num) {
        super(fragmentActivity, uri, abstractC59962oe, c07270a1, interfaceC37227Gac, enumC31713DwI, num, null);
        this.A00 = interfaceC37104GWp;
        this.A01 = c6wq;
    }

    @Override // X.C32547EUx, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 803812461);
        super.onFail(abstractC115105If);
        this.A01.dismiss();
        C0f9.A0A(1163794966, A0N);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1459597044);
        super.onStart();
        C0fJ.A00(this.A01);
        C0f9.A0A(-1693348537, A03);
    }
}
