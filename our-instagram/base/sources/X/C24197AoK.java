package X;

import android.content.Context;
import android.graphics.Point;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.AoK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24197AoK implements InterfaceC58179Pqj {
    public int A00;
    public final float A01;
    public final Context A02;
    public final UserSession A03;
    public final C47Z A04;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r3.A0D() == com.instagram.pendingmedia.model.constants.ShareType.A08) goto L8;
     */
    @Override // X.InterfaceC58179Pqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void COH(X.C208719Lf r18, int r19) {
        /*
            r17 = this;
            r9 = 0
            r7 = r18
            X.C14360o3.A0B(r7, r9)
            r4 = r17
            X.47Z r3 = r4.A04
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r8 = r3.A16
            r6 = 1
            if (r8 == 0) goto L6c
            android.content.Context r0 = r4.A02
            boolean r0 = X.C6PX.A00(r0)
            r5 = r0 ^ 1
            com.instagram.camera.effect.models.CameraAREffect r0 = r3.A10
            if (r0 != 0) goto L24
            com.instagram.pendingmedia.model.constants.ShareType r2 = r3.A0D()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.A08
            r1 = 0
            if (r2 != r0) goto L25
        L24:
            r1 = 1
        L25:
            r13 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r12 = java.lang.Float.valueOf(r0)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)
            X.AGH r10 = new X.AGH
            r14 = r13
            r15 = r13
            r16 = r13
            r10.<init>(r11, r12, r13, r14, r15, r16)
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r11 = X.AbstractC197458oG.A01(r8, r10, r5, r1, r9)
        L3d:
            java.lang.String r0 = r3.A2Q
            if (r0 == 0) goto L6a
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeFile(r0)
        L45:
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r5 = r3.A1D
            if (r5 == 0) goto L6e
            X.47m r0 = r3.A1i
            int r2 = r0.A01
            int r1 = r0.A00
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r5 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r5
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain r0 = r5.A02
            X.AbstractC53885NsH.A00(r0, r2, r1)
            com.instagram.pendingmedia.model.ClipInfo r0 = r3.A1N
            r7.A02(r0, r6)
            int r2 = r3.A05
            int r1 = r0.A07
            int r0 = r0.A05
            int r0 = X.C17s.A03(r2, r1, r0)
            r4.A00 = r0
            r3.A05 = r0
            return
        L6a:
            r8 = 0
            goto L45
        L6c:
            r11 = 0
            goto L3d
        L6e:
            android.content.Context r7 = r4.A02
            com.instagram.common.session.UserSession r9 = r4.A03
            X.47m r13 = r3.A1i
            com.instagram.common.util.gradient.BackgroundGradientColors r10 = r3.A14
            r12 = 0
            X.A30.A00(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = "We don't use VideoFilters in the OC MP"
            java.lang.UnsupportedOperationException r0 = X.AbstractC166987dD.A1D(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24197AoK.COH(X.9Lf, int):void");
    }

    @Override // X.InterfaceC58179Pqj
    public final void E4x(C208719Lf c208719Lf) {
        C14360o3.A0B(c208719Lf, 0);
    }

    @Override // X.InterfaceC58179Pqj
    public final boolean ESx(MY7 my7) {
        C14360o3.A0B(my7, 0);
        try {
            String str = this.A04.A1N.A0F;
            if (str == null) {
                str = "";
            }
            my7.ESw(str);
            return true;
        } catch (IOException e) {
            C0K8.A0M(MSV.A00(363), "Exception when preparing codec: %s", e, e.getMessage());
            return false;
        }
    }

    @Override // X.InterfaceC58179Pqj
    public final void EfU(RunnableC208819Lp runnableC208819Lp) {
        C14360o3.A0B(runnableC208819Lp, 0);
        Point C5V = C5V();
        runnableC208819Lp.A08.offer(new RunnableC24814Aya(runnableC208819Lp, C5V.x, C5V.y));
    }

    @Override // X.InterfaceC58179Pqj
    public final int Bzi() {
        return this.A00;
    }

    @Override // X.InterfaceC58179Pqj
    public final Point C5V() {
        return ALe.A02(this.A02, this.A03, this.A01, this.A04.A1N.A09);
    }

    public C24197AoK(Context context, UserSession userSession, C47Z c47z, float f) {
        AbstractC167027dH.A13(c47z, context, userSession);
        this.A04 = c47z;
        this.A02 = context;
        this.A03 = userSession;
        this.A01 = f;
    }
}
