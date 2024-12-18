package X;

import android.content.res.Resources;
import android.widget.TextView;

/* loaded from: classes9.dex */
public final class NID extends AbstractC51365MmQ {
    public final TextView A00;
    public final EnumC53277NhF A01;
    public final boolean A02;
    public final Resources A03;
    public final boolean A04;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NID(android.content.Context r18, X.InterfaceC58200Pr6 r19, X.EnumC53277NhF r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            r17 = this;
            r9 = 1
            r6 = 0
            X.McW r4 = new X.McW
            r5 = r18
            r8 = r21
            r12 = r22
            r7 = r23
            r10 = r6
            r11 = r6
            r13 = r6
            r14 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.9iG r15 = X.AbstractC226859zh.A00(r5, r8, r8)
            r10 = r17
            r14 = r19
            r11 = r5
            r12 = r4
            r13 = r4
            r16 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0 = r24
            r10.A02 = r0
            r0 = r25
            r10.A04 = r0
            r0 = r20
            r10.A01 = r0
            android.content.res.Resources r4 = r5.getResources()
            r10.A03 = r4
            X.McW r3 = r10.A01
            android.view.LayoutInflater r1 = X.AbstractC25228BEl.A0P(r3)
            int r0 = r0.A04
            android.view.View r2 = r1.inflate(r0, r3, r6)
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.C14360o3.A0C(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r10.A00 = r2
            r0 = 2130971224(0x7f040a58, float:1.755118E38)
            java.lang.Integer r0 = X.AbstractC53242c7.A0J(r5, r0)
            if (r0 == 0) goto L89
            int r0 = r0.intValue()
        L57:
            r3.A06 = r0
            X.AbstractC51365MmQ.A00(r4, r3)
            if (r26 == 0) goto L84
            r0 = 2131165305(0x7f070079, float:1.7944823E38)
            float r0 = r4.getDimension(r0)
            int r1 = (int) r0
        L66:
            r0 = -2
            X.MSY.A10(r3, r0, r1)
            r0 = 16
            X.AbstractC13880nE.A0X(r2, r0)
            r2.setHorizontalFadingEdgeEnabled(r6)
            r2.setVerticalFadingEdgeEnabled(r6)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r0)
            r2.setSingleLine(r9)
            r2.setSelected(r9)
            r3.addView(r2)
            return
        L84:
            int r1 = X.AbstractC50522MSa.A06(r5)
            goto L66
        L89:
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r0 = r4.getDimensionPixelSize(r0)
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NID.<init>(android.content.Context, X.Pr6, X.NhF, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x020e, code lost:
    
        if (r0 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x018f, code lost:
    
        if (r0 == 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01a9, code lost:
    
        if (r0 != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01b1, code lost:
    
        if (r12 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r10 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r20.AzK() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0108, code lost:
    
        if (r0 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010a, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0210, code lost:
    
        r14 = X.AbstractC43593JPy.A0A(r10, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0221, code lost:
    
        if (r14.getBitmap().getHeight() <= r12) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0223, code lost:
    
        r12 = r12 / r14.getBitmap().getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0230, code lost:
    
        if (r12 == 1.0f) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0232, code lost:
    
        r0 = X.C0fK.A00(r14.getBitmap(), (int) (r14.getBitmap().getWidth() * r12), (int) (r14.getBitmap().getHeight() * r12), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0250, code lost:
    
        if (r0 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0252, code lost:
    
        r1 = X.AbstractC43593JPy.A0A(r10, r0);
        r11 = r19.A00;
        r13 = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{r5, r1});
        r13.setLayerInset(0, 0, 0, X.MSX.A01(r10), 0);
        r13.setLayerGravity(0, 19);
        r13.setLayerGravity(1, 21);
        r13.setBounds(0, 0, (int) ((r3 + X.AbstractC13880nE.A04(r10, 8)) + r1.getIntrinsicWidth()), java.lang.Math.max(r3, r1.getIntrinsicHeight()));
        r4 = r13.getDrawable(0);
        r1 = X.AbstractC166987dD.A0C(r10, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x029c, code lost:
    
        if (r4 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x029e, code lost:
    
        r4.setBounds(0, r1, r3, r3 + r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02a3, code lost:
    
        r11.setCompoundDrawables(r13, null, null, null);
        r11.setText("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02bd, code lost:
    
        r0 = r14.getBitmap();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fb  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.InterfaceC58166PqW r20, int r21) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NID.A00(X.PqW, int):void");
    }
}
