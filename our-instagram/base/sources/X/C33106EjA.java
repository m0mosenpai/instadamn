package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;

/* renamed from: X.EjA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33106EjA extends AbstractC32533EUj {
    public AbstractC59962oe A00;
    public AbstractC12990ll A01;

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 884526452);
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            AbstractC35254Fgn.A02(activity, abstractC115105If);
        }
        C0f9.A0A(-1117349838, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1404332675);
        EDC edc = (EDC) obj;
        int A0N = AbstractC167017dG.A0N(edc, 325514432);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("get_challenge", "true");
        A1G.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, edc.A04);
        A1G.put("nonce_code", edc.A03);
        A1G.put("cni", edc.A02);
        A1G.put("challenge_context", edc.A01);
        AbstractC59962oe abstractC59962oe = this.A00;
        AbstractC192798gL A05 = C192108fB.A05(this.A01, edc.A00, A1G);
        C32392EOt.A00(A05, this, 27);
        abstractC59962oe.schedule(A05);
        C0f9.A0A(1338927497, A0N);
        C0f9.A0A(1454565288, A03);
    }
}
