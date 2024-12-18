package X;

import android.content.Context;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;

/* renamed from: X.EjC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33108EjC extends AbstractC32533EUj {
    public Context A00;
    public AbstractC10360h2 A01;
    public IgFragmentActivity A02;
    public C07270a1 A03;

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(1049485818);
        EDF edf = (EDF) obj;
        int A032 = C0f9.A03(2020923037);
        HashMap A11 = AbstractC31174DnI.A11(edf, 0);
        A11.put("get_challenge", "true");
        A11.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, edf.A06);
        A11.put("nonce_code", edf.A04);
        A11.put("cni", edf.A02);
        A11.put("challenge_context", edf.A01);
        if (edf.A07) {
            L4O l4o = new L4O(this.A00);
            IgFragmentActivity igFragmentActivity = this.A02;
            C07270a1 c07270a1 = this.A03;
            AbstractC167007dF.A1D(igFragmentActivity, 0, c07270a1);
            C47989LJs.A01(c07270a1, "auto_conf_consent", AbstractC43591JPw.A00(844), "registration_flow", AbstractC43591JPw.A00(297));
            C1GJ.A03(new KKA(1, igFragmentActivity, edf, c07270a1, A11, l4o));
            i = 169687755;
        } else {
            IgFragmentActivity igFragmentActivity2 = this.A02;
            AbstractC192798gL A05 = C192108fB.A05(this.A03, edf.A00, A11);
            C32392EOt.A00(A05, this, 24);
            igFragmentActivity2.schedule(A05);
            i = 405518077;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-1976328683, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 695821162);
        AbstractC35254Fgn.A02(this.A02, abstractC115105If);
        C0f9.A0A(-1726134518, A0N);
    }
}
