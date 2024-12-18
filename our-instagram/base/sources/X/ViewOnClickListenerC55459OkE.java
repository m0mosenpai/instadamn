package X;

import android.view.View;

/* renamed from: X.OkE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55459OkE implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ViewOnClickListenerC55459OkE(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static ViewOnClickListenerC55459OkE A00(Object obj, Object obj2, Object obj3, int i) {
        return new ViewOnClickListenerC55459OkE(i, obj, obj2, obj3);
    }

    public static void A01(View view, Object obj, Object obj2, Object obj3, int i) {
        C0fQ.A00(new ViewOnClickListenerC55459OkE(i, obj, obj2, obj3), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04b6  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r32) {
        /*
            Method dump skipped, instructions count: 3030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC55459OkE.onClick(android.view.View):void");
    }
}
