package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7SF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SF implements C7QD {
    public C5SW A00;
    public final Activity A01;
    public final UserSession A02;
    public final C57012jc A03;
    public final InterfaceC165567aj A04;

    public final void A00(K2W k2w) {
        C57012jc c57012jc = this.A03;
        c57012jc.A03(0);
        c57012jc.A01().setBackgroundColor(k2w.A00);
        C0fQ.A00(new ViewOnClickListenerC48036LOi(this, k2w), c57012jc.A01());
        C23031Ai A00 = AbstractC23021Ah.A00(this.A02);
        Activity activity = this.A01;
        InterfaceC16530ry interfaceC16530ry = A00.A2s;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (!((Boolean) interfaceC16530ry.CES(A00, c0yrArr[422])).booleanValue()) {
            C5SU c5su = new C5SU(activity, new C149686oL(2131973820));
            View A01 = c57012jc.A01();
            C14360o3.A07(A01);
            c5su.A03(A01);
            c5su.A02();
            c5su.A0A = true;
            c5su.A04 = new C33H() { // from class: X.9oL
                @Override // X.C33H, X.C33I
                public final boolean Dtk(C5SW c5sw) {
                    C14360o3.A0B(c5sw, 0);
                    c5sw.A08(false);
                    return true;
                }
            };
            C5SW A002 = c5su.A00();
            this.A00 = A002;
            c57012jc.A01().postDelayed(new RunnableC24450AsV(A002), 500L);
            interfaceC16530ry.Egi(A00, true, c0yrArr[422]);
        }
    }

    @Override // X.C7QD
    public final View BKF() {
        View view;
        C57012jc c57012jc = this.A03;
        if (c57012jc.A00 != null) {
            view = c57012jc.A01();
        } else {
            view = c57012jc.A01;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C7SF(Activity activity, UserSession userSession, C57012jc c57012jc, InterfaceC165567aj interfaceC165567aj) {
        this.A03 = c57012jc;
        this.A04 = interfaceC165567aj;
        this.A01 = activity;
        this.A02 = userSession;
    }
}
