package X;

import android.widget.EditText;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.Em4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33266Em4 extends WKa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EditText A01;
    public final /* synthetic */ C32276EJl A02;
    public final /* synthetic */ IgLinearLayout A03;

    public C33266Em4(EditText editText, C32276EJl c32276EJl, IgLinearLayout igLinearLayout, int i) {
        this.A01 = editText;
        this.A02 = c32276EJl;
        this.A00 = i;
        this.A03 = igLinearLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (r4 == false) goto L9;
     */
    @Override // X.WKa, android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r9) {
        /*
            r8 = this;
            android.widget.EditText r3 = r8.A01
            X.C14360o3.A0A(r3)
            boolean r0 = X.AbstractC35050FcN.A02(r3)
            r4 = r0 ^ 1
            if (r4 != 0) goto L1c
            X.EJl r0 = r8.A02
            android.content.Context r2 = r0.requireContext()
            X.C14360o3.A0A(r3)
            int r1 = r8.A00
            r0 = 0
            X.AbstractC35050FcN.A00(r2, r3, r1, r0)
        L1c:
            com.instagram.common.ui.base.IgLinearLayout r3 = r8.A03
            int r2 = r8.A00
            r7 = 0
            r0 = 2131437937(0x7f0b2971, float:1.8497787E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 1
            if (r2 <= r0) goto L2e
            r0 = 0
            if (r4 != 0) goto L30
        L2e:
            r0 = 8
        L30:
            r1.setVisibility(r0)
            X.EJl r6 = r8.A02
            android.content.Context r1 = r6.requireContext()
            r0 = 2131231471(0x7f0802ef, float:1.8079024E38)
            if (r4 == 0) goto L41
            r0 = 2131231470(0x7f0802ee, float:1.8079022E38)
        L41:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            if (r0 == 0) goto Lb1
            r3.setBackground(r0)
            android.view.ViewGroup r3 = r6.A01
            if (r3 == 0) goto Lb0
            int r1 = r3.getChildCount()
            r0 = 3
            if (r1 < r0) goto Lb0
            r0 = 2
            android.view.View r0 = r3.getChildAt(r0)
            r5 = 2131437388(0x7f0b274c, float:1.8496673E38)
            android.view.View r0 = X.AbstractC166987dD.A0c(r0, r5)
            android.widget.EditText r0 = (android.widget.EditText) r0
            boolean r4 = X.AbstractC35050FcN.A02(r0)
            int r0 = r3.getChildCount()
            r2 = 4
            if (r0 >= r2) goto L7c
            if (r4 != 0) goto L7c
            int r1 = r3.getChildCount()
            r0 = 0
            com.instagram.common.ui.base.IgLinearLayout r0 = X.C32276EJl.A00(r6, r0, r1, r7)
            r3.addView(r0)
        L7c:
            int r0 = r3.getChildCount()
            if (r0 != r2) goto Lb0
            if (r4 == 0) goto Lb0
            int r0 = r3.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r3.getChildAt(r0)
            android.view.View r0 = X.AbstractC166987dD.A0c(r0, r5)
            android.widget.EditText r0 = (android.widget.EditText) r0
            boolean r0 = X.AbstractC35050FcN.A02(r0)
            if (r0 == 0) goto Lb0
            int r0 = r3.getChildCount()
            int r0 = r0 + (-1)
            r3.removeViewAt(r0)
            int r0 = r3.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r0 = r3.getChildAt(r0)
            r0.requestFocus()
        Lb0:
            return
        Lb1:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33266Em4.afterTextChanged(android.text.Editable):void");
    }
}
