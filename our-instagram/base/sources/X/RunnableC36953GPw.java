package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.GPw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36953GPw implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ InterfaceC72953Ov A02;

    public RunnableC36953GPw(UserSession userSession, Reel reel, InterfaceC72953Ov interfaceC72953Ov) {
        this.A02 = interfaceC72953Ov;
        this.A01 = reel;
        this.A00 = userSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        if (r7 == null) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            X.3Ov r4 = r8.A02
            android.view.View r0 = r4.AeT()
            X.C14360o3.A07(r0)
            X.VrI r1 = X.VSN.A00(r0)
            r0 = 1082130432(0x40800000, float:4.0)
            r1.A00(r0)
            com.instagram.model.reels.Reel r6 = r8.A01
            com.instagram.common.session.UserSession r5 = r8.A00
            com.instagram.api.schemas.RingSpec r7 = r6.A05(r5)
            if (r7 != 0) goto L20
            com.instagram.api.schemas.RingSpec r7 = X.C3PP.A00(r5, r6)
        L20:
            java.util.List r1 = r6.A0O(r5)
            X.C14360o3.A07(r1)
            boolean r0 = X.AbstractC166987dD.A1b(r1)
            if (r0 == 0) goto L68
            java.lang.Object r3 = X.AbstractC001800i.A0K(r1)
            X.1vS r3 = (X.C41181vS) r3
            X.C14360o3.A0A(r3)
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            r2 = 1
            X.1vY r1 = r3.A0e
            X.1vY r0 = X.EnumC41231vY.A0P
            if (r1 != r0) goto L4c
            X.4ps r0 = r3.A0d
            r0.getClass()
            X.47Z r0 = r0.A00
            com.instagram.api.schemas.RingSpecImpl r7 = r0.A0y
            if (r7 != 0) goto L5a
        L4c:
            boolean r0 = r3.A1E()
            if (r0 == 0) goto L77
            X.0do r0 = X.C3Oc.A0F
        L54:
            java.lang.Object r7 = r0.getValue()
            com.instagram.api.schemas.RingSpec r7 = (com.instagram.api.schemas.RingSpec) r7
        L5a:
            com.instagram.ui.widget.gradientspinner.GradientSpinner r3 = r4.Blo()
            X.J5P r2 = new X.J5P
            r2.<init>(r5, r6, r4)
            r0 = 700(0x2bc, double:3.46E-321)
            r3.postDelayed(r2, r0)
        L68:
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r4.Blo()
            r0.setGradientColors(r7)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r4.Blo()
            r0.A05()
            return
        L77:
            X.3bi r1 = r3.A0B()
            X.3bi r0 = X.EnumC76383bi.A04
            if (r1 == r0) goto La4
            X.3bi r1 = r3.A0B()
            X.3bi r0 = X.EnumC76383bi.A05
            if (r1 == r0) goto La4
            X.3bi r1 = r3.A0B()
            X.3bi r0 = X.EnumC76383bi.A0A
            if (r1 != r0) goto L98
            boolean r0 = X.C3DL.A01(r5, r2)
            if (r0 == 0) goto La1
            X.0do r0 = X.C3Oc.A0I
            goto L54
        L98:
            boolean r0 = r3.A0i()
            if (r0 == 0) goto La1
            X.0do r0 = X.C3Oc.A0J
            goto L54
        La1:
            X.0do r0 = X.C3Oc.A0D
            goto L54
        La4:
            X.0do r0 = X.C3Oc.A0C
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC36953GPw.run():void");
    }
}
