package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Bx1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27077Bx1 extends C3PD implements InterfaceC30935Dip {
    public final /* synthetic */ MVN A00;
    public final /* synthetic */ C76223bS A01;
    public final /* synthetic */ C26582Bof A02;

    public C27077Bx1(MVN mvn, C76223bS c76223bS, C26582Bof c26582Bof) {
        this.A00 = mvn;
        this.A02 = c26582Bof;
        this.A01 = c76223bS;
    }

    @Override // X.InterfaceC30935Dip
    public final void Dty(MotionEvent motionEvent, View view) {
        MVN mvn = this.A00;
        if (((C38321qM) mvn.A06).CdW()) {
            this.A02.A04.A06(view, null, null);
        }
        if (motionEvent.getAction() == 0 && mvn.A08) {
            C26582Bof c26582Bof = this.A02;
            C26582Bof.A04(AbstractC25227BEk.A0A(this.A01), view, c26582Bof, motionEvent.getX(), motionEvent.getY(), AbstractC167007dF.A1N(motionEvent.getAction()));
        }
    }
}
