package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P19 implements InterfaceC58169PqZ {
    public C50808McV A00;
    public View A01;
    public ViewGroup A02;
    public final UserSession A03;
    public final NK6 A04;
    public final C52463NJh A05;
    public final NKO A06;
    public final C52470NJo A07;
    public final C56137Ovx A08;
    public final C81X A09;
    public final AbstractC59962oe A0A;

    public P19(AbstractC59962oe abstractC59962oe, UserSession userSession, NK6 nk6, C52463NJh c52463NJh, NKO nko, C52470NJo c52470NJo, C56137Ovx c56137Ovx) {
        AbstractC167027dH.A0a(1, userSession, abstractC59962oe, c52463NJh, nko);
        C14360o3.A0B(c56137Ovx, 7);
        this.A03 = userSession;
        this.A0A = abstractC59962oe;
        this.A05 = c52463NJh;
        this.A06 = nko;
        this.A07 = c52470NJo;
        this.A04 = nk6;
        this.A08 = c56137Ovx;
        this.A09 = C81X.A2i;
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        A00(this);
        AbstractC59962oe abstractC59962oe = this.A0A;
        C07S c07s = C07S.RESUMED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        C50122MBw c50122MBw = new C50122MBw(viewLifecycleOwner, c07s, this, null, 18);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, c50122MBw, A00);
        C07S c07s2 = C07S.STARTED;
        C07X viewLifecycleOwner2 = abstractC59962oe.getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new C50122MBw(viewLifecycleOwner2, c07s2, this, null, 19), C07Y.A00(viewLifecycleOwner2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r1 != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.P19 r13) {
        /*
            com.instagram.common.session.UserSession r7 = r13.A03
            X.Ovx r0 = X.AbstractC53982Ntt.A00(r7)
            X.05A r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L17
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L18
        L17:
            r0 = 1
        L18:
            r0 = r0 ^ 1
            java.lang.String r2 = "rowItemView"
            android.view.View r1 = r13.A01
            if (r0 == 0) goto L65
            if (r1 == 0) goto L6f
            r0 = 0
        L23:
            r1.setVisibility(r0)
            X.McV r1 = r13.A00
            java.lang.String r2 = "otherIGShareTitleContainer"
            if (r1 == 0) goto L33
            android.view.ViewGroup r0 = r13.A02
            if (r0 == 0) goto L6f
            r0.removeView(r1)
        L33:
            X.2oe r6 = r13.A0A
            android.content.Context r4 = r6.requireContext()
            android.view.View r5 = r6.mView
            if (r5 == 0) goto L6a
            r8 = 0
            X.Ovx r0 = X.AbstractC53982Ntt.A00(r7)
            X.05A r0 = r0.A01
            java.util.List r12 = X.MSW.A1A(r0)
            X.PIH r9 = new X.PIH
            r9.<init>(r13)
            X.McV r3 = new X.McV
            r10 = r8
            r11 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A00 = r3
            android.view.ViewGroup r0 = r13.A02
            if (r0 == 0) goto L6f
            r0.addView(r3)
            X.McV r0 = r13.A00
            if (r0 == 0) goto L64
            r0.A04()
        L64:
            return
        L65:
            if (r1 == 0) goto L6f
            r0 = 8
            goto L23
        L6a:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L6f:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P19.A00(X.P19):void");
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        View A0C = AbstractC25227BEk.A0C(AbstractC31175DnJ.A06(this.A0A), R.layout.share_other_ig_row);
        this.A01 = A0C;
        if (A0C != null) {
            this.A02 = AbstractC31173DnH.A0F(A0C, R.id.other_ig_share_title_container);
            View view = this.A01;
            if (view != null) {
                return view;
            }
        }
        C14360o3.A0F("rowItemView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A09;
    }
}
