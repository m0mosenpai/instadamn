package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.EjD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33109EjD extends AbstractC32533EUj {
    public final AbstractC59962oe A00;
    public final C07270a1 A01;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-468544590);
        int A032 = C0f9.A03(-216817479);
        AbstractC59962oe abstractC59962oe = this.A00;
        Context requireContext = abstractC59962oe.requireContext();
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        C07270a1 c07270a1 = this.A01;
        F8Z.A00(requireContext, abstractC59962oe, requireActivity, AbstractC31172DnG.A0N(abstractC59962oe, c07270a1), c07270a1, (EDH) obj, false);
        C0f9.A0A(-399613532, A032);
        C0f9.A0A(664811941, A03);
    }

    public C33109EjD(AbstractC59962oe abstractC59962oe, C07270a1 c07270a1) {
        super(abstractC59962oe.getParentFragmentManager());
        this.A01 = c07270a1;
        this.A00 = abstractC59962oe;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-36817067);
        AbstractC31171DnF.A0z(2131972429);
        C0f9.A0A(1521090429, A03);
    }
}
