package X;

import android.content.Context;
import android.widget.AbsListView;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class J1L implements InterfaceC62602sz, InterfaceC62612t0, AbsListView.OnScrollListener {
    public Integer A00;
    public final C154796xU A01;
    public final JI1 A02;
    public final UserSession A03;
    public final C65953Twy A04;

    public J1L(Context context, AbstractC018607g abstractC018607g, UserSession userSession, JI1 ji1, String str) {
        C14360o3.A0B(userSession, 3);
        this.A03 = userSession;
        this.A02 = ji1;
        this.A00 = C05F.A0C;
        this.A04 = new C65953Twy(userSession, this, C05F.A01, 5);
        this.A01 = new C154796xU(context, abstractC018607g, userSession, str, false);
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        A01(false, false);
    }

    public final void A01(boolean z, boolean z2) {
        String str;
        Integer num = this.A00;
        Integer num2 = C05F.A00;
        if (num != num2) {
            this.A00 = num2;
            HLC hlc = new HLC(this, z, z2);
            C154796xU c154796xU = this.A01;
            if (z) {
                str = null;
            } else {
                str = c154796xU.A03.A07;
            }
            C25621Ms Ac9 = this.A02.Ac9();
            AbstractC2044893h.A06(Ac9, str);
            c154796xU.A03(Ac9.A0N(), hlc);
        }
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (this.A00 == C05F.A0C && this.A01.A05()) {
            A01(false, false);
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return !this.A02.isEmpty();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return this.A01.A05();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return AbstractC167007dF.A1X(this.A00, C05F.A01);
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        return AbstractC167007dF.A1X(this.A00, C05F.A00);
    }

    public static void A00(InterfaceC09390do interfaceC09390do) {
        ((J1L) interfaceC09390do.getValue()).A01(true, true);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        if (isLoading()) {
            return !this.A02.isEmpty();
        }
        return true;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0N = AbstractC167017dG.A0N(absListView, -856283703);
        this.A04.onScroll(absListView, i, i2, i3);
        C0f9.A0A(604609091, A0N);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, -2062936399);
        this.A04.onScrollStateChanged(absListView, i);
        C0f9.A0A(996114239, A0N);
    }
}
