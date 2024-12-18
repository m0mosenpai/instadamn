package X;

import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes11.dex */
public class UEH extends C02V {
    public final TextInputLayout A00;

    public UEH(TextInputLayout textInputLayout) {
        this.A00 = textInputLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (r9 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        if (android.text.TextUtils.isEmpty(r12) == false) goto L9;
     */
    @Override // X.C02V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0Y(android.view.View r14, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r15) {
        /*
            r13 = this;
            super.A0Y(r14, r15)
            com.google.android.material.textfield.TextInputLayout r7 = r13.A00
            android.widget.EditText r2 = r7.A0F
            if (r2 == 0) goto La5
            android.text.Editable r5 = r2.getText()
        Ld:
            java.lang.CharSequence r6 = r7.getHint()
            java.lang.CharSequence r3 = r7.getError()
            java.lang.CharSequence r9 = r7.getPlaceholderText()
            int r4 = r7.A07
            java.lang.CharSequence r12 = r7.getCounterOverflowDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r11 = r0 ^ 1
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = r0 ^ 1
            boolean r0 = r7.A0R
            r10 = r0 ^ 1
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r8 = r0 ^ 1
            if (r8 != 0) goto L3e
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r7 = 0
            if (r0 != 0) goto L3f
        L3e:
            r7 = 1
        L3f:
            if (r1 == 0) goto La2
            java.lang.String r6 = r6.toString()
        L45:
            java.lang.String r1 = ", "
            if (r11 == 0) goto L82
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setText(r5)
        L4e:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L60
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setHintText(r6)
            r1 = r11 ^ 1
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setShowingHintText(r1)
        L60:
            if (r5 == 0) goto L80
            int r0 = r5.length()
            if (r0 != r4) goto L80
        L68:
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setMaxTextLength(r4)
            if (r7 == 0) goto L77
            if (r8 != 0) goto L72
            r3 = r12
        L72:
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setError(r3)
        L77:
            if (r2 == 0) goto L7f
            r0 = 2131442739(0x7f0b3c33, float:1.8507526E38)
            r2.setLabelFor(r0)
        L7f:
            return
        L80:
            r4 = -1
            goto L68
        L82:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L9f
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setText(r6)
            if (r10 == 0) goto L4e
            if (r9 == 0) goto L4e
            java.lang.StringBuilder r0 = X.AbstractC166997dE.A11(r6)
            java.lang.String r9 = X.AbstractC167017dG.A0n(r9, r1, r0)
        L99:
            android.view.accessibility.AccessibilityNodeInfo r0 = r15.mInfo
            r0.setText(r9)
            goto L4e
        L9f:
            if (r9 == 0) goto L4e
            goto L99
        La2:
            java.lang.String r6 = ""
            goto L45
        La5:
            r5 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UEH.A0Y(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
    }
}
