package X;

import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.EWi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32583EWi extends AbstractC61132qb {
    public final Resources A00;
    public final UserSession A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C75H A04;
    public final DirectThreadKey A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C32583EWi(Resources resources, UserSession userSession, AnonymousClass988 anonymousClass988, C7IM c7im, C75H c75h, DirectThreadKey directThreadKey, String str, String str2, String str3, String str4) {
        C14360o3.A0B(userSession, 2);
        this.A00 = resources;
        this.A01 = userSession;
        this.A05 = directThreadKey;
        this.A08 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A09 = str4;
        this.A04 = c75h;
        this.A02 = anonymousClass988;
        this.A03 = c7im;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Resources resources = this.A00;
        UserSession userSession = this.A01;
        DirectThreadKey directThreadKey = this.A05;
        String str = this.A08;
        String str2 = this.A06;
        String str3 = this.A07;
        String str4 = this.A09;
        DirectCardGalleryRepository A00 = F2D.A00(userSession);
        C75H c75h = this.A04;
        AnonymousClass988 anonymousClass988 = this.A02;
        C7IM c7im = this.A03;
        AbstractC167027dH.A13(resources, userSession, directThreadKey);
        AbstractC167007dF.A1H(str2, 5, str4);
        AbstractC25234BEr.A0l(8, A00, c75h, anonymousClass988, c7im);
        return new Dz7(resources, userSession, F2C.A00(userSession), A00, anonymousClass988, c7im, c75h, directThreadKey, str, str2, str3, str4, null, null);
    }
}
