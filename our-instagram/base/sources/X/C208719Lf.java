package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.ClipInfo;

/* renamed from: X.9Lf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208719Lf implements InterfaceC199648sG {
    public SurfaceTexture A00;
    public Surface A01;
    public C8MI A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Surface A06;
    public final C200558ty A07;
    public final UserSession A08;
    public final C208699Ld A09;
    public final FilterGroupModel A0A;
    public final boolean A0B;
    public final /* synthetic */ C199638sF A0C;

    public final void A02(ClipInfo clipInfo, boolean z) {
        int i;
        int i2;
        C209159Mx c209159Mx;
        C14360o3.A0B(clipInfo, 0);
        int A00 = MY3.A00(AbstractC167017dG.A0K(clipInfo.A0C));
        boolean z2 = this.A0B;
        if (z2) {
            i = clipInfo.A09;
        } else {
            i = this.A05;
        }
        if (z2) {
            i2 = clipInfo.A06;
        } else {
            i2 = this.A04;
        }
        int i3 = clipInfo.A04;
        C208699Ld c208699Ld = this.A09;
        c208699Ld.A02 = i;
        c208699Ld.A01 = i2;
        C208699Ld.A02(c208699Ld);
        C9P7 A002 = C208699Ld.A00(c208699Ld);
        if (A002 != null) {
            C209159Mx c209159Mx2 = (C209159Mx) InterfaceC178207vu.A02(A002);
            c209159Mx2.A02 = A00;
            C209159Mx.A03(c209159Mx2);
        }
        c208699Ld.A00 = A00;
        C208699Ld.A02(c208699Ld);
        if (z) {
            if (i3 == 6) {
                if (!C18U.A06(C06090Tz.A05, this.A08, 36319342966611136L)) {
                    C9P7 A003 = C208699Ld.A00(c208699Ld);
                    if (A003 != null) {
                        c209159Mx = (C209159Mx) InterfaceC178207vu.A02(A003);
                        c209159Mx.A00 = 3;
                        C209159Mx.A03(c209159Mx);
                    }
                    return;
                }
            }
            C9P7 A004 = C208699Ld.A00(c208699Ld);
            if (A004 == null) {
                return;
            }
            c209159Mx = (C209159Mx) InterfaceC178207vu.A02(A004);
            c209159Mx.A00 = i3;
            C209159Mx.A03(c209159Mx);
        }
    }

    @Override // X.InterfaceC199648sG
    public final void A9d(C83L c83l) {
        this.A0C.A9d(c83l);
    }

    @Override // X.InterfaceC199648sG
    public final EffectAttribution B0P() {
        return this.A0C.B0P();
    }

    @Override // X.InterfaceC199648sG
    public final void E3e() {
        this.A0C.E3e();
    }

    @Override // X.InterfaceC199648sG
    public final void EFw(C83L c83l) {
        this.A0C.EFw(c83l);
    }

    @Override // X.InterfaceC199648sG
    public final void EJb() {
        this.A0C.EJb();
    }

    @Override // X.InterfaceC199648sG
    public final void EKi() {
        this.A0C.EKi();
    }

    @Override // X.InterfaceC199648sG
    public final void EP4(CameraAREffect cameraAREffect) {
        this.A0C.EP4(cameraAREffect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r0 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.SurfaceTexture A00() {
        /*
            r5 = this;
            X.9Ld r1 = r5.A09
            boolean r0 = r1.A0H
            if (r0 == 0) goto L9
            android.graphics.SurfaceTexture r0 = r1.A06
            return r0
        L9:
            X.9P7 r0 = X.C208699Ld.A00(r1)
            if (r0 == 0) goto L75
            X.9P6 r4 = X.InterfaceC178207vu.A02(r0)
            X.9Mx r4 = (X.C209159Mx) r4
            X.7vc r0 = X.InterfaceC178107vj.A08
            java.lang.Boolean r3 = X.AbstractC166997dE.A0a()
            r1 = r3
            X.7vu r2 = r4.A00
            java.lang.Object r0 = r2.AqG(r0)
            if (r0 == 0) goto L25
            r1 = r0
        L25:
            boolean r1 = X.AbstractC166987dD.A1a(r1)
            X.A4r r0 = r4.A08
            if (r1 == 0) goto L4e
            if (r0 != 0) goto L41
            X.7vc r0 = X.InterfaceC178107vj.A07
            java.lang.Object r0 = r2.AqG(r0)
            if (r0 == 0) goto L38
            r3 = r0
        L38:
            boolean r0 = X.AbstractC166987dD.A1a(r3)
            if (r0 != 0) goto L50
            X.C209159Mx.A01(r4)
        L41:
            X.C209159Mx.A03(r4)
        L44:
            X.7rR r0 = r4.A07
            r0.getClass()
            android.graphics.SurfaceTexture r0 = r0.getSurfaceTexture()
            return r0
        L4e:
            if (r0 != 0) goto L44
        L50:
            r0 = 1
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r3.<init>(r0)
            X.7wt r0 = X.C209159Mx.A00(r4)
            android.os.Handler r1 = r0.getHandler()
            X.AuJ r0 = new X.AuJ
            r0.<init>(r4, r3)
            r1.post(r0)
            r1 = 5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L6e
            r3.await(r1, r0)     // Catch: java.lang.InterruptedException -> L6e
            goto L44
        L6e:
            java.lang.String r0 = "Timeout in getting input surface texture"
            java.lang.RuntimeException r0 = X.AbstractC166987dD.A18(r0)
            throw r0
        L75:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208719Lf.A00():android.graphics.SurfaceTexture");
    }

    public final void A01() {
        C9P7 A00;
        C209159Mx c209159Mx;
        C176507t8 c176507t8;
        C208699Ld c208699Ld = this.A09;
        C178577wV c178577wV = c208699Ld.A07;
        if (c178577wV.A08() && (A00 = C208699Ld.A00(c208699Ld)) != null && (c176507t8 = (c209159Mx = (C209159Mx) InterfaceC178207vu.A02(A00)).A0G) != null) {
            C209159Mx.A00(c209159Mx).BQq().EFO(0, c176507t8);
            c209159Mx.A0G = null;
        }
        if (c178577wV.A08()) {
            C208699Ld.A03(c208699Ld, "disconnect");
            c178577wV.A04();
        } else {
            C208699Ld.A03(c208699Ld, "duplicated-disconnect");
        }
    }

    public C208719Lf(Surface surface, C200558ty c200558ty, UserSession userSession, C208699Ld c208699Ld, C8MI c8mi, FilterGroupModel filterGroupModel, int i, int i2, boolean z) {
        this.A0C = new C199638sF(c200558ty, new C199628sE(c208699Ld.A07));
        this.A08 = userSession;
        this.A06 = surface;
        this.A05 = i;
        this.A04 = i2;
        this.A07 = c200558ty;
        this.A02 = c8mi;
        this.A09 = c208699Ld;
        this.A0A = filterGroupModel;
        this.A0B = z;
    }
}
