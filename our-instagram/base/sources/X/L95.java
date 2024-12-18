package X;

import android.content.Context;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class L95 {
    public C47224Ktx A00;
    public final Context A01;
    public final UserSession A02;
    public final C69800Vvm A03;
    public final InterfaceC09390do A04;
    public final InterfaceC16820sZ A05;

    public L95(Context context, UserSession userSession, C69800Vvm c69800Vvm, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = c69800Vvm;
        this.A05 = interfaceC16820sZ;
        this.A04 = C1XM.A00(new C50158MDl(this, 49));
    }

    public final boolean A01(List list, float f, boolean z) {
        C14360o3.A0B(list, 0);
        if (!z && this.A03.A00() >= 19.0f) {
            return false;
        }
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LatLng latLng = (LatLng) it.next();
            A0q.add(new C69020Vfw(latLng.A00, latLng.A01));
        }
        if (list.size() == 1) {
            LatLng latLng2 = (LatLng) AbstractC001800i.A0J(list);
            if (latLng2 == null) {
                return true;
            }
            A00(latLng2.A00, latLng2.A01, 17.5f, true);
            return true;
        }
        C69800Vvm c69800Vvm = this.A03;
        Context context = this.A01;
        c69800Vvm.A0E(A0q, AbstractC13690mv.A00(context, f), AbstractC44198Jg1.A02(context), AbstractC44198Jg1.A01(context), C3LA.A00(this.A02), true);
        return true;
    }

    public final void A00(double d, double d2, float f, boolean z) {
        C69800Vvm c69800Vvm = this.A03;
        c69800Vvm.A0B(d, d2, f, (int) (C3LA.A00(this.A02) * AbstractC166987dD.A09(C17s.A09(Float.valueOf((c69800Vvm.A00() - f) / 10.0f), new JTC(0.4f, 1.0f)))), z);
    }
}
