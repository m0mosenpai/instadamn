package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* loaded from: classes9.dex */
public final class N9S extends C1P1 {
    public final /* synthetic */ C52252NAr A00;

    public N9S(C52252NAr c52252NAr) {
        this.A00 = c52252NAr;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-218306257);
        C52252NAr c52252NAr = this.A00;
        C11T.A03(new PLI(c52252NAr));
        FragmentActivity fragmentActivity = c52252NAr.A07;
        C9GR.A03(fragmentActivity, fragmentActivity.getResources().getString(2131976159), "CreateHighlight_unknown_error_occured", 0);
        C0f9.A0A(1586107197, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int intValue;
        int A03 = C0f9.A03(1302550103);
        int A032 = C0f9.A03(586728231);
        C52252NAr c52252NAr = this.A00;
        C11T.A03(new PLI(c52252NAr));
        UserSession userSession = c52252NAr.A0D;
        ReelStore A04 = C1OU.A04(userSession);
        C37771pE c37771pE = ((EBB) obj).A00;
        c37771pE.getClass();
        Reel A0I = A04.A0I(c37771pE, true);
        for (C41181vS c41181vS : A0I.A0O(userSession)) {
            if (c41181vS.A0e == EnumC41231vY.A09) {
                C38321qM c38321qM = c41181vS.A0b;
                c38321qM.getClass();
                c38321qM.A4N(A0I.getId());
            }
        }
        AbstractC25651Mw.A00(userSession).A05(new C3DH(A0I, true));
        Intent A042 = AbstractC31171DnF.A04();
        if (A0I.getId() != null) {
            A042.putExtra("story_highlight_id", A0I.getId());
        }
        if (A0I.A07() != null) {
            A042.putExtra("story_highlight_cover_image_url", A0I.A07());
        }
        C14360o3.A0B(userSession, 0);
        if (AnonymousClass502.A00(userSession) && C18U.A06(C06090Tz.A05, userSession, 36328925038722925L) && c52252NAr.A03) {
            Integer num = A0I.A0d;
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            AbstractC25651Mw.A00(userSession).A05(new C155106xz(A0I, Integer.valueOf(intValue).intValue(), true));
        }
        AbstractC31180DnO.A0y(c52252NAr.A07, A042);
        C0f9.A0A(2134073265, A032);
        C0f9.A0A(-705032361, A03);
    }
}
