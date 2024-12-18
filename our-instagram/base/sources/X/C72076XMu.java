package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.XMu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72076XMu implements InterfaceC119295al {
    public static final AtomicBoolean A0P = new AtomicBoolean(true);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public boolean A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public float A0F;
    public Matrix A0G;
    public AbstractC27458CAa A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final RenderNode A0M;
    public final AnonymousClass595 A0N;
    public final AnonymousClass580 A0O;

    public /* synthetic */ C72076XMu(View view) {
        AnonymousClass595 anonymousClass595 = new AnonymousClass595();
        AnonymousClass580 anonymousClass580 = new AnonymousClass580();
        this.A0N = anonymousClass595;
        this.A0O = anonymousClass580;
        RenderNode create = RenderNode.create("Compose", view);
        this.A0M = create;
        this.A07 = 0L;
        if (A0P.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            Y4H.A02(create, Y4H.A00(create));
            Y4H.A03(create, Y4H.A01(create));
            XN8.A00(this.A0M);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        RenderNode renderNode = this.A0M;
        renderNode.setLayerType(0);
        renderNode.setLayerPaint((Paint) null);
        renderNode.setHasOverlappingRendering(true);
        this.A05 = 0;
        this.A04 = 3;
        this.A00 = 1.0f;
        this.A02 = 1.0f;
        this.A03 = 1.0f;
        long j = C1132359l.A01;
        this.A06 = j;
        this.A08 = j;
        this.A01 = 8.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r2 == r4.A0J) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r4.A0J = r2;
        r4.A0M.setClipToOutline(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x000b, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r4.A0K != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r4.A0K == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r1 == r4.A0I) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        r4.A0I = r1;
        r4.A0M.setClipToBounds(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            r4 = this;
            boolean r3 = r4.A09
            r2 = 1
            if (r3 == 0) goto La
            boolean r0 = r4.A0K
            r1 = 1
            if (r0 == 0) goto Ld
        La:
            r1 = 0
            if (r3 == 0) goto L28
        Ld:
            boolean r0 = r4.A0K
            if (r0 == 0) goto L28
        L11:
            boolean r0 = r4.A0I
            if (r1 == r0) goto L1c
            r4.A0I = r1
            android.view.RenderNode r0 = r4.A0M
            r0.setClipToBounds(r1)
        L1c:
            boolean r0 = r4.A0J
            if (r2 == r0) goto L27
            r4.A0J = r2
            android.view.RenderNode r0 = r4.A0M
            r0.setClipToOutline(r2)
        L27:
            return
        L28:
            r2 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72076XMu.A00():void");
    }

    @Override // X.InterfaceC119295al
    public final Matrix AFC() {
        Matrix matrix = this.A0G;
        if (matrix == null) {
            matrix = new Matrix();
            this.A0G = matrix;
        }
        this.A0M.getMatrix(matrix);
        return matrix;
    }

    @Override // X.InterfaceC119295al
    public final void APb() {
        XN8.A00(this.A0M);
    }

    @Override // X.InterfaceC119295al
    public final boolean BBU() {
        return this.A0M.isValid();
    }

    @Override // X.InterfaceC119295al
    public final void ECN(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, GraphicsLayer graphicsLayer, InterfaceC16660sJ interfaceC16660sJ) {
        RenderNode renderNode = this.A0M;
        long j = this.A07;
        Canvas start = renderNode.start((int) (j >> 32), C119055aN.A00(j));
        try {
            AnonymousClass596 anonymousClass596 = this.A0N.A00;
            Canvas canvas = anonymousClass596.A00;
            anonymousClass596.A00 = start;
            AnonymousClass580 anonymousClass580 = this.A0O;
            long A01 = AbstractC119215ad.A01(this.A07);
            AnonymousClass588 anonymousClass588 = anonymousClass580.A03;
            AnonymousClass587 anonymousClass587 = (AnonymousClass587) anonymousClass588;
            AnonymousClass586 anonymousClass586 = anonymousClass587.A02.A02;
            InterfaceC1128957x interfaceC1128957x2 = anonymousClass586.A02;
            AnonymousClass583 anonymousClass5832 = anonymousClass586.A03;
            AnonymousClass585 anonymousClass585 = anonymousClass586.A01;
            long j2 = anonymousClass586.A00;
            GraphicsLayer graphicsLayer2 = anonymousClass587.A00;
            anonymousClass588.ETE(interfaceC1128957x);
            anonymousClass588.EY4(anonymousClass583);
            anonymousClass588.ERA(anonymousClass596);
            anonymousClass588.EeS(A01);
            anonymousClass587.A00 = graphicsLayer;
            anonymousClass596.ELZ();
            try {
                interfaceC16660sJ.invoke(anonymousClass580);
                anonymousClass596.EKS();
                anonymousClass588.ETE(interfaceC1128957x2);
                anonymousClass588.EY4(anonymousClass5832);
                anonymousClass588.ERA(anonymousClass585);
                anonymousClass588.EeS(j2);
                anonymousClass587.A00 = graphicsLayer2;
                anonymousClass596.A00 = canvas;
            } catch (Throwable th) {
                anonymousClass596.EKS();
                anonymousClass588.ETE(interfaceC1128957x2);
                anonymousClass588.EY4(anonymousClass5832);
                anonymousClass588.ERA(anonymousClass585);
                anonymousClass588.EeS(j2);
                anonymousClass587.A00 = graphicsLayer2;
                throw th;
            }
        } finally {
            renderNode.end(start);
        }
    }

    @Override // X.InterfaceC119295al
    public final void EPa(float f) {
        this.A00 = f;
        this.A0M.setAlpha(f);
    }

    @Override // X.InterfaceC119295al
    public final void EPf(long j) {
        this.A06 = j;
        Y4H.A02(this.A0M, C5AC.A00(j));
    }

    @Override // X.InterfaceC119295al
    public final void EQp(float f) {
        this.A01 = f;
        this.A0M.setCameraDistance(-f);
    }

    @Override // X.InterfaceC119295al
    public final void ERU(boolean z) {
        this.A09 = z;
        A00();
    }

    @Override // X.InterfaceC119295al
    public final void ERt(int i) {
        int i2;
        this.A05 = i;
        if (i == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        RenderNode renderNode = this.A0M;
        if (AbstractC167007dF.A1P(i2, 1)) {
            renderNode.setLayerType(2);
        } else {
            if (AbstractC167007dF.A1P(i2, 2)) {
                renderNode.setLayerType(0);
                renderNode.setLayerPaint((Paint) null);
                renderNode.setHasOverlappingRendering(false);
                return;
            }
            renderNode.setLayerType(0);
        }
        renderNode.setLayerPaint((Paint) null);
        renderNode.setHasOverlappingRendering(true);
    }

    @Override // X.InterfaceC119295al
    public final void EaL(Outline outline) {
        this.A0M.setOutline(outline);
        boolean z = false;
        if (outline != null) {
            z = true;
        }
        this.A0K = z;
        A00();
    }

    @Override // X.InterfaceC119295al
    public final void Eb9(int i, int i2, long j) {
        RenderNode renderNode = this.A0M;
        int i3 = (int) (j >> 32);
        int A00 = C119055aN.A00(j);
        renderNode.setLeftTopRightBottom(i, i2, i3 + i, A00 + i2);
        if (this.A07 != j) {
            if (this.A0L) {
                renderNode.setPivotX(i3 / 2.0f);
                renderNode.setPivotY(A00 / 2.0f);
            }
            this.A07 = j;
        }
    }

    @Override // X.InterfaceC119295al
    public final void Ecv(float f) {
        this.A0A = f;
        this.A0M.setRotationX(f);
    }

    @Override // X.InterfaceC119295al
    public final void Ecw(float f) {
        this.A0B = f;
        this.A0M.setRotationY(f);
    }

    @Override // X.InterfaceC119295al
    public final void Ecx(float f) {
        this.A0C = f;
        this.A0M.setRotation(f);
    }

    @Override // X.InterfaceC119295al
    public final void Ed7(float f) {
        this.A02 = f;
        this.A0M.setScaleX(f);
    }

    @Override // X.InterfaceC119295al
    public final void Ed8(float f) {
        this.A03 = f;
        this.A0M.setScaleY(f);
    }

    @Override // X.InterfaceC119295al
    public final void Edo(float f) {
        this.A0D = f;
        this.A0M.setElevation(f);
    }

    @Override // X.InterfaceC119295al
    public final void Eeg(long j) {
        this.A08 = j;
        Y4H.A03(this.A0M, C5AC.A00(j));
    }

    @Override // X.InterfaceC119295al
    public final void EgF(float f) {
        this.A0E = f;
        this.A0M.setTranslationX(f);
    }

    @Override // X.InterfaceC119295al
    public final void EgG(float f) {
        this.A0F = f;
        this.A0M.setTranslationY(f);
    }

    @Override // X.InterfaceC119295al
    public final void AQU(AnonymousClass585 anonymousClass585) {
        DisplayListCanvas A00 = AnonymousClass597.A00(anonymousClass585);
        C14360o3.A0C(A00, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        A00.drawRenderNode(this.A0M);
    }

    @Override // X.InterfaceC119295al
    public final float AbP() {
        return this.A00;
    }

    @Override // X.InterfaceC119295al
    public final long AbW() {
        return this.A06;
    }

    @Override // X.InterfaceC119295al
    public final int AgG() {
        return 3;
    }

    @Override // X.InterfaceC119295al
    public final float Ajz() {
        return this.A01;
    }

    @Override // X.InterfaceC119295al
    public final boolean Ao4() {
        return this.A09;
    }

    @Override // X.InterfaceC119295al
    public final C5YV ApL() {
        return null;
    }

    @Override // X.InterfaceC119295al
    public final int Aq5() {
        return this.A05;
    }

    @Override // X.InterfaceC119295al
    public final AbstractC27458CAa Bmc() {
        return this.A0H;
    }

    @Override // X.InterfaceC119295al
    public final float Bpe() {
        return this.A0A;
    }

    @Override // X.InterfaceC119295al
    public final float Bpf() {
        return this.A0B;
    }

    @Override // X.InterfaceC119295al
    public final float Bpg() {
        return this.A0C;
    }

    @Override // X.InterfaceC119295al
    public final float BqS() {
        return this.A02;
    }

    @Override // X.InterfaceC119295al
    public final float BqT() {
        return this.A03;
    }

    @Override // X.InterfaceC119295al
    public final float Bu4() {
        return this.A0D;
    }

    @Override // X.InterfaceC119295al
    public final long BzN() {
        return this.A08;
    }

    @Override // X.InterfaceC119295al
    public final float CAi() {
        return this.A0E;
    }

    @Override // X.InterfaceC119295al
    public final float CAj() {
        return this.A0F;
    }

    @Override // X.InterfaceC119295al
    public final void EcY(AbstractC27458CAa abstractC27458CAa) {
        this.A0H = abstractC27458CAa;
    }

    @Override // X.InterfaceC119295al
    public final void Eap(long j) {
        RenderNode renderNode;
        float A02;
        if ((j & 9223372034707292159L) == 9205357640488583168L) {
            this.A0L = true;
            renderNode = this.A0M;
            renderNode.setPivotX(((int) (this.A07 >> 32)) / 2.0f);
            A02 = C119055aN.A00(this.A07) / 2.0f;
        } else {
            this.A0L = false;
            renderNode = this.A0M;
            renderNode.setPivotX(C119365at.A01(j));
            A02 = C119365at.A02(j);
        }
        renderNode.setPivotY(A02);
    }
}
