package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LAF {
    public final Context A00;
    public final C1336661v A01;
    public final JSW A02;
    public final C42221xC A03;
    public final UserSession A04;
    public final KPB A05;
    public final KPR A06;
    public final Integer A07;
    public final InterfaceC09390do A08 = MHL.A00(this, EnumC09460dv.A02, 34);
    public final C42221xC A09;

    public final LK0 A00(Context context) {
        try {
            if (this.A02.A00(context)) {
                C1336661v c1336661v = this.A01;
                LK0.A00().A05(false);
                return c1336661v.A00.A03();
            }
        } catch (RuntimeException unused) {
        }
        LK0 A00 = LK0.A00();
        A00.A05(false);
        return A00;
    }

    public final C42221xC A01(C41761wQ c41761wQ) {
        C14360o3.A0B(c41761wQ, 0);
        return C48486Lcd.A00(this.A09, c41761wQ, new MM0(this, 28), 3);
    }

    public final C42221xC A03(C41761wQ c41761wQ, UserSession userSession) {
        C14360o3.A0B(c41761wQ, 1);
        if (!this.A02.A00(this.A00)) {
            return C42221xC.A09(KOu.A00);
        }
        return C48486Lcd.A00(c41761wQ, userSession, this, 2);
    }

    public final C42221xC A05(C41761wQ c41761wQ, String str) {
        C14360o3.A0B(str, 1);
        return C48486Lcd.A00(this.A09, c41761wQ, new MI6(this, str, 1, false), 3);
    }

    public final C42221xC A02(C41761wQ c41761wQ) {
        return C48486Lcd.A00(this.A09, c41761wQ, new MM0(this, 29), 3);
    }

    public final C42221xC A04(C41761wQ c41761wQ, Integer num) {
        String str;
        if (!this.A02.A00(this.A00)) {
            return C42221xC.A09(C27189Bz8.A00);
        }
        KPR kpr = this.A06;
        kpr.A03();
        if (num == C05F.A00) {
            str = "YES";
        } else {
            str = "NO";
        }
        kpr.A07("IS_V3_IMPLICIT_BACKUP", str);
        kpr.A07("CALLSITE", AbstractC46733Klq.A00(num));
        return C42221xC.A06(new C44091JeG(c41761wQ, this, 3));
    }

    public LAF(Context context, C1336661v c1336661v, JSW jsw, C42221xC c42221xC, UserSession userSession, KPB kpb, KPR kpr, Integer num) {
        this.A01 = c1336661v;
        this.A04 = userSession;
        this.A07 = num;
        this.A02 = jsw;
        this.A06 = kpr;
        this.A05 = kpb;
        this.A03 = c42221xC;
        this.A00 = context;
        this.A09 = c42221xC.A0K(C48396LbB.A00);
    }
}
