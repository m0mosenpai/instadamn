package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cvq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29295Cvq implements InterfaceC30946Dj3 {
    public final C25671My A00;
    public final UserSession A01;
    public final C38321qM A02;
    public final C75113Zb A03;
    public final String A04;
    public final boolean A05;

    @Override // X.InterfaceC30946Dj3
    public final void Dmx(ClickableSpan clickableSpan, View view, String str, String str2) {
        AbstractC167007dF.A1E(str, 0, str2);
        C38321qM c38321qM = this.A02;
        C25671My c25671My = this.A00;
        String str3 = this.A04;
        c25671My.E4s(new C72433Mq(this.A01, c38321qM, this.A03, str3, str, str2, this.A05));
    }

    public C29295Cvq(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, String str, boolean z) {
        AbstractC167017dG.A1P(userSession, str);
        this.A01 = userSession;
        this.A04 = str;
        this.A05 = z;
        this.A02 = c38321qM;
        this.A03 = c75113Zb;
        this.A00 = AbstractC25651Mw.A00(userSession);
    }
}
