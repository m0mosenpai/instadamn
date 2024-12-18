package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class FOg {
    public C7QA A00;
    public EnumC40111tc A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final Activity A05;
    public final G4C A06;
    public final C36402G4d A07;
    public final C36414G4p A08;
    public final UserSession A09;
    public final FRk A0A;
    public final EOJ A0B;
    public final C36404G4f A0C;
    public final Dz7 A0D;
    public final C7Q6 A0E;
    public final C7Q8 A0F;
    public final InterfaceC165017Zq A0G;
    public final InterfaceC165077Zw A0H;
    public final InterfaceC163937Vh A0I;
    public final DirectThreadKey A0J;
    public final String A0K;
    public final InterfaceC08830cm A0L;
    public final boolean A0M;

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0iw, java.lang.Object] */
    public FOg(Activity activity, UserSession userSession, EOJ eoj, Dz7 dz7, InterfaceC165017Zq interfaceC165017Zq, InterfaceC165077Zw interfaceC165077Zw, InterfaceC163937Vh interfaceC163937Vh, DirectThreadKey directThreadKey, String str, InterfaceC08830cm interfaceC08830cm) {
        C06090Tz c06090Tz;
        long j;
        boolean A06;
        String str2;
        C14360o3.A0B(userSession, 3);
        this.A0B = eoj;
        this.A05 = activity;
        this.A09 = userSession;
        this.A0J = directThreadKey;
        this.A0D = dz7;
        this.A0L = interfaceC08830cm;
        this.A0H = interfaceC165077Zw;
        this.A0I = interfaceC163937Vh;
        this.A0G = interfaceC165017Zq;
        this.A0K = str;
        this.A0E = new G42(this, 0);
        this.A0F = new G44(this);
        this.A00 = new G47(0, activity, userSession, eoj, this, interfaceC163937Vh, directThreadKey);
        C81663kb A03 = C2DU.A03((C2DU) AbstractC28761aE.A00(userSession), this.A0J);
        if (A03 != null && A03.C7g() == 29) {
            String str3 = this.A0K;
            if (str3 != null) {
                int hashCode = str3.hashCode();
                if (hashCode != -892498197) {
                    if (hashCode != -76391525) {
                        str2 = hashCode == 531959920 ? "challenges" : "challenge_winner";
                    }
                    if (str3.equals(str2)) {
                        A06 = A03.CPZ();
                        this.A0M = A06;
                        this.A0A = new FRk(new Object(), userSession);
                        this.A07 = new C36402G4d(this, 0);
                        this.A08 = new C36414G4p(this, 0);
                        this.A06 = new G4C(this, 0);
                        this.A0C = new C36404G4f(this);
                    }
                } else if (str3.equals("stacks")) {
                    c06090Tz = C06090Tz.A05;
                    j = 36316495405453768L;
                }
            }
            A06 = true;
            this.A0M = A06;
            this.A0A = new FRk(new Object(), userSession);
            this.A07 = new C36402G4d(this, 0);
            this.A08 = new C36414G4p(this, 0);
            this.A06 = new G4C(this, 0);
            this.A0C = new C36404G4f(this);
        }
        c06090Tz = C06090Tz.A06;
        j = 36316430979371392L;
        A06 = C18U.A06(c06090Tz, userSession, j);
        this.A0M = A06;
        this.A0A = new FRk(new Object(), userSession);
        this.A07 = new C36402G4d(this, 0);
        this.A08 = new C36414G4p(this, 0);
        this.A06 = new G4C(this, 0);
        this.A0C = new C36404G4f(this);
    }
}
