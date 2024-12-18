package X;

import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.LfA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48633LfA implements InterfaceC58115Ppe {
    public boolean A00;
    public final /* synthetic */ C160137Fz A01;
    public final /* synthetic */ C15370ps A02;

    public C48633LfA(C160137Fz c160137Fz, C15370ps c15370ps) {
        this.A02 = c15370ps;
        this.A01 = c160137Fz;
    }

    @Override // X.InterfaceC58115Ppe
    public final void D9K(Date date) {
        L3H l3h;
        if (date != null && (l3h = (L3H) this.A02.A00) != null) {
            C160137Fz c160137Fz = this.A01;
            Calendar calendar = Calendar.getInstance();
            calendar.add(12, 1);
            boolean after = date.after(calendar.getTime());
            C189478aR c189478aR = l3h.A00;
            if (c189478aR != null) {
                c189478aR.A0Q(after);
            }
            Calendar calendar2 = MX0.A02;
            String A00 = c160137Fz.A00(date);
            C189478aR c189478aR2 = l3h.A00;
            if (c189478aR2 != null) {
                BottomSheetFragment bottomSheetFragment = c189478aR2.A03;
                BottomSheetFragment.A00(bottomSheetFragment).A0g = A00;
                bottomSheetFragment.A0Q();
                bottomSheetFragment.A0Q();
                c189478aR2.A02.A0g = A00;
            }
        }
    }

    @Override // X.InterfaceC58115Ppe
    public final void DB6() {
        if (!this.A00) {
            C7G0 c7g0 = this.A01.A08;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c7g0.A00, "direct_schedule_message_cancel");
            if (A0f.isSampled()) {
                AbstractC31171DnF.A1H(A0f, c7g0.A02);
                A0f.AAP("target", "cancel");
                AbstractC31175DnJ.A17(A0f, "composer");
            }
        }
    }

    @Override // X.InterfaceC58115Ppe
    public final void DBG(Date date) {
        C160137Fz c160137Fz;
        int i;
        Calendar calendar = Calendar.getInstance();
        calendar.add(12, 1);
        if (date != null) {
            date.setSeconds(0);
            if (date.after(calendar.getTime())) {
                c160137Fz = this.A01;
                c160137Fz.A00 = date;
                InterfaceC160037Fp interfaceC160037Fp = c160137Fz.A06;
                String A1A = AbstractC25228BEl.A1A(interfaceC160037Fp.Auv());
                long seconds = TimeUnit.MILLISECONDS.toSeconds(date.getTime());
                boolean A06 = C18U.A06(C06090Tz.A05, c160137Fz.A05, 2342172733116334595L);
                C159947Fg c159947Fg = c160137Fz.A07;
                if (A06) {
                    C14360o3.A0B(A1A, 0);
                    C160007Fm c160007Fm = c159947Fg.A00;
                    if (c160007Fm != null) {
                        c160007Fm.A05(null);
                    }
                    C7IT A0J = AnonymousClass983.A01(c159947Fg.A04.A01.A1i.A00).A0J();
                    C7IR c7ir = A0J.A05;
                    c7ir.A03.EOL((InterfaceC83713oG) c7ir.A08.invoke(), A1A, A0J.A03.A00(), seconds);
                } else if (!c159947Fg.A01(interfaceC160037Fp.B0K(), Long.valueOf(seconds), A1A)) {
                    i = 2131972874;
                    c160137Fz.A01(i);
                }
                this.A00 = true;
                AbstractC167017dG.A0y(c160137Fz.A02, C3DN.A00);
            }
        }
        c160137Fz = this.A01;
        i = 2131972867;
        c160137Fz.A01(i);
        this.A00 = true;
        AbstractC167017dG.A0y(c160137Fz.A02, C3DN.A00);
    }
}
