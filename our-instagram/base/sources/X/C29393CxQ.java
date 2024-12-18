package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import java.util.List;

/* renamed from: X.CxQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29393CxQ implements InterfaceC31076DlJ {
    public final /* synthetic */ C41176IKp A00;
    public final /* synthetic */ CU0 A01;

    @Override // X.InterfaceC31076DlJ
    public final void D5J(C38321qM c38321qM, C75113Zb c75113Zb) {
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void D5R(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void D8f(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void DFC(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void DOH() {
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void DTX(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void Djp(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwK(C38321qM c38321qM, C75113Zb c75113Zb, Integer num, boolean z) {
        C14360o3.A0B(num, 2);
        this.A01.A00(c38321qM, c75113Zb, num);
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void DwL(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void DwM(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void DwP() {
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void DwQ(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void DwR(List list, String str) {
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void DwS(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void DwT(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void DwU(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwX(C38321qM c38321qM, C75113Zb c75113Zb, boolean z, boolean z2) {
        C14360o3.A0B(c38321qM, 0);
        AbstractC25227BEk.A1N(c38321qM, c75113Zb, this.A00.A0G, z);
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void DwZ(C38321qM c38321qM, C75113Zb c75113Zb) {
    }

    @Override // X.InterfaceC31076DlJ
    public final /* synthetic */ void Dwb(C38321qM c38321qM) {
    }

    public C29393CxQ(C41176IKp c41176IKp, CU0 cu0) {
        this.A00 = c41176IKp;
        this.A01 = cu0;
    }

    @Override // X.InterfaceC31076DlJ
    public final void DJ4(C38321qM c38321qM) {
        this.A00.A03.invoke(c38321qM);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DX3(C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A00.A09.invoke(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwV(C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A00.A08.invoke(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwW(C38321qM c38321qM, C75113Zb c75113Zb) {
        CU0 cu0 = this.A01;
        Venue A27 = c38321qM.A27();
        if (A27 != null) {
            AbstractC37834Gko.A05(cu0.A00, cu0.A01, A27);
        }
    }

    @Override // X.InterfaceC31076DlJ
    public final void Dwa(C38321qM c38321qM) {
        InterfaceC110104xf AdG;
        CU0 cu0 = this.A01;
        UserSession userSession = cu0.A01;
        InterfaceC110214xq A1R = c38321qM.A1R();
        if (A1R != null && (AdG = A1R.AdG()) != null) {
            AbstractC37834Gko.A06(cu0.A00, userSession, AdG.getTemplateMediaId());
        }
    }
}
