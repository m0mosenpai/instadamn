package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.88W, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C88W implements InterfaceC60152ox {
    public float A00;
    public View A01;
    public boolean A02;
    public final C195208kM A03;
    public final C3I9 A04;

    public C88W(Context context, C3I9 c3i9, InterfaceC195198kL interfaceC195198kL) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c3i9, 2);
        C14360o3.A0B(interfaceC195198kL, 3);
        this.A04 = c3i9;
        this.A03 = new C195208kM(context, c3i9, interfaceC195198kL);
    }

    public final void A02(View view) {
        this.A02 = false;
        if (view != null) {
            view.requestFocus();
        }
    }

    public final void A03(View view) {
        C14360o3.A0B(view, 0);
        this.A01 = view;
        this.A00 = view.getY();
        this.A03.A02 = view;
    }

    public final void A00() {
        this.A04.A9e(this);
    }

    public final void A01() {
        this.A04.EFx(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0016, code lost:
    
        if (r3 != 0) goto L12;
     */
    @Override // X.InterfaceC60152ox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DOK(int r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.A02
            if (r0 != 0) goto L16
            if (r3 != 0) goto L18
            android.view.View r0 = r2.A01
            if (r0 == 0) goto Le
            X.AbstractC13880nE.A0S(r0)
            return
        Le:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L16:
            if (r3 == 0) goto L1b
        L18:
            r0 = 1
            r2.A02 = r0
        L1b:
            X.8kM r0 = r2.A03
            r0.DOK(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88W.DOK(int, boolean):void");
    }
}
