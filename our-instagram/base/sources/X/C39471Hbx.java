package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Hbx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39471Hbx extends HG7 {
    public final FragmentActivity A00;
    public final C6WQ A01;

    public final void A01(H9U h9u) {
        FragmentActivity fragmentActivity;
        Context context;
        int i;
        String str;
        if (this instanceof C39470Hbw) {
            C39470Hbw c39470Hbw = (C39470Hbw) this;
            if (h9u != null) {
                C38622GyP c38622GyP = h9u.A00;
                if (c38622GyP == null) {
                    AbstractC31171DnF.A0w();
                    throw C00O.createAndThrow();
                }
                boolean A1P = AbstractC167007dF.A1P(c38622GyP.A01 ? 1 : 0, 1);
                HashMap hashMap = c38622GyP.A00;
                if (hashMap != null && AbstractC166997dE.A1Z(hashMap.get("FB"), true)) {
                    fragmentActivity = c39470Hbw.A00;
                } else if (A1P) {
                    context = c39470Hbw.A00.getBaseContext();
                    i = 2131955405;
                    str = "clips_deep_delete_failed_on_facebook";
                    C9GR.A0F(context, str, i);
                }
            }
            context = c39470Hbw.A00.getBaseContext();
            i = 2131955404;
            str = "clips_deep_delete_failed";
            C9GR.A0F(context, str, i);
        }
        fragmentActivity = this.A00;
        context = fragmentActivity.getBaseContext();
        i = 2131955412;
        str = "clips_delete_failed";
        C9GR.A0F(context, str, i);
    }

    public C39471Hbx(FragmentActivity fragmentActivity, C120985dq c120985dq, UserSession userSession, C37540Gfw c37540Gfw) {
        super(fragmentActivity, c120985dq, userSession, c37540Gfw);
        this.A00 = fragmentActivity;
        C6WQ A0i = AbstractC31174DnI.A0i(fragmentActivity);
        this.A01 = A0i;
        A0i.A00(fragmentActivity.getBaseContext().getString(2131957731));
    }

    @Override // X.HG7
    public final void A00(H9U h9u) {
        int A0N = AbstractC167017dG.A0N(h9u, 701829764);
        super.A00(h9u);
        C38622GyP c38622GyP = h9u.A00;
        if (c38622GyP == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        if (!c38622GyP.A01) {
            A01(h9u);
        }
        C0f9.A0A(-289764955, A0N);
    }

    @Override // X.HG7, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 523697489);
        super.onFail(abstractC115105If);
        A01((H9U) abstractC115105If.A00());
        C0f9.A0A(-1295177333, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-926840736);
        this.A01.dismiss();
        C0f9.A0A(1106881442, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-2009108654);
        C0fJ.A00(this.A01);
        C0f9.A0A(-645455520, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(829093084);
        A00((H9U) obj);
        C0f9.A0A(967990340, A03);
    }
}
