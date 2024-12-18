package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.CoE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28844CoE implements InterfaceC31078DlL {
    public AbstractC27458CAa A00;
    public final RenderNode A01 = new RenderNode("Compose");
    public final AndroidComposeView A02;

    @Override // X.InterfaceC31078DlL
    public final boolean EVa(boolean z) {
        return this.A01.setHasOverlappingRendering(true);
    }

    @Override // X.InterfaceC31078DlL
    public final void APb() {
        this.A01.discardDisplayList();
    }

    @Override // X.InterfaceC31078DlL
    public final void AQp(Canvas canvas) {
        canvas.drawRenderNode(this.A01);
    }

    @Override // X.InterfaceC31078DlL
    public final float AbP() {
        return this.A01.getAlpha();
    }

    @Override // X.InterfaceC31078DlL
    public final int AhQ() {
        return this.A01.getBottom();
    }

    @Override // X.InterfaceC31078DlL
    public final boolean Ao8() {
        return this.A01.getClipToBounds();
    }

    @Override // X.InterfaceC31078DlL
    public final boolean Ao9() {
        return this.A01.getClipToOutline();
    }

    @Override // X.InterfaceC31078DlL
    public final float B11() {
        return this.A01.getElevation();
    }

    @Override // X.InterfaceC31078DlL
    public final boolean BBU() {
        return this.A01.hasDisplayList();
    }

    @Override // X.InterfaceC31078DlL
    public final void BPl(Matrix matrix) {
        this.A01.getMatrix(matrix);
    }

    @Override // X.InterfaceC31078DlL
    public final int C9P() {
        return this.A01.getTop();
    }

    @Override // X.InterfaceC31078DlL
    public final void Cu4(int i) {
        this.A01.offsetLeftAndRight(i);
    }

    @Override // X.InterfaceC31078DlL
    public final void Cu7(int i) {
        this.A01.offsetTopAndBottom(i);
    }

    @Override // X.InterfaceC31078DlL
    public final void ECM(AnonymousClass595 anonymousClass595, C60Y c60y, InterfaceC16660sJ interfaceC16660sJ) {
        RenderNode renderNode = this.A01;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        AnonymousClass596 anonymousClass596 = anonymousClass595.A00;
        Canvas canvas = anonymousClass596.A00;
        anonymousClass596.A00 = beginRecording;
        if (c60y != null) {
            anonymousClass596.ELZ();
            anonymousClass596.AI6(c60y, 1);
        }
        interfaceC16660sJ.invoke(anonymousClass596);
        if (c60y != null) {
            anonymousClass596.EKS();
        }
        anonymousClass596.A00 = canvas;
        renderNode.endRecording();
    }

    @Override // X.InterfaceC31078DlL
    public final void EPa(float f) {
        this.A01.setAlpha(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void EPe(int i) {
        this.A01.setAmbientShadowColor(i);
    }

    @Override // X.InterfaceC31078DlL
    public final void EQp(float f) {
        this.A01.setCameraDistance(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void ERV(boolean z) {
        this.A01.setClipToBounds(z);
    }

    @Override // X.InterfaceC31078DlL
    public final void ERW(boolean z) {
        this.A01.setClipToOutline(z);
    }

    @Override // X.InterfaceC31078DlL
    public final void ERu(int i) {
        RenderNode renderNode = this.A01;
        if (AbstractC167007dF.A1P(i, 1)) {
            renderNode.setUseCompositingLayer(true, null);
        } else {
            if (AbstractC167007dF.A1P(i, 2)) {
                renderNode.setUseCompositingLayer(false, null);
                renderNode.setHasOverlappingRendering(false);
                return;
            }
            renderNode.setUseCompositingLayer(false, null);
        }
        renderNode.setHasOverlappingRendering(true);
    }

    @Override // X.InterfaceC31078DlL
    public final void ETm(float f) {
        this.A01.setElevation(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void EaL(Outline outline) {
        this.A01.setOutline(outline);
    }

    @Override // X.InterfaceC31078DlL
    public final void Eaq(float f) {
        this.A01.setPivotX(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void Ear(float f) {
        this.A01.setPivotY(f);
    }

    @Override // X.InterfaceC31078DlL
    public final boolean Eb8(int i, int i2, int i3, int i4) {
        return this.A01.setPosition(i, i2, i3, i4);
    }

    @Override // X.InterfaceC31078DlL
    public final void EcY(AbstractC27458CAa abstractC27458CAa) {
        this.A00 = abstractC27458CAa;
        if (Build.VERSION.SDK_INT >= 31) {
            CBS.A00(this.A01, abstractC27458CAa);
        }
    }

    @Override // X.InterfaceC31078DlL
    public final void Ecv(float f) {
        this.A01.setRotationX(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void Ecw(float f) {
        this.A01.setRotationY(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void Ecx(float f) {
        this.A01.setRotationZ(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void Ed7(float f) {
        this.A01.setScaleX(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void Ed8(float f) {
        this.A01.setScaleY(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void Eef(int i) {
        this.A01.setSpotShadowColor(i);
    }

    @Override // X.InterfaceC31078DlL
    public final void EgF(float f) {
        this.A01.setTranslationX(f);
    }

    @Override // X.InterfaceC31078DlL
    public final void EgG(float f) {
        this.A01.setTranslationY(f);
    }

    @Override // X.InterfaceC31078DlL
    public final int getHeight() {
        return this.A01.getHeight();
    }

    @Override // X.InterfaceC31078DlL
    public final int getLeft() {
        return this.A01.getLeft();
    }

    @Override // X.InterfaceC31078DlL
    public final int getRight() {
        return this.A01.getRight();
    }

    @Override // X.InterfaceC31078DlL
    public final int getWidth() {
        return this.A01.getWidth();
    }

    public C28844CoE(AndroidComposeView androidComposeView) {
        this.A02 = androidComposeView;
    }
}
