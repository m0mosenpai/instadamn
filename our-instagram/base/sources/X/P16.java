package X;

import android.view.View;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.update.trial.TrialUseCase;

/* loaded from: classes9.dex */
public final class P16 implements InterfaceC58169PqZ {
    public C52369NFj A00;
    public final C81X A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final InterfaceC58310Pt2 A04;
    public final TrialUseCase A05;
    public final C153936w2 A06;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A02;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C50122MBw c50122MBw = new C50122MBw(viewLifecycleOwner, c07s, this, null, 14);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        C07X A0K = AbstractC31173DnH.A0K(abstractC59962oe, anonymousClass191, c50122MBw, A00);
        AbstractC23641Du.A05(anonymousClass191, new C50122MBw(A0K, c07s, this, null, 15), C07Y.A00(A0K));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.7oG, java.lang.Object] */
    public static final void A00(P16 p16, boolean z) {
        new Object().A00(p16.A02.requireActivity(), p16.A03, p16.A05.A04().A0N, new C57749Pjc(p16, 12), z);
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        if (Systrace.A0E(1L)) {
            C0fO.A01("TrialsRowItem.createView", 470860339);
        }
        try {
            C153936w2.A05(this.A06, DexOptimization.OPT_KEY_CLIENT, "share_sheet", "impression");
            C52369NFj A01 = OOy.A01(this.A02.requireContext(), null, null, Integer.valueOf(R.drawable.instagram_trial_reel_pano_outline_24), 2131956084);
            this.A00 = A01;
            ViewOnClickListenerC55466OkL.A02(A01, 46, this);
            C52369NFj c52369NFj = this.A00;
            if (c52369NFj == null) {
                C14360o3.A0F("trialRow");
                throw C00O.createAndThrow();
            }
            C52369NFj.A02(c52369NFj, this, 25);
            if (Systrace.A0E(1L)) {
                C0fO.A00(1529909908);
            }
            return c52369NFj;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(527179188);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A01;
    }

    public P16(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, TrialUseCase trialUseCase) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, interfaceC58310Pt2);
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A05 = trialUseCase;
        this.A04 = interfaceC58310Pt2;
        this.A01 = C81X.A31;
        this.A06 = AbstractC153926w1.A01(abstractC59962oe, userSession, trialUseCase.A04().A0N);
    }
}
