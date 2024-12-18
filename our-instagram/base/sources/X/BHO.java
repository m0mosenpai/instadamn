package X;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class BHO extends C5X7 implements InterfaceC118875a4 {
    public final C137926Mr A00;
    public final AndroidEdgeEffectOverscrollEffect A01;
    public final C137946Mu A02;

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ boolean ABA(InterfaceC16660sJ interfaceC16660sJ) {
        return C5X5.A00(this, interfaceC16660sJ);
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier Eq3(Modifier modifier) {
        return C58m.A00(this, modifier);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (r1 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        if (r1 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0119, code lost:
    
        if (A00(r4, r8, 180.0f, X.AbstractC119395aw.A00(-X.C5YC.A02(r6), (-X.C5YC.A00(r6)) + r3)) == false) goto L53;
     */
    @Override // X.InterfaceC118875a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQV(X.InterfaceC1129057z r10) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BHO.AQV(X.57z):void");
    }

    public BHO(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C137946Mu c137946Mu, C137926Mr c137926Mr, InterfaceC16660sJ interfaceC16660sJ) {
        super(interfaceC16660sJ);
        this.A01 = androidEdgeEffectOverscrollEffect;
        this.A02 = c137946Mu;
        this.A00 = c137926Mr;
    }

    public static final boolean A00(Canvas canvas, EdgeEffect edgeEffect, float f, long j) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(C119365at.A01(j), C119365at.A02(j));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Object AWJ(Object obj, InterfaceC16620sF interfaceC16620sF) {
        return interfaceC16620sF.invoke(obj, this);
    }
}
