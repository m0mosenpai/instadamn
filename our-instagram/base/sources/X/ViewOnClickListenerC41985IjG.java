package X;

import android.view.View;
import java.util.List;

/* renamed from: X.IjG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41985IjG implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C42520Irz A01;
    public final /* synthetic */ C693439u A02;
    public final /* synthetic */ C38525Gwl A03;
    public final /* synthetic */ C42666IuN A04;

    public ViewOnClickListenerC41985IjG(C42520Irz c42520Irz, C693439u c693439u, C38525Gwl c38525Gwl, C42666IuN c42666IuN, int i) {
        this.A01 = c42520Irz;
        this.A00 = i;
        this.A02 = c693439u;
        this.A03 = c38525Gwl;
        this.A04 = c42666IuN;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1680976602);
        C42520Irz c42520Irz = this.A01;
        List list = c42520Irz.A01.A0A;
        if (list == null) {
            list = C16930sl.A00;
        }
        String Bks = ((InterfaceC39331sE) list.get(this.A00)).Bks();
        InterfaceC692739n interfaceC692739n = this.A02.A00;
        C38525Gwl c38525Gwl = this.A03;
        interfaceC692739n.Dth(C1XV.A0K, c38525Gwl.A01, c42520Irz.getId(), c42520Irz.CAR(), Bks, null, null, null, -1, -1, false, false, false);
        this.A04.A01 = C05F.A00;
        C693539v.A06(c38525Gwl);
        C0f9.A0C(496612442, A05);
    }
}
