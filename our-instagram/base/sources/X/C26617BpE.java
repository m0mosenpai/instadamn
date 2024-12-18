package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.BpE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26617BpE extends AbstractC77583di {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final UserSession A02;
    public final C57 A03;
    public final ScaleGestureDetectorOnScaleGestureListenerC65851TvC A04;
    public final Integer A05;
    public final String A06;

    public C26617BpE(C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, C57 c57, ScaleGestureDetectorOnScaleGestureListenerC65851TvC scaleGestureDetectorOnScaleGestureListenerC65851TvC, Integer num, String str) {
        AbstractC167007dF.A1F(str, 2, scaleGestureDetectorOnScaleGestureListenerC65851TvC);
        this.A02 = userSession;
        this.A06 = str;
        this.A03 = c57;
        this.A04 = scaleGestureDetectorOnScaleGestureListenerC65851TvC;
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A05 = num;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        List list = (List) BNI.A00(c77993eR, this.A03.A03);
        if (list == null) {
            list = C16930sl.A00;
        }
        int size = list.size();
        C2YW c2yw = new C2YW(0, 0);
        C2YP A0c = AbstractC25229BEm.A0c(c77993eR, AbstractC25230BEn.A0j(C29016Cr5.A00, false), C29877DFr.A00, new C30171DRb(size, 15, c77993eR, this));
        C75933ay c75933ay = C51722Yv.A02;
        return AbstractC25225BEi.A0g(AbstractC25232BEp.A16(AbstractC25230BEn.A0d(AbstractC25230BEn.A0d(null, C05F.A01, 100.0f, 0), C05F.A00, 100.0f, 0), C05F.A04, DRP.A00(this, 33)), c2yw, A0c);
    }
}
