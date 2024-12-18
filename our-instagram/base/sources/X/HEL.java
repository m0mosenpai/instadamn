package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class HEL extends C7E1 implements InterfaceC61782rf, InterfaceC65242xM, InterfaceC65272xP, C3CQ {
    public C38321qM A00;
    public IKY A01;
    public boolean A02;
    public boolean A03;
    public C75113Zb A04;
    public final UserSession A05;
    public final Context A06;
    public final C65662y2 A07;
    public final C37443GeN A08;
    public final C60972qL A09;
    public final InterfaceC60442pS A0A;
    public final HFY A0B;

    /* JADX WARN: Type inference failed for: r2v1, types: [X.2y2, java.lang.Object] */
    public HEL(FragmentActivity fragmentActivity, C61142qc c61142qc, C60972qL c60972qL, C42590It8 c42590It8, C42590It8 c42590It82) {
        boolean A1a = AbstractC31175DnJ.A1a(c61142qc);
        this.A09 = c60972qL;
        this.A05 = c60972qL.A01;
        Context context = c60972qL.A00;
        this.A06 = context;
        InterfaceC60442pS interfaceC60442pS = c60972qL.A02;
        this.A0A = interfaceC60442pS;
        C37443GeN c37443GeN = new C37443GeN(fragmentActivity, fragmentActivity, c61142qc, c60972qL, A1a, A1a);
        this.A08 = c37443GeN;
        HFY hfy = new HFY(interfaceC60442pS, c42590It8, c42590It82);
        this.A0B = hfy;
        ?? obj = new Object();
        this.A07 = obj;
        AbstractC37304Gc5.A1N(this, c37443GeN, hfy, obj, context.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_survey_thanks_vertical_margin));
    }

    public static final void A00(HEL hel) {
        hel.A02 = true;
        hel.A06();
        hel.A08(hel.A0B, hel.A01);
        C38321qM c38321qM = hel.A00;
        if (c38321qM != null) {
            hel.A09(hel.A08, c38321qM, hel.BRZ(c38321qM));
            if (hel.A03) {
                hel.A08(hel.A07, null);
            }
            hel.A07();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ void A8q(Object obj, int i) {
    }

    @Override // X.C3CQ
    public final boolean AJk(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return c38321qM.equals(this.A00);
    }

    @Override // X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C75113Zb c75113Zb = this.A04;
        if (c75113Zb == null) {
            C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
            AnonymousClass341 anonymousClass341 = AnonymousClass341.A0N;
            C14360o3.A0B(anonymousClass341, 0);
            A0E.A0o = anonymousClass341;
            A0E.A0D(0);
            this.A04 = A0E;
            return A0E;
        }
        return c75113Zb;
    }

    @Override // X.InterfaceC65282xQ
    public final void Ct5() {
        this.A02 = false;
    }

    @Override // X.C3CQ
    public final void DSP(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A00 = c38321qM;
        A07();
    }

    @Override // X.InterfaceC65272xP
    public final void ETA(InterfaceC686036x interfaceC686036x) {
        C14360o3.A0B(interfaceC686036x, 0);
        this.A08.A03(interfaceC686036x);
    }

    @Override // X.InterfaceC65272xP
    public final void EUR(C33P c33p) {
        C14360o3.A0B(c33p, 0);
        this.A08.A03 = c33p;
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return this.A02;
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        if (c38321qM != null) {
            this.A00 = c38321qM;
        }
        C0fA.A00(this, 308568685);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    @Override // X.InterfaceC65282xQ
    public final void AVK() {
        A00(this);
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ List CCN() {
        return AbstractC166987dD.A1E();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        A00(this);
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ int BK6(String str) {
        return -1;
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ Object EFR(int i) {
        return null;
    }
}
