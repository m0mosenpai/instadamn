package X;

import android.widget.AbsListView;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class PIC implements InterfaceC62602sz, InterfaceC62612t0, AbsListView.OnScrollListener {
    public Integer A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final InterfaceC58157PqM A06;
    public final C65953Twy A07;
    public final InterfaceC37294Gbv A08;
    public final C65974TxR A09;
    public final C169487hO A0A;

    public abstract String A00();

    public void A02(C25621Ms c25621Ms) {
    }

    public void A03(ProductSource productSource) {
    }

    public void A04(String str) {
    }

    public void A05(List list) {
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A06(false);
    }

    public final void A01() {
        this.A0A.clear();
        this.A02 = null;
    }

    public final void A06(boolean z) {
        this.A03 = z;
        if (z) {
            this.A02 = null;
            C169487hO c169487hO = this.A0A;
            if (c169487hO.BjP(this.A01).A01 == C05F.A0C) {
                InterfaceC58157PqM interfaceC58157PqM = this.A06;
                List list = c169487hO.BjP(this.A01).A06;
                list.getClass();
                interfaceC58157PqM.DO1(this.A01, list, true, this.A04);
                return;
            }
            this.A09.A06(this.A01);
            return;
        }
        this.A09.A03(this.A01);
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (this.A00 == C05F.A0C && this.A04 && this.A02 != null) {
            A06(false);
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return !this.A06.isEmpty();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return this.A04;
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return AbstractC167007dF.A1X(this.A00, C05F.A01);
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return AbstractC167007dF.A1X(this.A00, C05F.A00);
    }

    public PIC(UserSession userSession, InterfaceC58157PqM interfaceC58157PqM) {
        C56711PFd c56711PFd = new C56711PFd(this, 2);
        this.A08 = c56711PFd;
        this.A00 = C05F.A0C;
        this.A01 = "";
        this.A05 = userSession;
        this.A06 = interfaceC58157PqM;
        C169487hO c169487hO = new C169487hO();
        this.A0A = c169487hO;
        this.A09 = AbstractC65980TxZ.A01(userSession, null, null, c56711PFd, c169487hO, C05F.A00, false);
        this.A07 = new C65953Twy(userSession, this, C05F.A01, 5);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (isLoading()) {
            return !this.A06.isEmpty();
        }
        return true;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03 = C0f9.A03(-1497324974);
        this.A07.onScroll(absListView, i, i2, i3);
        C0f9.A0A(98569853, A03);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = C0f9.A03(501763814);
        this.A07.onScrollStateChanged(absListView, i);
        C0f9.A0A(-589133773, A03);
    }
}
