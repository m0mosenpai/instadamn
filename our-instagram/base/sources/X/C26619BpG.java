package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.BpG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26619BpG extends AbstractC77583di {
    public final UserSession A00;
    public final InterfaceC30991Djq A01;
    public final C39H A02;
    public final C85183r9 A03;
    public final InterfaceC60442pS A04;
    public final WeakReference A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16660sJ A07;
    public final long A08;
    public final C51722Yv A09;

    public C26619BpG(C51722Yv c51722Yv, UserSession userSession, InterfaceC30991Djq interfaceC30991Djq, C39H c39h, C85183r9 c85183r9, InterfaceC60442pS interfaceC60442pS, WeakReference weakReference, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, long j) {
        AbstractC25234BEr.A0j(2, userSession, interfaceC60442pS, c39h, weakReference);
        C14360o3.A0B(c85183r9, 9);
        this.A09 = c51722Yv;
        this.A00 = userSession;
        this.A04 = interfaceC60442pS;
        this.A02 = c39h;
        this.A05 = weakReference;
        this.A08 = j;
        this.A01 = interfaceC30991Djq;
        this.A03 = c85183r9;
        this.A06 = interfaceC16820sZ;
        this.A07 = interfaceC16660sJ;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        C2YX c2yx = new C2YX(AbstractC77623dm.A0D(c77993eR, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size), AbstractC77623dm.A0D(c77993eR, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
        C2YP A0c = AbstractC25229BEm.A0c(c77993eR, AbstractC25230BEn.A0j(C28985Cqa.A00, false), DBG.A00, new BAO(11, c77993eR, this));
        C75933ay c75933ay = C51722Yv.A02;
        long j = this.A08;
        C51722Yv A00 = C9CU.A00(null, C05F.A00, 0, j);
        Integer num = C05F.A01;
        return AbstractC25225BEi.A0g(AbstractC25233BEq.A0d(AbstractC25233BEq.A0W(AbstractC25233BEq.A0U(A00, AbstractC25225BEi.A0n(num, 0, j), num, 0), c77993eR, 2131956717), new C50260MHp(this, 12)).A00(this.A09), c2yx, A0c);
    }
}
