package X;

import com.instagram.common.session.UserSession;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* renamed from: X.NDh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52318NDh extends AbstractC61132qb {
    public final UserSession A00;
    public final OAK A01;
    public final C55042OZo A02;
    public final OKf A03;
    public final O3M A04;
    public final String A05;
    public final String A06;

    public C52318NDh(UserSession userSession, OAK oak, C55042OZo c55042OZo, OKf oKf, O3M o3m, String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A05 = str;
        this.A00 = userSession;
        this.A02 = c55042OZo;
        this.A04 = o3m;
        this.A01 = oak;
        this.A03 = oKf;
        this.A06 = str2;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.Nun] */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        String str = this.A05;
        UserSession userSession = this.A00;
        return new IGTVUploadViewModel(userSession, this.A01, this.A02, this.A03, this.A04, new Object(), AbstractC23021Ah.A00(userSession), str);
    }
}
