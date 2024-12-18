package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.G7y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36500G7y implements GZA {
    public final /* synthetic */ C31305DpR A00;
    public final /* synthetic */ E2H A01;
    public final /* synthetic */ C32622EXw A02;
    public final /* synthetic */ String A03;

    public C36500G7y(C31305DpR c31305DpR, E2H e2h, C32622EXw c32622EXw, String str) {
        this.A01 = e2h;
        this.A00 = c31305DpR;
        this.A03 = str;
        this.A02 = c32622EXw;
    }

    @Override // X.GZA
    public final void onActionClicked() {
        User A02;
        E2H e2h = this.A01;
        C31305DpR c31305DpR = this.A00;
        String str = this.A03;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        e2h.A02.setVisibility(8);
        c31305DpR.A02(str);
        C34497FIj c34497FIj = this.A02.A00;
        JR2 jr2 = c34497FIj.A00;
        AbstractC59962oe abstractC59962oe = jr2.A1L;
        FragmentActivity activity = abstractC59962oe.getActivity();
        if (activity != null && (A02 = AnonymousClass189.A00(jr2.A0p()).A02(c34497FIj.A01)) != null) {
            C122145g6 c122145g6 = new C122145g6(AbstractC31177DnL.A0j(A02));
            C36881nl A01 = C36881nl.A01(activity, abstractC59962oe, jr2.A0p(), AbstractC111324zv.A00(4660));
            AbstractC33577Esp.A00 = true;
            A01.A0B = c122145g6;
            A01.A0s = true;
            A01.A06();
        }
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        E2H e2h = this.A01;
        C31305DpR c31305DpR = this.A00;
        String str = this.A03;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        e2h.A02.setVisibility(8);
        c31305DpR.A02(str);
    }
}
