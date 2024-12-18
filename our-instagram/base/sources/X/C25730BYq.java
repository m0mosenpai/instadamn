package X;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* renamed from: X.BYq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25730BYq extends View.DragShadowBuilder {
    public final long A00;
    public final InterfaceC1128957x A01;
    public final InterfaceC16660sJ A02;

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        AnonymousClass580 anonymousClass580 = new AnonymousClass580();
        InterfaceC1128957x interfaceC1128957x = this.A01;
        long j = this.A00;
        AnonymousClass583 anonymousClass583 = AnonymousClass583.Ltr;
        Canvas canvas2 = AnonymousClass597.A00;
        AnonymousClass596 anonymousClass596 = new AnonymousClass596();
        anonymousClass596.A00 = canvas;
        InterfaceC16660sJ interfaceC16660sJ = this.A02;
        AnonymousClass586 anonymousClass586 = anonymousClass580.A02;
        InterfaceC1128957x interfaceC1128957x2 = anonymousClass586.A02;
        AnonymousClass583 anonymousClass5832 = anonymousClass586.A03;
        AnonymousClass585 anonymousClass585 = anonymousClass586.A01;
        long j2 = anonymousClass586.A00;
        anonymousClass586.A02 = interfaceC1128957x;
        anonymousClass586.A03 = anonymousClass583;
        anonymousClass586.A01 = anonymousClass596;
        anonymousClass586.A00 = j;
        anonymousClass596.ELZ();
        interfaceC16660sJ.invoke(anonymousClass580);
        anonymousClass596.EKS();
        anonymousClass586.A02 = interfaceC1128957x2;
        anonymousClass586.A03 = anonymousClass5832;
        anonymousClass586.A01 = anonymousClass585;
        anonymousClass586.A00 = j2;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        InterfaceC1128957x interfaceC1128957x = this.A01;
        long j = this.A00;
        point.set(interfaceC1128957x.EL8(interfaceC1128957x.EqH(C5YC.A02(j))), interfaceC1128957x.EL8(interfaceC1128957x.EqH(C5YC.A00(j))));
        point2.set(point.x / 2, point.y / 2);
    }

    public C25730BYq(InterfaceC1128957x interfaceC1128957x, InterfaceC16660sJ interfaceC16660sJ, long j) {
        this.A01 = interfaceC1128957x;
        this.A00 = j;
        this.A02 = interfaceC16660sJ;
    }
}
