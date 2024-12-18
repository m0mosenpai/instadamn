package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class OkD implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public OkD(InterfaceC58311Pt3 interfaceC58311Pt3, C5HW c5hw, int i, int i2) {
        this.A00 = i2;
        if (7 - i2 != 0) {
            this.A02 = interfaceC58311Pt3;
            this.A03 = c5hw;
            this.A01 = i;
        } else {
            this.A02 = interfaceC58311Pt3;
            this.A03 = c5hw;
            this.A01 = i;
        }
    }

    public static void A00(View view, Object obj, Object obj2, int i, int i2) {
        C0fQ.A00(new OkD(i, i2, obj, obj2), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x034b, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0343  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OkD.onClick(android.view.View):void");
    }

    public OkD(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }
}
