package X;

import android.content.Context;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.common.session.UserSession;

/* renamed from: X.HHi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39058HHi extends AbstractC61132qb {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC018607g A01;
    public final /* synthetic */ MusicPageTabType A02;
    public final /* synthetic */ C154846xZ A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C39058HHi(Context context, AbstractC018607g abstractC018607g, MusicPageTabType musicPageTabType, C154846xZ c154846xZ, UserSession userSession, String str, String str2, String str3) {
        this.A06 = str;
        this.A02 = musicPageTabType;
        this.A00 = context;
        this.A04 = userSession;
        this.A05 = str2;
        this.A01 = abstractC018607g;
        this.A03 = c154846xZ;
        this.A07 = str3;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        String str = this.A06;
        MusicPageTabType musicPageTabType = this.A02;
        Context context = this.A00;
        UserSession userSession = this.A04;
        IKW ikw = new IKW(context, musicPageTabType, userSession, str);
        return new C38335GtV(this.A01, musicPageTabType, this.A03, userSession, CK4.A00(userSession), ikw, this.A05, this.A07);
    }
}
