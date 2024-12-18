package X;

import android.view.View;

/* renamed from: X.6m4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148346m4 {
    public boolean A00;
    public final InterfaceC1118853a A01;
    public final InterfaceC147266kB A02;

    public C148346m4(InterfaceC1118853a interfaceC1118853a, InterfaceC147266kB interfaceC147266kB) {
        C14360o3.A0B(interfaceC147266kB, 1);
        this.A02 = interfaceC147266kB;
        this.A01 = interfaceC1118853a;
    }

    public final void A00(boolean z) {
        View view;
        if (this.A00 != z) {
            this.A00 = z;
            View view2 = ((C147256kA) this.A02).A04.A0F;
            Object obj = null;
            if (view2 != null) {
                obj = view2.getTag();
            }
            if (obj instanceof C143556du) {
                view = ((C143556du) obj).A0N;
            } else if (obj instanceof C140436Wx) {
                view = ((C140436Wx) obj).A0D;
            } else if (!(obj instanceof C38080Gp9)) {
                return;
            } else {
                view = ((C38080Gp9) obj).A0F;
            }
            if (view != null) {
                AbstractC84863qa.A08(view, z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0.A01 != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01() {
        /*
            r4 = this;
            X.53a r0 = r4.A01
            instagram.features.stories.fragment.ReelViewerFragment r0 = (instagram.features.stories.fragment.ReelViewerFragment) r0
            X.1w4 r0 = r0.A0a
            r3 = 1
            if (r0 == 0) goto Le
            int r0 = r0.A01
            r2 = 1
            if (r0 == 0) goto Lf
        Le:
            r2 = 0
        Lf:
            X.6kB r0 = r4.A02
            X.6kA r0 = (X.C147256kA) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r0.A04
            int r1 = r0.A08
            r0 = 0
            if (r1 != 0) goto L1b
            r0 = 1
        L1b:
            if (r2 == 0) goto L20
            if (r0 == 0) goto L20
            r3 = 0
        L20:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148346m4.A01():boolean");
    }
}
