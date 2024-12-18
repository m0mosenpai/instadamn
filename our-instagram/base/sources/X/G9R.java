package X;

import android.os.Bundle;
import android.os.Handler;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.registration.model.RegFlowExtras;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class G9R implements InterfaceC37227Gac {
    public final IgFragmentActivity A00;
    public final AbstractC59962oe A01;
    public final InterfaceC11380iw A02;
    public final FOE A03;
    public final Handler A04;
    public final EVQ A05;
    public final C34669FPe A06;

    public G9R(IgFragmentActivity igFragmentActivity, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, FOE foe, EVQ evq, C34669FPe c34669FPe) {
        AbstractC167007dF.A1F(interfaceC11380iw, 3, igFragmentActivity);
        this.A01 = abstractC59962oe;
        this.A03 = foe;
        this.A02 = interfaceC11380iw;
        this.A00 = igFragmentActivity;
        this.A05 = evq;
        this.A06 = c34669FPe;
        this.A04 = AbstractC167007dF.A0J();
    }

    @Override // X.InterfaceC37227Gac
    public final void Cut(String str, String str2) {
        String str3;
        C1P1 efZ;
        C1ON A0E;
        C14360o3.A0B(str2, 1);
        FOE foe = this.A03;
        String A00 = A00(foe);
        IgFragmentActivity igFragmentActivity = this.A00;
        String A002 = C16030qx.A00(igFragmentActivity);
        C14360o3.A07(A002);
        String A10 = AbstractC31172DnG.A10(igFragmentActivity);
        C14360o3.A07(A10);
        try {
            str3 = C35270Fh5.A01(igFragmentActivity, foe.A02, foe.A04, C05F.A01);
        } catch (IOException unused) {
            str3 = null;
        }
        E6N e6n = foe.A03;
        Integer num = e6n.A01;
        int intValue = num.intValue();
        if (intValue != 9 && intValue != 7 && intValue != 6) {
            if (intValue == 1) {
                C07270a1 c07270a1 = foe.A02;
                efZ = new Eg1(this.A01, this.A02, c07270a1, this, foe.A04, A00, e6n.A04);
                A0E = AbstractC35276FhB.A05(igFragmentActivity, c07270a1, A01(foe), A00, str2);
            } else {
                throw AbstractC31175DnJ.A0V("Invalid account source ", FWG.A01(num));
            }
        } else {
            C07270a1 c07270a12 = foe.A02;
            efZ = new EfZ(igFragmentActivity, this.A02, c07270a12, this, foe.A04, C05F.A0C, A00);
            A0E = AbstractC35276FhB.A0E(c07270a12, str3, A002, null, null, A10, A01(foe), str2, A00, null, C35264Fgy.A00());
        }
        A0E.A00 = efZ;
        igFragmentActivity.schedule(A0E);
    }

    @Override // X.InterfaceC37227Gac
    public final /* synthetic */ void DRA(FQD fqd) {
        fqd.A00(false);
    }

    @Override // X.InterfaceC37227Gac
    public final void Do2(C34691FQc c34691FQc) {
        C14360o3.A0B(c34691FQc, 0);
        this.A06.A00(c34691FQc, null);
    }

    @Override // X.InterfaceC37227Gac
    public final void DoB(C07270a1 c07270a1, C32196ECr c32196ECr) {
        C14360o3.A0B(c07270a1, 0);
        this.A04.post(new RunnableC36936GPf(c07270a1, c32196ECr, this));
    }

    public static final String A00(FOE foe) {
        E6N e6n = foe.A03;
        Integer num = e6n.A01;
        int intValue = num.intValue();
        if (intValue != 9 && intValue != 7 && intValue != 6) {
            if (intValue == 1) {
                Object obj = e6n.A02;
                C14360o3.A0C(obj, AbstractC58317Pt9.A00(119));
                return ((QJ0) obj).A04;
            }
            throw AbstractC31175DnJ.A0V("Invalid account source ", FWG.A01(num));
        }
        Object obj2 = e6n.A02;
        C14360o3.A0C(obj2, AbstractC58317Pt9.A00(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS));
        return ((UQE) obj2).A01;
    }

    public static final String A01(FOE foe) {
        E6N e6n = foe.A03;
        Integer num = e6n.A01;
        int intValue = num.intValue();
        if (intValue != 9 && intValue != 7 && intValue != 6) {
            if (intValue == 1) {
                Object obj = e6n.A02;
                C14360o3.A0C(obj, AbstractC58317Pt9.A00(119));
                return ((QJ0) obj).A01;
            }
            throw AbstractC31175DnJ.A0V("Invalid account source ", FWG.A01(num));
        }
        Object obj2 = e6n.A02;
        C14360o3.A0C(obj2, AbstractC58317Pt9.A00(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS));
        return ((UQE) obj2).A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC37227Gac
    public final void DV5() {
        RegFlowExtras regFlowExtras = new RegFlowExtras();
        IgFragmentActivity igFragmentActivity = this.A00;
        C14360o3.A0C(igFragmentActivity, "null cannot be cast to non-null type com.instagram.multipleaccounts.delegate.MultipleAccountsDelegate");
        regFlowExtras.A04 = ((GZG) igFragmentActivity).BLC();
        AbstractC31175DnJ.A0R();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        AbstractC31171DnF.A12(A0b, "IgSessionManager.LOGGED_OUT_TOKEN");
        EKF ekf = new EKF();
        ekf.setArguments(A0b);
        AbstractC35259Fgt.A07(ekf, igFragmentActivity.getSupportFragmentManager(), "android.nux.ContactPointTriageFragment");
    }

    @Override // X.InterfaceC37227Gac
    public final void Dkh() {
        IgFragmentActivity igFragmentActivity = this.A00;
        FOE foe = this.A03;
        C1ON A03 = AbstractC35276FhB.A03(igFragmentActivity, foe.A02, foe.A03.A03);
        A03.A00 = new C32527EUd(igFragmentActivity);
        igFragmentActivity.schedule(A03);
    }

    @Override // X.InterfaceC37227Gac
    public final void Dki() {
        IgFragmentActivity igFragmentActivity = this.A00;
        FOE foe = this.A03;
        C07270a1 c07270a1 = foe.A02;
        String A00 = A00(foe);
        String A002 = C16030qx.A00(igFragmentActivity);
        String A10 = AbstractC31172DnG.A10(igFragmentActivity);
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        A0M.A0B("accounts/send_password_reset/");
        AbstractC31180DnO.A1R(A0M, AbstractC31182DnR.A01(), A00, A002, A10);
        C1ON A0I = AbstractC31178DnM.A0I(A0M, EDD.class, C34807FVj.class);
        A0I.A00 = new C32527EUd(igFragmentActivity);
        igFragmentActivity.schedule(A0I);
    }

    @Override // X.InterfaceC37227Gac
    public final void Dkj() {
        IgFragmentActivity igFragmentActivity = this.A00;
        FOE foe = this.A03;
        igFragmentActivity.schedule(AbstractC35276FhB.A01(igFragmentActivity, foe.A02, null, null, foe.A03.A03, null, false, false));
    }

    @Override // X.InterfaceC37227Gac
    public final void DoC() {
        FOE foe = this.A03;
        String valueOf = String.valueOf(foe.A03.A03);
        C07270a1 c07270a1 = foe.A02;
        C33109EjD c33109EjD = new C33109EjD(this.A01, c07270a1);
        IgFragmentActivity igFragmentActivity = this.A00;
        C1ON A02 = AbstractC35276FhB.A02(igFragmentActivity, c07270a1, C05F.A0Y, valueOf);
        A02.A00 = c33109EjD;
        igFragmentActivity.schedule(A02);
    }

    @Override // X.InterfaceC37227Gac
    public final void DQP() {
        C36007Fv5 A00 = C36007Fv5.A00();
        C07270a1 c07270a1 = this.A03.A02;
        boolean A1X = AbstractC31171DnF.A1X(A00.A02(c07270a1, "ig_android_growth_FX_access_fbig_create_cp_claiming", "AymhLoginFailureDelegate"));
        EVQ evq = this.A05;
        if (A1X) {
            evq.A0B(c07270a1, C36007Fv5.A00().A01(c07270a1, "ig_android_growth_FX_access_fbig_create_cp_claiming", "AymhLoginFailureDelegate"), C36007Fv5.A00().A02(c07270a1, "ig_android_growth_FX_access_fbig_create_cp_claiming", "AymhLoginFailureDelegate"), true);
        } else {
            evq.A07();
        }
    }
}
