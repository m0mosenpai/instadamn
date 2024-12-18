package X;

import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;

/* renamed from: X.D8x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29727D8x extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ IGCTMessagingAdsInfoDictIntf A00;
    public final /* synthetic */ C18920wW A01;
    public final /* synthetic */ C40971v4 A02;
    public final /* synthetic */ BLI A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29727D8x(IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf, C18920wW c18920wW, C40971v4 c40971v4, BLI bli, String str, boolean z, boolean z2, boolean z3) {
        super(0);
        this.A01 = c18920wW;
        this.A02 = c40971v4;
        this.A03 = bli;
        this.A07 = z;
        this.A06 = z2;
        this.A05 = z3;
        this.A00 = iGCTMessagingAdsInfoDictIntf;
        this.A04 = str;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        BLI bli;
        C65886Tvq c65886Tvq;
        String A1E;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "instagram_ad_reels_endscene_impression");
        Long l = null;
        if (A0f.isSampled()) {
            C40971v4 c40971v4 = this.A02;
            A0f.A9K("ad_id", AbstractC25231BEo.A0j(0, c40971v4.A0S));
            A0f.AAP("tracking_token", c40971v4.A0j);
            C38321qM c38321qM = c40971v4.A0K;
            A0f.AAP("m_pk", c38321qM.getId());
            A0f.AAP("a_pk", AbstractC25228BEl.A18(c38321qM.A2E(this.A03.A0A)));
            A0f.Cht();
        }
        if (this.A07) {
            this.A03.A0H.EkF(false);
        }
        if (this.A06) {
            BLI bli2 = this.A03;
            MWD mwd = bli2.A0E;
            if (mwd != null && (A1E = AbstractC25232BEp.A1E(bli2)) != null) {
                MWD.A00(mwd, null, A1E, AbstractC111324zv.A00(4825), "impression").Cht();
            }
            C37644Ghd c37644Ghd = bli2.A08;
            if (!c37644Ghd.A06) {
                c37644Ghd.A03 = Long.valueOf(System.currentTimeMillis());
            }
        }
        if (this.A05 && (c65886Tvq = (bli = this.A03).A0B) != null) {
            String A1E2 = AbstractC25226BEj.A1E(bli.A06);
            IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf = this.A00;
            if (iGCTMessagingAdsInfoDictIntf != null) {
                l = Long.valueOf(VTE.A00(iGCTMessagingAdsInfoDictIntf));
            }
            c65886Tvq.A05(l, A1E2, this.A04);
        }
        return C0eB.A00;
    }
}
