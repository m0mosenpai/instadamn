package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.T3r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64202T3r implements InterfaceC65612To3 {
    public final C11830jh A00;
    public final UserSession A01;
    public final C40701ud A02;

    public C64202T3r(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = AbstractC40691uc.A01(userSession);
        this.A00 = C11830jh.A04.A01(userSession);
    }

    private final C58444PvN A00(C49352Or c49352Or, String str, String str2, String str3) {
        C58444PvN c58444PvN = new C58444PvN();
        String A00 = c49352Or.A00();
        String A0i = AnonymousClass001.A0i("proof.", A00, str2, '.');
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        A1I.put("cred_id", str);
        A1I.put("secret_and_key", A0i);
        A1I.put("device_key", A00);
        Q8J A01 = AbstractC63245Sfz.A01(SEA.A00("secret_and_key", A1I));
        C14360o3.A07(A01);
        C63406Sjd.A0B(A01, new C63620SqS(c58444PvN, c49352Or, this, str, str3));
        return c58444PvN;
    }

    public final C49352Or A01(String str) {
        C49352Or c49352Or = new C49352Or(this.A01.userId);
        if (!C14360o3.A0K(str, c49352Or.A00())) {
            if (AbstractC31177DnL.A1U(C06090Tz.A05, AbstractC58318PtA.A0T(), 36310426618822754L)) {
                C49352Or c49352Or2 = new C49352Or("autofill_key");
                if (C14360o3.A0K(str, c49352Or2.A00())) {
                    return c49352Or2;
                }
            }
        }
        return c49352Or;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.SW4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.REb, java.lang.Object, X.PvN] */
    @Override // X.InterfaceC65612To3
    public final C60616REb ADd(String str, String str2, String str3) {
        C62739SOf[] c62739SOfArr;
        boolean A1Y = AbstractC25229BEm.A1Y(str2);
        C58444PvN A00 = A00(new C49352Or(this.A01.userId), str, str2, str3);
        ?? obj = new Object();
        if (AbstractC31177DnL.A1U(C06090Tz.A06, AbstractC58318PtA.A0T(), 36310426618822754L)) {
            c62739SOfArr = new C62739SOf[]{new C62739SOf(A00, new DRQ(obj, 13)), new C62739SOf(A00(new C49352Or("autofill_key"), str, str2, str3), new DRQ(obj, 14))};
        } else {
            C62678SLr A002 = SSG.A00("");
            synchronized (obj) {
                C14360o3.A0B(A002, A1Y ? 1 : 0);
                obj.A01 = A002;
                SW4.A00(obj);
            }
            c62739SOfArr = new C62739SOf[]{new C62739SOf(A00, new DRQ(obj, 15))};
        }
        ?? c58444PvN = new C58444PvN();
        int length = c62739SOfArr.length;
        int i = 0;
        do {
            C62739SOf c62739SOf = c62739SOfArr[i];
            c62739SOf.A00.A9a(new C64200T3j(A1Y ? 1 : 0, c62739SOf, c58444PvN));
            i++;
        } while (i < length);
        return c58444PvN;
    }
}
