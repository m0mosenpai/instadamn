package X;

import android.content.Context;
import android.view.View;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.DVi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30281DVi extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ C2Z0 A01;
    public final /* synthetic */ IGCTMessagingAdsInfoDictIntf A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ BLI A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30281DVi(View.OnClickListener onClickListener, C2Z0 c2z0, IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf, C38321qM c38321qM, BLI bli, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        super(2);
        this.A08 = z;
        this.A04 = bli;
        this.A00 = onClickListener;
        this.A07 = z2;
        this.A01 = c2z0;
        this.A03 = c38321qM;
        this.A02 = iGCTMessagingAdsInfoDictIntf;
        this.A05 = str;
        this.A06 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        int i;
        User A01;
        String A1E;
        View view = (View) obj;
        String str2 = (String) obj2;
        boolean A1R = AbstractC167007dF.A1R(0, view, str2);
        if (this.A08) {
            BLI bli = this.A04;
            bli.A08.A05 = str2;
            this.A00.onClick(view);
            MWD mwd = bli.A0E;
            if (mwd != null && (A1E = AbstractC25232BEp.A1E(bli)) != null) {
                AbstractC25229BEm.A1H(mwd, null, A1E, MSV.A00(498));
            }
        } else if (this.A07) {
            Context A00 = AbstractC77363dM.A00(this.A01);
            BLI bli2 = this.A04;
            UserSession userSession = bli2.A0A;
            String moduleName = bli2.A0C.getModuleName();
            C120985dq c120985dq = bli2.A06;
            C38321qM c38321qM = c120985dq.A02;
            Long l = null;
            if (c38321qM != null) {
                str = c38321qM.getId();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String A1E2 = AbstractC25226BEj.A1E(c120985dq);
            if (A1E2 == null) {
                A1E2 = "";
            }
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null) {
                i = -1;
                if (c38321qM2.A5M()) {
                    i = 0;
                }
            } else {
                i = 0;
            }
            C38321qM c38321qM3 = this.A03;
            C14360o3.A0B(userSession, A1R ? 1 : 0);
            String str3 = null;
            if (C87153uY.A03(userSession, c38321qM3) && (A01 = C87153uY.A01(userSession, c38321qM3)) != null) {
                str3 = A01.getId();
            }
            F7W.A00(A00, userSession, AbstractC111324zv.A00(802), moduleName, str, null, null, str2, A1E2, str3, i, false, A1R, false);
            C65886Tvq c65886Tvq = bli2.A0B;
            if (c65886Tvq != null) {
                String A1E3 = AbstractC25226BEj.A1E(c120985dq);
                IGCTMessagingAdsInfoDictIntf iGCTMessagingAdsInfoDictIntf = this.A02;
                if (iGCTMessagingAdsInfoDictIntf != null) {
                    l = Long.valueOf(VTE.A00(iGCTMessagingAdsInfoDictIntf));
                }
                c65886Tvq.A04(userSession, c120985dq.A02, l, A1E3, this.A05);
            }
            this.A06.invoke();
        }
        return C0eB.A00;
    }
}
