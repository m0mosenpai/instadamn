package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class GQN implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C07270a1 A01;
    public final /* synthetic */ EDH A02;
    public final /* synthetic */ boolean A03;

    public GQN(FragmentActivity fragmentActivity, C07270a1 c07270a1, EDH edh, boolean z) {
        this.A02 = edh;
        this.A03 = z;
        this.A00 = fragmentActivity;
        this.A01 = c07270a1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, this.A02.A07);
        boolean z = this.A03;
        if (z) {
            A1G.put("present_as_modal", String.valueOf(z));
            C66277U6x A01 = C66277U6x.A01("com.instagram.account_security.contact_form", A1G);
            FragmentActivity fragmentActivity = this.A00;
            C07270a1 c07270a1 = this.A01;
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(c07270a1);
            A0C.A0k = false;
            A0C.A0P = C05F.A01;
            C72743Nv A03 = A01.A03(fragmentActivity, A0C);
            C140966Yy A0B = AbstractC31180DnO.A0B(fragmentActivity, c07270a1);
            C14360o3.A0A(A03);
            A0B.A0D(A03);
            A0B.A04();
            return;
        }
        C66277U6x A012 = C66277U6x.A01("com.instagram.account_security.contact_form", A1G);
        FragmentActivity fragmentActivity2 = this.A00;
        IgBloksScreenConfig A0C2 = AbstractC31171DnF.A0C(this.A01);
        A0C2.A0k = false;
        AbstractC31173DnH.A14(fragmentActivity2, A0C2, A012);
    }
}
