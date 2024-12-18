package X;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HHs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39068HHs extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C42315Iod c42315Iod = (C42315Iod) interfaceC66482zP;
        C38482Gw3 c38482Gw3 = (C38482Gw3) c3oo;
        AbstractC167017dG.A1N(c42315Iod, c38482Gw3);
        AbstractC37302Gc3.A06(c38482Gw3.A04).setText(c42315Iod.A00.A03);
        I64.A00(c38482Gw3, c42315Iod);
        Handler handler = c38482Gw3.A01;
        handler.removeCallbacksAndMessages(null);
        RunnableC43131J4u runnableC43131J4u = new RunnableC43131J4u(c38482Gw3, c42315Iod);
        c38482Gw3.A00 = runnableC43131J4u;
        handler.postDelayed(runnableC43131J4u, 1000L);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42315Iod.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        return new C38482Gw3(AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.incentive_simple_banner_layout, false));
    }
}
