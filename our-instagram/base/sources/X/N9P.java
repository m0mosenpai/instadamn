package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class N9P extends C1P1 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public N9P(UserSession userSession, String str, String str2, String str3) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = userSession;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1264957929);
        C105824pt c105824pt = (C105824pt) obj;
        int A0N = AbstractC167017dG.A0N(c105824pt, 1066961902);
        AbstractC25651Mw.A00(this.A00).E4s(new NYJ(c105824pt, this.A01, this.A03, this.A02));
        C0f9.A0A(1000775786, A0N);
        C0f9.A0A(-89035803, A03);
    }
}
