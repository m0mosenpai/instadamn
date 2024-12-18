package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.HEb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38973HEb extends C2US implements InterfaceC65272xP, C3CQ {
    public C38321qM A00;
    public C75113Zb A01;
    public boolean A02;
    public final Context A03;
    public final C65662y2 A04;
    public final UserSession A05;
    public final C37443GeN A06;
    public final C60972qL A07;
    public final InterfaceC60442pS A08;
    public final HF7 A09;
    public final InterfaceC43455JHt A0A;
    public final C152996uT A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.2y2, java.lang.Object, X.2y0] */
    public C38973HEb(FragmentActivity fragmentActivity, C61142qc c61142qc, C60972qL c60972qL, JPp jPp, InterfaceC43455JHt interfaceC43455JHt) {
        super(false);
        AbstractC25233BEq.A0w(2, c60972qL, c61142qc, interfaceC43455JHt);
        this.A07 = c60972qL;
        this.A0A = interfaceC43455JHt;
        Context context = c60972qL.A00;
        this.A03 = context;
        UserSession userSession = c60972qL.A01;
        this.A05 = userSession;
        InterfaceC60442pS interfaceC60442pS = c60972qL.A02;
        this.A08 = interfaceC60442pS;
        ?? obj = new Object();
        this.A04 = obj;
        C152996uT c152996uT = new C152996uT(context);
        this.A0B = c152996uT;
        C37443GeN c37443GeN = new C37443GeN(fragmentActivity, fragmentActivity, c61142qc, c60972qL, true, true);
        this.A06 = c37443GeN;
        HF7 hf7 = new HF7(interfaceC60442pS, userSession, jPp);
        this.A09 = hf7;
        interfaceC43455JHt.EgQ();
        init(obj, c152996uT, c37443GeN, hf7);
    }

    public static final void A00(C38973HEb c38973HEb) {
        Object A1L;
        Object obj;
        InterfaceC65642y0 interfaceC65642y0;
        c38973HEb.A02 = true;
        c38973HEb.clear();
        c38973HEb.addModel(null, c38973HEb.A04);
        if (c38973HEb.isEmpty()) {
            InterfaceC43455JHt interfaceC43455JHt = c38973HEb.A0A;
            A1L = interfaceC43455JHt.Afz();
            obj = interfaceC43455JHt.B1M();
            interfaceC65642y0 = c38973HEb.A0B;
        } else {
            C38321qM c38321qM = c38973HEb.A00;
            if (c38321qM != null) {
                c38973HEb.addModel(c38321qM, c38973HEb.BRZ(c38321qM), c38973HEb.A06);
                InterfaceC43546JLg A03 = AbstractC82403m3.A03(c38321qM);
                if (A03 != null) {
                    A1L = AbstractC166987dD.A1L(c38321qM, A03);
                    obj = C0eB.A00;
                    interfaceC65642y0 = c38973HEb.A09;
                }
            }
            c38973HEb.notifyDataSetChanged();
        }
        c38973HEb.addModel(A1L, obj, interfaceC65642y0);
        c38973HEb.notifyDataSetChanged();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ void A8q(Object obj, int i) {
    }

    @Override // X.C3CQ
    public final boolean AJk(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return C14360o3.A0K(this.A00, c38321qM);
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C75113Zb c75113Zb = this.A01;
        if (c75113Zb == null) {
            C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
            A0E.A0D(0);
            this.A01 = A0E;
            return A0E;
        }
        return c75113Zb;
    }

    @Override // X.InterfaceC65282xQ
    public final void Ct5() {
        this.A02 = false;
    }

    @Override // X.InterfaceC65272xP
    public final void ETA(InterfaceC686036x interfaceC686036x) {
        C14360o3.A0B(interfaceC686036x, 0);
        this.A06.A03(interfaceC686036x);
    }

    @Override // X.InterfaceC65272xP
    public final void EUR(C33P c33p) {
        C14360o3.A0B(c33p, 0);
        this.A06.A03 = c33p;
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return this.A02;
    }

    @Override // X.C2UT, android.widget.Adapter
    public final boolean isEmpty() {
        return AbstractC25229BEm.A1Z(this.A00);
    }

    @Override // X.InterfaceC65282xQ
    public final void AVK() {
        A00(this);
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ List CCN() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ int BK6(String str) {
        return -1;
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        notifyDataSetChanged();
    }

    @Override // X.C3CQ
    public final void DSP(C38321qM c38321qM) {
        A00(this);
    }

    @Override // X.InterfaceC65282xQ
    public final /* synthetic */ Object EFR(int i) {
        return null;
    }
}
