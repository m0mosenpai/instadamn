package X;

import android.view.ViewStub;
import android.widget.TextView;

/* renamed from: X.6oH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149646oH implements InterfaceC60152ox {
    public boolean A00;
    public TextView A01;
    public final ViewStub A02;

    public C149646oH(ViewStub viewStub, C3I9 c3i9) {
        C14360o3.A0B(viewStub, 1);
        C14360o3.A0B(c3i9, 2);
        this.A02 = viewStub;
        c3i9.A9e(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C17N r5, boolean r6) {
        /*
            r4 = this;
            r2 = 0
            r0 = 1
            r4.A00 = r0
            android.widget.TextView r1 = r4.A01
            if (r1 != 0) goto L19
            android.view.ViewStub r0 = r4.A02
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.C14360o3.A0C(r1, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4.A01 = r1
            if (r1 == 0) goto L1c
        L19:
            r1.setBackgroundColor(r2)
        L1c:
            android.widget.TextView r3 = r4.A01
            if (r3 == 0) goto L33
            r0 = 0
            if (r6 == 0) goto L4c
            android.content.res.Resources r1 = r3.getResources()
            if (r1 == 0) goto L30
            r0 = 2131971219(0x7f134c93, float:1.9579411E38)
            java.lang.String r0 = r1.getString(r0)
        L30:
            r3.setText(r0)
        L33:
            boolean r0 = X.C14640oc.A0H()
            if (r0 == 0) goto L4b
            android.widget.TextView r2 = r4.A01
            if (r2 == 0) goto L4b
            android.content.Context r1 = r2.getContext()
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r0 = r1.getColor(r0)
            r2.setTextColor(r0)
        L4b:
            return
        L4c:
            android.content.res.Resources r2 = r3.getResources()
            if (r2 == 0) goto L30
            r1 = 2131971234(0x7f134ca2, float:1.9579442E38)
            java.lang.String r0 = r5.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r2.getString(r1, r0)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C149646oH.A00(X.17N, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r5 <= 0) goto L8;
     */
    @Override // X.InterfaceC60152ox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DOK(int r5, boolean r6) {
        /*
            r4 = this;
            android.widget.TextView r3 = r4.A01
            if (r3 == 0) goto L29
            boolean r0 = r4.A00
            if (r0 == 0) goto Lb
            r0 = 0
            if (r5 > 0) goto Ld
        Lb:
            r0 = 8
        Ld:
            r3.setVisibility(r0)
            if (r6 == 0) goto L29
            android.content.Context r0 = r3.getContext()
            X.C14360o3.A07(r0)
            int r2 = X.AbstractC13880nE.A09(r0)
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            X.ATk r0 = new X.ATk
            r0.<init>(r3, r2, r5)
            r1.addOnGlobalLayoutListener(r0)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C149646oH.DOK(int, boolean):void");
    }
}
