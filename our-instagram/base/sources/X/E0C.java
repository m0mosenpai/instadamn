package X;

/* loaded from: classes6.dex */
public final class E0C extends AbstractC70653Fc {
    public final int A00;
    public final Object A01;

    public E0C(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.fragment.app.Fragment] */
    @Override // X.AbstractC70653Fc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(android.graphics.Rect r7, android.view.View r8, androidx.recyclerview.widget.RecyclerView r9, X.C3F5 r10) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L75;
                case 1: goto L63;
                case 2: goto L4e;
                case 3: goto L29;
                default: goto L5;
            }
        L5:
            X.AbstractC167027dH.A12(r7, r8, r9)
            int r1 = androidx.recyclerview.widget.RecyclerView.A02(r8)
            X.2UU r0 = r9.A0A
            if (r0 == 0) goto L27
            int r0 = r0.getItemCount()
        L14:
            int r0 = r0 + (-1)
            if (r1 != r0) goto L26
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r0 = r0.requireContext()
            int r0 = X.AbstractC167017dG.A0E(r0)
            r7.bottom = r0
        L26:
            return
        L27:
            r0 = 0
            goto L14
        L29:
            X.AbstractC167027dH.A12(r7, r8, r9)
            int r1 = androidx.recyclerview.widget.RecyclerView.A02(r8)
            X.2UU r0 = r9.A0A
            if (r0 == 0) goto L4c
            int r0 = r0.getItemCount()
        L38:
            if (r1 != 0) goto L14
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r0)
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r7.top = r0
            return
        L4c:
            r0 = 0
            goto L38
        L4e:
            int r0 = androidx.recyclerview.widget.RecyclerView.A02(r8)
            if (r0 == 0) goto L26
            java.lang.Object r0 = r6.A01
            X.FQY r0 = (X.FQY) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A01
            android.content.Context r0 = r0.getContext()
            int r0 = X.AbstractC167017dG.A06(r0)
            goto Lb5
        L63:
            boolean r5 = X.AbstractC167017dG.A1a(r7, r8)
            r0 = 2
            X.C14360o3.A0B(r9, r0)
            int r2 = androidx.recyclerview.widget.RecyclerView.A02(r8)
            int r2 = r2 % r0
            java.lang.Object r4 = r6.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            goto L97
        L75:
            boolean r5 = X.AbstractC167017dG.A1a(r7, r8)
            r3 = 2
            X.C14360o3.A0B(r9, r3)
            int r2 = androidx.recyclerview.widget.RecyclerView.A02(r8)
            java.lang.Object r4 = r6.A01
            X.EOJ r4 = (X.EOJ) r4
            X.Dz7 r0 = r4.A0E()
            X.E6h r0 = X.Dz7.A00(r0)
            if (r0 == 0) goto L94
            X.Jzp r1 = r0.A02
            r0 = 1
            if (r1 != 0) goto L95
        L94:
            r0 = 0
        L95:
            int r2 = r2 - r0
            int r2 = r2 % r3
        L97:
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r4)
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = X.AbstractC31171DnF.A02(r1, r0)
            r7.bottom = r0
            if (r2 != r5) goto L26
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r4)
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            float r1 = r1.getDimension(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            int r0 = (int) r1
        Lb5:
            r7.left = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E0C.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.3F5):void");
    }
}
