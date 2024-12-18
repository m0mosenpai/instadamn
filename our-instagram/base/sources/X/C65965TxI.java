package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.TxI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65965TxI extends C65957Tx9 {
    public final boolean A00;
    public final boolean A01;

    public final void A06(List list, String str) {
        C14360o3.A0B(list, 0);
        if (!this.A00) {
            for (Object obj : list) {
                C65954Twz c65954Twz = new C65954Twz();
                c65954Twz.A09 = "client_side_matching";
                c65954Twz.A06 = str;
                c65954Twz.A05 = "server_results";
                A02(c65954Twz, obj);
            }
        }
    }

    public final void A07(List list, String str) {
        String str2;
        C14360o3.A0B(list, 0);
        for (Object obj : list) {
            C65954Twz c65954Twz = new C65954Twz();
            if (this.A01) {
                str2 = "server";
            } else {
                str2 = "query_cache";
            }
            c65954Twz.A09 = str2;
            c65954Twz.A06 = str;
            c65954Twz.A05 = "server_results";
            A02(c65954Twz, obj);
        }
    }

    public final void A09(List list, boolean z, String str, String str2) {
        String str3;
        C14360o3.A0B(list, 0);
        if (!this.A00) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC65924TwV abstractC65924TwV = (AbstractC65924TwV) it.next();
                if ((abstractC65924TwV instanceof C66130U0o) && (z || !C14360o3.A0K(((C66130U0o) abstractC65924TwV).A01.A07, "meta_ai_suggestion"))) {
                    C66130U0o c66130U0o = (C66130U0o) abstractC65924TwV;
                    if (C14360o3.A0K(c66130U0o.A01.A07, "meta_ai_suggestion")) {
                        c66130U0o.A06(str2, true);
                    } else {
                        c66130U0o.A06(str2, false);
                    }
                    C65954Twz c65954Twz = new C65954Twz();
                    if (this.A01) {
                        str3 = "server";
                    } else {
                        str3 = "query_cache";
                    }
                    c65954Twz.A09 = str3;
                    c65954Twz.A06 = str;
                    c65954Twz.A05 = "server_results";
                    A02(c65954Twz, abstractC65924TwV);
                }
            }
        }
    }

    public final void A05(List list, String str) {
        if (!this.A00) {
            for (Object obj : list) {
                C65954Twz c65954Twz = new C65954Twz();
                c65954Twz.A09 = "bootstrap";
                c65954Twz.A06 = str;
                c65954Twz.A05 = "server_results";
                A02(c65954Twz, obj);
            }
        }
    }

    public C65965TxI(boolean z, boolean z2, boolean z3) {
        super(z3);
        this.A00 = z;
        this.A01 = z2;
    }

    public final void A08(List list, String str) {
        for (Object obj : list) {
            C65954Twz c65954Twz = new C65954Twz();
            c65954Twz.A09 = MSV.A00(480);
            c65954Twz.A06 = str;
            c65954Twz.A05 = "server_results";
            A02(c65954Twz, obj);
        }
    }

    public C65965TxI() {
        this(false, false, false);
    }
}
