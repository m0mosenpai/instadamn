package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.9gS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215529gS extends AbstractC65806TuP {
    public C23432Aa5 A00;

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new FrameLayout(context);
    }

    private final C23432Aa5 A00(C6FG c6fg) {
        C23432Aa5 c23432Aa5 = this.A00;
        if (c23432Aa5 == null) {
            C23385AYj A00 = C178267w0.A00(c6fg.A00, new C178017va("Bloks"));
            A00.A01(new C9X1(A00), InterfaceC180067yw.A04);
            A00.A01(new C180027ys(A00), InterfaceC179927yi.A00);
            A00.A01(new C9X3(A00), InterfaceC179867yc.A00);
            A00.A01(new C180007yq(A00), InterfaceC180017yr.A00);
            A00.A01(new C179987yo(A00), InterfaceC179997yp.A00);
            A00.A01(new C180177z7(A00), InterfaceC178737wl.A00);
            A00.A02((InterfaceC178287w2) new C212489bH(A00, null));
            C23432Aa5 c23432Aa52 = new C23432Aa5(A00);
            C23432Aa5.A00(c23432Aa52).EbP(921600);
            C23432Aa5.A00(c23432Aa52).Eam(false);
            C23432Aa5.A00(c23432Aa52).EaF(false);
            this.A00 = c23432Aa52;
            return c23432Aa52;
        }
        return c23432Aa5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r1.equals("front") != false) goto L6;
     */
    @Override // X.AbstractC65806TuP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0K(android.view.View r4, X.C6FG r5, X.C102884kP r6, java.lang.Object r7) {
        /*
            r3 = this;
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            X.AbstractC167027dH.A12(r4, r5, r6)
            X.Aa5 r2 = r3.A00(r5)
            java.lang.String r1 = r6.A0E()
            if (r1 == 0) goto L18
            java.lang.String r0 = "front"
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L19
        L18:
            r0 = 1
        L19:
            X.C14360o3.A0A(r2)
            r2.A03(r0)
            android.view.View r0 = r2.A01()
            r4.addView(r0)
            r2.EKd()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C215529gS.A0K(android.view.View, X.6FG, X.4kP, java.lang.Object):java.lang.Object");
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        AbstractC167017dG.A1N(viewGroup, c6fg);
        viewGroup.removeAllViews();
        C23432Aa5 A00 = A00(c6fg);
        C14360o3.A0A(A00);
        A00.pause();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }
}
