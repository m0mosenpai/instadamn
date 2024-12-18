package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class WLA implements View.OnClickListener {
    public final /* synthetic */ C6QR A00;

    public WLA(C6QR c6qr) {
        this.A00 = c6qr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        List list;
        List list2;
        C008302x A03;
        int i2;
        int A05 = C0f9.A05(-1557882276);
        C6QR c6qr = this.A00;
        C6QR.A00(c6qr).A0G(C6QR.A01(c6qr).A04(), "done_button");
        UFT A01 = C6QR.A01(c6qr);
        Context context = c6qr.getContext();
        List list3 = A01.A05().A07;
        if (list3 != null) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        String str = A01.A05().A05;
        if (str != null && str.length() != 0 && A01.A05().A00 > 0 && A01.A05().A01 > 0 && (list = A01.A05().A06) != null && !list.isEmpty() && (list2 = A01.A05().A07) != null && !list2.isEmpty()) {
            boolean A1W = AbstractC167007dF.A1W(A01.A04);
            UPY A00 = UFT.A00(A01.A00, A01.A05(), A01.A03, A01.A05);
            UserSession userSession = A00.A08;
            if (A1W) {
                String str2 = A00.A0A;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = A00.A0B;
                if (str3 == null) {
                    str3 = "";
                }
                int i3 = A00.A03;
                int i4 = A00.A02;
                List list4 = A00.A0H;
                if (list4 == null) {
                    list4 = C16930sl.A00;
                }
                List list5 = A00.A0I;
                List list6 = A00.A0G;
                List list7 = A00.A0J;
                List list8 = A00.A0F;
                List list9 = A00.A0K;
                A03 = WDz.A00(A00.A05, A00.A06, userSession, str2, str3, A00.A09, list4, list5, list6, list7, list8, list9, A00.A00, A00.A01, i3, i4, A00.A04).A03(1391975297);
                i2 = 40;
            } else {
                String str4 = A00.A0B;
                if (str4 == null) {
                    str4 = "";
                }
                int i5 = A00.A03;
                int i6 = A00.A02;
                List list10 = A00.A0H;
                if (list10 == null) {
                    list10 = C16930sl.A00;
                }
                List list11 = A00.A0I;
                List list12 = A00.A0G;
                List list13 = A00.A0J;
                List list14 = A00.A0F;
                List list15 = A00.A0K;
                A03 = AbstractC70178WFd.A01(A00.A05, A00.A06, userSession, str4, A00.A09, A00.A0C, list10, list11, list12, list13, list14, list15, A00.A00, A00.A01, i5, i6, A00.A04).A03(1391975297);
                i2 = 41;
            }
            AbstractC25232BEp.A1J(A01, new MC5(A01, null, i2), A03);
        } else if (context != null) {
            String str5 = A01.A05().A05;
            if (str5 != null && str5.length() != 0) {
                List list16 = A01.A05().A07;
                if (list16 == null || list16.isEmpty()) {
                    i = 2131970522;
                }
            } else {
                i = 2131970523;
            }
            C50120MBu.A01(A01, AbstractC166997dE.A0p(context, i), AbstractC141776au.A00(A01), 24);
        }
        C0f9.A0C(486883375, A05);
    }
}
