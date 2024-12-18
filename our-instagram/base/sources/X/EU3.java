package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EU3 extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ AbstractC59962oe A02;
    public final /* synthetic */ InterfaceC11380iw A03;
    public final /* synthetic */ C07270a1 A04;
    public final /* synthetic */ GY6 A05;
    public final /* synthetic */ RegFlowExtras A06;
    public final /* synthetic */ EVN A07;

    public EU3(Context context, Handler handler, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, GY6 gy6, RegFlowExtras regFlowExtras, EVN evn) {
        this.A07 = evn;
        this.A04 = c07270a1;
        this.A06 = regFlowExtras;
        this.A00 = context;
        this.A01 = handler;
        this.A02 = abstractC59962oe;
        this.A03 = interfaceC11380iw;
        this.A05 = gy6;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1533694054);
        EfV efV = (EfV) obj;
        int A032 = C0f9.A03(1250575250);
        super.onSuccess(efV);
        User user = efV.A05;
        user.A03.EYn(0);
        AbstractC31177DnL.A1O(user);
        C07270a1 c07270a1 = this.A04;
        String id = user.getId();
        boolean A1R = AbstractC167007dF.A1R(0, c07270a1, "facebook");
        FD7.A00(c07270a1, null, "facebook", "consumer", id, null).Cht();
        Context context = this.A00;
        UserSession A02 = AbstractC31525Dt9.A02(context, null, c07270a1, user, null, false);
        AbstractC49092Nc.A00(A02).A02(EVQ.A0B, null, "ig_fb_log_in");
        VPV.A00(context, A02).A01(EnumC33361Eou.A05);
        if (efV.A0H) {
            C1GJ.A03(new G0B(A1R ? 1 : 0, this, A02, user));
        } else {
            EVN evn = this.A07;
            if (evn != null) {
                evn.A00();
            }
            this.A01.post(new GOW(this, user));
        }
        C0f9.A0A(568849472, A032);
        C0f9.A0A(-250311543, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        String str2;
        GY6 gy6;
        String str3;
        int A03 = C0f9.A03(1546610605);
        EVN evn = this.A07;
        if (evn != null) {
            evn.A00();
        }
        if (abstractC115105If instanceof C115115Ig) {
            EfV efV = (EfV) abstractC115105If.A00();
            if (!efV.isFeedbackRequired() && (gy6 = this.A05) != null) {
                C34935FaL c34935FaL = efV.A01;
                if (c34935FaL != null) {
                    str3 = c34935FaL.A00;
                } else {
                    str3 = null;
                }
                gy6.Eks(str3, C05F.A01);
            }
            C07270a1 c07270a1 = this.A04;
            C34935FaL c34935FaL2 = efV.A01;
            if (c34935FaL2 != null) {
                str = c34935FaL2.A01;
            } else {
                str = null;
            }
            if (c34935FaL2 != null) {
                str2 = c34935FaL2.A00;
            } else {
                str2 = null;
            }
            Boolean A0b = AbstractC166997dE.A0b();
            String status = efV.getStatus();
            Boolean valueOf = Boolean.valueOf(efV.isCheckpointRequired());
            Boolean valueOf2 = Boolean.valueOf(efV.isConsentRequired());
            Boolean valueOf3 = Boolean.valueOf(efV.isFeedbackRequired());
            Boolean valueOf4 = Boolean.valueOf(efV.isLoginRequired());
            Boolean valueOf5 = Boolean.valueOf(efV.isNoContent());
            Boolean valueOf6 = Boolean.valueOf(efV.isViolatingBrandedContentPolicy());
            Integer valueOf7 = Integer.valueOf(efV.mStatusCode);
            String str4 = efV.mErrorType;
            String errorMessage = efV.getErrorMessage();
            C14360o3.A0B(c07270a1, 0);
            FD8.A00(c07270a1, A0b, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, null, null, valueOf7, "facebook", str, str2, status, null, str4, errorMessage, null);
        } else {
            GY6 gy62 = this.A05;
            if (gy62 != null) {
                gy62.Eks(this.A00.getString(2131968430), C05F.A00);
            }
            Throwable A01 = abstractC115105If.A01();
            if (A01 != null) {
                String name = A01.getClass().getName();
                C0w9.A03(EVQ.__redex_internal_original_name, AnonymousClass001.A0u("Exception ", name, ": ", A01.getMessage()));
                C07270a1 c07270a12 = this.A04;
                C14360o3.A0B(c07270a12, 0);
                FD8.A00(c07270a12, false, null, null, null, null, null, null, null, null, null, "facebook", null, null, name, null, null, null, null);
            }
        }
        C0f9.A0A(-943092203, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-113084027);
        super.onStart();
        EVN evn = this.A07;
        if (evn != null) {
            evn.A01();
        }
        C07270a1 c07270a1 = this.A04;
        EnumC33445EqI enumC33445EqI = EnumC33445EqI.A04;
        Integer A02 = this.A06.A02();
        C14360o3.A0B(c07270a1, 0);
        FD9.A00(c07270a1, enumC33445EqI, A02, null, null);
        C0f9.A0A(-758894151, A03);
    }
}
