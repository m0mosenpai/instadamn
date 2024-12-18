package X;

import android.content.Context;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VuG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69721VuG {
    public Q1y A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    public C69721VuG(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        if (context != null) {
            VTA A09 = C2FP.A09();
            C14360o3.A0A(A09);
            this.A00 = new Q1y(context, A09);
        }
        this.A01 = userSession;
        this.A09 = AbstractC09440dt.A01(new C37053GUj(this, 17));
        this.A04 = AbstractC09440dt.A01(new C37053GUj(this, 12));
        this.A07 = AbstractC09440dt.A01(new C37053GUj(this, 15));
        this.A08 = AbstractC09440dt.A01(new C37053GUj(this, 16));
        this.A03 = AbstractC09440dt.A01(new C37053GUj(this, 11));
        this.A02 = AbstractC09440dt.A01(new C37053GUj(this, 10));
        this.A06 = AbstractC09440dt.A01(new C37053GUj(this, 14));
        this.A05 = AbstractC09440dt.A01(new C37053GUj(this, 13));
    }

    public final List A00() {
        String string = ((InterfaceC19630xq) this.A09.getValue()).getString("proactive_checkout_session_list", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            return (List) new Gson().A09(string, new C67785UyB().type);
        }
        return arrayList;
    }

    public final void A01(C69549VrD c69549VrD, long j) {
        List<C69549VrD> A00 = A00();
        AnonymousClass016.A1A(A00, new DHN(j, this, 5));
        A00.add(c69549VrD);
        InterfaceC09390do interfaceC09390do = this.A09;
        InterfaceC19610xo ARD = ((InterfaceC19630xq) interfaceC09390do.getValue()).ARD();
        String A0B = new Gson().A0B(A00);
        C14360o3.A07(A0B);
        ARD.E7K("proactive_checkout_session_list", A0B);
        ARD.apply();
        Integer num = c69549VrD.A01;
        if (num == null) {
            int i = 0;
            for (C69549VrD c69549VrD2 : A00) {
                long j2 = j - c69549VrD2.A00;
                if (c69549VrD2.A01 == null && j2 < ((Number) AbstractC166987dD.A17(this.A08)).longValue()) {
                    i++;
                }
                if (!((InterfaceC19630xq) interfaceC09390do.getValue()).getBoolean("proactive_checkout_should_stop_showing_banner", false) && i >= AbstractC167027dH.A01(this.A07)) {
                    AbstractC31177DnL.A1N((InterfaceC19630xq) interfaceC09390do.getValue(), "proactive_checkout_should_stop_showing_banner", true);
                }
            }
            return;
        }
        Integer num2 = C05F.A00;
        if (num == num2) {
            boolean z = false;
            int i2 = 0;
            int i3 = 0;
            for (C69549VrD c69549VrD3 : A00) {
                long j3 = j - c69549VrD3.A00;
                if (c69549VrD3.A01 == num2) {
                    if (j3 < ((Number) AbstractC166987dD.A17(this.A03)).longValue()) {
                        i2++;
                    }
                    if (j3 < ((Number) AbstractC166987dD.A17(this.A06)).longValue()) {
                        i3++;
                    }
                }
            }
            boolean A1Z = AbstractC43593JPy.A1Z(i2, AbstractC167027dH.A01(this.A02));
            if (i3 >= AbstractC167027dH.A01(this.A05)) {
                z = true;
            }
            if (A1Z || z) {
                InterfaceC19610xo ARD2 = ((InterfaceC19630xq) interfaceC09390do.getValue()).ARD();
                ARD2.E7G("proactive_checkout_cooldown_start_time_ms", j);
                ARD2.apply();
            }
        }
    }
}
