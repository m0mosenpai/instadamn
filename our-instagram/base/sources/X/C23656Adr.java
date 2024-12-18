package X;

import android.content.Context;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Adr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23656Adr implements InterfaceC13000lm {
    public long A00;
    public C1QT A01;
    public String A02 = "";
    public String A03;
    public boolean A04;
    public final String A05;
    public final Context A06;
    public final VEL A07;
    public final C68709Val A08;

    public static void A00(EnumC223239t9 enumC223239t9, C23656Adr c23656Adr) {
        c23656Adr.A02(enumC223239t9, "", null);
    }

    public final void A01() {
        long j = this.A00;
        if (j != 0) {
            this.A01.flowEndCancel(j, "new_flow_start");
            this.A00 = 0L;
            this.A04 = false;
            this.A02 = "";
            this.A03 = null;
        }
        C1QT c1qt = this.A01;
        VEL vel = this.A07;
        long generateNewFlowId = c1qt.generateNewFlowId(vel.A00);
        this.A00 = generateNewFlowId;
        c1qt.flowStart(generateNewFlowId, new UserFlowConfig(vel.A01, false));
    }

    public final void A03(String str, String str2) {
        long j = this.A00;
        if (j != 0) {
            this.A01.flowAnnotate(j, str, str2);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        long j = this.A00;
        if (j != 0) {
            this.A01.flowEndCancel(j, "session_end");
            this.A00 = 0L;
            this.A04 = false;
            this.A02 = "";
            this.A03 = null;
        }
    }

    public C23656Adr(Context context, VEL vel, C68709Val c68709Val, UserSession userSession, String str) {
        this.A05 = str;
        this.A06 = context;
        this.A07 = vel;
        this.A08 = c68709Val;
        this.A01 = C1QS.A00(userSession);
    }

    public final void A02(EnumC223239t9 enumC223239t9, String str, String str2) {
        String str3;
        boolean A1a = AbstractC167017dG.A1a(enumC223239t9, str);
        if (str2 != null && str2.length() != 0) {
            switch (enumC223239t9.A01.intValue()) {
                case 1:
                    str3 = "MEDIUM";
                    break;
                case 2:
                    str3 = "HIGH";
                    break;
                default:
                    str3 = "LOW";
                    break;
            }
            if (str.length() > 0) {
                str3 = AnonymousClass001.A0T(str, str3, ' ');
            }
            C0w9.A03(AnonymousClass001.A0j(this.A05, str3, enumC223239t9.A02, ' ', ' '), str2);
        }
        int i = enumC223239t9.A00;
        if (i > 0) {
            C68709Val c68709Val = this.A08;
            String A0q = AbstractC166997dE.A0q(this.A06.getResources(), i);
            C146106i8 c146106i8 = new C146106i8();
            c146106i8.A05();
            c146106i8.A0D = A0q;
            AbstractC166997dE.A1O(c68709Val.A00, c146106i8.A00());
        }
        String str4 = enumC223239t9.A02;
        if (str2 != null) {
            long j = this.A00;
            if (j != 0) {
                this.A01.flowMarkError(j, str4, str2);
                this.A04 = A1a;
                this.A02 = str4;
                this.A03 = str2;
                return;
            }
            return;
        }
        long j2 = this.A00;
        if (j2 == 0) {
            return;
        }
        this.A01.flowMarkPoint(j2, str4);
    }
}
