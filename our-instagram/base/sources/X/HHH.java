package X;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* loaded from: classes7.dex */
public final class HHH extends AbstractC60592pi implements InterfaceC60072op, InterfaceC43452JHq {
    public int A00;
    public INJ A01;
    public boolean A02;
    public final AbstractC59962oe A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C39410Hau A06;
    public final AnonymousClass308 A07;
    public final InterfaceC60442pS A08;
    public final C41130IIv A09;
    public final InterfaceC60682pr A0A;
    public final EnumC39551HdN A0B;
    public final C38288GsX A0C;
    public final EM6 A0D;
    public final SavedCollection A0E;
    public final FRS A0F;
    public final C38U A0G;
    public final boolean A0H;

    public final void A02() {
        this.A02 = false;
        INJ inj = this.A01;
        if (inj != null) {
            LinearLayout linearLayout = inj.A00;
            boolean z = inj.A01;
            int i = 4;
            if (z) {
                i = 8;
            }
            linearLayout.setVisibility(i);
            this.A0A.getScrollingViewProxy().CFj().setLayoutParams(new FrameLayout.LayoutParams(-1, this.A00));
        }
        A03();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A01 = null;
    }

    public static void A00(HHH hhh) {
        int i;
        INJ inj = hhh.A01;
        if (inj != null) {
            i = inj.A00.getHeight();
        } else {
            i = 0;
        }
        hhh.A0A.getScrollingViewProxy().CFj().setLayoutParams(new FrameLayout.LayoutParams(-1, hhh.A00 - i));
    }

    public final void A01() {
        this.A06.A03(true);
        ((C3FR) this.A0A.getScrollingViewProxy()).APU();
        FragmentActivity activity = this.A03.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new RunnableC43127J4q(activity, this));
        }
    }

    public final void A03() {
        this.A06.A03(false);
        ((C3FR) this.A0A.getScrollingViewProxy()).ARj();
        FragmentActivity activity = this.A03.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new RunnableC43127J4q(activity, this));
        }
    }

    @Override // X.InterfaceC43452JHq
    public final void CvM() {
        List A04 = this.A06.A04();
        WFV wfv = new WFV(this.A03.requireActivity(), this.A05, this.A08, null);
        SavedCollection savedCollection = this.A0E;
        C42813Iwp c42813Iwp = new C42813Iwp(0, this, A04);
        wfv.A05(AbstractC25225BEi.A0x(A04, 0), new C42812Iwo(0, this, A04), c42813Iwp, savedCollection);
    }

    @Override // X.InterfaceC43452JHq
    public final void DTv() {
        List A04 = this.A06.A04();
        WFV wfv = new WFV(this.A03.requireActivity(), this.A05, this.A08, null);
        SavedCollection savedCollection = this.A0E;
        C42813Iwp c42813Iwp = new C42813Iwp(1, this, A04);
        wfv.A06((C38321qM) AbstractC166987dD.A16(A04), new C42812Iwo(1, this, A04), c42813Iwp, savedCollection);
    }

    @Override // X.InterfaceC43452JHq
    public final void Det() {
        this.A0F.A00(DialogInterfaceOnClickListenerC41836Ifq.A00(this, 26));
    }

    @Override // X.InterfaceC43452JHq
    public final void Dwk() {
        this.A0F.A01(DialogInterfaceOnClickListenerC41836Ifq.A00(this, 25), this.A06.A02.size());
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        EnumC39551HdN enumC39551HdN;
        if (this.A06.A01 && (enumC39551HdN = this.A0B) != EnumC39551HdN.A05 && enumC39551HdN != EnumC39551HdN.A03) {
            A02();
            return true;
        }
        return false;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        boolean z = !this.A06.A01;
        InterfaceC60682pr interfaceC60682pr = this.A0A;
        C3FR c3fr = (C3FR) interfaceC60682pr.getScrollingViewProxy();
        if (z) {
            c3fr.ARj();
        } else {
            c3fr.APU();
        }
        AbstractC13880nE.A0q(interfaceC60682pr.getScrollingViewProxy().CFj(), new J3P(this));
    }

    public HHH(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C39410Hau c39410Hau, AnonymousClass308 anonymousClass308, InterfaceC60442pS interfaceC60442pS, C41130IIv c41130IIv, InterfaceC60682pr interfaceC60682pr, EnumC39551HdN enumC39551HdN, C38288GsX c38288GsX, EM6 em6, SavedCollection savedCollection, C38U c38u, boolean z) {
        this.A05 = userSession;
        this.A0E = savedCollection;
        this.A0B = enumC39551HdN;
        this.A06 = c39410Hau;
        this.A0A = interfaceC60682pr;
        this.A03 = abstractC59962oe;
        this.A0G = c38u;
        this.A07 = anonymousClass308;
        this.A09 = c41130IIv;
        this.A04 = interfaceC11380iw;
        this.A0C = c38288GsX;
        this.A08 = interfaceC60442pS;
        this.A0D = em6;
        this.A0H = z;
        this.A0F = new FRS(abstractC59962oe.requireContext());
    }
}
