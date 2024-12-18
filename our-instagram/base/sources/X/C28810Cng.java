package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.Cng, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28810Cng implements InterfaceC119295al {
    public static final Canvas A0O = new BYA();
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public boolean A07;
    public boolean A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public int A0F;
    public int A0G;
    public AbstractC27458CAa A0H;
    public boolean A0I;
    public final Resources A0J;
    public final Rect A0K;
    public final AnonymousClass595 A0L;
    public final C25733BYt A0M;
    public final C25736BYx A0N;

    @Override // X.InterfaceC119295al
    public final int AgG() {
        return 3;
    }

    @Override // X.InterfaceC119295al
    public final C5YV ApL() {
        return null;
    }

    @Override // X.InterfaceC119295al
    public final /* synthetic */ boolean BBU() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r4.A08 != false) goto L6;
     */
    @Override // X.InterfaceC119295al
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ERU(boolean r5) {
        /*
            r4 = this;
            r3 = 0
            r2 = 1
            if (r5 == 0) goto L9
            boolean r1 = r4.A08
            r0 = 1
            if (r1 == 0) goto La
        L9:
            r0 = 0
        La:
            r4.A0I = r0
            r4.A07 = r2
            X.BYt r1 = r4.A0M
            if (r5 == 0) goto L17
            boolean r0 = r4.A08
            if (r0 == 0) goto L17
            r3 = 1
        L17:
            r1.setClipToOutline(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28810Cng.ERU(boolean):void");
    }

    public /* synthetic */ C28810Cng(C25736BYx c25736BYx) {
        AnonymousClass595 anonymousClass595 = new AnonymousClass595();
        AnonymousClass580 anonymousClass580 = new AnonymousClass580();
        this.A0N = c25736BYx;
        this.A0L = anonymousClass595;
        C25733BYt c25733BYt = new C25733BYt(c25736BYx, anonymousClass595, anonymousClass580);
        this.A0M = c25733BYt;
        this.A0J = c25736BYx.getResources();
        this.A0K = new Rect();
        c25736BYx.addView(c25733BYt);
        c25733BYt.setClipBounds(null);
        this.A05 = 0L;
        View.generateViewId();
        this.A03 = 0;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A02 = 1.0f;
        long j = C1132359l.A01;
        this.A04 = j;
        this.A06 = j;
    }

    @Override // X.InterfaceC119295al
    public final Matrix AFC() {
        return this.A0M.getMatrix();
    }

    @Override // X.InterfaceC119295al
    public final void APb() {
        this.A0N.removeViewInLayout(this.A0M);
    }

    @Override // X.InterfaceC119295al
    public final void AQU(AnonymousClass585 anonymousClass585) {
        Rect rect;
        if (this.A07) {
            C25733BYt c25733BYt = this.A0M;
            if (Ao4() && !this.A08) {
                rect = this.A0K;
                rect.left = 0;
                rect.top = 0;
                rect.right = c25733BYt.getWidth();
                rect.bottom = c25733BYt.getHeight();
            } else {
                rect = null;
            }
            c25733BYt.setClipBounds(rect);
        }
        if (AnonymousClass597.A00(anonymousClass585).isHardwareAccelerated()) {
            C25736BYx c25736BYx = this.A0N;
            C25733BYt c25733BYt2 = this.A0M;
            c25736BYx.A00(c25733BYt2, anonymousClass585, c25733BYt2.getDrawingTime());
        }
    }

    @Override // X.InterfaceC119295al
    public final float Ajz() {
        return this.A0M.getCameraDistance() / this.A0J.getDisplayMetrics().densityDpi;
    }

    @Override // X.InterfaceC119295al
    public final boolean Ao4() {
        if (!this.A0I && !this.A0M.getClipToOutline()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC119295al
    public final void ECN(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, GraphicsLayer graphicsLayer, InterfaceC16660sJ interfaceC16660sJ) {
        C25733BYt c25733BYt = this.A0M;
        if (c25733BYt.getParent() == null) {
            this.A0N.addView(c25733BYt);
        }
        c25733BYt.setDrawParams(interfaceC1128957x, anonymousClass583, graphicsLayer, interfaceC16660sJ);
        if (c25733BYt.isAttachedToWindow()) {
            c25733BYt.setVisibility(4);
            c25733BYt.setVisibility(0);
            try {
                AnonymousClass595 anonymousClass595 = this.A0L;
                Canvas canvas = A0O;
                AnonymousClass596 anonymousClass596 = anonymousClass595.A00;
                Canvas canvas2 = anonymousClass596.A00;
                anonymousClass596.A00 = canvas;
                this.A0N.A00(c25733BYt, anonymousClass596, c25733BYt.getDrawingTime());
                anonymousClass596.A00 = canvas2;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.InterfaceC119295al
    public final void EPa(float f) {
        this.A00 = f;
        this.A0M.setAlpha(f);
    }

    @Override // X.InterfaceC119295al
    public final void EPf(long j) {
        this.A04 = j;
        this.A0M.setOutlineAmbientShadowColor(C5AC.A00(j));
    }

    @Override // X.InterfaceC119295al
    public final void EQp(float f) {
        this.A0M.setCameraDistance(f * this.A0J.getDisplayMetrics().densityDpi);
    }

    @Override // X.InterfaceC119295al
    public final void ERt(int i) {
        this.A03 = i;
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        C25733BYt c25733BYt = this.A0M;
        boolean z = true;
        if (AbstractC167007dF.A1P(i2, 1)) {
            c25733BYt.setLayerType(2, null);
        } else if (AbstractC167007dF.A1P(i2, 2)) {
            c25733BYt.setLayerType(0, null);
            z = false;
        } else {
            c25733BYt.setLayerType(0, null);
        }
        c25733BYt.setCanUseCompositingLayer$ui_graphics_release(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r5 != null) goto L8;
     */
    @Override // X.InterfaceC119295al
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EaL(android.graphics.Outline r5) {
        /*
            r4 = this;
            X.BYt r3 = r4.A0M
            r3.A00 = r5
            r3.invalidateOutline()
            r2 = 1
            boolean r0 = r4.Ao4()
            r1 = 0
            if (r0 == 0) goto L1f
            if (r5 == 0) goto L22
            r3.setClipToOutline(r2)
            boolean r0 = r4.A0I
            if (r0 == 0) goto L1c
            r4.A0I = r1
            r4.A07 = r2
        L1c:
            r4.A08 = r2
            return
        L1f:
            if (r5 == 0) goto L22
            goto L1c
        L22:
            r2 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28810Cng.EaL(android.graphics.Outline):void");
    }

    @Override // X.InterfaceC119295al
    public final void Eb9(int i, int i2, long j) {
        if (this.A05 == j) {
            int i3 = this.A0F;
            if (i3 != i) {
                this.A0M.offsetLeftAndRight(i - i3);
            }
            int i4 = this.A0G;
            if (i4 != i2) {
                this.A0M.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (Ao4()) {
                this.A07 = true;
            }
            this.A0M.layout(i, i2, AbstractC25225BEi.A06(j) + i, C119055aN.A00(j) + i2);
            this.A05 = j;
        }
        this.A0F = i;
        this.A0G = i2;
    }

    @Override // X.InterfaceC119295al
    public final void EcY(AbstractC27458CAa abstractC27458CAa) {
        this.A0H = abstractC27458CAa;
        if (Build.VERSION.SDK_INT >= 31) {
            CBI.A00(this.A0M, abstractC27458CAa);
        }
    }

    @Override // X.InterfaceC119295al
    public final void Ecv(float f) {
        this.A09 = f;
        this.A0M.setRotationX(f);
    }

    @Override // X.InterfaceC119295al
    public final void Ecw(float f) {
        this.A0A = f;
        this.A0M.setRotationY(f);
    }

    @Override // X.InterfaceC119295al
    public final void Ecx(float f) {
        this.A0B = f;
        this.A0M.setRotation(f);
    }

    @Override // X.InterfaceC119295al
    public final void Ed7(float f) {
        this.A01 = f;
        this.A0M.setScaleX(f);
    }

    @Override // X.InterfaceC119295al
    public final void Ed8(float f) {
        this.A02 = f;
        this.A0M.setScaleY(f);
    }

    @Override // X.InterfaceC119295al
    public final void Edo(float f) {
        this.A0C = f;
        this.A0M.setElevation(f);
    }

    @Override // X.InterfaceC119295al
    public final void Eeg(long j) {
        this.A06 = j;
        this.A0M.setOutlineSpotShadowColor(C5AC.A00(j));
    }

    @Override // X.InterfaceC119295al
    public final void EgF(float f) {
        this.A0D = f;
        this.A0M.setTranslationX(f);
    }

    @Override // X.InterfaceC119295al
    public final void EgG(float f) {
        this.A0E = f;
        this.A0M.setTranslationY(f);
    }

    @Override // X.InterfaceC119295al
    public final float AbP() {
        return this.A00;
    }

    @Override // X.InterfaceC119295al
    public final long AbW() {
        return this.A04;
    }

    @Override // X.InterfaceC119295al
    public final int Aq5() {
        return this.A03;
    }

    @Override // X.InterfaceC119295al
    public final AbstractC27458CAa Bmc() {
        return this.A0H;
    }

    @Override // X.InterfaceC119295al
    public final float Bpe() {
        return this.A09;
    }

    @Override // X.InterfaceC119295al
    public final float Bpf() {
        return this.A0A;
    }

    @Override // X.InterfaceC119295al
    public final float Bpg() {
        return this.A0B;
    }

    @Override // X.InterfaceC119295al
    public final float BqS() {
        return this.A01;
    }

    @Override // X.InterfaceC119295al
    public final float BqT() {
        return this.A02;
    }

    @Override // X.InterfaceC119295al
    public final float Bu4() {
        return this.A0C;
    }

    @Override // X.InterfaceC119295al
    public final long BzN() {
        return this.A06;
    }

    @Override // X.InterfaceC119295al
    public final float CAi() {
        return this.A0D;
    }

    @Override // X.InterfaceC119295al
    public final float CAj() {
        return this.A0E;
    }

    @Override // X.InterfaceC119295al
    public final void Eap(long j) {
        if ((j & 9223372034707292159L) == 9205357640488583168L) {
            this.A0M.resetPivot();
            return;
        }
        C25733BYt c25733BYt = this.A0M;
        c25733BYt.setPivotX(C119365at.A01(j));
        c25733BYt.setPivotY(C119365at.A02(j));
    }
}
