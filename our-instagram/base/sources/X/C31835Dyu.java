package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Dyu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31835Dyu extends AbstractC52922bZ {
    public final C2GT A00;
    public final UserSession A01;
    public final DirectCardGalleryRepository A02;
    public final DirectThreadKey A03;
    public final String A04;
    public final String A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final C05A A08;

    public C31835Dyu(UserSession userSession, DirectCardGalleryRepository directCardGalleryRepository, DirectThreadKey directThreadKey, String str, String str2) {
        AbstractC167027dH.A0a(1, userSession, directCardGalleryRepository, directThreadKey, str);
        this.A01 = userSession;
        this.A02 = directCardGalleryRepository;
        this.A03 = directThreadKey;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = AbstractC09440dt.A01(C37051GUh.A00(this, 44));
        this.A07 = AbstractC09440dt.A01(C37051GUh.A00(this, 45));
        C15230pd A00 = C10Q.A00(new GSX(this, 0), directCardGalleryRepository.A0I, directCardGalleryRepository.A0G, directCardGalleryRepository.A0M);
        this.A00 = AbstractC31172DnG.A0E(AbstractC208910l.A01(new C45024JwF(null, null, ""), AbstractC141776au.A00(this), A00, C10I.A01));
        this.A08 = C10E.A00(null);
    }

    public static final void A00(C2EC c2ec, InterfaceC16660sJ interfaceC16660sJ) {
        if (c2ec != null) {
            interfaceC16660sJ.invoke(c2ec);
        } else {
            C18950wb.A00("DirectTextCardViewModel-thread is null", 20134884, false);
        }
    }
}
