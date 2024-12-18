package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.MXm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50648MXm implements C8RS {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final InterfaceC58111Ppa A07;

    @Override // X.C8RS
    public final void DzG(int i, int i2, int i3) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r3.A00 != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C50648MXm r3) {
        /*
            android.view.View r2 = r3.A04
            boolean r0 = r3.A02
            r1 = 1
            if (r0 != 0) goto L12
            int r0 = r3.A01
            if (r0 == r1) goto L12
            int r1 = r3.A00
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r1 == 0) goto L14
        L12:
            r0 = 1065353216(0x3f800000, float:1.0)
        L14:
            r2.setAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50648MXm.A00(X.MXm):void");
    }

    @Override // X.C8RS
    public final void CMH(boolean z) {
        AbstractC166997dE.A1L(this.A06, z);
    }

    @Override // X.C8RS
    public final void EkC(C115525Km c115525Km, boolean z, boolean z2) {
        ViewGroup viewGroup = this.A06;
        viewGroup.setVisibility(0);
        if (!this.A03) {
            this.A03 = true;
            viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC55503Okw(this, 3));
        }
        A00(this);
        AbstractC167007dF.A0y(viewGroup, z);
    }

    public C50648MXm(ViewGroup viewGroup, InterfaceC58111Ppa interfaceC58111Ppa) {
        AbstractC167017dG.A1P(viewGroup, interfaceC58111Ppa);
        this.A06 = viewGroup;
        this.A07 = interfaceC58111Ppa;
        View A0S = AbstractC166997dE.A0S(viewGroup, R.id.clips_review_delete_button);
        this.A04 = A0S;
        C52374NFq.A00(AbstractC166987dD.A0s(A0S), this, 17);
        View requireViewById = viewGroup.requireViewById(R.id.clips_review_trim_button);
        this.A05 = requireViewById;
        C52374NFq.A00(AbstractC166987dD.A0s(requireViewById), this, 18);
    }
}
