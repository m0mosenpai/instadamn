package X;

import android.view.View;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.DVj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30282DVj extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ IGCTMessagingAdsInfoDictIntf A01;
    public final /* synthetic */ C40971v4 A02;
    public final /* synthetic */ BLI A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30282DVj(View.OnClickListener onClickListener, IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf, C40971v4 c40971v4, BLI bli, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A08 = z;
        this.A03 = bli;
        this.A02 = c40971v4;
        this.A00 = onClickListener;
        this.A07 = z2;
        this.A05 = interfaceC16820sZ;
        this.A06 = z3;
        this.A01 = iGCTMessagingAdsInfoDictIntf;
        this.A04 = str;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        BLI bli;
        C65886Tvq c65886Tvq;
        Object obj3;
        InterfaceC108024tl B6f;
        List BZN;
        C38321qM c38321qM;
        View view = (View) obj;
        String str = (String) obj2;
        boolean A1a = AbstractC167017dG.A1a(view, str);
        Long l = null;
        if (this.A08) {
            BLI bli2 = this.A03;
            C37644Ghd c37644Ghd = bli2.A08;
            Long l2 = c37644Ghd.A03;
            Long l3 = null;
            if (l2 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l2.longValue() + 1000;
                if (currentTimeMillis >= longValue) {
                    l3 = Long.valueOf(currentTimeMillis - longValue);
                }
            }
            C120985dq c120985dq = bli2.A06;
            UserSession userSession = bli2.A0A;
            C14360o3.A0B(userSession, A1a ? 1 : 0);
            if (c120985dq != null && (c38321qM = c120985dq.A02) != null && !c38321qM.A5v() && !c38321qM.A5m() && !c120985dq.A06().A0v) {
                long A01 = C18U.A01(C06090Tz.A05, userSession, 36610344180783134L);
                if (A01 >= 0 && l3 != null && l3.longValue() >= A01) {
                    c37644Ghd.A05 = str;
                    bli2.A0P.A05(view, EnumC71343Hv.A0H, null, this.A02, null);
                    MWD mwd = bli2.A0E;
                    if (mwd != null) {
                        AbstractC25229BEm.A1H(mwd, l3, MSV.A00(221), MSV.A00(1373));
                    }
                    this.A00.onClick(view);
                    c37644Ghd.A03 = null;
                    c37644Ghd.A06 = A1a;
                }
            }
            if (this.A07) {
                InterfaceC104914o3 interfaceC104914o3 = c120985dq.A06().A0B;
                if (interfaceC104914o3 != null && (B6f = interfaceC104914o3.B6f()) != null && (BZN = B6f.BZN()) != null) {
                    obj3 = AbstractC001800i.A0L(BZN);
                } else {
                    obj3 = null;
                }
                boolean equals = str.equals(obj3);
                MWD mwd2 = bli2.A0E;
                if (equals) {
                    if (mwd2 != null) {
                        AbstractC25229BEm.A1H(mwd2, l3, MSV.A00(499), "lead_ads_offsite_generic_question_option_no_click");
                    }
                    this.A05.invoke();
                } else {
                    if (mwd2 != null) {
                        AbstractC25229BEm.A1H(mwd2, l3, MSV.A00(499), "lead_ads_offsite_generic_question_option_yes_click");
                    }
                    bli2.A0P.A05(view, EnumC71343Hv.A0H, null, this.A02, null);
                    this.A00.onClick(view);
                }
            } else {
                MWD mwd3 = bli2.A0E;
                if (mwd3 != null) {
                    AbstractC25229BEm.A1H(mwd3, l3, MSV.A00(221), MSV.A00(1374));
                }
            }
            c37644Ghd.A03 = null;
            c37644Ghd.A06 = A1a;
        } else if (this.A06 && (c65886Tvq = (bli = this.A03).A0B) != null) {
            C120985dq c120985dq2 = bli.A06;
            String A1E = AbstractC25226BEj.A1E(c120985dq2);
            IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf = this.A01;
            if (iGCTMessagingAdsInfoDictIntf != null) {
                l = Long.valueOf(VTE.A00(iGCTMessagingAdsInfoDictIntf));
            }
            c65886Tvq.A03(bli.A0A, c120985dq2.A02, l, A1E, this.A04);
        }
        return C0eB.A00;
    }
}
