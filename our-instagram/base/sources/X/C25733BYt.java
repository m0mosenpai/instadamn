package X;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.BYt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25733BYt extends View {
    public static final ViewOutlineProvider A0A = new C25737BYy(0);
    public Outline A00;
    public GraphicsLayer A01;
    public InterfaceC1128957x A02;
    public AnonymousClass583 A03;
    public InterfaceC16660sJ A04;
    public boolean A05;
    public boolean A06;
    public final View A07;
    public final AnonymousClass595 A08;
    public final AnonymousClass580 A09;

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AnonymousClass596 anonymousClass596 = this.A08.A00;
        Canvas canvas2 = anonymousClass596.A00;
        anonymousClass596.A00 = canvas;
        AnonymousClass580 anonymousClass580 = this.A09;
        InterfaceC1128957x interfaceC1128957x = this.A02;
        AnonymousClass583 anonymousClass583 = this.A03;
        long A00 = C5YB.A00(AbstractC166987dD.A07(this), AbstractC166987dD.A08(this));
        GraphicsLayer graphicsLayer = this.A01;
        InterfaceC16660sJ interfaceC16660sJ = this.A04;
        AnonymousClass588 anonymousClass588 = anonymousClass580.A03;
        AnonymousClass587 anonymousClass587 = (AnonymousClass587) anonymousClass588;
        AnonymousClass586 anonymousClass586 = anonymousClass587.A02.A02;
        InterfaceC1128957x interfaceC1128957x2 = anonymousClass586.A02;
        AnonymousClass583 anonymousClass5832 = anonymousClass586.A03;
        AnonymousClass585 anonymousClass585 = anonymousClass586.A01;
        long j = anonymousClass586.A00;
        GraphicsLayer graphicsLayer2 = anonymousClass587.A00;
        anonymousClass588.ETE(interfaceC1128957x);
        anonymousClass588.EY4(anonymousClass583);
        anonymousClass588.ERA(anonymousClass596);
        anonymousClass588.EeS(A00);
        anonymousClass587.A00 = graphicsLayer;
        anonymousClass596.ELZ();
        try {
            interfaceC16660sJ.invoke(anonymousClass580);
            AbstractC25232BEp.A1I(anonymousClass596, anonymousClass585, anonymousClass588, interfaceC1128957x2, anonymousClass5832);
            anonymousClass588.EeS(j);
            anonymousClass587.A00 = graphicsLayer2;
            anonymousClass596.A00 = canvas2;
            this.A06 = false;
        } catch (Throwable th) {
            AbstractC25232BEp.A1I(anonymousClass596, anonymousClass585, anonymousClass588, interfaceC1128957x2, anonymousClass5832);
            anonymousClass588.EeS(j);
            anonymousClass587.A00 = graphicsLayer2;
            throw th;
        }
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            invalidate();
        }
    }

    public final void setDrawParams(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, GraphicsLayer graphicsLayer, InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = interfaceC1128957x;
        this.A03 = anonymousClass583;
        this.A04 = interfaceC16660sJ;
        this.A01 = graphicsLayer;
    }

    public C25733BYt(View view, AnonymousClass595 anonymousClass595, AnonymousClass580 anonymousClass580) {
        super(view.getContext());
        this.A07 = view;
        this.A08 = anonymousClass595;
        this.A09 = anonymousClass580;
        setOutlineProvider(A0A);
        this.A05 = true;
        this.A02 = AnonymousClass581.A00;
        this.A03 = AnonymousClass583.Ltr;
        this.A04 = C28147Cau.A00;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.A05;
    }

    public final AnonymousClass595 getCanvasHolder() {
        return this.A08;
    }

    public final View getOwnerView() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.A05;
    }

    @Override // android.view.View
    public final void invalidate() {
        int A03 = C0f9.A03(1054330291);
        if (!this.A06) {
            this.A06 = true;
            super.invalidate();
        }
        C0f9.A0A(-50921733, A03);
    }

    public final void setInvalidated(boolean z) {
        this.A06 = z;
    }
}
