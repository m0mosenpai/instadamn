package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.EWf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32580EWf extends AbstractC61132qb {
    public final UserSession A00;
    public final ImageUrl A01;
    public final C34427FFr A02;
    public final InterfaceC83733oI A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public C32580EWf(UserSession userSession, ImageUrl imageUrl, C34427FFr c34427FFr, InterfaceC83733oI interfaceC83733oI, String str, List list, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A03 = interfaceC83733oI;
        this.A04 = str;
        this.A01 = imageUrl;
        this.A05 = list;
        this.A06 = z;
        this.A02 = c34427FFr;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        InterfaceC83733oI interfaceC83733oI = this.A03;
        String str = this.A04;
        return new C44538Jmi(userSession, this.A01, this.A02, interfaceC83733oI, str, this.A05, this.A06);
    }
}
