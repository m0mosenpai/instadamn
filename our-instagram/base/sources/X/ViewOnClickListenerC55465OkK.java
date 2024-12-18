package X;

import android.view.View;

/* renamed from: X.OkK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55465OkK implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnClickListenerC55465OkK(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static ViewOnClickListenerC55465OkK A00(Object obj, Object obj2, int i) {
        return new ViewOnClickListenerC55465OkK(i, obj, obj2);
    }

    public static void A01(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new ViewOnClickListenerC55465OkK(i, obj, obj2), view);
    }

    public static void A02(ViewOnClickListenerC55465OkK viewOnClickListenerC55465OkK) {
        C31727DwY c31727DwY = (C31727DwY) ((C15370ps) viewOnClickListenerC55465OkK.A01).A00;
        if (c31727DwY != null) {
            c31727DwY.A04();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0433, code lost:
    
        if (r3 == null) goto L137;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r36) {
        /*
            Method dump skipped, instructions count: 5292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC55465OkK.onClick(android.view.View):void");
    }
}
