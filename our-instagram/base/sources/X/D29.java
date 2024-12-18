package X;

/* loaded from: classes5.dex */
public final class D29 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C25531Mh A01;
    public final /* synthetic */ PU6 A02;

    public D29(C25531Mh c25531Mh, PU6 pu6, int i) {
        this.A02 = pu6;
        this.A01 = c25531Mh;
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r12 = r4.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r4 != null) goto L15;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r13 = this;
            X.1Mh r2 = r13.A01
            int r5 = r13.A00
            r1 = 0
            X.C14360o3.A0B(r2, r1)
            boolean r0 = X.AbstractC25226BEj.A1Z(r2)
            if (r0 == 0) goto Le2
            X.CbC r10 = X.C28165CbC.A01
            r8 = 0
            X.Vrn r0 = r10.A00
            java.util.ArrayList r7 = r0.A00()
            r12 = 0
            if (r7 == 0) goto Le2
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto Le2
            int r0 = r7.size()
            r4 = r12
        L25:
            int r6 = r0 + (-1)
            if (r0 <= 0) goto Le6
            java.lang.Object r4 = r7.get(r6)
            X.Vdy r4 = (X.C68901Vdy) r4
            android.view.View r3 = r4.A00
            boolean r0 = X.C14360o3.A0K(r3, r8)
            if (r0 != 0) goto Le3
            r0 = 2131432985(0x7f0b1619, float:1.8487743E38)
            java.lang.Object r3 = r3.getTag(r0)
            r0 = 1
            boolean r0 = X.AbstractC166997dE.A1Z(r3, r0)
            if (r0 != 0) goto Le3
        L45:
            android.view.View r12 = r4.A00
        L47:
            boolean r0 = r12 instanceof android.view.ViewGroup
            if (r0 == 0) goto Le2
            r0 = 2
            X.C14360o3.A0B(r12, r0)
            java.lang.Integer r11 = X.C05F.A00
            X.Be5 r7 = new X.Be5
            r9 = r8
            r7.<init>(r8, r9, r10, r11, r12)
            X.CTO r0 = X.Be8.A00
            r0.A00(r7)
            java.lang.Object r0 = r7.A02
            android.view.View r0 = (android.view.View) r0
            X.C14360o3.A0B(r0, r1)
            int[] r4 = X.AbstractC28368CfU.A0B
            r0.getLocationOnScreen(r4)
            android.graphics.Rect r3 = X.AbstractC25236BEt.A0C(r0)
            r1 = r4[r1]
            r0 = 1
            r0 = r4[r0]
            r3.offsetTo(r1, r0)
            org.json.JSONObject r0 = X.CCD.A00(r7)
            java.lang.String r1 = X.AbstractC166987dD.A19(r0)
            java.lang.String r0 = "tree"
            r2.A0R(r0, r1)
            long r0 = (long) r5
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 1027(0x403, float:1.439E-42)
            java.lang.String r0 = X.MSV.A00(r0)
            r2.A0Q(r0, r1)
            java.lang.String r1 = r3.flattenToString()
            java.lang.String r0 = "root_view_bounds_on_screen"
            r2.A0R(r0, r1)
            X.1Rh r0 = X.C26771Rh.A00()
            java.lang.String r1 = r0.A00
            X.C14360o3.A07(r1)
            java.lang.String r0 = "not_initialized"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lab
            java.lang.String r1 = "(null)"
        Lab:
            java.lang.String r0 = "client_current_module"
            r2.A0R(r0, r1)
            java.lang.String r1 = "(null)"
            java.lang.String r0 = "client_current_module_tag"
            r2.A0R(r0, r1)
            r0 = 1018(0x3fa, float:1.427E-42)
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            java.lang.String r0 = "pipeline"
            r2.A0R(r0, r1)
            int r0 = X.AbstractC12880la.A00()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "build_id"
            r2.A0Q(r0, r1)
            r0 = 1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 4852(0x12f4, float:6.799E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.A0Q(r0, r1)
            r2.Cht()
        Le2:
            return
        Le3:
            r0 = r6
            goto L25
        Le6:
            if (r4 == 0) goto L47
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D29.run():void");
    }
}
