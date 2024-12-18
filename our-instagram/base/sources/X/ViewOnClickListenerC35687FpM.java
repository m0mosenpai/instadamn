package X;

import android.view.View;

/* renamed from: X.FpM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35687FpM implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnClickListenerC35687FpM(EnumC53382NjX enumC53382NjX, C33227ElJ c33227ElJ, int i) {
        this.A00 = i;
        if (58 - i != 0) {
            this.A01 = enumC53382NjX;
            this.A02 = c33227ElJ;
        } else {
            this.A02 = c33227ElJ;
            this.A01 = enumC53382NjX;
        }
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new ViewOnClickListenerC35687FpM(i, obj, obj2), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x07b9, code lost:
    
        if (X.C14360o3.A0K(r7.A08, r10) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x07e3, code lost:
    
        if (r1.A01.isEmpty() == false) goto L168;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r23) {
        /*
            Method dump skipped, instructions count: 3986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC35687FpM.onClick(android.view.View):void");
    }

    public ViewOnClickListenerC35687FpM(AbstractC59962oe abstractC59962oe, C31721DwQ c31721DwQ, int i) {
        this.A00 = i;
        this.A01 = c31721DwQ;
        this.A02 = abstractC59962oe;
    }

    public ViewOnClickListenerC35687FpM(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
