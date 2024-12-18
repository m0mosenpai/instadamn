package X;

import android.app.Activity;
import com.instagram.business.promote.model.PromoteData;

/* renamed from: X.Wn8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71053Wn8 implements InterfaceC1119153d {
    public final int A00;
    public final Object A01;

    public C71053Wn8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        C69595Vry A00;
        Activity activity;
        switch (this.A00) {
            case 0:
                C70399WUb.A00(((PromoteData) this.A01).A0y).A0G(VG4.A17, "boost_objective_recommendation_bottomsheet_dismiss");
                return;
            case 1:
                ViewOnClickListenerC66108Tzj viewOnClickListenerC66108Tzj = (ViewOnClickListenerC66108Tzj) this.A01;
                A00 = VWZ.A00(viewOnClickListenerC66108Tzj.A09);
                activity = viewOnClickListenerC66108Tzj.A06;
                break;
            case 2:
                C66151U1s c66151U1s = (C66151U1s) this.A01;
                A00 = VWZ.A00(c66151U1s.A04);
                activity = c66151U1s.A01;
                break;
            default:
                return;
        }
        A00.A00(activity);
    }

    @Override // X.InterfaceC1119153d
    public final /* synthetic */ void D00() {
    }
}
