package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.GfT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37511GfT implements BDQ {
    public final Fragment A00;
    public final C38R A01;
    public final C37502GfK A02;

    @Override // X.BDQ
    public final String CD8(C38321qM c38321qM) {
        int i;
        C37502GfK c37502GfK = this.A02;
        Context requireContext = this.A00.requireContext();
        AbstractC40988IDj A00 = ((ILT) c37502GfK.A05.getValue()).A00(c38321qM);
        if (A00 instanceof C39427HbB) {
            i = 2131976228;
        } else if (A00 instanceof C39426HbA) {
            i = 2131976227;
        } else if (A00 instanceof C39425Hb9) {
            i = 2131976848;
        } else if (A00 instanceof C39424Hb8) {
            i = 2131976226;
        } else if (A00 instanceof C39423Hb7) {
            i = 2131972137;
        } else {
            i = 2131976223;
        }
        return AbstractC166997dE.A0p(requireContext, i);
    }

    @Override // X.BDQ
    public final void Dwx(C38321qM c38321qM, C75113Zb c75113Zb) {
        C39415Haz A00;
        C39415Haz A002;
        C39415Haz A003;
        AbstractC40988IDj A004 = ((ILT) this.A02.A05.getValue()).A00(c38321qM);
        if (A004 instanceof C39427HbB) {
            AbstractC167017dG.A1N(c38321qM, c75113Zb);
            C37502GfK c37502GfK = A004.A00;
            UpcomingEvent A2B = c38321qM.A2B(c37502GfK.A01);
            if (A2B != null && (A003 = ((IN2) c37502GfK.A06.getValue()).A00(A2B)) != null) {
                A003.A00.A01(c38321qM);
                return;
            }
            return;
        }
        if (A004 instanceof C39426HbA) {
            boolean A1a = AbstractC167017dG.A1a(c38321qM, c75113Zb);
            C37502GfK c37502GfK2 = A004.A00;
            UpcomingEvent A2B2 = c38321qM.A2B(c37502GfK2.A01);
            if (A2B2 == null) {
                return;
            }
            c75113Zb.A1t = A1a;
            C75113Zb.A00(c75113Zb, 26);
            C39415Haz A005 = ((IN2) c37502GfK2.A06.getValue()).A00(A2B2);
            if (A005 == null) {
                return;
            }
            A005.A00.A03(c38321qM, new C43044J1k(c38321qM, c75113Zb, c37502GfK2));
            return;
        }
        if (A004 instanceof C39425Hb9) {
            AbstractC167017dG.A1N(c38321qM, c75113Zb);
            A004.A00.A02(c38321qM, c75113Zb);
            return;
        }
        if (A004 instanceof C39424Hb8) {
            AbstractC167017dG.A1N(c38321qM, c75113Zb);
            C37502GfK c37502GfK3 = A004.A00;
            UpcomingEvent A2B3 = c38321qM.A2B(c37502GfK3.A01);
            if (A2B3 == null || (A002 = ((IN2) c37502GfK3.A06.getValue()).A00(A2B3)) == null) {
                return;
            }
            A002.A00.A02(c38321qM);
            return;
        }
        boolean z = A004 instanceof C39423Hb7;
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        if (z) {
            A004.A00.A03(c38321qM, c75113Zb, "cta_bar_set_live_shopping_reminder");
            return;
        }
        C37502GfK c37502GfK4 = A004.A00;
        UpcomingEvent A2B4 = c38321qM.A2B(c37502GfK4.A01);
        if (A2B4 == null || (A00 = ((IN2) c37502GfK4.A06.getValue()).A00(A2B4)) == null) {
            return;
        }
        A00.A00(c38321qM);
    }

    @Override // X.BDQ
    public final void EDn(View view, C38321qM c38321qM) {
        this.A01.A00(view, c38321qM);
    }

    public C37511GfT(Fragment fragment, C38R c38r, C37502GfK c37502GfK) {
        AbstractC167017dG.A1R(c37502GfK, c38r);
        this.A00 = fragment;
        this.A02 = c37502GfK;
        this.A01 = c38r;
    }
}
