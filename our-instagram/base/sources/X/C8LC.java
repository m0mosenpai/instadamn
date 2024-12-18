package X;

import android.app.Activity;
import android.view.View;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.8LC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8LC {
    public C22P A00;
    public ALt A01;
    public C198768qZ A02;
    public C9U6 A03;
    public C198528q1 A04;
    public final Activity A05;
    public final View A06;
    public final C018307d A07;
    public final C1824787m A08;
    public final AnonymousClass830 A09;
    public final AbstractC59962oe A0A;
    public final C8LB A0B;
    public final C1815283f A0C;
    public final C1819485e A0D;
    public final UserSession A0E;
    public final C1810981l A0F;
    public final TargetViewSizeProvider A0G;
    public final C1821185v A0H;
    public final C8LA A0I;
    public final InterfaceC143326dX A0J;
    public final InterfaceC1810081c A0K;
    public final InterfaceC09390do A0L;
    public final boolean A0M;

    public C8LC(Activity activity, View view, C22P c22p, C1824787m c1824787m, AnonymousClass830 anonymousClass830, AbstractC59962oe abstractC59962oe, C8LB c8lb, C1815283f c1815283f, C1819485e c1819485e, UserSession userSession, C1810981l c1810981l, TargetViewSizeProvider targetViewSizeProvider, C1821185v c1821185v, C8LA c8la, InterfaceC143326dX interfaceC143326dX, InterfaceC1810081c interfaceC1810081c, InterfaceC09390do interfaceC09390do, boolean z) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(activity, 2);
        C14360o3.A0B(view, 3);
        C14360o3.A0B(abstractC59962oe, 4);
        C14360o3.A0B(c1810981l, 5);
        C14360o3.A0B(c8la, 6);
        C14360o3.A0B(targetViewSizeProvider, 12);
        C14360o3.A0B(c22p, 16);
        this.A0E = userSession;
        this.A05 = activity;
        this.A06 = view;
        this.A0A = abstractC59962oe;
        this.A0F = c1810981l;
        this.A0I = c8la;
        this.A0B = c8lb;
        this.A0C = c1815283f;
        this.A0D = c1819485e;
        this.A0K = interfaceC1810081c;
        this.A0H = c1821185v;
        this.A0G = targetViewSizeProvider;
        this.A0L = interfaceC09390do;
        this.A0J = interfaceC143326dX;
        this.A09 = anonymousClass830;
        this.A00 = c22p;
        this.A08 = c1824787m;
        this.A0M = z;
        this.A07 = new C018307d();
    }

    public final CameraAREffect A00() {
        Object value;
        Object obj = this.A0F.A08.A00;
        C14360o3.A0B(obj, 0);
        if (obj instanceof C81V) {
            if (this.A03 == null) {
                return null;
            }
            value = AbstractC191638eL.A03.getValue();
        } else {
            C198528q1 c198528q1 = this.A04;
            if (c198528q1 == null) {
                return null;
            }
            value = c198528q1.A0I.getValue();
        }
        return (CameraAREffect) value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
    
        if (r5 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C85B r4, com.instagram.camera.effect.models.CameraAREffect r5) {
        /*
            r3 = this;
            X.8q1 r2 = r3.A04
            if (r2 == 0) goto L35
            r1 = 0
            if (r5 == 0) goto L9
            java.lang.String r1 = r5.A0K
        L9:
            X.8LA r0 = r2.A0G
            r0.A00(r4, r1)
            X.05A r0 = r2.A0I
            r0.Egh(r5)
            X.0UO r0 = r2.A04
            if (r0 != 0) goto L21
            java.lang.String r0 = "effectTrayState"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L21:
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C218289l0
            if (r0 != 0) goto L35
            if (r5 == 0) goto L3f
            X.85e r0 = r2.A0A
            X.85h r0 = r0.A00()
            r0.ETb(r5)
            goto L37
        L35:
            if (r5 == 0) goto L3f
        L37:
            X.9U6 r0 = r3.A03
            if (r0 == 0) goto L3e
            r0.A01(r5)
        L3e:
            return
        L3f:
            X.9U6 r0 = r3.A03
            if (r0 == 0) goto L3e
            r0.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8LC.A01(X.85B, com.instagram.camera.effect.models.CameraAREffect):void");
    }
}
