package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes12.dex */
public final class XN6 implements InterfaceC31078DlL {
    public static boolean A08 = true;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC27458CAa A04;
    public boolean A05;
    public final RenderNode A06;
    public final AndroidComposeView A07;

    @Override // X.InterfaceC31078DlL
    public final void ERu(int i) {
        int i2;
        RenderNode renderNode;
        if (AbstractC167007dF.A1P(i, 1)) {
            renderNode = this.A06;
            i2 = 2;
        } else {
            boolean A1P = AbstractC167007dF.A1P(i, 2);
            i2 = 0;
            renderNode = this.A06;
            if (A1P) {
                renderNode.setLayerType(0);
                renderNode.setHasOverlappingRendering(false);
                return;
            }
        }
        renderNode.setLayerType(i2);
        renderNode.setHasOverlappingRendering(true);
    }

    @Override // X.InterfaceC31078DlL
    public final boolean EVa(boolean z) {
        return this.A06.setHasOverlappingRendering(true);
    }

    @Override // X.InterfaceC31078DlL
    public final void APb() {
        AbstractC72511XfQ.A00(this.A06);
    }

    @Override // X.InterfaceC31078DlL
    public final void AQp(Canvas canvas) {
        C14360o3.A0C(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.A06);
    }

    @Override // X.InterfaceC31078DlL
    public final float AbP() {
        return this.A06.getAlpha();
    }

    @Override // X.InterfaceC31078DlL
    public final boolean Ao9() {
        return this.A06.getClipToOutline();
    }

    @Override // X.InterfaceC31078DlL
    public final float B11() {
        return this.A06.getElevation();
    }

    @Override // X.InterfaceC31078DlL
    public final boolean BBU() {
        return this.A06.isValid();
    }

    @Override // X.InterfaceC31078DlL
    public final void BPl(Matrix matrix) {
        this.A06.getMatrix(matrix);
    }

    @Override // X.InterfaceC31078DlL
    public final void Cu4(int i) {
        this.A01 += i;
        this.A02 += i;
        this.A06.offsetLeftAndRight(i);
    }

    @Override // X.InterfaceC31078DlL
    public final void Cu7(int i) {
        this.A03 += i;
        this.A00 += i;
        this.A06.offsetTopAndBottom(i);
    }

    @Override // X.InterfaceC31078DlL
    public final void ECM(AnonymousClass595 anonymousClass595, C60Y c60y, InterfaceC16660sJ interfaceC16660sJ) {
        RenderNode renderNode = this.A06;
        Canvas start = renderNode.start(this.A02 - this.A01, this.A00 - this.A03);
        AnonymousClass596 anonymousClass596 = anonymousClass595.A00;
        Canvas canvas = anonymousClass596.A00;
        anonymousClass596.A00 = start;
        if (c60y != null) {
            anonymousClass596.ELZ();
            anonymousClass596.AI6(c60y, 1);
        }
        interfaceC16660sJ.invoke(anonymousClass596);
        if (c60y != null) {
            anonymousClass596.EKS();
        }
        anonymousClass596.A00 = canvas;
        renderNode.end(start);
    }

    @Override // X.InterfaceC31078DlL
    public final void EPa(float f) {
        this.A06.setAlpha(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void EPe(int i) {
        Y4I.A02(this.A06, i);
    }

    @Override // X.InterfaceC31078DlL
    public final void EQp(float f) {
        this.A06.setCameraDistance(-f);
    }

    @Override // X.InterfaceC31078DlL
    public final void ERV(boolean z) {
        this.A05 = z;
        this.A06.setClipToBounds(z);
    }

    @Override // X.InterfaceC31078DlL
    public final void ERW(boolean z) {
        this.A06.setClipToOutline(z);
    }

    @Override // X.InterfaceC31078DlL
    public final void ETm(float f) {
        this.A06.setElevation(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void EaL(Outline outline) {
        this.A06.setOutline(outline);
    }

    @Override // X.InterfaceC31078DlL
    public final void Eaq(float f) {
        this.A06.setPivotX(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void Ear(float f) {
        this.A06.setPivotY(f);
    }

    @Override // X.InterfaceC31078DlL
    public final boolean Eb8(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        return this.A06.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // X.InterfaceC31078DlL
    public final void Ecv(float f) {
        this.A06.setRotationX(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void Ecw(float f) {
        this.A06.setRotationY(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void Ecx(float f) {
        this.A06.setRotation(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void Ed7(float f) {
        this.A06.setScaleX(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void Ed8(float f) {
        this.A06.setScaleY(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void Eef(int i) {
        Y4I.A03(this.A06, i);
    }

    @Override // X.InterfaceC31078DlL
    public final void EgF(float f) {
        this.A06.setTranslationX(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void EgG(float f) {
        this.A06.setTranslationY(f);
    }

    @Override // X.InterfaceC31078DlL
    public final int getHeight() {
        return this.A00 - this.A03;
    }

    @Override // X.InterfaceC31078DlL
    public final int getWidth() {
        return this.A02 - this.A01;
    }

    public XN6(AndroidComposeView androidComposeView) {
        this.A07 = androidComposeView;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.A06 = create;
        if (A08) {
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
            Y4I.A02(create, Y4I.A00(create));
            Y4I.A03(create, Y4I.A01(create));
            AbstractC72511XfQ.A00(this.A06);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
            A08 = false;
        }
    }

    @Override // X.InterfaceC31078DlL
    public final int AhQ() {
        return this.A00;
    }

    @Override // X.InterfaceC31078DlL
    public final boolean Ao8() {
        return this.A05;
    }

    @Override // X.InterfaceC31078DlL
    public final int C9P() {
        return this.A03;
    }

    @Override // X.InterfaceC31078DlL
    public final int getLeft() {
        return this.A01;
    }

    @Override // X.InterfaceC31078DlL
    public final int getRight() {
        return this.A02;
    }

    @Override // X.InterfaceC31078DlL
    public final void EcY(AbstractC27458CAa abstractC27458CAa) {
        this.A04 = abstractC27458CAa;
    }
}
