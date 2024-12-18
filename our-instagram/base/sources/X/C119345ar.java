package X;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.5ar, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119345ar implements InterfaceC119265ai {
    public AbstractC119385av A00;
    public C60Y A01;
    public GraphicsLayer A02;
    public InterfaceC16820sZ A03;
    public InterfaceC16620sF A04;
    public boolean A05;
    public int A06;
    public C5AO A09;
    public boolean A0C;
    public boolean A0D;
    public float[] A0E;
    public final AndroidComposeView A0F;
    public final C5BH A0H;
    public long A07 = AbstractC119215ad.A00(Integer.MAX_VALUE, Integer.MAX_VALUE);
    public final float[] A0G = C5AJ.A06();
    public InterfaceC1128957x A0A = new AnonymousClass582(1.0f, 1.0f);
    public AnonymousClass583 A0B = AnonymousClass583.Ltr;
    public final AnonymousClass580 A0I = new AnonymousClass580();
    public long A08 = C5AD.A01;
    public final InterfaceC16660sJ A0J = new C206999Ee(this, 10);

    @Override // X.InterfaceC119265ai
    public final void destroy() {
        this.A04 = null;
        this.A03 = null;
        this.A0D = true;
        if (false != this.A05) {
            this.A05 = false;
            this.A0F.A0K(this, false);
        }
        C5BH c5bh = this.A0H;
        if (c5bh != null) {
            c5bh.EEH(this.A02);
            this.A0F.A0J(this);
        }
    }

    private final void A00() {
        GraphicsLayer graphicsLayer = this.A02;
        long j = graphicsLayer.A02;
        if ((j & 9223372034707292159L) == 9205357640488583168L) {
            j = C5YB.A01(AbstractC119215ad.A01(this.A07));
        }
        float[] fArr = this.A0G;
        C5AJ.A02(fArr);
        float[] A06 = C5AJ.A06();
        float A01 = C119365at.A01(j);
        float A02 = C119365at.A02(j);
        C5AJ.A04(A06, -A01, -A02);
        C5AJ.A05(fArr, A06);
        float[] A062 = C5AJ.A06();
        InterfaceC119295al interfaceC119295al = graphicsLayer.A0J;
        C5AJ.A04(A062, interfaceC119295al.CAi(), interfaceC119295al.CAj());
        double Bpe = (interfaceC119295al.Bpe() * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(Bpe);
        float sin = (float) Math.sin(Bpe);
        float f = A062[1];
        float f2 = A062[2];
        float f3 = (f * cos) - (f2 * sin);
        float f4 = (f * sin) + (f2 * cos);
        float f5 = A062[5];
        float f6 = A062[6];
        float f7 = (f5 * cos) - (f6 * sin);
        float f8 = (f5 * sin) + (f6 * cos);
        float f9 = A062[9];
        float f10 = A062[10];
        float f11 = (f9 * cos) - (f10 * sin);
        float f12 = (f9 * sin) + (f10 * cos);
        float f13 = A062[13];
        float f14 = A062[14];
        float f15 = (f13 * cos) - (f14 * sin);
        float f16 = (f13 * sin) + (f14 * cos);
        A062[1] = f3;
        A062[2] = f4;
        A062[5] = f7;
        A062[6] = f8;
        A062[9] = f11;
        A062[10] = f12;
        A062[13] = f15;
        A062[14] = f16;
        double Bpf = (interfaceC119295al.Bpf() * 3.141592653589793d) / 180.0d;
        float cos2 = (float) Math.cos(Bpf);
        float sin2 = (float) Math.sin(Bpf);
        float f17 = A062[0];
        float f18 = A062[2];
        float f19 = (f17 * cos2) + (f18 * sin2);
        float f20 = ((-f17) * sin2) + (f18 * cos2);
        float f21 = A062[4];
        float f22 = A062[6];
        float f23 = (f21 * cos2) + (f22 * sin2);
        float f24 = ((-f21) * sin2) + (f22 * cos2);
        float f25 = A062[8];
        float f26 = A062[10];
        float f27 = (f25 * cos2) + (f26 * sin2);
        float f28 = ((-f25) * sin2) + (f26 * cos2);
        float f29 = A062[12];
        A062[0] = f19;
        A062[2] = f20;
        A062[4] = f23;
        A062[6] = f24;
        A062[8] = f27;
        A062[10] = f28;
        A062[12] = (f29 * cos2) + (f16 * sin2);
        A062[14] = ((-f29) * sin2) + (f16 * cos2);
        double Bpg = (interfaceC119295al.Bpg() * 3.141592653589793d) / 180.0d;
        float cos3 = (float) Math.cos(Bpg);
        float sin3 = (float) Math.sin(Bpg);
        float f30 = A062[0];
        float f31 = A062[4];
        float f32 = (cos3 * f30) + (sin3 * f31);
        float f33 = -sin3;
        float f34 = (f30 * f33) + (f31 * cos3);
        float f35 = A062[1];
        float f36 = A062[5];
        float f37 = (cos3 * f35) + (sin3 * f36);
        float f38 = (f35 * f33) + (f36 * cos3);
        float f39 = A062[2];
        float f40 = A062[6];
        float f41 = (cos3 * f39) + (sin3 * f40);
        float f42 = (f39 * f33) + (f40 * cos3);
        float f43 = A062[3];
        float f44 = A062[7];
        A062[0] = f32;
        A062[1] = f37;
        A062[2] = f41;
        A062[3] = (cos3 * f43) + (sin3 * f44);
        A062[4] = f34;
        A062[5] = f38;
        A062[6] = f42;
        A062[7] = (f33 * f43) + (cos3 * f44);
        C5AJ.A03(A062, interfaceC119295al.BqS(), interfaceC119295al.BqT());
        C5AJ.A05(fArr, A062);
        float[] A063 = C5AJ.A06();
        C5AJ.A04(A063, A01, A02);
        C5AJ.A05(fArr, A063);
    }

    @Override // X.InterfaceC119265ai
    public final void Cmr(C119515b8 c119515b8, boolean z) {
        float[] fArr;
        if (z) {
            fArr = A01();
            if (fArr == null) {
                c119515b8.A01 = 0.0f;
                c119515b8.A03 = 0.0f;
                c119515b8.A02 = 0.0f;
                c119515b8.A00 = 0.0f;
                return;
            }
        } else {
            A00();
            fArr = this.A0G;
        }
        C5AJ.A01(c119515b8, fArr);
    }

    @Override // X.InterfaceC119265ai
    public final long Cms(long j, boolean z) {
        float[] fArr;
        if (z) {
            fArr = A01();
            if (fArr == null) {
                return 9187343241974906880L;
            }
        } else {
            A00();
            fArr = this.A0G;
        }
        return C5AJ.A00(fArr, j);
    }

    @Override // X.InterfaceC119265ai
    public final void Cpt(long j) {
        GraphicsLayer graphicsLayer = this.A02;
        if (graphicsLayer.A06 != j) {
            graphicsLayer.A06 = j;
            graphicsLayer.A0J.Eb9((int) (j >> 32), (int) (j & 4294967295L), graphicsLayer.A05);
        }
        View view = this.A0F;
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(view, view);
        }
    }

    @Override // X.InterfaceC119265ai
    public final void EK5(long j) {
        if (j != this.A07) {
            this.A07 = j;
            invalidate();
        }
    }

    @Override // X.InterfaceC119265ai
    public final void EKy(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF) {
        C5BH c5bh = this.A0H;
        if (c5bh != null) {
            if (this.A02.A0E) {
                this.A02 = c5bh.AMJ();
                this.A0D = false;
                this.A04 = interfaceC16620sF;
                this.A03 = interfaceC16820sZ;
                this.A08 = C5AD.A01;
                this.A0C = false;
                this.A07 = AbstractC119215ad.A00(Integer.MAX_VALUE, Integer.MAX_VALUE);
                this.A00 = null;
                this.A06 = 0;
                return;
            }
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
    }

    @Override // X.InterfaceC119265ai
    public final void FAl() {
        if (this.A05) {
            long j = this.A08;
            if (j != C5AD.A01) {
                GraphicsLayer graphicsLayer = this.A02;
                if (graphicsLayer.A05 != this.A07) {
                    long A00 = AbstractC119395aw.A00(Float.intBitsToFloat((int) (j >> 32)) * ((int) (r2 >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) * C119055aN.A00(r2));
                    if (graphicsLayer.A02 != A00) {
                        graphicsLayer.A02 = A00;
                        graphicsLayer.A0J.Eap(A00);
                    }
                }
            }
            GraphicsLayer graphicsLayer2 = this.A02;
            InterfaceC1128957x interfaceC1128957x = this.A0A;
            AnonymousClass583 anonymousClass583 = this.A0B;
            long j2 = this.A07;
            InterfaceC16660sJ interfaceC16660sJ = this.A0J;
            if (graphicsLayer2.A05 != j2) {
                graphicsLayer2.A05 = j2;
                long j3 = graphicsLayer2.A06;
                graphicsLayer2.A0J.Eb9((int) (j3 >> 32), (int) (j3 & 4294967295L), j2);
                if (graphicsLayer2.A03 == 9205357640488583168L) {
                    graphicsLayer2.A0F = true;
                    GraphicsLayer.A00(graphicsLayer2);
                }
            }
            graphicsLayer2.A0B = interfaceC1128957x;
            graphicsLayer2.A0C = anonymousClass583;
            graphicsLayer2.A0D = interfaceC16660sJ;
            GraphicsLayer.A02(graphicsLayer2);
            if (false != this.A05) {
                this.A05 = false;
                this.A0F.A0K(this, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01f4  */
    @Override // X.InterfaceC119265ai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FBI(X.C1132059i r13) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119345ar.FBI(X.59i):void");
    }

    @Override // X.InterfaceC119265ai
    public final void invalidate() {
        if (!this.A05 && !this.A0D) {
            AndroidComposeView androidComposeView = this.A0F;
            androidComposeView.invalidate();
            if (true != this.A05) {
                this.A05 = true;
                androidComposeView.A0K(this, true);
            }
        }
    }

    public C119345ar(C5BH c5bh, GraphicsLayer graphicsLayer, AndroidComposeView androidComposeView, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF) {
        this.A02 = graphicsLayer;
        this.A0H = c5bh;
        this.A0F = androidComposeView;
        this.A04 = interfaceC16620sF;
        this.A03 = interfaceC16820sZ;
    }

    private final float[] A01() {
        A00();
        float[] fArr = this.A0G;
        float[] fArr2 = this.A0E;
        if (fArr2 == null) {
            fArr2 = C5AJ.A06();
            this.A0E = fArr2;
        }
        if (!AbstractC130985vm.A00(fArr, fArr2)) {
            return null;
        }
        return fArr2;
    }

    @Override // X.InterfaceC119265ai
    public final void AQq(AnonymousClass585 anonymousClass585, GraphicsLayer graphicsLayer) {
        C60Y c60y;
        Canvas A00 = AnonymousClass597.A00(anonymousClass585);
        if (A00.isHardwareAccelerated()) {
            FAl();
            GraphicsLayer graphicsLayer2 = this.A02;
            boolean z = false;
            if (graphicsLayer2.A0J.Bu4() > 0.0f) {
                z = true;
            }
            this.A0C = z;
            AnonymousClass580 anonymousClass580 = this.A0I;
            AnonymousClass588 anonymousClass588 = anonymousClass580.A03;
            anonymousClass588.ERA(anonymousClass585);
            ((AnonymousClass587) anonymousClass588).A00 = graphicsLayer;
            AbstractC119435b0.A00(anonymousClass580, graphicsLayer2);
            return;
        }
        GraphicsLayer graphicsLayer3 = this.A02;
        long j = graphicsLayer3.A06;
        float f = (int) (j >> 32);
        float f2 = (int) (j & 4294967295L);
        long j2 = this.A07;
        float f3 = f + ((int) (j2 >> 32));
        float A002 = f2 + C119055aN.A00(j2);
        if (graphicsLayer3.A0J.AbP() < 1.0f) {
            C5AO c5ao = this.A09;
            if (c5ao == null) {
                c5ao = new C5AN();
                this.A09 = c5ao;
            }
            c5ao.EPa(this.A02.A0J.AbP());
            A00.saveLayer(f, f2, f3, A002, ((C5AN) c5ao).A01);
        } else {
            anonymousClass585.ELZ();
        }
        anonymousClass585.F8X(f, f2);
        A00();
        anonymousClass585.AJ3(this.A0G);
        if (this.A02.A0J.Ao4() && this.A02.A0J.Ao4()) {
            AbstractC119385av A04 = this.A02.A04();
            if (A04 instanceof C119375au) {
                anonymousClass585.AI8(((C119375au) A04).A00, 1);
            } else {
                if (A04 instanceof C6Ln) {
                    c60y = this.A01;
                    if (c60y == null) {
                        c60y = C60W.A00();
                        this.A01 = c60y;
                    }
                    ((C60X) c60y).A03.reset();
                    c60y.AAG(((C6Ln) A04).A00, C05F.A00);
                } else if (A04 instanceof C119405ax) {
                    c60y = ((C119405ax) A04).A00;
                }
                anonymousClass585.AI6(c60y, 1);
            }
        }
        InterfaceC16620sF interfaceC16620sF = this.A04;
        if (interfaceC16620sF != null) {
            interfaceC16620sF.invoke(anonymousClass585, null);
        }
        anonymousClass585.EKS();
    }

    @Override // X.InterfaceC119265ai
    public final void COz(float[] fArr) {
        float[] A01 = A01();
        if (A01 != null) {
            C5AJ.A05(fArr, A01);
        }
    }

    @Override // X.InterfaceC119265ai
    public final boolean CWG(long j) {
        float A01 = C119365at.A01(j);
        float A02 = C119365at.A02(j);
        if (this.A02.A0J.Ao4()) {
            return AbstractC25294BHn.A01(this.A02.A04(), A01, A02);
        }
        return true;
    }

    @Override // X.InterfaceC119265ai
    public final void F8K(float[] fArr) {
        A00();
        C5AJ.A05(fArr, this.A0G);
    }
}
