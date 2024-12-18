package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;

/* loaded from: classes11.dex */
public final class WMY implements View.OnClickListener {
    public final /* synthetic */ C42520Irz A00;
    public final /* synthetic */ C63922vD A01;
    public final /* synthetic */ C42666IuN A02;

    public WMY(C42520Irz c42520Irz, C63922vD c63922vD, C42666IuN c42666IuN) {
        this.A01 = c63922vD;
        this.A00 = c42520Irz;
        this.A02 = c42666IuN;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-684742364);
        C63922vD c63922vD = this.A01;
        C42520Irz c42520Irz = this.A00;
        C42666IuN c42666IuN = this.A02;
        C70093W2q c70093W2q = new C70093W2q(c63922vD.A02, c63922vD.A03, c42520Irz, c63922vD.A04);
        c70093W2q.A00 = new C69116Vi6(c42520Irz, c63922vD, c42666IuN);
        Fragment fragment = c70093W2q.A02;
        Context context = fragment.getContext();
        if (context != null) {
            C193328hC c193328hC = new C193328hC(context);
            c193328hC.A0m(fragment, c70093W2q.A03);
            c193328hC.A0f(new WHK(c70093W2q), C70093W2q.A00(c70093W2q));
            AbstractC31178DnM.A1R(c193328hC, true);
        }
        C0f9.A0C(2136269720, A05);
    }
}
