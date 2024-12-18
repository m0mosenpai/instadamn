package X;

import android.graphics.SurfaceTexture;
import android.view.View;

/* loaded from: classes9.dex */
public final class OWY {
    public int A01;
    public int A03;
    public SurfaceTexture A04;
    public View A05;
    public C1815383g A06;
    public boolean A07;
    public final InterfaceC174767qC A08;
    public int A02 = Integer.MAX_VALUE;
    public int A00 = Integer.MAX_VALUE;

    public final void A01() {
        this.A07 = false;
        InterfaceC174767qC interfaceC174767qC = this.A08;
        interfaceC174767qC.EJk(false);
        if (this.A04 != null) {
            if (interfaceC174767qC.EjF()) {
                interfaceC174767qC.EbS(null, 0, 0);
            }
            interfaceC174767qC.disconnect();
            this.A04 = null;
        }
    }

    public static final void A00(C176877tj c176877tj, AbstractC70118W4q abstractC70118W4q, OWY owy) {
        int i;
        int i2;
        int i3 = c176877tj.A01;
        int i4 = c176877tj.A02;
        if (owy.A06 != null) {
            i = owy.A03;
            i2 = owy.A01;
        } else {
            i = i3;
            i2 = i4;
        }
        abstractC70118W4q.A04(new ODP(i3, i4, i, i2, owy.A08.CR9()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r15.A08.CKz() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.graphics.SurfaceTexture r16, X.AbstractC70118W4q r17, int r18, int r19, boolean r20) {
        /*
            r15 = this;
            r0 = r16
            r15.A04 = r0
            int r0 = r15.A00
            r8 = r18
            int r3 = java.lang.Math.min(r8, r0)
            r7 = r19
            float r2 = (float) r7
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r2
            float r1 = (float) r8
            float r0 = r0 / r1
            X.AaO r9 = new X.AaO
            r9.<init>(r3, r0)
            r12 = 1
            if (r20 == 0) goto L25
            X.7qC r0 = r15.A08
            boolean r0 = r0.CKz()
            r10 = 1
            if (r0 != 0) goto L26
        L25:
            r10 = 0
        L26:
            r4 = 0
            X.83g r14 = r15.A06
            if (r14 == 0) goto L60
            int r0 = r15.A02
            int r13 = java.lang.Math.min(r0, r8)
            r15.A03 = r13
            float r0 = (float) r13
            float r2 = r2 * r0
            float r2 = r2 / r1
            int r11 = (int) r2
            r15.A01 = r11
            android.graphics.SurfaceTexture r6 = r15.A04
            java.lang.String r0 = "Required value was null."
            if (r6 == 0) goto L89
            r6.setDefaultBufferSize(r13, r11)
            X.7qC r5 = r15.A08
            r5.EYx(r12)
            android.view.View r3 = r15.A05
            if (r3 == 0) goto L84
            java.lang.String r2 = "instagram_live"
            r1 = 0
            X.82k r0 = r14.A04
            X.7rP r4 = r0.A00(r3, r5, r2, r1)
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r14.A05
            r0.A08 = r5
            if (r4 == 0) goto L60
            r4.Dic(r6, r13, r11)
            r4.Dib(r13, r11)
        L60:
            r15.A07 = r12
            X.7q0 r1 = X.EnumC174667q0.HIGH
            X.7qC r3 = r15.A08
            X.9bO r0 = new X.9bO
            r0.<init>(r1, r1, r9)
            r3.Ecy(r0)
            r3.setInitialCameraFacing(r10)
            android.graphics.SurfaceTexture r0 = r15.A04
            r3.EbS(r0, r8, r7)
            X.81S r2 = X.C81S.A00
            r1 = 0
            X.My4 r0 = new X.My4
            r5 = r17
            r0.<init>(r1, r5, r15)
            r3.AJS(r0, r4, r2)
            return
        L84:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L89:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OWY.A02(android.graphics.SurfaceTexture, X.W4q, int, int, boolean):void");
    }

    public OWY(InterfaceC174767qC interfaceC174767qC) {
        this.A08 = interfaceC174767qC;
    }
}
