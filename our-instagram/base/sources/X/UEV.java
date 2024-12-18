package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class UEV extends C04N {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ InterfaceC60152ox A02;
    public final /* synthetic */ C3I9 A03;
    public final /* synthetic */ C69554VrJ A04;
    public final /* synthetic */ C14510oO A05;

    @Override // X.C04N
    public final void A04(C04U c04u) {
        C14360o3.A0B(c04u, 0);
        AbstractC008903d.A00(this.A01, null);
        C04U.A01(this.A00, null);
        this.A03.EFx(this.A02);
        this.A04.A00(C70847WiD.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UEV(View view, View view2, InterfaceC60152ox interfaceC60152ox, C3I9 c3i9, C69554VrJ c69554VrJ, C14510oO c14510oO) {
        super(0);
        this.A04 = c69554VrJ;
        this.A05 = c14510oO;
        this.A01 = view;
        this.A00 = view2;
        this.A03 = c3i9;
        this.A02 = interfaceC60152ox;
    }

    @Override // X.C04N
    public final void A03(C04U c04u) {
        this.A04.A00(C70848WiE.A00);
        this.A05.A00 = true;
    }

    @Override // X.C04N
    public final C04M A01(C04M c04m, C04U c04u) {
        AbstractC167017dG.A1N(c04u, c04m);
        this.A04.A00(C70849WiF.A00);
        return c04m;
    }

    @Override // X.C04N
    public final C011504d A02(C011504d c011504d, List list) {
        Object obj;
        AbstractC167017dG.A1N(c011504d, list);
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if ((((C04U) obj).A00.A06() & 8) != 0) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C04U c04u = (C04U) obj;
        if (c04u != null) {
            this.A04.A00(new C66640URe(c04u));
        }
        return c011504d;
    }
}
