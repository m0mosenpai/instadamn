package X;

import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.87x, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87x implements C87y {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ C1815283f A01;
    public final /* synthetic */ C1810981l A02;
    public final /* synthetic */ C81J A03;
    public final /* synthetic */ C1812682c A04;
    public final /* synthetic */ AnonymousClass860 A05;
    public final /* synthetic */ InterfaceC08830cm A06;
    public final /* synthetic */ InterfaceC08830cm A07;
    public final /* synthetic */ InterfaceC16820sZ A08;

    public final void A00(InterfaceC58362lv interfaceC58362lv, InterfaceC58362lv interfaceC58362lv2) {
        C14360o3.A0B(interfaceC58362lv2, 1);
        AnonymousClass860 anonymousClass860 = this.A05;
        if (anonymousClass860 != null) {
            if (interfaceC58362lv != null) {
                AbstractC58232lf.A00(AnonymousClass191.A00, anonymousClass860.A0c).A06(this.A00, interfaceC58362lv);
            }
            anonymousClass860.A01().A06(this.A00, interfaceC58362lv2);
        }
    }

    @Override // X.C87y
    public final void DD8(CameraAREffect cameraAREffect) {
        C8FG c8fg = (C8FG) this.A07.get();
        if (c8fg != null) {
            C8FG.A06(c8fg, false);
            C8FG.A04(c8fg);
            AnonymousClass860 anonymousClass860 = this.A05;
            if (anonymousClass860 != null) {
                String moduleName = this.A03.A0O.getModuleName();
                C14360o3.A0B(moduleName, 1);
                C141796aw A00 = AbstractC141776au.A00(anonymousClass860);
                AbstractC23641Du.A05(AnonymousClass191.A00, new MC9(anonymousClass860, cameraAREffect, moduleName, (InterfaceC23621Ds) null, 19), A00);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public C87x(AbstractC59962oe abstractC59962oe, C1815283f c1815283f, C1810981l c1810981l, C81J c81j, C1812682c c1812682c, AnonymousClass860 anonymousClass860, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC16820sZ interfaceC16820sZ) {
        this.A05 = anonymousClass860;
        this.A00 = abstractC59962oe;
        this.A03 = c81j;
        this.A02 = c1810981l;
        this.A07 = interfaceC08830cm;
        this.A08 = interfaceC16820sZ;
        this.A04 = c1812682c;
        this.A01 = c1815283f;
        this.A06 = interfaceC08830cm2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r1 != false) goto L8;
     */
    @Override // X.C87y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DCx() {
        /*
            r3 = this;
            X.0cm r0 = r3.A07
            java.lang.Object r2 = r0.get()
            X.8FG r2 = (X.C8FG) r2
            if (r2 == 0) goto L21
            X.860 r0 = r3.A05
            if (r0 == 0) goto L1d
            X.05A r0 = r0.A0b
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 == 0) goto L1e
        L1d:
            r0 = 0
        L1e:
            r2.A0H(r0)
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87x.DCx():void");
    }

    @Override // X.C87y
    public final void DD5(CameraAREffect cameraAREffect) {
        C8FG c8fg = (C8FG) this.A07.get();
        if (c8fg != null) {
            C8FG.A06(c8fg, true);
            C8FG.A04(c8fg);
            AnonymousClass860 anonymousClass860 = this.A05;
            if (anonymousClass860 != null) {
                String moduleName = this.A03.A0O.getModuleName();
                C14360o3.A0B(moduleName, 1);
                C141796aw A00 = AbstractC141776au.A00(anonymousClass860);
                AbstractC23641Du.A05(AnonymousClass191.A00, new MC9(anonymousClass860, cameraAREffect, moduleName, (InterfaceC23621Ds) null, 18), A00);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
