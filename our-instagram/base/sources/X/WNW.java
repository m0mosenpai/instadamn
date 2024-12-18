package X;

import android.view.View;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes11.dex */
public final class WNW implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WNW(C69179Vj8 c69179Vj8, ReelDashboardFragment reelDashboardFragment, int i) {
        this.A00 = i;
        switch (i) {
            case 38:
            case 39:
            case 40:
                this.A01 = reelDashboardFragment;
                this.A02 = c69179Vj8;
                return;
            default:
                this.A02 = reelDashboardFragment;
                this.A01 = c69179Vj8;
                return;
        }
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new WNW(i, obj, obj2), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.U29, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r18) {
        /*
            Method dump skipped, instructions count: 2126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WNW.onClick(android.view.View):void");
    }

    public WNW(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public WNW(InterfaceC71994XEi interfaceC71994XEi, C70792Wh5 c70792Wh5, int i) {
        this.A00 = i;
        if (19 - i != 0) {
            this.A01 = interfaceC71994XEi;
            this.A02 = c70792Wh5;
        } else {
            this.A02 = c70792Wh5;
            this.A01 = interfaceC71994XEi;
        }
    }
}
