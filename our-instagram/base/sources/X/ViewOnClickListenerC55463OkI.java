package X;

import android.view.View;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;

/* renamed from: X.OkI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55463OkI implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC55463OkI(ReelDashboardFragment reelDashboardFragment, int i) {
        this.A00 = i;
        if (52 - i != 0) {
            this.A01 = reelDashboardFragment;
        } else {
            this.A01 = reelDashboardFragment;
        }
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC55463OkI(obj, i), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0bd6, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5, 36318492563085538L) == false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02ce, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r4, 36321206982616278L) == false) goto L57;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0bca  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r20) {
        /*
            Method dump skipped, instructions count: 3288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC55463OkI.onClick(android.view.View):void");
    }

    public ViewOnClickListenerC55463OkI(ReelMoreOptionsFragment reelMoreOptionsFragment, int i) {
        this.A00 = i;
        if (54 - i != 0) {
            this.A01 = reelMoreOptionsFragment;
        } else {
            this.A01 = reelMoreOptionsFragment;
        }
    }

    public ViewOnClickListenerC55463OkI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
