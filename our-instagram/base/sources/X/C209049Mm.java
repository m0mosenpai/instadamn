package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import java.util.Collections;

/* renamed from: X.9Mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209049Mm {
    public int A00;
    public Camera A01;
    public InterfaceC198408pp A02;
    public C9O9 A03;
    public boolean A04;
    public final C208989Mg A05;
    public final C175227qw A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;

    public static void A00(final Point point, final InterfaceC198408pp interfaceC198408pp, C209049Mm c209049Mm, final Integer num) {
        if (interfaceC198408pp != null) {
            C9O9 c9o9 = c209049Mm.A03;
            if (point != null && c9o9 != null) {
                float[] fArr = {point.x, point.y};
                Matrix matrix = c9o9.A00;
                Matrix matrix2 = new Matrix();
                matrix.invert(matrix2);
                matrix2.mapPoints(fArr);
                point.set((int) fArr[0], (int) fArr[1]);
            }
            C176567tE.A00(new Runnable() { // from class: X.AxL
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC198408pp.DHd(point, num);
                }
            });
        }
    }

    public final void A01() {
        this.A06.A06("Focus reset must happen on the Optic thread.");
        if (this.A09 && this.A04) {
            this.A07 = false;
            this.A08 = false;
            A00(null, this.A02, this, C05F.A01);
            Camera camera = this.A01;
            camera.getClass();
            camera.cancelAutoFocus();
            C208999Mh A00 = this.A05.A00(this.A00);
            ((AbstractC176827te) A00).A00.A01(AbstractC176797tb.A0C, Collections.emptyList());
            ((AbstractC176827te) A00).A00.A01(AbstractC176797tb.A0f, Collections.emptyList());
            A00.A04();
            A00.A03();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (X.AbstractC31175DnJ.A1U(6, r1) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            r5 = this;
            X.7qw r1 = r5.A06
            java.lang.String r0 = "Setting focus mode for video must happen on the Optic thread."
            r1.A06(r0)
            boolean r0 = r5.A09
            if (r0 == 0) goto L15
            r0 = 1
            r5.A0A = r0
            boolean r0 = r5.A07
            if (r0 == 0) goto L16
            r0 = 0
            r5.A04 = r0
        L15:
            return
        L16:
            X.9Mg r1 = r5.A05
            int r0 = r5.A00
            X.9Mh r4 = r1.A00(r0)
            X.9MK r1 = r4.A00
            android.graphics.Rect r0 = X.C9MZ.A00
            X.7tZ r0 = X.AbstractC176767tY.A0w
            java.lang.Object r1 = r1.A01(r0)
            java.util.List r1 = (java.util.List) r1
            r3 = 3
            boolean r0 = X.AbstractC31175DnJ.A1U(r3, r1)
            if (r0 != 0) goto L38
            r3 = 6
            boolean r0 = X.AbstractC31175DnJ.A1U(r3, r1)
            if (r0 == 0) goto L43
        L38:
            X.7tf r2 = r4.A00
            X.7tc r1 = X.AbstractC176797tb.A0D
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A01(r1, r0)
        L43:
            r4.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209049Mm.A02():void");
    }

    public final void A03(Rect rect, final InterfaceC198408pp interfaceC198408pp) {
        final Point point;
        this.A06.A06("Focus requests must be on the Optic thread. ");
        if (this.A09) {
            if (rect != null) {
                C208989Mg c208989Mg = this.A05;
                if (AbstractC167007dF.A1S(AbstractC176767tY.A0W, c208989Mg.A01(this.A00))) {
                    C208999Mh A00 = c208989Mg.A00(this.A00);
                    ((AbstractC176827te) A00).A00.A01(AbstractC176797tb.A0f, C9MZ.A00(rect));
                    A00.A03();
                }
            }
            if (this.A09) {
                C208989Mg c208989Mg2 = this.A05;
                AbstractC176767tY A01 = c208989Mg2.A01(this.A00);
                C176777tZ c176777tZ = AbstractC176767tY.A0V;
                if (AbstractC167007dF.A1S(c176777tZ, A01) || AbstractC167007dF.A1S(AbstractC176767tY.A05, A01)) {
                    if (this.A08) {
                        Camera camera = this.A01;
                        camera.getClass();
                        camera.cancelAutoFocus();
                    }
                    this.A07 = false;
                    this.A08 = true;
                    this.A0A = false;
                    if (rect == null) {
                        point = null;
                    } else {
                        C208999Mh A002 = c208989Mg2.A00(this.A00);
                        if (AbstractC167007dF.A1S(c176777tZ, c208989Mg2.A01(this.A00))) {
                            ((AbstractC176827te) A002).A00.A01(AbstractC176797tb.A0C, C9MZ.A00(rect));
                            point = new Point(rect.centerX(), rect.centerY());
                        } else {
                            point = new Point(0, 0);
                        }
                        ((AbstractC176827te) A002).A00.A01(AbstractC176797tb.A0D, 1);
                        A002.A03();
                    }
                    A00(point, this.A02, this, C05F.A00);
                    Camera camera2 = this.A01;
                    camera2.getClass();
                    camera2.autoFocus(new Camera.AutoFocusCallback() { // from class: X.APE
                        @Override // android.hardware.Camera.AutoFocusCallback
                        public final void onAutoFocus(boolean z, Camera camera3) {
                            Integer num;
                            C209049Mm c209049Mm = this;
                            Point point2 = point;
                            InterfaceC198408pp interfaceC198408pp2 = interfaceC198408pp;
                            c209049Mm.A07 = z;
                            c209049Mm.A08 = false;
                            if (c209049Mm.A0A) {
                                c209049Mm.A04 = false;
                            }
                            if (z) {
                                num = C05F.A0N;
                            } else {
                                num = C05F.A0Y;
                            }
                            C209049Mm.A00(point2, c209049Mm.A02, c209049Mm, num);
                            C209049Mm.A00(point2, interfaceC198408pp2, c209049Mm, num);
                        }
                    });
                }
            }
        }
    }

    public C209049Mm(C208989Mg c208989Mg, C175227qw c175227qw) {
        this.A06 = c175227qw;
        this.A05 = c208989Mg;
    }
}
