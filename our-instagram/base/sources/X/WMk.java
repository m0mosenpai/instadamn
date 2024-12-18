package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WMk implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ UJV A02;
    public final /* synthetic */ C123545iT A03;
    public final /* synthetic */ C54O A04;
    public final /* synthetic */ C47K A05;

    public WMk(UJV ujv, C123545iT c123545iT, C54O c54o, C47K c47k, int i, long j) {
        this.A02 = ujv;
        this.A03 = c123545iT;
        this.A04 = c54o;
        this.A00 = i;
        this.A05 = c47k;
        this.A01 = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j;
        String A01;
        InterfaceC19630xq interfaceC19630xq;
        String str;
        int A05 = C0f9.A05(-1243132049);
        UJV ujv = this.A02;
        int bindingAdapterPosition = ujv.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            C123545iT c123545iT = this.A03;
            C123545iT.A01(c123545iT, bindingAdapterPosition);
            C54O c54o = this.A04;
            int i = this.A00;
            int ordinal = c54o.C3q().ordinal();
            if (ordinal != 6) {
                if (ordinal == 2) {
                    C147036jf c147036jf = c123545iT.A01;
                    if (c147036jf == null) {
                        c147036jf = new C147036jf(c123545iT.A0B, c123545iT.A0C);
                        c123545iT.A01 = c147036jf;
                    }
                    c147036jf.A03(Integer.valueOf(i), C123545iT.A00(c123545iT), false);
                }
            } else {
                C69225Vjt c69225Vjt = c123545iT.A02;
                if (c69225Vjt == null) {
                    c69225Vjt = new C69225Vjt(c123545iT.A0B, c123545iT.A0C);
                    c123545iT.A02 = c69225Vjt;
                }
                String A00 = C123545iT.A00(c123545iT);
                Integer valueOf = Integer.valueOf(i);
                C18920wW c18920wW = c69225Vjt.A00;
                InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "discover_people_upsell_dismissed");
                A002.AAP("module", c69225Vjt.A01);
                A002.AAP(AbstractC111324zv.A00(1367), A00);
                A002.A8p("position", valueOf);
                A002.Cht();
            }
            if (c54o.C3q() == C47R.A04 && c123545iT.A07) {
                C23031Ai A003 = AbstractC23021Ah.A00(c123545iT.A0C);
                C1XV B5n = this.A05.B5n();
                j = this.A01;
                A01 = C23031Ai.A01(B5n);
                if (A01 != null) {
                    String A0R = AnonymousClass001.A0R("num_times_dismissed_ci_upsell_feed_", A01);
                    interfaceC19630xq = A003.A01;
                    AbstractC167017dG.A0g(interfaceC19630xq, A0R).apply();
                    str = "last_time_dismissed_ci_upsell_feed_";
                    String A0R2 = AnonymousClass001.A0R(str, A01);
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    ARD.E7G(A0R2, j);
                    ARD.apply();
                }
            } else if (c54o.C3q() == C47R.A08 && c123545iT.A06) {
                UserSession userSession = c123545iT.A0C;
                AbstractC35249Fgi.A04(EnumC33510Erj.FEED_SUGGESTED_USERS, userSession, C54P.A01(AbstractC166997dE.A0L(ujv.A00), userSession));
                C23031Ai A004 = AbstractC23021Ah.A00(userSession);
                C1XV B5n2 = this.A05.B5n();
                j = this.A01;
                A01 = C23031Ai.A01(B5n2);
                if (A01 != null) {
                    String A0R3 = AnonymousClass001.A0R("num_times_dismissed_invite_upsell_feed", A01);
                    interfaceC19630xq = A004.A01;
                    AbstractC167017dG.A0g(interfaceC19630xq, A0R3).apply();
                    str = "last_time_dismissed_invite_upsell_feed";
                    String A0R22 = AnonymousClass001.A0R(str, A01);
                    InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                    ARD2.E7G(A0R22, j);
                    ARD2.apply();
                }
            }
        }
        C0f9.A0C(207259257, A05);
    }
}
