package X;

import android.graphics.Bitmap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class D93 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D93(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i, boolean z, boolean z2, boolean z3) {
        super(0);
        this.A00 = i;
        this.A06 = obj5;
        this.A03 = obj6;
        this.A01 = obj;
        this.A02 = obj2;
        this.A07 = str;
        this.A04 = obj4;
        this.A05 = obj3;
        this.A0A = z;
        this.A09 = z2;
        this.A08 = z3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        BLI bli;
        C65886Tvq c65886Tvq;
        Long l;
        long j;
        Long A0j;
        BLI bli2;
        MWD mwd;
        String A1E;
        if (this.A00 != 0) {
            if (this.A08) {
                obj = this.A03;
            } else {
                obj = this.A05;
            }
            AbstractC166987dD.A1Y(obj);
            Xij.A00(EnumC39652Hih.A0Q, (C18920wW) this.A04, (C82713mZ) this.A01);
            if (this.A0A && (mwd = (bli2 = (BLI) this.A06).A0E) != null && (A1E = AbstractC25232BEp.A1E(bli2)) != null) {
                AbstractC25229BEm.A1H(mwd, null, A1E, "lead_ads_first_question_close_button_click");
            }
            if (this.A09 && (c65886Tvq = (bli = (BLI) this.A06).A0B) != null) {
                C120985dq c120985dq = bli.A06;
                String A1E2 = AbstractC25226BEj.A1E(c120985dq);
                IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf = (IGCTMessagingAdsInfoDictIntf) this.A02;
                if (iGCTMessagingAdsInfoDictIntf != null) {
                    l = Long.valueOf(VTE.A00(iGCTMessagingAdsInfoDictIntf));
                } else {
                    l = null;
                }
                String str = this.A07;
                C38321qM c38321qM = c120985dq.A02;
                UserSession userSession = bli.A0A;
                C14360o3.A0B(userSession, 4);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c65886Tvq.A01, "faqs_sticker_xout");
                if (A0f.isSampled()) {
                    long j2 = 0;
                    if (A1E2 != null && (A0j = AbstractC166997dE.A0j(A1E2)) != null) {
                        j = A0j.longValue();
                    } else {
                        j = 0;
                    }
                    A0f.A9K("ad_id", Long.valueOf(j));
                    if (l != null) {
                        j2 = l.longValue();
                    }
                    A0f.A9K("page_id", Long.valueOf(j2));
                    AbstractC25234BEr.A0z(A0f, userSession, c38321qM, c65886Tvq, str);
                }
            }
            return C0eB.A00;
        }
        C8MP c8mp = (C8MP) this.A06;
        C183978Ee c183978Ee = (C183978Ee) this.A03;
        return C8MP.A00((Bitmap) this.A01, (Bitmap) this.A02, (FilterChain) this.A05, (C198998qz) this.A04, c8mp, c183978Ee, this.A07, this.A0A, this.A09, this.A08);
    }
}
