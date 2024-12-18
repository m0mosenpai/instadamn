package X;

import android.view.View;
import android.widget.Adapter;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes4.dex */
public final class AS8 implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C9NH A01;
    public final /* synthetic */ C8SE A02;

    public AS8(C9NH c9nh, C8SE c8se, int i) {
        this.A02 = c8se;
        this.A00 = i;
        this.A01 = c9nh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C23845Agu c23845Agu;
        Adapter adapter;
        int A05 = C0f9.A05(-338105978);
        C8SE c8se = this.A02;
        InterfaceC159417Dc interfaceC159417Dc = c8se.A03;
        int i = this.A00;
        interfaceC159417Dc.removeItem(i);
        c8se.notifyItemRemoved(i);
        c8se.notifyItemRangeChanged(i, c8se.getItemCount() - i);
        if (interfaceC159417Dc.isEmpty() && (adapter = c8se.A02) != null && (adapter instanceof C159637Dz)) {
            ((C159637Dz) adapter).A08 = false;
        }
        C159747Em c159747Em = c8se.A04;
        if (c159747Em != null) {
            C9NH c9nh = this.A01;
            int itemCount = c8se.getItemCount();
            C159737El c159737El = c159747Em.A00;
            if (c9nh instanceof C219829nU) {
                C219829nU c219829nU = (C219829nU) c9nh;
                DirectThreadKey A0A = C159737El.A0A(c159737El);
                if (AbstractC46860Knt.A00(c159737El.A1Z, A0A) && A0A != null) {
                    C98L c98l = c159737El.A0V;
                    InterfaceC25182BCf interfaceC25182BCf = c219829nU.A00.A01;
                    if ((interfaceC25182BCf instanceof C23845Agu) && (c23845Agu = (C23845Agu) interfaceC25182BCf) != null) {
                        c23845Agu.A01(new C50363MLp(34, A0A, c98l));
                    }
                }
            }
            if (itemCount == 0) {
                c159737El.A1F();
            }
        }
        C0f9.A0C(308209742, A05);
    }
}
