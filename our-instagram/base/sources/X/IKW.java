package X;

import android.content.Context;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IKW {
    public Integer A00;
    public C05A A01;
    public final Context A02;
    public final MusicPageTabType A03;
    public final UserSession A04;
    public final C40998IDt A05;
    public final C62832tM A06;
    public final String A07;
    public final InterfaceC09390do A08;
    public final C05A A09;

    public IKW(Context context, MusicPageTabType musicPageTabType, UserSession userSession, String str) {
        C14360o3.A0B(musicPageTabType, 2);
        this.A07 = str;
        this.A03 = musicPageTabType;
        this.A02 = context;
        this.A04 = userSession;
        C62832tM A00 = AbstractC62822tL.A00(userSession);
        C14360o3.A07(A00);
        this.A06 = A00;
        this.A09 = C10E.A00(null);
        this.A05 = new C40998IDt(userSession);
        this.A08 = J8Z.A00(this, 17);
        this.A01 = AbstractC25235BEs.A1A(false);
        this.A00 = C05F.A00;
    }
}
