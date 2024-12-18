package X;

import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.Eaf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32714Eaf extends Dz7 {
    public List A00;
    public final C2GT A01;
    public final C05A A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32714Eaf(Resources resources, UserSession userSession, DirectCardGalleryRepository directCardGalleryRepository, AnonymousClass988 anonymousClass988, C7IM c7im, C75H c75h, DirectThreadKey directThreadKey, String str, String str2, String str3, String str4) {
        super(resources, userSession, F2C.A00(userSession), directCardGalleryRepository, anonymousClass988, c7im, c75h, directThreadKey, str, str2, str3, str4, null, null);
        AbstractC167027dH.A13(resources, userSession, directThreadKey);
        AbstractC167007dF.A1H(str2, 5, str4);
        AbstractC25234BEr.A0l(8, directCardGalleryRepository, c75h, anonymousClass988, c7im);
        C008002u A00 = C10E.A00(C32720Eal.A00);
        this.A02 = A00;
        this.A01 = AbstractC31172DnG.A0E(A00);
        this.A00 = C16930sl.A00;
    }
}
