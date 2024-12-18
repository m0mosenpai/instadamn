package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.FoJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35628FoJ implements View.OnClickListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ FME A02;
    public final /* synthetic */ C155706yz A03;
    public final /* synthetic */ L9S A04;
    public final /* synthetic */ String A05;

    public ViewOnClickListenerC35628FoJ(InterfaceC11380iw interfaceC11380iw, UserSession userSession, FME fme, C155706yz c155706yz, L9S l9s, String str) {
        this.A02 = fme;
        this.A03 = c155706yz;
        this.A01 = userSession;
        this.A05 = str;
        this.A04 = l9s;
        this.A00 = interfaceC11380iw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        java.util.Set A1H;
        int A05 = C0f9.A05(211624840);
        this.A02.A00.setVisibility(8);
        this.A03.A0D = false;
        C23031Ai A00 = AbstractC23021Ah.A00(this.A01);
        String str = this.A05;
        InterfaceC19630xq interfaceC19630xq = A00.A01;
        String A002 = AbstractC111324zv.A00(3828);
        if (interfaceC19630xq.contains(A002)) {
            A1H = AbstractC001800i.A0j(interfaceC19630xq.C2v(A002));
        } else {
            A1H = AbstractC166987dD.A1H();
        }
        A1H.add(str);
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7L(A002, A1H);
        ARD.apply();
        AbstractC003100w.A0k(10, str);
        this.A00.getModuleName();
        C0f9.A0C(1284869631, A05);
    }
}
