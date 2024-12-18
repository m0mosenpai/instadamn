package X;

import android.view.View;

/* renamed from: X.OkJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55464OkJ implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnClickListenerC55464OkJ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static void A01(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new ViewOnClickListenerC55464OkJ(i, obj, obj2), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0287, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC166987dD.A0r(r6.A0d), 36326464022394766L) == false) goto L84;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r23) {
        /*
            Method dump skipped, instructions count: 4208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC55464OkJ.onClick(android.view.View):void");
    }

    public static int A00(ViewOnClickListenerC55464OkJ viewOnClickListenerC55464OkJ, int i) {
        int A05 = C0f9.A05(i);
        InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) viewOnClickListenerC55464OkJ.A02;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(viewOnClickListenerC55464OkJ.A01);
        }
        return A05;
    }

    public static void A02(View view, ViewOnClickListenerC55464OkJ viewOnClickListenerC55464OkJ, O7M o7m) {
        C14360o3.A0A(view);
        View.OnClickListener onClickListener = (View.OnClickListener) viewOnClickListenerC55464OkJ.A01;
        C14360o3.A0B(view, 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - o7m.A00 >= 200 && !o7m.A01) {
            o7m.A00 = currentTimeMillis;
            onClickListener.onClick(view);
            view.performHapticFeedback(1);
        }
    }
}
