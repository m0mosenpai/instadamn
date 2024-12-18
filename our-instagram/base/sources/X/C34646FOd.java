package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.FOd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34646FOd {
    public C7QA A00;
    public String A01;
    public String A02;
    public final Activity A03;
    public final C36402G4d A04;
    public final C36413G4o A05;
    public final UserSession A06;
    public final C32703EaU A07;
    public final G4B A08;
    public final C36403G4e A09;
    public final Dz7 A0A;
    public final C7Q6 A0B;
    public final C7Q8 A0C;
    public final InterfaceC165077Zw A0D;
    public final InterfaceC163937Vh A0E;
    public final DirectThreadKey A0F;
    public final String A0G;
    public final InterfaceC08830cm A0H;
    public final InterfaceC165017Zq A0I;

    public C34646FOd(Activity activity, UserSession userSession, C32703EaU c32703EaU, Dz7 dz7, InterfaceC165017Zq interfaceC165017Zq, InterfaceC165077Zw interfaceC165077Zw, InterfaceC163937Vh interfaceC163937Vh, DirectThreadKey directThreadKey, String str, InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(userSession, 3);
        this.A07 = c32703EaU;
        this.A03 = activity;
        this.A06 = userSession;
        this.A0F = directThreadKey;
        this.A0A = dz7;
        this.A0H = interfaceC08830cm;
        this.A0D = interfaceC165077Zw;
        this.A0E = interfaceC163937Vh;
        this.A0I = interfaceC165017Zq;
        this.A0G = str;
        this.A0B = G43.A00;
        this.A0C = G46.A00;
        this.A00 = new G47(1, activity, userSession, c32703EaU, this, interfaceC163937Vh, directThreadKey);
        this.A08 = new G4B();
        this.A05 = new C36413G4o(0);
        this.A09 = new C36403G4e();
        this.A04 = new C36402G4d(this, 1);
    }
}
