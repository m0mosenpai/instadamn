package X;

import com.facebook.litho.BaseMountingView;

/* loaded from: classes5.dex */
public final class BTM extends BaseMountingView implements InterfaceC09670ek {
    public C50882Vk A00;
    public C75803al A01;
    public InterfaceC16820sZ A02;
    public boolean A03;

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        C14360o3.A0B(c07r, 1);
        if (c07r == C07R.ON_DESTROY) {
            A0k();
        }
    }

    private final C50882Vk getRequireLayoutState() {
        C50882Vk c50882Vk = this.A00;
        if (c50882Vk != null) {
            return c50882Vk;
        }
        throw AbstractC166987dD.A12("LayoutState not available.");
    }

    private final C75803al getRequireTreeState() {
        C75803al c75803al = this.A01;
        if (c75803al != null) {
            return c75803al;
        }
        throw AbstractC166987dD.A12("TreeState not available.");
    }

    @Override // com.facebook.litho.BaseMountingView
    public final void A0d(C07X c07x, C07X c07x2) {
        C07T lifecycle;
        C07T lifecycle2;
        if (c07x != null && (lifecycle2 = c07x.getLifecycle()) != null) {
            lifecycle2.A0A(this);
        }
        if (c07x2 != null && (lifecycle = c07x2.getLifecycle()) != null) {
            lifecycle.A09(this);
        }
    }

    @Override // com.facebook.litho.BaseMountingView
    public final boolean A0h() {
        C50882Vk c50882Vk = this.A00;
        if (c50882Vk != null) {
            return c50882Vk.A0H.A02.A02.A01.A0M;
        }
        return false;
    }

    @Override // com.facebook.litho.BaseMountingView
    public final boolean A0i() {
        if (this.A00 == null) {
            return false;
        }
        return true;
    }

    @Override // com.facebook.litho.BaseMountingView
    public final boolean A0j() {
        C50882Vk c50882Vk = this.A00;
        if (c50882Vk != null) {
            return c50882Vk.A0H.A02.A02.A01.A0X;
        }
        return false;
    }

    @Override // com.facebook.litho.BaseMountingView
    public C2V3 getConfiguration() {
        C75703ab c75703ab;
        C50882Vk c50882Vk = this.A00;
        if (c50882Vk != null && (c75703ab = c50882Vk.A0H.A02.A02) != null) {
            return c75703ab.A01;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (((com.facebook.litho.BaseMountingView) r9).A0A != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        setMeasuredDimension(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r9.A00 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (android.view.View.MeasureSpec.getMode(r10) != 1073741824) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        r1 = android.view.View.MeasureSpec.getSize(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (android.view.View.MeasureSpec.getMode(r11) != 1073741824) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        r6 = android.view.View.MeasureSpec.getSize(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        setMeasuredDimension(r1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        r1 = getRequireTreeState().A06.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if (r9.A03 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (r1 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        r4 = getRequireLayoutState().A0C;
        r3 = getRequireLayoutState().A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r2 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        A0V();
        r2 = r9.A03;
        r0 = getCurrentLayoutState();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
    
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        r1 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        r0 = com.facebook.litho.BaseMountingView.A04(r9, r1, X.AbstractC79463gt.A03, r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007a, code lost:
    
        if (r0 == (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
    
        r2 = r9.A03;
        r0 = getCurrentLayoutState();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
    
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
    
        r1 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        r0 = com.facebook.litho.BaseMountingView.A04(r9, r1, X.AbstractC79463gt.A01, r7, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        if (r0 == (-1)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0090, code lost:
    
        setMeasuredDimension(r4, r3);
        r9.A03 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0095, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (((com.facebook.litho.BaseMountingView) r9).A00 != (-1)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x000d, code lost:
    
        if (r8 != (-1)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        r8 = getWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        r7 = ((com.facebook.litho.BaseMountingView) r9).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r7 != (-1)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        r7 = getHeight();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        ((com.facebook.litho.BaseMountingView) r9).A01 = -1;
        ((com.facebook.litho.BaseMountingView) r9).A00 = -1;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            int r8 = r9.A01
            r2 = 1
            r6 = 0
            r5 = -1
            if (r8 != r5) goto Lc
            int r1 = r9.A00
            r0 = 0
            if (r1 == r5) goto L25
        Lc:
            r0 = 1
            if (r8 == r5) goto L25
        Lf:
            int r7 = r9.A00
            if (r7 != r5) goto L17
            int r7 = r9.getHeight()
        L17:
            r9.A01 = r5
            r9.A00 = r5
            if (r0 == 0) goto L2a
            boolean r0 = r9.A0A
            if (r0 != 0) goto L2a
            r9.setMeasuredDimension(r8, r7)
            return
        L25:
            int r8 = r9.getWidth()
            goto Lf
        L2a:
            X.2Vk r0 = r9.A00
            if (r0 != 0) goto L4a
            int r0 = android.view.View.MeasureSpec.getMode(r10)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L48
            int r1 = android.view.View.MeasureSpec.getSize(r10)
        L3a:
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            if (r0 != r2) goto L44
            int r6 = android.view.View.MeasureSpec.getSize(r11)
        L44:
            r9.setMeasuredDimension(r1, r6)
            return
        L48:
            r1 = 0
            goto L3a
        L4a:
            X.3al r0 = r9.getRequireTreeState()
            X.3an r0 = r0.A06
            boolean r1 = r0.A00
            boolean r0 = r9.A03
            if (r0 == 0) goto L59
            if (r1 == 0) goto L59
            r2 = 0
        L59:
            X.2Vk r0 = r9.getRequireLayoutState()
            int r4 = r0.A0C
            X.2Vk r0 = r9.getRequireLayoutState()
            int r3 = r0.A09
            if (r2 == 0) goto L90
            r9.A0V()
            boolean r2 = r9.A03
            X.2Vk r0 = r9.getCurrentLayoutState()
            if (r0 == 0) goto L98
            X.3gr r1 = r0.A01
        L74:
            X.3gv r0 = X.AbstractC79463gt.A03
            int r0 = com.facebook.litho.BaseMountingView.A04(r9, r1, r0, r8, r2)
            if (r0 == r5) goto L7d
            r4 = r0
        L7d:
            boolean r2 = r9.A03
            X.2Vk r0 = r9.getCurrentLayoutState()
            if (r0 == 0) goto L96
            X.3gr r1 = r0.A00
        L87:
            X.3gv r0 = X.AbstractC79463gt.A01
            int r0 = com.facebook.litho.BaseMountingView.A04(r9, r1, r0, r7, r2)
            if (r0 == r5) goto L90
            r3 = r0
        L90:
            r9.setMeasuredDimension(r4, r3)
            r9.A03 = r6
            return
        L96:
            r1 = 0
            goto L87
        L98:
            r1 = 0
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BTM.onMeasure(int, int):void");
    }

    public final void A0k() {
        A0X();
        InterfaceC16820sZ interfaceC16820sZ = this.A02;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        this.A03 = true;
        requestLayout();
    }

    @Override // com.facebook.litho.BaseMountingView
    public C50882Vk getCurrentLayoutState() {
        return this.A00;
    }

    public final InterfaceC16820sZ getOnClean() {
        return this.A02;
    }

    @Override // com.facebook.litho.BaseMountingView
    public C75803al getTreeState() {
        return this.A01;
    }

    public final void setLayoutState(C50882Vk c50882Vk, C75803al c75803al) {
        boolean A1a = AbstractC167017dG.A1a(c50882Vk, c75803al);
        C2XV.A00();
        C50882Vk c50882Vk2 = this.A00;
        boolean z = false;
        if (c50882Vk2 == c50882Vk) {
            if (this.A01 == c75803al) {
                if (((BaseMountingView) this).A09) {
                    ((BaseMountingView) this).A0J.A0A();
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A12("Failed requirement.");
        }
        if (c50882Vk2 == null || getRequireLayoutState().A08 != c50882Vk.A08) {
            z = true;
        }
        this.A03 = z;
        ((BaseMountingView) this).A0A = A1a;
        ((BaseMountingView) this).A0H.setEmpty();
        if (this.A00 != null && this.A03) {
            A0W();
        }
        this.A00 = c50882Vk;
        this.A01 = c75803al;
        A0Y();
        requestLayout();
    }

    public final void setOnClean(InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = interfaceC16820sZ;
    }
}
