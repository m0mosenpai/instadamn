package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FQZ {
    public String A00;
    public boolean A01;
    public final Context A02;
    public final UserSession A03;
    public final FMW A04;
    public final C34482FHu A05;
    public final FQO A06;
    public final C34946FaW A07;
    public final EJX A08;

    public FQZ(Context context, FragmentActivity fragmentActivity, UserSession userSession, EJX ejx) {
        C14360o3.A0B(userSession, 3);
        FQO fqo = new FQO(context, fragmentActivity, userSession, new FPU(context));
        C36289Fzj c36289Fzj = (C36289Fzj) C31651DvH.A00(userSession, C36289Fzj.class, 26);
        C34946FaW c34946FaW = (C34946FaW) c36289Fzj.A00.get();
        if (c34946FaW == null) {
            c34946FaW = new C34946FaW();
            c36289Fzj.A00 = AbstractC25225BEi.A16(c34946FaW);
        }
        C14360o3.A07(c34946FaW);
        FMW fmw = new FMW();
        this.A02 = context;
        this.A03 = userSession;
        this.A08 = ejx;
        this.A06 = fqo;
        this.A07 = c34946FaW;
        this.A04 = fmw;
        this.A05 = new C34482FHu(this);
        fqo.A00 = ViewOnClickListenerC35682FpH.A00(this, 36);
    }

    public final void A00() {
        FMW fmw = this.A04;
        if (!fmw.A02 && fmw.A01) {
            fmw.A03 = false;
            fmw.A00 = null;
            fmw.A02 = true;
            fmw.A00 = null;
            UserSession userSession = this.A03;
            String str = this.A00;
            C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
            A0M.A0B("users/blocked_list/");
            A0M.A0R(C32201ECw.class, FYA.class);
            if (str != null && str.length() != 0) {
                A0M.A9s("max_id", str);
            }
            C1ON A0N = A0M.A0N();
            A0N.A00 = new C32512ETn(this);
            C1GJ.A03(A0N);
            this.A08.A00(this.A06.A00(fmw, AbstractC31173DnH.A0L(this.A07.A00)));
        }
        UserSession userSession2 = this.A03;
        if (C461529z.A0B(userSession2)) {
            C25621Ms A0M2 = AbstractC31177DnL.A0M(userSession2);
            A0M2.A0B("supervision/guardians/");
            C1ON A0e = AbstractC25227BEk.A0e(A0M2, EAG.class, FSQ.class);
            A0e.A00 = new ESS(this);
            C1GJ.A03(A0e);
        }
    }
}
