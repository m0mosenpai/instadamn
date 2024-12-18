package X;

import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.EWk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32585EWk extends AbstractC61132qb {
    public final Resources A00;
    public final UserSession A01;
    public final DirectCardGalleryRepository A02;
    public final AnonymousClass988 A03;
    public final C7IM A04;
    public final C75H A05;
    public final DirectThreadKey A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;

    public C32585EWk(Resources resources, UserSession userSession, DirectCardGalleryRepository directCardGalleryRepository, AnonymousClass988 anonymousClass988, C7IM c7im, C75H c75h, DirectThreadKey directThreadKey, String str, String str2, String str3, String str4, List list, boolean z) {
        AbstractC167007dF.A1I(userSession, 2, directCardGalleryRepository);
        this.A00 = resources;
        this.A01 = userSession;
        this.A06 = directThreadKey;
        this.A09 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A0A = str4;
        this.A02 = directCardGalleryRepository;
        this.A0B = list;
        this.A05 = c75h;
        this.A03 = anonymousClass988;
        this.A04 = c7im;
        this.A0C = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Resources resources = this.A00;
        UserSession userSession = this.A01;
        DirectThreadKey directThreadKey = this.A06;
        String str = this.A09;
        String str2 = this.A07;
        String str3 = this.A08;
        String str4 = this.A0A;
        DirectCardGalleryRepository directCardGalleryRepository = this.A02;
        List list = this.A0B;
        return new C32715Eag(resources, userSession, directCardGalleryRepository, this.A03, this.A04, this.A05, directThreadKey, str, str2, str3, str4, list, this.A0C);
    }
}
