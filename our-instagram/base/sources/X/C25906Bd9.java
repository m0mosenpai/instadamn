package X;

/* renamed from: X.Bd9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25906Bd9 extends AbstractC70653Fc {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25906Bd9) {
                C25906Bd9 c25906Bd9 = (C25906Bd9) obj;
                if (!C14360o3.A0K(this.A00, c25906Bd9.A00) || !C14360o3.A0K(this.A02, c25906Bd9.A02) || !C14360o3.A0K(this.A01, c25906Bd9.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C25906Bd9(Integer num, Integer num2, Integer num3) {
        this.A00 = num;
        this.A02 = num2;
        this.A01 = num3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (((X.AbstractC70663Fe) r2).A07.getLayoutDirection() != r3) goto L10;
     */
    @Override // X.AbstractC70653Fc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getItemOffsets(android.graphics.Rect r12, android.view.View r13, androidx.recyclerview.widget.RecyclerView r14, X.C3F5 r15) {
        /*
            r11 = this;
            boolean r3 = X.AbstractC25233BEq.A1b(r12, r13, r14)
            X.3Fe r2 = r14.A0D
            boolean r0 = r2 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L6b
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            if (r2 == 0) goto L6b
            int r0 = r2.A01
            r10 = 1
            r4 = 0
            r9 = 0
            if (r0 != 0) goto L1f
            r9 = 1
            androidx.recyclerview.widget.RecyclerView r0 = r2.A07
            int r1 = r0.getLayoutDirection()
            r0 = 1
            if (r1 == r3) goto L20
        L1f:
            r0 = 0
        L20:
            boolean r7 = r2.A08
            r7 = r7 ^ r0
            java.lang.Integer r0 = r11.A02
            int r6 = X.AbstractC167017dG.A0K(r0)
            java.lang.Integer r0 = r11.A01
            int r8 = X.AbstractC167017dG.A0K(r0)
            java.lang.Integer r0 = r11.A00
            int r5 = X.AbstractC167017dG.A0K(r0)
            int r3 = androidx.recyclerview.widget.RecyclerView.A02(r13)
            r2 = -1
            if (r3 == r2) goto L6b
            boolean r1 = X.AbstractC167007dF.A1N(r3)
            X.2UU r0 = r14.A0A
            if (r0 == 0) goto L4a
            int r0 = r0.getItemCount()
            int r2 = r0 + (-1)
        L4a:
            if (r3 == r2) goto L4d
            r10 = 0
        L4d:
            if (r1 == 0) goto L5c
            r0 = 0
            if (r7 == 0) goto L77
            if (r9 == 0) goto L55
            r0 = r6
        L55:
            r12.right = r0
            if (r9 == 0) goto L5a
            r6 = 0
        L5a:
            r12.bottom = r6
        L5c:
            r0 = 0
            if (r10 == 0) goto L6c
            if (r7 == 0) goto L8b
            if (r9 == 0) goto L64
            r0 = r8
        L64:
            r12.left = r0
            if (r9 != 0) goto L69
            r4 = r8
        L69:
            r12.top = r4
        L6b:
            return
        L6c:
            if (r7 == 0) goto L82
            if (r9 == 0) goto L71
            r0 = r5
        L71:
            r12.left = r0
            if (r9 != 0) goto L69
            r4 = r5
            goto L69
        L77:
            if (r9 == 0) goto L7a
            r0 = r6
        L7a:
            r12.left = r0
            if (r9 == 0) goto L7f
            r6 = 0
        L7f:
            r12.top = r6
            goto L5c
        L82:
            if (r9 == 0) goto L85
            r0 = r5
        L85:
            r12.right = r0
            if (r9 != 0) goto L93
            r4 = r5
            goto L93
        L8b:
            if (r9 == 0) goto L8e
            r0 = r8
        L8e:
            r12.right = r0
            if (r9 != 0) goto L93
            r4 = r8
        L93:
            r12.bottom = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25906Bd9.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.3F5):void");
    }

    public C25906Bd9() {
        this(null, null, null);
    }
}
