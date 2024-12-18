package X;

import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;

/* renamed from: X.EjB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33107EjB extends AbstractC32533EUj {
    public AbstractC10360h2 A00;
    public IgFragmentActivity A01;
    public AbstractC12990ll A02;

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1523307642);
        AbstractC35254Fgn.A02(this.A01, abstractC115105If);
        C0f9.A0A(-33805730, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(364843757);
        EDB edb = (EDB) obj;
        int A0N = AbstractC167017dG.A0N(edb, -1923531883);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("get_challenge", "true");
        A1G.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, edb.A04);
        A1G.put("nonce_code", edb.A03);
        A1G.put("cni", edb.A02);
        A1G.put("challenge_context", edb.A01);
        IgFragmentActivity igFragmentActivity = this.A01;
        AbstractC192798gL A05 = C192108fB.A05(this.A02, edb.A00, A1G);
        C32392EOt.A00(A05, this, 25);
        igFragmentActivity.schedule(A05);
        C0f9.A0A(-1927168070, A0N);
        C0f9.A0A(1032321216, A03);
    }
}
