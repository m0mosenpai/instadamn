package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.KDu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45529KDu extends C69503VpY {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ LJ8 A01;
    public final /* synthetic */ C53O A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C15370ps A06;

    public C45529KDu(Activity activity, LJ8 lj8, C53O c53o, String str, String str2, String str3, C15370ps c15370ps) {
        this.A00 = activity;
        this.A02 = c53o;
        this.A01 = lj8;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = c15370ps;
        this.A03 = str3;
    }

    @Override // X.C69503VpY
    public final void A00(UserSession userSession) {
        long j;
        if (userSession != null) {
            Activity activity = this.A00;
            C53O c53o = this.A02;
            LJ8 lj8 = this.A01;
            String str = this.A05;
            String str2 = this.A04;
            C15370ps c15370ps = this.A06;
            String str3 = this.A03;
            JZ8.A00(activity, c53o, userSession);
            if (lj8.A05(str, str2)) {
                C49808LzF c49808LzF = (C49808LzF) c15370ps.A00;
                C44915JuT c44915JuT = C44915JuT.A03;
                if (c44915JuT == null) {
                    c44915JuT = new C44915JuT(userSession);
                    C44915JuT.A03 = c44915JuT;
                }
                if (c49808LzF != null) {
                    j = C36J.A06(C36G.A06, C84303pN.A01.A00(c49808LzF.A00));
                } else {
                    j = 0;
                }
                c44915JuT.A00(j, str3, false);
            }
        }
    }
}
